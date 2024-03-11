package o;

import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes5.dex */
public final class dFJ extends AbstractC7714dCq implements dEN {
    private boolean a;
    private final C7784dFf b;
    private final AbstractC7773dEv c;
    private final WriteMode d;
    private final C7777dEz e;
    private String g;
    private final dEN[] h;
    private final dFP i;

    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    @Override // o.dEN
    public AbstractC7773dEv a() {
        return this.c;
    }

    @Override // o.InterfaceC7721dCx
    public dFP c() {
        return this.i;
    }

    public dFJ(C7784dFf c7784dFf, AbstractC7773dEv abstractC7773dEv, WriteMode writeMode, dEN[] denArr) {
        C8632dsu.c((Object) c7784dFf, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) writeMode, "");
        this.b = c7784dFf;
        this.c = abstractC7773dEv;
        this.d = writeMode;
        this.h = denArr;
        this.i = a().d();
        this.e = a().a();
        int ordinal = writeMode.ordinal();
        if (denArr != null) {
            dEN den = denArr[ordinal];
            if (den == null && den == this) {
                return;
            }
            denArr[ordinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dFJ(dFD dfd, AbstractC7773dEv abstractC7773dEv, WriteMode writeMode, dEN[] denArr) {
        this(C7793dFo.d(dfd, abstractC7773dEv), abstractC7773dEv, writeMode, denArr);
        C8632dsu.c((Object) dfd, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) writeMode, "");
        C8632dsu.c((Object) denArr, "");
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7719dCv
    public boolean c(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this.e.i();
    }

    private final void b(InterfaceC7707dCj interfaceC7707dCj) {
        this.b.b();
        String str = this.g;
        C8632dsu.d((Object) str);
        e(str);
        this.b.d(':');
        this.b.c();
        e(interfaceC7707dCj.d());
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public InterfaceC7719dCv e(InterfaceC7707dCj interfaceC7707dCj) {
        dEN den;
        C8632dsu.c((Object) interfaceC7707dCj, "");
        WriteMode c = dFN.c(a(), interfaceC7707dCj);
        char c2 = c.d;
        if (c2 != 0) {
            this.b.d(c2);
            this.b.d();
        }
        if (this.g != null) {
            b(interfaceC7707dCj);
            this.g = null;
        }
        if (this.d == c) {
            return this;
        }
        dEN[] denArr = this.h;
        return (denArr == null || (den = denArr[c.ordinal()]) == null) ? new dFJ(this.b, a(), c, this.h) : den;
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7719dCv
    public void d(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (this.d.j != 0) {
            this.b.a();
            this.b.b();
            this.b.d(this.d.j);
        }
    }

    @Override // o.AbstractC7714dCq
    public boolean e(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        int i2 = e.b[this.d.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.b.e()) {
                        this.b.d(',');
                    }
                    this.b.b();
                    e(C7801dFw.b(interfaceC7707dCj, a(), i));
                    this.b.d(':');
                    this.b.c();
                } else {
                    if (i == 0) {
                        this.a = true;
                    }
                    if (i == 1) {
                        this.b.d(',');
                        this.b.c();
                        this.a = false;
                    }
                }
            } else if (!this.b.e()) {
                if (i % 2 == 0) {
                    this.b.d(',');
                    this.b.b();
                    z = true;
                } else {
                    this.b.d(':');
                    this.b.c();
                }
                this.a = z;
            } else {
                this.a = true;
                this.b.b();
            }
        } else {
            if (!this.b.e()) {
                this.b.d(',');
            }
            this.b.b();
        }
        return true;
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7719dCv
    public <T> void d(InterfaceC7707dCj interfaceC7707dCj, int i, dBZ<? super T> dbz, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) dbz, "");
        if (t != null || this.e.j()) {
            super.d(interfaceC7707dCj, i, dbz, t);
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public InterfaceC7721dCx c(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        if (!dFL.a(interfaceC7707dCj)) {
            if (!dFL.c(interfaceC7707dCj)) {
                return super.c(interfaceC7707dCj);
            }
            C7784dFf c7784dFf = this.b;
            if (!(c7784dFf instanceof C7782dFd)) {
                c7784dFf = new C7782dFd(c7784dFf.a, this.a);
            }
            return new dFJ(c7784dFf, a(), this.d, (dEN[]) null);
        }
        C7784dFf c7784dFf2 = this.b;
        if (!(c7784dFf2 instanceof C7783dFe)) {
            c7784dFf2 = new C7783dFe(c7784dFf2.a, this.a);
        }
        return new dFJ(c7784dFf2, a(), this.d, (dEN[]) null);
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void e() {
        this.b.d("null");
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void c(boolean z) {
        if (this.a) {
            e(String.valueOf(z));
        } else {
            this.b.b(z);
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void b(byte b) {
        if (this.a) {
            e(String.valueOf((int) b));
        } else {
            this.b.d(b);
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void d(short s) {
        if (this.a) {
            e(String.valueOf((int) s));
        } else {
            this.b.c(s);
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void b(int i) {
        if (this.a) {
            e(String.valueOf(i));
        } else {
            this.b.b(i);
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void e(long j) {
        if (this.a) {
            e(String.valueOf(j));
        } else {
            this.b.b(j);
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void a(float f) {
        if (this.a) {
            e(String.valueOf(f));
        } else {
            this.b.a(f);
        }
        if (this.e.b()) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw C7797dFs.e(Float.valueOf(f), this.b.a.toString());
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void c(double d) {
        if (this.a) {
            e(String.valueOf(d));
        } else {
            this.b.c(d);
        }
        if (this.e.b()) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw C7797dFs.e(Double.valueOf(d), this.b.a.toString());
        }
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void d(char c) {
        e(String.valueOf(c));
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void e(String str) {
        C8632dsu.c((Object) str, "");
        this.b.c(str);
    }

    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public void a(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        e(interfaceC7707dCj.a(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7714dCq, o.InterfaceC7721dCx
    public <T> void e(dBZ<? super T> dbz, T t) {
        C8632dsu.c((Object) dbz, "");
        if (!(dbz instanceof dCC) || a().a().k()) {
            dbz.e(this, t);
            return;
        }
        dCC dcc = (dCC) dbz;
        String c = dFC.c(dbz.e(), a());
        C8632dsu.d(t);
        dBZ c2 = dBW.c(dcc, this, t);
        dFC.b(dcc, c2, c);
        dFC.e(c2.e().b());
        this.g = c;
        c2.e(this, t);
    }
}
