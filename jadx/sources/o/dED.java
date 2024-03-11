package o;

/* loaded from: classes5.dex */
public final class dED {
    private boolean a;
    private boolean b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private dES h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;
    private dFP m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13797o;

    public final void a(boolean z) {
        this.i = z;
    }

    public final dFP d() {
        return this.m;
    }

    public dED(AbstractC7773dEv abstractC7773dEv) {
        C8632dsu.c((Object) abstractC7773dEv, "");
        this.j = abstractC7773dEv.a().i();
        this.f = abstractC7773dEv.a().j();
        this.i = abstractC7773dEv.a().f();
        this.g = abstractC7773dEv.a().l();
        this.d = abstractC7773dEv.a().a();
        this.k = abstractC7773dEv.a().g();
        this.l = abstractC7773dEv.a().n();
        this.b = abstractC7773dEv.a().e();
        this.f13797o = abstractC7773dEv.a().k();
        this.c = abstractC7773dEv.a().d();
        this.e = abstractC7773dEv.a().b();
        this.n = abstractC7773dEv.a().m();
        this.h = abstractC7773dEv.a().h();
        this.a = abstractC7773dEv.a().c();
        this.m = abstractC7773dEv.d();
    }

    public final C7777dEz a() {
        if (!this.f13797o || C8632dsu.c((Object) this.c, (Object) "type")) {
            if (!this.k) {
                if (!C8632dsu.c((Object) this.l, (Object) "    ")) {
                    throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
                }
            } else if (!C8632dsu.c((Object) this.l, (Object) "    ")) {
                String str = this.l;
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.l).toString());
                    }
                }
            }
            return new C7777dEz(this.j, this.i, this.g, this.d, this.k, this.f, this.l, this.b, this.f13797o, this.c, this.e, this.n, this.h, this.a);
        }
        throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
    }
}
