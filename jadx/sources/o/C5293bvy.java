package o;

import com.netflix.mediaclient.storage.db.OfflineDatabase;
import java.util.List;

/* renamed from: o.bvy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5293bvy extends C1045Mp {
    private static C5293bvy c;
    public static final e e = new e(null);
    private final OfflineDatabase a;

    public /* synthetic */ C5293bvy(OfflineDatabase offlineDatabase, C8627dsp c8627dsp) {
        this(offlineDatabase);
    }

    /* renamed from: o.bvy$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C5293bvy b() {
            return C5293bvy.c;
        }

        public final void c(C5293bvy c5293bvy) {
            C5293bvy.c = c5293bvy;
        }

        public final C5293bvy b(OfflineDatabase offlineDatabase) {
            C8632dsu.c((Object) offlineDatabase, "");
            if (b() == null) {
                synchronized (C5293bvy.class) {
                    e eVar = C5293bvy.e;
                    if (eVar.b() == null) {
                        eVar.c(new C5293bvy(offlineDatabase, null));
                    }
                    dpR dpr = dpR.c;
                }
            }
            C5293bvy b = b();
            C8632dsu.d(b);
            return b;
        }
    }

    private C5293bvy(OfflineDatabase offlineDatabase) {
        super("OfflinePlayableRepo");
        this.a = offlineDatabase;
    }

    public final void b(List<? extends C5332bwk> list) {
        C8632dsu.c((Object) list, "");
        C8166dfJ.b(null, false, 3, null);
        if (!list.isEmpty()) {
            this.a.D().d(list);
        }
    }

    public final void b(C5332bwk c5332bwk) {
        C8632dsu.c((Object) c5332bwk, "");
        System.currentTimeMillis();
        this.a.D().b(c5332bwk);
        System.currentTimeMillis();
    }

    public final List<C5332bwk> e() {
        C8166dfJ.b(null, false, 3, null);
        System.currentTimeMillis();
        List<C5332bwk> a = this.a.D().a();
        System.currentTimeMillis();
        C8632dsu.d(a);
        return a;
    }

    public final void e(List<C5332bwk> list) {
        C8632dsu.c((Object) list, "");
        C8166dfJ.b(null, false, 3, null);
        System.currentTimeMillis();
        this.a.D().c(list);
        System.currentTimeMillis();
    }
}
