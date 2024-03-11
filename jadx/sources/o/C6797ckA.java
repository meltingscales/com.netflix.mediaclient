package o;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;

/* renamed from: o.ckA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6797ckA {
    private final Integer a;
    private final String b;
    private final ActionField c;
    private final String d;
    private final String e;
    private final ActionField f;
    private final String g;
    private final boolean h;
    private final StringField i;
    private final ActionField j;

    public final ActionField a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final Integer e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6797ckA) {
            C6797ckA c6797ckA = (C6797ckA) obj;
            return C8632dsu.c((Object) this.b, (Object) c6797ckA.b) && C8632dsu.c((Object) this.g, (Object) c6797ckA.g) && C8632dsu.c(this.a, c6797ckA.a) && C8632dsu.c(this.i, c6797ckA.i) && C8632dsu.c(this.f, c6797ckA.f) && C8632dsu.c(this.j, c6797ckA.j) && C8632dsu.c(this.c, c6797ckA.c) && C8632dsu.c((Object) this.d, (Object) c6797ckA.d) && this.h == c6797ckA.h && C8632dsu.c((Object) this.e, (Object) c6797ckA.e);
        }
        return false;
    }

    public final String f() {
        return this.g;
    }

    public final ActionField g() {
        return this.j;
    }

    public final StringField h() {
        return this.i;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.a;
        int hashCode3 = num == null ? 0 : num.hashCode();
        StringField stringField = this.i;
        int hashCode4 = stringField == null ? 0 : stringField.hashCode();
        ActionField actionField = this.f;
        int hashCode5 = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.j;
        int hashCode6 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.c;
        int hashCode7 = actionField3 == null ? 0 : actionField3.hashCode();
        String str3 = this.d;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        int hashCode9 = Boolean.hashCode(this.h);
        String str4 = this.e;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final ActionField i() {
        return this.f;
    }

    public final boolean j() {
        return this.h;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.g;
        Integer num = this.a;
        StringField stringField = this.i;
        ActionField actionField = this.f;
        ActionField actionField2 = this.j;
        ActionField actionField3 = this.c;
        String str3 = this.d;
        boolean z = this.h;
        String str4 = this.e;
        return "CodeEntryParsedData(emailAddress=" + str + ", phoneNumber=" + str2 + ", expiryInMinutes=" + num + ", otpField=" + stringField + ", submitOtpAction=" + actionField + ", resendAction=" + actionField2 + ", backAction=" + actionField3 + ", errorCode=" + str3 + ", resentMfaChallenge=" + z + ", mfaDeliveryType=" + str4 + ")";
    }

    public C6797ckA(String str, String str2, Integer num, StringField stringField, ActionField actionField, ActionField actionField2, ActionField actionField3, String str3, boolean z, String str4) {
        this.b = str;
        this.g = str2;
        this.a = num;
        this.i = stringField;
        this.f = actionField;
        this.j = actionField2;
        this.c = actionField3;
        this.d = str3;
        this.h = z;
        this.e = str4;
    }
}
