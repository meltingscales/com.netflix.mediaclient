package o;

import android.app.Activity;
import java.util.List;
import o.C4278bbW;
import org.json.JSONObject;

/* renamed from: o.bcc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4337bcc {
    public static boolean a() {
        List<C4278bbW.b> list = C4278bbW.a().e;
        return list == null || list.size() == 0;
    }

    public static boolean a(Activity activity) {
        if (a()) {
            return false;
        }
        return C4278bbW.a().e(activity);
    }

    public static JSONObject e() {
        return C4278bbW.d();
    }

    public static long d() {
        return C4278bbW.a().a;
    }
}
