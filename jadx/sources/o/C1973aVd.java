package o;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import org.json.JSONObject;

/* renamed from: o.aVd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1973aVd extends aUI {
    public static final c d = new c(null);
    private final String a;
    private final String b;
    private final boolean e;

    public JSONObject g() {
        return null;
    }

    public C1973aVd(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.a = str2;
        this.e = z;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.VuiCommand.a();
        C8632dsu.a(a, "");
        return a;
    }

    /* renamed from: o.aVd$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public void f() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", this.a);
        jSONObject2.put(NetflixActivity.EXTRA_SOURCE, this.b);
        JSONObject g = g();
        if (g != null) {
            jSONObject2.put("payload", g);
        }
        jSONObject.put("command", jSONObject2);
        jSONObject.put("handled", this.e);
        this.i.put("msg", jSONObject);
    }

    @Override // o.aUI, o.AbstractC5119bsj
    public void b(Context context, aOV aov, String str, String str2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        super.b(context, aov, str, str2);
        f();
    }
}
