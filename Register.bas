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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtUsername As EditText
	Private txtEmail As EditText
	Private txtPassword As EditText
	Private ClickStatus As Int = 0
	Private Button1 As Button
	Private Button2 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Register")
	general.SetBackgroundTintList(txtUsername, Colors.White,Colors.White)
	general.SetBackgroundTintList(txtEmail, Colors.White,Colors.White)
	general.SetBackgroundTintList(txtPassword, Colors.White,Colors.White)
	general.EditTextUsername(txtUsername)
	general.EditTextEmail(txtEmail)
	general.EditTextPassword(txtPassword)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button2_Click
	StartActivity(Login)
	Activity.Finish
	
End Sub

Private Sub txtPassword_Click
	If ClickStatus=0 Then
		general.EditTextPassword1(txtPassword)
		ClickStatus=1
		'Log("1")
		txtPassword.PasswordMode=False
	Else
		general.EditTextPassword(txtPassword)
		ClickStatus=0
		txtPassword.PasswordMode=True
		'Log("0")
	End If
End Sub