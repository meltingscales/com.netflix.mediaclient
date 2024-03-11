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

/* renamed from: o.aQx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859aQx extends aRM {
    public static final e b = new e(null);
    private static final Map<Integer, aRL.a> d;
    private final String e = "43302";
    private final int c = d.size();
    private final String a = "Updated Metadata Prefetching (Network-Lite)";

    @Override // o.aRM
    public boolean N_() {
        return true;
    }

    @Override // o.aRM
    public String d() {
        return this.e;
    }

    @Override // o.aRM
    /* renamed from: j */
    public String a() {
        return this.a;
    }

    /* renamed from: o.aQx$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean a() {
            return (b() == ABTestConfig.Cell.CELL_1 || C8151dev.f() || C8120deQ.a()) ? false : true;
        }

        public final aRL.a d() {
            Object e;
            e = dqE.e(C1859aQx.d, Integer.valueOf(b().getCellId()));
            return (aRL.a) e;
        }

        private final ABTestConfig.Cell b() {
            return C1818aPj.e(C1859aQx.class);
        }
    }

    static {
        Map c;
        Map<Integer, aRL.a> b2;
        c = dqE.c(dpD.a(1, aRL.e.b()), dpD.a(2, new aRL.a("Updated Metadata Prefetching + Lolomo Images Prefetching", true, true)), dpD.a(3, new aRL.a("Updated Metadata Prefetching Only", true, false)), dpD.a(4, new aRL.a("Lolomo Images Prefetching Only", false, true)));
        b2 = dqC.b(c, (drM) new drM<Integer, aRL.a>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab43302_UpdatedMetadataPrefetching_NetworkLite$Companion$features$1
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
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return aRL.e.b();
            }
        });
        d = b2;
    }
}
