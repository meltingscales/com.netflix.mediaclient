package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute;
import com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import com.netflix.mediaclient.graphql.models.type.SubtitleSize;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ams  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2800ams {
    private static final List<AbstractC9025hm> a;
    public static final C2800ams b = new C2800ams();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return f;
    }

    private C2800ams() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        List<C9021hi> e2;
        List<C9021hi> j10;
        List<AbstractC9025hm> j11;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        a = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        C9018hf d3 = new C9018hf.a("isHighest", bVar.b()).d();
        C9018hf d4 = new C9018hf.a("isLowest", bVar.b()).d();
        C9018hf d5 = new C9018hf.a("labels", C9019hg.a((AbstractC9026hn) eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j3 = C8569dql.j(d2, d3, d4, d5, new C9018hf.a("value", cVar.d()).d());
        d = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.EMAIL, eVar.e()).d());
        g = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, eVar.e()).d());
        j = j5;
        C9018hf d6 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        SubtitleColor.d dVar = SubtitleColor.d;
        C9018hf d7 = new C9018hf.a("backgroundColor", dVar.e()).d();
        SubtitleOpacity.c cVar2 = SubtitleOpacity.a;
        j6 = C8569dql.j(d6, d7, new C9018hf.a("backgroundOpacity", cVar2.b()).d(), new C9018hf.a("charColor", dVar.e()).d(), new C9018hf.a("charEdgeAttribute", SubtitleEdgeAttribute.a.e()).d(), new C9018hf.a("charEdgeColor", dVar.e()).d(), new C9018hf.a("charOpacity", cVar2.b()).d(), new C9018hf.a("charSize", SubtitleSize.e.d()).d(), new C9018hf.a("charStyle", SubtitleFontStyle.d.e()).d(), new C9018hf.a("windowColor", dVar.e()).d(), new C9018hf.a("windowOpacity", cVar2.b()).d());
        h = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d());
        e = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3378axp.e.d()).e(j7).d());
        c = j8;
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3379axq.a.b()))).e(j8).d());
        i = j9;
        C9018hf d8 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d9 = new C9018hf.a(Payload.PARAM_GUID, C9019hg.d(C2946apf.d.a())).d();
        C9018hf.a aVar = new C9018hf.a("avatar", C2951apk.b.b());
        e2 = C8566dqi.e(new C9021hi.d("dimension").b("AVATAR_SIZE_200").b());
        C9018hf d10 = aVar.b(e2).e(j2).d();
        C9018hf d11 = new C9018hf.a("isAccountOwner", bVar.b()).d();
        C9018hf d12 = new C9018hf.a("isAutoStartEnabled", bVar.b()).d();
        C9018hf d13 = new C9018hf.a("isDefaultKidsProfile", bVar.b()).d();
        C9018hf d14 = new C9018hf.a("isKids", bVar.b()).d();
        C9018hf d15 = new C9018hf.a("isPinLocked", bVar.b()).d();
        C9018hf d16 = new C9018hf.a("isProfileCreationLocked", bVar.b()).d();
        C9018hf d17 = new C9018hf.a("isVideoMerchEnabled", bVar.b()).d();
        C9018hf d18 = new C9018hf.a("lockPin", eVar.e()).d();
        C9018hf d19 = new C9018hf.a("maturityRating", C3140atN.e.b()).e(j3).d();
        C9018hf d20 = new C9018hf.a("name", eVar.e()).d();
        C9018hf d21 = new C9018hf.a("personalData", C3064arr.d.d()).e(j4).d();
        C9018hf d22 = new C9018hf.a("primaryLanguage", eVar.e()).d();
        C9018hf d23 = new C9018hf.a(SignupConstants.Field.SECONDARY_LANGUAGES, C9019hg.a((AbstractC9026hn) eVar.e())).d();
        C9018hf d24 = new C9018hf.a("suggestedLocales", C9019hg.a((AbstractC9026hn) C2929apO.b.d())).e(j5).d();
        C9018hf d25 = new C9018hf.a("subtitleSettings", C3227auw.c.b()).e(j6).d();
        C9018hf.a c2 = new C9018hf.a("titleProtectedVideos", C3142atP.c.e()).c("firstProtectedVideos");
        j10 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(1).b());
        j11 = C8569dql.j(d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, c2.b(j10).e(j9).d());
        f = j11;
    }
}
