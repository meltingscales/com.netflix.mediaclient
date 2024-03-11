package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0782Cj {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C0782Cj c = new C0782Cj();
    public static final int e;

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C0782Cj() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        EK.d dVar = EK.e;
        j = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j).b(CN.c.b()).a());
        b = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("label", EI.e.e()).e(j2).d());
        a = j3;
        e = 8;
    }
}
