package o;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4507bfn extends AbstractC4528bgH {
    private final Map<String, AbstractC4531bgK> b;
    private final String d;

    @Override // o.AbstractC4528bgH
    @SerializedName("initialSegment")
    public String a() {
        return this.d;
    }

    @Override // o.AbstractC4528bgH
    @SerializedName("segments")
    public Map<String, AbstractC4531bgK> c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4507bfn(String str, Map<String, AbstractC4531bgK> map) {
        if (str == null) {
            throw new NullPointerException("Null initialSegment");
        }
        this.d = str;
        if (map == null) {
            throw new NullPointerException("Null segments");
        }
        this.b = map;
    }

    public String toString() {
        return "Playgraph{initialSegment=" + this.d + ", segments=" + this.b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4528bgH) {
            AbstractC4528bgH abstractC4528bgH = (AbstractC4528bgH) obj;
            return this.d.equals(abstractC4528bgH.a()) && this.b.equals(abstractC4528bgH.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
