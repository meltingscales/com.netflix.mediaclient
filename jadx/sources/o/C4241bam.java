package o;

import com.netflix.cl.model.android.CachedVideoRemovalFeature;

/* renamed from: o.bam  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4241bam {
    private final String c;
    private final CachedVideoRemovalFeature d;

    public final CachedVideoRemovalFeature c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4241bam) {
            C4241bam c4241bam = (C4241bam) obj;
            return C8632dsu.c((Object) this.c, (Object) c4241bam.c) && this.d == c4241bam.d;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        CachedVideoRemovalFeature cachedVideoRemovalFeature = this.d;
        return (hashCode * 31) + (cachedVideoRemovalFeature == null ? 0 : cachedVideoRemovalFeature.hashCode());
    }

    public String toString() {
        String str = this.c;
        CachedVideoRemovalFeature cachedVideoRemovalFeature = this.d;
        return "DeleteRequest(playableId=" + str + ", cachedVideoRemovalFeature=" + cachedVideoRemovalFeature + ")";
    }

    public C4241bam(String str, CachedVideoRemovalFeature cachedVideoRemovalFeature) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = cachedVideoRemovalFeature;
    }
}
