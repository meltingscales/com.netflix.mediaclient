package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.cuT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7344cuT {
    private final Context a;
    private final String e;
    public static final b c = new b(null);
    public static final int b = 8;

    public C7344cuT(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        this.a = context;
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        this.e = profileGuid;
    }

    /* renamed from: o.cuT$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SharedPreferences c(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.netflix.android.fullscreen_tutorial", 0);
            C8632dsu.a(sharedPreferences, "");
            return sharedPreferences;
        }

        public final String a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            return str + "_" + str2;
        }
    }

    public final boolean e(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        return b().getBoolean(c.a(str, this.e), z);
    }

    public final void d(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        b().edit().putBoolean(c.a(str, this.e), z).apply();
    }

    private final SharedPreferences b() {
        return c.c(this.a);
    }
}
