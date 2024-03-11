package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.hilt.EntryPoints;

/* renamed from: o.aPk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819aPk {
    Context b;

    public C1819aPk(Context context) {
        this.b = context;
    }

    public void c(Context context, String str) {
        boolean a = a(context);
        C8157dfA.a(this.b, "fastPropertyConfigData", str);
        if (!a) {
            try {
                C1822aPn.c(str);
            } catch (RuntimeException e) {
                InterfaceC1597aHe.b(new C1596aHd("Error refreshing FP config").b(ErrorType.g).d(e));
                return;
            }
        }
        if (!a || C8168dfL.g(str)) {
            return;
        }
        dEI e2 = AbstractC7773dEv.a.e(str);
        if (e2 instanceof dEP) {
            ((InterfaceC1549aFk) EntryPoints.get(AbstractApplicationC1040Mh.d(), InterfaceC1549aFk.class)).X().e((dEP) e2);
        }
    }

    public static boolean a(Context context) {
        return C8168dfL.h(d(context));
    }

    public static String d(Context context) {
        return C8157dfA.e(context, "fastPropertyConfigData", (String) null);
    }

    public static void b(Context context) {
        context.getSharedPreferences("nfxpref", 0).edit().remove("fastPropertyConfigData").commit();
    }
}
