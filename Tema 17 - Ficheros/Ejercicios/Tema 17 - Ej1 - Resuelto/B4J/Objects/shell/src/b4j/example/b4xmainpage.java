
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lstequipos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mequipos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _nf = RemoteObject.createImmutable("");
public static RemoteObject _strcarpeta = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"lstEquipos",_ref.getField(false, "_lstequipos"),"mEquipos",_ref.getField(false, "_mequipos"),"nf",_ref.getField(false, "_nf"),"Root",_ref.getField(false, "_root"),"strCarpeta",_ref.getField(false, "_strcarpeta"),"xui",_ref.getField(false, "_xui")};
}
}