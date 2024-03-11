package o;

import com.netflix.mediaclient.graphql.models.type.UXConfigPinotUnifiedEntityKind;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.avf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3262avf {
    private final AbstractC8997hK<List<UXConfigPinotUnifiedEntityKind>> e;

    public C3262avf() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<List<UXConfigPinotUnifiedEntityKind>> c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3262avf) && C8632dsu.c(this.e, ((C3262avf) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<List<UXConfigPinotUnifiedEntityKind>> abstractC8997hK = this.e;
        return "UXConfigBaseEntityTreatmentCapabilitiesInput(canHandleEntityKinds=" + abstractC8997hK + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3262avf(AbstractC8997hK<? extends List<? extends UXConfigPinotUnifiedEntityKind>> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.e = abstractC8997hK;
    }

    public /* synthetic */ C3262avf(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
