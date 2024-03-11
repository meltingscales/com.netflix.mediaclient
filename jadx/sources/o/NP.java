package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class NP extends NV {
    private final long b;
    private final int c;

    @Override // o.NV
    @SerializedName("firstSeenTime")
    public long c() {
        return this.b;
    }

    @Override // o.NV
    @SerializedName("api")
    public int e() {
        return this.c;
    }

    public int hashCode() {
        int i = this.c;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NP(int i, long j) {
        this.c = i;
        this.b = j;
    }

    public String toString() {
        return "CurrentOsInfo{apiLevel=" + this.c + ", firstSeenTime=" + this.b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NV) {
            NV nv = (NV) obj;
            return this.c == nv.e() && this.b == nv.c();
        }
        return false;
    }
}
