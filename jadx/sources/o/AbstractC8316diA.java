package o;

/* renamed from: o.diA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8316diA implements InterfaceC0943Io, II, InterfaceC8319diD {
    public final InterfaceC1240Ub<? extends InterfaceC0943Io> c;
    private C0949Iu<IF> d;

    @Override // o.II
    public C0949Iu<IF> cm_() {
        return this.d;
    }

    public InterfaceC1240Ub<? extends InterfaceC0943Io> cn_() {
        return this.c;
    }

    @Override // o.II
    public void e(C0949Iu<IF> c0949Iu) {
        this.d = c0949Iu;
    }

    public AbstractC8316diA(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        this.c = interfaceC1240Ub;
    }
}
