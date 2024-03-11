package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.De  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0803De {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final int c;
    public static final C0803De d = new C0803De();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C0803De() {
    }

    static {
        List e;
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> e2;
        e = C8566dqi.e("CLCSScreen");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSScreen", e).b(CR.c.b()).a());
        a = j;
        C9018hf.a aVar = new C9018hf.a("clcsInterstitialPlaybackError", C0829Ee.b.c());
        j2 = C8569dql.j(new C9021hi.d("commonParameters").b(new C9027ho("commonParameters")).b(), new C9021hi.d("errorCode").b(new C9027ho("errorCode")).b(), new C9021hi.d(SignupConstants.Field.VIDEO_ID).b());
        e2 = C8566dqi.e(aVar.b(j2).e(j).d());
        b = e2;
        c = 8;
    }
}
