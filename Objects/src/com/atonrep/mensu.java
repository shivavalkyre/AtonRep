package com.atonrep;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class mensu extends Activity implements B4AActivity{
	public static mensu mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.atonrep", "com.atonrep.mensu");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mensu).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.atonrep", "com.atonrep.mensu");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.atonrep.mensu", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mensu) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mensu) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return mensu.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (mensu) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mensu) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            mensu mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mensu) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelheadermensu1 = null;
public cm.jahswant.JustifyTextView _justifytextview1 = null;
public cm.jahswant.JustifyTextView _justifytextview11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearchmensu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonnewmensu = null;
public b4a.example3.customlistview _clvmensu = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmensucrud = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamaaton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblkodemensu = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbloperatormensu = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelheadermensu = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.phone.Phone _ph = null;
public static int _dividerheight = 0;
public anywheresoftware.b4a.objects.PanelWrapper _paneloverlay = null;
public b4a.example.dialogs _dialogs = null;
public b4a.example.dateutils _dateutils = null;
public com.atonrep.main _main = null;
public com.atonrep.starter _starter = null;
public com.atonrep.login _login = null;
public com.atonrep.general _general = null;
public com.atonrep.register _register = null;
public com.atonrep.home _home = null;
public com.atonrep.newmensu _newmensu = null;
public com.atonrep.httputils2service _httputils2service = null;
public com.atonrep.xuiviewsutils _xuiviewsutils = null;
public static class _titledata{
public boolean IsInitialized;
public String Title;
public void Initialize() {
IsInitialized = true;
Title = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"LayoutMensu\")";
mostCurrent._activity.LoadLayout("LayoutMensu",mostCurrent.activityBA);
 //BA.debugLineNum = 40;BA.debugLine="ph.SetScreenOrientation(1)";
mostCurrent._ph.SetScreenOrientation(processBA,(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="JustifyTextView11.SetText(\"Menara Suar adalah Sar";
mostCurrent._justifytextview11.SetText("Menara Suar adalah Sarana Bantu Navigasi Pelayaran tetap yang bersuar dan mempunyai jarak tampak sama atau lebih 20 (dua puluh) mil laut yang dapat membantu para navigator dalam menentukan posisi dan atau haluan kapal, menunjukan arah daratan dan adanya pelabuhan serta dapat dipergunakan sebagai tanda batas wilayah negara.",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 42;BA.debugLine="JustifyTextView11.As(Label).TextSize=12";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(mostCurrent._justifytextview11.getObject()))).setTextSize((float) (12));
 //BA.debugLineNum = 43;BA.debugLine="general.SetBackgroundTintList(txtSearchMensu, Col";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtsearchmensu.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 44;BA.debugLine="getMensuData";
_getmensudata();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _buttonnewmensu_click() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Private Sub ButtonNewMensu_Click";
 //BA.debugLineNum = 104;BA.debugLine="PanelOverlay.SetVisibleAnimated(500,True)";
mostCurrent._paneloverlay.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 106;BA.debugLine="PanelOverlay.BringToFront";
mostCurrent._paneloverlay.BringToFront();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _clvmensu_scrollchanged(int _offset) throws Exception{
int _topindex = 0;
 //BA.debugLineNum = 92;BA.debugLine="Private Sub clvMensu_ScrollChanged (Offset As Int)";
 //BA.debugLineNum = 93;BA.debugLine="Dim TopIndex As Int = clvMensu.FindIndexFromOffse";
_topindex = mostCurrent._clvmensu._findindexfromoffset((int) (_offset+mostCurrent._panelheadermensu.getHeight()+_dividerheight*2));
 //BA.debugLineNum = 94;BA.debugLine="Log(TopIndex)";
anywheresoftware.b4a.keywords.Common.LogImpl("36815746",BA.NumberToString(_topindex),0);
 //BA.debugLineNum = 95;BA.debugLine="Log(clvMensu.GetValue(TopIndex))";
anywheresoftware.b4a.keywords.Common.LogImpl("36815747",BA.ObjectToString(mostCurrent._clvmensu._getvalue(_topindex)),0);
 //BA.debugLineNum = 96;BA.debugLine="If TopIndex=0 Then";
if (_topindex==0) { 
 //BA.debugLineNum = 97;BA.debugLine="PanelHeaderMensu1.SetVisibleAnimated(500,True)";
mostCurrent._panelheadermensu1.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 99;BA.debugLine="PanelHeaderMensu1.SetVisibleAnimated(500,False)";
mostCurrent._panelheadermensu1.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createheaderlistitemmensu(int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub CreateHeaderListItemMensu(Width As Int, Height";
 //BA.debugLineNum = 65;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 67;BA.debugLine="p.SetLayout(0, 0, Width, 100dip)";
_p.SetLayout((int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
 //BA.debugLineNum = 68;BA.debugLine="p.LoadLayout(\"layoutisiheadermensu\")";
_p.LoadLayout("layoutisiheadermensu",mostCurrent.activityBA);
 //BA.debugLineNum = 69;BA.debugLine="JustifyTextView1.SetText(\"Menara Suar adalah Sara";
mostCurrent._justifytextview1.SetText("Menara Suar adalah Sarana Bantu Navigasi Pelayaran tetap yang bersuar dan mempunyai jarak tampak sama atau lebih 20 (dua puluh) mil laut yang dapat membantu para navigator dalam menentukan posisi dan atau haluan kapal, menunjukan arah daratan dan adanya pelabuhan serta dapat dipergunakan sebagai tanda batas wilayah negara.",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 70;BA.debugLine="JustifyTextView1.As(Label).TextSize=12";
((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(mostCurrent._justifytextview1.getObject()))).setTextSize((float) (12));
 //BA.debugLineNum = 71;BA.debugLine="p.Visible=False";
_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 76;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitemmensu(int _width,int _height,String _kd_aton,String _nama_aton,String _operator) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 78;BA.debugLine="Sub CreateListItemMensu(Width As Int, Height As In";
 //BA.debugLineNum = 79;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 80;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 81;BA.debugLine="p.SetLayout(0, 0, Width, 180dip)";
_p.SetLayout((int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (180)));
 //BA.debugLineNum = 82;BA.debugLine="p.LoadLayout(\"layoutisiclvMensu\")";
_p.LoadLayout("layoutisiclvMensu",mostCurrent.activityBA);
 //BA.debugLineNum = 83;BA.debugLine="lblNamaAton.Text= nama_aton";
mostCurrent._lblnamaaton.setText(BA.ObjectToCharSequence(_nama_aton));
 //BA.debugLineNum = 84;BA.debugLine="lblKodeMensu.Text= kd_aton";
mostCurrent._lblkodemensu.setText(BA.ObjectToCharSequence(_kd_aton));
 //BA.debugLineNum = 85;BA.debugLine="lblOperatorMensu.Text=  operator";
mostCurrent._lbloperatormensu.setText(BA.ObjectToCharSequence(_operator));
 //BA.debugLineNum = 90;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public static String  _getmensudata() throws Exception{
int _i = 0;
 //BA.debugLineNum = 55;BA.debugLine="Sub getMensuData";
 //BA.debugLineNum = 57;BA.debugLine="clvMensu.Clear";
mostCurrent._clvmensu._clear();
 //BA.debugLineNum = 58;BA.debugLine="clvMensu.Add(CreateHeaderListItemMensu(clvMensu.A";
mostCurrent._clvmensu._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createheaderlistitemmensu(mostCurrent._clvmensu._asview().getWidth(),mostCurrent._clvmensu._asview().getHeight()).getObject())),(Object)(0));
 //BA.debugLineNum = 60;BA.debugLine="For i=1 To 10";
{
final int step3 = 1;
final int limit3 = (int) (10);
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 61;BA.debugLine="clvMensu.Add(CreateListItemMensu(clvMensu.AsView";
mostCurrent._clvmensu._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitemmensu(mostCurrent._clvmensu._asview().getWidth(),mostCurrent._clvmensu._asview().getHeight(),"kd_aton"+BA.NumberToString(_i),"nama_aton"+BA.NumberToString(_i),"operator"+BA.NumberToString(_i)).getObject())),(Object)(_i));
 }
};
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private PanelHeaderMensu1 As Panel";
mostCurrent._panelheadermensu1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private JustifyTextView1 As JustifyTextView";
mostCurrent._justifytextview1 = new cm.jahswant.JustifyTextView();
 //BA.debugLineNum = 17;BA.debugLine="Private JustifyTextView11 As JustifyTextView";
mostCurrent._justifytextview11 = new cm.jahswant.JustifyTextView();
 //BA.debugLineNum = 18;BA.debugLine="Private txtSearchMensu As EditText";
mostCurrent._txtsearchmensu = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ButtonNewMensu As Button'";
mostCurrent._buttonnewmensu = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private clvMensu As CustomListView";
mostCurrent._clvmensu = new b4a.example3.customlistview();
 //BA.debugLineNum = 21;BA.debugLine="Private PanelMensuCRUD As Panel";
mostCurrent._panelmensucrud = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private JustifyTextView1 As JustifyTextView";
mostCurrent._justifytextview1 = new cm.jahswant.JustifyTextView();
 //BA.debugLineNum = 23;BA.debugLine="Private clvMensu As CustomListView";
mostCurrent._clvmensu = new b4a.example3.customlistview();
 //BA.debugLineNum = 24;BA.debugLine="Private lblNamaAton As Label";
mostCurrent._lblnamaaton = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblKodeMensu As Label";
mostCurrent._lblkodemensu = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblOperatorMensu As Label";
mostCurrent._lbloperatormensu = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private PanelHeaderMensu As Panel";
mostCurrent._panelheadermensu = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private XUI As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 31;BA.debugLine="Type TitleData (Title As String)";
;
 //BA.debugLineNum = 32;BA.debugLine="Private ph As Phone";
mostCurrent._ph = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 33;BA.debugLine="Private DividerHeight As Int = 2dip";
_dividerheight = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2));
 //BA.debugLineNum = 34;BA.debugLine="Private PanelOverlay As Panel";
mostCurrent._paneloverlay = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _labelnewatondjpl_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub LabelNewAtonDJPL_Click";
 //BA.debugLineNum = 116;BA.debugLine="PanelOverlay.SetVisibleAnimated(500,False)";
mostCurrent._paneloverlay.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 118;BA.debugLine="PanelOverlay.SendToBack";
mostCurrent._paneloverlay.SendToBack();
 //BA.debugLineNum = 119;BA.debugLine="StartActivity(NewMensu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._newmensu.getObject()));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _labelnewatonnondjpl_click() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Private Sub LabelNewAtonNonDJPL_Click";
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _paneloverlay_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Private Sub PanelOverlay_Touch (Action As Int, X A";
 //BA.debugLineNum = 110;BA.debugLine="PanelOverlay.SetVisibleAnimated(500,False)";
mostCurrent._paneloverlay.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 112;BA.debugLine="PanelOverlay.SendToBack";
mostCurrent._paneloverlay.SendToBack();
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
