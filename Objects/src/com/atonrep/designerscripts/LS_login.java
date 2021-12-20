package com.atonrep.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setTop((int)(0d));
views.get("imageview1").vw.setLeft((int)((50d / 100 * width)-(views.get("imageview1").vw.getWidth())/2d));
views.get("label3").vw.setTop((int)((20d / 100 * height)));
views.get("panel1").vw.setTop((int)((views.get("label3").vw.getTop())+(views.get("label3").vw.getHeight())+(20d * scale)));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(10d * scale)));
views.get("checkbox1").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 11;BA.debugLine="Label1.Top=CheckBox1.Top"[Login/General script]
views.get("label1").vw.setTop((int)((views.get("checkbox1").vw.getTop())));
//BA.debugLineNum = 12;BA.debugLine="Label1.Left=Panel2.Left+Panel2.Width-Label1.Width"[Login/General script]
views.get("label1").vw.setLeft((int)((views.get("panel2").vw.getLeft())+(views.get("panel2").vw.getWidth())-(views.get("label1").vw.getWidth())));
//BA.debugLineNum = 14;BA.debugLine="Button1.Top=CheckBox1.Top+CheckBox1.Height+10dip"[Login/General script]
views.get("button1").vw.setTop((int)((views.get("checkbox1").vw.getTop())+(views.get("checkbox1").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 16;BA.debugLine="Label2.Top=Button1.Top+Button1.Height+10dip"[Login/General script]
views.get("label2").vw.setTop((int)((views.get("button1").vw.getTop())+(views.get("button1").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 17;BA.debugLine="PanelErrorPopup.Top=Label2.Top+Label2.Height"[Login/General script]
views.get("panelerrorpopup").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())));

}
}