package o;

import com.netflix.android.moneyball.fields.ActionField;

/* renamed from: o.ckF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6802ckF {
    private final ActionField e;

    public final ActionField c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6802ckF) && C8632dsu.c(this.e, ((C6802ckF) obj).e);
    }

    public int hashCode() {
        ActionField actionField = this.e;
        if (actionField == null) {
            return 0;
        }
        return actionField.hashCode();
    }

    public String toString() {
        ActionField actionField = this.e;
        return "UpdateInstructionsParsedData(backAction=" + actionField + ")";
    }

    public C6802ckF(ActionField actionField) {
        this.e = actionField;
    }
}
