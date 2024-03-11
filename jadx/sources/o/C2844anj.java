package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2844anj {
    public static final C2844anj a = new C2844anj();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private C2844anj() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e2;
        List j2;
        List<AbstractC9025hm> j3;
        List e3;
        List<C9021hi> e4;
        List<AbstractC9025hm> e5;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("waitingRoomMessage", eVar.e()).d());
        c = j;
        e2 = C8566dqi.e(new C9018hf.a("liveEvent", C2931apQ.e.b()).e(j).d());
        b = e2;
        j2 = C8569dql.j("Episode", "Movie");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9017he.d("LiveEventViewable", j2).b(e2).a());
        d = j3;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e3 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e4 = C8566dqi.e(dVar.b(e3).b());
        e5 = C8566dqi.e(aVar.b(e4).e(j3).d());
        e = e5;
    }
}
