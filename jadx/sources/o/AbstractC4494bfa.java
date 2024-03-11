package o;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4494bfa extends AbstractC4560bgn {
    private final byte[] a;

    @Override // o.AbstractC4560bgn
    @SerializedName("bytes")
    public byte[] e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4494bfa(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null bytes");
        }
        this.a = bArr;
    }

    public String toString() {
        return "DrmHeader{bytes=" + Arrays.toString(this.a) + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4560bgn) {
            AbstractC4560bgn abstractC4560bgn = (AbstractC4560bgn) obj;
            return Arrays.equals(this.a, abstractC4560bgn instanceof AbstractC4494bfa ? ((AbstractC4494bfa) abstractC4560bgn).a : abstractC4560bgn.e());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a) ^ 1000003;
    }
}
