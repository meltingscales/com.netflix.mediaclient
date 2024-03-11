package o;

import android.content.Context;

/* renamed from: o.bbR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4273bbR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Context context) {
        return C8157dfA.e(context, "pref_offline_country_code", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Context context, String str) {
        C8157dfA.a(context, "pref_offline_country_code", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Context context) {
        return C8157dfA.e(context, "pref_offline_profile_guid", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context, String str) {
        C8157dfA.a(context, "pref_offline_profile_guid", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        return C8157dfA.b(context, "pref_offline_download_paused", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Context context, boolean z) {
        C8157dfA.d(context, "pref_offline_download_paused", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, int i) {
        C8157dfA.a(context, "pref_offline_current_regId", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context, int i) {
        return C8157dfA.c(context, "pref_offline_current_regId") && C8157dfA.d(context, "pref_offline_current_regId", -1) == i;
    }
}
