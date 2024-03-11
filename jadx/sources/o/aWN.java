package o;

import com.netflix.mediaclient.servicemgr.Logblob;
import org.json.JSONException;

/* loaded from: classes3.dex */
public abstract class aWN extends aUI {
    public static String b = "MdxStackDial";

    public String f() {
        return null;
    }

    public aWN(String str) {
        try {
            this.i.put("ctrlcat", "Android");
            this.i.put("groupname", str);
            this.i.put("dialstack", b);
            String f = f();
            if (f != null) {
                this.i.put("xid", f);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(aWO awo) {
        try {
            awo.a(this.i);
            this.f = Logblob.Severity.error;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return Logblob.Severity.error.equals(this.f);
    }
}
