package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.b4xturtle _turtle = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
_mainform.getRootPane().LoadLayout(ba,"Main");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action", false))
	 {return ((String) Debug.delegate(ba, "menubar1_action", null));}
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim Mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Select Mi.Tag";
switch (BA.switchObjectToInt(_mi.getTag(),(Object)("Restart"),(Object)("Exit"))) {
case 0: {
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Turtle.Stop.ClearScreen.Home";
_turtle._stop /*b4j.example.b4xturtle*/ (null)._clearscreen /*b4j.example.b4xturtle*/ (null)._home /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Turtle_Start";
_turtle_start();
 break; }
case 1: {
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="MainForm.Close";
_mainform.Close();
 break; }
}
;
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="End Sub";
return "";
}
public static String  _turtle_start() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "turtle_start", false))
	 {return ((String) Debug.delegate(ba, "turtle_start", null));}
int _i = 0;
int _a = 0;
int _intcount = 0;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Private i As Int = 1";
_i = (int) (1);
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Do Until i > 5";
while (!(_i>5)) {
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_i));
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="i = 100";
_i = (int) (100);
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="Do Until i < 1";
while (!(_i<1)) {
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_i));
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="i = i -1";
_i = (int) (_i-1);
 }
;
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="i = 1";
_i = (int) (1);
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Do Until i >  100";
while (!(_i>100)) {
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_i));
 };
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="i = 2";
_i = (int) (2);
RDebugUtils.currentLine=196638;
 //BA.debugLineNum = 196638;BA.debugLine="Do Until i >  100";
while (!(_i>100)) {
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_i));
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="i = i + 2";
_i = (int) (_i+2);
 }
;
RDebugUtils.currentLine=196710;
 //BA.debugLineNum = 196710;BA.debugLine="Private A As Int";
_a = 0;
RDebugUtils.currentLine=196711;
 //BA.debugLineNum = 196711;BA.debugLine="Private intCount As Int = 0";
_intcount = (int) (0);
RDebugUtils.currentLine=196713;
 //BA.debugLineNum = 196713;BA.debugLine="A = 0";
_a = (int) (0);
RDebugUtils.currentLine=196714;
 //BA.debugLineNum = 196714;BA.debugLine="Do Until  A = 0";
while (!(_a==0)) {
RDebugUtils.currentLine=196715;
 //BA.debugLineNum = 196715;BA.debugLine="Log(\"A = \" & A)";
anywheresoftware.b4a.keywords.Common.Log("A = "+BA.NumberToString(_a));
RDebugUtils.currentLine=196716;
 //BA.debugLineNum = 196716;BA.debugLine="intCount = intCount + 1";
_intcount = (int) (_intcount+1);
RDebugUtils.currentLine=196718;
 //BA.debugLineNum = 196718;BA.debugLine="A = Rnd(-100, 100)";
_a = anywheresoftware.b4a.keywords.Common.Rnd((int) (-100),(int) (100));
 }
;
RDebugUtils.currentLine=196721;
 //BA.debugLineNum = 196721;BA.debugLine="Log(\"Count = \" & intCount)";
anywheresoftware.b4a.keywords.Common.Log("Count = "+BA.NumberToString(_intcount));
RDebugUtils.currentLine=196735;
 //BA.debugLineNum = 196735;BA.debugLine="End Sub";
return "";
}
}