B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private PanelHeaderMensu1 As Panel
	Private JustifyTextView1 As JustifyTextView
	Private JustifyTextView11 As JustifyTextView
	Private txtSearchMensu As EditText
	Private ButtonNewMensu As Button'
	Private clvMensu As CustomListView
	Private PanelMensuCRUD As Panel
	Private JustifyTextView1 As JustifyTextView
	Private clvMensu As CustomListView
	Private lblNamaAton As Label
	Private lblKodeMensu As Label
	Private lblOperatorMensu As Label
	'Private TitleHeight As Int = 180dip
	'Private DividerHeight As Int = 2dip
	Private PanelHeaderMensu As Panel
	Private XUI As XUI
	Type TitleData (Title As String)
	Private ph As Phone
	Private DividerHeight As Int = 2dip
	Private PanelOverlay As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("LayoutMensu")
	ph.SetScreenOrientation(1)
	JustifyTextView11.SetText("Menara Suar adalah Sarana Bantu Navigasi Pelayaran tetap yang bersuar dan mempunyai jarak tampak sama atau lebih 20 (dua puluh) mil laut yang dapat membantu para navigator dalam menentukan posisi dan atau haluan kapal, menunjukan arah daratan dan adanya pelabuhan serta dapat dipergunakan sebagai tanda batas wilayah negara.",True)
	JustifyTextView11.As(Label).TextSize=12
	general.SetBackgroundTintList(txtSearchMensu, Colors.White,Colors.White)
	getMensuData
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub getMensuData
	'clvMensu.Add(CreateListItemMensu(clvMensu.AsView.Width,clvMensu.AsView.Height,kd_aton,nama_aton,operator),i)
	clvMensu.Clear
	clvMensu.Add(CreateHeaderListItemMensu(clvMensu.AsView.Width,clvMensu.AsView.Height),0)

	For i=1 To 10
		clvMensu.Add(CreateListItemMensu(clvMensu.AsView.Width,clvMensu.AsView.Height,"kd_aton" & i,"nama_aton" & i,"operator" & i),i)
	Next
End Sub
Sub CreateHeaderListItemMensu(Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, 100dip)
	p.LoadLayout("layoutisiheadermensu")
	JustifyTextView1.SetText("Menara Suar adalah Sarana Bantu Navigasi Pelayaran tetap yang bersuar dan mempunyai jarak tampak sama atau lebih 20 (dua puluh) mil laut yang dapat membantu para navigator dalam menentukan posisi dan atau haluan kapal, menunjukan arah daratan dan adanya pelabuhan serta dapat dipergunakan sebagai tanda batas wilayah negara.",True)
	JustifyTextView1.As(Label).TextSize=12
	p.Visible=False
	'lblBarang.Text=nama_barang
	'lblEdit.Tag=id
	'lblDelete.Tag=id
	'lblBarang.Tag=id
	Return p
End Sub
Sub CreateListItemMensu(Width As Int, Height As Int,kd_aton As String,nama_aton As String,operator As String) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, 180dip)
	p.LoadLayout("layoutisiclvMensu")
	lblNamaAton.Text= nama_aton
	lblKodeMensu.Text= kd_aton
	lblOperatorMensu.Text=  operator
	'lblBarang.Text=nama_barang
	'lblEdit.Tag=id
	'lblDelete.Tag=id
	'lblBarang.Tag=id
	Return p
End Sub
Private Sub clvMensu_ScrollChanged (Offset As Int)
	Dim TopIndex As Int = clvMensu.FindIndexFromOffset(Offset + PanelHeaderMensu.Height + DividerHeight * 2)
	Log(TopIndex)
	Log(clvMensu.GetValue(TopIndex))
	If TopIndex=0 Then
		PanelHeaderMensu1.SetVisibleAnimated(500,True)
	Else
		PanelHeaderMensu1.SetVisibleAnimated(500,False)
	End If
End Sub

Private Sub ButtonNewMensu_Click
	PanelOverlay.SetVisibleAnimated(500,True)
	'PanelSideBar.SendToBack
	PanelOverlay.BringToFront
End Sub

Private Sub PanelOverlay_Touch (Action As Int, X As Float, Y As Float)
	PanelOverlay.SetVisibleAnimated(500,False)
	'PanelSideBar.BringToFront
	PanelOverlay.SendToBack
End Sub

Private Sub LabelNewAtonDJPL_Click
	PanelOverlay.SetVisibleAnimated(500,False)
	'PanelSideBar.BringToFront
	PanelOverlay.SendToBack
	StartActivity(NewMensu)
End Sub

Private Sub LabelNewAtonNonDJPL_Click
	
End Sub