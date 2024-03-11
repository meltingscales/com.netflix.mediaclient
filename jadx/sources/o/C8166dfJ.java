package o;

import android.os.Looper;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import java.util.Map;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.dfJ */
/* loaded from: classes.dex */
public final class C8166dfJ {
    private static final InterfaceC8554dpx b;

    public static final boolean b(String str) {
        return e(str, false, 2, null);
    }

    public static final boolean c() {
        return b(null, false, 3, null);
    }

    public static final boolean c(String str) {
        return b(str, false, 2, null);
    }

    public static final boolean d() {
        return e(null, false, 3, null);
    }

    public static final boolean e(String str) {
        C8632dsu.c((Object) str, "");
        return true;
    }

    static {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<Looper>() { // from class: com.netflix.mediaclient.util.ThreadUtilsKt$lazyMainLooper$2
            @Override // o.drO
            /* renamed from: b */
            public final Looper invoke() {
                return Looper.getMainLooper();
            }
        });
        b = b2;
    }

    private static final Looper e() {
        return (Looper) b.getValue();
    }

    public static final boolean a() {
        return C8632dsu.c(Looper.myLooper(), e());
    }

    public static /* synthetic */ boolean e(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return e(str, z);
    }

    public static final boolean e(String str, boolean z) {
        if (a()) {
            return true;
        }
        if (str == null) {
            str = "Not on main thread when we should be.";
        }
        a(z, str);
        return true;
    }

    public static /* synthetic */ boolean b(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return b(str, z);
    }

    public static final boolean b(String str, boolean z) {
        if (a()) {
            if (str == null) {
                str = "On main thread when we should not be.";
            }
            a(z, str);
            return true;
        }
        return true;
    }

    private static final void a(boolean z, String str) {
        Map k;
        Throwable th;
        if (z) {
            throw new IllegalStateException(str);
        }
        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
        ErrorType errorType = ErrorType.t;
        k = dqE.k(new LinkedHashMap());
        C1596aHd c1596aHd = new C1596aHd(str, null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c = errorType2.c();
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
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1597aHe c2 = dVar2.c();
        if (c2 != null) {
            c2.d(c1596aHd, th);
        } else {
            dVar2.e().b(c1596aHd, th);
        }
    }
}
