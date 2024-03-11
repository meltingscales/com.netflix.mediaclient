package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.PostPlayAction;
import java.util.List;
import o.C2946apf;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2722alT {
    public static final C2722alT a = new C2722alT();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> d() {
        return g;
    }

    private C2722alT() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<AbstractC9025hm> j4;
        List j5;
        List e3;
        List<AbstractC9025hm> j6;
        List e4;
        List j7;
        List<AbstractC9025hm> j8;
        List j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        List j12;
        List e5;
        List<AbstractC9025hm> j13;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j2 = C8569dql.j(d2, new C9018hf.a("trackId", cVar.d()).d(), new C9018hf.a("feature", eVar.e()).d());
        c = j2;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2946apf.a aVar = C2946apf.d;
        j3 = C8569dql.j(d3, new C9018hf.a("sectionId", C9019hg.d(aVar.a())).d(), new C9018hf.a("loggingData", C3172att.a.a()).e(j2).d());
        b = j3;
        e2 = C8566dqi.e("Show");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Show", e2).b(C2718alP.c.d()).a());
        j = j4;
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e3 = C8566dqi.e("Episode");
        j6 = C8569dql.j(new C9017he.d("Video", j5).b(C2750alv.c.e()).a(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j4).d(), new C9017he.d("Episode", e3).b(C2709alG.d.c()).a());
        e = j6;
        e4 = C8566dqi.e("Episode");
        j7 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j8 = C8569dql.j(new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e4).b(j6).a(), new C9017he.d("Video", j7).b(C2714alL.d.b()).a());
        f = j8;
        j9 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j9).b(j8).a(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d());
        i = j10;
        j11 = C8569dql.j(new C9018hf.a("recapEntity", C3375axm.a.e()).e(j10).d(), new C9018hf.a(PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY, C2945ape.b.b()).d(), new C9018hf.a("impressionToken", eVar.e()).d());
        d = j11;
        j12 = C8569dql.j("PinotPostNextEpisodeSeamlessSection", "PinotPostPlayHardwireSection", "PinotPostPlayLegacyOriginalsSection", "PinotPostPlayLiveEventEndSection", "PinotPostPlayOriginalsBackgroundTrailerSection", "PinotPostPlayPreview3Section", "PinotPostPlayTwoUpChoicePointSection", "PinotPrePlayRecapSection");
        e5 = C8566dqi.e("PinotPrePlayRecapSection");
        j13 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotPrePostPlayBaseSection", j12).b(j3).a(), new C9017he.d("PinotPrePlayRecapSection", e5).b(j11).a());
        g = j13;
    }
}
