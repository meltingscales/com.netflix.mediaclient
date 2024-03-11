package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2619ajW {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2619ajW e = new C2619ajW();

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C2619ajW() {
    }

    static {
        List j;
        List j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<AbstractC9025hm> j4;
        List j5;
        List e3;
        List<AbstractC9025hm> j6;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a2 = new C9017he.d("Video", j).b(C2794amm.d.c()).a();
        j2 = C8569dql.j("Episode", "Movie", "Supplemental");
        j3 = C8569dql.j(a2, new C9017he.d("Viewable", j2).b(C2792amk.a.d()).a());
        b = j3;
        e2 = C8566dqi.e("Game");
        j4 = C8569dql.j(new C9017he.d("Game", e2).b(C2683akh.e.a()).a(), new C9018hf.a("isDeviceSupported", C2945ape.b.b()).d());
        a = j4;
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e3 = C8566dqi.e("Game");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j5).b(j3).a(), new C9017he.d("Game", e3).b(j4).a());
        c = j6;
    }
}
