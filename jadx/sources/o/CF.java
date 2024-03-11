package o;

import com.netflix.clcs.codegen.type.CLCSIconSize;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CF {
    private static final List<AbstractC9025hm> a;
    public static final int b;
    public static final CF c = new CF();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> b() {
        return h;
    }

    private CF() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List e2;
        List<AbstractC9025hm> j3;
        List e3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        EK.d dVar = EK.e;
        j = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j).b(CN.c.b()).a());
        d = j2;
        e2 = C8566dqi.e("CLCSDesignIcon");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignIcon", e2).b(C0797Cy.a.e()).a());
        e = j3;
        e3 = C8566dqi.e("CLCSDesignColor");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignColor", e3).b(C0790Cr.c.a()).a());
        a = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("accessibilityDescription", EI.e.e()).e(j2).d(), new C9018hf.a("icon", DB.a.d()).e(j3).d(), new C9018hf.a("size", CLCSIconSize.c.b()).c("iconSize").d(), new C9018hf.a("color", DC.d.d()).e(j4).d());
        h = j5;
        b = 8;
    }
}
