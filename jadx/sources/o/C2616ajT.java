package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2616ajT {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2616ajT e = new C2616ajT();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2616ajT() {
    }

    static {
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e5;
        List e6;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf.a c2 = new C9018hf.a("numberLabel", eVar.e()).c("longNumberLabel");
        e2 = C8566dqi.e(new C9021hi.d("label").b("LONG").b());
        e3 = C8566dqi.e(c2.b(e2).d());
        a = e3;
        e4 = C8566dqi.e("Season");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9017he.d("Season", e4).b(e3).a());
        d = j;
        e5 = C8566dqi.e(new C9018hf.a("parentSeason", C3215auk.e.e()).e(j).d());
        c = e5;
        e6 = C8566dqi.e("Episode");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e6).b(e5).a(), new C9018hf.a("isInRemindMeList", C2945ape.b.b()).d());
        b = j2;
    }
}
