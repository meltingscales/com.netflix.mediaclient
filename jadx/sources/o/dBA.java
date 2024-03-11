package o;

/* loaded from: classes5.dex */
public final class dBA<Q> implements dBB<Q> {
    private final InterfaceC8612dsa<Object, Object, Object, Object> b;
    private final InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> c;
    private final Object d;
    private final InterfaceC8612dsa<Object, dBH<?>, Object, dpR> e;

    @Override // o.dBD
    public InterfaceC8612dsa<Object, Object, Object, Object> a() {
        return this.b;
    }

    @Override // o.dBD
    public Object c() {
        return this.d;
    }

    @Override // o.dBD
    public InterfaceC8612dsa<dBH<?>, Object, Object, drM<Throwable, dpR>> d() {
        return this.c;
    }

    @Override // o.dBD
    public InterfaceC8612dsa<Object, dBH<?>, Object, dpR> e() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dBA(Object obj, InterfaceC8612dsa<Object, ? super dBH<?>, Object, dpR> interfaceC8612dsa, InterfaceC8612dsa<Object, Object, Object, ? extends Object> interfaceC8612dsa2, InterfaceC8612dsa<? super dBH<?>, Object, Object, ? extends drM<? super Throwable, dpR>> interfaceC8612dsa3) {
        this.d = obj;
        this.e = interfaceC8612dsa;
        this.b = interfaceC8612dsa2;
        this.c = interfaceC8612dsa3;
    }
}
