package o;

import android.content.Context;
import android.os.Build;
import com.google.gson.JsonParseException;

/* loaded from: classes3.dex */
public final class aPJ {
    public static final aPJ e = new aPJ();

    private aPJ() {
    }

    public final void c(Context context, String str, String str2, String str3) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        if (Build.VERSION.SDK_INT <= 28) {
            return;
        }
        try {
            aPI c = c(context);
            if (c == null || c.b()) {
                d(context, new aPI(str2, str, System.currentTimeMillis(), str3));
            }
        } catch (JsonParseException unused) {
        }
    }

    public final String b(Context context, String str, String str2) {
        C8632dsu.c((Object) context, "");
        aPI c = c(context);
        if (c != null && C8632dsu.c((Object) c.e(), (Object) str) && C8632dsu.c((Object) c.c(), (Object) str2)) {
            return c.d();
        }
        return null;
    }

    private final aPI c(Context context) {
        String e2 = C8157dfA.e(context, "wv_keyrequest_sample_data", (String) null);
        if (e2 != null) {
            return (aPI) C8118deO.a().fromJson(e2, (Class<Object>) aPI.class);
        }
        return null;
    }

    private final void d(Context context, aPI api) {
        C8157dfA.a(context, "wv_keyrequest_sample_data", C8118deO.a().toJson(api));
    }
}
