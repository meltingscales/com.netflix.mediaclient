package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.HomeActivity;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Iterator;
import java.util.List;
import o.C1044Mm;
import o.C6458cdg;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC9957zl;
import o.dpR;

/* renamed from: o.cdg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6458cdg extends C6455cdd {
    public static final e b = new e(null);
    public static final int c = 8;
    private String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6458cdg(NetflixActionBar netflixActionBar, HomeActivity homeActivity) {
        super(netflixActionBar, homeActivity);
        C8632dsu.c((Object) netflixActionBar, "");
        C8632dsu.c((Object) homeActivity, "");
    }

    /* renamed from: o.cdg$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.C6455cdd
    protected View f() {
        if (C8153dex.f()) {
            View inflate = LayoutInflater.from(a()).inflate(com.netflix.mediaclient.ui.R.i.a, (ViewGroup) null);
            C8632dsu.d(inflate);
            return inflate;
        }
        View inflate2 = LayoutInflater.from(a()).inflate(com.netflix.mediaclient.ui.R.i.d, (ViewGroup) null);
        C8632dsu.d(inflate2);
        return inflate2;
    }

    @Override // o.C6455cdd
    protected InterfaceC9957zl b() {
        View d = d();
        View findViewById = d != null ? d.findViewById(com.netflix.mediaclient.ui.R.g.fq) : null;
        C8632dsu.d(findViewById);
        return (InterfaceC9957zl) findViewById;
    }

    @Override // o.C6455cdd
    protected boolean m() {
        return !i(e());
    }

    @Override // o.C6455cdd
    public boolean n() {
        return C6452cda.f(e()) || C6452cda.c(e()) || i(e());
    }

    @Override // o.C6455cdd
    public void e(int i, final GenreItem genreItem, drM<? super View, dpR> drm) {
        C8632dsu.c((Object) genreItem, "");
        C8632dsu.c((Object) drm, "");
        super.e(i, genreItem, drm);
        InterfaceC9957zl c2 = c();
        if (c2 != null && (c2 instanceof C9886yT) && i(genreItem.getId())) {
            ((C9886yT) c2).setCategoryCaratClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenterWithGenreProminence$setupHolder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(View view) {
                    a(view);
                    return dpR.c;
                }

                public final void a(View view) {
                    C8632dsu.c((Object) view, "");
                    C6458cdg.this.g(genreItem.getId());
                    CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                    AppView appView = AppView.browseTab;
                    C6458cdg c6458cdg = C6458cdg.this;
                    cLv2Utils.b(new Focus(appView, c6458cdg.a(c6458cdg.e())), (Command) new SelectCommand(), false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6455cdd
    public void c(C6457cdf c6457cdf, GenreItem genreItem) {
        InterfaceC9957zl c2;
        C8632dsu.c((Object) c6457cdf, "");
        C8632dsu.c((Object) genreItem, "");
        if (!i(e()) || (c2 = c()) == null) {
            return;
        }
        String e2 = e();
        String title = genreItem.getTitle();
        C8632dsu.d((Object) title);
        c2.setupSubGenreHolder(e2, title, genreItem.getId(), new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenterWithGenreProminence$setupSubGenreHolder$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                d(view);
                return dpR.c;
            }

            public final void d(View view) {
                C8632dsu.c((Object) view, "");
                CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                AppView appView = AppView.browseTab;
                C6458cdg c6458cdg = C6458cdg.this;
                cLv2Utils.b(new Focus(appView, c6458cdg.a(c6458cdg.e())), (Command) new SelectCommand(), false);
                C6458cdg c6458cdg2 = C6458cdg.this;
                c6458cdg2.e(c6458cdg2.j());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6455cdd
    public void a(GenreItem genreItem) {
        C8632dsu.c((Object) genreItem, "");
        String e2 = e();
        String str = this.d;
        if (str != null) {
            if (C8632dsu.c((Object) str, (Object) genreItem.getId())) {
                this.d = null;
                e2 = "lolomo";
            } else {
                e2 = str;
            }
        }
        a().e(genreItem, e2);
    }

    @Override // o.C6455cdd
    protected void k() {
        InterfaceC9957zl c2;
        if (C8054ddD.l(a()) || !i(e()) || (c2 = c()) == null) {
            return;
        }
        if (c2 instanceof C9886yT) {
            c2.setSubCategoryClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenterWithGenreProminence$showSubGenreSelectorsInActionBar$1$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(View view) {
                    c(view);
                    return dpR.c;
                }

                public final void c(View view) {
                    C8632dsu.c((Object) view, "");
                    CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                    AppView appView = AppView.browseTab;
                    C6458cdg c6458cdg = C6458cdg.this;
                    cLv2Utils.b(new Focus(appView, c6458cdg.a(c6458cdg.h())), (Command) new SelectCommand(), true);
                    C6458cdg c6458cdg2 = C6458cdg.this;
                    c6458cdg2.e(c6458cdg2.j());
                }
            });
        }
        c2.setSubCategoryVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C6455cdd
    public void c(View view) {
        InterfaceC9957zl c2;
        GenreItem e2;
        if (view == null || C8054ddD.l(a()) || a().isLoadingData() || (c2 = c()) == null) {
            return;
        }
        if (b(e())) {
            InterfaceC9957zl.c d = c2.d(view);
            if (d == null || (e2 = i().e(d.a())) == null) {
                return;
            }
            boolean i = i(d.a());
            CLv2Utils.INSTANCE.b(new Focus(AppView.browseTab, a(d.a())), new SelectCommand(), !i);
            if (i) {
                g(d.a());
                return;
            }
            a().e(e2, d.a());
            this.d = null;
            if (C6455cdd.a.e(d.a())) {
                c2.setSelectedPrimaryGenre(d.a());
            }
        } else if (view.getId() == C9834xU.g.U) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.browseTab, a(e(h()))), (Command) new SelectCommand(), false);
            e(j());
        } else {
            CLv2Utils.INSTANCE.b(new Focus(AppView.browseTab, a(e())), (Command) new SelectCommand(), false);
            if (i(e())) {
                e(j());
            } else {
                e(i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str) {
        j().d(0);
        this.d = str;
        Disposable g = g();
        if (g != null) {
            g.dispose();
        }
        GenreItem e2 = i().e(str);
        if (e2 != null) {
            j().c(e2);
            Observable<List<GenreItem>> take = j().d(false).take(1L);
            C8632dsu.a(take, "");
            a(SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenterWithGenreProminence$fetchListOfSubGenres$1$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }

                public final void b(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C1044Mm.j("GenreActionBarPresenter_Ab33084", "subgenres fetchSelections error %s", th);
                }
            }, (drO) null, new drM<List<? extends GenreItem>, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenterWithGenreProminence$fetchListOfSubGenres$1$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(List<? extends GenreItem> list) {
                    e(list);
                    return dpR.c;
                }

                public final void e(List<? extends GenreItem> list) {
                    if (C6458cdg.this.c() != null && C6458cdg.this.n() && !list.isEmpty()) {
                        GenreItem genreItem = list.get(0);
                        Iterator<? extends GenreItem> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            GenreItem next = it.next();
                            if (C8632dsu.c((Object) next.getId(), (Object) C6458cdg.this.h())) {
                                genreItem = next;
                                break;
                            }
                        }
                        C6458cdg.this.j().d(genreItem.getId());
                    }
                    C6458cdg c6458cdg = C6458cdg.this;
                    c6458cdg.e(c6458cdg.j());
                }
            }, 2, (Object) null));
        }
    }

    public boolean i(String str) {
        C8632dsu.c((Object) str, "");
        return C6452cda.b(str);
    }
}
