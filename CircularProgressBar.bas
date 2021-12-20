B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
'Custom View class
'version: 3.00
#DesignerProperty: Key: FirstColor, DisplayName: First Color, FieldType: Color, DefaultValue: #FFA9D8FF, Description:
#DesignerProperty: Key: SecondColor, DisplayName: Second Color, FieldType: Color, DefaultValue: 0xFF004884, Description:
#DesignerProperty: Key: ColorEmpty, DisplayName: Color Empty, FieldType: Color, DefaultValue: 0xFFE4DADA, Description:
#DesignerProperty: Key: StrokeWidth, DisplayName: Stroke Width, FieldType: Int, DefaultValue: 10, Description:
#DesignerProperty: Key: Duration, DisplayName: Duration From 0 To 100, FieldType: Int, DefaultValue: 3000, Description: Milliseconds

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private xui As XUI
	Private mLbl As B4XView
	Private cx, cy, radius As Float
	Private stroke As Float
	Private mBase As B4XView
	Private currentValue As Float
	Private DurationFromZeroTo100 As Int
	Private bc As BitmapCreator
	Private emptyBrush As BCBrush
	Private fullBrush As BCBrush
	Private TransparentBrush As BCBrush
	Private iv As B4XView
	Private clr1, clr2 As Int
	Private LoopIndex As Int

End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,  Min(mBase.Width, mBase.Height), Min(mBase.Width, mBase.Height))
	Dim clrEmpty As Int = xui.PaintOrColorToColor(Props.Get("ColorEmpty"))
	clr1 = xui.PaintOrColorToColor(Props.Get("FirstColor"))
	clr2 = xui.PaintOrColorToColor(Props.Get("SecondColor"))
	stroke = DipToCurrent(Props.Get("StrokeWidth"))
	DurationFromZeroTo100 = Props.Get("Duration")
	mLbl = Lbl
	cx = mBase.Width / 2 
	cy = mBase.Height / 2
	radius = cx - 10dip
	mLbl.SetTextAlignment("CENTER", "CENTER")
	Dim iiv As ImageView
	iiv.Initialize("")
	iv = iiv
	mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height)
	mBase.AddView(mLbl, 0, mBase.Height / 2 - 20dip, mBase.Width, 40dip)
	ResetBC
	emptyBrush = bc.CreateBrushFromColor(clrEmpty)
	TransparentBrush = bc.CreateBrushFromColor(xui.Color_Transparent)
	DrawValue(currentValue)
End Sub

Private Sub ResetBC
	bc.Initialize(iv.Width, iv.Width)
	Dim g As BitmapCreator
	g.Initialize(bc.mWidth, bc.mHeight)
	Dim r As B4XRect
	r.Initialize(0, 0, bc.mWidth, 2) 'ignore
	bc.FillGradient(Array As Int(clr1, clr2), r, "LEFT_RIGHT")
	For y = 0 To g.mHeight - 1
		For x = 0 To g.mWidth - 1
			Dim angle As Float = ATan2D(y - cy, x - cx) + 90.5
			If angle < 0 Then angle = angle + 360
			g.CopyPixel(bc, bc.mWidth * angle / 360, 0, x, y)
		Next
	Next
	fullBrush = bc.CreateBrushFromBitmapCreator(g)
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	Dim w As Int = Min(Width, Height)
	cx = w / 2
	cy = w / 2
	radius = cx - 10dip
	iv.SetLayoutAnimated(0, 0, 0, w, w)
	If bc.mWidth <> w Then
		ResetBC
	End If
	mLbl.SetLayoutAnimated(0, 0, cy - 20dip, w, 40dip)
End Sub

Public Sub setValue(NewValue As Float)
	AnimateValueTo(NewValue)
End Sub

Public Sub getValue As Float
	Return currentValue
End Sub

Private Sub AnimateValueTo(NewValue As Float)
	LoopIndex = LoopIndex + 1
	Dim MyIndex As Int = LoopIndex
	Dim n As Long = DateTime.Now
	Dim duration As Int = Abs(currentValue - NewValue) / 100 * DurationFromZeroTo100 + 1000
	Dim start As Float = currentValue
	currentValue = NewValue
	Dim tempValue As Float
	Do While DateTime.Now < n + duration
		tempValue = ValueFromTimeEaseInOut(DateTime.Now - n, start, NewValue - start, duration)
		DrawValue(tempValue)
		Sleep(15)
		If MyIndex <> LoopIndex Then Return
	Loop
	DrawValue(currentValue)
End Sub

'quartic easing in/out from http://gizma.com/easing/
Private Sub ValueFromTimeEaseInOut(Time As Float, Start As Float, ChangeInValue As Float, Duration As Int) As Float
	Time = Time / (Duration / 2)
	If Time < 1 Then
		Return ChangeInValue / 2 * Time * Time * Time * Time + Start
	Else
		Time = Time - 2
		Return -ChangeInValue / 2 * (Time * Time * Time * Time - 2) + Start
	End If
End Sub

Private Sub DrawValue(Value As Float)
	bc.DrawRect2(bc.TargetRect, TransparentBrush, True, 0)
	mLbl.Text = $"$1.0{Value}"$
	Dim startAngle = -90, sweepAngle = Value / 100 * 361 As Float
	bc.DrawArc2(cx, cy, radius, emptyBrush, False, stroke, startAngle, -(360 - sweepAngle))
	bc.DrawArc2(cx, cy, radius, fullBrush, False, stroke, startAngle, sweepAngle)
	bc.SetBitmapToImageView(bc.Bitmap, iv)
End Sub



