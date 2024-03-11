package o;

import com.netflix.clcs.codegen.type.CLCSIconSize;
import com.netflix.clcs.codegen.type.CLCSStaticListType;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EJ;
import o.EK;

/* loaded from: classes2.dex */
public final class CT {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final CT c = new CT();
    public static final int d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> d() {
        return i;
    }

    private CT() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<AbstractC9025hm> j4;
        List e3;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List j7;
        List<AbstractC9025hm> j8;
        List j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        List<AbstractC9025hm> j12;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j2).b(CN.c.b()).a());
        a = j3;
        e2 = C8566dqi.e("CLCSDesignIcon");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignIcon", e2).b(C0797Cy.a.e()).a());
        h = j4;
        e3 = C8566dqi.e("CLCSDesignColor");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignColor", e3).b(C0790Cr.c.a()).a());
        e = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("accessibilityDescription", EI.e.e()).e(j3).d(), new C9018hf.a("icon", DB.a.d()).e(j4).d(), new C9018hf.a("color", DC.d.d()).e(j5).d(), new C9018hf.a("size", CLCSIconSize.c.b()).d());
        f = j6;
        j7 = C8569dql.j("CLCSLegacyMessagingFormattedCopy", "GrowthLocalizedFormattedString", "ObelixFormattedString");
        C9017he.d dVar2 = new C9017he.d("LocalizedFormattedString", j7);
        CH ch = CH.e;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(ch.a()).a());
        g = j8;
        j9 = C8569dql.j("CLCSLegacyMessagingFormattedCopy", "GrowthLocalizedFormattedString", "ObelixFormattedString");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedFormattedString", j9).b(ch.a()).a());
        b = j10;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf d3 = new C9018hf.a("icon", DP.a.d()).e(j6).d();
        EJ.d dVar3 = EJ.e;
        j11 = C8569dql.j(d2, d3, new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, dVar3.e()).e(j8).d(), new C9018hf.a("body", dVar3.e()).e(j10).d());
        j = j11;
        j12 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("items", C9019hg.d(C9019hg.a(C9019hg.d(C0838En.d.c())))).e(j11).d(), new C9018hf.a("type", CLCSStaticListType.d.d()).c("listType").d());
        i = j12;
        d = 8;
    }
}
