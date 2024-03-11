package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2873aoL;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.all  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2740all {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2740all c = new C2740all();

    public final List<AbstractC9025hm> d() {
        return a;
    }

    private C2740all() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d, new C9018hf.a("totalCount", cVar.d()).d());
        b = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("listId", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT, C9019hg.d(eVar.e())).d();
        C9018hf d5 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C9018hf d6 = new C9018hf.a("trackId", cVar.d()).d();
        C2873aoL.b bVar = C2873aoL.a;
        C9018hf d7 = new C9018hf.a("expires", bVar.d()).d();
        C9018hf d8 = new C9018hf.a("refreshInterval", cVar.d()).d();
        C9018hf d9 = new C9018hf.a("createTime", bVar.d()).d();
        C9018hf d10 = new C9018hf.a("sectionUid", eVar.e()).d();
        C9018hf.a aVar = new C9018hf.a("entitiesConnection", C3009aqp.e.e());
        j2 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j3 = C8569dql.j(d2, d3, d4, d5, d6, d7, d8, d9, d10, aVar.b(j2).e(j).d(), new C9018hf.a("titleIconId", C2946apf.d.a()).d());
        a = j3;
    }
}
