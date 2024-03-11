package o;

import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.akp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2691akp {
    public static final C2691akp a = new C2691akp();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> b() {
        return j;
    }

    private C2691akp() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List j5;
        List<AbstractC9025hm> j6;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("interactivePlaybackProgressPercentage", C2949api.a.d()).d());
        c = j2;
        e2 = C8566dqi.e(new C9018hf.a("bookmark", C3380axr.e.c()).e(j2).d());
        d = e2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        j3 = C8569dql.j(d2, new C9018hf.a("prePlay", bVar.b()).d(), new C9018hf.a("fallbackTutorial", bVar.b()).d(), new C9018hf.a("videoMoments", bVar.b()).d(), new C9018hf.a("customBookmark", bVar.b()).d(), new C9018hf.a("playbackGraph", bVar.b()).d(), new C9018hf.a("resetUserState", bVar.b()).d(), new C9018hf.a("playerControlsSnapshots", bVar.b()).d(), new C9018hf.a("hideDetailedDurations", bVar.b()).d(), new C9018hf.a("interactiveAppUpdateDialogue", bVar.b()).d(), new C9018hf.a("interactiveTrailer", bVar.b()).d(), new C9018hf.a("choicePointDebugMenu", bVar.b()).d(), new C9018hf.a("ipp", bVar.b()).d(), new C9018hf.a("mainfeatureIdentifier", eVar.e()).d(), new C9018hf.a("supportedErrorDialogs", C9019hg.a(C9019hg.d(eVar.e()))).d(), new C9018hf.a("pollingToggle", bVar.b()).d(), new C9018hf.a("bookmarkOverrideSeconds", C2948aph.a.d()).d(), new C9018hf.a("hideSubtitlesMenuDuringPlayback", bVar.b()).d(), new C9018hf.a("playerControlsPersistPlayPause", bVar.b()).d());
        b = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("interactiveSummaryFeatures", C2953apm.c.b()).e(j3).d());
        e = j4;
        j5 = C8569dql.j("Episode", "Movie", "Supplemental");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Viewable", j5).b(e2).a(), new C9018hf.a("interactiveVideoData", C2955apo.d.d()).e(j4).d());
        j = j6;
    }
}
