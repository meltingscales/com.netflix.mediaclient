package o;

import com.netflix.android.moneyball.fields.ActionField;

/* renamed from: o.ckO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6811ckO {
    private final ActionField a;
    private final ActionField b;
    private final ActionField c;
    private final String d;

    public final String a() {
        return this.d;
    }

    public final ActionField c() {
        return this.a;
    }

    public final ActionField d() {
        return this.c;
    }

    public final ActionField e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6811ckO) {
            C6811ckO c6811ckO = (C6811ckO) obj;
            return C8632dsu.c(this.a, c6811ckO.a) && C8632dsu.c(this.c, c6811ckO.c) && C8632dsu.c(this.b, c6811ckO.b) && C8632dsu.c((Object) this.d, (Object) c6811ckO.d);
        }
        return false;
    }

    public int hashCode() {
        ActionField actionField = this.a;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.c;
        int hashCode2 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.b;
        int hashCode3 = actionField3 == null ? 0 : actionField3.hashCode();
        String str = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ActionField actionField = this.a;
        ActionField actionField2 = this.c;
        ActionField actionField3 = this.b;
        String str = this.d;
        return "ManagePrimaryHomeParsedData(nextAction=" + actionField + ", backAction=" + actionField2 + ", troubleshootAction=" + actionField3 + ", errorCode=" + str + ")";
    }

    public C6811ckO(ActionField actionField, ActionField actionField2, ActionField actionField3, String str) {
        this.a = actionField;
        this.c = actionField2;
        this.b = actionField3;
        this.d = str;
    }
}
