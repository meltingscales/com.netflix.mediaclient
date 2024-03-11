package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.oq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9400oq extends AbstractC9403ot {
    @Override // o.AbstractC9403ot
    long c() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // o.AbstractC9403ot
    long b() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // o.AbstractC9403ot
    long e() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // o.AbstractC9403ot
    long b(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double e = C9404ou.e(z, j, i3, z2, i4);
        if (Double.isNaN(e)) {
            e = Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return Double.doubleToRawLongBits(e);
    }

    @Override // o.AbstractC9403ot
    long e(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double c = C9404ou.c(z, j, i3, z2, i4);
        if (Double.isNaN(c)) {
            c = Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return Double.doubleToRawLongBits(c);
    }
}
