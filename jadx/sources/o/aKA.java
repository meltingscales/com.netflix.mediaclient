package o;

import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aKA extends aUI {
    public static final d a = new d(null);
    private final C1690aKq b;
    private final C1683aKj d;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aKA(C1690aKq c1690aKq, C1683aKj c1683aKj) {
        C8632dsu.c((Object) c1690aKq, "");
        C8632dsu.c((Object) c1683aKj, "");
        this.b = c1690aKq;
        this.d = c1683aKj;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlayIntegrityLogblob");
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a2 = LogBlobType.PlayIntegrity.a();
        C8632dsu.a(a2, "");
        return a2;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        try {
            C1699aKz c1699aKz = C1699aKz.d;
            JSONObject e = c1699aKz.e(c1699aKz.d(this.b));
            if (e != null) {
                e.put("deviceAttestation", this.d.b());
                this.i.putOpt("playIntegrityState", e);
            }
        } catch (JSONException unused) {
        }
        a.getLogTag();
        return this.i;
    }
}
