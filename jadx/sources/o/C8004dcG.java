package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC7303ctf;

/* renamed from: o.dcG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8004dcG extends C1045Mp {
    public static final C8004dcG e = new C8004dcG();

    private C8004dcG() {
        super("BookmarksHelper");
    }

    public final long e(String str, long j, long j2, String str2) {
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
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
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
        C5096bsM b2 = aVar.a(d2).b(str2, str);
        return ((b2 != null ? b2.a : -1L) <= j2 || b2 == null) ? j : b2.c;
    }

    public final int a(InterfaceC5227bul interfaceC5227bul, String str) {
        C8632dsu.c((Object) interfaceC5227bul, "");
        InterfaceC5160btX aE_ = interfaceC5227bul.aE_();
        C8632dsu.a(aE_, "");
        return a(e(aE_.aH_(), interfaceC5227bul.aq_(), aE_.aG_(), str), aE_.aJ_(), aE_.ay_());
    }

    public final int a(long j, int i, Integer num) {
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

    public final int b(InterfaceC5160btX interfaceC5160btX) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        InteractiveSummary az_ = interfaceC5160btX.az_();
        if (az_ == null || !az_.isBranchingNarrative()) {
            return interfaceC5160btX.g() - ((int) TimeUnit.MILLISECONDS.toSeconds(interfaceC5160btX.aF_()));
        }
        return -1;
    }
}
