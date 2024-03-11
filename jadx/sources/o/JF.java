package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public final class JF extends IT {
    public static final b i = new b(null);
    private final InterfaceC1242Ud g;
    private final boolean h;

    @Override // o.IT
    protected boolean u() {
        return this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JF(C0954Iz<?> c0954Iz, String str, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchNotificationSummary", c0954Iz, interfaceC1757aNc);
        C8632dsu.c((Object) c0954Iz, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        this.h = z;
        InterfaceC1242Ud b2 = IE.b("notifications", str, "summary");
        C8632dsu.a(b2, "");
        this.g = b2;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("FetchNotificationSummaryTask");
        }
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.g);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b2 = this.d.b(this.g);
        C8325diJ c8325diJ = b2 instanceof C8325diJ ? (C8325diJ) b2 : null;
        if ((c8325diJ != null ? c8325diJ.b : null) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = i.getLogTag() + ": no value for notification summary. notification: " + c8325diJ;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b3 = c1596aHd.b();
                if (b3 != null) {
                    c1596aHd.a(errorType.c() + " " + b3);
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
        }
        interfaceC1757aNc.e(c8325diJ != null ? c8325diJ.b : null, InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        this.e.e((NotificationSummaryItem) null, status);
    }
}
