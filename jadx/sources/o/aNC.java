package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNC extends aUI {
    public static final d b = new d(null);
    private final String a;
    private final String d;
    private final boolean e;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aNC(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.a = str2;
        this.e = z;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx_ImplicitlyPairableLogblob");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.CdxLogImplicintPairing.a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        try {
            JSONObject jSONObject = this.i;
            jSONObject.putOpt("targetESN", this.d);
            jSONObject.putOpt("mobileESN", this.a);
            jSONObject.putOpt("sameProfile", Boolean.valueOf(this.e));
        } catch (JSONException unused) {
        }
        b.getLogTag();
        return this.i;
    }
}
