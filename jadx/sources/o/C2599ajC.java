package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2599ajC {
    public static final C2599ajC a = new C2599ajC();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2599ajC() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a("message", eVar.e()).d());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("contentWarning", C2876aoO.d.a()).e(j).d());
        e = j2;
    }
}
