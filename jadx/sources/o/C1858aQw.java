package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.Map;
import o.C1596aHd;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aRL;
import o.dqE;

/* renamed from: o.aQw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1858aQw extends aRM {
    public static final d a = new d(null);
    private static final Map<Integer, aRL.a> b;
    private final String c = "44738";
    private final int e = b.size();
    private final String d = "Updated Metadata Prefetching (Device-Lite)";

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.c;
    }

    @Override // o.aRM
    /* renamed from: i */
    public String a() {
        return this.d;
    }

    /* renamed from: o.aQw$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean a() {
            return (c() == ABTestConfig.Cell.CELL_1 || C8151dev.f() || !C8120deQ.a()) ? false : true;
        }

        public final aRL.a b() {
            Object e;
            e = dqE.e(C1858aQw.b, Integer.valueOf(c().getCellId()));
            return (aRL.a) e;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(C1858aQw.class);
        }
    }

    static {
        Map c;
        Map<Integer, aRL.a> b2;
        c = dqE.c(dpD.a(1, aRL.e.b()), dpD.a(2, new aRL.a("Updated Metadata Prefetching + Lolomo Images Prefetching", true, true)), dpD.a(3, new aRL.a("Updated Metadata Prefetching Only", true, false)), dpD.a(4, new aRL.a("Lolomo Images Prefetching Only", false, true)));
        b2 = dqC.b(c, (drM) new drM<Integer, aRL.a>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab44738_UpdatedMetadataPrefetching_DeviceLite$Companion$features$1
            @Override // o.drM
            public /* synthetic */ aRL.a invoke(Integer num) {
                return c(num.intValue());
            }

            public final aRL.a c(int i) {
                Map d2;
                Map k;
                Throwable th;
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                aVar.a("Invalid test cell num: " + i);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Invalid test cell number", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return aRL.e.b();
            }
        });
        b = b2;
    }
}
