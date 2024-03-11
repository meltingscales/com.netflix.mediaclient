package o;

import com.netflix.android.org.json.zip.JSONzip;

/* renamed from: o.bzp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5496bzp implements InterfaceC8888fH {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean h;
    private final boolean i;
    private final Integer j;

    public C5496bzp() {
        this(false, false, null, null, null, null, false, false, null, 511, null);
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final boolean component1() {
        return this.b;
    }

    public final boolean component2() {
        return this.a;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.e;
    }

    public final String component5() {
        return this.d;
    }

    public final String component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.h;
    }

    public final boolean component8() {
        return this.i;
    }

    public final Integer component9() {
        return this.j;
    }

    public final C5496bzp d(boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, Integer num) {
        return new C5496bzp(z, z2, str, str2, str3, str4, z3, z4, num);
    }

    public final boolean d() {
        return this.h;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5496bzp) {
            C5496bzp c5496bzp = (C5496bzp) obj;
            return this.b == c5496bzp.b && this.a == c5496bzp.a && C8632dsu.c((Object) this.c, (Object) c5496bzp.c) && C8632dsu.c((Object) this.e, (Object) c5496bzp.e) && C8632dsu.c((Object) this.d, (Object) c5496bzp.d) && C8632dsu.c((Object) this.f, (Object) c5496bzp.f) && this.h == c5496bzp.h && this.i == c5496bzp.i && C8632dsu.c(this.j, c5496bzp.j);
        }
        return false;
    }

    public final Integer f() {
        return this.j;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.b);
        int hashCode2 = Boolean.hashCode(this.a);
        String str = this.c;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.d;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        int hashCode7 = Boolean.hashCode(this.h);
        int hashCode8 = Boolean.hashCode(this.i);
        Integer num = this.j;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.i;
    }

    public String toString() {
        boolean z = this.b;
        boolean z2 = this.a;
        String str = this.c;
        String str2 = this.e;
        String str3 = this.d;
        String str4 = this.f;
        boolean z3 = this.h;
        boolean z4 = this.i;
        Integer num = this.j;
        return "DemographicCollectionState(isLoading=" + z + ", isCtaEnabled=" + z2 + ", gender=" + str + ", dobText=" + str2 + ", avatarUrl=" + str3 + ", profileName=" + str4 + ", showConsentCheckbox=" + z3 + ", showTermsOfUseCheckbox=" + z4 + ", termsOfUseMinimumVerificationAge=" + num + ")";
    }

    public C5496bzp(boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, Integer num) {
        this.b = z;
        this.a = z2;
        this.c = str;
        this.e = str2;
        this.d = str3;
        this.f = str4;
        this.h = z3;
        this.i = z4;
        this.j = num;
    }

    public /* synthetic */ C5496bzp(boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, Integer num, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? false : z3, (i & 128) == 0 ? z4 : false, (i & JSONzip.end) == 0 ? num : null);
    }
}
