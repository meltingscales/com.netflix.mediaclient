package o;

import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import o.AbstractC8997hK;

/* renamed from: o.auD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3183auD {
    private final AbstractC8997hK<SubtitleOpacity> d;
    private final AbstractC8997hK<SubtitleColor> e;

    public C3183auD() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<SubtitleColor> b() {
        return this.e;
    }

    public final AbstractC8997hK<SubtitleOpacity> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3183auD) {
            C3183auD c3183auD = (C3183auD) obj;
            return C8632dsu.c(this.e, c3183auD.e) && C8632dsu.c(this.d, c3183auD.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<SubtitleColor> abstractC8997hK = this.e;
        AbstractC8997hK<SubtitleOpacity> abstractC8997hK2 = this.d;
        return "SubtitleWindowInput(color=" + abstractC8997hK + ", opacity=" + abstractC8997hK2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3183auD(AbstractC8997hK<? extends SubtitleColor> abstractC8997hK, AbstractC8997hK<? extends SubtitleOpacity> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.d = abstractC8997hK2;
    }

    public /* synthetic */ C3183auD(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
