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
	Dim ph As Phone
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private LabelBackMensu As Label
	Private ScrollViewNewMensu As ScrollView
	Private txtTahunPenetapan As EditText
	
	Private LabeliconTahunPenetapan As Label
	Private txtNamaMensu As EditText
	
	Private DateTemplate As B4XDateTemplate
	Private Dialog As B4XDialog
	'Private lblDate As B4XView
	Private xui As XUI
	Private B4XComboBoxLahan As B4XComboBox
	Private txtNoDSI As EditText
	Private txtNoBA As EditText
	Private ButtonNewMensuSelanjutnya As Button
	Private PanelNewMensu1 As Panel
	Private PanelNewMensu2 As Panel
	Private ButtonNewMensuSebelumnya As Button
	Private ButtonNewMensuSimpan As Button
	Private PanelNewMensuDJPL1 As Panel
	Private PanelNewMensuDJPL2 As Panel
	Private txtElevasiMensuDJPL As EditText
	Private txtTinggiMensuDJPL As EditText
	Private txtTinggiFokusMensuDJPL As EditText
	Private txtJarakTampakDJPL As EditText
	Private txtSektorGelapDJPL As EditText
	Private txtSektorTerangDJPL As EditText
	Private txtkarakeristikCerlangDJPL As EditText
	Private txtPeriodeCerlangDJPL As EditText
	Private txtTandaSiangDJPL As EditText
	Private SpinnerKodeMorseDJPL As Spinner
	Private SpinnerKarakerBunyiDJPL As Spinner
	Private txtmmsiDJPL As EditText
	Private Panel20 As Panel
	Private Panel21 As Panel
	Private Panel22 As Panel
	Private Panel23 As Panel
	Private Panel24 As Panel
	Private Panel25 As Panel
	Private txtdegree1DJPL As EditText
	Private txtminute1DJPL As EditText
	Private txtsecond1DJPL As EditText
	Private txtdegree2DJPL As EditText
	Private txtminute2DJPL As EditText
	Private txtsecond2DJPL As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("LayoutNewMensu")
	ph.SetScreenOrientation(1)
	ScrollViewNewMensu.Panel.LoadLayout("LayoutisiNewMensu")
	general.SetBackgroundTintList(txtNamaMensu,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtTahunPenetapan,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtNoDSI,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtNoBA,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtElevasiMensuDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtTinggiFokusMensuDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtJarakTampakDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtSektorGelapDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtSektorTerangDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtkarakeristikCerlangDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtPeriodeCerlangDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtTandaSiangDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtmmsiDJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtdegree1DJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtminute1DJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtsecond1DJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtdegree2DJPL,Colors.White,Colors.White)
	general.SetBackgroundTintList(txtminute2DJPL,Colors.White,Colors.White)
	
	DateTemplate.Initialize
	DateTemplate.Date = DateTime.Now
	UpdateLabel
	Dialog.Initialize(Activity)
	Dim cs As CSBuilder
	Dialog.Title = cs.Initialize.Size(24).Append("Select Date").PopAll
	SetLightTheme
	ScrollViewNewMensu.Panel.Height = 1000dip
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub SetLightTheme
	Dialog.TitleBarColor = 0xFF5B8DD7
	Dialog.TitleBarHeight = 80dip
	Dim TextColor As Int = 0xFF5B8DD7
	Dialog.BackgroundColor = xui.Color_White
	Dialog.ButtonsColor = xui.Color_White
	Dialog.ButtonsTextColor = Dialog.TitleBarColor
	Dialog.BorderColor = xui.Color_Transparent
	DateTemplate.DaysInWeekColor = xui.Color_Black
	DateTemplate.SelectedColor = 0xFF5B8DD7
	DateTemplate.HighlightedColor = 0xFF5B8DD7
	DateTemplate.DaysInMonthColor = TextColor
	DateTemplate.lblMonth.TextColor = TextColor
	DateTemplate.lblYear.TextColor = TextColor
	DateTemplate.SelectedColor = Colors.White
	For Each x As B4XView In Array(DateTemplate.btnMonthLeft, DateTemplate.btnMonthRight, DateTemplate.btnYearLeft, DateTemplate.btnYearRight)
		x.Color = xui.Color_Transparent
	Next
End Sub


Sub UpdateLabel
	DateTime.DateFormat = "dd-MM-yyyy"
	txtTahunPenetapan.Text =  DateTime.Date(DateTemplate.Date)
End Sub

Private Sub LabelBackMensu_Click
	Activity.Finish
End Sub

Sub txtTahunPenetapan_Click
	'dtdtp.show("test")
	Wait For (Dialog.ShowTemplate(DateTemplate, "", "", "CANCEL")) Complete (Result As Int)
	UpdateLabel
End Sub

Private Sub LabeliconTahunPenetapan_Click
	'Dim D As DateDialog
	'Dim R As Int
	
	'D.Initialize(Me,"",DateTime.Now)
	'D.Show("Select my date","Yes","","No")
	'R=D.DoEventWaitResponce
	'Log(ToastResponse(R,D.DataToText(D.DateTick)))
	'txtTahunPenetapan.Text = ToastResponse(R,D.DataToText(D.DateTick))
	'Dim DP As DatePickerDialog
	'DP.Initialize("DP",2021,12,12)
	'DP.show("test")
	Wait For (Dialog.ShowTemplate(DateTemplate, "", "", "CANCEL")) Complete (Result As Int)
	UpdateLabel
End Sub




Sub ToastResponse(R As Int, Message As String) As String
	Select R
		Case DialogResponse.POSITIVE
			'ToastMessageShow("Positive " & CRLF & Message,False)
			'txt
		Case DialogResponse.NEGATIVE
			'ToastMessageShow("Negative " & CRLF & Message,False)
		Case DialogResponse.CANCEL
			'ToastMessageShow("Cancel " & CRLF & Message,False)
	End Select
	Return Message
End Sub

Private Sub ButtonNewMensuSelanjutnya_Click
	PanelNewMensuDJPL1.SetVisibleAnimated(500,False)
	PanelNewMensuDJPL2.SetVisibleAnimated(500,True)
	ScrollViewNewMensu.ScrollPosition =0
End Sub

Private Sub ButtonNewMensuSebelumnya_Click
	PanelNewMensuDJPL1.SetVisibleAnimated(500,True)
	PanelNewMensuDJPL2.SetVisibleAnimated(500,False)
End Sub