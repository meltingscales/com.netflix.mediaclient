package o;

import android.content.Context;
import android.os.Build;
import android.os.Trace;

/* renamed from: o.aVx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993aVx {
    public static final C1993aVx d = new C1993aVx();

    private C1993aVx() {
    }

    public static final boolean b(Context context) {
        C8632dsu.c((Object) context, "");
        return C8157dfA.b(context, "pref_performance_enable_os_trace", false);
    }

    public static final boolean e(Context context) {
        boolean isEnabled;
        C8632dsu.c((Object) context, "");
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            if (isEnabled && b(context)) {
                return true;
            }
        }
        return false;
    }
}
