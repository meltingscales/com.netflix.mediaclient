package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;

/* renamed from: o.aPq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1825aPq {
    public static String e(Context context) {
        return C8157dfA.e(context, "preference_key_new_cast_application_id", (String) null);
    }

    public static void e(Context context, String str) {
        C8157dfA.a(context, "preference_key_CURRENT_cast_application_id", str);
    }

    public static boolean b(Context context) {
        return C8157dfA.b(context, "preference_key_push_optin_status", ConfigFastPropertyFeatureControlConfig.Companion.j());
    }

    public static void d(Context context, boolean z) {
        C8157dfA.d(context, "preference_key_push_optin_status", z);
    }
}
