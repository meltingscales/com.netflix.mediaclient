package o;

/* renamed from: o.avb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3258avb {
    private final String a;
    private final int b;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3258avb) {
            C3258avb c3258avb = (C3258avb) obj;
            return this.b == c3258avb.b && C8632dsu.c((Object) this.a, (Object) c3258avb.a) && C8632dsu.c((Object) this.e, (Object) c3258avb.e);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.b) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        int i = this.b;
        String str = this.a;
        String str2 = this.e;
        return "UXConfigABTestCapabilityInput(abTest=" + i + ", name=" + str + ", value=" + str2 + ")";
    }
}
