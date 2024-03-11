package o;

import android.annotation.SuppressLint;
import android.content.Context;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedSection;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C5220bue;
import o.C7909daR;
import o.C7981dbk;
import o.C8632dsu;
import o.C9646uN;
import o.InterfaceC9638uF;
import o.aLN;
import o.dpR;

/* renamed from: o.dbk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7981dbk implements cYC {
    public static final c b = new c(null);
    private final Observable<dpR> a;
    private final InterfaceC7974dbd c;
    private final Context d;
    private final C7917daZ e;
    private Single<C5220bue> f;
    private C7971dba g;
    private final C1567aGb h;

    @Inject
    public C7981dbk(C1567aGb c1567aGb, @ApplicationContext Context context) {
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) context, "");
        this.h = c1567aGb;
        this.d = context;
        Observable<dpR> never = Observable.never();
        this.a = never;
        C7917daZ e = C7975dbe.c.e();
        this.e = e;
        aLN.b bVar = aLN.a;
        C8632dsu.a(never, "");
        this.c = new C7911daT(bVar.a(never), InterfaceC1270Vf.b.b(context), new C7972dbb(c1567aGb), new C7977dbg(), e.d(false), context);
    }

    /* renamed from: o.dbk$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("UpNextPrefetcher");
        }
    }

    @Override // o.cYC
    @SuppressLint({"CheckResult"})
    public void c() {
        if (this.f != null) {
            return;
        }
        C7971dba c2 = C7917daZ.c(this.e, false, 1, null);
        final PublishSubject create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.f = create.singleOrError();
        this.g = c2;
        SubscribersKt.subscribeBy(this.c.b(c2), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextPrefetcherImpl$prefetch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                create.onError(th);
                this.g = null;
                this.f = null;
            }
        }, new drM<C5220bue, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextPrefetcherImpl$prefetch$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5220bue c5220bue) {
                b(c5220bue);
                return dpR.c;
            }

            public final void b(C5220bue c5220bue) {
                C8632dsu.c((Object) c5220bue, "");
                C7981dbk.b.getLogTag();
                create.onNext(c5220bue);
                create.onComplete();
                this.g = null;
                this.f = null;
                this.a(c5220bue);
            }
        });
    }

    public final Single<C5220bue> e(C7971dba c7971dba) {
        C8632dsu.c((Object) c7971dba, "");
        if (C8632dsu.c(c7971dba, this.g)) {
            return this.f;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C5220bue c5220bue) {
        int d;
        List G;
        List<UpNextFeedSection> a = c5220bue.a();
        d = C8572dqo.d(a, 10);
        ArrayList<List> arrayList = new ArrayList(d);
        for (UpNextFeedSection upNextFeedSection : a) {
            G = C8576dqs.G(upNextFeedSection.getItems());
            arrayList.add(G);
        }
        for (List<UpNextFeedListItem> list : arrayList) {
            for (UpNextFeedListItem upNextFeedListItem : list) {
                C7909daR a2 = C7909daR.e.a(C7909daR.d, upNextFeedListItem, null, 2, null);
                if (a2 != null) {
                    a(a2.d().getImages().get(0).getUrl());
                    a(a2.i());
                }
            }
        }
    }

    @SuppressLint({"CheckResult"})
    private final void a(final String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (g) {
                return;
            }
            C9646uN.b b2 = C9646uN.d.a().e(str).b();
            InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
            Context d = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d, "");
            SubscribersKt.subscribeBy(eVar.d(d).d(b2), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextPrefetcherImpl$prefetchImage$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C7981dbk.c cVar = C7981dbk.b;
                }
            }, new drM<C9646uN.e, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextPrefetcherImpl$prefetchImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C9646uN.e eVar2) {
                    e(eVar2);
                    return dpR.c;
                }

                public final void e(C9646uN.e eVar2) {
                    C8632dsu.c((Object) eVar2, "");
                    C7981dbk.b.getLogTag();
                }
            });
        }
    }
}
