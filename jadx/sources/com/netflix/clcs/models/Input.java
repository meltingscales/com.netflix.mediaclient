package com.netflix.clcs.models;

import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C0880Gd;
import o.C8600drp;
import o.C8632dsu;
import o.FD;
import o.FE;
import o.InterfaceC8598drn;

/* loaded from: classes2.dex */
public final class Input implements FD {
    private final String a;
    private final HawkinsIcon b;
    private final C0880Gd c;
    private final String d;
    private final String e;
    private final Type f;
    private final HawkinsInputSize g;
    private final String h;
    private final FE i;
    private final String j;

    public final String a() {
        return this.a;
    }

    public final C0880Gd b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public final FE d() {
        return this.i;
    }

    public final HawkinsIcon e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Input) {
            Input input = (Input) obj;
            return C8632dsu.c((Object) this.e, (Object) input.e) && C8632dsu.c((Object) this.d, (Object) input.d) && C8632dsu.c((Object) this.j, (Object) input.j) && C8632dsu.c(this.c, input.c) && this.g == input.g && this.f == input.f && C8632dsu.c(this.b, input.b) && C8632dsu.c((Object) this.h, (Object) input.h) && C8632dsu.c(this.i, input.i) && C8632dsu.c((Object) this.a, (Object) input.a);
        }
        return false;
    }

    public final String f() {
        return this.h;
    }

    public final HawkinsInputSize g() {
        return this.g;
    }

    public final Type h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.j;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        C0880Gd c0880Gd = this.c;
        int hashCode4 = c0880Gd == null ? 0 : c0880Gd.hashCode();
        HawkinsInputSize hawkinsInputSize = this.g;
        int hashCode5 = hawkinsInputSize == null ? 0 : hawkinsInputSize.hashCode();
        Type type = this.f;
        int hashCode6 = type == null ? 0 : type.hashCode();
        HawkinsIcon hawkinsIcon = this.b;
        int hashCode7 = hawkinsIcon == null ? 0 : hawkinsIcon.hashCode();
        String str3 = this.h;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        FE fe = this.i;
        int hashCode9 = fe == null ? 0 : fe.hashCode();
        String str4 = this.a;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        String str3 = this.j;
        C0880Gd c0880Gd = this.c;
        HawkinsInputSize hawkinsInputSize = this.g;
        Type type = this.f;
        HawkinsIcon hawkinsIcon = this.b;
        String str4 = this.h;
        FE fe = this.i;
        String str5 = this.a;
        return "Input(key=" + str + ", accessibilityDescription=" + str2 + ", trackingInfo=" + str3 + ", field=" + c0880Gd + ", size=" + hawkinsInputSize + ", type=" + type + ", icon=" + hawkinsIcon + ", placeholder=" + str4 + ", onChange=" + fe + ", initialErrorMessage=" + str5 + ")";
    }

    public Input(String str, String str2, String str3, C0880Gd c0880Gd, HawkinsInputSize hawkinsInputSize, Type type, HawkinsIcon hawkinsIcon, String str4, FE fe, String str5) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.d = str2;
        this.j = str3;
        this.c = c0880Gd;
        this.g = hawkinsInputSize;
        this.f = type;
        this.b = hawkinsIcon;
        this.h = str4;
        this.i = fe;
        this.a = str5;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Type {
        private static final /* synthetic */ InterfaceC8598drn e;
        private static final /* synthetic */ Type[] g;
        public static final Type c = new Type("TEXT", 0);
        public static final Type a = new Type("EMAIL", 1);
        public static final Type d = new Type("PASSWORD", 2);
        public static final Type b = new Type("TELEPHONE", 3);

        private static final /* synthetic */ Type[] a() {
            return new Type[]{c, a, d, b};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) g.clone();
        }

        private Type(String str, int i) {
        }

        static {
            Type[] a2 = a();
            g = a2;
            e = C8600drp.e(a2);
        }
    }
}
