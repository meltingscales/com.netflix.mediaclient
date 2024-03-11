package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import o.C6004cQk;
import o.C6457cdf;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cdf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6457cdf extends AbstractC1224Tl<GenreItem> {
    private GenreItem a;
    private List<GenreItem> c;
    public static final e e = new e(null);
    public static final int b = 8;

    public final void a(List<GenreItem> list) {
        C8632dsu.c((Object) list, "");
        this.c = list;
    }

    public final void c(GenreItem genreItem) {
        C8632dsu.c((Object) genreItem, "");
        this.a = genreItem;
    }

    public final List<GenreItem> g() {
        return this.c;
    }

    public List<GenreItem> i() {
        return this.c;
    }

    public C6457cdf() {
        List<GenreItem> f;
        C6452cda c6452cda = C6452cda.a;
        this.a = c6452cda.c();
        f = C8569dql.f(c6452cda.b());
        this.c = f;
    }

    /* renamed from: o.cdf$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SubGenresModel");
        }
    }

    @Override // o.AbstractC1224Tl
    public String e(int i) {
        return i().get(i).getId();
    }

    @Override // o.AbstractC1224Tl
    public String a(int i) {
        String title = i().get(i).getTitle();
        C8632dsu.d((Object) title);
        return title;
    }

    @Override // o.AbstractC1224Tl
    public int a() {
        return this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1224Tl
    /* renamed from: f */
    public GenreItem b(int i) {
        return this.c.get(i);
    }

    public void d(String str) {
        C8632dsu.c((Object) str, "");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (C8632dsu.c((Object) this.c.get(i).getId(), (Object) str)) {
                d(i);
                return;
            }
        }
    }

    @Override // o.AbstractC1224Tl
    public Observable<List<GenreItem>> d(boolean z) {
        Map d;
        Map k;
        Throwable th;
        List i;
        synchronized (this) {
            if (C6452cda.d(this.a.getId())) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("SubGenresModel shouldn't be used for my list", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                i = C8569dql.i();
                Observable<List<GenreItem>> just = Observable.just(i);
                C8632dsu.a(just, "");
                return just;
            }
            Single<C6004cQk.d<List<GenreItem>>> d2 = new C6004cQk().d(this.a.getId(), z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK);
            final drM<C6004cQk.d<List<? extends GenreItem>>, ObservableSource<? extends List<? extends GenreItem>>> drm = new drM<C6004cQk.d<List<? extends GenreItem>>, ObservableSource<? extends List<? extends GenreItem>>>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.SubGenresModel$fetchSelections$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final ObservableSource<? extends List<GenreItem>> invoke(C6004cQk.d<List<GenreItem>> dVar2) {
                    GenreItem genreItem;
                    GenreItem c2;
                    List<GenreItem> f;
                    List U;
                    C8632dsu.c((Object) dVar2, "");
                    List<GenreItem> c3 = dVar2.c();
                    if (c3 != null && !c3.isEmpty()) {
                        C6457cdf c6457cdf = C6457cdf.this;
                        genreItem = c6457cdf.a;
                        c2 = c6457cdf.c(genreItem.getId());
                        f = C8569dql.f(c2);
                        f.addAll(c3);
                        C6457cdf.this.a(f);
                        U = C8576dqs.U(C6457cdf.this.g());
                        return Observable.just(U);
                    }
                    return Observable.error(new Throwable("No genres in response"));
                }
            };
            Observable flatMapObservable = d2.flatMapObservable(new Function() { // from class: o.cde
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    ObservableSource d3;
                    d3 = C6457cdf.d(drM.this, obj);
                    return d3;
                }
            });
            C8632dsu.a(flatMapObservable, "");
            return flatMapObservable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GenreItem c(String str) {
        if (C6452cda.f(str)) {
            return C6452cda.a.b();
        }
        if (C6452cda.b(str)) {
            return C6452cda.a.a();
        }
        return C6452cda.a.d();
    }
}
