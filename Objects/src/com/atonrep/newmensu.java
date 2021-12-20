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

public class newmensu extends Activity implements B4AActivity{
	public static newmensu mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.atonrep", "com.atonrep.newmensu");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (newmensu).");
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
		activityBA = new BA(this, layout, processBA, "com.atonrep", "com.atonrep.newmensu");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.atonrep.newmensu", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (newmensu) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (newmensu) Resume **");
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
		return newmensu.class;
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
            BA.LogInfo("** Activity (newmensu) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (newmensu) Pause event (activity is not paused). **");
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
            newmensu mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (newmensu) Resume **");
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
public static anywheresoftware.b4a.phone.Phone _ph = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelbackmensu = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewnewmensu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttahunpenetapan = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelicontahunpenetapan = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnamamensu = null;
public com.atonrep.b4xdatetemplate _datetemplate = null;
public com.atonrep.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public com.atonrep.b4xcombobox _b4xcomboboxlahan = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnodsi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnoba = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonnewmensuselanjutnya = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelnewmensu1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelnewmensu2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonnewmensusebelumnya = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonnewmensusimpan = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelnewmensudjpl1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelnewmensudjpl2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtelevasimensudjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttinggimensudjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttinggifokusmensudjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtjaraktampakdjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsektorgelapdjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsektorterangdjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtkarakeristikcerlangdjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtperiodecerlangdjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttandasiangdjpl = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerkodemorsedjpl = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerkarakerbunyidjpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmmsidjpl = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel20 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel21 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel22 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel23 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel24 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel25 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdegree1djpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtminute1djpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsecond1djpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdegree2djpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtminute2djpl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsecond2djpl = null;
public b4a.example.dialogs _dialogs = null;
public b4a.example.dateutils _dateutils = null;
public com.atonrep.main _main = null;
public com.atonrep.starter _starter = null;
public com.atonrep.login _login = null;
public com.atonrep.general _general = null;
public com.atonrep.register _register = null;
public com.atonrep.home _home = null;
public com.atonrep.mensu _mensu = null;
public com.atonrep.httputils2service _httputils2service = null;
public com.atonrep.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 65;BA.debugLine="Activity.LoadLayout(\"LayoutNewMensu\")";
mostCurrent._activity.LoadLayout("LayoutNewMensu",mostCurrent.activityBA);
 //BA.debugLineNum = 66;BA.debugLine="ph.SetScreenOrientation(1)";
_ph.SetScreenOrientation(processBA,(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="ScrollViewNewMensu.Panel.LoadLayout(\"LayoutisiNew";
mostCurrent._scrollviewnewmensu.getPanel().LoadLayout("LayoutisiNewMensu",mostCurrent.activityBA);
 //BA.debugLineNum = 68;BA.debugLine="general.SetBackgroundTintList(txtNamaMensu,Colors";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtnamamensu.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 69;BA.debugLine="general.SetBackgroundTintList(txtTahunPenetapan,C";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txttahunpenetapan.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 70;BA.debugLine="general.SetBackgroundTintList(txtNoDSI,Colors.Whi";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtnodsi.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 71;BA.debugLine="general.SetBackgroundTintList(txtNoBA,Colors.Whit";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtnoba.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 72;BA.debugLine="general.SetBackgroundTintList(txtElevasiMensuDJPL";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtelevasimensudjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 73;BA.debugLine="general.SetBackgroundTintList(txtTinggiFokusMensu";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txttinggifokusmensudjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 74;BA.debugLine="general.SetBackgroundTintList(txtJarakTampakDJPL,";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtjaraktampakdjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 75;BA.debugLine="general.SetBackgroundTintList(txtSektorGelapDJPL,";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtsektorgelapdjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 76;BA.debugLine="general.SetBackgroundTintList(txtSektorTerangDJPL";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtsektorterangdjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 77;BA.debugLine="general.SetBackgroundTintList(txtkarakeristikCerl";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtkarakeristikcerlangdjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 78;BA.debugLine="general.SetBackgroundTintList(txtPeriodeCerlangDJ";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtperiodecerlangdjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 79;BA.debugLine="general.SetBackgroundTintList(txtTandaSiangDJPL,C";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txttandasiangdjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 80;BA.debugLine="general.SetBackgroundTintList(txtmmsiDJPL,Colors.";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtmmsidjpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 81;BA.debugLine="general.SetBackgroundTintList(txtdegree1DJPL,Colo";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtdegree1djpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 82;BA.debugLine="general.SetBackgroundTintList(txtminute1DJPL,Colo";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtminute1djpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 83;BA.debugLine="general.SetBackgroundTintList(txtsecond1DJPL,Colo";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtsecond1djpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 84;BA.debugLine="general.SetBackgroundTintList(txtdegree2DJPL,Colo";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtdegree2djpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 85;BA.debugLine="general.SetBackgroundTintList(txtminute2DJPL,Colo";
mostCurrent._general._setbackgroundtintlist /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._txtminute2djpl.getObject())),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 87;BA.debugLine="DateTemplate.Initialize";
mostCurrent._datetemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 88;BA.debugLine="DateTemplate.Date = DateTime.Now";
mostCurrent._datetemplate._setdate /*long*/ (anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 89;BA.debugLine="UpdateLabel";
_updatelabel();
 //BA.debugLineNum = 90;BA.debugLine="Dialog.Initialize(Activity)";
mostCurrent._dialog._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
 //BA.debugLineNum = 91;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 92;BA.debugLine="Dialog.Title = cs.Initialize.Size(24).Append(\"Sel";
mostCurrent._dialog._title /*Object*/  = (Object)(_cs.Initialize().Size((int) (24)).Append(BA.ObjectToCharSequence("Select Date")).PopAll().getObject());
 //BA.debugLineNum = 93;BA.debugLine="SetLightTheme";
_setlighttheme();
 //BA.debugLineNum = 94;BA.debugLine="ScrollViewNewMensu.Panel.Height = 1000dip";
mostCurrent._scrollviewnewmensu.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1000)));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _buttonnewmensusebelumnya_click() throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Private Sub ButtonNewMensuSebelumnya_Click";
 //BA.debugLineNum = 181;BA.debugLine="PanelNewMensuDJPL1.SetVisibleAnimated(500,True)";
mostCurrent._panelnewmensudjpl1.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 182;BA.debugLine="PanelNewMensuDJPL2.SetVisibleAnimated(500,False)";
mostCurrent._panelnewmensudjpl2.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public static String  _buttonnewmensuselanjutnya_click() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Private Sub ButtonNewMensuSelanjutnya_Click";
 //BA.debugLineNum = 175;BA.debugLine="PanelNewMensuDJPL1.SetVisibleAnimated(500,False)";
mostCurrent._panelnewmensudjpl1.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 176;BA.debugLine="PanelNewMensuDJPL2.SetVisibleAnimated(500,True)";
mostCurrent._panelnewmensudjpl2.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 177;BA.debugLine="ScrollViewNewMensu.ScrollPosition =0";
mostCurrent._scrollviewnewmensu.setScrollPosition((int) (0));
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private LabelBackMensu As Label";
mostCurrent._labelbackmensu = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private ScrollViewNewMensu As ScrollView";
mostCurrent._scrollviewnewmensu = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private txtTahunPenetapan As EditText";
mostCurrent._txttahunpenetapan = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private LabeliconTahunPenetapan As Label";
mostCurrent._labelicontahunpenetapan = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private txtNamaMensu As EditText";
mostCurrent._txtnamamensu = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private DateTemplate As B4XDateTemplate";
mostCurrent._datetemplate = new com.atonrep.b4xdatetemplate();
 //BA.debugLineNum = 24;BA.debugLine="Private Dialog As B4XDialog";
mostCurrent._dialog = new com.atonrep.b4xdialog();
 //BA.debugLineNum = 26;BA.debugLine="Private xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 27;BA.debugLine="Private B4XComboBoxLahan As B4XComboBox";
mostCurrent._b4xcomboboxlahan = new com.atonrep.b4xcombobox();
 //BA.debugLineNum = 28;BA.debugLine="Private txtNoDSI As EditText";
mostCurrent._txtnodsi = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private txtNoBA As EditText";
mostCurrent._txtnoba = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private ButtonNewMensuSelanjutnya As Button";
mostCurrent._buttonnewmensuselanjutnya = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private PanelNewMensu1 As Panel";
mostCurrent._panelnewmensu1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private PanelNewMensu2 As Panel";
mostCurrent._panelnewmensu2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private ButtonNewMensuSebelumnya As Button";
mostCurrent._buttonnewmensusebelumnya = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private ButtonNewMensuSimpan As Button";
mostCurrent._buttonnewmensusimpan = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private PanelNewMensuDJPL1 As Panel";
mostCurrent._panelnewmensudjpl1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private PanelNewMensuDJPL2 As Panel";
mostCurrent._panelnewmensudjpl2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private txtElevasiMensuDJPL As EditText";
mostCurrent._txtelevasimensudjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private txtTinggiMensuDJPL As EditText";
mostCurrent._txttinggimensudjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private txtTinggiFokusMensuDJPL As EditText";
mostCurrent._txttinggifokusmensudjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private txtJarakTampakDJPL As EditText";
mostCurrent._txtjaraktampakdjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private txtSektorGelapDJPL As EditText";
mostCurrent._txtsektorgelapdjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private txtSektorTerangDJPL As EditText";
mostCurrent._txtsektorterangdjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private txtkarakeristikCerlangDJPL As EditText";
mostCurrent._txtkarakeristikcerlangdjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private txtPeriodeCerlangDJPL As EditText";
mostCurrent._txtperiodecerlangdjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private txtTandaSiangDJPL As EditText";
mostCurrent._txttandasiangdjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private SpinnerKodeMorseDJPL As Spinner";
mostCurrent._spinnerkodemorsedjpl = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private SpinnerKarakerBunyiDJPL As Spinner";
mostCurrent._spinnerkarakerbunyidjpl = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private txtmmsiDJPL As EditText";
mostCurrent._txtmmsidjpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private Panel20 As Panel";
mostCurrent._panel20 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private Panel21 As Panel";
mostCurrent._panel21 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private Panel22 As Panel";
mostCurrent._panel22 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private Panel23 As Panel";
mostCurrent._panel23 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private Panel24 As Panel";
mostCurrent._panel24 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private Panel25 As Panel";
mostCurrent._panel25 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private txtdegree1DJPL As EditText";
mostCurrent._txtdegree1djpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private txtminute1DJPL As EditText";
mostCurrent._txtminute1djpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private txtsecond1DJPL As EditText";
mostCurrent._txtsecond1djpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private txtdegree2DJPL As EditText";
mostCurrent._txtdegree2djpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private txtminute2DJPL As EditText";
mostCurrent._txtminute2djpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private txtsecond2DJPL As EditText";
mostCurrent._txtsecond2djpl = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _labelbackmensu_click() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Private Sub LabelBackMensu_Click";
 //BA.debugLineNum = 133;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public static void  _labelicontahunpenetapan_click() throws Exception{
ResumableSub_LabeliconTahunPenetapan_Click rsub = new ResumableSub_LabeliconTahunPenetapan_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LabeliconTahunPenetapan_Click extends BA.ResumableSub {
public ResumableSub_LabeliconTahunPenetapan_Click(com.atonrep.newmensu parent) {
this.parent = parent;
}
com.atonrep.newmensu parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 154;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 155;BA.debugLine="UpdateLabel";
_updatelabel();
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim ph As Phone";
_ph = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static String  _setlighttheme() throws Exception{
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
 //BA.debugLineNum = 106;BA.debugLine="Sub SetLightTheme";
 //BA.debugLineNum = 107;BA.debugLine="Dialog.TitleBarColor = 0xFF5B8DD7";
mostCurrent._dialog._titlebarcolor /*int*/  = (int) (0xff5b8dd7);
 //BA.debugLineNum = 108;BA.debugLine="Dialog.TitleBarHeight = 80dip";
mostCurrent._dialog._titlebarheight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80));
 //BA.debugLineNum = 109;BA.debugLine="Dim TextColor As Int = 0xFF5B8DD7";
_textcolor = (int) (0xff5b8dd7);
 //BA.debugLineNum = 110;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
mostCurrent._dialog._backgroundcolor /*int*/  = mostCurrent._xui.Color_White;
 //BA.debugLineNum = 111;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
mostCurrent._dialog._buttonscolor /*int*/  = mostCurrent._xui.Color_White;
 //BA.debugLineNum = 112;BA.debugLine="Dialog.ButtonsTextColor = Dialog.TitleBarColor";
mostCurrent._dialog._buttonstextcolor /*int*/  = mostCurrent._dialog._titlebarcolor /*int*/ ;
 //BA.debugLineNum = 113;BA.debugLine="Dialog.BorderColor = xui.Color_Transparent";
mostCurrent._dialog._bordercolor /*int*/  = mostCurrent._xui.Color_Transparent;
 //BA.debugLineNum = 114;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
mostCurrent._datetemplate._daysinweekcolor /*int*/  = mostCurrent._xui.Color_Black;
 //BA.debugLineNum = 115;BA.debugLine="DateTemplate.SelectedColor = 0xFF5B8DD7";
mostCurrent._datetemplate._selectedcolor /*int*/  = (int) (0xff5b8dd7);
 //BA.debugLineNum = 116;BA.debugLine="DateTemplate.HighlightedColor = 0xFF5B8DD7";
mostCurrent._datetemplate._highlightedcolor /*int*/  = (int) (0xff5b8dd7);
 //BA.debugLineNum = 117;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
mostCurrent._datetemplate._daysinmonthcolor /*int*/  = _textcolor;
 //BA.debugLineNum = 118;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
mostCurrent._datetemplate._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
 //BA.debugLineNum = 119;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
mostCurrent._datetemplate._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
 //BA.debugLineNum = 120;BA.debugLine="DateTemplate.SelectedColor = Colors.White";
mostCurrent._datetemplate._selectedcolor /*int*/  = anywheresoftware.b4a.keywords.Common.Colors.White;
 //BA.debugLineNum = 121;BA.debugLine="For Each x As B4XView In Array(DateTemplate.btnMo";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group15 = new Object[]{(Object)(mostCurrent._datetemplate._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(mostCurrent._datetemplate._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(mostCurrent._datetemplate._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(mostCurrent._datetemplate._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen15 = group15.length
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group15[index15]));
 //BA.debugLineNum = 122;BA.debugLine="x.Color = xui.Color_Transparent";
_x.setColor(mostCurrent._xui.Color_Transparent);
 }
};
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _toastresponse(int _r,String _message) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub ToastResponse(R As Int, Message As String) As";
 //BA.debugLineNum = 162;BA.debugLine="Select R";
switch (BA.switchObjectToInt(_r,anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE,anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE,anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) {
case 0: {
 break; }
case 1: {
 break; }
case 2: {
 break; }
}
;
 //BA.debugLineNum = 171;BA.debugLine="Return Message";
if (true) return _message;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public static void  _txttahunpenetapan_click() throws Exception{
ResumableSub_txtTahunPenetapan_Click rsub = new ResumableSub_txtTahunPenetapan_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_txtTahunPenetapan_Click extends BA.ResumableSub {
public ResumableSub_txtTahunPenetapan_Click(com.atonrep.newmensu parent) {
this.parent = parent;
}
com.atonrep.newmensu parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 138;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 139;BA.debugLine="UpdateLabel";
_updatelabel();
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _updatelabel() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub UpdateLabel";
 //BA.debugLineNum = 128;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 129;BA.debugLine="txtTahunPenetapan.Text =  DateTime.Date(DateTempl";
mostCurrent._txttahunpenetapan.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._datetemplate._getdate /*long*/ ())));
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
}
