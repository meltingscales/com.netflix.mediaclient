package o;

/* loaded from: classes5.dex */
public final class dEJ extends dET {
    private final boolean a;
    private final String c;
    private final InterfaceC7707dCj e;

    public final InterfaceC7707dCj c() {
        return this.e;
    }

    @Override // o.dET
    public String d() {
        return this.c;
    }

    @Override // o.dET
    public boolean e() {
        return this.a;
    }

    public /* synthetic */ dEJ(Object obj, boolean z, InterfaceC7707dCj interfaceC7707dCj, int i, C8627dsp c8627dsp) {
        this(obj, z, (i & 4) != 0 ? null : interfaceC7707dCj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dEJ(Object obj, boolean z, InterfaceC7707dCj interfaceC7707dCj) {
        super(null);
        C8632dsu.c(obj, "");
        this.a = z;
        this.e = interfaceC7707dCj;
        this.c = obj.toString();
        if (interfaceC7707dCj != null && !interfaceC7707dCj.a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // o.dET
    public String toString() {
        if (e()) {
            StringBuilder sb = new StringBuilder();
            dFK.c(sb, d());
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }
        return d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dEJ.class != obj.getClass()) {
            return false;
        }
        dEJ dej = (dEJ) obj;
        return e() == dej.e() && C8632dsu.c((Object) d(), (Object) dej.d());
    }

    public int hashCode() {
        return (Boolean.hashCode(e()) * 31) + d().hashCode();
    }
}
