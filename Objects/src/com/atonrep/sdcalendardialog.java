package com.atonrep;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sdcalendardialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.atonrep.sdcalendardialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.atonrep.sdcalendardialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public long _datepicker = 0L;
public int _color = 0;
public int _textcolor = 0;
public int _textsize = 0;
public String _title = "";
public boolean _square = false;
public String _eventname = "";
public Object _callback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _pa = null;
public anywheresoftware.b4a.objects.PanelWrapper _pan = null;
public anywheresoftware.b4a.objects.PanelWrapper _myact = null;
public long _dateret = 0L;
public int _ret = 0;
public anywheresoftware.b4a.objects.PanelWrapper _cale = null;
public anywheresoftware.b4a.objects.PanelWrapper _testa = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttocancel = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnow = null;
public anywheresoftware.b4a.objects.LabelWrapper _lday = null;
public anywheresoftware.b4a.objects.LabelWrapper _lyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _lmounth = null;
public b4a.example.dialogs _dialogs = null;
public b4a.example.dateutils _dateutils = null;
public com.atonrep.main _main = null;
public com.atonrep.starter _starter = null;
public com.atonrep.login _login = null;
public com.atonrep.general _general = null;
public com.atonrep.register _register = null;
public com.atonrep.home _home = null;
public com.atonrep.newmensu _newmensu = null;
public com.atonrep.mensu _mensu = null;
public com.atonrep.httputils2service _httputils2service = null;
public com.atonrep.xuiviewsutils _xuiviewsutils = null;
public String  _buttoncancel_click() throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="private Sub ButtonCancel_Click";
 //BA.debugLineNum = 515;BA.debugLine="Ret=DialogResponse.NEGATIVE";
_ret = __c.DialogResponse.NEGATIVE;
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return "";
}
public String  _buttonok_click() throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="private Sub ButtonOk_Click";
 //BA.debugLineNum = 509;BA.debugLine="DatePicker=DateRet";
_datepicker = _dateret;
 //BA.debugLineNum = 510;BA.debugLine="Ret=DialogResponse.POSITIVE";
_ret = __c.DialogResponse.POSITIVE;
 //BA.debugLineNum = 511;BA.debugLine="If SubExists(CallBack,EventName & \"_Click\") Then";
if (__c.SubExists(ba,_callback,_eventname+"_Click")) { 
__c.CallSubNew(ba,_callback,_eventname+"_Click");};
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Public DatePicker As Long";
_datepicker = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Public Color As Int = Colors.RGB(0,150,136)";
_color = __c.Colors.RGB((int) (0),(int) (150),(int) (136));
 //BA.debugLineNum = 15;BA.debugLine="Public TextColor As Int = Colors.White";
_textcolor = __c.Colors.White;
 //BA.debugLineNum = 16;BA.debugLine="Public TextSize As Int = 16";
_textsize = (int) (16);
 //BA.debugLineNum = 17;BA.debugLine="Public Title As String = \"\"";
_title = "";
 //BA.debugLineNum = 18;BA.debugLine="Public Square As Boolean = True";
_square = __c.True;
 //BA.debugLineNum = 20;BA.debugLine="Private EventName As String 'ignore";
_eventname = "";
 //BA.debugLineNum = 21;BA.debugLine="Private CallBack As Object 'ignore";
_callback = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Pa As Panel";
_pa = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Pan As Panel";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private MyAct As Panel";
_myact = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private DateRet As Long = 0";
_dateret = (long) (0);
 //BA.debugLineNum = 28;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
 //BA.debugLineNum = 30;BA.debugLine="Private Cale As Panel";
_cale = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Testa As Panel";
_testa = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private ButtonOk As Button";
_buttonok = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private ButtoCancel As Button";
_buttocancel = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private LabelNow As Label";
_labelnow = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private LDay As Label";
_lday = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private LYear As Label";
_lyear = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private LMounth As Label";
_lmounth = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.ColorDrawable  _corner(int _colore) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdb = null;
 //BA.debugLineNum = 146;BA.debugLine="private Sub Corner(Colore As Int) As ColorDrawable";
 //BA.debugLineNum = 147;BA.debugLine="Dim cdb As ColorDrawable";
_cdb = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 148;BA.debugLine="cdb.Initialize(Colore, 20dip)";
_cdb.Initialize(_colore,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 149;BA.debugLine="Return cdb";
if (true) return _cdb;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _can = null;
int _d = 0;
int _m = 0;
int _y = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _obj = null;
 //BA.debugLineNum = 46;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 47;BA.debugLine="Dim Bm As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Dim Can As Canvas";
_can = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Dim D,M,Y As Int";
_d = 0;
_m = 0;
_y = 0;
 //BA.debugLineNum = 51;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 52;BA.debugLine="mBase.Color=Colors.Transparent";
_mbase.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 55;BA.debugLine="Dim Obj As View = mBase";
_obj = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_obj = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_mbase.getObject()));
 //BA.debugLineNum = 56;BA.debugLine="Do While Not(GetType(Obj) = \"android.widget.Frame";
while (__c.Not((__c.GetType((Object)(_obj.getObject()))).equals("android.widget.FrameLayout"))) {
 //BA.debugLineNum = 57;BA.debugLine="Obj=Obj.Parent";
_obj = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_obj.getParent()));
 }
;
 //BA.debugLineNum = 59;BA.debugLine="MyAct=Obj";
_myact = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_obj.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="Pan.Initialize(\"Pan\")";
_pan.Initialize(ba,"Pan");
 //BA.debugLineNum = 63;BA.debugLine="mBase.AddView(Pan,0dip,0dip,mBase.Width,mBase.Hei";
_mbase.AddView((android.view.View)(_pan.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 66;BA.debugLine="If Props.ContainsKey(\"TextColor\") Then TextColor=";
if (_props.ContainsKey((Object)("TextColor"))) { 
_textcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("TextColor"))));};
 //BA.debugLineNum = 67;BA.debugLine="If Props.ContainsKey(\"TextSize\") Then TextSize=Pr";
if (_props.ContainsKey((Object)("TextSize"))) { 
_textsize = (int)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));};
 //BA.debugLineNum = 68;BA.debugLine="If Props.ContainsKey(\"Color\") Then Color=Props.Ge";
if (_props.ContainsKey((Object)("Color"))) { 
_color = (int)(BA.ObjectToNumber(_props.Get((Object)("Color"))));};
 //BA.debugLineNum = 69;BA.debugLine="If Props.ContainsKey(\"DayOfMounth\") Then d=Props.";
if (_props.ContainsKey((Object)("DayOfMounth"))) { 
_d = (int)(BA.ObjectToNumber(_props.Get((Object)("DayOfMounth"))));};
 //BA.debugLineNum = 70;BA.debugLine="If Props.ContainsKey(\"Mounth\") Then m=Props.Get(\"";
if (_props.ContainsKey((Object)("Mounth"))) { 
_m = (int)(BA.ObjectToNumber(_props.Get((Object)("Mounth"))));};
 //BA.debugLineNum = 71;BA.debugLine="If Props.ContainsKey(\"Year\") Then y=Props.Get(\"Ye";
if (_props.ContainsKey((Object)("Year"))) { 
_y = (int)(BA.ObjectToNumber(_props.Get((Object)("Year"))));};
 //BA.debugLineNum = 72;BA.debugLine="If Props.ContainsKey(\"Title\") Then Title=Props.Ge";
if (_props.ContainsKey((Object)("Title"))) { 
_title = BA.ObjectToString(_props.Get((Object)("Title")));};
 //BA.debugLineNum = 73;BA.debugLine="If Props.ContainsKey(\"Square\") Then Square=Props.";
if (_props.ContainsKey((Object)("Square"))) { 
_square = BA.ObjectToBoolean(_props.Get((Object)("Square")));};
 //BA.debugLineNum = 75;BA.debugLine="If Props.ContainsKey(\"Now\") Then";
if (_props.ContainsKey((Object)("Now"))) { 
 //BA.debugLineNum = 76;BA.debugLine="If Props.Get(\"Now\")=True Then";
if ((_props.Get((Object)("Now"))).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 77;BA.debugLine="DatePicker=DateTime.Now";
_datepicker = __c.DateTime.getNow();
 //BA.debugLineNum = 78;BA.debugLine="D=DateTime.GetDayOfMonth(DatePicker)";
_d = __c.DateTime.GetDayOfMonth(_datepicker);
 //BA.debugLineNum = 79;BA.debugLine="M=DateTime.GetMonth(DatePicker)";
_m = __c.DateTime.GetMonth(_datepicker);
 //BA.debugLineNum = 80;BA.debugLine="Y=DateTime.GetYear(DatePicker)";
_y = __c.DateTime.GetYear(_datepicker);
 }else {
 //BA.debugLineNum = 82;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyyy");
 //BA.debugLineNum = 83;BA.debugLine="DatePicker=DateTime.DateParse(m & \"/\" & d & \"/\"";
_datepicker = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_y));
 };
 };
 //BA.debugLineNum = 87;BA.debugLine="DateRet=DatePicker";
_dateret = _datepicker;
 //BA.debugLineNum = 89;BA.debugLine="If Square Then";
if (_square) { 
 //BA.debugLineNum = 90;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
_bm.InitializeMutable(__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (400)));
 //BA.debugLineNum = 91;BA.debugLine="Can.Initialize2(Bm)";
_can.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
 //BA.debugLineNum = 92;BA.debugLine="Can.DrawColor(Color)";
_can.DrawColor(_color);
 //BA.debugLineNum = 93;BA.debugLine="Can.DrawText(NomeMese(M),210dip,80dip,Typeface.D";
_can.DrawText(ba,_nomemese(_m),(float) (__c.DipToCurrent((int) (210))),(float) (__c.DipToCurrent((int) (80))),__c.Typeface.DEFAULT_BOLD,(float) (60),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 94;BA.debugLine="Can.DrawText(d,200dip,260dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_d),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (260))),__c.Typeface.DEFAULT_BOLD,(float) (180),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 95;BA.debugLine="Can.DrawText(y,200dip,350dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_y),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (350))),__c.Typeface.DEFAULT_BOLD,(float) (60),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 96;BA.debugLine="Pan.SetBackgroundImage(Can.Bitmap)";
_pan.SetBackgroundImageNew((android.graphics.Bitmap)(_can.getBitmap().getObject()));
 }else {
 //BA.debugLineNum = 98;BA.debugLine="Pan.Background=Corner(Color)";
_pan.setBackground((android.graphics.drawable.Drawable)(_corner(_color).getObject()));
 //BA.debugLineNum = 99;BA.debugLine="Can.Initialize(Pan)";
_can.Initialize((android.view.View)(_pan.getObject()));
 //BA.debugLineNum = 100;BA.debugLine="Can.DrawText(d & \"-\" & NomeMese(M).SubString2(0,";
_can.DrawText(ba,BA.NumberToString(_d)+"-"+_nomemese(_m).substring((int) (0),(int) (3))+"-"+BA.NumberToString(_y),(float) (_mbase.getWidth()/(double)2),(float) (_mbase.getHeight()/(double)2+__c.DipToCurrent((int) (5))),__c.Typeface.DEFAULT_BOLD,(float) (_textsize),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _fillcalendar() throws Exception{
int _gday = 0;
int _d = 0;
int _m = 0;
int _a = 0;
int _y = 0;
int _x = 0;
long _datestart = 0L;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lab = null;
 //BA.debugLineNum = 154;BA.debugLine="private Sub FillCalendar";
 //BA.debugLineNum = 155;BA.debugLine="Dim GDay,D,M,A,Y,X As Int";
_gday = 0;
_d = 0;
_m = 0;
_a = 0;
_y = 0;
_x = 0;
 //BA.debugLineNum = 156;BA.debugLine="Dim DateStart As Long";
_datestart = 0L;
 //BA.debugLineNum = 158;BA.debugLine="Cale.RemoveAllViews";
_cale.RemoveAllViews();
 //BA.debugLineNum = 160;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(_dateret);
 //BA.debugLineNum = 161;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(_dateret);
 //BA.debugLineNum = 162;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(_dateret);
 //BA.debugLineNum = 163;BA.debugLine="GDay=DateTime.GetDayOfWeek(DateRet)";
_gday = __c.DateTime.GetDayOfWeek(_dateret);
 //BA.debugLineNum = 165;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyy\"";
__c.DateTime.setDateFormat("MM/dd/yyy");
 //BA.debugLineNum = 166;BA.debugLine="DateStart=DateTime.DateParse(M & \"/01/\" & A)";
_datestart = __c.DateTime.DateParse(BA.NumberToString(_m)+"/01/"+BA.NumberToString(_a));
 //BA.debugLineNum = 168;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyy\"";
__c.DateTime.setDateFormat("MM/dd/yyy");
 //BA.debugLineNum = 169;BA.debugLine="GDay=DateTime.GetDayOfWeek(DateTime.DateParse(M &";
_gday = __c.DateTime.GetDayOfWeek(__c.DateTime.DateParse(BA.NumberToString(_m)+"/01/"+BA.NumberToString(_a)));
 //BA.debugLineNum = 171;BA.debugLine="For i=0 To 6";
{
final int step12 = 1;
final int limit12 = (int) (6);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 172;BA.debugLine="Dim Lab As Label";
_lab = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 173;BA.debugLine="Lab.Initialize(\"\")";
_lab.Initialize(ba,"");
 //BA.debugLineNum = 174;BA.debugLine="Lab.Text=NomeGiorno(i)";
_lab.setText(BA.ObjectToCharSequence(_nomegiorno(_i)));
 //BA.debugLineNum = 175;BA.debugLine="Lab.Color=Colors.Transparent";
_lab.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 176;BA.debugLine="If i=0 Then Lab.Textcolor=Colors.Red Else Lab.Te";
if (_i==0) { 
_lab.setTextColor(__c.Colors.Red);}
else {
_lab.setTextColor(__c.Colors.Black);};
 //BA.debugLineNum = 177;BA.debugLine="Lab.Gravity=Gravity.CENTER";
_lab.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 178;BA.debugLine="Lab.Typeface=Typeface.DEFAULT_BOLD";
_lab.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 179;BA.debugLine="Lab.TextSize=14";
_lab.setTextSize((float) (14));
 //BA.debugLineNum = 180;BA.debugLine="Cale.AddView(Lab,i*40dip,0dip,40dip,40dip)";
_cale.AddView((android.view.View)(_lab.getObject()),(int) (_i*__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 }
};
 //BA.debugLineNum = 183;BA.debugLine="Y=40dip";
_y = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 184;BA.debugLine="X=(GDay-1)*40dip";
_x = (int) ((_gday-1)*__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 185;BA.debugLine="For i=1 To 31";
{
final int step25 = 1;
final int limit25 = (int) (31);
_i = (int) (1) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 186;BA.debugLine="If DateTime.GetMonth(DateStart)=m Then";
if (__c.DateTime.GetMonth(_datestart)==_m) { 
 //BA.debugLineNum = 187;BA.debugLine="Dim Lab As Label";
_lab = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 189;BA.debugLine="Lab.Initialize(\"Giorno\")";
_lab.Initialize(ba,"Giorno");
 //BA.debugLineNum = 190;BA.debugLine="If d=i Then";
if (_d==_i) { 
 //BA.debugLineNum = 191;BA.debugLine="Lab.Background=Corner(Color)";
_lab.setBackground((android.graphics.drawable.Drawable)(_corner(_color).getObject()));
 //BA.debugLineNum = 192;BA.debugLine="Lab.Textcolor=Colors.White";
_lab.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 193;BA.debugLine="LabelNow=Lab";
_labelnow = _lab;
 }else {
 //BA.debugLineNum = 195;BA.debugLine="Lab.Color=Colors.Transparent";
_lab.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 196;BA.debugLine="Lab.TextColor=Colors.Black";
_lab.setTextColor(__c.Colors.Black);
 };
 //BA.debugLineNum = 198;BA.debugLine="Lab.Text=i";
_lab.setText(BA.ObjectToCharSequence(_i));
 //BA.debugLineNum = 199;BA.debugLine="Lab.Tag=DateStart";
_lab.setTag((Object)(_datestart));
 //BA.debugLineNum = 200;BA.debugLine="Lab.Gravity=Gravity.CENTER";
_lab.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 201;BA.debugLine="Lab.TextSize=14";
_lab.setTextSize((float) (14));
 //BA.debugLineNum = 202;BA.debugLine="Cale.AddView(Lab,X,Y,40dip,40dip)";
_cale.AddView((android.view.View)(_lab.getObject()),_x,_y,__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 204;BA.debugLine="GDay=GDay+1";
_gday = (int) (_gday+1);
 //BA.debugLineNum = 205;BA.debugLine="If GDay>7 Then";
if (_gday>7) { 
 //BA.debugLineNum = 206;BA.debugLine="GDay=1";
_gday = (int) (1);
 //BA.debugLineNum = 207;BA.debugLine="Y=Y+35dip";
_y = (int) (_y+__c.DipToCurrent((int) (35)));
 //BA.debugLineNum = 208;BA.debugLine="X=0dip";
_x = __c.DipToCurrent((int) (0));
 }else {
 //BA.debugLineNum = 210;BA.debugLine="X=X+40dip";
_x = (int) (_x+__c.DipToCurrent((int) (40)));
 };
 };
 //BA.debugLineNum = 214;BA.debugLine="DateStart=DateStart + DateTime.TicksPerDay";
_datestart = (long) (_datestart+__c.DateTime.TicksPerDay);
 }
};
 //BA.debugLineNum = 218;BA.debugLine="ButtonOk.Initialize(\"ButtonOk\")";
_buttonok.Initialize(ba,"ButtonOk");
 //BA.debugLineNum = 219;BA.debugLine="ButtonOk.Color=Colors.Transparent";
_buttonok.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 220;BA.debugLine="ButtonOk.TextColor=Color";
_buttonok.setTextColor(_color);
 //BA.debugLineNum = 221;BA.debugLine="ButtonOk.Gravity=Gravity.CENTER";
_buttonok.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 222;BA.debugLine="ButtonOk.Typeface=Typeface.DEFAULT_BOLD";
_buttonok.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 223;BA.debugLine="ButtonOk.Text=\"OK\"";
_buttonok.setText(BA.ObjectToCharSequence("OK"));
 //BA.debugLineNum = 224;BA.debugLine="ButtonOk.Textsize=14";
_buttonok.setTextSize((float) (14));
 //BA.debugLineNum = 225;BA.debugLine="Cale.AddView(ButtonOk,140dip,240dip,140dip,40dip)";
_cale.AddView((android.view.View)(_buttonok.getObject()),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 227;BA.debugLine="ButtoCancel.Initialize(\"ButtonCancel\")";
_buttocancel.Initialize(ba,"ButtonCancel");
 //BA.debugLineNum = 228;BA.debugLine="ButtoCancel.Color=Colors.Transparent";
_buttocancel.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 229;BA.debugLine="ButtoCancel.TextColor=Color";
_buttocancel.setTextColor(_color);
 //BA.debugLineNum = 230;BA.debugLine="ButtoCancel.Gravity=Gravity.CENTER";
_buttocancel.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 231;BA.debugLine="ButtoCancel.Typeface=Typeface.DEFAULT_BOLD";
_buttocancel.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 232;BA.debugLine="ButtoCancel.Text=\"CANCEL\"";
_buttocancel.setText(BA.ObjectToCharSequence("CANCEL"));
 //BA.debugLineNum = 233;BA.debugLine="ButtoCancel.Textsize=14";
_buttocancel.setTextSize((float) (14));
 //BA.debugLineNum = 234;BA.debugLine="Cale.AddView(ButtoCancel,0dip,240dip,140dip,40dip";
_cale.AddView((android.view.View)(_buttocancel.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _filltesta() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lab = null;
anywheresoftware.b4a.objects.ButtonWrapper _p2 = null;
 //BA.debugLineNum = 237;BA.debugLine="private Sub FillTesta";
 //BA.debugLineNum = 239;BA.debugLine="Dim Lab As Label";
_lab = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 240;BA.debugLine="Lab.Initialize(\"\")";
_lab.Initialize(ba,"");
 //BA.debugLineNum = 241;BA.debugLine="Lab.Gravity=Gravity.CENTER";
_lab.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 242;BA.debugLine="Lab.Text=Title";
_lab.setText(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 243;BA.debugLine="Lab.TextSize=14";
_lab.setTextSize((float) (14));
 //BA.debugLineNum = 244;BA.debugLine="Lab.Textcolor=Colors.White";
_lab.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 245;BA.debugLine="Lab.Color=Colors.ARGB(150,0,0,0)";
_lab.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 246;BA.debugLine="Testa.AddView(Lab,0dip,0dip,280dip,30dip)";
_testa.AddView((android.view.View)(_lab.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 249;BA.debugLine="LMounth.Initialize(\"\")";
_lmounth.Initialize(ba,"");
 //BA.debugLineNum = 250;BA.debugLine="LMounth.Gravity=Gravity.CENTER";
_lmounth.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 251;BA.debugLine="LMounth.Text=NomeMese(DateTime.GetMonth(DateRet))";
_lmounth.setText(BA.ObjectToCharSequence(_nomemese(__c.DateTime.GetMonth(_dateret))));
 //BA.debugLineNum = 252;BA.debugLine="LMounth.TextSize=25";
_lmounth.setTextSize((float) (25));
 //BA.debugLineNum = 253;BA.debugLine="LMounth.Textcolor=Colors.White";
_lmounth.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 254;BA.debugLine="LMounth.Color=Colors.Transparent";
_lmounth.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 255;BA.debugLine="Testa.AddView(LMounth,0dip,30dip,280dip,60dip)";
_testa.AddView((android.view.View)(_lmounth.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 265;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 266;BA.debugLine="P2.Initialize(\"PrevM\")";
_p2.Initialize(ba,"PrevM");
 //BA.debugLineNum = 267;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_left_confirm_gray\"";
_loaddrawablebyname((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_left_confirm_gray");
 //BA.debugLineNum = 268;BA.debugLine="Testa.AddView(P2,0dip,35dip,40dip,40dip)";
_testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 279;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 280;BA.debugLine="P2.Initialize(\"NextM\")";
_p2.Initialize(ba,"NextM");
 //BA.debugLineNum = 281;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_right_confirm_gray";
_loaddrawablebyname((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_right_confirm_gray");
 //BA.debugLineNum = 282;BA.debugLine="Testa.AddView(P2,240dip,35dip,40dip,40dip)";
_testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (35)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 285;BA.debugLine="LDay.Initialize(\"\")";
_lday.Initialize(ba,"");
 //BA.debugLineNum = 286;BA.debugLine="LDay.Gravity=Gravity.CENTER";
_lday.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 287;BA.debugLine="LDay.Text=DateTime.GetDayOfMonth(DateRet)";
_lday.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_dateret)));
 //BA.debugLineNum = 288;BA.debugLine="LDay.TextSize=100";
_lday.setTextSize((float) (100));
 //BA.debugLineNum = 289;BA.debugLine="LDay.Textcolor=Colors.White";
_lday.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 290;BA.debugLine="LDay.Typeface=Typeface.SANS_SERIF";
_lday.setTypeface(__c.Typeface.SANS_SERIF);
 //BA.debugLineNum = 291;BA.debugLine="LDay.Color=Colors.Transparent";
_lday.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 292;BA.debugLine="Testa.AddView(LDay,0dip,70dip,280dip,120dip)";
_testa.AddView((android.view.View)(_lday.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (70)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (120)));
 //BA.debugLineNum = 295;BA.debugLine="LYear.Initialize(\"\")";
_lyear.Initialize(ba,"");
 //BA.debugLineNum = 296;BA.debugLine="LYear.Gravity=Gravity.CENTER";
_lyear.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 297;BA.debugLine="LYear.Text=DateTime.GetYear(DateRet)";
_lyear.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_dateret)));
 //BA.debugLineNum = 298;BA.debugLine="LYear.TextSize=30";
_lyear.setTextSize((float) (30));
 //BA.debugLineNum = 299;BA.debugLine="LYear.Textcolor=Colors.ARGB(200,255,255,255)";
_lyear.setTextColor(__c.Colors.ARGB((int) (200),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 300;BA.debugLine="LYear.Color=Colors.Transparent";
_lyear.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 301;BA.debugLine="Testa.AddView(LYear,0dip,190dip,280dip,40dip)";
_testa.AddView((android.view.View)(_lyear.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (190)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 311;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 312;BA.debugLine="P2.Initialize(\"PrevY\")";
_p2.Initialize(ba,"PrevY");
 //BA.debugLineNum = 313;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_left_confirm_gray\"";
_loaddrawablebyname((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_left_confirm_gray");
 //BA.debugLineNum = 314;BA.debugLine="Testa.AddView(P2,0dip,190dip,40dip,40dip)";
_testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (190)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 325;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 326;BA.debugLine="P2.Initialize(\"NextY\")";
_p2.Initialize(ba,"NextY");
 //BA.debugLineNum = 327;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_right_confirm_gray";
_loaddrawablebyname((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_right_confirm_gray");
 //BA.debugLineNum = 328;BA.debugLine="Testa.AddView(P2,240dip,190dip,40dip,40dip)";
_testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (190)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 106;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _giorno_click() throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="private Sub Giorno_Click";
 //BA.debugLineNum = 388;BA.debugLine="LabelNow.Color=Colors.Transparent";
_labelnow.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 389;BA.debugLine="LabelNow.TextColor=Colors.Black";
_labelnow.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 391;BA.debugLine="LabelNow=Sender";
_labelnow = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 392;BA.debugLine="LabelNow.Background=Corner(Color)";
_labelnow.setBackground((android.graphics.drawable.Drawable)(_corner(_color).getObject()));
 //BA.debugLineNum = 393;BA.debugLine="LabelNow.Textcolor=Colors.White";
_labelnow.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 395;BA.debugLine="DateRet=LabelNow.Tag";
_dateret = BA.ObjectToLongNumber(_labelnow.getTag());
 //BA.debugLineNum = 396;BA.debugLine="LDay.Text=LabelNow.Text";
_lday.setText(BA.ObjectToCharSequence(_labelnow.getText()));
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
 //BA.debugLineNum = 41;BA.debugLine="EventName = vEventName";
_eventname = _veventname;
 //BA.debugLineNum = 42;BA.debugLine="CallBack = vCallback";
_callback = _vcallback;
 //BA.debugLineNum = 43;BA.debugLine="Pa.Initialize(\"Pa\")";
_pa.Initialize(ba,"Pa");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _lingua() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 586;BA.debugLine="private Sub Lingua As String";
 //BA.debugLineNum = 587;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 588;BA.debugLine="r.Target = r.RunStaticMethod(\"java.util.Locale\",";
_r.Target = _r.RunStaticMethod("java.util.Locale","getDefault",(Object[])(__c.Null),(String[])(__c.Null));
 //BA.debugLineNum = 589;BA.debugLine="Return r.RunMethod(\"getLanguage\")";
if (true) return BA.ObjectToString(_r.RunMethod("getLanguage"));
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return "";
}
public boolean  _loaddrawablebyname(anywheresoftware.b4a.objects.ConcreteViewWrapper _control,String _imagename) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _id_drawable = 0;
 //BA.debugLineNum = 399;BA.debugLine="Private Sub LoadDrawableByName(Control As View, Im";
 //BA.debugLineNum = 400;BA.debugLine="Dim R As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 401;BA.debugLine="Try";
try { //BA.debugLineNum = 402;BA.debugLine="R.Target = R.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
 //BA.debugLineNum = 403;BA.debugLine="R.Target = R.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
 //BA.debugLineNum = 404;BA.debugLine="R.Target = R.RunMethod(\"getSystem\")";
_r.Target = _r.RunMethod("getSystem");
 //BA.debugLineNum = 405;BA.debugLine="Dim ID_Drawable As Int";
_id_drawable = 0;
 //BA.debugLineNum = 406;BA.debugLine="ID_Drawable = R.RunMethod4(\"getIdentifier\", Arra";
_id_drawable = (int)(BA.ObjectToNumber(_r.RunMethod4("getIdentifier",new Object[]{(Object)(_imagename),(Object)("drawable"),(Object)("android")},new String[]{"java.lang.String","java.lang.String","java.lang.String"})));
 //BA.debugLineNum = 408;BA.debugLine="R.Target = R.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
 //BA.debugLineNum = 409;BA.debugLine="R.Target = R.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
 //BA.debugLineNum = 410;BA.debugLine="Control.Background = R.RunMethod2(\"getDrawable\",";
_control.setBackground((android.graphics.drawable.Drawable)(_r.RunMethod2("getDrawable",BA.NumberToString(_id_drawable),"java.lang.int")));
 //BA.debugLineNum = 411;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 414;BA.debugLine="LogColor(\"ERROR.LoadDrawableByName:\" & LastExcep";
__c.LogImpl("35636111","ERROR.LoadDrawableByName:"+__c.LastException(ba).getMessage(),__c.Colors.Red);
 //BA.debugLineNum = 415;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return false;
}
public String  _nextm_click() throws Exception{
int _d = 0;
int _m = 0;
int _a = 0;
 //BA.debugLineNum = 446;BA.debugLine="Private Sub NextM_Click";
 //BA.debugLineNum = 447;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
 //BA.debugLineNum = 449;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(_dateret);
 //BA.debugLineNum = 450;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(_dateret);
 //BA.debugLineNum = 451;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(_dateret);
 //BA.debugLineNum = 453;BA.debugLine="M=M+1";
_m = (int) (_m+1);
 //BA.debugLineNum = 454;BA.debugLine="If M=13 Then";
if (_m==13) { 
 //BA.debugLineNum = 455;BA.debugLine="M=1";
_m = (int) (1);
 //BA.debugLineNum = 456;BA.debugLine="a=a+1";
_a = (int) (_a+1);
 };
 //BA.debugLineNum = 459;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
 //BA.debugLineNum = 460;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
 //BA.debugLineNum = 462;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 463;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
_dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
 //BA.debugLineNum = 464;BA.debugLine="FillCalendar";
_fillcalendar();
 //BA.debugLineNum = 465;BA.debugLine="LMounth.Text=NomeMese(M)";
_lmounth.setText(BA.ObjectToCharSequence(_nomemese(_m)));
 //BA.debugLineNum = 466;BA.debugLine="LYear.Text=a";
_lyear.setText(BA.ObjectToCharSequence(_a));
 //BA.debugLineNum = 467;BA.debugLine="LDay.Text=d";
_lday.setText(BA.ObjectToCharSequence(_d));
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return "";
}
public String  _nexty_click() throws Exception{
int _d = 0;
int _m = 0;
int _a = 0;
 //BA.debugLineNum = 489;BA.debugLine="Private Sub Nexty_Click";
 //BA.debugLineNum = 490;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
 //BA.debugLineNum = 492;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(_dateret);
 //BA.debugLineNum = 493;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(_dateret);
 //BA.debugLineNum = 494;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(_dateret);
 //BA.debugLineNum = 496;BA.debugLine="a=a+1";
_a = (int) (_a+1);
 //BA.debugLineNum = 498;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
 //BA.debugLineNum = 499;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
 //BA.debugLineNum = 501;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 502;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
_dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
 //BA.debugLineNum = 503;BA.debugLine="FillCalendar";
_fillcalendar();
 //BA.debugLineNum = 504;BA.debugLine="LYear.Text=a";
_lyear.setText(BA.ObjectToCharSequence(_a));
 //BA.debugLineNum = 505;BA.debugLine="LDay.Text=d";
_lday.setText(BA.ObjectToCharSequence(_d));
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return "";
}
public String  _nomegiorno(int _d) throws Exception{
anywheresoftware.b4a.objects.collections.List _l_it = null;
anywheresoftware.b4a.objects.collections.List _l_en = null;
anywheresoftware.b4a.objects.collections.List _l_es = null;
anywheresoftware.b4a.objects.collections.List _l_fr = null;
anywheresoftware.b4a.objects.collections.List _l_de = null;
anywheresoftware.b4a.objects.collections.List _l_pt = null;
anywheresoftware.b4a.objects.collections.List _l_ru = null;
anywheresoftware.b4a.objects.collections.List _l_ko = null;
String _s = "";
 //BA.debugLineNum = 522;BA.debugLine="private Sub NomeGiorno(D As Int) As String";
 //BA.debugLineNum = 523;BA.debugLine="Dim L_it As List = Array As String (\"D\",\"L\",\"M\",\"";
_l_it = new anywheresoftware.b4a.objects.collections.List();
_l_it = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","L","M","M","G","V","S"});
 //BA.debugLineNum = 524;BA.debugLine="Dim L_en As List = Array As String (\"S\",\"M\",\"T\",\"";
_l_en = new anywheresoftware.b4a.objects.collections.List();
_l_en = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"S","M","T","W","T","F","S"});
 //BA.debugLineNum = 525;BA.debugLine="Dim L_es As List = Array As String (\"D\",\"L\",\"M\",\"";
_l_es = new anywheresoftware.b4a.objects.collections.List();
_l_es = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","L","M","M","J","V","S"});
 //BA.debugLineNum = 526;BA.debugLine="Dim L_fr As List = Array As String (\"D\",\"L\",\"M\",\"";
_l_fr = new anywheresoftware.b4a.objects.collections.List();
_l_fr = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","L","M","M","J","V","S"});
 //BA.debugLineNum = 527;BA.debugLine="Dim L_de As List = Array As String (\"S\",\"M\",\"D\",\"";
_l_de = new anywheresoftware.b4a.objects.collections.List();
_l_de = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"S","M","D","M","D","F","S"});
 //BA.debugLineNum = 528;BA.debugLine="Dim L_pt As List = Array As String (\"D\",\"S\",\"T\",\"";
_l_pt = new anywheresoftware.b4a.objects.collections.List();
_l_pt = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","S","T","Q","Q","S","S"});
 //BA.debugLineNum = 529;BA.debugLine="Dim L_ru As List = Array As String (\"В\",\"П\",\"В\",\"";
_l_ru = new anywheresoftware.b4a.objects.collections.List();
_l_ru = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"В","П","В","С","Ч","П","С"});
 //BA.debugLineNum = 530;BA.debugLine="Dim L_ko As List = Array As String (\"일\",\"월\",\"화\",\"";
_l_ko = new anywheresoftware.b4a.objects.collections.List();
_l_ko = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"일","월","화","수","목","금","토"});
 //BA.debugLineNum = 531;BA.debugLine="Dim S As String";
_s = "";
 //BA.debugLineNum = 533;BA.debugLine="If Lingua.StartsWith(\"it\") Then";
if (_lingua().startsWith("it")) { 
 //BA.debugLineNum = 534;BA.debugLine="S=L_it.Get(d)";
_s = BA.ObjectToString(_l_it.Get(_d));
 }else if(_lingua().startsWith("fr")) { 
 //BA.debugLineNum = 536;BA.debugLine="S=L_fr.Get(d)";
_s = BA.ObjectToString(_l_fr.Get(_d));
 }else if(_lingua().startsWith("ru")) { 
 //BA.debugLineNum = 538;BA.debugLine="S=L_ru.Get(d)";
_s = BA.ObjectToString(_l_ru.Get(_d));
 }else if(_lingua().startsWith("es")) { 
 //BA.debugLineNum = 540;BA.debugLine="S=L_es.Get(d-1)";
_s = BA.ObjectToString(_l_es.Get((int) (_d-1)));
 }else if(_lingua().startsWith("de")) { 
 //BA.debugLineNum = 542;BA.debugLine="S=L_de.Get(d)";
_s = BA.ObjectToString(_l_de.Get(_d));
 }else if(_lingua().startsWith("pt")) { 
 //BA.debugLineNum = 544;BA.debugLine="S=L_pt.Get(d)";
_s = BA.ObjectToString(_l_pt.Get(_d));
 }else if(_lingua().startsWith("ko")) { 
 //BA.debugLineNum = 546;BA.debugLine="S=L_ko.Get(d)";
_s = BA.ObjectToString(_l_ko.Get(_d));
 }else {
 //BA.debugLineNum = 548;BA.debugLine="S=L_en.Get(d)";
_s = BA.ObjectToString(_l_en.Get(_d));
 };
 //BA.debugLineNum = 551;BA.debugLine="Return S";
if (true) return _s;
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return "";
}
public String  _nomemese(int _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _l_it = null;
anywheresoftware.b4a.objects.collections.List _l_en = null;
anywheresoftware.b4a.objects.collections.List _l_fr = null;
anywheresoftware.b4a.objects.collections.List _l_ru = null;
anywheresoftware.b4a.objects.collections.List _l_es = null;
anywheresoftware.b4a.objects.collections.List _l_de = null;
anywheresoftware.b4a.objects.collections.List _l_pt = null;
anywheresoftware.b4a.objects.collections.List _l_ko = null;
String _s = "";
 //BA.debugLineNum = 554;BA.debugLine="private Sub NomeMese(M As Int) As String";
 //BA.debugLineNum = 555;BA.debugLine="Dim L_it As List = Array As String (\"Gennaio\",\"Fe";
_l_it = new anywheresoftware.b4a.objects.collections.List();
_l_it = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"});
 //BA.debugLineNum = 556;BA.debugLine="Dim L_en As List = Array As String (\"January\",\"Fe";
_l_en = new anywheresoftware.b4a.objects.collections.List();
_l_en = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"});
 //BA.debugLineNum = 557;BA.debugLine="Dim L_fr As List = Array As String (\"Janvier\",\"Fé";
_l_fr = new anywheresoftware.b4a.objects.collections.List();
_l_fr = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Janvier","Février","Mars","Avril","mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"});
 //BA.debugLineNum = 558;BA.debugLine="Dim L_ru As List = Array As String (\"Январь\" , \"Ф";
_l_ru = new anywheresoftware.b4a.objects.collections.List();
_l_ru = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"});
 //BA.debugLineNum = 559;BA.debugLine="Dim L_es As List = Array As String (\"Enero\" , \"Fe";
_l_es = new anywheresoftware.b4a.objects.collections.List();
_l_es = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Enero","Febrero","Marcha","abril","puede","Junio​​","Julio","agosto","Septiembre","Octubre","noviembre","diciembre"});
 //BA.debugLineNum = 560;BA.debugLine="Dim L_de As List = Array As String (\"Januar\", \"Fe";
_l_de = new anywheresoftware.b4a.objects.collections.List();
_l_de = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Januar","Februar","März","April","Mai","June","Juli","August","September","October","November","December"});
 //BA.debugLineNum = 561;BA.debugLine="Dim L_pt As List = Array As String (\"Janeiro\" , \"";
_l_pt = new anywheresoftware.b4a.objects.collections.List();
_l_pt = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Janeiro","fevereiro","March","Abril","pode","June","Julho","August","September","Outubro","November","dezembro"});
 //BA.debugLineNum = 562;BA.debugLine="Dim L_ko As List = Array As String (\"1월\",\"2월\",\"3월";
_l_ko = new anywheresoftware.b4a.objects.collections.List();
_l_ko = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"});
 //BA.debugLineNum = 563;BA.debugLine="Dim S As String";
_s = "";
 //BA.debugLineNum = 565;BA.debugLine="If Lingua.StartsWith(\"it\") Then";
if (_lingua().startsWith("it")) { 
 //BA.debugLineNum = 566;BA.debugLine="S=L_it.Get(M-1)";
_s = BA.ObjectToString(_l_it.Get((int) (_m-1)));
 }else if(_lingua().startsWith("fr")) { 
 //BA.debugLineNum = 568;BA.debugLine="S=L_fr.Get(M-1)";
_s = BA.ObjectToString(_l_fr.Get((int) (_m-1)));
 }else if(_lingua().startsWith("ru")) { 
 //BA.debugLineNum = 570;BA.debugLine="S=L_ru.Get(M-1)";
_s = BA.ObjectToString(_l_ru.Get((int) (_m-1)));
 }else if(_lingua().startsWith("es")) { 
 //BA.debugLineNum = 572;BA.debugLine="S=L_es.Get(M-1)";
_s = BA.ObjectToString(_l_es.Get((int) (_m-1)));
 }else if(_lingua().startsWith("de")) { 
 //BA.debugLineNum = 574;BA.debugLine="S=L_de.Get(M-1)";
_s = BA.ObjectToString(_l_de.Get((int) (_m-1)));
 }else if(_lingua().startsWith("pt")) { 
 //BA.debugLineNum = 576;BA.debugLine="S=L_pt.Get(M-1)";
_s = BA.ObjectToString(_l_pt.Get((int) (_m-1)));
 }else if(_lingua().startsWith("ko")) { 
 //BA.debugLineNum = 578;BA.debugLine="S=L_ko.Get(M-1)";
_s = BA.ObjectToString(_l_ko.Get((int) (_m-1)));
 }else {
 //BA.debugLineNum = 580;BA.debugLine="S=L_en.Get(M-1)";
_s = BA.ObjectToString(_l_en.Get((int) (_m-1)));
 };
 //BA.debugLineNum = 583;BA.debugLine="Return S";
if (true) return _s;
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return "";
}
public String  _pan_click() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Private Sub Pan_Click";
 //BA.debugLineNum = 142;BA.debugLine="Ret=0";
_ret = (int) (0);
 //BA.debugLineNum = 143;BA.debugLine="If Show=DialogResponse.POSITIVE Then SetDate(Date";
if (_show()==__c.DialogResponse.POSITIVE) { 
_setdate(_datepicker);};
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _prevm_click() throws Exception{
int _d = 0;
int _m = 0;
int _a = 0;
 //BA.debugLineNum = 422;BA.debugLine="Private Sub PrevM_Click";
 //BA.debugLineNum = 423;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
 //BA.debugLineNum = 425;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(_dateret);
 //BA.debugLineNum = 426;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(_dateret);
 //BA.debugLineNum = 427;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(_dateret);
 //BA.debugLineNum = 429;BA.debugLine="M=M-1";
_m = (int) (_m-1);
 //BA.debugLineNum = 430;BA.debugLine="If M=0 Then";
if (_m==0) { 
 //BA.debugLineNum = 431;BA.debugLine="M=12";
_m = (int) (12);
 //BA.debugLineNum = 432;BA.debugLine="a=a-1";
_a = (int) (_a-1);
 };
 //BA.debugLineNum = 435;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
 //BA.debugLineNum = 436;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
 //BA.debugLineNum = 438;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 439;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
_dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
 //BA.debugLineNum = 440;BA.debugLine="FillCalendar";
_fillcalendar();
 //BA.debugLineNum = 441;BA.debugLine="LMounth.Text=NomeMese(M)";
_lmounth.setText(BA.ObjectToCharSequence(_nomemese(_m)));
 //BA.debugLineNum = 442;BA.debugLine="LYear.Text=a";
_lyear.setText(BA.ObjectToCharSequence(_a));
 //BA.debugLineNum = 443;BA.debugLine="LDay.Text=d";
_lday.setText(BA.ObjectToCharSequence(_d));
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public String  _prevy_click() throws Exception{
int _d = 0;
int _m = 0;
int _a = 0;
 //BA.debugLineNum = 470;BA.debugLine="Private Sub PrevY_Click";
 //BA.debugLineNum = 471;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
 //BA.debugLineNum = 473;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(_dateret);
 //BA.debugLineNum = 474;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(_dateret);
 //BA.debugLineNum = 475;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(_dateret);
 //BA.debugLineNum = 477;BA.debugLine="a=a-1";
_a = (int) (_a-1);
 //BA.debugLineNum = 479;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
 //BA.debugLineNum = 480;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
 //BA.debugLineNum = 482;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 483;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
_dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
 //BA.debugLineNum = 484;BA.debugLine="FillCalendar";
_fillcalendar();
 //BA.debugLineNum = 485;BA.debugLine="LYear.Text=a";
_lyear.setText(BA.ObjectToCharSequence(_a));
 //BA.debugLineNum = 486;BA.debugLine="LDay.Text=d";
_lday.setText(BA.ObjectToCharSequence(_d));
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return "";
}
public String  _setdate(long _date) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _can = null;
int _d = 0;
int _m = 0;
int _y = 0;
 //BA.debugLineNum = 109;BA.debugLine="Public Sub SetDate(Date As Long)";
 //BA.debugLineNum = 110;BA.debugLine="Dim Bm As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 111;BA.debugLine="Dim Can As Canvas";
_can = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 112;BA.debugLine="Dim D,M,Y As Int";
_d = 0;
_m = 0;
_y = 0;
 //BA.debugLineNum = 114;BA.debugLine="D=DateTime.GetDayOfMonth(Date)";
_d = __c.DateTime.GetDayOfMonth(_date);
 //BA.debugLineNum = 115;BA.debugLine="M=DateTime.GetMonth(Date)";
_m = __c.DateTime.GetMonth(_date);
 //BA.debugLineNum = 116;BA.debugLine="Y=DateTime.GetYear(Date)";
_y = __c.DateTime.GetYear(_date);
 //BA.debugLineNum = 117;BA.debugLine="Log(M)";
__c.LogImpl("35177352",BA.NumberToString(_m),0);
 //BA.debugLineNum = 119;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 120;BA.debugLine="DatePicker=DateTime.DateParse(m & \"/\" & d & \"/\" &";
_datepicker = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_y));
 //BA.debugLineNum = 122;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
_bm.InitializeMutable(__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (400)));
 //BA.debugLineNum = 123;BA.debugLine="Can.Initialize2(Bm)";
_can.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
 //BA.debugLineNum = 125;BA.debugLine="If Square Then";
if (_square) { 
 //BA.debugLineNum = 126;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
_bm.InitializeMutable(__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (400)));
 //BA.debugLineNum = 127;BA.debugLine="Can.Initialize2(Bm)";
_can.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
 //BA.debugLineNum = 128;BA.debugLine="Can.DrawColor(Color)";
_can.DrawColor(_color);
 //BA.debugLineNum = 129;BA.debugLine="Can.DrawText(NomeMese(M),210dip,80dip,Typeface.D";
_can.DrawText(ba,_nomemese(_m),(float) (__c.DipToCurrent((int) (210))),(float) (__c.DipToCurrent((int) (80))),__c.Typeface.DEFAULT_BOLD,(float) (60),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 130;BA.debugLine="Can.DrawText(d,200dip,260dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_d),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (260))),__c.Typeface.DEFAULT_BOLD,(float) (180),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 131;BA.debugLine="Can.DrawText(y,200dip,350dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_y),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (350))),__c.Typeface.DEFAULT_BOLD,(float) (60),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 132;BA.debugLine="Pan.SetBackgroundImage(Can.Bitmap)";
_pan.SetBackgroundImageNew((android.graphics.Bitmap)(_can.getBitmap().getObject()));
 }else {
 //BA.debugLineNum = 134;BA.debugLine="Pan.Background=Corner(Color)";
_pan.setBackground((android.graphics.drawable.Drawable)(_corner(_color).getObject()));
 //BA.debugLineNum = 135;BA.debugLine="Can.Initialize(Pan)";
_can.Initialize((android.view.View)(_pan.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="Can.DrawText(d & \"-\" & NomeMese(M).SubString2(0,";
_can.DrawText(ba,BA.NumberToString(_d)+"-"+_nomemese(_m).substring((int) (0),(int) (3))+"-"+BA.NumberToString(_y),(float) (_mbase.getWidth()/(double)2),(float) (_mbase.getHeight()/(double)2+__c.DipToCurrent((int) (5))),__c.Typeface.DEFAULT_BOLD,(float) (_textsize),_textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
int _tit = 0;
 //BA.debugLineNum = 332;BA.debugLine="Private Sub Show As Int";
 //BA.debugLineNum = 333;BA.debugLine="Dim Tit As Int = GetDeviceLayoutValues.Height - 1";
_tit = (int) (__c.GetDeviceLayoutValues(ba).Height-__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 334;BA.debugLine="Pa.Color=Colors.ARGB(200,0,0,0)";
_pa.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 336;BA.debugLine="Cale.Initialize(\"Cale\")";
_cale.Initialize(ba,"Cale");
 //BA.debugLineNum = 337;BA.debugLine="Cale.Color=Colors.White";
_cale.setColor(__c.Colors.White);
 //BA.debugLineNum = 339;BA.debugLine="Testa.Initialize(\"Testa\")";
_testa.Initialize(ba,"Testa");
 //BA.debugLineNum = 340;BA.debugLine="Testa.Color=Color";
_testa.setColor(_color);
 //BA.debugLineNum = 342;BA.debugLine="FillCalendar";
_fillcalendar();
 //BA.debugLineNum = 343;BA.debugLine="FillTesta";
_filltesta();
 //BA.debugLineNum = 345;BA.debugLine="If 100%y>100%x Then";
if (__c.PerYToCurrent((float) (100),ba)>__c.PerXToCurrent((float) (100),ba)) { 
 //BA.debugLineNum = 347;BA.debugLine="Pa.AddView(Testa,50%x-140dip,50%y-265dip,280dip,";
_pa.AddView((android.view.View)(_testa.getObject()),(int) (__c.PerXToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (265))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (250)));
 //BA.debugLineNum = 348;BA.debugLine="Pa.AddView(Cale,50%x-140dip,50%y-15dip,280dip,28";
_pa.AddView((android.view.View)(_cale.getObject()),(int) (__c.PerXToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (15))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (280)));
 //BA.debugLineNum = 349;BA.debugLine="MyAct.AddView(Pa,0dip,0dip,100%x,100%y)";
_myact.AddView((android.view.View)(_pa.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
 //BA.debugLineNum = 352;BA.debugLine="Pa.AddView(Testa,50%x-280dip,50%y-140dip,280dip,";
_pa.AddView((android.view.View)(_testa.getObject()),(int) (__c.PerXToCurrent((float) (50),ba)-__c.DipToCurrent((int) (280))),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (280)));
 //BA.debugLineNum = 353;BA.debugLine="Pa.AddView(Cale,50%x,50%y-140dip,280dip,280dip)";
_pa.AddView((android.view.View)(_cale.getObject()),__c.PerXToCurrent((float) (50),ba),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (280)));
 //BA.debugLineNum = 354;BA.debugLine="MyAct.AddView(Pa,0dip,0dip,100%x,100%y)";
_myact.AddView((android.view.View)(_pa.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
 //BA.debugLineNum = 357;BA.debugLine="Do While Ret=0";
while (_ret==0) {
 //BA.debugLineNum = 358;BA.debugLine="DoEvents 'ignore";
__c.DoEvents();
 //BA.debugLineNum = 359;BA.debugLine="If Pa.Width<>GetDeviceLayoutValues.Width  Then";
if (_pa.getWidth()!=__c.GetDeviceLayoutValues(ba).Width) { 
 //BA.debugLineNum = 360;BA.debugLine="MyAct.Width=GetDeviceLayoutValues.Width";
_myact.setWidth(__c.GetDeviceLayoutValues(ba).Width);
 //BA.debugLineNum = 361;BA.debugLine="MyAct.Height=GetDeviceLayoutValues.Height-Tit";
_myact.setHeight((int) (__c.GetDeviceLayoutValues(ba).Height-_tit));
 //BA.debugLineNum = 362;BA.debugLine="Pa.Width=GetDeviceLayoutValues.Width";
_pa.setWidth(__c.GetDeviceLayoutValues(ba).Width);
 //BA.debugLineNum = 363;BA.debugLine="Pa.Height=GetDeviceLayoutValues.Height-Tit";
_pa.setHeight((int) (__c.GetDeviceLayoutValues(ba).Height-_tit));
 //BA.debugLineNum = 365;BA.debugLine="If Pa.Height>Pa.Width Then";
if (_pa.getHeight()>_pa.getWidth()) { 
 //BA.debugLineNum = 367;BA.debugLine="Testa.Left=Pa.Width/2-140dip";
_testa.setLeft((int) (_pa.getWidth()/(double)2-__c.DipToCurrent((int) (140))));
 //BA.debugLineNum = 368;BA.debugLine="Testa.Top=Pa.Height/2-265dip";
_testa.setTop((int) (_pa.getHeight()/(double)2-__c.DipToCurrent((int) (265))));
 //BA.debugLineNum = 369;BA.debugLine="Testa.Height=250dip";
_testa.setHeight(__c.DipToCurrent((int) (250)));
 //BA.debugLineNum = 370;BA.debugLine="Cale.Left=Pa.Width/2-140dip";
_cale.setLeft((int) (_pa.getWidth()/(double)2-__c.DipToCurrent((int) (140))));
 //BA.debugLineNum = 371;BA.debugLine="Cale.Top=Pa.Height/2-15dip";
_cale.setTop((int) (_pa.getHeight()/(double)2-__c.DipToCurrent((int) (15))));
 }else {
 //BA.debugLineNum = 374;BA.debugLine="Testa.Left=Pa.Width/2-280dip";
_testa.setLeft((int) (_pa.getWidth()/(double)2-__c.DipToCurrent((int) (280))));
 //BA.debugLineNum = 375;BA.debugLine="Testa.Top=Pa.Height/2-140dip";
_testa.setTop((int) (_pa.getHeight()/(double)2-__c.DipToCurrent((int) (140))));
 //BA.debugLineNum = 376;BA.debugLine="Testa.Height=280dip";
_testa.setHeight(__c.DipToCurrent((int) (280)));
 //BA.debugLineNum = 377;BA.debugLine="Cale.Left=Pa.Width/2";
_cale.setLeft((int) (_pa.getWidth()/(double)2));
 //BA.debugLineNum = 378;BA.debugLine="Cale.Top=Pa.Height/2-140dip";
_cale.setTop((int) (_pa.getHeight()/(double)2-__c.DipToCurrent((int) (140))));
 };
 };
 }
;
 //BA.debugLineNum = 383;BA.debugLine="Pa.RemoveView";
_pa.RemoveView();
 //BA.debugLineNum = 384;BA.debugLine="Return Ret";
if (true) return _ret;
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show();
return BA.SubDelegator.SubNotFound;
}
}
