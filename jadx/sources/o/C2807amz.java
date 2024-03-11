package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2807amz {
    private static final List<AbstractC9025hm> a;
    public static final C2807amz d = new C2807amz();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private C2807amz() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d2, d3, new C9018hf.a("isInPlaylist", bVar.b()).d(), new C9018hf.a("isInRemindMeList", bVar.b()).d());
        a = j;
        C9018hf.a aVar = new C9018hf.a("addToPlaylist", C3378axp.e.d());
        e2 = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j).d());
        e = e3;
    }
}
