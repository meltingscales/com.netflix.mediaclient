package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aoh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2895aoh {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> c;
    public static final C2895aoh d = new C2895aoh();

    public final List<AbstractC9025hm> d() {
        return a;
    }

    private C2895aoh() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(C2946apf.d.a())).d());
        c = j;
        C9018hf.a aVar = new C9018hf.a("uxConfigCreate", C9019hg.d(C3203auY.e.c()));
        e = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e2 = C8566dqi.e(aVar.b(e).e(j).d());
        a = e2;
    }
}
