package o;

import java.util.List;

/* renamed from: o.cQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5993cQ extends AbstractC6158cW<Integer> {
    public C5993cQ(List<C8910fd<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC5913cN
    /* renamed from: b */
    public Integer c(C8910fd<Integer> c8910fd, float f) {
        return Integer.valueOf(d(c8910fd, f));
    }

    public int d(C8910fd<Integer> c8910fd, float f) {
        Integer num;
        if (c8910fd.j == null || c8910fd.d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8912ff<A> c8912ff = this.a;
        if (c8912ff != 0 && (num = (Integer) c8912ff.a(c8910fd.g, c8910fd.e.floatValue(), c8910fd.j, c8910fd.d, f, a(), c())) != null) {
            return num.intValue();
        }
        return C8851eX.c(C8853eZ.a(f, 0.0f, 1.0f), c8910fd.j.intValue(), c8910fd.d.intValue());
    }

    public int j() {
        return d(b(), d());
    }
}
