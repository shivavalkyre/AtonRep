package com.atonrep.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layouthome{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("circularprogressbar1").vw.setLeft((int)((views.get("label1").vw.getLeft())+(views.get("label1").vw.getWidth())/2d-(views.get("circularprogressbar1").vw.getWidth())/2d));
views.get("circularprogressbar2").vw.setLeft((int)((views.get("label2").vw.getLeft())+(views.get("label2").vw.getWidth())/2d-(views.get("circularprogressbar2").vw.getWidth())/2d));

}
}