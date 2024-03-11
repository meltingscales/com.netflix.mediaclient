package o;

/* loaded from: classes.dex */
public final class aOX {
    private final boolean a;
    private final InterfaceC5093bsJ b;
    private final boolean e;

    public final boolean a() {
        return this.e;
    }

    public final InterfaceC5093bsJ b() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aOX) {
            aOX aox = (aOX) obj;
            return C8632dsu.c(this.b, aox.b) && this.e == aox.e && this.a == aox.a;
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.a);
    }

    public String toString() {
        InterfaceC5093bsJ interfaceC5093bsJ = this.b;
        boolean z = this.e;
        boolean z2 = this.a;
        return "RefreshCustomerConfigRequestOptions(registry=" + interfaceC5093bsJ + ", isMember=" + z + ", skipAbAllocations=" + z2 + ")";
    }

    public aOX(InterfaceC5093bsJ interfaceC5093bsJ, boolean z, boolean z2) {
        C8632dsu.c((Object) interfaceC5093bsJ, "");
        this.b = interfaceC5093bsJ;
        this.e = z;
        this.a = z2;
    }
}
