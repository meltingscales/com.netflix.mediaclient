package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.schedulers.Schedulers;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.dfA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8157dfA {
    public static final C8157dfA e = new C8157dfA();

    private C8157dfA() {
    }

    public static final boolean b(Context context, String str, boolean z) {
        C8157dfA c8157dfA = e;
        return !c8157dfA.b(context, str) ? z : c8157dfA.g(context).getBoolean(str, z);
    }

    public static final void d(Context context, String str, boolean z) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            c8157dfA.g(context).edit().putBoolean(str, z).apply();
        }
    }

    public static final int d(Context context, String str, int i) {
        C8157dfA c8157dfA = e;
        return !c8157dfA.b(context, str) ? i : c8157dfA.g(context).getInt(str, i);
    }

    public static final void a(Context context, String str, int i) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            c8157dfA.g(context).edit().putInt(str, i).apply();
        }
    }

    public static final long b(Context context, String str, long j) {
        C8157dfA c8157dfA = e;
        return !c8157dfA.b(context, str) ? j : c8157dfA.g(context).getLong(str, j);
    }

    public static final void e(Context context, String str, long j) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            c8157dfA.g(context).edit().putLong(str, j).apply();
        }
    }

    public static final float d(Context context, String str, float f) {
        C8157dfA c8157dfA = e;
        return !c8157dfA.b(context, str) ? f : c8157dfA.g(context).getFloat(str, f);
    }

    public static final void b(Context context, String str, float f) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            c8157dfA.g(context).edit().putFloat(str, f).apply();
        }
    }

    public static final String e(Context context, String str, String str2) {
        C8157dfA c8157dfA = e;
        return !c8157dfA.b(context, str) ? str2 : c8157dfA.g(context).getString(str, str2);
    }

    public static final void a(Context context, String str, String str2) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            c8157dfA.g(context).edit().putString(str, str2).apply();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static final void a(Context context, String str) {
        C8632dsu.c((Object) context, "");
        if (str != null) {
            e.g(context).edit().putString("NF_CrashReport_Log_Blob", str).apply();
        }
    }

    public static final String b(Context context) {
        C8632dsu.c((Object) context, "");
        String e2 = e(context, "NF_CrashReport_Log_Blob", (String) null);
        e(context, "NF_CrashReport_Log_Blob");
        return e2;
    }

    @SuppressLint({"ApplySharedPref"})
    public static final void d(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        e.g(context).edit().putString("NF_CrashReport", str).commit();
    }

    public static final String d(Context context) {
        C8632dsu.c((Object) context, "");
        String e2 = e(context, "NF_CrashReport", (String) null);
        e(context, "NF_CrashReport");
        return e2;
    }

    public static final void e(Context context, String str) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            c8157dfA.g(context).edit().remove(str).apply();
        }
    }

    public static final boolean c(Context context, String str) {
        C8157dfA c8157dfA = e;
        if (c8157dfA.b(context, str)) {
            return c8157dfA.g(context).contains(str);
        }
        return false;
    }

    public final void j(final Context context) {
        C8632dsu.c((Object) context, "");
        Schedulers.io().scheduleDirect(new Runnable() { // from class: o.dfB
            @Override // java.lang.Runnable
            public final void run() {
                C8157dfA.f(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Context context) {
        C8632dsu.c((Object) context, "");
        e.g(context).edit().commit();
    }

    public static final void e(Context context) {
        C8632dsu.c((Object) context, "");
        e.g(context).edit().clear().apply();
    }

    private final SharedPreferences g(Context context) {
        C8632dsu.d(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("nfxpref", 0);
        C8632dsu.a(sharedPreferences, "");
        return sharedPreferences;
    }

    private final boolean b(Context context, String str) {
        Throwable th;
        Throwable th2;
        if (context == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd c1596aHd = new C1596aHd("PreferenceUtils, context is null!", null, null, true, dqF.d(dqF.c()), false, false, 96, null);
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
            return false;
        } else if (str == null) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            C1596aHd c1596aHd2 = new C1596aHd("PreferenceUtils, name is null!", null, null, true, dqF.d(dqF.c()), false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c2 = errorType2.c();
                    c1596aHd2.a(c2 + " " + b2);
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
            return false;
        } else {
            return true;
        }
    }

    public final void i(Context context) {
        C8632dsu.c((Object) context, "");
        d(context, "force_config_on_start", true);
    }

    public static final boolean a(Context context) {
        C8632dsu.c((Object) context, "");
        boolean b = b(context, "force_config_on_start", false);
        e(context, "force_config_on_start");
        return b;
    }
}
