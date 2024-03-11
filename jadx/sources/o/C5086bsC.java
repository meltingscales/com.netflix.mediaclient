package o;

import com.netflix.mediaclient.servicemgr.LiveEventState;

/* renamed from: o.bsC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5086bsC {
    private final LiveEventState c;
    private final boolean d;

    public final LiveEventState a() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5086bsC) {
            C5086bsC c5086bsC = (C5086bsC) obj;
            return this.c == c5086bsC.c && this.d == c5086bsC.d;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        LiveEventState liveEventState = this.c;
        boolean z = this.d;
        return "LiveClientState(clientState=" + liveEventState + ", isLiveEdge=" + z + ")";
    }

    public C5086bsC(LiveEventState liveEventState, boolean z) {
        C8632dsu.c((Object) liveEventState, "");
        this.c = liveEventState;
        this.d = z;
    }
}
