package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNM {
    public static final b e = new b(null);
    private final CdxAgentImpl a;

    public aNM(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.a = cdxAgentImpl;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_received_message");
        }
    }

    public final aNN a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        String h = this.a.h();
        aNO ano = aNO.d;
        if (!ano.b(jSONObject, h)) {
            ano.e(jSONObject, h);
            return null;
        } else if (aNF.e.b(jSONObject)) {
            return new aNF(this.a, jSONObject);
        } else {
            if (aNG.a.e(jSONObject)) {
                return new aNG(this.a, jSONObject);
            }
            if (aNL.e.a(jSONObject)) {
                return new aNL(this.a, jSONObject);
            }
            if (aNH.b.a(jSONObject)) {
                return new aNH(this.a, jSONObject);
            }
            if (aNP.a.b(jSONObject)) {
                return new aNP(this.a, jSONObject);
            }
            if (aNJ.b.e(jSONObject)) {
                return new aNJ(this.a, jSONObject);
            }
            if (aNR.e.a(jSONObject)) {
                return new aNR(this.a, jSONObject);
            }
            if (aNK.b.c(jSONObject)) {
                return new aNK(this.a, jSONObject);
            }
            if (aNT.d.b(jSONObject)) {
                return new aNT(this.a, jSONObject);
            }
            if (aNQ.b.b(jSONObject)) {
                return new aNQ(this.a, jSONObject);
            }
            if (aND.b.e(jSONObject)) {
                return new aND(this.a);
            }
            if (aNI.a.d(jSONObject)) {
                return new aNI(this.a, jSONObject);
            }
            if (aNS.b.b(jSONObject)) {
                return new aNS(this.a, jSONObject);
            }
            if (aNV.a.c(jSONObject)) {
                return new aNV(this.a, jSONObject);
            }
            if (aNE.e.d(jSONObject)) {
                return new aNE(this.a, jSONObject);
            }
            return null;
        }
    }
}
