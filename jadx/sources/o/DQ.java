package o;

import o.AbstractC8997hK;

/* loaded from: classes2.dex */
public final class DQ {
    private final AbstractC8997hK<Boolean> a;
    private final AbstractC8997hK<Integer> c;
    private final AbstractC8997hK<String> d;
    private final AbstractC8997hK<String> e;

    public DQ() {
        this(null, null, null, null, 15, null);
    }

    public final AbstractC8997hK<String> a() {
        return this.d;
    }

    public final AbstractC8997hK<Integer> c() {
        return this.c;
    }

    public final AbstractC8997hK<Boolean> d() {
        return this.a;
    }

    public final AbstractC8997hK<String> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DQ) {
            DQ dq = (DQ) obj;
            return C8632dsu.c(this.e, dq.e) && C8632dsu.c(this.c, dq.c) && C8632dsu.c(this.a, dq.a) && C8632dsu.c(this.d, dq.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        AbstractC8997hK<String> abstractC8997hK = this.e;
        AbstractC8997hK<Integer> abstractC8997hK2 = this.c;
        AbstractC8997hK<Boolean> abstractC8997hK3 = this.a;
        AbstractC8997hK<String> abstractC8997hK4 = this.d;
        return "CLCSInputFieldValue(stringValue=" + abstractC8997hK + ", intValue=" + abstractC8997hK2 + ", booleanValue=" + abstractC8997hK3 + ", encryptedStringValue=" + abstractC8997hK4 + ")";
    }

    public DQ(AbstractC8997hK<String> abstractC8997hK, AbstractC8997hK<Integer> abstractC8997hK2, AbstractC8997hK<Boolean> abstractC8997hK3, AbstractC8997hK<String> abstractC8997hK4) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        C8632dsu.c((Object) abstractC8997hK3, "");
        C8632dsu.c((Object) abstractC8997hK4, "");
        this.e = abstractC8997hK;
        this.c = abstractC8997hK2;
        this.a = abstractC8997hK3;
        this.d = abstractC8997hK4;
    }

    public /* synthetic */ DQ(AbstractC8997hK abstractC8997hK, AbstractC8997hK abstractC8997hK2, AbstractC8997hK abstractC8997hK3, AbstractC8997hK abstractC8997hK4, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, (i & 2) != 0 ? AbstractC8997hK.e.c : abstractC8997hK2, (i & 4) != 0 ? AbstractC8997hK.e.c : abstractC8997hK3, (i & 8) != 0 ? AbstractC8997hK.e.c : abstractC8997hK4);
    }
}
