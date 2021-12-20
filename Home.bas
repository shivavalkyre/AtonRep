B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private rp As RuntimePermissions
	Private ph As Phone
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private gmap As GoogleMap
	Private gmap1 As GoogleMap
	Private gmap_extra As GoogleMapsExtras
	Private MapFragment1 As MapFragment
	Private url_aton As String ="http://marlens.disnavpriok.id:3002/api/aton/masdex/read"
	Private sf As StringFunctions
	Private CircularProgressBar1 As CircularProgressBar
	Private CircularProgressBar2 As CircularProgressBar
	Private ScrollView1 As ScrollView
	Private Label1 As Label
	Private Label2 As Label
	Private PanelKecukupan As Panel
	Private PanelKeandalan As Panel
	Private PanelMap As Panel
	Private PanelMensu As Panel
	Private ImageView2 As ImageView
	Private ImageView1 As ImageView
	Private ImageView3 As ImageView
	Private ImageView4 As ImageView
	Private ImageView5 As ImageView
	Private ImageView6 As ImageView
	Private ImageView7 As ImageView
	Private PanelMapLarge As Panel
	Private MapFragment2 As MapFragment
	

	
	Private PanelOperatorSelection As Panel
	Private PanelOverlay As Panel
	Private PanelSideBar As Panel
	Private LabelNewAtonDJPL As Label
	Private LabelNewAtonNonDJPL As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Home")
	ScrollView1.Panel.LoadLayout("LayoutHome")
	'PanelMensu.AddView(CreateMask(PanelMensu, 10dip, 0xff303030), 0, 0, PanelMensu.Width, PanelMensu.Height)
	'PanelHeaderMensu.Visible=False
	'JustifyTextView11.SetText("Menara Suar adalah Sarana Bantu Navigasi Pelayaran tetap yang bersuar dan mempunyai jarak tampak sama atau lebih 20 (dua puluh) mil laut yang dapat membantu para navigator dalam menentukan posisi dan atau haluan kapal, menunjukan arah daratan dan adanya pelabuhan serta dapat dipergunakan sebagai tanda batas wilayah negara.",True)
	'JustifyTextView11.As(Label).TextSize=12
	
	
	ph.SetScreenOrientation(0)
	CircularProgressBar1.Value =95
	CircularProgressBar2.Value = 60
	sf.Initialize
	
	
	
	

	
	Wait For MapFragment1_Ready 
	gmap = MapFragment1.GetMap

	gmap1 = MapFragment2.GetMap
	
	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		gmap.MyLocationEnabled = False
		gmap1.MyLocationEnabled=False
		gmap_position
		get_aton
	Else
		Log("No permission!")
	End If
	
	'get Data
	

End Sub

Sub Activity_Resume
	If gmap.IsInitialized And gmap1.IsInitialized Then
		gmap_position
	End If

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub gmap_position

	Dim LatLng1 As LatLng
	LatLng1.Initialize(-6.132055,106.871483)
	Dim CameraPosition1 As CameraPosition
	CameraPosition1.Initialize(LatLng1.Latitude, LatLng1.Longitude, 8)
	gmap.GetUiSettings
	gmap.MoveCamera(CameraPosition1)
	gmap.TrafficEnabled=False
	gmap.GetUiSettings.ZoomControlsEnabled=False
	gmap.GetUiSettings.CompassEnabled=False
	Private jo As JavaObject
	jo = gmap.GetUiSettings
	jo.RunMethod("setMapToolbarEnabled", Array As Object(False))
	
	gmap1.GetUiSettings
	gmap1.MoveCamera(CameraPosition1)
	gmap1.TrafficEnabled=False
	gmap1.GetUiSettings.ZoomControlsEnabled=False
	gmap1.GetUiSettings.CompassEnabled=False
	Private jo As JavaObject
	jo = gmap1.GetUiSettings
	jo.RunMethod("setMapToolbarEnabled", Array As Object(False))
	
End Sub






Sub get_aton
	Dim j As HttpJob
	Dim raw_aton As String
	'Dim parameter As String ="username="&txtUsername.Text&"&password=" & txtPassword.Text
	j.Initialize("j",Me)
	j.Download(url_aton)
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		'Log(j.GetString)
		Dim result As String = j.GetString
		Dim parser As JSONParser
		parser.Initialize(result)
		Dim root As Map = parser.NextObject
		Dim data As List = root.Get("data")
		Dim total As Int = data.Get(0).As(Map).Get("total")
		Log(total)
		Dim rows As List = data.Get(1).As(List).Get(0).As(Map).Get("rows")
		for  each coldata As Map In rows
			Dim id As String = coldata.Get("id")
			Dim aton_type As Int = coldata.Get("aton_type")
			Dim aton_name As String = coldata.Get("aton_name")
			Dim degree1 As Double =coldata.Get("degree1")
			Dim minute1 As Double = coldata.Get("minute1")
			Dim second1 As Double = coldata.Get("second1")
			Dim degree2 As Double =coldata.Get("degree2")
			Dim minute2 As Double = coldata.Get("minute2")
			Dim second2 As Double = coldata.Get("second2")
			Dim radius As Int = coldata.Get("radius")
			
			Dim lat As Double= degree1+(minute1/60)+(second1/3600)
			Dim lon As Double= degree2+(minute2/60)+(second2/3600)
			
			Dim co As CircleOptions
			co.Initialize
			co.Center2(lat,lon).Radius(radius).FillColor(Colors.ARGB(100,0,0,255)).StrokeColor(Colors.Blue)
			
			Dim Marker1 As Marker
			Dim bmp As Bitmap
			
			If aton_type=1 Then
				bmp.Initialize(File.DirAssets,"aton_marker.png")
			Else If aton_type=2 Then
				bmp.Initialize(File.DirAssets,"aton_marker2.png")
			Else
				bmp.Initialize(File.DirAssets,"aton_marker1.png")
			End If
			
			Marker1 = gmap.AddMarker3(lat,lon,aton_name,bmp)
			Marker1 = gmap1.AddMarker3(lat,lon,aton_name,bmp)
			gmap_extra.AddCircle(gmap,co)
			gmap_extra.AddCircle(gmap1,co)
			
		Next
		Dim success As String = root.Get("success")
	End If
	j.Release
End Sub



Private Sub ImageView2_Click
	ScrollView1.Visible=False
	PanelMapLarge.Visible=True
	'PanelMensuCRUD.Visible=False
	ph.SetScreenOrientation(0)
End Sub

Private Sub ImageView1_Click
	ScrollView1.Visible=True
	PanelMapLarge.Visible=False
	'PanelMensuCRUD.Visible=False
	ph.SetScreenOrientation(0)
End Sub

Private Sub ImageView3_Click
	'PanelMensuCRUD.Visible=True
	'ScrollView1.Visible=False
	'PanelMapLarge.Visible=False
	StartActivity(Mensu)
	'ph.SetScreenOrientation(1)
End Sub

Private Sub ImageView4_Click
	
End Sub

Private Sub ImageView5_Click
	
End Sub

Private Sub ImageView6_Click
	
End Sub

Private Sub ImageView7_Click
	Activity.Finish
End Sub







