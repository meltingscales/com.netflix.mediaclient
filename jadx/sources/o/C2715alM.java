package o;

import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.alM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2715alM {
    private static final List<AbstractC9025hm> a;
    public static final C2715alM c = new C2715alM();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2715alM() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d, new C9018hf.a("isPinProtected", bVar.b()).d(), new C9018hf.a("isAgeVerificationProtected", bVar.b()).d(), new C9018hf.a("isPreReleasePinProtected", bVar.b()).d());
        a = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("protected", C3382axt.a.c()).e(j).d());
        e = j2;
    }
}