package o;

import java.util.List;

/* renamed from: o.awJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3293awJ {
    private final List<C3294awK> a;
    private final AbstractC8997hK<Boolean> e;

    public final List<C3294awK> a() {
        return this.a;
    }

    public final AbstractC8997hK<Boolean> d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3293awJ) {
            C3293awJ c3293awJ = (C3293awJ) obj;
            return C8632dsu.c(this.a, c3293awJ.a) && C8632dsu.c(this.e, c3293awJ.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        List<C3294awK> list = this.a;
        AbstractC8997hK<Boolean> abstractC8997hK = this.e;
        return "UXConfigPinotSearchClientCapabilitiesInput(supportedSectionKinds=" + list + ", supportIrmaEntity=" + abstractC8997hK + ")";
    }

    public C3293awJ(List<C3294awK> list, AbstractC8997hK<Boolean> abstractC8997hK) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = list;
        this.e = abstractC8997hK;
    }
}
