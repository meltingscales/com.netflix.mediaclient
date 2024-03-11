package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.anw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2857anw {
    private static final List<AbstractC9025hm> a;
    public static final C2857anw b = new C2857anw();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> e() {
        return a;
    }

    private C2857anw() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("state", eVar.e()).d(), new C9018hf.a("codeChallenge", C9019hg.d(eVar.e())).d());
        d = j;
        e = C8566dqi.e(new C9018hf.a("oAuth2PKCEInit", C9019hg.d(C3047ara.b.a())).e(j).d());
        a = e;
    }
}
