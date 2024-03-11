package o;

import android.content.Context;
import android.provider.Telephony;

/* renamed from: o.Pt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1128Pt {
    private static final C1128Pt a;
    public static final b b = new b(null);
    private static final C1128Pt c;
    private static final C1128Pt d;
    private static final C1128Pt e;
    private static final C1128Pt f;
    private static final C1128Pt g;
    private static final C1128Pt h;
    private static final C1128Pt i;
    private static final C1128Pt j;
    private static final C1128Pt k;
    private static final C1128Pt l;
    private static final C1128Pt m;

    /* renamed from: o  reason: collision with root package name */
    private static final C1128Pt f13390o;
    private final String n;
    private final String s;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1128Pt) {
            C1128Pt c1128Pt = (C1128Pt) obj;
            return C8632dsu.c((Object) this.n, (Object) c1128Pt.n) && C8632dsu.c((Object) this.s, (Object) c1128Pt.s);
        }
        return false;
    }

    public final String f() {
        return this.n;
    }

    public final String g() {
        return this.s;
    }

    public int hashCode() {
        return (this.n.hashCode() * 31) + this.s.hashCode();
    }

    public String toString() {
        String str = this.n;
        String str2 = this.s;
        return "App(packageName=" + str + ", trackId=" + str2 + ")";
    }

    /* renamed from: o.Pt$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C1128Pt e() {
            return C1128Pt.c;
        }

        public final C1128Pt d() {
            return C1128Pt.f;
        }

        public final C1128Pt c() {
            return C1128Pt.j;
        }

        public final C1128Pt b() {
            return C1128Pt.l;
        }

        public final C1128Pt a() {
            return C1128Pt.m;
        }

        public final C1128Pt j() {
            return C1128Pt.k;
        }

        public final C1128Pt f() {
            return C1128Pt.f13390o;
        }
    }

    public C1128Pt(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.n = str;
        this.s = str2;
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage((Context) C1332Xp.b(Context.class));
        if (defaultSmsPackage == null) {
            defaultSmsPackage = "com.google.android.apps.messaging";
        }
        c = new C1128Pt(defaultSmsPackage, "dsms");
        d = new C1128Pt("com.facebook.katana", "fb");
        a = new C1128Pt("com.facebook.lite", "fb_lite");
        f = new C1128Pt("com.facebook.orca", "fbm");
        i = new C1128Pt("com.facebook.mlite", "fbm_lite");
        j = new C1128Pt("com.instagram.android", "ig");
        l = new C1128Pt("jp.naver.line.android", "lin");
        m = new C1128Pt("com.snapchat.android", "snc");
        k = new C1128Pt("com.twitter.android", "twt");
        f13390o = new C1128Pt("com.whatsapp", "wha");
        g = new C1128Pt("com.kakao.talk", "kakao_talk");
        h = new C1128Pt("com.google.android.gm", "gmail");
        e = new C1128Pt("com.google.android.apps.messaging", "android_messages");
    }
}
