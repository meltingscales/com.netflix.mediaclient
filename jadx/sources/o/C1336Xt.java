package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Xt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1336Xt {
    public static final C1336Xt a = new C1336Xt();
    private static final TypedValue d = new TypedValue();
    public static final int e = 8;

    private C1336Xt() {
    }

    public static final Typeface c(Activity activity) {
        return a.a(activity, C9834xU.b.q);
    }

    public static final Typeface b(Activity activity) {
        return a.a(activity, C9834xU.b.t);
    }

    public static final Typeface e(Activity activity) {
        return a.a(activity, C9834xU.b.r);
    }

    @SuppressLint({"ResourceCompatGetFontDetector"})
    private final Typeface a(Activity activity, int i) {
        Map d2;
        Map k;
        Throwable th;
        String str;
        String str2;
        Map d3;
        Map k2;
        Throwable th2;
        C8166dfJ.e(null, false, 3, null);
        if (activity != null) {
            Resources.Theme theme = activity.getTheme();
            TypedValue typedValue = d;
            if (theme.resolveAttribute(i, typedValue, true)) {
                try {
                    return ResourcesCompat.getFont(activity, typedValue.resourceId);
                } catch (Resources.NotFoundException e2) {
                    try {
                        String resourceName = activity.getResources().getResourceName(i);
                        C8632dsu.a(resourceName, "");
                        str = C8691duz.b(resourceName, "com.netflix.mediaclient:", "", false, 4, (Object) null);
                    } catch (Resources.NotFoundException unused) {
                        str = "(" + i + " not found)";
                    }
                    int i2 = d.resourceId;
                    try {
                        String resourceName2 = activity.getResources().getResourceName(i2);
                        C8632dsu.a(resourceName2, "");
                        str2 = C8691duz.b(resourceName2, "com.netflix.mediaclient:", "", false, 4, (Object) null);
                    } catch (Resources.NotFoundException unused2) {
                        str2 = "(" + i2 + " not found)";
                    }
                    InterfaceC1593aHa.c.a("getFont failed: " + str + "=" + str2);
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d3 = dqE.d();
                    k2 = dqE.k(d3);
                    C1596aHd c1596aHd = new C1596aHd(null, e2, null, true, k2, false, false, 96, null);
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
                        th2 = c1596aHd.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th2);
                        return null;
                    }
                    dVar.e().b(c1596aHd, th2);
                    return null;
                }
            }
            return null;
        }
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd2 = new C1596aHd("Activity was null", null, null, true, k, false, false, 96, null);
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
            th = c1596aHd2.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a3 = dVar2.a();
        if (a3 != null) {
            a3.e(c1596aHd2, th);
            return null;
        }
        dVar2.e().b(c1596aHd2, th);
        return null;
    }
}
