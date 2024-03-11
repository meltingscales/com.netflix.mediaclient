package o;

import android.content.SharedPreferences;
import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.Xn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1330Xn {
    public static final C1330Xn c = new C1330Xn();

    private C1330Xn() {
    }

    public final boolean d(boolean z) {
        return e().getBoolean(d(), z);
    }

    public final void c(boolean z) {
        e().edit().putBoolean(d(), z).apply();
    }

    private final SharedPreferences e() {
        SharedPreferences sharedPreferences = AbstractApplicationC1040Mh.getInstance().getApplicationContext().getSharedPreferences("com.netflix.android.companion_mode_feature_education", 0);
        C8632dsu.a(sharedPreferences, "");
        return sharedPreferences;
    }

    private final String d() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        if (j == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(j, "");
        String profileGuid = j.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        return "com.netflix.android.companion_mode_feature_education_" + profileGuid;
    }
}
