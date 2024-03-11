package o;

/* renamed from: o.auZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3204auZ {
    private final AbstractC8997hK<Integer> c;
    private final int d;

    public final AbstractC8997hK<Integer> b() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3204auZ) {
            C3204auZ c3204auZ = (C3204auZ) obj;
            return this.d == c3204auZ.d && C8632dsu.c(this.c, c3204auZ.c);
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.d) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.d;
        AbstractC8997hK<Integer> abstractC8997hK = this.c;
        return "UXConfigABTestAssignmentInput(testId=" + i + ", cell=" + abstractC8997hK + ")";
    }
}
