package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C0809Dk;
import o.C9017he;
import o.C9018hf;
import o.EI;
import o.EK;

/* renamed from: o.Ci  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0781Ci {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final int c;
    public static final C0781Ci d = new C0781Ci();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C0781Ci() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List j4;
        List<AbstractC9025hm> j5;
        List j6;
        List<AbstractC9025hm> j7;
        List j8;
        List<AbstractC9025hm> j9;
        List<AbstractC9025hm> j10;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        C9017he.d dVar2 = new C9017he.d("LocalizedString", j2);
        CN cn = CN.c;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(cn.b()).a());
        h = j3;
        j4 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j4).b(cn.b()).a());
        b = j5;
        j6 = C8569dql.j("AlertDialogActionDismiss", "AlertDialogActionNavigateAppStore", "AlertDialogActionNavigateLogin");
        C9017he.d dVar3 = new C9017he.d("AlertDialogAction", j6);
        C0782Cj c0782Cj = C0782Cj.c;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar3.b(c0782Cj.b()).a());
        a = j7;
        j8 = C8569dql.j("AlertDialogActionDismiss", "AlertDialogActionNavigateAppStore", "AlertDialogActionNavigateLogin");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("AlertDialogAction", j8).b(c0782Cj.b()).a());
        j = j9;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        EI.d dVar4 = EI.e;
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, dVar4.e()).e(j3).d();
        C9018hf d4 = new C9018hf.a("message", dVar4.e()).e(j5).d();
        C0809Dk.d dVar5 = C0809Dk.e;
        j10 = C8569dql.j(d2, d3, d4, new C9018hf.a("dismissAction", dVar5.b()).e(j7).d(), new C9018hf.a("secondaryAction", dVar5.b()).e(j9).d(), new C9018hf.a("errorCode", dVar.c()).d());
        e = j10;
        c = 8;
    }
}
