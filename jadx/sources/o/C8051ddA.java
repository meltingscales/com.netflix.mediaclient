package o;

import android.net.Uri;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.ddA  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8051ddA {
    public static final List<String> e(String str) {
        boolean d;
        List<String> e;
        List<String> e2;
        C8632dsu.c((Object) str, "");
        d = duD.d((CharSequence) str, (CharSequence) "help.netflix.com", false, 2, (Object) null);
        if (d) {
            e2 = C8566dqi.e("CUSTOMER_SUPPORT_VIA_INAPP_LINK");
            return e2;
        }
        e = C8566dqi.e("DEFAULT");
        return e;
    }

    public static final String c(String str, String str2) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        try {
            buildUpon.appendQueryParameter("nftoken", URLDecoder.decode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("should not happen", e, null, true, k, false, false, 96, null);
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
        String uri = buildUpon.build().toString();
        C8632dsu.a(uri, "");
        return uri;
    }
}
