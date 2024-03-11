package o;

import java.util.List;

/* renamed from: o.cR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6020cR extends AbstractC6158cW<Float> {
    public C6020cR(List<C8910fd<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC5913cN
    /* renamed from: e */
    public Float c(C8910fd<Float> c8910fd, float f) {
        return Float.valueOf(b(c8910fd, f));
    }

    float b(C8910fd<Float> c8910fd, float f) {
        Float f2;
        if (c8910fd.j == null || c8910fd.d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8912ff<A> c8912ff = this.a;
        if (c8912ff != 0 && (f2 = (Float) c8912ff.a(c8910fd.g, c8910fd.e.floatValue(), c8910fd.j, c8910fd.d, f, a(), c())) != null) {
            return f2.floatValue();
        }
        return C8853eZ.b(c8910fd.i(), c8910fd.c(), f);
    }

    public float h() {
        return b(b(), d());
    }
}
