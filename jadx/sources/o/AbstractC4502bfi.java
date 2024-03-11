package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4502bfi extends AbstractC4564bgr {
    private final AbstractC4561bgo a;
    private final AbstractC4561bgo b;
    private final AbstractC4561bgo d;
    private final AbstractC4561bgo e;

    @Override // o.AbstractC4564bgr
    @SerializedName("license")
    public AbstractC4561bgo a() {
        return this.b;
    }

    @Override // o.AbstractC4564bgr
    @SerializedName("events")
    public AbstractC4561bgo b() {
        return this.d;
    }

    @Override // o.AbstractC4564bgr
    @SerializedName("stopPlayback")
    public AbstractC4561bgo d() {
        return this.e;
    }

    @Override // o.AbstractC4564bgr
    @SerializedName("ldl")
    public AbstractC4561bgo e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4502bfi(AbstractC4561bgo abstractC4561bgo, AbstractC4561bgo abstractC4561bgo2, AbstractC4561bgo abstractC4561bgo3, AbstractC4561bgo abstractC4561bgo4) {
        this.d = abstractC4561bgo;
        this.a = abstractC4561bgo2;
        this.b = abstractC4561bgo3;
        this.e = abstractC4561bgo4;
    }

    public String toString() {
        return "ManifestLinks{events=" + this.d + ", ldl=" + this.a + ", license=" + this.b + ", stopPlayback=" + this.e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4564bgr) {
            AbstractC4564bgr abstractC4564bgr = (AbstractC4564bgr) obj;
            AbstractC4561bgo abstractC4561bgo = this.d;
            if (abstractC4561bgo != null ? abstractC4561bgo.equals(abstractC4564bgr.b()) : abstractC4564bgr.b() == null) {
                AbstractC4561bgo abstractC4561bgo2 = this.a;
                if (abstractC4561bgo2 != null ? abstractC4561bgo2.equals(abstractC4564bgr.e()) : abstractC4564bgr.e() == null) {
                    AbstractC4561bgo abstractC4561bgo3 = this.b;
                    if (abstractC4561bgo3 != null ? abstractC4561bgo3.equals(abstractC4564bgr.a()) : abstractC4564bgr.a() == null) {
                        AbstractC4561bgo abstractC4561bgo4 = this.e;
                        if (abstractC4561bgo4 == null) {
                            if (abstractC4564bgr.d() == null) {
                                return true;
                            }
                        } else if (abstractC4561bgo4.equals(abstractC4564bgr.d())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AbstractC4561bgo abstractC4561bgo = this.d;
        int hashCode = abstractC4561bgo == null ? 0 : abstractC4561bgo.hashCode();
        AbstractC4561bgo abstractC4561bgo2 = this.a;
        int hashCode2 = abstractC4561bgo2 == null ? 0 : abstractC4561bgo2.hashCode();
        AbstractC4561bgo abstractC4561bgo3 = this.b;
        int hashCode3 = abstractC4561bgo3 == null ? 0 : abstractC4561bgo3.hashCode();
        AbstractC4561bgo abstractC4561bgo4 = this.e;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (abstractC4561bgo4 != null ? abstractC4561bgo4.hashCode() : 0);
    }
}
