package com.netflix.clcs.models;

import o.C8600drp;
import o.C8632dsu;
import o.FA;
import o.FD;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public final class InputCopyLink implements FD {
    private final String a;
    private final String b;
    private final String c;
    private final FA d;
    private final String e;
    private final String f;
    private final Size h;
    private final String j;

    public final FA b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.j;
    }

    public final Size e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InputCopyLink) {
            InputCopyLink inputCopyLink = (InputCopyLink) obj;
            return C8632dsu.c((Object) this.e, (Object) inputCopyLink.e) && C8632dsu.c((Object) this.c, (Object) inputCopyLink.c) && C8632dsu.c((Object) this.f, (Object) inputCopyLink.f) && C8632dsu.c((Object) this.b, (Object) inputCopyLink.b) && C8632dsu.c((Object) this.j, (Object) inputCopyLink.j) && C8632dsu.c((Object) this.a, (Object) inputCopyLink.a) && this.h == inputCopyLink.h && C8632dsu.c(this.d, inputCopyLink.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        int hashCode5 = this.j.hashCode();
        int hashCode6 = this.a.hashCode();
        Size size = this.h;
        int hashCode7 = size == null ? 0 : size.hashCode();
        FA fa = this.d;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (fa != null ? fa.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.c;
        String str3 = this.f;
        String str4 = this.b;
        String str5 = this.j;
        String str6 = this.a;
        Size size = this.h;
        FA fa = this.d;
        return "InputCopyLink(key=" + str + ", accessibilityDescription=" + str2 + ", trackingInfo=" + str3 + ", loggingViewName=" + str4 + ", text=" + str5 + ", copyText=" + str6 + ", size=" + size + ", button=" + fa + ")";
    }

    public InputCopyLink(String str, String str2, String str3, String str4, String str5, String str6, Size size, FA fa) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        this.e = str;
        this.c = str2;
        this.f = str3;
        this.b = str4;
        this.j = str5;
        this.a = str6;
        this.h = size;
        this.d = fa;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Size {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ Size[] e;
        public static final Size a = new Size("COMPACT", 0);
        public static final Size d = new Size("STANDARD", 1);

        private static final /* synthetic */ Size[] a() {
            return new Size[]{a, d};
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) e.clone();
        }

        private Size(String str, int i) {
        }

        static {
            Size[] a2 = a();
            e = a2;
            b = C8600drp.e(a2);
        }
    }
}
