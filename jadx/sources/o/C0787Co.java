package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EE;
import o.EK;

/* renamed from: o.Co  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0787Co {
    private static final List<AbstractC9025hm> a;
    public static final C0787Co b = new C0787Co();
    private static final List<AbstractC9025hm> d;
    public static final int e;

    public final List<AbstractC9025hm> c() {
        return d;
    }

    private C0787Co() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        EK.d dVar = EK.e;
        j = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j).b(CN.c.b()).a());
        a = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(dVar.c())).d();
        C9018hf d4 = new C9018hf.a("persistedCacheKey", dVar.c()).d();
        EE.e eVar = EE.e;
        j3 = C8569dql.j(d2, d3, d4, new C9018hf.a("initialValue", eVar.a()).c("boolInitialValue").d(), new C9018hf.a("mustBeTrue", eVar.a()).d(), new C9018hf.a("errorMessage", EI.e.e()).e(j2).d());
        d = j3;
        e = 8;
    }
}
