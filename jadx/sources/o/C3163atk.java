package o;

import o.AbstractC8997hK;

/* renamed from: o.atk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3163atk {
    private final AbstractC8997hK<Integer> a;
    private final AbstractC8997hK<Integer> d;

    public C3163atk() {
        this(null, null, 3, null);
    }

    public final AbstractC8997hK<Integer> c() {
        return this.a;
    }

    public final AbstractC8997hK<Integer> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3163atk) {
            C3163atk c3163atk = (C3163atk) obj;
            return C8632dsu.c(this.d, c3163atk.d) && C8632dsu.c(this.a, c3163atk.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<Integer> abstractC8997hK = this.d;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.a;
        return "PinotSearchArtworkDimensionInput(width=" + abstractC8997hK + ", height=" + abstractC8997hK2 + ")";
    }

    public C3163atk(AbstractC8997hK<Integer> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.d = abstractC8997hK;
        this.a = abstractC8997hK2;
    }

    public /* synthetic */ C3163atk(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2);
    }
}
