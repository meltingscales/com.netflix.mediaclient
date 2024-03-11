package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.oA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9358oA extends AbstractC9403ot {
    @Override // o.AbstractC9403ot
    long c() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // o.AbstractC9403ot
    long b() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // o.AbstractC9403ot
    long e() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // o.AbstractC9403ot
    long b(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float e = C9408oy.e(z, j, i3, z2, i4);
        if (Float.isNaN(e)) {
            e = Float.parseFloat(charSequence.subSequence(i, i2).toString());
        }
        return Float.floatToRawIntBits(e);
    }

    @Override // o.AbstractC9403ot
    long e(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float d = C9408oy.d(z, j, i3, z2, i4);
        if (Float.isNaN(d)) {
            d = Float.parseFloat(charSequence.subSequence(i, i2).toString());
        }
        return Float.floatToRawIntBits(d);
    }
}
