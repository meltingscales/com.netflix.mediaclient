package o;

import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public final class dDJ implements dBT {
    public static final dDJ b = new dDJ();
    private static final InterfaceC7707dCj a = dDK.b;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return a;
    }

    private dDJ() {
    }

    @Override // o.dBZ
    /* renamed from: b */
    public void e(InterfaceC7721dCx interfaceC7721dCx, Void r3) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) r3, "");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // o.dBP
    /* renamed from: e */
    public Void b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }
}
