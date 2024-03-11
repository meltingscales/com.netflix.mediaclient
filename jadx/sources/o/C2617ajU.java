package o;

import com.netflix.mediaclient.graphql.models.type.PlaylistAction;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2617ajU {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2617ajU e = new C2617ajU();

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C2617ajU() {
    }

    static {
        List<AbstractC9025hm> j;
        List e2;
        List e3;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("packageName", C9019hg.d(eVar.e())).d(), new C9018hf.a("appStoreUrl", eVar.e()).d());
        d = j;
        e2 = C8566dqi.e("Game");
        e3 = C8566dqi.e("Game");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Game", e2).b(C2683akh.e.a()).a(), new C9018hf.a("isDeviceSupported", C2945ape.b.b()).d(), new C9018hf.a("androidInstallation", C2866aoE.e.c()).e(j).d(), new C9018hf.a("playlistActions", C9019hg.a(C9019hg.d(PlaylistAction.c.c()))).d(), new C9017he.d("Game", e3).b(C2682akg.e.b()).a());
        c = j2;
    }
}
