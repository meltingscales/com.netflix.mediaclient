package o;

import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.auW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3202auW {
    private final AbstractC8997hK<List<C3204auZ>> b;
    private final AbstractC8997hK<Boolean> c;

    public C3202auW() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Boolean> c() {
        return this.c;
    }

    public final AbstractC8997hK<List<C3204auZ>> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3202auW) {
            C3202auW c3202auW = (C3202auW) obj;
            return C8632dsu.c(this.c, c3202auW.c) && C8632dsu.c(this.b, c3202auW.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        AbstractC8997hK<Boolean> abstractC8997hK = this.c;
        AbstractC8997hK<List<C3204auZ>> abstractC8997hK2 = this.b;
        return "UXConfigABAllocationsInput(replace=" + abstractC8997hK + ", overrides=" + abstractC8997hK2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3202auW(AbstractC8997hK<Boolean> abstractC8997hK, AbstractC8997hK<? extends List<C3204auZ>> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.c = abstractC8997hK;
        this.b = abstractC8997hK2;
    }

    public /* synthetic */ C3202auW(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
