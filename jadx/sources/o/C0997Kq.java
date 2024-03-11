package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Kq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0997Kq extends IQ {
    private final String a;
    private final boolean e;

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0997Kq(String str, boolean z) {
        super("RefreshSeasonsAndEpisodes");
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = z;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        C0956Jb.d(list, this.a, this.e);
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8329diN c8329diN = (C8329diN) iy.d.a(IE.b(SignupConstants.Field.VIDEOS, this.a));
        if (c8329diN == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "RefreshSeasonsAndEpisodes empty response for " + this.a;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                Throwable th3 = c1596aHd.i;
                if (th3 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th2 = th3;
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
            } else {
                dVar.e().b(c1596aHd, th2);
            }
            interfaceC1757aNc.c((InterfaceC5194buE) null, InterfaceC1078Nw.ai);
            return;
        }
        if (this.e && c8329diN.getType() == VideoType.SHOW) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd2 = new C1596aHd("RefreshSeasonsAndEpisodes expected Movie, got Show", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
        }
        interfaceC1757aNc.c(c8329diN, InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.c((InterfaceC5194buE) null, status);
    }
}
