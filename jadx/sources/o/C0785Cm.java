package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0785Cm {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C0785Cm c = new C0785Cm();
    public static final int e;

    public final List<AbstractC9025hm> a() {
        return b;
    }

    private C0785Cm() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> j4;
        EK.d dVar = EK.e;
        j = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j).b(CN.c.b()).a());
        a = j2;
        j3 = C8569dql.j("CLCSButton", "CLCSButtonCountdown", "CLCSButtonProperties");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("accessibilityDescription", EI.e.e()).e(j2).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d(), new C9018hf.a("loggingViewName", dVar.c()).d(), new C9017he.d("CLCSButtonLike", j3).b(C0793Cu.a.c()).a());
        b = j4;
        e = 8;
    }
}
