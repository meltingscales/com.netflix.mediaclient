package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import org.json.JSONObject;

/* renamed from: o.bpx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4974bpx {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Status h;
    public String i;
    public JSONObject j;

    public String a() {
        return this.e;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.i;
    }

    public String i() {
        return this.f;
    }

    public Status j() {
        return this.h;
    }

    public String l() {
        return this.g;
    }

    public JSONObject d() {
        JSONObject jSONObject = this.j;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public void b(Context context) {
        if (C8168dfL.h(this.g)) {
            return;
        }
        String m = m();
        if ("1.1.2".equals(this.a)) {
            this.g = ((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).a(context);
        } else if ("3.2.420".equals(this.a)) {
            this.g = ((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).b(context);
        } else if (this.a.startsWith("3.")) {
            this.g = ((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).d(context, "(" + m + ")");
        } else {
            this.g = ((InterfaceC5297bwB) C1332Xp.b(InterfaceC5297bwB.class)).c(context, "(" + m + ")");
        }
    }

    private String m() {
        int indexOf;
        if ((!C8168dfL.h(this.b) || !C8168dfL.i(this.b)) && !this.a.startsWith("5.7.")) {
            if (C8168dfL.h(this.a)) {
                int indexOf2 = this.a.indexOf(".");
                return (indexOf2 < 0 || (indexOf = this.a.indexOf(".", indexOf2 + 1)) < 0) ? this.a : this.a.substring(0, indexOf);
            }
            return "";
        }
        return this.a;
    }

    public String toString() {
        return "NrdpErr{errorCode='" + this.a + "', errorString='" + this.i + "', deviceSpecificString='" + this.d + "'}";
    }
}
