package o;

/* renamed from: o.dzp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8816dzp extends dzF<C8818dzr<?>> {
    public InterfaceC8585dra<? super dpR> a;
    public long b = -1;

    @Override // o.dzF
    /* renamed from: b */
    public boolean e(C8818dzr<?> c8818dzr) {
        if (this.b >= 0) {
            return false;
        }
        this.b = c8818dzr.h();
        return true;
    }

    @Override // o.dzF
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public InterfaceC8585dra<dpR>[] a(C8818dzr<?> c8818dzr) {
        long j = this.b;
        this.b = -1L;
        this.a = null;
        return c8818dzr.d(j);
    }
}
