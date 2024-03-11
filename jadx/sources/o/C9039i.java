package o;

/* renamed from: o.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9039i<RowType> extends AbstractC3495b<RowType> {
    private final String a;
    private final InterfaceC9569s b;
    private final String c;
    private final int d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9039i(int i, InterfaceC9569s interfaceC9569s, String str, String str2, String str3, drM<? super InterfaceC9145k, ? extends RowType> drm) {
        super(drm);
        C8632dsu.c((Object) interfaceC9569s, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) drm, "");
        this.d = i;
        this.b = interfaceC9569s;
        this.a = str;
        this.e = str2;
        this.c = str3;
    }

    @Override // o.AbstractC3495b
    public <R> InterfaceC9357o<R> e(drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm) {
        C8632dsu.c((Object) drm, "");
        return this.b.b(Integer.valueOf(this.d), this.c, drm, 0, null);
    }

    public String toString() {
        return this.a + ':' + this.e;
    }
}
