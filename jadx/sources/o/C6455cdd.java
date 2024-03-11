package o;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$retryCallback$1;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C1044Mm;
import o.C1596aHd;
import o.C5398bxx;
import o.C6452cda;
import o.C6455cdd;
import o.C8054ddD;
import o.C8576dqs;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC9957zl;
import o.dpR;
import o.dqE;
import o.drM;
import org.chromium.net.PrivateKeyType;
import org.json.JSONObject;

/* renamed from: o.cdd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6455cdd {
    public static final e a = new e(null);
    public static final int e = 8;
    private final HomeActivity b;
    private View c;
    private final Drawable d;
    private final C6460cdi f;
    private String g;
    private final NetflixActionBar h;
    private NetflixActionBarInterstitials i;
    private InterfaceC9957zl j;
    private SE k;
    private String l;
    private Disposable n;

    /* renamed from: o  reason: collision with root package name */
    private C6457cdf f13720o;

    /* renamed from: o.cdd$a */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Config_Ab55851_MobileNav.LolomoTabName.values().length];
            try {
                iArr[Config_Ab55851_MobileNav.LolomoTabName.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config_Ab55851_MobileNav.LolomoTabName.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Config_Ab55851_MobileNav.LolomoTabName.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void b(NetflixActionBar netflixActionBar, boolean z, int i, int i2) {
        a.b(netflixActionBar, z, i, i2);
    }

    public final HomeActivity a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Disposable disposable) {
        this.n = disposable;
    }

    public final InterfaceC9957zl c() {
        return this.j;
    }

    public void c(C6457cdf c6457cdf, GenreItem genreItem) {
        C8632dsu.c((Object) c6457cdf, "");
        C8632dsu.c((Object) genreItem, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View d() {
        return this.c;
    }

    public void d(String str) {
        C8632dsu.c((Object) str, "");
    }

    public final String e() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Disposable g() {
        return this.n;
    }

    public final String h() {
        return this.l;
    }

    public final C6460cdi i() {
        return this.f;
    }

    public final C6457cdf j() {
        return this.f13720o;
    }

    protected void k() {
    }

    protected boolean m() {
        return true;
    }

    public C6455cdd(NetflixActionBar netflixActionBar, HomeActivity homeActivity) {
        C8632dsu.c((Object) netflixActionBar, "");
        C8632dsu.c((Object) homeActivity, "");
        this.h = netflixActionBar;
        this.b = homeActivity;
        this.g = "lolomo";
        this.l = "lolomo";
        this.f = new C6460cdi();
        this.f13720o = new C6457cdf();
        this.d = a.a(homeActivity);
        l();
    }

    /* renamed from: o.cdd$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final void b(NetflixActionBar netflixActionBar, boolean z, int i, int i2) {
            C8632dsu.c((Object) netflixActionBar, "");
            int i3 = PrivateKeyType.INVALID;
            if (z && i <= i2) {
                i3 = (i * PrivateKeyType.INVALID) / i2;
            }
            netflixActionBar.a(i3);
        }

        public final Drawable a(Activity activity) {
            C8632dsu.c((Object) activity, "");
            Drawable drawable = activity.getDrawable(BrowseExperience.e(activity, com.netflix.mediaclient.ui.R.a.j));
            if (drawable != null) {
                return drawable.mutate();
            }
            return null;
        }

        public final boolean e(String str) {
            C8632dsu.c((Object) str, "");
            return !C6452cda.d(str);
        }
    }

    public final void b(ServiceManager serviceManager) {
        C8632dsu.c((Object) serviceManager, "");
        d(serviceManager);
        o();
        InterfaceC9957zl interfaceC9957zl = this.j;
        if (interfaceC9957zl != null) {
            interfaceC9957zl.setLogoClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$onCreate$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(View view) {
                    b(view);
                    return dpR.c;
                }

                public final void b(View view) {
                    GenreItem e2;
                    C8632dsu.c((Object) view, "");
                    if (C8054ddD.l(C6455cdd.this.a()) || (e2 = C6455cdd.this.i().e("lolomo")) == null) {
                        return;
                    }
                    C6455cdd c6455cdd = C6455cdd.this;
                    CLv2Utils.INSTANCE.b(new Focus(AppView.netflixLogo, null), (Command) new SelectCommand(), true);
                    c6455cdd.a().e(e2, "lolomo");
                }
            });
        }
    }

    public final void a(Fragment fragment, String str, String str2) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        a(fragment, str, str2, null, false);
    }

    public final void a(Fragment fragment, String str, String str2, CoordinatorLayout.Behavior<View> behavior, boolean z) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (C8054ddD.l(this.b)) {
            return;
        }
        e(fragment, str, behavior, z);
        c(Config_Ab55851_MobileNav.a.d().h() && C8632dsu.c((Object) str, (Object) "lolomo"));
        if (b(str)) {
            if (C8632dsu.c((Object) str, (Object) this.g) && C8632dsu.c((Object) str2, (Object) this.l)) {
                return;
            }
            this.g = str;
            this.l = str2;
            this.f13720o.d(0);
            InterfaceC9957zl interfaceC9957zl = this.j;
            if (interfaceC9957zl != null) {
                interfaceC9957zl.d();
                return;
            }
            return;
        }
        this.g = str;
        this.l = str2;
        if (m()) {
            r();
        }
        k();
        this.f.a(this.g);
        Disposable disposable = this.n;
        if (disposable != null) {
            disposable.dispose();
        }
        GenreItem e2 = this.f.e(str);
        if (e2 != null) {
            this.f13720o.c(e2);
            if (e2.hasSubGenres()) {
                Observable<List<GenreItem>> take = this.f13720o.d(false).take(1L);
                C8632dsu.a(take, "");
                this.n = SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$update$1$1
                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        d(th);
                        return dpR.c;
                    }

                    public final void d(Throwable th) {
                        C8632dsu.c((Object) th, "");
                        C1044Mm.j("GenresActionBarPresenter", "subgenres fetchSelections error %s", th);
                    }
                }, (drO) null, new drM<List<? extends GenreItem>, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$update$1$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(List<? extends GenreItem> list) {
                        b(list);
                        return dpR.c;
                    }

                    public final void b(List<? extends GenreItem> list) {
                        InterfaceC9957zl c = C6455cdd.this.c();
                        if (c == null || !C6455cdd.this.n() || list.isEmpty()) {
                            return;
                        }
                        GenreItem genreItem = list.get(0);
                        Iterator<? extends GenreItem> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            GenreItem next = it.next();
                            if (C8632dsu.c((Object) next.getId(), (Object) C6455cdd.this.h())) {
                                genreItem = next;
                                break;
                            }
                        }
                        String title = genreItem.getTitle();
                        C8632dsu.d((Object) title);
                        c.setSubCategoryLabel(title, genreItem.getId());
                        C6455cdd.this.j().d(genreItem.getId());
                        C6455cdd c6455cdd = C6455cdd.this;
                        c6455cdd.c(c6455cdd.j(), genreItem);
                    }
                }, 2, (Object) null);
            }
        }
    }

    public boolean n() {
        return C6452cda.f(this.g) || C6452cda.c(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(String str) {
        C8632dsu.c((Object) str, "");
        return C6452cda.e(str);
    }

    private final void d(ServiceManager serviceManager) {
        GenresActionBarPresenter$setupPrimaryGenresModel$retryCallback$1 genresActionBarPresenter$setupPrimaryGenresModel$retryCallback$1 = new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$retryCallback$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                a(num.intValue());
                return dpR.c;
            }

            public final void a(int i) {
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                aVar.a("Primary genres fetch retry " + i);
            }
        };
        this.f.e(serviceManager);
        Observable take = C9693vH.b(this.f.d(false), 15, 2L, genresActionBarPresenter$setupPrimaryGenresModel$retryCallback$1).take(1L);
        C8632dsu.a(take, "");
        HomeActivity homeActivity = this.b;
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(homeActivity, event);
        C8632dsu.a(a2, "");
        Object as = take.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.c((ObservableSubscribeProxy) as, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Primary genres fetchSelections error", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a3 = dVar.a();
                if (a3 != null) {
                    a3.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$2
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                C6455cdd.this.a().getFragmentHelper().n();
            }
        }, new drM<List<? extends GenreItem>, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<? extends GenreItem> list) {
                d(list);
                return dpR.c;
            }

            public final void d(List<? extends GenreItem> list) {
                List<GenreItem> n;
                C8632dsu.d(list);
                n = C8576dqs.n(list);
                InterfaceC9957zl c = C6455cdd.this.c();
                if (c != null) {
                    final C6455cdd c6455cdd = C6455cdd.this;
                    drM<View, dpR> drm = new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$3$1$clickListener$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void c(View view) {
                            C8632dsu.c((Object) view, "");
                            C6455cdd.this.c(view);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(View view) {
                            c(view);
                            return dpR.c;
                        }
                    };
                    int i = 0;
                    for (GenreItem genreItem : n) {
                        C1044Mm.j("GenresActionBarPresenter", "setupPrimaryGenresModel %s", genreItem);
                        if (!C8632dsu.c((Object) genreItem.getId(), (Object) "lolomo")) {
                            c6455cdd.e(i, genreItem, drm);
                            i++;
                            c6455cdd.d(genreItem.getId());
                        }
                    }
                    c.setSubCategoryClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$3$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void d(View view) {
                            C8632dsu.c((Object) view, "");
                            C6455cdd.this.c(view);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(View view) {
                            d(view);
                            return dpR.c;
                        }
                    });
                }
            }
        });
        Observable<? extends GenreItem> d = this.f.d();
        AndroidLifecycleScopeProvider a3 = AndroidLifecycleScopeProvider.a(this.b, event);
        C8632dsu.a(a3, "");
        Object as2 = d.as(AutoDispose.b(a3));
        C8632dsu.b(as2, "");
        C9725vn.a((ObservableSubscribeProxy) as2, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$4
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8632dsu.c((Object) th, "");
                C1044Mm.c("GenresActionBarPresenter", th, "primary fetchSelections error %s", th);
            }
        }, null, new drM<?, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupPrimaryGenresModel$5
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                b((GenreItem) obj);
                return dpR.c;
            }

            public final void b(GenreItem genreItem) {
                C8632dsu.c((Object) genreItem, "");
                String id = genreItem.getId();
                C1044Mm.d("GenresActionBarPresenter", "setSelectedPrimaryGenre filter id: old=%s, new=%s", C6455cdd.this.e(), id);
                if (C8632dsu.c((Object) C6455cdd.this.e(), (Object) id)) {
                    return;
                }
                C6455cdd.this.a().e(genreItem, id);
            }
        }, 2, null);
    }

    public void e(int i, GenreItem genreItem, drM<? super View, dpR> drm) {
        C8632dsu.c((Object) genreItem, "");
        C8632dsu.c((Object) drm, "");
        InterfaceC9957zl interfaceC9957zl = this.j;
        if (interfaceC9957zl != null) {
            String title = genreItem.getTitle();
            C8632dsu.d((Object) title);
            interfaceC9957zl.setupHolder(i, title, genreItem.getId(), genreItem.hasSubGenres(), drm);
        }
    }

    private final void o() {
        Observable<? extends GenreItem> d = this.f13720o.d();
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this.b, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a2, "");
        Object as = d.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        C9725vn.a((ObservableSubscribeProxy) as, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupSubGenresModel$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("subGenresModel.changes error %s", th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a3 = dVar.a();
                if (a3 != null) {
                    a3.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, null, new drM<?, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$setupSubGenresModel$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                b((GenreItem) obj);
                return dpR.c;
            }

            public final void b(GenreItem genreItem) {
                C8632dsu.c((Object) genreItem, "");
                C1044Mm.d("GenresActionBarPresenter", "setSelectedSubGenre subgenre id: old=%s, new=%s", C6455cdd.this.h(), genreItem.getId());
                if (C8632dsu.c((Object) C6455cdd.this.h(), (Object) genreItem.getId())) {
                    return;
                }
                C6452cda c6452cda = C6452cda.a;
                if (genreItem == c6452cda.b() || genreItem == c6452cda.d()) {
                    GenreItem e2 = C6455cdd.this.i().e(C6455cdd.this.e());
                    if (e2 != null) {
                        C6455cdd c6455cdd = C6455cdd.this;
                        c6455cdd.a().e(e2, c6455cdd.e());
                        return;
                    }
                    return;
                }
                C6455cdd.this.a(genreItem);
            }
        }, 2, null);
    }

    public void a(GenreItem genreItem) {
        C8632dsu.c((Object) genreItem, "");
        this.b.e(genreItem, this.g);
    }

    public void c(View view) {
        InterfaceC9957zl interfaceC9957zl;
        String str;
        AbstractC1224Tl<GenreItem> abstractC1224Tl;
        GenreItem e2;
        if (view == null || C8054ddD.l(this.b) || this.b.isLoadingData() || (interfaceC9957zl = this.j) == null) {
            return;
        }
        if (b(this.g)) {
            InterfaceC9957zl.c d = interfaceC9957zl.d(view);
            if (d == null || (e2 = this.f.e(d.a())) == null) {
                return;
            }
            CLv2Utils.INSTANCE.b(new Focus(AppView.browseTab, a(d.a())), (Command) new SelectCommand(), true);
            this.b.e(e2, d.a());
            if (a.e(d.a())) {
                interfaceC9957zl.setSelectedPrimaryGenre(d.a());
                return;
            }
            return;
        }
        if (view.getId() == C9834xU.g.U) {
            str = e(this.l);
            abstractC1224Tl = this.f13720o;
        } else {
            str = this.g;
            abstractC1224Tl = this.f;
        }
        CLv2Utils.INSTANCE.b(new Focus(AppView.browseTab, a(str)), (Command) new SelectCommand(), false);
        e(abstractC1224Tl);
    }

    protected View f() {
        View inflate = LayoutInflater.from(this.b).inflate(com.netflix.mediaclient.ui.R.i.e, (ViewGroup) null);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    protected InterfaceC9957zl b() {
        View view = this.c;
        return (InterfaceC9957zl) (view != null ? view.findViewById(com.netflix.mediaclient.ui.R.g.fq) : null);
    }

    private final void l() {
        if (this.c == null) {
            this.c = f();
            if (this.i == null) {
                NetflixActionBarInterstitials netflixActionBarInterstitials = new NetflixActionBarInterstitials(this.b, this.c);
                netflixActionBarInterstitials.setId(C5398bxx.a.b);
                this.i = netflixActionBarInterstitials;
            }
        }
        InterfaceC9957zl b = b();
        this.j = b;
        if (b != null) {
            b.setLogoPaddingForGlobalNav();
        }
    }

    private final void e(Fragment fragment, String str, CoordinatorLayout.Behavior<View> behavior, boolean z) {
        String title;
        Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
        boolean j = cVar.d().j();
        boolean z2 = cVar.d().i() == Config_Ab55851_MobileNav.LolomoTabName.b;
        if (cVar.a() && !z2) {
            int i = a.a[cVar.d().i().ordinal()];
            if (i == 1) {
                title = this.b.getResources().getString(com.netflix.mediaclient.ui.R.o.lF);
            } else if (i == 2) {
                title = this.b.getResources().getString(com.netflix.mediaclient.ui.R.o.li);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                title = this.b.getResources().getString(com.netflix.mediaclient.ui.R.o.lI);
            }
        } else if (C8632dsu.c((Object) str, (Object) "lolomo")) {
            if (!z2) {
                title = this.b.getResources().getString(com.netflix.mediaclient.ui.R.o.lI);
            }
            title = null;
        } else if (C8632dsu.c((Object) str, (Object) LoMoType.INSTANT_QUEUE.a())) {
            title = this.b.getResources().getString(com.netflix.mediaclient.ui.R.o.eu);
        } else {
            GenreItem e2 = this.f.e(str);
            if (e2 != null) {
                title = e2.getTitle();
            }
            title = null;
        }
        boolean z3 = (cVar.a() || b(str)) ? false : true;
        NetflixActionBar.b.C0051b o2 = this.b.getActionBarStateBuilder().c(this.i).b(!z3 && z2).b(NetflixActionBar.LogoType.e).l(title != null).e((CharSequence) title).k(!cVar.a() && z3).g(!C8632dsu.c((Object) str, (Object) "queue")).h(true).d(fragment).o(cVar.d().h() && C8632dsu.c((Object) str, (Object) "lolomo"));
        if (j && !C8632dsu.c((Object) str, (Object) "queue")) {
            o2.j(!C6193cXh.a(this.b, this.b.getServiceManager().c() ? this.b.getServiceManager().x() : null));
            o2.l(false);
        }
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-1, -2, 8388627);
        if (behavior != null) {
            o2.c(behavior);
        } else {
            o2.a(true);
        }
        if (z) {
            o2.c(z);
        }
        this.h.c(o2.c(this.d).a(layoutParams).c());
    }

    private final void r() {
        InterfaceC9957zl interfaceC9957zl;
        if (C8054ddD.l(this.b) || (interfaceC9957zl = this.j) == null) {
            return;
        }
        interfaceC9957zl.setMainCaratClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$showGenreSelectorsInActionBar$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                e(view);
                return dpR.c;
            }

            public final void e(View view) {
                C8632dsu.c((Object) view, "");
                CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
                AppView appView = AppView.browseTab;
                C6455cdd c6455cdd = C6455cdd.this;
                cLv2Utils.b(new Focus(appView, c6455cdd.a(c6455cdd.e())), (Command) new SelectCommand(), true);
                C6455cdd c6455cdd2 = C6455cdd.this;
                c6455cdd2.e(c6455cdd2.i());
            }
        });
        interfaceC9957zl.setSelectedPrimaryGenre(this.g);
        if (n()) {
            if (C8632dsu.c((Object) this.g, (Object) this.l)) {
                String title = C6452cda.a.j(this.g).getTitle();
                C8632dsu.d((Object) title);
                interfaceC9957zl.setSubCategoryLabel(title, this.g);
            }
            interfaceC9957zl.setSubCategoryClickListener(new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenresActionBarPresenter$showGenreSelectorsInActionBar$1$2
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
                    AppView appView = AppView.browseTab;
                    C6455cdd c6455cdd = C6455cdd.this;
                    CLv2Utils.INSTANCE.b(new Focus(appView, c6455cdd.a(c6455cdd.e(c6455cdd.h()))), (Command) new SelectCommand(), false);
                    C6455cdd c6455cdd2 = C6455cdd.this;
                    c6455cdd2.e(c6455cdd2.j());
                }
            });
            return;
        }
        interfaceC9957zl.setSubCategoryVisibility(8);
    }

    public final void e(AbstractC1224Tl<GenreItem> abstractC1224Tl) {
        C8632dsu.c((Object) abstractC1224Tl, "");
        if (C8054ddD.l(this.b)) {
            return;
        }
        new DialogC1237Ty(this.b, abstractC1224Tl, new C6453cdb(), false, null, 24, null).show();
    }

    public final String e(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) this.g, (Object) str) ? "all" : str;
    }

    public final TrackingInfo a(final String str) {
        C8632dsu.c((Object) str, "");
        return new TrackingInfo() { // from class: o.ccZ
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject i;
                i = C6455cdd.i(str);
                return i;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject i(String str) {
        C8632dsu.c((Object) str, "");
        JSONObject jSONObject = new JSONObject();
        if (C8632dsu.c((Object) str, (Object) "lolomo")) {
            return jSONObject.put("tabName", "home");
        }
        jSONObject.put("tabName", "genreCategory");
        return jSONObject.put("genreId", str);
    }

    public final void c(boolean z) {
        View view = this.c;
        View findViewById = view != null ? view.findViewById(com.netflix.mediaclient.ui.R.g.fs) : null;
        if (findViewById instanceof ViewGroup) {
            if (z) {
                SE se = this.k;
                if (se == null) {
                    se = new SE((ViewGroup) findViewById, true);
                    this.k = se;
                }
                se.b(true);
            } else {
                SE se2 = this.k;
                if (se2 != null) {
                    se2.b(false);
                }
            }
            findViewById.setVisibility(z ? 0 : 8);
        }
    }
}
