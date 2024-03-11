package o;

import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkFallbackStrategy;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkFormat;
import com.netflix.mediaclient.graphql.models.type.PinotSearchArtworkType;
import com.netflix.mediaclient.ui.search.v2.graphQL.GraphQLPQSRepositoryImpl$fetchPrequeryList$1;
import com.netflix.model.leafs.SearchSectionSummary;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.List;
import o.AbstractC6078cTd;
import o.AbstractC8997hK;

/* renamed from: o.cTr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6095cTr extends C6062cSo {
    private final aDB b;
    private final aLP d;
    private final aCG e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6095cTr(aLP alp, aCG acg, aDB adb) {
        super(alp);
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        this.d = alp;
        this.e = acg;
        this.b = adb;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> d() {
        Observable<AbstractC6078cTd> observable = C7680dBj.e(null, new GraphQLPQSRepositoryImpl$fetchPrequeryList$1(this, null), 1, null).toObservable();
        C8632dsu.a(observable, "");
        return observable;
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Observable<AbstractC6078cTd> a(final InterfaceC5280bvl interfaceC5280bvl, final List<? extends SearchSectionSummary> list) {
        C8632dsu.c((Object) list, "");
        Observable<AbstractC6078cTd> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cTo
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6095cTr.c(InterfaceC5280bvl.this, list, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5280bvl interfaceC5280bvl, List list, ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) observableEmitter, "");
        if (interfaceC5280bvl == null) {
            observableEmitter.onNext(AbstractC6078cTd.C6079a.c);
            observableEmitter.onComplete();
        } else {
            List<InterfaceC5272bvd> searchSections = interfaceC5280bvl.getSearchSections();
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                SearchSectionSummary searchSectionSummary = (SearchSectionSummary) obj;
                if (searchSections.size() > i) {
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    observableEmitter.onNext(new AbstractC6078cTd.B(searchSections.get(i), netflixImmutableStatus));
                }
                i++;
            }
        }
        observableEmitter.onComplete();
    }

    @Override // o.C6062cSo, o.InterfaceC6086cTi
    public Completable e() {
        Completable complete = Completable.complete();
        C8632dsu.a(complete, "");
        return complete;
    }

    public final C3166atn g() {
        List e;
        PinotSearchArtworkType pinotSearchArtworkType = PinotSearchArtworkType.a;
        e = C8566dqi.e(PinotSearchArtworkFormat.f);
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new C3166atn(pinotSearchArtworkType, e, new C3163atk(cVar.e(Integer.valueOf(this.b.s())), null, 2, null), cVar.e(new C3159atg(cVar.e(PinotSearchArtworkFallbackStrategy.c), this.b.e().f(), this.b.e().g())));
    }
}
