package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.details.presenter.SeasonsSelectionUIPresenter$2;
import com.netflix.mediaclient.ui.details.uiView.ISeasonsSelectionUIView;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import java.util.Map;
import o.AbstractC3646bFo;
import o.AbstractC3652bFu;
import o.C1234Tv;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bFU;
import o.dpR;
import o.dqE;

@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public class bFU {
    private boolean a;
    private final ISeasonsSelectionUIView b;
    private C1234Tv c;
    private final Observable<dpR> d;
    private boolean e;

    public final void c(boolean z) {
        this.a = z;
    }

    public final void d(boolean z) {
        this.e = z;
    }

    public final C1234Tv e() {
        return this.c;
    }

    public bFU(ISeasonsSelectionUIView iSeasonsSelectionUIView, Observable<AbstractC3646bFo> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) iSeasonsSelectionUIView, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        this.b = iSeasonsSelectionUIView;
        this.d = observable2;
        this.a = true;
        this.e = true;
        SubscribersKt.subscribeBy$default(observable, (drM) null, (drO) null, new drM<AbstractC3646bFo, dpR>() { // from class: com.netflix.mediaclient.ui.details.presenter.SeasonsSelectionUIPresenter$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC3646bFo abstractC3646bFo) {
                c(abstractC3646bFo);
                return dpR.c;
            }

            public final void c(AbstractC3646bFo abstractC3646bFo) {
                C1234Tv e;
                Map d;
                Map k;
                Throwable th;
                ISeasonsSelectionUIView iSeasonsSelectionUIView2;
                C8632dsu.c((Object) abstractC3646bFo, "");
                if (abstractC3646bFo instanceof AbstractC3646bFo.a) {
                    bFU.this.c(((AbstractC3646bFo.a) abstractC3646bFo).b());
                    bFU.this.b();
                } else if (abstractC3646bFo instanceof AbstractC3646bFo.c) {
                    bFU.this.d(((AbstractC3646bFo.c) abstractC3646bFo).c());
                    bFU.this.b();
                } else if (abstractC3646bFo instanceof AbstractC3646bFo.e) {
                    bFU.this.d(((AbstractC3646bFo.e) abstractC3646bFo).e());
                    bFU.this.b();
                } else if (!(abstractC3646bFo instanceof AbstractC3646bFo.b) || (e = bFU.this.e()) == null) {
                } else {
                    bFU bfu = bFU.this;
                    AbstractC3646bFo.b bVar = (AbstractC3646bFo.b) abstractC3646bFo;
                    if (e.a() > bVar.e()) {
                        e.d(bVar.e());
                        iSeasonsSelectionUIView2 = bfu.b;
                        iSeasonsSelectionUIView2.d(e.a(bVar.e()));
                        return;
                    }
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("Season Selection: selected index is invalid, less seasons are available.", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b);
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
                }
            }
        }, 3, (Object) null);
        Observable<AbstractC3652bFu> takeUntil = iSeasonsSelectionUIView.v().takeUntil(observable2);
        final SeasonsSelectionUIPresenter$2 seasonsSelectionUIPresenter$2 = new drM<AbstractC3652bFu, Boolean>() { // from class: com.netflix.mediaclient.ui.details.presenter.SeasonsSelectionUIPresenter$2
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(AbstractC3652bFu abstractC3652bFu) {
                C8632dsu.c((Object) abstractC3652bFu, "");
                return Boolean.valueOf(abstractC3652bFu instanceof AbstractC3652bFu.c);
            }
        };
        Observable<AbstractC3652bFu> filter = takeUntil.filter(new Predicate() { // from class: o.bFQ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean b;
                b = bFU.b(drM.this, obj);
                return b;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<AbstractC3652bFu, dpR>() { // from class: com.netflix.mediaclient.ui.details.presenter.SeasonsSelectionUIPresenter$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC3652bFu abstractC3652bFu) {
                c(abstractC3652bFu);
                return dpR.c;
            }

            public final void c(AbstractC3652bFu abstractC3652bFu) {
                ISeasonsSelectionUIView iSeasonsSelectionUIView2;
                iSeasonsSelectionUIView2 = bFU.this.b;
                iSeasonsSelectionUIView2.b(bFU.this.e());
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    private final void d(C1234Tv c1234Tv) {
        int a = c1234Tv.a();
        if (a > 1) {
            this.b.d();
        } else {
            this.b.b();
        }
        if (a > 0 && c1234Tv.j() != -1) {
            ISeasonsSelectionUIView iSeasonsSelectionUIView = this.b;
            String title = c1234Tv.b().getTitle();
            C8632dsu.a(title, "");
            iSeasonsSelectionUIView.d(title);
            return;
        }
        this.b.d("");
    }

    public void b() {
        if (!this.e) {
            this.b.c();
        } else if (this.b.i() == ISeasonsSelectionUIView.DisplayMode.e) {
            if (this.a) {
                this.b.c();
            } else {
                this.b.a();
            }
        } else if (this.a) {
            this.b.a();
        } else {
            this.b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1234Tv d(List<? extends InterfaceC5195buF> list) {
        final C1234Tv c1234Tv = new C1234Tv(list);
        Observable<Integer> skip = c1234Tv.e().takeUntil(this.d).skip(1L);
        C8632dsu.a(skip, "");
        SubscribersKt.subscribeBy$default(skip, (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.details.presenter.SeasonsSelectionUIPresenter$updatedSeasonList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                a(num);
                return dpR.c;
            }

            public final void a(Integer num) {
                ISeasonsSelectionUIView iSeasonsSelectionUIView;
                ISeasonsSelectionUIView iSeasonsSelectionUIView2;
                iSeasonsSelectionUIView = bFU.this.b;
                C8632dsu.d(num);
                iSeasonsSelectionUIView.a(num.intValue());
                iSeasonsSelectionUIView2 = bFU.this.b;
                iSeasonsSelectionUIView2.d(c1234Tv.a(num.intValue()));
            }
        }, 3, (Object) null);
        this.c = c1234Tv;
        d(c1234Tv);
        return c1234Tv;
    }
}
