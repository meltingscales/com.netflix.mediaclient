package o;

import o.AbstractC8997hK;

/* renamed from: o.asi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3108asi {
    private final AbstractC8997hK<C3109asj> a;

    public C3108asi() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3109asj> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3108asi) && C8632dsu.c(this.a, ((C3108asi) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3109asj> abstractC8997hK = this.a;
        return "PinotCapabilitiesSingleItemSectionInput(base=" + abstractC8997hK + ")";
    }

    public C3108asi(AbstractC8997hK<C3109asj> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3108asi(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
