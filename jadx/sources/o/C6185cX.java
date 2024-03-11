package o;

import java.util.List;

/* renamed from: o.cX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6185cX extends AbstractC6158cW<C8913fg> {
    private final C8913fg b;

    public C6185cX(List<C8910fd<C8913fg>> list) {
        super(list);
        this.b = new C8913fg();
    }

    @Override // o.AbstractC5913cN
    /* renamed from: a */
    public C8913fg c(C8910fd<C8913fg> c8910fd, float f) {
        C8913fg c8913fg;
        C8913fg c8913fg2;
        C8913fg c8913fg3 = c8910fd.j;
        if (c8913fg3 == null || (c8913fg = c8910fd.d) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8913fg c8913fg4 = c8913fg3;
        C8913fg c8913fg5 = c8913fg;
        C8912ff<A> c8912ff = this.a;
        if (c8912ff == 0 || (c8913fg2 = (C8913fg) c8912ff.a(c8910fd.g, c8910fd.e.floatValue(), c8913fg4, c8913fg5, f, a(), c())) == null) {
            this.b.b(C8853eZ.b(c8913fg4.c(), c8913fg5.c(), f), C8853eZ.b(c8913fg4.b(), c8913fg5.b(), f));
            return this.b;
        }
        return c8913fg2;
    }
}
