package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class aID {
    @SerializedName("isNetworkLite")
    private final boolean c;

    public aID() {
        this(false, 1, null);
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aID) && this.c == ((aID) obj).c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public String toString() {
        boolean z = this.c;
        return "NetworkScoreConfig(isNetworkLite=" + z + ")";
    }

    public aID(boolean z) {
        this.c = z;
    }

    public /* synthetic */ aID(boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z);
    }
}
