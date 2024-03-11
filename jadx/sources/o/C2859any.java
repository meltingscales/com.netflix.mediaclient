package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.any  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2859any {
    public static final C2859any a = new C2859any();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> d() {
        return d;
    }

    private C2859any() {
    }

    static {
        List j;
        List<AbstractC9025hm> e;
        List j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2708alF.d.e()).a());
        b = e;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e).a());
        c = j3;
        C9018hf.a aVar = new C9018hf.a("pinotPageById", C3096asW.d.a());
        e2 = C8566dqi.e(new C9021hi.d(SignupConstants.Field.LANG_ID).b(new C9027ho("pageId")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j3).d());
        d = e3;
    }
}
