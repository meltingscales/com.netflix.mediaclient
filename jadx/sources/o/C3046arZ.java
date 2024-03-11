package o;

import com.netflix.mediaclient.graphql.models.type.PinotEntityKind;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.arZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3046arZ {
    private final AbstractC8997hK<List<PinotEntityKind>> d;

    public C3046arZ() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<List<PinotEntityKind>> b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3046arZ) && C8632dsu.c(this.d, ((C3046arZ) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<List<PinotEntityKind>> abstractC8997hK = this.d;
        return "PinotCapabilitiesEntityTreatmentBaseInput(canHandleEntityKinds=" + abstractC8997hK + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3046arZ(AbstractC8997hK<? extends List<? extends PinotEntityKind>> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.d = abstractC8997hK;
    }

    public /* synthetic */ C3046arZ(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
