package o;

import o.AbstractC7710dCm;
import o.C7703dCf;
import o.C8632dsu;
import o.InterfaceC7707dCj;
import o.dEC;
import o.dEE;
import o.dEM;
import o.dER;
import o.dEV;
import o.dEW;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final class dEF implements dBT<dEI> {
    public static final dEF a = new dEF();
    private static final InterfaceC7707dCj e = C7713dCp.a("kotlinx.serialization.json.JsonElement", AbstractC7710dCm.a.e, new InterfaceC7707dCj[0], new drM<C7703dCf, dpR>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1
        @Override // o.drM
        public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
            d(c7703dCf);
            return dpR.c;
        }

        public final void d(C7703dCf c7703dCf) {
            InterfaceC7707dCj d2;
            InterfaceC7707dCj d3;
            InterfaceC7707dCj d4;
            InterfaceC7707dCj d5;
            InterfaceC7707dCj d6;
            C8632dsu.c((Object) c7703dCf, "");
            d2 = dEE.d(new drO<InterfaceC7707dCj>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.1
                @Override // o.drO
                /* renamed from: d */
                public final InterfaceC7707dCj invoke() {
                    return dEV.e.e();
                }
            });
            C7703dCf.e(c7703dCf, "JsonPrimitive", d2, null, false, 12, null);
            d3 = dEE.d(new drO<InterfaceC7707dCj>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.2
                @Override // o.drO
                /* renamed from: a */
                public final InterfaceC7707dCj invoke() {
                    return dER.b.e();
                }
            });
            C7703dCf.e(c7703dCf, "JsonNull", d3, null, false, 12, null);
            d4 = dEE.d(new drO<InterfaceC7707dCj>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.3
                @Override // o.drO
                /* renamed from: b */
                public final InterfaceC7707dCj invoke() {
                    return dEM.b.e();
                }
            });
            C7703dCf.e(c7703dCf, "JsonLiteral", d4, null, false, 12, null);
            d5 = dEE.d(new drO<InterfaceC7707dCj>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.4
                @Override // o.drO
                /* renamed from: a */
                public final InterfaceC7707dCj invoke() {
                    return dEW.b.e();
                }
            });
            C7703dCf.e(c7703dCf, "JsonObject", d5, null, false, 12, null);
            d6 = dEE.d(new drO<InterfaceC7707dCj>() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.5
                @Override // o.drO
                /* renamed from: d */
                public final InterfaceC7707dCj invoke() {
                    return dEC.d.e();
                }
            });
            C7703dCf.e(c7703dCf, "JsonArray", d6, null, false, 12, null);
        }
    });

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return e;
    }

    private dEF() {
    }

    @Override // o.dBZ
    /* renamed from: a */
    public void e(InterfaceC7721dCx interfaceC7721dCx, dEI dei) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) dei, "");
        dEE.c(interfaceC7721dCx);
        if (dei instanceof dET) {
            interfaceC7721dCx.e(dEV.e, dei);
        } else if (dei instanceof dEP) {
            interfaceC7721dCx.e(dEW.b, dei);
        } else if (dei instanceof dEB) {
            interfaceC7721dCx.e(dEC.d, dei);
        }
    }

    @Override // o.dBP
    /* renamed from: c */
    public dEI b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return dEE.e(interfaceC7720dCw).l();
    }
}
