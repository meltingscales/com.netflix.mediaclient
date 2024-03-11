package o;

/* renamed from: o.avE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3235avE {
    private final String d;

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3235avE) && C8632dsu.c((Object) this.d, (Object) ((C3235avE) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        String str = this.d;
        return "UXConfigHawkinsInput(version=" + str + ")";
    }
}
