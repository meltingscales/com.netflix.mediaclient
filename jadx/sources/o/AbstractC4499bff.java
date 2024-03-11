package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bff  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4499bff extends AbstractC4565bgs {
    private final int a;
    private final PlaylistMap.TransitionHintType d;
    private final long e;

    @Override // o.AbstractC4565bgs
    @SerializedName("transitionHint")
    public PlaylistMap.TransitionHintType a() {
        return this.d;
    }

    @Override // o.AbstractC4565bgs
    @SerializedName("earliestSkipRequestOffset")
    public long b() {
        return this.e;
    }

    @Override // o.AbstractC4565bgs
    @SerializedName("weight")
    public int e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4499bff(int i, long j, PlaylistMap.TransitionHintType transitionHintType) {
        this.a = i;
        this.e = j;
        if (transitionHintType == null) {
            throw new NullPointerException("Null transitionHint");
        }
        this.d = transitionHintType;
    }

    public String toString() {
        return "NextSegment{weight=" + this.a + ", earliestSkipRequestOffset=" + this.e + ", transitionHint=" + this.d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4565bgs) {
            AbstractC4565bgs abstractC4565bgs = (AbstractC4565bgs) obj;
            return this.a == abstractC4565bgs.e() && this.e == abstractC4565bgs.b() && this.d.equals(abstractC4565bgs.a());
        }
        return false;
    }

    public int hashCode() {
        int i = this.a;
        long j = this.e;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode();
    }
}
