package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.Logblob;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aSO extends aUI {
    public static final d e = new d(null);
    private final String a;
    private final String b;
    private String d;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aSO(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aSO(String str, String str2, String str3) {
        this(str, str2);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.f = Logblob.Severity.error;
        this.d = str3;
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.AppUpdate.a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        this.i.put("dialogType", this.a);
        this.i.put("updateType", this.b);
        String str = this.d;
        if (str != null) {
            this.i.put("errorMsg", str);
        }
        JSONObject jSONObject = this.i;
        C8632dsu.a(jSONObject, "");
        return jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
