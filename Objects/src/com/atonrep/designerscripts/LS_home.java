package com.atonrep.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_home{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Home/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="ImageView1.Top=10dip"[Home/General script]
views.get("imageview1").vw.setTop((int)((10d * scale)));
//BA.debugLineNum = 4;BA.debugLine="ImageView2.Top=ImageView1.Top+ImageView1.Height+10dip"[Home/General script]
views.get("imageview2").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 5;BA.debugLine="ImageView3.Top=ImageView2.Top+ImageView2.Height+10dip"[Home/General script]
views.get("imageview3").vw.setTop((int)((views.get("imageview2").vw.getTop())+(views.get("imageview2").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 6;BA.debugLine="ImageView4.Top=ImageView3.Top+ImageView3.Height+10dip"[Home/General script]
views.get("imageview4").vw.setTop((int)((views.get("imageview3").vw.getTop())+(views.get("imageview3").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 7;BA.debugLine="ImageView5.Top=ImageView4.Top+ImageView4.Height+10dip"[Home/General script]
views.get("imageview5").vw.setTop((int)((views.get("imageview4").vw.getTop())+(views.get("imageview4").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 8;BA.debugLine="ImageView6.Top=ImageView5.Top+ImageView5.Height+10dip"[Home/General script]
views.get("imageview6").vw.setTop((int)((views.get("imageview5").vw.getTop())+(views.get("imageview5").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 9;BA.debugLine="ImageView7.Top=ImageView6.Top+ImageView6.Height+10dip"[Home/General script]
views.get("imageview7").vw.setTop((int)((views.get("imageview6").vw.getTop())+(views.get("imageview6").vw.getHeight())+(10d * scale)));

}
}