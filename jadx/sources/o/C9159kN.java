package o;

import android.os.Build;

/* renamed from: o.kN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9159kN {
    public static final a a = new a(null);
    private final Integer b;
    private final String[] c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.j;
    }

    public final String[] c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Integer e() {
        return this.b;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.h;
    }

    public C9159kN(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String[] strArr) {
        this.j = str;
        this.h = str2;
        this.g = str3;
        this.b = num;
        this.i = str4;
        this.e = str5;
        this.f = str6;
        this.d = str7;
        this.c = strArr;
    }

    /* renamed from: o.kN$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9159kN d() {
            int i = Build.VERSION.SDK_INT;
            String[] strArr = Build.SUPPORTED_ABIS;
            return new C9159kN(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(i), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, strArr);
        }
    }
}
