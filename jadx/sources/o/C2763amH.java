package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2763amH {
    private static final List<AbstractC9025hm> a;
    public static final C2763amH c = new C2763amH();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2763amH() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        e2 = C8566dqi.e("Profile");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Profile", e2).b(C2798amq.e.a()).a());
        a = j;
        C9018hf.a aVar = new C9018hf.a("profile", C3137atK.a.d());
        e3 = C8566dqi.e(new C9021hi.d(Payload.PARAM_GUID).b(new C9027ho(Payload.PARAM_GUID)).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j).d());
        e = e4;
    }
}
