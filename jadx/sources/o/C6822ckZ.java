package o;

import com.netflix.android.moneyball.fields.ActionField;

/* renamed from: o.ckZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6822ckZ {
    private final ActionField b;
    private final String d;
    private final ActionField e;

    public final String a() {
        return this.d;
    }

    public final ActionField b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6822ckZ) {
            C6822ckZ c6822ckZ = (C6822ckZ) obj;
            return C8632dsu.c((Object) this.d, (Object) c6822ckZ.d) && C8632dsu.c(this.e, c6822ckZ.e) && C8632dsu.c(this.b, c6822ckZ.b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        ActionField actionField = this.e;
        int hashCode2 = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.b;
        return (((hashCode * 31) + hashCode2) * 31) + (actionField2 != null ? actionField2.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        ActionField actionField = this.e;
        ActionField actionField2 = this.b;
        return "MisdetectionResolutionParsedData(troubleshootAutoLoginToken=" + str + ", backAction=" + actionField + ", signOutAction=" + actionField2 + ")";
    }

    public C6822ckZ(String str, ActionField actionField, ActionField actionField2) {
        this.d = str;
        this.e = actionField;
        this.b = actionField2;
    }
}
