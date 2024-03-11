package o;

/* loaded from: classes5.dex */
public final class dBE implements dBC {
    private final InterfaceC8612dsa<Object, Object, Object, Object> a;
    private final Object b;
    private final InterfaceC8612dsa<Object, dBH<?>, Object, dpR> d;
    private final InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> e;

    @Override // o.dBD
    public InterfaceC8612dsa<Object, Object, Object, Object> a() {
        return this.a;
    }

    @Override // o.dBD
    public Object c() {
        return this.b;
    }

    @Override // o.dBD
    public InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> d() {
        return this.e;
    }

    @Override // o.dBD
    public InterfaceC8612dsa<Object, dBH<?>, Object, dpR> e() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dBE(Object obj, InterfaceC8612dsa<Object, ? super dBH<?>, Object, dpR> interfaceC8612dsa, InterfaceC8612dsa<? super dBH<?>, Object, Object, ? extends drM<? super Throwable, dpR>> interfaceC8612dsa2) {
        InterfaceC8612dsa<Object, Object, Object, Object> interfaceC8612dsa3;
        this.b = obj;
        this.d = interfaceC8612dsa;
        this.e = interfaceC8612dsa2;
        interfaceC8612dsa3 = dBF.e;
        this.a = interfaceC8612dsa3;
    }

    public /* synthetic */ dBE(Object obj, InterfaceC8612dsa interfaceC8612dsa, InterfaceC8612dsa interfaceC8612dsa2, int i, C8627dsp c8627dsp) {
        this(obj, interfaceC8612dsa, (i & 4) != 0 ? null : interfaceC8612dsa2);
    }
}
