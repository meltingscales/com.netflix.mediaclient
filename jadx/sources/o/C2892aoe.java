package o;

import java.util.List;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aoe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2892aoe {
    private static final List<AbstractC9025hm> c;
    public static final C2892aoe d = new C2892aoe();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2892aoe() {
    }

    static {
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        C9018hf.a aVar = new C9018hf.a("shouldRecordRdid", C2945ape.b.b());
        e = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e2 = C8566dqi.e(aVar.b(e).d());
        c = e2;
    }
}
