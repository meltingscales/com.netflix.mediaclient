package o;

/* renamed from: o.dwc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8722dwc {
    private int c;

    public C8722dwc() {
        this(0, 1, null);
    }

    public final void a(int i) {
        this.c += i;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8722dwc) && this.c == ((C8722dwc) obj).c;
    }

    public int hashCode() {
        return Integer.hashCode(this.c);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.c + ')';
    }

    public C8722dwc(int i) {
        this.c = i;
    }

    public /* synthetic */ C8722dwc(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
