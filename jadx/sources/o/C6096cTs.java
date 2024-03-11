package o;

import com.netflix.mediaclient.graphql.models.type.PinotEntityKind;
import com.netflix.mediaclient.graphql.models.type.PinotSectionKind;
import com.netflix.mediaclient.graphql.models.type.PinotUnifiedEntityKind;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC8997hK;

/* renamed from: o.cTs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6096cTs extends C6095cTr {
    private final aLP b;
    private final aCG d;
    private final aDB e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6096cTs(aLP alp, aCG acg, aDB adb) {
        super(alp, acg, adb);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        this.b = alp;
        this.d = acg;
        this.e = adb;
    }

    @Override // o.C6095cTr, o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d() {
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLPQSOption5RepositoryImpl$fetchPrequeryList$1(this, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    private final C3168atp e(PinotSectionKind pinotSectionKind, List<? extends PinotUnifiedEntityKind> list) {
        return new C3168atp(pinotSectionKind, list);
    }

    private final List<PinotSectionKind> n() {
        List<PinotSectionKind> j;
        j = C8569dql.j(PinotSectionKind.i, PinotSectionKind.b, PinotSectionKind.e);
        return j;
    }

    private final List<PinotUnifiedEntityKind> o() {
        List<PinotUnifiedEntityKind> j;
        j = C8569dql.j(PinotUnifiedEntityKind.g, PinotUnifiedEntityKind.b);
        return j;
    }

    public C3165atm b() {
        C3165atm c3165atm;
        if (C1867aRe.a.c().e()) {
            return null;
        }
        if (C8153dex.Y() || C1872aRj.c.c()) {
            c3165atm = new C3165atm(AbstractC8997hK.e.c, null, 2, null);
        } else {
            c3165atm = new C3165atm(new AbstractC8997hK.b(d(o(), n())), AbstractC8997hK.d.e(Boolean.FALSE));
        }
        return c3165atm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C3046arZ d(List<? extends PinotEntityKind> list) {
        C8632dsu.c((Object) list, "");
        return new C3046arZ(AbstractC8997hK.d.e(list));
    }

    protected C3110ask j() {
        List<? extends PinotEntityKind> e;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e2 = cVar.e(Integer.valueOf(C6062cSo.c.a(false)));
        e = C8566dqi.e(PinotEntityKind.h);
        return new C3110ask(cVar.e(new C3112asm(cVar.e(new C3037arQ(null, null, null, null, null, null, null, null, null, null, null, null, null, cVar.e(new C3100asa(cVar.e(d(e)))), null, null, cVar.e(new C3116asq(cVar.e(new C3046arZ(cVar.d())))), null, null, null, null, null, 4120575, null)), e2)));
    }

    protected C3110ask e(boolean z) {
        List<? extends PinotEntityKind> e;
        List<? extends PinotEntityKind> e2;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e3 = cVar.e(Integer.valueOf(C6062cSo.c.a(z)));
        e = C8566dqi.e(PinotEntityKind.d);
        AbstractC8997hK.b e4 = cVar.e(new C3028arH(cVar.e(d(e))));
        e2 = C8566dqi.e(PinotEntityKind.h);
        return new C3110ask(cVar.e(new C3112asm(cVar.e(new C3037arQ(e4, null, null, null, null, null, cVar.e(new C3033arM(cVar.e(d(e2)))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194238, null)), e3)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C3041arU f() {
        List e;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        AbstractC8997hK.b e2 = cVar.e(Integer.valueOf(C6062cSo.c.a(false)));
        e = C8566dqi.e(PinotEntityKind.h);
        return new C3041arU(cVar.e(new C3112asm(cVar.e(new C3037arQ(null, null, null, null, null, null, cVar.e(new C3033arM(cVar.e(new C3046arZ(cVar.e(e))))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194239, null)), e2)));
    }

    private final C3043arW a() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3043arW(cVar.e(new C3109asj(cVar.e(new C3036arP(null, null, null, null, null, null, null, cVar.e(e(true)), null, null, null, null, null, 8063, null)))));
    }

    protected C3102asc c() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3102asc(cVar.e(new C3109asj(cVar.e(new C3036arP(null, null, null, cVar.e(f()), null, null, null, cVar.e(e(false)), null, null, null, null, null, 8055, null)))));
    }

    private final C3106asg i() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3106asg(cVar.e(new C3109asj(cVar.e(new C3036arP(null, null, null, null, null, null, null, cVar.e(j()), null, null, null, null, null, 8063, null)))));
    }

    public final C3105asf h() {
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3105asf(cVar.e(new C3103asd(cVar.e(new C3039arS(cVar.e(a()), cVar.e(c()), cVar.e(i()), null, 8, null)), cVar.e(3), null, 4, null)));
    }

    private final List<C3168atp> d(List<? extends PinotUnifiedEntityKind> list, List<? extends PinotSectionKind> list2) {
        int d;
        d = C8572dqo.d(list2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (PinotSectionKind pinotSectionKind : list2) {
            arrayList.add(e(pinotSectionKind, list));
        }
        return arrayList;
    }
}
