package o;

import com.bugsnag.android.BreadcrumbState;

/* renamed from: o.kv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9193kv extends AbstractC9267mP {
    private final BreadcrumbState a;
    private final C9190ks b;
    private final C9150kE c;
    private final C9192ku d = new C9192ku();
    private final C9237lm e;
    private final C9207lI g;

    public final C9190ks a() {
        return this.b;
    }

    public final C9150kE b() {
        return this.c;
    }

    public final C9237lm c() {
        return this.e;
    }

    public final BreadcrumbState d() {
        return this.a;
    }

    public final C9192ku e() {
        return this.d;
    }

    public final C9207lI f() {
        return this.g;
    }

    public C9193kv(C9258mG c9258mG, C9196ky c9196ky) {
        C9190ks c9190ks = c9196ky.e.a;
        this.b = c9190ks;
        C9150kE c9150kE = new C9150kE();
        if (c9196ky.j() != null) {
            c9150kE.d(c9196ky.j());
        }
        dpR dpr = dpR.c;
        this.c = c9150kE;
        this.a = new BreadcrumbState(c9258mG.o(), c9190ks, c9258mG.m());
        this.g = b(c9196ky);
        this.e = c9196ky.e.e.e();
    }

    private final C9207lI b(C9196ky c9196ky) {
        return c9196ky.e.d.a(c9196ky.e.d.a().a());
    }
}
