package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4496bfc extends AbstractC4558bgl {
    private final AbstractC4528bgH b;
    private final AbstractC4535bgO e;

    @Override // o.AbstractC4558bgl
    @SerializedName("playgraph")
    public AbstractC4528bgH b() {
        return this.b;
    }

    @Override // o.AbstractC4558bgl
    @SerializedName("startIdent")
    @Deprecated
    public AbstractC4535bgO c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4496bfc(AbstractC4528bgH abstractC4528bgH, AbstractC4535bgO abstractC4535bgO) {
        if (abstractC4528bgH == null) {
            throw new NullPointerException("Null playgraph");
        }
        this.b = abstractC4528bgH;
        this.e = abstractC4535bgO;
    }

    public String toString() {
        return "ContentPlaygraph{playgraph=" + this.b + ", startIdent=" + this.e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4558bgl) {
            AbstractC4558bgl abstractC4558bgl = (AbstractC4558bgl) obj;
            if (this.b.equals(abstractC4558bgl.b())) {
                AbstractC4535bgO abstractC4535bgO = this.e;
                if (abstractC4535bgO == null) {
                    if (abstractC4558bgl.c() == null) {
                        return true;
                    }
                } else if (abstractC4535bgO.equals(abstractC4558bgl.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        AbstractC4535bgO abstractC4535bgO = this.e;
        return ((hashCode ^ 1000003) * 1000003) ^ (abstractC4535bgO == null ? 0 : abstractC4535bgO.hashCode());
    }
}
