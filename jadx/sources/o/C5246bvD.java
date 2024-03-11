package o;

import com.netflix.mediaclient.storage.db.OfflineDatabase;
import io.reactivex.Flowable;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: o.bvD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5246bvD {
    private static C5246bvD b;
    public static final c c = new c(null);
    private final ThreadPoolExecutor d;
    private final OfflineDatabase e;

    public /* synthetic */ C5246bvD(OfflineDatabase offlineDatabase, C8627dsp c8627dsp) {
        this(offlineDatabase);
    }

    private C5246bvD(OfflineDatabase offlineDatabase) {
        this.e = offlineDatabase;
        this.d = offlineDatabase.C();
    }

    public final void e(final C5334bwm c5334bwm) {
        C8632dsu.c((Object) c5334bwm, "");
        this.d.execute(new Runnable() { // from class: o.bvC
            @Override // java.lang.Runnable
            public final void run() {
                C5246bvD.a(C5246bvD.this, c5334bwm);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5246bvD c5246bvD, C5334bwm c5334bwm) {
        C8632dsu.c((Object) c5246bvD, "");
        C8632dsu.c((Object) c5334bwm, "");
        c5246bvD.e.I().b(c5334bwm);
    }

    public final Flowable<List<String>> a() {
        Flowable<List<String>> c2 = this.e.I().c();
        C8632dsu.a(c2, "");
        return c2;
    }

    public final Flowable<List<C5334bwm>> d() {
        Flowable<List<C5334bwm>> a = this.e.I().a();
        C8632dsu.a(a, "");
        return a;
    }

    public final Flowable<List<C5334bwm>> b(String str) {
        C8632dsu.c((Object) str, "");
        Flowable<List<C5334bwm>> d = this.e.I().d(str);
        C8632dsu.a(d, "");
        return d;
    }

    public final void d(final String str) {
        if (str != null) {
            this.d.execute(new Runnable() { // from class: o.bvF
                @Override // java.lang.Runnable
                public final void run() {
                    C5246bvD.d(C5246bvD.this, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5246bvD c5246bvD, String str) {
        C8632dsu.c((Object) c5246bvD, "");
        c5246bvD.e.I().c(str);
    }

    public final void b(final C5334bwm c5334bwm, final String str) {
        C8632dsu.c((Object) c5334bwm, "");
        C8632dsu.c((Object) str, "");
        this.d.execute(new Runnable() { // from class: o.bvJ
            @Override // java.lang.Runnable
            public final void run() {
                C5246bvD.d(C5246bvD.this, c5334bwm, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5246bvD c5246bvD, C5334bwm c5334bwm, String str) {
        C8632dsu.c((Object) c5246bvD, "");
        C8632dsu.c((Object) c5334bwm, "");
        C8632dsu.c((Object) str, "");
        c5246bvD.e.I().c(c5334bwm.a(), str);
    }

    public final void c() {
        this.d.execute(new Runnable() { // from class: o.bvK
            @Override // java.lang.Runnable
            public final void run() {
                C5246bvD.b(C5246bvD.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5246bvD c5246bvD) {
        C8632dsu.c((Object) c5246bvD, "");
        c5246bvD.e.I().e();
    }

    public final void a(final C5334bwm c5334bwm) {
        C8632dsu.c((Object) c5334bwm, "");
        this.d.execute(new Runnable() { // from class: o.bvB
            @Override // java.lang.Runnable
            public final void run() {
                C5246bvD.c(C5246bvD.this, c5334bwm);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5246bvD c5246bvD, C5334bwm c5334bwm) {
        C8632dsu.c((Object) c5246bvD, "");
        C8632dsu.c((Object) c5334bwm, "");
        c5246bvD.e.I().d(c5334bwm);
    }

    public final Flowable<List<C5334bwm>> a(String str) {
        C8632dsu.c((Object) str, "");
        Flowable<List<C5334bwm>> a = this.e.I().a(str);
        C8632dsu.a(a, "");
        return a;
    }

    /* renamed from: o.bvD$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final void b(C5246bvD c5246bvD) {
            C5246bvD.b = c5246bvD;
        }

        public final C5246bvD c() {
            return C5246bvD.b;
        }

        public final C5246bvD e(OfflineDatabase offlineDatabase) {
            C8632dsu.c((Object) offlineDatabase, "");
            if (c() == null) {
                synchronized (C5246bvD.class) {
                    c cVar = C5246bvD.c;
                    if (cVar.c() == null) {
                        cVar.b(new C5246bvD(offlineDatabase, null));
                    }
                    dpR dpr = dpR.c;
                }
            }
            C5246bvD c = c();
            C8632dsu.d(c);
            return c;
        }
    }
}
