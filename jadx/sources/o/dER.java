package o;

import kotlinx.serialization.json.internal.JsonDecodingException;
import o.AbstractC7715dCr;

/* loaded from: classes5.dex */
public final class dER implements dBT<dEQ> {
    public static final dER b = new dER();
    private static final InterfaceC7707dCj c = C7713dCp.b("kotlinx.serialization.json.JsonNull", AbstractC7715dCr.b.a, new InterfaceC7707dCj[0], null, 8, null);

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return c;
    }

    private dER() {
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, dEQ deq) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) deq, "");
        dEE.e(interfaceC7721dCx);
        interfaceC7721dCx.e();
    }

    @Override // o.dBP
    /* renamed from: c */
    public dEQ b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        dEE.b(interfaceC7720dCw);
        if (interfaceC7720dCw.i()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        interfaceC7720dCw.g();
        return dEQ.INSTANCE;
    }
}
