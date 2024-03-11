package o;

import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.atm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3165atm {
    private final AbstractC8997hK<List<C3168atp>> a;
    private final AbstractC8997hK<Boolean> e;

    public C3165atm() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<List<C3168atp>> b() {
        return this.a;
    }

    public final AbstractC8997hK<Boolean> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3165atm) {
            C3165atm c3165atm = (C3165atm) obj;
            return C8632dsu.c(this.a, c3165atm.a) && C8632dsu.c(this.e, c3165atm.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        AbstractC8997hK<List<C3168atp>> abstractC8997hK = this.a;
        AbstractC8997hK<Boolean> abstractC8997hK2 = this.e;
        return "PinotSearchClientCapabilitiesInput(supportedSectionKinds=" + abstractC8997hK + ", supportIrmaEntity=" + abstractC8997hK2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3165atm(AbstractC8997hK<? extends List<C3168atp>> abstractC8997hK, AbstractC8997hK<Boolean> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.a = abstractC8997hK;
        this.e = abstractC8997hK2;
    }

    public /* synthetic */ C3165atm(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
