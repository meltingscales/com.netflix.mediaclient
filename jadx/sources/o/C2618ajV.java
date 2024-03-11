package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2618ajV {
    public static final C2618ajV a = new C2618ajV();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2618ajV() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Show", "Movie", "Game", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoFeedEntity", j).b(C2619ajW.e.b()).a());
        e = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(C2946apf.d.a())).d(), new C9018hf.a("reference", C3007aqn.a.e()).e(j2).d());
        b = j3;
    }
}
