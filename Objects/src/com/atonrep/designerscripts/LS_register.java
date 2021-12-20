package com.atonrep.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_register{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setTop((int)(0d));
views.get("imageview1").vw.setLeft((int)((50d / 100 * width)-(views.get("imageview1").vw.getWidth())/2d));
views.get("label3").vw.setTop((int)((20d / 100 * height)));
views.get("panel1").vw.setTop((int)((views.get("label3").vw.getTop())+(views.get("label3").vw.getHeight())+(20d * scale)));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())+(10d * scale)));
views.get("panel3").vw.setTop((int)((views.get("panel2").vw.getTop())+(views.get("panel2").vw.getHeight())+(10d * scale)));
views.get("panel4").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())));
views.get("label1").vw.setTop((int)((views.get("panel3").vw.getTop())+(views.get("panel3").vw.getHeight())));
views.get("button1").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(10d * scale)));
views.get("button2").vw.setTop((int)((views.get("button1").vw.getTop())));

}
}