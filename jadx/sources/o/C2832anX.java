package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2832anX {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2832anX d = new C2832anX();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2832anX() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d2, d3, new C9018hf.a("isInPlaylist", bVar.b()).d(), new C9018hf.a("isInRemindMeList", bVar.b()).d());
        c = j;
        C9018hf.a aVar = new C9018hf.a("removeFromPlaylist", C3378axp.e.d());
        e = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e2 = C8566dqi.e(aVar.b(e).e(j).d());
        b = e2;
    }
}
