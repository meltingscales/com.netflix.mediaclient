package o;

import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.ddS  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8069ddS extends C1045Mp {
    public static final C8069ddS c = new C8069ddS();

    private C8069ddS() {
        super("nf_browser");
    }

    public static final Intent c(Uri uri) {
        C8632dsu.c((Object) uri, "");
        if (C8054ddD.i()) {
            return c.e(uri);
        }
        return c.b(uri);
    }

    private final Intent e(Uri uri) {
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("https", "", null));
        C8632dsu.a(data, "");
        Intent data2 = new Intent().setAction("android.intent.action.VIEW").addFlags(268435456).addCategory("android.intent.category.BROWSABLE").setData(uri);
        C8632dsu.a(data2, "");
        data2.setSelector(data);
        return data2;
    }

    private final Intent b(Uri uri) {
        Intent addFlags = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER").setData(uri).addFlags(268435456);
        C8632dsu.a(addFlags, "");
        return addFlags;
    }

    public final void a(Throwable th) {
        Throwable th2;
        C8632dsu.c((Object) th, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd d = new C1596aHd("SPY-36966: Unable to launch browser", null, null, false, null, false, false, 126, null).b(true).b(ErrorType.f).d(th);
        ErrorType errorType = d.a;
        if (errorType != null) {
            d.e.put("errorType", errorType.c());
            String b = d.b();
            if (b != null) {
                String c2 = errorType.c();
                d.a(c2 + " " + b);
            }
        }
        if (d.b() != null && d.i != null) {
            th2 = new Throwable(d.b(), d.i);
        } else if (d.b() != null) {
            th2 = new Throwable(d.b());
        } else {
            th2 = d.i;
            if (th2 == null) {
                th2 = new Throwable("Handled exception with no message");
            } else if (th2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(d, th2);
        } else {
            dVar.e().b(d, th2);
        }
    }
}
