package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4517bfx extends AbstractC4539bgS {
    private final List<List<Long>> d;

    @Override // o.AbstractC4539bgS
    @SerializedName("interactionZonesV2")
    public List<List<Long>> e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4517bfx(List<List<Long>> list) {
        this.d = list;
    }

    public String toString() {
        return "UiInfo{interactionZones=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4539bgS) {
            List<List<Long>> list = this.d;
            List<List<Long>> e = ((AbstractC4539bgS) obj).e();
            return list == null ? e == null : list.equals(e);
        }
        return false;
    }

    public int hashCode() {
        List<List<Long>> list = this.d;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }
}
