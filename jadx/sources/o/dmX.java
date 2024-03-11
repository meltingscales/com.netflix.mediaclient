package o;

/* loaded from: classes5.dex */
final class dmX<T> implements dmV<T> {
    private final dmY<T> a;
    private final InterfaceC8743dwx<T> d;

    @Override // o.dmV
    public dmY<T> b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dmX(dmY<T> dmy, InterfaceC8743dwx<? super T> interfaceC8743dwx) {
        C8632dsu.c((Object) dmy, "");
        C8632dsu.c((Object) interfaceC8743dwx, "");
        this.a = dmy;
        this.d = interfaceC8743dwx;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dmX.class != obj.getClass()) {
            return false;
        }
        dmX dmx = (dmX) obj;
        return C8632dsu.c(b(), dmx.b()) && C8632dsu.c(this.d, dmx.d);
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.d.hashCode();
    }
}
