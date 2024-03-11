package o;

import android.content.Context;

/* renamed from: o.brK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5041brK {
    public static final C5041brK a = new C5041brK();

    private C5041brK() {
    }

    public static final boolean a(Context context) {
        C8632dsu.c((Object) context, "");
        return C8157dfA.b(context, "pref_performance_force_zipkin_trace", false);
    }

    public static final String c(Context context) {
        C8632dsu.c((Object) context, "");
        return C8157dfA.e(context, "schema_variant", (String) null);
    }
}
