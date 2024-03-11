package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2661akL {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2661akL c = new C2661akL();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> a() {
        return h;
    }

    private C2661akL() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e4;
        List e5;
        List<AbstractC9025hm> j3;
        List<C9021hi> j4;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LolomoHeader");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoHeader", e2).b(C2687akl.d.e()).a());
        a = j;
        e3 = C8566dqi.e("LolomoFeedRowEntitiesEdge");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoFeedRowEntitiesEdge", e3).b(C2621ajY.e.b()).a());
        b = j2;
        e4 = C8566dqi.e(new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C3013aqt.b.e())).e(j2).d());
        e = e4;
        e5 = C8566dqi.e("LolomoFeedRowEntitiesConnection");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoFeedRowEntitiesConnection", e5).b(e4).a());
        d = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("header", C3018aqy.c.c()).e(j).d();
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C3012aqs.c.b()).c("trailerEntities");
        j4 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j5 = C8569dql.j(d2, d3, c2.b(j4).e(j3).d());
        h = j5;
    }
}
