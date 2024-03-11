package o;

import android.content.Context;
import java.util.Map;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.dpR;

/* renamed from: o.aHi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1601aHi {
    public static final d c = d.c;

    void e(Context context, Map<String, String> map);

    /* renamed from: o.aHi$d */
    /* loaded from: classes.dex */
    public static final class d {
        private static Boolean a;
        private static InterfaceC1598aHf b;
        private static InterfaceC1597aHe d;
        private static InterfaceC1593aHa e;
        static final /* synthetic */ d c = new d();
        private static final C1594aHb h = new C1594aHb(0, 1, null);

        public final InterfaceC1598aHf a() {
            return b;
        }

        public final InterfaceC1593aHa b() {
            return e;
        }

        public final InterfaceC1597aHe c() {
            return d;
        }

        public final Boolean d() {
            return a;
        }

        public final C1594aHb e() {
            return h;
        }

        private d() {
        }

        public final void a(InterfaceC1598aHf interfaceC1598aHf, final InterfaceC1597aHe interfaceC1597aHe, InterfaceC1593aHa interfaceC1593aHa, boolean z) {
            C8632dsu.c((Object) interfaceC1598aHf, "");
            C8632dsu.c((Object) interfaceC1597aHe, "");
            C8632dsu.c((Object) interfaceC1593aHa, "");
            b = interfaceC1598aHf;
            d = interfaceC1597aHe;
            e = interfaceC1593aHa;
            a = Boolean.valueOf(z);
            h.d(new drX<C1596aHd, Throwable, dpR>() { // from class: com.netflix.mediaclient.log.api.LoggingRegistration$Companion$registerInstances$1
                {
                    super(2);
                }

                public final void c(C1596aHd c1596aHd, Throwable th) {
                    C8632dsu.c((Object) c1596aHd, "");
                    C8632dsu.c((Object) th, "");
                    InterfaceC1597aHe.this.d(c1596aHd, th);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(C1596aHd c1596aHd, Throwable th) {
                    c(c1596aHd, th);
                    return dpR.c;
                }
            });
        }
    }
}
