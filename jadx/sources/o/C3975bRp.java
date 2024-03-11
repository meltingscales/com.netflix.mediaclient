package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.bRp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3975bRp implements InterfaceC3977bRr {
    public static final b d = new b(null);
    private final String c;
    private final Context e;

    public C3975bRp(Context context, InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5283bvo, "");
        this.e = context;
        String profileGuid = interfaceC5283bvo.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        this.c = profileGuid;
    }

    /* renamed from: o.bRp$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SharedPreferences a(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.netflix.android.games", 0);
            C8632dsu.a(sharedPreferences, "");
            return sharedPreferences;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(String str, String str2) {
            return str + "_" + str2;
        }
    }

    @Override // o.InterfaceC3977bRr
    public boolean a() {
        b bVar = d;
        return !bVar.a(this.e).getBoolean(bVar.a("interstitial_shown", this.c), false);
    }

    @Override // o.InterfaceC3977bRr
    public void b() {
        b bVar = d;
        bVar.a(this.e).edit().putBoolean(bVar.a("interstitial_shown", this.c), true).apply();
    }
}
