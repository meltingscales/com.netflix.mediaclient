package o;

import com.netflix.mediaclient.storage.db.UserMarksDatabase;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bvI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5251bvI {
    public static final e c = new e(null);
    private static C5251bvI d;
    private final UserMarksDatabase a;
    private final ThreadPoolExecutor e;

    public /* synthetic */ C5251bvI(UserMarksDatabase userMarksDatabase, C8627dsp c8627dsp) {
        this(userMarksDatabase);
    }

    private C5251bvI(UserMarksDatabase userMarksDatabase) {
        this.a = userMarksDatabase;
        this.e = new ThreadPoolExecutor(0, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public final Object c(String str, InterfaceC8585dra<? super List<C5341bwt>> interfaceC8585dra) {
        return this.a.c().c(str, interfaceC8585dra);
    }

    public final Object d(C5341bwt c5341bwt, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e2;
        Object e3 = this.a.c().e(c5341bwt, interfaceC8585dra);
        e2 = C8586drb.e();
        return e3 == e2 ? e3 : dpR.c;
    }

    public final void d(final List<C5341bwt> list) {
        C8632dsu.c((Object) list, "");
        this.e.execute(new Runnable() { // from class: o.bvO
            @Override // java.lang.Runnable
            public final void run() {
                C5251bvI.c(C5251bvI.this, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5251bvI c5251bvI, List list) {
        C8632dsu.c((Object) c5251bvI, "");
        C8632dsu.c((Object) list, "");
        c5251bvI.a.c().d(list);
    }

    public final void e(final String str) {
        C8632dsu.c((Object) str, "");
        this.e.execute(new Runnable() { // from class: o.bvH
            @Override // java.lang.Runnable
            public final void run() {
                C5251bvI.e(C5251bvI.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5251bvI c5251bvI, String str) {
        C8632dsu.c((Object) c5251bvI, "");
        C8632dsu.c((Object) str, "");
        c5251bvI.a.c().a(str);
    }

    public final void b(final String str) {
        C8632dsu.c((Object) str, "");
        this.e.execute(new Runnable() { // from class: o.bvG
            @Override // java.lang.Runnable
            public final void run() {
                C5251bvI.a(C5251bvI.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5251bvI c5251bvI, String str) {
        C8632dsu.c((Object) c5251bvI, "");
        C8632dsu.c((Object) str, "");
        c5251bvI.a.c().e(str);
    }

    /* renamed from: o.bvI$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C5251bvI d() {
            return C5251bvI.d;
        }

        public final void d(C5251bvI c5251bvI) {
            C5251bvI.d = c5251bvI;
        }

        public final C5251bvI e(UserMarksDatabase userMarksDatabase) {
            C8632dsu.c((Object) userMarksDatabase, "");
            if (d() == null) {
                synchronized (C5251bvI.class) {
                    e eVar = C5251bvI.c;
                    if (eVar.d() == null) {
                        eVar.d(new C5251bvI(userMarksDatabase, null));
                    }
                    dpR dpr = dpR.c;
                }
            }
            C5251bvI d = d();
            C8632dsu.d(d);
            return d;
        }
    }
}
