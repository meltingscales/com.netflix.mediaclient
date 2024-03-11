package o;

import java.util.List;

/* renamed from: o.cV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6131cV extends AbstractC6158cW<Integer> {
    public C6131cV(List<C8910fd<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC5913cN
    /* renamed from: a */
    public Integer c(C8910fd<Integer> c8910fd, float f) {
        return Integer.valueOf(b(c8910fd, f));
    }

    int b(C8910fd<Integer> c8910fd, float f) {
        Integer num;
        if (c8910fd.j == null || c8910fd.d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8912ff<A> c8912ff = this.a;
        if (c8912ff != 0 && (num = (Integer) c8912ff.a(c8910fd.g, c8910fd.e.floatValue(), c8910fd.j, c8910fd.d, f, a(), c())) != null) {
            return num.intValue();
        }
        return C8853eZ.a(c8910fd.h(), c8910fd.d(), f);
    }

    public int h() {
        return b(b(), d());
    }
}
