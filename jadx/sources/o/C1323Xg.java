package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC7303ctf;

/* renamed from: o.Xg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1323Xg extends C1045Mp {
    public static final C1323Xg b = new C1323Xg();

    private C1323Xg() {
        super("BookmarksHelper");
    }

    private final long a(String str, long j, long j2, String str2) {
        Map d;
        Map k;
        Throwable th;
        if (str == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-19459: playableId is null in getUIBookmarkPositionInSeconds", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
        InterfaceC7303ctf.a aVar = InterfaceC7303ctf.c;
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        C5096bsM b3 = aVar.a(d2).b(str2, str);
        return ((b3 != null ? b3.a : -1L) <= j2 || b3 == null) ? j : b3.c;
    }

    public final int b(InterfaceC5227bul interfaceC5227bul) {
        C8632dsu.c((Object) interfaceC5227bul, "");
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        if (j == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(j, "");
        String profileGuid = j.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        InterfaceC5160btX aE_ = interfaceC5227bul.aE_();
        C8632dsu.a(aE_, "");
        return d(a(aE_.aH_(), interfaceC5227bul.aq_(), aE_.aG_(), profileGuid), aE_.aJ_(), aE_.ay_());
    }

    private final int d(long j, int i, Integer num) {
        int i2;
        if (num != null) {
            return num.intValue();
        }
        if (i > 0) {
            i2 = C8657dts.i((int) ((j / 10) / i), 100);
            return i2;
        }
        return 0;
    }
}
