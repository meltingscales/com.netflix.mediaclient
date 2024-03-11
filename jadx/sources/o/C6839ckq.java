package o;

import com.netflix.android.moneyball.fields.ActionField;

/* renamed from: o.ckq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6839ckq {
    private final ActionField a;
    private final Integer b;
    private final ActionField c;
    private final String d;
    private final Integer e;

    public final Integer a() {
        return this.b;
    }

    public final ActionField c() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6839ckq) {
            C6839ckq c6839ckq = (C6839ckq) obj;
            return C8632dsu.c(this.c, c6839ckq.c) && C8632dsu.c(this.a, c6839ckq.a) && C8632dsu.c((Object) this.d, (Object) c6839ckq.d) && C8632dsu.c(this.e, c6839ckq.e) && C8632dsu.c(this.b, c6839ckq.b);
        }
        return false;
    }

    public int hashCode() {
        ActionField actionField = this.c;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.a;
        int hashCode2 = actionField2 == null ? 0 : actionField2.hashCode();
        String str = this.d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.e;
        int hashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        ActionField actionField = this.c;
        ActionField actionField2 = this.a;
        String str = this.d;
        Integer num = this.e;
        Integer num2 = this.b;
        return "ChallengeErrorParsedData(joinNowAction=" + actionField + ", backAction=" + actionField2 + ", errorCode=" + str + ", nextNudgeHours=" + num + ", expiryInMinutes=" + num2 + ")";
    }

    public C6839ckq(ActionField actionField, ActionField actionField2, String str, Integer num, Integer num2) {
        this.c = actionField;
        this.a = actionField2;
        this.d = str;
        this.e = num;
        this.b = num2;
    }
}
