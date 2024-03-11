package o;

/* loaded from: classes.dex */
public final class IK {
    private final InterfaceC1242Ud a;
    private final String b;
    private final int c;
    private final InterfaceC0943Io d;
    private final String e;
    private InterfaceC8322diG g;

    public final String a() {
        return this.b;
    }

    public final void a(InterfaceC8322diG interfaceC8322diG) {
        this.g = interfaceC8322diG;
    }

    public final InterfaceC0943Io b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final InterfaceC1242Ud d() {
        return this.a;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IK) {
            IK ik = (IK) obj;
            return C8632dsu.c(this.a, ik.a) && this.c == ik.c && C8632dsu.c((Object) this.b, (Object) ik.b) && C8632dsu.c(this.d, ik.d);
        }
        return false;
    }

    public final InterfaceC8322diG f() {
        return this.g;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        InterfaceC1242Ud interfaceC1242Ud = this.a;
        int i = this.c;
        String str = this.b;
        InterfaceC0943Io interfaceC0943Io = this.d;
        return "DiskCacheRequest(pql=" + interfaceC1242Ud + ", offset=" + i + ", keySegment=" + str + ", node=" + interfaceC0943Io + ")";
    }

    public IK(InterfaceC1242Ud interfaceC1242Ud, int i, String str, InterfaceC0943Io interfaceC0943Io) {
        C8632dsu.c((Object) interfaceC1242Ud, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC0943Io, "");
        this.a = interfaceC1242Ud;
        this.c = i;
        this.b = str;
        this.d = interfaceC0943Io;
        String b = IL.b(interfaceC1242Ud.d().subList(0, i + 1));
        C8632dsu.a(b, "");
        this.e = b;
    }
}
