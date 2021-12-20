package com.atonrep;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class aspopupmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.atonrep.aspopupmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.atonrep.aspopupmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _mcallback = null;
public String _meventname = "";
public com.atonrep.aspopupmenu._aspm_itemlabelproperties _g_itemlabelproperties = null;
public com.atonrep.aspopupmenu._aspm_titlelabelproperties _g_titlelabelproperties = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public float _item_height = 0f;
public float _max_x = 0f;
public float _max_y = 0f;
public int _max_endlessloop = 0;
public int[] _lefttop_root = null;
public int _autohidems = 0;
public int _closedurationms = 0;
public int _opendurationms = 0;
public String _g_orientationvertical = "";
public String _g_orientationhorizontal = "";
public boolean _g_isinspecialcontainer = false;
public boolean _acthasactionbar = false;
public boolean _hastitle = false;
public boolean _hasdividers = false;
public int _g_item_count = 0;
public int _g_dividerheight = 0;
public boolean _g_dividerenabled = false;
public int _g_dividercolor = 0;
public boolean _g_isopen = false;
public boolean _g_closeafteritemclick = false;
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
public static class _aspm_itemlabelproperties{
public boolean IsInitialized;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public String TextAlignment_Vertical;
public String TextAlignment_Horizontal;
public int BackgroundColor;
public int ItemBackgroundColor;
public float LeftRightPadding;
public void Initialize() {
IsInitialized = true;
TextColor = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextAlignment_Vertical = "";
TextAlignment_Horizontal = "";
BackgroundColor = 0;
ItemBackgroundColor = 0;
LeftRightPadding = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _aspm_titlelabelproperties{
public boolean IsInitialized;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public String TextAlignment_Vertical;
public String TextAlignment_Horizontal;
public int BackgroundColor;
public int ItemBackgroundColor;
public float LeftRightPadding;
public float Height;
public void Initialize() {
IsInitialized = true;
TextColor = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextAlignment_Vertical = "";
TextAlignment_Horizontal = "";
BackgroundColor = 0;
ItemBackgroundColor = 0;
LeftRightPadding = 0f;
Height = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _adddivider() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_divider = null;
 //BA.debugLineNum = 165;BA.debugLine="Private Sub AddDivider";
 //BA.debugLineNum = 167;BA.debugLine="RemoveDividers";
_removedividers();
 //BA.debugLineNum = 169;BA.debugLine="If g_DividerEnabled = True Then";
if (_g_dividerenabled==__c.True) { 
 //BA.debugLineNum = 171;BA.debugLine="For i = 1 To xpnl_background.NumberOfViews -1";
{
final int step3 = 1;
final int limit3 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 172;BA.debugLine="Dim xpnl_divider As B4XView = xui.CreatePanel(\"";
_xpnl_divider = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_divider = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 173;BA.debugLine="xpnl_divider.Tag = \"divider\"";
_xpnl_divider.setTag((Object)("divider"));
 //BA.debugLineNum = 174;BA.debugLine="xpnl_divider.Color = g_DividerColor";
_xpnl_divider.setColor(_g_dividercolor);
 //BA.debugLineNum = 175;BA.debugLine="xpnl_background.AddView(xpnl_divider,0,0,xpnl_b";
_xpnl_background.AddView((android.view.View)(_xpnl_divider.getObject()),(int) (0),(int) (0),_xpnl_background.getWidth(),_g_dividerheight);
 }
};
 //BA.debugLineNum = 177;BA.debugLine="HasDividers = True";
_hasdividers = __c.True;
 };
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _addmenuitem(String _text,Object _tag) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
 //BA.debugLineNum = 119;BA.debugLine="Public Sub AddMenuItem(text As String,tag As Objec";
 //BA.debugLineNum = 121;BA.debugLine="Dim xpnl_item_background As B4XView = xui.CreateP";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xui.CreatePanel(ba,"item");
 //BA.debugLineNum = 122;BA.debugLine="xpnl_item_background.Tag = \"item\"";
_xpnl_item_background.setTag((Object)("item"));
 //BA.debugLineNum = 123;BA.debugLine="xpnl_item_background.Color = g_ItemLabelPropertie";
_xpnl_item_background.setColor(_g_itemlabelproperties.ItemBackgroundColor /*int*/ );
 //BA.debugLineNum = 124;BA.debugLine="Dim xlbl_text As B4XView = CreateLabel(\"\")";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _createlabel("");
 //BA.debugLineNum = 125;BA.debugLine="xlbl_text.Tag = tag";
_xlbl_text.setTag(_tag);
 //BA.debugLineNum = 126;BA.debugLine="xlbl_text.TextColor = g_ItemLabelProperties.TextC";
_xlbl_text.setTextColor(_g_itemlabelproperties.TextColor /*int*/ );
 //BA.debugLineNum = 127;BA.debugLine="xlbl_text.Font = g_ItemLabelProperties.xFont";
_xlbl_text.setFont(_g_itemlabelproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 128;BA.debugLine="xlbl_text.Text = text";
_xlbl_text.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 129;BA.debugLine="xlbl_text.SetTextAlignment(g_ItemLabelProperties.";
_xlbl_text.SetTextAlignment(_g_itemlabelproperties.TextAlignment_Vertical /*String*/ ,_g_itemlabelproperties.TextAlignment_Horizontal /*String*/ );
 //BA.debugLineNum = 130;BA.debugLine="xpnl_item_background.AddView(xlbl_text,0,0,0,0)";
_xpnl_item_background.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 132;BA.debugLine="xpnl_background.AddView(xpnl_item_background,0,0,";
_xpnl_background.AddView((android.view.View)(_xpnl_item_background.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 133;BA.debugLine="g_item_count = g_item_count +1";
_g_item_count = (int) (_g_item_count+1);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _addtitle(String _text,float _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
 //BA.debugLineNum = 136;BA.debugLine="Public Sub AddTitle(Text As String, height As Floa";
 //BA.debugLineNum = 138;BA.debugLine="Dim xpnl_item_background As B4XView = xui.CreateP";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xui.CreatePanel(ba,"item");
 //BA.debugLineNum = 139;BA.debugLine="xpnl_item_background.Tag = \"title\"";
_xpnl_item_background.setTag((Object)("title"));
 //BA.debugLineNum = 140;BA.debugLine="xpnl_item_background.Color = g_TitleLabelProperti";
_xpnl_item_background.setColor(_g_titlelabelproperties.ItemBackgroundColor /*int*/ );
 //BA.debugLineNum = 141;BA.debugLine="Dim xlbl_text As B4XView = CreateLabel(\"\")";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _createlabel("");
 //BA.debugLineNum = 142;BA.debugLine="xlbl_text.TextColor = g_TitleLabelProperties.Text";
_xlbl_text.setTextColor(_g_titlelabelproperties.TextColor /*int*/ );
 //BA.debugLineNum = 143;BA.debugLine="xlbl_text.Font = g_TitleLabelProperties.xFont";
_xlbl_text.setFont(_g_titlelabelproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 144;BA.debugLine="xlbl_text.Text = Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 145;BA.debugLine="xlbl_text.SetTextAlignment(g_TitleLabelProperties";
_xlbl_text.SetTextAlignment(_g_titlelabelproperties.TextAlignment_Vertical /*String*/ ,_g_titlelabelproperties.TextAlignment_Horizontal /*String*/ );
 //BA.debugLineNum = 146;BA.debugLine="xlbl_text.Color = g_TitleLabelProperties.Backgrou";
_xlbl_text.setColor(_g_titlelabelproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 147;BA.debugLine="xpnl_item_background.Color = g_TitleLabelProperti";
_xpnl_item_background.setColor(_g_titlelabelproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 148;BA.debugLine="xpnl_item_background.AddView(xlbl_text,0,0,0,0)";
_xpnl_item_background.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 149;BA.debugLine="g_TitleLabelProperties.Height = height";
_g_titlelabelproperties.Height /*float*/  = _height;
 //BA.debugLineNum = 150;BA.debugLine="xpnl_background.AddView(xpnl_item_background,0,0,";
_xpnl_background.AddView((android.view.View)(_xpnl_item_background.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 151;BA.debugLine="HasTitle = True";
_hastitle = __c.True;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 56;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 57;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
 //BA.debugLineNum = 58;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 60;BA.debugLine="Type ASPM_ItemLabelProperties(TextColor As Int,xF";
;
 //BA.debugLineNum = 61;BA.debugLine="Type ASPM_TitleLabelProperties(TextColor As Int,x";
;
 //BA.debugLineNum = 62;BA.debugLine="Private g_ItemLabelProperties As ASPM_ItemLabelPr";
_g_itemlabelproperties = new com.atonrep.aspopupmenu._aspm_itemlabelproperties();
 //BA.debugLineNum = 63;BA.debugLine="Private g_TitleLabelProperties As ASPM_TitleLabel";
_g_titlelabelproperties = new com.atonrep.aspopupmenu._aspm_titlelabelproperties();
 //BA.debugLineNum = 65;BA.debugLine="Private xpnl_background As B4XView";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private item_height As Float = 40dip";
_item_height = (float) (__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 69;BA.debugLine="Private max_x,max_y As Float";
_max_x = 0f;
_max_y = 0f;
 //BA.debugLineNum = 70;BA.debugLine="Private max_endlessloop As Int = 0";
_max_endlessloop = (int) (0);
 //BA.debugLineNum = 72;BA.debugLine="Private LeftTop_Root() As Int";
_lefttop_root = new int[(int) (0)];
;
 //BA.debugLineNum = 74;BA.debugLine="Public AutoHideMs As Int";
_autohidems = 0;
 //BA.debugLineNum = 75;BA.debugLine="Public CloseDurationMs As Int = 500";
_closedurationms = (int) (500);
 //BA.debugLineNum = 76;BA.debugLine="Public OpenDurationMs As Int = 250";
_opendurationms = (int) (250);
 //BA.debugLineNum = 78;BA.debugLine="Private g_OrientationVertical As String";
_g_orientationvertical = "";
 //BA.debugLineNum = 79;BA.debugLine="Private g_OrientationHorizontal As String";
_g_orientationhorizontal = "";
 //BA.debugLineNum = 80;BA.debugLine="Private g_IsInSpecialContainer As Boolean = False";
_g_isinspecialcontainer = __c.False;
 //BA.debugLineNum = 81;BA.debugLine="Private actHasActionBar As Boolean = False";
_acthasactionbar = __c.False;
 //BA.debugLineNum = 82;BA.debugLine="Private HasTitle As Boolean = False";
_hastitle = __c.False;
 //BA.debugLineNum = 83;BA.debugLine="Private HasDividers As Boolean = False";
_hasdividers = __c.False;
 //BA.debugLineNum = 84;BA.debugLine="Private g_item_count As Int = 0";
_g_item_count = (int) (0);
 //BA.debugLineNum = 85;BA.debugLine="Private g_DividerHeight As Int";
_g_dividerheight = 0;
 //BA.debugLineNum = 86;BA.debugLine="Private g_DividerEnabled As Boolean = False";
_g_dividerenabled = __c.False;
 //BA.debugLineNum = 87;BA.debugLine="Private g_DividerColor As Int";
_g_dividercolor = 0;
 //BA.debugLineNum = 88;BA.debugLine="Private g_isOpen As Boolean = False";
_g_isopen = __c.False;
 //BA.debugLineNum = 89;BA.debugLine="Private g_CloseAfterItemClick As Boolean = True";
_g_closeafteritemclick = __c.True;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 443;BA.debugLine="xpnl_background.RemoveAllViews";
_xpnl_background.RemoveAllViews();
 //BA.debugLineNum = 444;BA.debugLine="g_item_count = 0";
_g_item_count = (int) (0);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return "";
}
public String  _clickitem(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background) throws Exception{
int _i = 0;
 //BA.debugLineNum = 492;BA.debugLine="Private Sub ClickItem(xpnl_item_background As B4XV";
 //BA.debugLineNum = 494;BA.debugLine="If xpnl_item_background.Tag = \"item\" Then";
if ((_xpnl_item_background.getTag()).equals((Object)("item"))) { 
 //BA.debugLineNum = 495;BA.debugLine="CreateHaloEffect(xpnl_item_background,xui.Color_";
_createhaloeffect(_xpnl_item_background,_xui.Color_ARGB((int) (152),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 497;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step3 = 1;
final int limit3 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 498;BA.debugLine="If xpnl_background.GetView(i) = xpnl_item_backg";
if ((_xpnl_background.GetView(_i)).equals(_xpnl_item_background)) { 
 //BA.debugLineNum = 500;BA.debugLine="If HasTitle Then";
if (_hastitle) { 
 //BA.debugLineNum = 501;BA.debugLine="ItemClicked(i -1,xpnl_item_background.GetView";
_itemclicked((int) (_i-1),_xpnl_item_background.GetView((int) (0)).getTag());
 }else {
 //BA.debugLineNum = 503;BA.debugLine="ItemClicked(i,xpnl_item_background.GetView(0)";
_itemclicked(_i,_xpnl_item_background.GetView((int) (0)).getTag());
 };
 //BA.debugLineNum = 505;BA.debugLine="If g_CloseAfterItemClick = True Then CloseMenu";
if (_g_closeafteritemclick==__c.True) { 
_closemenu();};
 };
 }
};
 };
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return "";
}
public String  _closemenu() throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="Public Sub CloseMenu";
 //BA.debugLineNum = 468;BA.debugLine="xpnl_background.SetVisibleAnimated(CloseDurationM";
_xpnl_background.SetVisibleAnimated(_closedurationms,__c.False);
 //BA.debugLineNum = 469;BA.debugLine="background.RemoveViewFromParent";
_background.RemoveViewFromParent();
 //BA.debugLineNum = 470;BA.debugLine="g_isOpen = False";
_g_isopen = __c.False;
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public com.atonrep.aspopupmenu._aspm_itemlabelproperties  _createaspm_itemlabelproperties(int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,String _textalignment_vertical,String _textalignment_horizontal,int _backgroundcolor,int _itembackgroundcolor,float _leftrightpadding) throws Exception{
com.atonrep.aspopupmenu._aspm_itemlabelproperties _t1 = null;
 //BA.debugLineNum = 650;BA.debugLine="Public Sub CreateASPM_ItemLabelProperties (TextCol";
 //BA.debugLineNum = 651;BA.debugLine="Dim t1 As ASPM_ItemLabelProperties";
_t1 = new com.atonrep.aspopupmenu._aspm_itemlabelproperties();
 //BA.debugLineNum = 652;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 653;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 654;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 655;BA.debugLine="t1.TextAlignment_Vertical = TextAlignment_Vertica";
_t1.TextAlignment_Vertical /*String*/  = _textalignment_vertical;
 //BA.debugLineNum = 656;BA.debugLine="t1.TextAlignment_Horizontal = TextAlignment_Horiz";
_t1.TextAlignment_Horizontal /*String*/  = _textalignment_horizontal;
 //BA.debugLineNum = 657;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 658;BA.debugLine="t1.ItemBackgroundColor = ItemBackgroundColor";
_t1.ItemBackgroundColor /*int*/  = _itembackgroundcolor;
 //BA.debugLineNum = 659;BA.debugLine="t1.LeftRightPadding = LeftRightPadding";
_t1.LeftRightPadding /*float*/  = _leftrightpadding;
 //BA.debugLineNum = 660;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return null;
}
public com.atonrep.aspopupmenu._aspm_titlelabelproperties  _createaspm_titlelabelproperties(int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,String _textalignment_vertical,String _textalignment_horizontal,int _backgroundcolor,int _itembackgroundcolor,float _leftrightpadding,float _height) throws Exception{
com.atonrep.aspopupmenu._aspm_titlelabelproperties _t1 = null;
 //BA.debugLineNum = 663;BA.debugLine="Public Sub CreateASPM_TitleLabelProperties (TextCo";
 //BA.debugLineNum = 664;BA.debugLine="Dim t1 As ASPM_TitleLabelProperties";
_t1 = new com.atonrep.aspopupmenu._aspm_titlelabelproperties();
 //BA.debugLineNum = 665;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 666;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 667;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 668;BA.debugLine="t1.TextAlignment_Vertical = TextAlignment_Vertica";
_t1.TextAlignment_Vertical /*String*/  = _textalignment_vertical;
 //BA.debugLineNum = 669;BA.debugLine="t1.TextAlignment_Horizontal = TextAlignment_Horiz";
_t1.TextAlignment_Horizontal /*String*/  = _textalignment_horizontal;
 //BA.debugLineNum = 670;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 671;BA.debugLine="t1.ItemBackgroundColor = ItemBackgroundColor";
_t1.ItemBackgroundColor /*int*/  = _itembackgroundcolor;
 //BA.debugLineNum = 672;BA.debugLine="t1.LeftRightPadding = LeftRightPadding";
_t1.LeftRightPadding /*float*/  = _leftrightpadding;
 //BA.debugLineNum = 673;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 674;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return null;
}
public String  _createhaloeffect(anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _clr) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _radius = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 587;BA.debugLine="Private Sub CreateHaloEffect (Parent As B4XView,cl";
 //BA.debugLineNum = 588;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 589;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 590;BA.debugLine="Dim radius As Int = 150dip";
_radius = __c.DipToCurrent((int) (150));
 //BA.debugLineNum = 591;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, radius * 2, radius *";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_radius*2),(int) (_radius*2));
 //BA.debugLineNum = 592;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
 //BA.debugLineNum = 593;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Target";
_cvs.DrawCircle(_cvs.getTargetRect().getCenterX(),_cvs.getTargetRect().getCenterY(),(float) (_cvs.getTargetRect().getWidth()/(double)2),_clr,__c.True,(float) (0));
 //BA.debugLineNum = 594;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _cvs.CreateBitmap();
 //BA.debugLineNum = 596;BA.debugLine="CreateHaloEffectHelper(Parent,bmp, radius)";
_createhaloeffecthelper(_parent,_bmp,_radius);
 //BA.debugLineNum = 598;BA.debugLine="End Sub";
return "";
}
public void  _createhaloeffecthelper(anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _radius) throws Exception{
ResumableSub_CreateHaloEffectHelper rsub = new ResumableSub_CreateHaloEffectHelper(this,_parent,_bmp,_radius);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateHaloEffectHelper extends BA.ResumableSub {
public ResumableSub_CreateHaloEffectHelper(com.atonrep.aspopupmenu parent,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _radius) {
this.parent = parent;
this._parent = _parent;
this._bmp = _bmp;
this._radius = _radius;
}
com.atonrep.aspopupmenu parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp;
int _radius;
float _x = 0f;
float _y = 0f;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _duration = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 601;BA.debugLine="Dim x As Float = Parent.Width/2";
_x = (float) (_parent.getWidth()/(double)2);
 //BA.debugLineNum = 602;BA.debugLine="Dim y As Float = Parent.Height/2";
_y = (float) (_parent.getHeight()/(double)2);
 //BA.debugLineNum = 603;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 604;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 605;BA.debugLine="Dim p As B4XView = iv";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 606;BA.debugLine="p.SetBitmap(bmp)";
_p.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 607;BA.debugLine="Parent.AddView(p, x, y, 0, 0)";
_parent.AddView((android.view.View)(_p.getObject()),(int) (_x),(int) (_y),(int) (0),(int) (0));
 //BA.debugLineNum = 608;BA.debugLine="Dim duration As Int = 500";
_duration = (int) (500);
 //BA.debugLineNum = 609;BA.debugLine="p.SetLayoutAnimated(duration, x - radius, y - rad";
_p.SetLayoutAnimated(_duration,(int) (_x-_radius),(int) (_y-_radius),(int) (2*_radius),(int) (2*_radius));
 //BA.debugLineNum = 610;BA.debugLine="p.SetVisibleAnimated(duration, False)";
_p.SetVisibleAnimated(_duration,parent.__c.False);
 //BA.debugLineNum = 611;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,this,_duration);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 612;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _eventname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
 //BA.debugLineNum = 473;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
 //BA.debugLineNum = 474;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 475;BA.debugLine="tmp_lbl.Initialize(EventName)";
_tmp_lbl.Initialize(ba,_eventname);
 //BA.debugLineNum = 479;BA.debugLine="Return tmp_lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Public Sub getBase As B4XView";
 //BA.debugLineNum = 459;BA.debugLine="Return xpnl_background";
if (true) return _xpnl_background;
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return null;
}
public boolean  _getisopen() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Public Sub getisOpen As Boolean";
 //BA.debugLineNum = 202;BA.debugLine="Return g_isOpen";
if (true) return _g_isopen;
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return false;
}
public com.atonrep.aspopupmenu._aspm_itemlabelproperties  _getitemlabelproperties() throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Public Sub getItemLabelProperties As ASPM_ItemLabe";
 //BA.debugLineNum = 450;BA.debugLine="Return g_ItemLabelProperties";
if (true) return _g_itemlabelproperties;
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getmenuitemat_background(int _index) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Public Sub GetMenuItemAt_Background(index As Int)";
 //BA.debugLineNum = 423;BA.debugLine="If HasTitle Then";
if (_hastitle) { 
 //BA.debugLineNum = 424;BA.debugLine="Return xpnl_background.GetView(index +1)";
if (true) return _xpnl_background.GetView((int) (_index+1));
 }else {
 //BA.debugLineNum = 426;BA.debugLine="Return xpnl_background.GetView(index)";
if (true) return _xpnl_background.GetView(_index);
 };
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getmenuitemat_label(int _index) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Public Sub GetMenuItemAt_Label(index As Int) As B4";
 //BA.debugLineNum = 431;BA.debugLine="If HasTitle Then";
if (_hastitle) { 
 //BA.debugLineNum = 432;BA.debugLine="Return xpnl_background.GetView(index +1).GetView";
if (true) return _xpnl_background.GetView((int) (_index+1)).GetView((int) (0));
 }else {
 //BA.debugLineNum = 434;BA.debugLine="Return xpnl_background.GetView(index).GetView(0)";
if (true) return _xpnl_background.GetView(_index).GetView((int) (0));
 };
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public String  _getorientationhorizontal_left() throws Exception{
 //BA.debugLineNum = 553;BA.debugLine="Public Sub getOrientationHorizontal_LEFT As String";
 //BA.debugLineNum = 554;BA.debugLine="Return \"LEFT\"";
if (true) return "LEFT";
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return "";
}
public String  _getorientationhorizontal_middle() throws Exception{
 //BA.debugLineNum = 557;BA.debugLine="Public Sub getOrientationHorizontal_MIDDLE As Stri";
 //BA.debugLineNum = 558;BA.debugLine="Return \"MIDDLE\"";
if (true) return "MIDDLE";
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return "";
}
public String  _getorientationhorizontal_right() throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Public Sub getOrientationHorizontal_RIGHT As Strin";
 //BA.debugLineNum = 562;BA.debugLine="Return \"RIGHT\"";
if (true) return "RIGHT";
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return "";
}
public String  _getorientationvertical_bottom() throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Public Sub getOrientationVertical_BOTTOM As String";
 //BA.debugLineNum = 550;BA.debugLine="Return \"BOTTOM\"";
if (true) return "BOTTOM";
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return "";
}
public String  _getorientationvertical_top() throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Public Sub getOrientationVertical_TOP As String";
 //BA.debugLineNum = 546;BA.debugLine="Return \"TOP\"";
if (true) return "TOP";
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return "";
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 439;BA.debugLine="Return xpnl_background.NumberOfViews";
if (true) return _xpnl_background.getNumberOfViews();
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return 0;
}
public com.atonrep.aspopupmenu._aspm_titlelabelproperties  _gettitlelabelproperties() throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Public Sub getTitleLabelProperties As ASPM_TitleLa";
 //BA.debugLineNum = 455;BA.debugLine="Return g_TitleLabelProperties";
if (true) return _g_titlelabelproperties;
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public String  _gettopleft(float _top,float _left,float _width,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Private Sub GetTopLeft(top As Float,left As Float,";
 //BA.debugLineNum = 281;BA.debugLine="If top < 0 Then";
if (_top<0) { 
 //BA.debugLineNum = 282;BA.debugLine="top = view.Top + view.Height";
_top = (float) (_view.getTop()+_view.getHeight());
 }else if((_top+_xpnl_background.getHeight())>_max_y) { 
 //BA.debugLineNum = 284;BA.debugLine="top = view.Top - xpnl_background.Height";
_top = (float) (_view.getTop()-_xpnl_background.getHeight());
 }else if(_left<0) { 
 //BA.debugLineNum = 286;BA.debugLine="left = 0";
_left = (float) (0);
 }else if((_left+_width)>_max_x) { 
 //BA.debugLineNum = 288;BA.debugLine="left = max_x - width";
_left = (float) (_max_x-_width);
 }else {
 //BA.debugLineNum = 290;BA.debugLine="CallSubDelayed3(Me,\"lol\",left,top)";
__c.CallSubDelayed3(ba,this,"lol",(Object)(_left),(Object)(_top));
 //BA.debugLineNum = 291;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 293;BA.debugLine="If max_endlessloop = 10 Then";
if (_max_endlessloop==10) { 
 //BA.debugLineNum = 294;BA.debugLine="CallSubDelayed3(Me,\"lol\",left,top)";
__c.CallSubDelayed3(ba,this,"lol",(Object)(_left),(Object)(_top));
 //BA.debugLineNum = 295;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 297;BA.debugLine="max_endlessloop = max_endlessloop +1";
_max_endlessloop = (int) (_max_endlessloop+1);
 //BA.debugLineNum = 298;BA.debugLine="GetTopLeft(top,left,width,view)";
_gettopleft(_top,_left,_width,_view);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public Object  _iif2(boolean _c,Object _trueres,Object _falseres) throws Exception{
 //BA.debugLineNum = 677;BA.debugLine="Private Sub IIF2(c As Boolean, TrueRes As Object,";
 //BA.debugLineNum = 678;BA.debugLine="If c Then Return TrueRes Else Return FalseRes";
if (_c) { 
if (true) return _trueres;}
else {
if (true) return _falseres;};
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 93;BA.debugLine="Public Sub Initialize(Parent As B4XView,CallBack A";
 //BA.debugLineNum = 94;BA.debugLine="mCallBack = CallBack";
_mcallback = _callback;
 //BA.debugLineNum = 95;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 97;BA.debugLine="g_OrientationVertical = getOrientationVertical_TO";
_g_orientationvertical = _getorientationvertical_top();
 //BA.debugLineNum = 98;BA.debugLine="g_OrientationHorizontal = getOrientationHorizonta";
_g_orientationhorizontal = _getorientationhorizontal_middle();
 //BA.debugLineNum = 100;BA.debugLine="max_x = Parent.Width";
_max_x = (float) (_parent.getWidth());
 //BA.debugLineNum = 101;BA.debugLine="max_y = Parent.Height";
_max_y = (float) (_parent.getHeight());
 //BA.debugLineNum = 102;BA.debugLine="LeftTop_Root = ViewScreenPosition(Parent)";
_lefttop_root = _viewscreenposition(_parent);
 //BA.debugLineNum = 104;BA.debugLine="xpnl_background = xui.CreatePanel(\"\")";
_xpnl_background = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 105;BA.debugLine="xpnl_background.Color = xui.Color_Transparent";
_xpnl_background.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 106;BA.debugLine="Parent.AddView(xpnl_background,0,0,0,0)";
_parent.AddView((android.view.View)(_xpnl_background.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 107;BA.debugLine="xpnl_background.Visible = False";
_xpnl_background.setVisible(__c.False);
 //BA.debugLineNum = 109;BA.debugLine="g_ItemLabelProperties = CreateASPM_ItemLabelPrope";
_g_itemlabelproperties = _createaspm_itemlabelproperties(_xui.Color_White,_xui.CreateDefaultFont((float) (16)),"CENTER","CENTER",_xui.Color_ARGB((int) (152),(int) (255),(int) (255),(int) (255)),_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),(float) (__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 110;BA.debugLine="g_TitleLabelProperties = CreateASPM_TitleLabelPro";
_g_titlelabelproperties = _createaspm_titlelabelproperties(_xui.Color_White,_xui.CreateDefaultBoldFont((float) (18)),"CENTER","CENTER",_xui.Color_ARGB((int) (152),(int) (255),(int) (255),(int) (255)),_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (60))));
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _item_click() throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Private Sub item_Click";
 //BA.debugLineNum = 488;BA.debugLine="ClickItem(Sender)";
_clickitem((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return "";
}
public String  _itemclicked(int _index,Object _tag) throws Exception{
 //BA.debugLineNum = 644;BA.debugLine="Private Sub ItemClicked(index As Int,tag As Object";
 //BA.debugLineNum = 645;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ItemClicked",(int) (2))) { 
 //BA.debugLineNum = 646;BA.debugLine="CallSub3(mCallBack,mEventName & \"_ItemClicked\",i";
__c.CallSubNew3(ba,_mcallback,_meventname+"_ItemClicked",(Object)(_index),_tag);
 };
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return "";
}
public void  _openmenu(anywheresoftware.b4a.objects.B4XViewWrapper _view,float _width) throws Exception{
ResumableSub_OpenMenu rsub = new ResumableSub_OpenMenu(this,_view,_width);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenMenu extends BA.ResumableSub {
public ResumableSub_OpenMenu(com.atonrep.aspopupmenu parent,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _width) {
this.parent = parent;
this._view = _view;
this._width = _width;
}
com.atonrep.aspopupmenu parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
float _width;
float _total_height = 0f;
int _i = 0;
int[] _ff = null;
float _top = 0f;
float _left = 0f;
anywheresoftware.b4j.object.JavaObject _j = null;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 303;BA.debugLine="If g_isOpen = False Then";
if (true) break;

case 1:
//if
this.state = 33;
if (parent._g_isopen==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 304;BA.debugLine="g_isOpen = True";
parent._g_isopen = parent.__c.True;
 //BA.debugLineNum = 305;BA.debugLine="AddDivider";
parent._adddivider();
 //BA.debugLineNum = 306;BA.debugLine="UpdateViews(width)";
parent._updateviews(_width);
 //BA.debugLineNum = 308;BA.debugLine="Dim total_height As Float = 0";
_total_height = (float) (0);
 //BA.debugLineNum = 309;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = (int) (parent._xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 35;
 //BA.debugLineNum = 310;BA.debugLine="total_height = total_height + xpnl_background.G";
_total_height = (float) (_total_height+parent._xpnl_background.GetView(_i).getHeight());
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 315;BA.debugLine="xpnl_background.SetLayoutAnimated(0,0,view.Top -";
parent._xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (_view.getTop()-parent.__c.DipToCurrent((int) (50))),(int) (_width),(int) (_total_height));
 //BA.debugLineNum = 317;BA.debugLine="Dim ff() As Int = ViewScreenPosition(view)";
_ff = parent._viewscreenposition(_view);
 //BA.debugLineNum = 319;BA.debugLine="If g_IsInSpecialContainer = True Then";
if (true) break;

case 8:
//if
this.state = 13;
if (parent._g_isinspecialcontainer==parent.__c.True) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 320;BA.debugLine="Dim top As Float = ff(1) - LeftTop_Root(1)'+ vi";
_top = (float) (_ff[(int) (1)]-parent._lefttop_root[(int) (1)]);
 //BA.debugLineNum = 321;BA.debugLine="Dim left As Float = ff(0) - LeftTop_Root(0)'+ v";
_left = (float) (_ff[(int) (0)]-parent._lefttop_root[(int) (0)]);
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 323;BA.debugLine="Dim top As Float = view.top";
_top = (float) (_view.getTop());
 //BA.debugLineNum = 324;BA.debugLine="Dim left As Float = view.Left";
_left = (float) (_view.getLeft());
 if (true) break;
;
 //BA.debugLineNum = 326;BA.debugLine="If actHasActionBar = True And g_IsInSpecialConta";

case 13:
//if
this.state = 16;
if (parent._acthasactionbar==parent.__c.True && parent._g_isinspecialcontainer==parent.__c.True) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 328;BA.debugLine="Dim j As JavaObject : j.InitializeContext";
_j = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 328;BA.debugLine="Dim j As JavaObject : j.InitializeContext";
_j.InitializeContext(ba);
 //BA.debugLineNum = 329;BA.debugLine="top = top - j.RunMethodJO(\"getActionBar\",Null).";
_top = (float) (_top-(double)(BA.ObjectToNumber(_j.RunMethodJO("getActionBar",(Object[])(parent.__c.Null)).RunMethod("getHeight",(Object[])(parent.__c.Null)))));
 if (true) break;
;
 //BA.debugLineNum = 338;BA.debugLine="If g_OrientationVertical = getOrientationVertica";

case 16:
//if
this.state = 21;
if ((parent._g_orientationvertical).equals(parent._getorientationvertical_top())) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 339;BA.debugLine="top = top '- xpnl_background.Height";
_top = _top;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 341;BA.debugLine="top = top + view.Height";
_top = (float) (_top+_view.getHeight());
 if (true) break;
;
 //BA.debugLineNum = 344;BA.debugLine="If g_OrientationHorizontal = getOrientationHoriz";

case 21:
//if
this.state = 28;
if ((parent._g_orientationhorizontal).equals(parent._getorientationhorizontal_left())) { 
this.state = 23;
}else if((parent._g_orientationhorizontal).equals(parent._getorientationhorizontal_middle())) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 23:
//C
this.state = 28;
 if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 347;BA.debugLine="left = left + view.Width/2 - width/2";
_left = (float) (_left+_view.getWidth()/(double)2-_width/(double)2);
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 349;BA.debugLine="left = left + view.Width - width";
_left = (float) (_left+_view.getWidth()-_width);
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 352;BA.debugLine="max_endlessloop = 0";
parent._max_endlessloop = (int) (0);
 //BA.debugLineNum = 353;BA.debugLine="GetTopLeft(top,left,width,view)";
parent._gettopleft(_top,_left,_width,_view);
 //BA.debugLineNum = 354;BA.debugLine="Wait For lol (left As Float,top As Float)";
parent.__c.WaitFor("lol", ba, this, null);
this.state = 36;
return;
case 36:
//C
this.state = 29;
_left = (Float) result[0];
_top = (Float) result[1];
;
 //BA.debugLineNum = 356;BA.debugLine="xpnl_background.Left = left";
parent._xpnl_background.setLeft((int) (_left));
 //BA.debugLineNum = 357;BA.debugLine="xpnl_background.Top = top";
parent._xpnl_background.setTop((int) (_top));
 //BA.debugLineNum = 359;BA.debugLine="background = xui.CreatePanel(\"xpnl_touch\")";
parent._background = parent._xui.CreatePanel(ba,"xpnl_touch");
 //BA.debugLineNum = 360;BA.debugLine="background.SetColorAnimated(OpenDurationMs,xui.C";
parent._background.SetColorAnimated(parent._opendurationms,parent._xui.Color_Transparent,parent._g_itemlabelproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 362;BA.debugLine="xpnl_background.Parent.AddView(background,0,0,xp";
parent._xpnl_background.getParent().AddView((android.view.View)(parent._background.getObject()),(int) (0),(int) (0),parent._xpnl_background.getParent().getWidth(),parent._xpnl_background.getParent().getHeight());
 //BA.debugLineNum = 363;BA.debugLine="xpnl_background.BringToFront";
parent._xpnl_background.BringToFront();
 //BA.debugLineNum = 364;BA.debugLine="xpnl_background.SetVisibleAnimated(OpenDurationM";
parent._xpnl_background.SetVisibleAnimated(parent._opendurationms,parent.__c.True);
 //BA.debugLineNum = 369;BA.debugLine="If AutoHideMs > 0 Then";
if (true) break;

case 29:
//if
this.state = 32;
if (parent._autohidems>0) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 370;BA.debugLine="Sleep(AutoHideMs)";
parent.__c.Sleep(ba,this,parent._autohidems);
this.state = 37;
return;
case 37:
//C
this.state = 32;
;
 //BA.debugLineNum = 371;BA.debugLine="CloseMenu";
parent._closemenu();
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lol(float _left,float _top) throws Exception{
}
public void  _openmenu2(anywheresoftware.b4a.objects.B4XViewWrapper _parent,float _width) throws Exception{
ResumableSub_OpenMenu2 rsub = new ResumableSub_OpenMenu2(this,_parent,_width);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenMenu2 extends BA.ResumableSub {
public ResumableSub_OpenMenu2(com.atonrep.aspopupmenu parent,anywheresoftware.b4a.objects.B4XViewWrapper _parent,float _width) {
this.parent = parent;
this._parent = _parent;
this._width = _width;
}
com.atonrep.aspopupmenu parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
float _width;
float _total_height = 0f;
int _i = 0;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 378;BA.debugLine="If g_isOpen = False Then";
if (true) break;

case 1:
//if
this.state = 12;
if (parent._g_isopen==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 379;BA.debugLine="g_isOpen = True";
parent._g_isopen = parent.__c.True;
 //BA.debugLineNum = 380;BA.debugLine="AddDivider";
parent._adddivider();
 //BA.debugLineNum = 381;BA.debugLine="UpdateViews(width)";
parent._updateviews(_width);
 //BA.debugLineNum = 383;BA.debugLine="Dim total_height As Float = 0";
_total_height = (float) (0);
 //BA.debugLineNum = 384;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = (int) (parent._xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 14:
//C
this.state = 13;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 14;
 //BA.debugLineNum = 385;BA.debugLine="total_height = total_height + xpnl_background.G";
_total_height = (float) (_total_height+parent._xpnl_background.GetView(_i).getHeight());
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 387;BA.debugLine="xpnl_background.SetLayoutAnimated(0,parent.Left";
parent._xpnl_background.SetLayoutAnimated((int) (0),(int) (_parent.getLeft()+_parent.getWidth()/(double)2-_width/(double)2),(int) (_parent.getTop()+_parent.getHeight()/(double)2-_total_height),(int) (_width),(int) (_total_height));
 //BA.debugLineNum = 389;BA.debugLine="background = xui.CreatePanel(\"xpnl_touch\")";
parent._background = parent._xui.CreatePanel(ba,"xpnl_touch");
 //BA.debugLineNum = 390;BA.debugLine="background.SetColorAnimated(OpenDurationMs,xui.C";
parent._background.SetColorAnimated(parent._opendurationms,parent._xui.Color_Transparent,parent._g_itemlabelproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 392;BA.debugLine="xpnl_background.Parent.AddView(background,0,0,xp";
parent._xpnl_background.getParent().AddView((android.view.View)(parent._background.getObject()),(int) (0),(int) (0),parent._xpnl_background.getParent().getWidth(),parent._xpnl_background.getParent().getHeight());
 //BA.debugLineNum = 393;BA.debugLine="xpnl_background.BringToFront";
parent._xpnl_background.BringToFront();
 //BA.debugLineNum = 394;BA.debugLine="xpnl_background.SetVisibleAnimated(OpenDurationM";
parent._xpnl_background.SetVisibleAnimated(parent._opendurationms,parent.__c.True);
 //BA.debugLineNum = 400;BA.debugLine="If AutoHideMs > 0 Then";
if (true) break;

case 8:
//if
this.state = 11;
if (parent._autohidems>0) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 401;BA.debugLine="Sleep(AutoHideMs)";
parent.__c.Sleep(ba,this,parent._autohidems);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 //BA.debugLineNum = 402;BA.debugLine="CloseMenu";
parent._closemenu();
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _removealldividers() throws Exception{
int _i = 0;
 //BA.debugLineNum = 182;BA.debugLine="Private Sub RemoveAllDividers As Boolean";
 //BA.debugLineNum = 183;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 184;BA.debugLine="If xpnl_background.GetView(i).Tag = \"divider\" Th";
if ((_xpnl_background.GetView(_i).getTag()).equals((Object)("divider"))) { 
 //BA.debugLineNum = 185;BA.debugLine="xpnl_background.GetView(i).RemoveViewFromParent";
_xpnl_background.GetView(_i).RemoveViewFromParent();
 //BA.debugLineNum = 186;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }
};
 //BA.debugLineNum = 189;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return false;
}
public String  _removedividers() throws Exception{
boolean _all_removed = false;
 //BA.debugLineNum = 192;BA.debugLine="Private Sub RemoveDividers";
 //BA.debugLineNum = 193;BA.debugLine="Dim all_removed As Boolean = True";
_all_removed = __c.True;
 //BA.debugLineNum = 194;BA.debugLine="Do While all_removed = True";
while (_all_removed==__c.True) {
 //BA.debugLineNum = 195;BA.debugLine="all_removed = RemoveAllDividers";
_all_removed = _removealldividers();
 }
;
 //BA.debugLineNum = 198;BA.debugLine="HasDividers = False";
_hasdividers = __c.False;
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _removetitle() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background = null;
 //BA.debugLineNum = 154;BA.debugLine="Public Sub RemoveTitle";
 //BA.debugLineNum = 155;BA.debugLine="HasTitle = False";
_hastitle = __c.False;
 //BA.debugLineNum = 156;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step2 = 1;
final int limit2 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 157;BA.debugLine="Dim xpnl_item_background As B4XView = xpnl_backg";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 158;BA.debugLine="If xpnl_item_background.Tag = \"title\" Then";
if ((_xpnl_item_background.getTag()).equals((Object)("title"))) { 
 //BA.debugLineNum = 159;BA.debugLine="xpnl_item_background.RemoveViewFromParent";
_xpnl_item_background.RemoveViewFromParent();
 //BA.debugLineNum = 160;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _resize(float _parent_width,float _parent_height) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub Resize(parent_width As Float,parent_hei";
 //BA.debugLineNum = 115;BA.debugLine="max_x = parent_width";
_max_x = _parent_width;
 //BA.debugLineNum = 116;BA.debugLine="max_y = parent_height";
_max_y = _parent_height;
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _setactivityhasactionbar(boolean _value) throws Exception{
 //BA.debugLineNum = 538;BA.debugLine="Public Sub setActivityHasActionBar(value As Boolea";
 //BA.debugLineNum = 539;BA.debugLine="actHasActionBar = value";
_acthasactionbar = _value;
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _radius) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 568;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
 //BA.debugLineNum = 582;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
 //BA.debugLineNum = 583;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _setcloseafteritemclick(boolean _enabled) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Public Sub setCloseAfterItemClick(enabled As Boole";
 //BA.debugLineNum = 207;BA.debugLine="g_CloseAfterItemClick = enabled";
_g_closeafteritemclick = _enabled;
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _setdividercolor(int _color) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub setDividerColor(color As Int)";
 //BA.debugLineNum = 222;BA.debugLine="g_DividerColor = color";
_g_dividercolor = _color;
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public String  _setdividerenabled(boolean _enable) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Public Sub setDividerEnabled(enable As Boolean)";
 //BA.debugLineNum = 211;BA.debugLine="g_DividerEnabled = enable";
_g_dividerenabled = _enable;
 //BA.debugLineNum = 212;BA.debugLine="If enable = False Then";
if (_enable==__c.False) { 
 //BA.debugLineNum = 213;BA.debugLine="RemoveDividers";
_removedividers();
 };
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _setdividerheight(float _height) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Public Sub setDividerHeight(height As Float)";
 //BA.debugLineNum = 218;BA.debugLine="g_DividerHeight = height";
_g_dividerheight = (int) (_height);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _setisinspecialcontainer(boolean _value) throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Public Sub setIsInSpecialContainer(value As Boolea";
 //BA.debugLineNum = 464;BA.debugLine="g_IsInSpecialContainer = value";
_g_isinspecialcontainer = _value;
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public String  _setitembackgroundcolor(int _crl) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background = null;
 //BA.debugLineNum = 514;BA.debugLine="Public Sub setItemBackgroundColor(crl As Int)";
 //BA.debugLineNum = 515;BA.debugLine="g_ItemLabelProperties.ItemBackgroundColor = crl";
_g_itemlabelproperties.ItemBackgroundColor /*int*/  = _crl;
 //BA.debugLineNum = 516;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step2 = 1;
final int limit2 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 517;BA.debugLine="Dim xpnl_item_background As B4XView = xpnl_backgr";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 518;BA.debugLine="xpnl_item_background.Color = crl";
_xpnl_item_background.setColor(_crl);
 }
};
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return "";
}
public String  _setmenucornerradius(int _radius) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Public Sub setMenuCornerRadius(radius As Int)";
 //BA.debugLineNum = 418;BA.debugLine="xpnl_background.SetColorAndBorder(xpnl_background";
_xpnl_background.SetColorAndBorder(_xpnl_background.getColor(),(int) (0),(int) (0),_radius);
 //BA.debugLineNum = 419;BA.debugLine="SetCircleClip(xpnl_background,radius)";
_setcircleclip(_xpnl_background,_radius);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return "";
}
public String  _setorientationhorizontal(String _orientation) throws Exception{
 //BA.debugLineNum = 530;BA.debugLine="Public Sub setOrientationHorizontal(orientation As";
 //BA.debugLineNum = 531;BA.debugLine="If orientation = getOrientationHorizontal_LEFT Or";
if ((_orientation).equals(_getorientationhorizontal_left()) || (_orientation).equals(_getorientationhorizontal_right())) { 
 //BA.debugLineNum = 532;BA.debugLine="g_OrientationHorizontal = orientation";
_g_orientationhorizontal = _orientation;
 }else {
 //BA.debugLineNum = 534;BA.debugLine="g_OrientationHorizontal = getOrientationHorizont";
_g_orientationhorizontal = _getorientationhorizontal_middle();
 };
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return "";
}
public String  _setorientationvertical(String _orientation) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Public Sub setOrientationVertical(orientation As S";
 //BA.debugLineNum = 523;BA.debugLine="If orientation = getOrientationVertical_BOTTOM Th";
if ((_orientation).equals(_getorientationvertical_bottom())) { 
 //BA.debugLineNum = 524;BA.debugLine="g_OrientationVertical = orientation";
_g_orientationvertical = _orientation;
 }else {
 //BA.debugLineNum = 526;BA.debugLine="g_OrientationVertical = getOrientationVertical_T";
_g_orientationvertical = _getorientationvertical_top();
 };
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return "";
}
public String  _updateviews(float _width) throws Exception{
float _tmp_divider_padding = 0f;
float _tmp_item_padding = 0f;
int _tmp_index_padding = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_divider = null;
 //BA.debugLineNum = 225;BA.debugLine="Private Sub UpdateViews(width As Float)";
 //BA.debugLineNum = 227;BA.debugLine="Dim tmp_divider_padding As Float = 0";
_tmp_divider_padding = (float) (0);
 //BA.debugLineNum = 228;BA.debugLine="If g_DividerEnabled Then";
if (_g_dividerenabled) { 
 //BA.debugLineNum = 229;BA.debugLine="tmp_divider_padding = g_DividerHeight";
_tmp_divider_padding = (float) (_g_dividerheight);
 };
 //BA.debugLineNum = 232;BA.debugLine="Dim tmp_item_padding As Float = 0";
_tmp_item_padding = (float) (0);
 //BA.debugLineNum = 233;BA.debugLine="Dim tmp_index_padding As Int = 0";
_tmp_index_padding = (int) (0);
 //BA.debugLineNum = 234;BA.debugLine="If HasTitle Then";
if (_hastitle) { 
 //BA.debugLineNum = 235;BA.debugLine="tmp_item_padding = g_TitleLabelProperties.Height";
_tmp_item_padding = _g_titlelabelproperties.Height /*float*/ ;
 //BA.debugLineNum = 236;BA.debugLine="tmp_index_padding = 1";
_tmp_index_padding = (int) (1);
 };
 //BA.debugLineNum = 239;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step11 = 1;
final int limit11 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 240;BA.debugLine="Dim xpnl_item_background As B4XView = xpnl_backg";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 241;BA.debugLine="If xpnl_item_background.Tag = \"item\" Then";
if ((_xpnl_item_background.getTag()).equals((Object)("item"))) { 
 //BA.debugLineNum = 242;BA.debugLine="Dim xlbl_text As B4XView = xpnl_item_background";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_item_background.GetView((int) (0));
 //BA.debugLineNum = 244;BA.debugLine="xpnl_item_background.SetLayoutAnimated(0,0,tmp_";
_xpnl_item_background.SetLayoutAnimated((int) (0),(int) (0),(int) (_tmp_item_padding+(double)(BA.ObjectToNumber(_iif2(_hastitle==__c.False,(Object)(0),(Object)(_tmp_divider_padding))))+(_i-_tmp_index_padding)*(_item_height+_tmp_divider_padding)),(int) (_width),(int) (_item_height));
 //BA.debugLineNum = 248;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0 + g_ItemLabelPr";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0+_g_itemlabelproperties.LeftRightPadding /*float*/ ),(int) (0),(int) (_xpnl_item_background.getWidth()-(_g_itemlabelproperties.LeftRightPadding /*float*/ *2)),_xpnl_item_background.getHeight());
 }else if((_xpnl_item_background.getTag()).equals((Object)("title"))) { 
 //BA.debugLineNum = 250;BA.debugLine="Dim xlbl_text As B4XView = xpnl_item_background";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _xpnl_item_background.GetView((int) (0));
 //BA.debugLineNum = 251;BA.debugLine="xpnl_item_background.SetLayoutAnimated(0,0,0,wi";
_xpnl_item_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 252;BA.debugLine="xlbl_text.SetLayoutAnimated(0,0 + g_ItemLabelPr";
_xlbl_text.SetLayoutAnimated((int) (0),(int) (0+_g_itemlabelproperties.LeftRightPadding /*float*/ ),(int) (0),(int) (_xpnl_item_background.getWidth()-(_g_itemlabelproperties.LeftRightPadding /*float*/ *2)),_xpnl_item_background.getHeight());
 }else if((_xpnl_item_background.getTag()).equals((Object)("divider"))) { 
 //BA.debugLineNum = 254;BA.debugLine="xpnl_item_background.SetLayoutAnimated(0,0,0,wi";
_xpnl_item_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),_g_dividerheight);
 };
 }
};
 //BA.debugLineNum = 259;BA.debugLine="For i = 0 To xpnl_background.NumberOfViews -1";
{
final int step25 = 1;
final int limit25 = (int) (_xpnl_background.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 261;BA.debugLine="Dim xpnl_item_background As B4XView = xpnl_backg";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xpnl_background.GetView(_i);
 //BA.debugLineNum = 263;BA.debugLine="If (xpnl_item_background.Tag = \"item\" Or xpnl_it";
if (((_xpnl_item_background.getTag()).equals((Object)("item")) || (_xpnl_item_background.getTag()).equals((Object)("title"))) && _hasdividers) { 
 //BA.debugLineNum = 267;BA.debugLine="If (g_item_count + tmp_index_padding + i) <> xp";
if ((_g_item_count+_tmp_index_padding+_i)!=_xpnl_background.getNumberOfViews()) { 
 //BA.debugLineNum = 268;BA.debugLine="Dim xpnl_divider As B4XView = xpnl_background.";
_xpnl_divider = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_divider = _xpnl_background.GetView((int) (_g_item_count+_tmp_index_padding+_i));
 //BA.debugLineNum = 269;BA.debugLine="If xpnl_divider.Tag = \"divider\" Then";
if ((_xpnl_divider.getTag()).equals((Object)("divider"))) { 
 //BA.debugLineNum = 271;BA.debugLine="xpnl_divider.SetLayoutAnimated(0,0,xpnl_item_";
_xpnl_divider.SetLayoutAnimated((int) (0),(int) (0),(int) (_xpnl_item_background.getTop()+_xpnl_item_background.getHeight()),(int) (_width),_g_dividerheight);
 };
 };
 };
 }
};
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public int[]  _viewscreenposition(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
int[] _lefttop = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 615;BA.debugLine="Sub ViewScreenPosition (view As B4XView) As Int()";
 //BA.debugLineNum = 617;BA.debugLine="Dim leftTop(2) As Int";
_lefttop = new int[(int) (2)];
;
 //BA.debugLineNum = 619;BA.debugLine="Dim JO As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
 //BA.debugLineNum = 620;BA.debugLine="JO.RunMethod(\"getLocationOnScreen\", Array As Obje";
_jo.RunMethod("getLocationOnScreen",new Object[]{(Object)(_lefttop)});
 //BA.debugLineNum = 639;BA.debugLine="Return Array As Int(leftTop(0), leftTop(1))";
if (true) return new int[]{_lefttop[(int) (0)],_lefttop[(int) (1)]};
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return null;
}
public String  _xpnl_touch_click() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Private Sub xpnl_touch_Click";
 //BA.debugLineNum = 413;BA.debugLine="CloseMenu";
_closemenu();
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
