package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4495bfb extends AbstractC4561bgo {
    private final String b;
    private final String e;

    @Override // o.AbstractC4561bgo
    @SerializedName("rel")
    public String a() {
        return this.b;
    }

    @Override // o.AbstractC4561bgo
    @SerializedName("href")
    public String d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4495bfb(String str, String str2) {
        this.e = str;
        this.b = str2;
    }

    public String toString() {
        return "Link{href=" + this.e + ", rel=" + this.b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4561bgo) {
            AbstractC4561bgo abstractC4561bgo = (AbstractC4561bgo) obj;
            String str = this.e;
            if (str != null ? str.equals(abstractC4561bgo.d()) : abstractC4561bgo.d() == null) {
                String str2 = this.b;
                if (str2 == null) {
                    if (abstractC4561bgo.a() == null) {
                        return true;
                    }
                } else if (str2.equals(abstractC4561bgo.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
