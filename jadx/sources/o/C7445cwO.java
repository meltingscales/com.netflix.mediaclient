package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.cwO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7445cwO {
    @SerializedName("playableBookmark")
    private long e;

    public final long c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7445cwO) && this.e == ((C7445cwO) obj).e;
    }

    public int hashCode() {
        return Long.hashCode(this.e);
    }

    public String toString() {
        long j = this.e;
        return "FastPlayStartParams(playableBookmark=" + j + ")";
    }

    public C7445cwO(long j) {
        this.e = j;
    }
}
