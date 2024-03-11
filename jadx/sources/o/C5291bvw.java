package o;

import com.netflix.mediaclient.storage.db.OfflineDatabase;
import java.util.List;

/* renamed from: o.bvw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5291bvw extends C1045Mp {
    private static C5291bvw a;
    public static final d b = new d(null);
    private final OfflineDatabase d;

    public /* synthetic */ C5291bvw(OfflineDatabase offlineDatabase, C8627dsp c8627dsp) {
        this(offlineDatabase);
    }

    /* renamed from: o.bvw$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final void a(C5291bvw c5291bvw) {
            C5291bvw.a = c5291bvw;
        }

        public final C5291bvw c() {
            return C5291bvw.a;
        }

        public final C5291bvw c(OfflineDatabase offlineDatabase) {
            C8632dsu.c((Object) offlineDatabase, "");
            if (c() == null) {
                synchronized (C5291bvw.class) {
                    d dVar = C5291bvw.b;
                    if (dVar.c() == null) {
                        dVar.a(new C5291bvw(offlineDatabase, null));
                    }
                    dpR dpr = dpR.c;
                }
            }
            C5291bvw c = c();
            C8632dsu.d(c);
            return c;
        }
    }

    private C5291bvw(OfflineDatabase offlineDatabase) {
        super("OfflineFalkorRepo");
        this.d = offlineDatabase;
    }

    public final void d(C5327bwf c5327bwf) {
        C8632dsu.c((Object) c5327bwf, "");
        C8166dfJ.b(null, false, 3, null);
        System.currentTimeMillis();
        this.d.A().c(c5327bwf);
        System.currentTimeMillis();
    }

    public final void d(List<? extends C5327bwf> list) {
        C8632dsu.c((Object) list, "");
        C8166dfJ.b(null, false, 3, null);
        System.currentTimeMillis();
        this.d.A().c((List<C5327bwf>) list);
        System.currentTimeMillis();
    }

    public final List<C5336bwo> b() {
        C8166dfJ.b(null, false, 3, null);
        List<C5336bwo> d2 = this.d.B().d();
        C8632dsu.a(d2, "");
        return d2;
    }

    public final void d(final C5336bwo c5336bwo) {
        C8632dsu.c((Object) c5336bwo, "");
        C8166dfJ.b(null, false, 3, null);
        this.d.runInTransaction(new Runnable() { // from class: o.bvz
            @Override // java.lang.Runnable
            public final void run() {
                C5291bvw.b(C5291bvw.this, c5336bwo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5291bvw c5291bvw, C5336bwo c5336bwo) {
        C8632dsu.c((Object) c5291bvw, "");
        C8632dsu.c((Object) c5336bwo, "");
        if (c5291bvw.d.B().b(c5336bwo.e, c5336bwo.a, c5336bwo.d) == 0) {
            c5291bvw.d.B().c(c5336bwo);
        }
    }

    public final void a(List<C5327bwf> list) {
        C8632dsu.c((Object) list, "");
        C8166dfJ.b(null, false, 3, null);
        System.currentTimeMillis();
        if (!list.isEmpty()) {
            this.d.A().a(list);
        }
        System.currentTimeMillis();
    }

    public final void c(List<? extends C5336bwo> list) {
        C8632dsu.c((Object) list, "");
        C8166dfJ.b(null, false, 3, null);
        if (!list.isEmpty()) {
            this.d.B().a(list);
        }
    }

    public final List<C5327bwf> c() {
        C8166dfJ.b(null, false, 3, null);
        System.currentTimeMillis();
        List<C5327bwf> b2 = this.d.A().b();
        System.currentTimeMillis();
        C8632dsu.d(b2);
        return b2;
    }
}
