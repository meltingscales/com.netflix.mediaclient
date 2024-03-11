package o;

import com.netflix.mediaclient.storage.db.OfflineDatabase;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: o.bvv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5290bvv {
    private static C5290bvv c;
    public static final b e = new b(null);
    private final OfflineDatabase b;
    private final ThreadPoolExecutor d;

    public /* synthetic */ C5290bvv(OfflineDatabase offlineDatabase, C8627dsp c8627dsp) {
        this(offlineDatabase);
    }

    private C5290bvv(OfflineDatabase offlineDatabase) {
        this.b = offlineDatabase;
        this.d = offlineDatabase.C();
    }

    /* renamed from: o.bvv$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final void a(C5290bvv c5290bvv) {
            C5290bvv.c = c5290bvv;
        }

        public final C5290bvv d() {
            return C5290bvv.c;
        }

        public final C5290bvv a(OfflineDatabase offlineDatabase) {
            C8632dsu.c((Object) offlineDatabase, "");
            if (d() == null) {
                synchronized (C5290bvv.class) {
                    b bVar = C5290bvv.e;
                    if (bVar.d() == null) {
                        bVar.a(new C5290bvv(offlineDatabase, null));
                    }
                    dpR dpr = dpR.c;
                }
            }
            C5290bvv d = d();
            C8632dsu.d(d);
            return d;
        }
    }

    public final void d(final List<C5328bwg> list) {
        C8632dsu.c((Object) list, "");
        if (!list.isEmpty()) {
            this.d.execute(new Runnable() { // from class: o.bvr
                @Override // java.lang.Runnable
                public final void run() {
                    C5290bvv.b(C5290bvv.this, list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5290bvv c5290bvv, List list) {
        C8632dsu.c((Object) c5290bvv, "");
        C8632dsu.c((Object) list, "");
        c5290bvv.b.z().c(list);
    }

    public final void b(final C5328bwg c5328bwg) {
        C8632dsu.c((Object) c5328bwg, "");
        this.d.execute(new Runnable() { // from class: o.bvs
            @Override // java.lang.Runnable
            public final void run() {
                C5290bvv.d(C5290bvv.this, c5328bwg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5290bvv c5290bvv, C5328bwg c5328bwg) {
        C8632dsu.c((Object) c5290bvv, "");
        C8632dsu.c((Object) c5328bwg, "");
        c5290bvv.b.z().b(c5328bwg);
    }

    public final List<C5328bwg> a() {
        C8166dfJ.b(null, false, 3, null);
        List<C5328bwg> c2 = this.b.z().c();
        C8632dsu.a(c2, "");
        return c2;
    }

    public final void b(final List<String> list) {
        C8632dsu.c((Object) list, "");
        this.d.execute(new Runnable() { // from class: o.bvu
            @Override // java.lang.Runnable
            public final void run() {
                C5290bvv.e(list, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List list, C5290bvv c5290bvv) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c5290bvv, "");
        if (!list.isEmpty()) {
            c5290bvv.b.z().e(list);
        }
    }

    public final void a(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d.execute(new Runnable() { // from class: o.bvt
            @Override // java.lang.Runnable
            public final void run() {
                C5290bvv.e(C5290bvv.this, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5290bvv c5290bvv, String str, String str2) {
        C8632dsu.c((Object) c5290bvv, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        c5290bvv.b.z().a(str, str2);
    }
}
