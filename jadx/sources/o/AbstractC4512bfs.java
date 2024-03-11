package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bfs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4512bfs extends AbstractC4535bgO {
    private final long e;

    @Override // o.AbstractC4535bgO
    @SerializedName("viewableId")
    public long c() {
        return this.e;
    }

    public int hashCode() {
        long j = this.e;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4512bfs(long j) {
        this.e = j;
    }

    public String toString() {
        return "StartIdent{viewableId=" + this.e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC4535bgO) && this.e == ((AbstractC4535bgO) obj).c();
    }
}
