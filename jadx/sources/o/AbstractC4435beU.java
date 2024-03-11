package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.beU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4435beU extends AbstractC4473bfF {
    private final List<AbstractC4470bfC> b;

    @Override // o.AbstractC4473bfF
    @SerializedName("adBreaks")
    public List<AbstractC4470bfC> b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4435beU(List<AbstractC4470bfC> list) {
        if (list == null) {
            throw new NullPointerException("Null adBreaks");
        }
        this.b = list;
    }

    public String toString() {
        return "Adverts{adBreaks=" + this.b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4473bfF) {
            return this.b.equals(((AbstractC4473bfF) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}
