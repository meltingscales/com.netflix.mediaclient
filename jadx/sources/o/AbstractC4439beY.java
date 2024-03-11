package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4439beY extends AbstractC4554bgh {
    private final String d;

    @Override // o.AbstractC4554bgh
    @SerializedName("pbcid")
    public String d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4439beY(String str) {
        this.d = str;
    }

    public String toString() {
        return "CdnResponseData{pbcid=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4554bgh) {
            String str = this.d;
            String d = ((AbstractC4554bgh) obj).d();
            return str == null ? d == null : str.equals(d);
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
