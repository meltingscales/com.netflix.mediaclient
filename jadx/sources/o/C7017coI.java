package o;

import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.coI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7017coI {
    public static final a c = new a(null);
    private final drM<e<dpR, dpR>, dpR> d;
    private final ConcurrentHashMap<b<?, ?>, drM<e<?, ?>, Object>> e;

    public static final C7017coI a() {
        return c.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7017coI(drM<? super e<dpR, dpR>, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.d = drm;
        this.e = new ConcurrentHashMap<>(8, 0.9f, 1);
    }

    /* renamed from: o.coI$b */
    /* loaded from: classes.dex */
    public static class b<SOURCE, DATA> {
        private final String e;

        public final String b() {
            return this.e;
        }

        public b(String str) {
            C8632dsu.c((Object) str, "");
            this.e = str;
        }
    }

    /* renamed from: o.coI$e */
    /* loaded from: classes.dex */
    public static final class e<SOURCE, DATA> {
        private final String b;
        private final drM<e<SOURCE, DATA>, Object> c;
        private SOURCE d;
        private DATA e;

        public final String a() {
            return this.b;
        }

        public final DATA b() {
            return this.e;
        }

        public final e<SOURCE, DATA> d(DATA data) {
            this.e = data;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, drM<? super e<SOURCE, DATA>, ? extends Object> drm) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) drm, "");
            this.b = str;
            this.c = drm;
        }

        public final SOURCE e() {
            SOURCE source = this.d;
            if (source != null) {
                return source;
            }
            throw new IllegalStateException("source() should be called from the navigate block");
        }

        public final DATA d() {
            DATA data = this.e;
            if (data != null) {
                return data;
            }
            throw new IllegalArgumentException("Required data not passed to the route");
        }

        public final void b(SOURCE source) {
            C8166dfJ.e(null, false, 3, null);
            this.d = source;
            if (this.c.invoke(this) instanceof Intent) {
                throw new IllegalStateException("If you register with an activity class you need to call createIntent(...)");
            }
        }
    }

    /* renamed from: o.coI$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final void d(drM<? super e<dpR, dpR>, dpR> drm) {
            C8632dsu.c((Object) drm, "");
            C1332Xp.a(C7017coI.class, new C7017coI(drm));
        }

        public final C7017coI e() {
            C1332Xp c1332Xp = C1332Xp.b;
            return (C7017coI) C1332Xp.b(C7017coI.class);
        }
    }

    public final <SOURCE, DATA> void b(b<SOURCE, DATA> bVar, drM<? super e<SOURCE, DATA>, dpR> drm) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) drm, "");
        a(bVar, drm);
    }

    private final <SOURCE, DATA> void a(b<SOURCE, DATA> bVar, drM<? super e<SOURCE, DATA>, ? extends Object> drm) {
        ConcurrentHashMap<b<?, ?>, drM<e<?, ?>, Object>> concurrentHashMap = this.e;
        C8632dsu.d(drm);
        concurrentHashMap.put(bVar, (drM) dsH.a(drm, 1));
    }

    public final <SOURCE, DATA> e<SOURCE, DATA> d(b<SOURCE, DATA> bVar) {
        C8632dsu.c((Object) bVar, "");
        drM<e<?, ?>, Object> drm = this.e.get(bVar);
        drM<e<?, ?>, Object> drm2 = dsH.c(drm, 1) ? drm : null;
        if (drm2 != null) {
            return new e<>(bVar.b(), drm2);
        }
        return new e<>(bVar.b(), this.d);
    }
}
