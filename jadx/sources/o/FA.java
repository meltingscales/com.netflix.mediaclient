package o;

import com.netflix.hawkins.consumer.component.button.HawkinsButtonSize;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;

/* loaded from: classes2.dex */
public final class FA implements FD {
    private final String a;
    private final HawkinsIcon b;
    private final String c;
    private final String d;
    private final String e;
    private final HawkinsButtonSize f;
    private final FE g;
    private final String i;
    private final HawkinsButtonType j;

    public final FE a() {
        return this.g;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public String d() {
        return this.d;
    }

    public final HawkinsIcon e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FA) {
            FA fa = (FA) obj;
            return C8632dsu.c((Object) this.d, (Object) fa.d) && C8632dsu.c((Object) this.e, (Object) fa.e) && C8632dsu.c((Object) this.i, (Object) fa.i) && C8632dsu.c((Object) this.c, (Object) fa.c) && C8632dsu.c((Object) this.a, (Object) fa.a) && this.f == fa.f && this.j == fa.j && C8632dsu.c(this.b, fa.b) && C8632dsu.c(this.g, fa.g);
        }
        return false;
    }

    public final String f() {
        return this.i;
    }

    public final HawkinsButtonSize h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        String str = this.e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.i;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        HawkinsButtonSize hawkinsButtonSize = this.f;
        int hashCode6 = hawkinsButtonSize == null ? 0 : hawkinsButtonSize.hashCode();
        HawkinsButtonType hawkinsButtonType = this.j;
        int hashCode7 = hawkinsButtonType == null ? 0 : hawkinsButtonType.hashCode();
        HawkinsIcon hawkinsIcon = this.b;
        int hashCode8 = hawkinsIcon == null ? 0 : hawkinsIcon.hashCode();
        FE fe = this.g;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (fe != null ? fe.hashCode() : 0);
    }

    public final HawkinsButtonType i() {
        return this.j;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.e;
        String str3 = this.i;
        String str4 = this.c;
        String str5 = this.a;
        HawkinsButtonSize hawkinsButtonSize = this.f;
        HawkinsButtonType hawkinsButtonType = this.j;
        HawkinsIcon hawkinsIcon = this.b;
        FE fe = this.g;
        return "Button(key=" + str + ", accessibilityDescription=" + str2 + ", trackingInfo=" + str3 + ", loggingViewName=" + str4 + ", label=" + str5 + ", size=" + hawkinsButtonSize + ", type=" + hawkinsButtonType + ", icon=" + hawkinsIcon + ", onPress=" + fe + ")";
    }

    public FA(String str, String str2, String str3, String str4, String str5, HawkinsButtonSize hawkinsButtonSize, HawkinsButtonType hawkinsButtonType, HawkinsIcon hawkinsIcon, FE fe) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = str2;
        this.i = str3;
        this.c = str4;
        this.a = str5;
        this.f = hawkinsButtonSize;
        this.j = hawkinsButtonType;
        this.b = hawkinsIcon;
        this.g = fe;
    }
}
