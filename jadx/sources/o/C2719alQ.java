package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2719alQ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> d;
    public static final C2719alQ e = new C2719alQ();

    public final List<AbstractC9025hm> b() {
        return d;
    }

    private C2719alQ() {
    }

    static {
        List<C9021hi> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("value", eVar.e());
        j = C8569dql.j(new C9021hi.d("locale").b(), new C9021hi.d("standalone").b());
        j2 = C8569dql.j(d2, aVar.b(j).d());
        a = j2;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.LANG_ID, eVar.e()).d();
        C9018hf d5 = new C9018hf.a("language", eVar.e()).d();
        C9018hf d6 = new C9018hf.a("languageTag", eVar.e()).d();
        C9018hf.a aVar2 = new C9018hf.a("localizedDisplayName", C2935apU.d.e());
        j3 = C8569dql.j(new C9021hi.d("displayLocale").b(), new C9021hi.d("standalone").b(Boolean.TRUE).b());
        j4 = C8569dql.j(d3, d4, d5, d6, aVar2.b(j3).e(j2).d());
        d = j4;
    }
}
