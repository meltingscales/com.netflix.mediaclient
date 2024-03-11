package o;

import com.netflix.hawkins.consumer.component.input.HawkinsInputPinCodeSize;
import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes2.dex */
public final class FP implements FD {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final C0880Gd e;
    private final FE f;
    private final String g;
    private final HawkinsInputPinCodeSize h;
    private final FE i;
    private final Token.Color j;

    /* renamed from: o  reason: collision with root package name */
    private final Token.Typography f13354o;

    public final FE a() {
        return this.i;
    }

    public String b() {
        return this.c;
    }

    public final Integer c() {
        return this.a;
    }

    public final C0880Gd d() {
        return this.e;
    }

    public final FE e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FP) {
            FP fp = (FP) obj;
            return C8632dsu.c((Object) this.c, (Object) fp.c) && C8632dsu.c((Object) this.d, (Object) fp.d) && C8632dsu.c((Object) this.g, (Object) fp.g) && C8632dsu.c((Object) this.b, (Object) fp.b) && C8632dsu.c(this.f13354o, fp.f13354o) && C8632dsu.c(this.j, fp.j) && C8632dsu.c(this.a, fp.a) && this.h == fp.h && C8632dsu.c(this.e, fp.e) && C8632dsu.c(this.f, fp.f) && C8632dsu.c(this.i, fp.i);
        }
        return false;
    }

    public final HawkinsInputPinCodeSize h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        Token.Typography typography = this.f13354o;
        int hashCode5 = typography == null ? 0 : typography.hashCode();
        Token.Color color = this.j;
        int hashCode6 = color == null ? 0 : color.hashCode();
        Integer num = this.a;
        int hashCode7 = num == null ? 0 : num.hashCode();
        int hashCode8 = this.h.hashCode();
        C0880Gd c0880Gd = this.e;
        int hashCode9 = c0880Gd == null ? 0 : c0880Gd.hashCode();
        FE fe = this.f;
        int hashCode10 = fe == null ? 0 : fe.hashCode();
        FE fe2 = this.i;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (fe2 != null ? fe2.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        String str2 = this.d;
        String str3 = this.g;
        String str4 = this.b;
        Token.Typography typography = this.f13354o;
        Token.Color color = this.j;
        Integer num = this.a;
        HawkinsInputPinCodeSize hawkinsInputPinCodeSize = this.h;
        C0880Gd c0880Gd = this.e;
        FE fe = this.f;
        FE fe2 = this.i;
        return "PinEntry(key=" + str + ", accessibilityDescription=" + str2 + ", trackingInfo=" + str3 + ", loggingViewName=" + str4 + ", typography=" + typography + ", textColor=" + color + ", length=" + num + ", size=" + hawkinsInputPinCodeSize + ", field=" + c0880Gd + ", onEnterKey=" + fe + ", onChange=" + fe2 + ")";
    }

    public FP(String str, String str2, String str3, String str4, Token.Typography typography, Token.Color color, Integer num, HawkinsInputPinCodeSize hawkinsInputPinCodeSize, C0880Gd c0880Gd, FE fe, FE fe2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) hawkinsInputPinCodeSize, "");
        this.c = str;
        this.d = str2;
        this.g = str3;
        this.b = str4;
        this.f13354o = typography;
        this.j = color;
        this.a = num;
        this.h = hawkinsInputPinCodeSize;
        this.e = c0880Gd;
        this.f = fe;
        this.i = fe2;
    }
}
