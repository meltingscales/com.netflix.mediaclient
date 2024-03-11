package o;

import java.util.List;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.Dj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0808Dj {
    private static final List<AbstractC9025hm> a;
    public static final int b;
    public static final C0808Dj c = new C0808Dj();

    public final List<AbstractC9025hm> e() {
        return a;
    }

    private C0808Dj() {
    }

    static {
        List<C9021hi> j;
        List<AbstractC9025hm> e;
        C9018hf.a aVar = new C9018hf.a("clcsSendFeedback", EE.e.a());
        j = C8569dql.j(new C9021hi.d("inputFields").b(new C9027ho("inputFields")).b(), new C9021hi.d("serverFeedback").b(new C9027ho("serverFeedback")).b(), new C9021hi.d("serverState").b(new C9027ho("serverState")).b());
        e = C8566dqi.e(aVar.b(j).d());
        a = e;
        b = 8;
    }
}
