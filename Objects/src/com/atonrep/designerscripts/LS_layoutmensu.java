package com.atonrep.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layoutmensu{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("paneloperatorselection").vw.setLeft((int)((50d / 100 * width)-(views.get("paneloperatorselection").vw.getWidth())/2d));
views.get("paneloperatorselection").vw.setTop((int)((50d / 100 * height)-(views.get("paneloperatorselection").vw.getHeight())/2d));

}
}