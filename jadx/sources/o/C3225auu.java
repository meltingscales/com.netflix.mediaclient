package o;

import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import o.AbstractC8997hK;

/* renamed from: o.auu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3225auu {
    private final AbstractC8997hK<SubtitleOpacity> c;
    private final AbstractC8997hK<SubtitleColor> e;

    public C3225auu() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<SubtitleColor> a() {
        return this.e;
    }

    public final AbstractC8997hK<SubtitleOpacity> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3225auu) {
            C3225auu c3225auu = (C3225auu) obj;
            return C8632dsu.c(this.e, c3225auu.e) && C8632dsu.c(this.c, c3225auu.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        AbstractC8997hK<SubtitleColor> abstractC8997hK = this.e;
        AbstractC8997hK<SubtitleOpacity> abstractC8997hK2 = this.c;
        return "SubtitleBackgroundInput(color=" + abstractC8997hK + ", opacity=" + abstractC8997hK2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3225auu(AbstractC8997hK<? extends SubtitleColor> abstractC8997hK, AbstractC8997hK<? extends SubtitleOpacity> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.e = abstractC8997hK;
        this.c = abstractC8997hK2;
    }

    public /* synthetic */ C3225auu(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
