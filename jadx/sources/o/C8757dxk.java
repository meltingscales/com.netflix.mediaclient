package o;

/* renamed from: o.dxk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8757dxk extends AbstractC8744dwy {
    private final InterfaceC8760dxn a;

    public C8757dxk(InterfaceC8760dxn interfaceC8760dxn) {
        this.a = interfaceC8760dxn;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Throwable th) {
        e(th);
        return dpR.c;
    }

    @Override // o.AbstractC8742dww
    public void e(Throwable th) {
        this.a.co_();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
