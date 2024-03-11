package o;

import com.netflix.android.moneyball.fields.ActionField;

/* renamed from: o.clo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6890clo {
    private final String a;
    private final String b;
    private final ActionField c;
    private final String d;
    private final String e;
    private final Integer f;
    private final ActionField g;
    private final ActionField h;

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final ActionField c() {
        return this.h;
    }

    public final String d() {
        return this.a;
    }

    public final ActionField e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6890clo) {
            C6890clo c6890clo = (C6890clo) obj;
            return C8632dsu.c((Object) this.e, (Object) c6890clo.e) && C8632dsu.c((Object) this.b, (Object) c6890clo.b) && C8632dsu.c((Object) this.d, (Object) c6890clo.d) && C8632dsu.c(this.h, c6890clo.h) && C8632dsu.c(this.g, c6890clo.g) && C8632dsu.c(this.c, c6890clo.c) && C8632dsu.c(this.f, c6890clo.f) && C8632dsu.c((Object) this.a, (Object) c6890clo.a);
        }
        return false;
    }

    public final ActionField h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        ActionField actionField = this.h;
        int hashCode4 = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.g;
        int hashCode5 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.c;
        int hashCode6 = actionField3 == null ? 0 : actionField3.hashCode();
        Integer num = this.f;
        int hashCode7 = num == null ? 0 : num.hashCode();
        String str4 = this.a;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final Integer j() {
        return this.f;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.b;
        String str3 = this.d;
        ActionField actionField = this.h;
        ActionField actionField2 = this.g;
        ActionField actionField3 = this.c;
        Integer num = this.f;
        String str4 = this.a;
        return "VerifyTravelParsedData(emailAddress=" + str + ", phoneNumber=" + str2 + ", mfaTargetMode=" + str3 + ", sendVerificationEmailAction=" + actionField + ", sendVerificationTextAction=" + actionField2 + ", backAction=" + actionField3 + ", travelDaysOfAccess=" + num + ", dynecomSessionId=" + str4 + ")";
    }

    public C6890clo(String str, String str2, String str3, ActionField actionField, ActionField actionField2, ActionField actionField3, Integer num, String str4) {
        this.e = str;
        this.b = str2;
        this.d = str3;
        this.h = actionField;
        this.g = actionField2;
        this.c = actionField3;
        this.f = num;
        this.a = str4;
    }
}
