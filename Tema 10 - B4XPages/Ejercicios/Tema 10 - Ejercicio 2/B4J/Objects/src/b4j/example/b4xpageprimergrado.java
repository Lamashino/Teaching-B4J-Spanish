package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpageprimergrado extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpageprimergrado", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpageprimergrado.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmessage = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtb = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpageprimergrado __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpageprimergrado";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4j.example.b4xpageprimergrado __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageprimergrado";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Root.LoadLayout(\"frmPrimary\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmPrimary",ba);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="txtA.Text = 0";
__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="txtB.Text = 0";
__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xpageprimergrado __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageprimergrado";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
float _a = 0f;
float _b = 0f;
float _c = 0f;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Private a, b, c As Float";
_a = 0f;
_b = 0f;
_c = 0f;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="a = txtA.Text";
_a = (float)(Double.parseDouble(__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="b = txtB.Text";
_b = (float)(Double.parseDouble(__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="If a <> 0 And b <> 0 Then";
if (_a!=0 && _b!=0) { 
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="c = -b/a";
_c = (float) (-_b/(double)_a);
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="lblMessage.text = c";
__ref._lblmessage /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_c));
 };
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpageprimergrado __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageprimergrado";
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Private lblMessage As Label";
_lblmessage = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Private txtA As TextField";
_txta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Private txtB As TextField";
_txtb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="End Sub";
return "";
}
}