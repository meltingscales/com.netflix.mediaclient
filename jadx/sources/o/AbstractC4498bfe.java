package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4498bfe extends AbstractC4567bgu {
    private final String a;

    @Override // o.AbstractC4567bgu
    @SerializedName(SignupConstants.Field.LANG_ID)
    public String a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4498bfe(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public String toString() {
        return "Media{id=" + this.a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4567bgu) {
            return this.a.equals(((AbstractC4567bgu) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
