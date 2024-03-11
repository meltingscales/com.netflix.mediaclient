package o;

import com.airbnb.mvrx.MavericksBlockExecutions;

/* renamed from: o.fU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8901fU<S> {
    private final boolean a;
    private final dqZ b;
    private final dwU c;
    private final InterfaceC8896fP<S> e;

    public final dqZ b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final InterfaceC8896fP<S> d() {
        return this.e;
    }

    public abstract <S extends InterfaceC8888fH> MavericksBlockExecutions e(AbstractC8899fS<S> abstractC8899fS);

    public final dwU e() {
        return this.c;
    }

    public AbstractC8901fU(boolean z, InterfaceC8896fP<S> interfaceC8896fP, dwU dwu, dqZ dqz) {
        C8632dsu.c((Object) interfaceC8896fP, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dqz, "");
        this.a = z;
        this.e = interfaceC8896fP;
        this.c = dwu;
        this.b = dqz;
    }
}
