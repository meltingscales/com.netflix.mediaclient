package o;

import android.os.Build;

/* renamed from: o.aPi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817aPi {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.i;
    }

    public final String i() {
        return this.h;
    }

    public C1817aPi(int i, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.f = "";
        this.i = "";
        this.g = "";
        this.b = "";
        this.c = "";
        this.h = "";
        String str3 = Build.MANUFACTURER;
        if (str3 != null) {
            C8632dsu.a(str3, "");
            int length = str3.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = C8632dsu.d(str3.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            this.g = str3.subSequence(i2, length + 1).toString();
        }
        String str4 = Build.MODEL;
        if (str4 != null) {
            C8632dsu.a(str4, "");
            int length2 = str4.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length2) {
                boolean z4 = C8632dsu.d(str4.charAt(!z3 ? i3 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length2--;
                } else if (z4) {
                    i3++;
                } else {
                    z3 = true;
                }
            }
            this.f = str4.subSequence(i3, length2 + 1).toString();
        }
        this.i = str2;
        this.e = String.valueOf(Build.VERSION.SDK_INT);
        this.a = String.valueOf(i);
        this.d = str;
        String str5 = Build.DEVICE;
        if (str5 != null) {
            C8632dsu.a(str5, "");
            this.b = str5;
        }
        String str6 = Build.BOARD;
        if (str6 != null) {
            C8632dsu.a(str6, "");
            this.c = str6;
        }
        String str7 = Build.DISPLAY;
        if (str7 != null) {
            C8632dsu.a(str7, "");
            this.h = str7;
        }
    }
}
