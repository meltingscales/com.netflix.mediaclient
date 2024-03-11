package o;

import com.netflix.android.moneyball.fields.ActionField;

/* renamed from: o.clk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6886clk {
    private final ActionField a;
    private final Integer b;
    private final ActionField c;
    private final ActionField d;

    public final ActionField a() {
        return this.d;
    }

    public final ActionField b() {
        return this.c;
    }

    public final Integer d() {
        return this.b;
    }

    public final ActionField e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6886clk) {
            C6886clk c6886clk = (C6886clk) obj;
            return C8632dsu.c(this.a, c6886clk.a) && C8632dsu.c(this.c, c6886clk.c) && C8632dsu.c(this.d, c6886clk.d) && C8632dsu.c(this.b, c6886clk.b);
        }
        return false;
    }

    public int hashCode() {
        ActionField actionField = this.a;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.c;
        int hashCode2 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.d;
        int hashCode3 = actionField3 == null ? 0 : actionField3.hashCode();
        Integer num = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        ActionField actionField = this.a;
        ActionField actionField2 = this.c;
        ActionField actionField3 = this.d;
        Integer num = this.b;
        return "UpdatePrimaryHomeInstructionsParsedData(backAction=" + actionField + ", mhuVerifyTravelAction=" + actionField2 + ", nextAction=" + actionField3 + ", travelDaysOfAccess=" + num + ")";
    }

    public C6886clk(ActionField actionField, ActionField actionField2, ActionField actionField3, Integer num) {
        this.a = actionField;
        this.c = actionField2;
        this.d = actionField3;
        this.b = num;
    }
}
