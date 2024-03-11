package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ane  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2839ane {
    private static final List<AbstractC9025hm> a;
    public static final C2839ane b = new C2839ane();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2839ane() {
    }

    static {
        List j;
        List<AbstractC9025hm> e;
        List j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2696aku.d.b()).a());
        c = e;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e).a());
        a = j3;
        C9018hf.a aVar = new C9018hf.a("pinotPageById", C3096asW.d.a());
        e2 = C8566dqi.e(new C9021hi.d(SignupConstants.Field.LANG_ID).b(new C9027ho("pageId")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j3).d());
        d = e3;
    }
}
