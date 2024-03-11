package o;

/* renamed from: o.buW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5212buW {
    private final long a;
    private final long b;
    private final InterfaceC5214buY d;

    public final long a() {
        return this.a;
    }

    public final InterfaceC5214buY b() {
        return this.d;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5212buW) {
            C5212buW c5212buW = (C5212buW) obj;
            return this.b == c5212buW.b && C8632dsu.c(this.d, c5212buW.d) && this.a == c5212buW.a;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.b) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.a);
    }

    public String toString() {
        long j = this.b;
        InterfaceC5214buY interfaceC5214buY = this.d;
        long j2 = this.a;
        return "AdTimestamp(adBreakLocationMs=" + j + ", adIdentifier=" + interfaceC5214buY + ", offsetMs=" + j2 + ")";
    }

    public C5212buW(long j, InterfaceC5214buY interfaceC5214buY, long j2) {
        C8632dsu.c((Object) interfaceC5214buY, "");
        this.b = j;
        this.d = interfaceC5214buY;
        this.a = j2;
    }
}
