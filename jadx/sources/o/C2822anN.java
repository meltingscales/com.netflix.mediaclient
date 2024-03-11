package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2822anN {
    public static final C2822anN b = new C2822anN();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> c() {
        return d;
    }

    private C2822anN() {
    }

    static {
        List e;
        List<AbstractC9025hm> j;
        Map b2;
        List e2;
        Map c2;
        List e3;
        Map b3;
        Map b4;
        List<C9021hi> j2;
        List<AbstractC9025hm> e4;
        e = C8566dqi.e("PinotDefaultPrePlayPage");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotDefaultPrePlayPage", e).b(C2721alS.c.e()).a());
        c = j;
        C9018hf.a aVar = new C9018hf.a("pinotPrePlayPage", C3156atd.a.b());
        C9021hi.d dVar = new C9021hi.d("input");
        b2 = dqD.b(dpD.a(SignupConstants.Field.VIDEO_ID, new C9027ho(SignupConstants.Field.VIDEO_ID)));
        C9021hi b5 = dVar.b(b2).b();
        C9021hi.d dVar2 = new C9021hi.d("options");
        Pair a = dpD.a("sectionKind", "PrePlayRecap");
        e2 = C8566dqi.e("Video");
        c2 = dqE.c(a, dpD.a("supportedEntityKinds", e2));
        e3 = C8566dqi.e(c2);
        b3 = dqD.b(dpD.a("supportedSectionKinds", e3));
        b4 = dqD.b(dpD.a("clientCapabilities", b3));
        j2 = C8569dql.j(b5, dVar2.b(b4).b());
        e4 = C8566dqi.e(aVar.b(j2).e(j).d());
        d = e4;
    }
}
