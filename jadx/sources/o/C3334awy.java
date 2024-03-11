package o;

import o.AbstractC8997hK;

/* renamed from: o.awy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3334awy {
    private final AbstractC8997hK<C3262avf> a;

    public C3334awy() {
        this(null, 1, null);
    }

    public final AbstractC8997hK<C3262avf> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3334awy) && C8632dsu.c(this.a, ((C3334awy) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<C3262avf> abstractC8997hK = this.a;
        return "UXConfigPinotBoxShotWithReminderEntityTreatmentCapabilitiesInput(base=" + abstractC8997hK + ")";
    }

    public C3334awy(AbstractC8997hK<C3262avf> abstractC8997hK) {
        C8632dsu.c((Object) abstractC8997hK, "");
        this.a = abstractC8997hK;
    }

    public /* synthetic */ C3334awy(AbstractC8997hK abstractC8997hK, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK);
    }
}
