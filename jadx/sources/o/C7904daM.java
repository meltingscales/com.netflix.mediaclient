package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedActivity;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextTab$observeShowBadge$1$1;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC9927zH;
import o.C1333Xq;
import o.C7904daM;
import o.C7939dav;
import o.C8168dfL;
import o.C8632dsu;
import o.C9936zQ;
import o.InterfaceC9934zO;
import o.dsE;

/* renamed from: o.daM  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7904daM implements InterfaceC9934zO {
    private final AppView b;
    private final Application c;
    private final Class<UpNextFeedActivity> d;
    private final C1567aGb f;
    private final InterfaceC8554dpx g;
    private final InterfaceC9934zO.b.c i;
    private final CommandValue j;
    public static final e e = new e(null);
    private static final int a = com.netflix.mediaclient.ui.R.g.gL;

    @Override // o.InterfaceC9934zO
    public CommandValue a() {
        return this.j;
    }

    @Override // o.InterfaceC9934zO
    public Class<UpNextFeedActivity> c() {
        return this.d;
    }

    @Override // o.InterfaceC9934zO
    public AppView d() {
        return this.b;
    }

    @Override // o.InterfaceC9934zO
    public boolean e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return true;
    }

    @Override // o.InterfaceC9934zO
    /* renamed from: j */
    public InterfaceC9934zO.b.c e() {
        return this.i;
    }

    @Inject
    public C7904daM(Application application, C1567aGb c1567aGb) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) application, "");
        C8632dsu.c((Object) c1567aGb, "");
        this.c = application;
        this.f = c1567aGb;
        this.d = UpNextFeedActivity.class;
        this.b = AppView.trailersTab;
        this.j = CommandValue.ViewNewsFeedCommand;
        this.i = InterfaceC9934zO.b.c.b;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<C9936zQ>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextTab$tab$2

            /* loaded from: classes6.dex */
            public final /* synthetic */ class d {
                public static final /* synthetic */ int[] c;

                static {
                    int[] iArr = new int[Config_Ab55851_MobileNav.NewAndHotTabName.values().length];
                    try {
                        iArr[Config_Ab55851_MobileNav.NewAndHotTabName.c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    c = iArr;
                }
            }

            @Override // o.drO
            /* renamed from: c */
            public final C9936zQ invoke() {
                Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
                int i = d.c[cVar.d().g().ordinal()] == 1 ? C7939dav.c.f : C7939dav.c.e;
                int i2 = cVar.d().g() == Config_Ab55851_MobileNav.NewAndHotTabName.c ? R.o.lF : C7939dav.i.x;
                int e2 = C7904daM.e.e();
                String d2 = C8168dfL.d(i2);
                C8632dsu.a(d2, "");
                return new C9936zQ(e2, d2, i, null, 8, null);
            }
        });
        this.g = b;
    }

    @Override // o.InterfaceC9934zO
    public Single<Boolean> a(Activity activity) {
        return InterfaceC9934zO.a.c(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean c(Activity activity) {
        return InterfaceC9934zO.a.a(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean d(Activity activity) {
        return InterfaceC9934zO.a.b(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public Observable<String> f() {
        return InterfaceC9934zO.a.c(this);
    }

    @Override // o.InterfaceC9934zO
    public Observable<Boolean> g() {
        return InterfaceC9934zO.a.d(this);
    }

    /* renamed from: o.daM$e */
    /* loaded from: classes6.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final int e() {
            return C7904daM.a;
        }
    }

    @Override // o.InterfaceC9934zO
    public C9936zQ b() {
        return (C9936zQ) this.g.getValue();
    }

    @Override // o.InterfaceC9934zO
    public Observable<AbstractC9927zH> b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        if (C8153dex.B()) {
            Observable<AbstractC9927zH> never = Observable.never();
            C8632dsu.a(never, "");
            return never;
        }
        Observable<AbstractC9927zH> defer = Observable.defer(new Callable() { // from class: o.daJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ObservableSource e2;
                e2 = C7904daM.e(C7904daM.this);
                return e2;
            }
        });
        C8632dsu.a(defer, "");
        return defer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource e(C7904daM c7904daM) {
        C8632dsu.c((Object) c7904daM, "");
        String a2 = c7904daM.f.a();
        Observable<Integer> startWith = C8119deP.a(a2).startWith(Integer.valueOf(C8119deP.d(a2)));
        final UpNextTab$observeShowBadge$1$1 upNextTab$observeShowBadge$1$1 = new drM<Integer, AbstractC9927zH>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextTab$observeShowBadge$1$1
            @Override // o.drM
            public /* synthetic */ AbstractC9927zH invoke(Integer num) {
                return e(num.intValue());
            }

            public final AbstractC9927zH e(int i) {
                if (i > 0) {
                    String c = C1333Xq.d(R.o.p).a(i).c();
                    dsE dse = dsE.b;
                    String format = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    C8632dsu.a(format, "");
                    return new AbstractC9927zH.c(format, c);
                }
                return AbstractC9927zH.a.d;
            }
        };
        return startWith.map(new Function() { // from class: o.daL
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AbstractC9927zH a3;
                a3 = C7904daM.a(drM.this, obj);
                return a3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC9927zH a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (AbstractC9927zH) drm.invoke(obj);
    }

    @Override // o.InterfaceC9934zO
    public Intent b(AppView appView) {
        return UpNextFeedActivity.b.d(this.c);
    }
}
