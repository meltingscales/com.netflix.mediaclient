package o;

import com.airbnb.mvrx.MavericksBlockExecutions;
import o.InterfaceC8888fH;

/* renamed from: o.fL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8892fL<S extends InterfaceC8888fH> {
    private final boolean a;
    private final drM<AbstractC8886fF<S>, MavericksBlockExecutions> b;
    private final InterfaceC8896fP<S> c;
    private final dwU d;
    private final dqZ e;

    public final InterfaceC8896fP<S> a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final dqZ c() {
        return this.e;
    }

    public final drM<AbstractC8886fF<S>, MavericksBlockExecutions> d() {
        return this.b;
    }

    public final dwU e() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8892fL(boolean z, InterfaceC8896fP<S> interfaceC8896fP, dwU dwu, dqZ dqz, drM<? super AbstractC8886fF<S>, ? extends MavericksBlockExecutions> drm) {
        C8632dsu.c((Object) interfaceC8896fP, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dqz, "");
        C8632dsu.c((Object) drm, "");
        this.a = z;
        this.c = interfaceC8896fP;
        this.d = dwu;
        this.e = dqz;
        this.b = drm;
    }
}
