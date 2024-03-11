package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.playintegrity.api.PlayIntegrityState;

/* renamed from: o.aKr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1691aKr {
    public static final d c = new d(null);
    private final Context a;
    private C1683aKj b;
    private boolean d;
    private boolean e;
    private final C1690aKq f;

    public final C1690aKq a() {
        return this.f;
    }

    public final C1683aKj c() {
        return this.b;
    }

    public final boolean d() {
        return this.e;
    }

    public C1691aKr(Context context) {
        C8632dsu.c((Object) context, "");
        this.a = context;
        C1699aKz c1699aKz = C1699aKz.d;
        this.f = c1699aKz.b(context);
        this.b = c1699aKz.c(context);
    }

    /* renamed from: o.aKr$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlayIntegrityController");
        }
    }

    public final void e() {
        synchronized (this) {
            l();
            this.f.d(PlayIntegrityState.DISABLED);
            C1699aKz.d.a(this.a, this.f);
        }
    }

    private final void l() {
        this.f.c();
        this.d = false;
    }

    private final void d(long j) {
        C1690aKq c1690aKq = this.f;
        c1690aKq.a(j - c1690aKq.e());
    }

    private final void e(long j) {
        C1690aKq c1690aKq = this.f;
        c1690aKq.i(j - c1690aKq.b());
    }

    private final void a(long j) {
        C1690aKq c1690aKq = this.f;
        c1690aKq.e(j - c1690aKq.d());
    }

    private final void b(long j) {
        C1690aKq c1690aKq = this.f;
        c1690aKq.g(j - c1690aKq.a());
    }

    public final void j() {
        synchronized (this) {
            c.getLogTag();
            l();
            this.f.d(PlayIntegrityState.NOT_SUPPORTED);
            C1699aKz.d.a(this.a, this.f);
        }
    }

    public final void f() {
        synchronized (this) {
            c.getLogTag();
            l();
            long currentTimeMillis = System.currentTimeMillis();
            this.f.b(currentTimeMillis);
            this.f.d(currentTimeMillis);
            this.f.d(PlayIntegrityState.GETTING_NONCE_FROM_NETFLIX);
            this.e = true;
            C1699aKz.d.a(this.a, this.f);
        }
    }

    public final void c(Status status) {
        c.getLogTag();
        long currentTimeMillis = System.currentTimeMillis();
        e(currentTimeMillis);
        a(currentTimeMillis);
        this.f.d(PlayIntegrityState.ERROR_FAILED_NONCE_FROM_NETFLIX);
        this.e = false;
        this.d = true;
        C1690aKq c1690aKq = this.f;
        C1699aKz c1699aKz = C1699aKz.d;
        c1690aKq.c(c1699aKz.c(status));
        c1699aKz.a(this.a, this.f);
    }

    public final void i() {
        c.getLogTag();
        long currentTimeMillis = System.currentTimeMillis();
        e(currentTimeMillis);
        a(currentTimeMillis);
        this.f.d(PlayIntegrityState.ERROR_RECEIVED_EMPTY_NONCE_FROM_NETFLIX);
        this.e = false;
        this.d = true;
        C1699aKz.d.a(this.a, this.f);
    }

    public final void n() {
        synchronized (this) {
            c.getLogTag();
            a(System.currentTimeMillis());
            this.f.d(PlayIntegrityState.RECEIVED_NONCE_FROM_NETFLIX);
            C1699aKz.d.a(this.a, this.f);
        }
    }

    public final void b() {
        synchronized (this) {
            c.getLogTag();
            this.f.c(System.currentTimeMillis());
            this.f.d(PlayIntegrityState.GETTING_METADATA_FROM_GOOGLE);
            C1699aKz.d.a(this.a, this.f);
        }
    }

    public final void g() {
        c.getLogTag();
        this.f.d(PlayIntegrityState.RECEIVED_METADATA_FROM_GOOGLE);
        this.e = false;
        long currentTimeMillis = System.currentTimeMillis();
        d(currentTimeMillis);
        e(currentTimeMillis);
        this.d = true;
        C1699aKz.d.a(this.a, this.f);
    }

    public final void h() {
        c.getLogTag();
        this.f.d(PlayIntegrityState.RECEIVED_METADATA_FROM_GOOGLE);
        d(System.currentTimeMillis());
        C1699aKz.d.a(this.a, this.f);
    }

    public final void b(String str) {
        C8632dsu.c((Object) str, "");
        c.getLogTag();
        this.f.d(PlayIntegrityState.ERROR_FAILED_METADATA_FROM_GOOGLE);
        this.e = false;
        long currentTimeMillis = System.currentTimeMillis();
        d(currentTimeMillis);
        e(currentTimeMillis);
        this.d = true;
        this.f.c(str);
        C1699aKz.d.a(this.a, this.f);
    }

    public final void k() {
        synchronized (this) {
            c.getLogTag();
            this.f.j(System.currentTimeMillis());
            this.f.d(PlayIntegrityState.VERIFICATION_IN_PROGRESS);
            C1699aKz.d.a(this.a, this.f);
        }
    }

    public final void d(Status status) {
        synchronized (this) {
            c.getLogTag();
            this.e = false;
            long currentTimeMillis = System.currentTimeMillis();
            b(currentTimeMillis);
            e(currentTimeMillis);
            this.f.d(PlayIntegrityState.ERROR_FAILED_VERIFICATION);
            this.d = true;
            C1690aKq c1690aKq = this.f;
            C1699aKz c1699aKz = C1699aKz.d;
            c1690aKq.c(c1699aKz.c(status));
            c1699aKz.a(this.a, this.f);
            c1699aKz.b(this.a, this.b);
        }
    }

    public final void a(C1683aKj c1683aKj) {
        synchronized (this) {
            C8632dsu.c((Object) c1683aKj, "");
            c.getLogTag();
            this.e = false;
            long currentTimeMillis = System.currentTimeMillis();
            b(currentTimeMillis);
            e(currentTimeMillis);
            this.f.d(PlayIntegrityState.VERIFICATION_PASS);
            this.b = c1683aKj;
            this.d = false;
            C1699aKz c1699aKz = C1699aKz.d;
            c1699aKz.b(this.a, c1683aKj);
            c1699aKz.a(this.a, this.f);
        }
    }
}
