package o;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.android.moneyball.fields.StringField;

/* renamed from: o.cjS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6762cjS {
    private final String a;
    private final String b;
    private final ActionField c;
    private final StringField d;
    private final NumberField e;
    private final ActionField f;
    private final String g;
    private final ActionField h;
    private final String i;

    public final String a() {
        return this.a;
    }

    public final NumberField b() {
        return this.e;
    }

    public final StringField c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final ActionField e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6762cjS) {
            C6762cjS c6762cjS = (C6762cjS) obj;
            return C8632dsu.c((Object) this.g, (Object) c6762cjS.g) && C8632dsu.c((Object) this.b, (Object) c6762cjS.b) && C8632dsu.c((Object) this.i, (Object) c6762cjS.i) && C8632dsu.c(this.e, c6762cjS.e) && C8632dsu.c(this.d, c6762cjS.d) && C8632dsu.c(this.h, c6762cjS.h) && C8632dsu.c(this.c, c6762cjS.c) && C8632dsu.c(this.f, c6762cjS.f) && C8632dsu.c((Object) this.a, (Object) c6762cjS.a);
        }
        return false;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.i;
    }

    public int hashCode() {
        String str = this.g;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.i;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        NumberField numberField = this.e;
        int hashCode4 = numberField == null ? 0 : numberField.hashCode();
        StringField stringField = this.d;
        int hashCode5 = stringField == null ? 0 : stringField.hashCode();
        ActionField actionField = this.h;
        int hashCode6 = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.c;
        int hashCode7 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.f;
        int hashCode8 = actionField3 == null ? 0 : actionField3.hashCode();
        String str4 = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final ActionField i() {
        return this.h;
    }

    public final ActionField j() {
        return this.f;
    }

    public String toString() {
        String str = this.g;
        String str2 = this.b;
        String str3 = this.i;
        NumberField numberField = this.e;
        StringField stringField = this.d;
        ActionField actionField = this.h;
        ActionField actionField2 = this.c;
        ActionField actionField3 = this.f;
        String str4 = this.a;
        return "MultihouseholdNudgeModalParsedData(mfaDeliveryType=" + str + ", emailAddress=" + str2 + ", phoneNumber=" + str3 + ", expiryInMinutes=" + numberField + ", challengeOtp=" + stringField + ", resendCodeAction=" + actionField + ", backAction=" + actionField2 + ", nextAction=" + actionField3 + ", errorCode=" + str4 + ")";
    }

    public C6762cjS(String str, String str2, String str3, NumberField numberField, StringField stringField, ActionField actionField, ActionField actionField2, ActionField actionField3, String str4) {
        this.g = str;
        this.b = str2;
        this.i = str3;
        this.e = numberField;
        this.d = stringField;
        this.h = actionField;
        this.c = actionField2;
        this.f = actionField3;
        this.a = str4;
    }
}
