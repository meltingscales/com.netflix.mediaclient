package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.aCt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1477aCt {
    public static final c d = c.b;

    InterfaceC9101jI a(C1567aGb c1567aGb, boolean z);

    /* renamed from: o.aCt$c */
    /* loaded from: classes3.dex */
    public static final class c {
        static final /* synthetic */ c b = new c();

        private c() {
        }

        public final C8942gI<?> e(C8942gI<?> c8942gI) {
            C8632dsu.c((Object) c8942gI, "");
            c8942gI.e("x-netflix.client.android.mslrequest", "true");
            return c8942gI;
        }

        public final boolean e(C9008hV c9008hV) {
            boolean a;
            boolean a2;
            C8632dsu.c((Object) c9008hV, "");
            List<C9006hT> b2 = c9008hV.b();
            if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                for (C9006hT c9006hT : b2) {
                    a = C8691duz.a(c9006hT.b(), "x-netflix.client.android.mslrequest", true);
                    if (a) {
                        a2 = C8691duz.a(c9006hT.a(), "true", true);
                        if (a2) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
