package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$1$1;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$2$1;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.AbstractC6719cic;
import o.C1332Xp;
import o.C1339Xw;
import o.C1596aHd;
import o.C6717cia;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6718cib;
import o.dpR;
import o.dqE;

/* renamed from: o.cia  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6717cia {
    public static final d a = new d(null);
    private final CompositeDisposable b;
    private Integer c;
    private boolean d;
    private InterfaceC6718cib.d e;
    private final InterfaceC6718cib f;
    private final a g;
    private boolean h;
    private int j;

    /* renamed from: o.cia$a */
    /* loaded from: classes4.dex */
    public interface a {
        void b();

        void b(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel);

        boolean b(Activity activity, int i);

        void e(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel);
    }

    public final void d() {
        this.d = true;
    }

    public C6717cia(InterfaceC6718cib interfaceC6718cib, a aVar) {
        C8632dsu.c((Object) interfaceC6718cib, "");
        C8632dsu.c((Object) aVar, "");
        this.f = interfaceC6718cib;
        this.g = aVar;
        this.b = new CompositeDisposable();
        this.c = 1;
        this.h = true;
    }

    /* renamed from: o.cia$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ExtrasOrientationManager");
        }
    }

    public final void b(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        if (this.h) {
            this.h = false;
            if (fragment.getContext() == null) {
                throw new IllegalStateException("call create() during `fragment.onCreateView` method");
            }
            final FragmentActivity requireActivity = fragment.requireActivity();
            if (this.j == 0) {
                this.j = requireActivity.getWindow().getDecorView().getSystemUiVisibility();
            }
            CompositeDisposable compositeDisposable = this.b;
            Observable<Integer> a2 = miniPlayerVideoGroupViewModel.a();
            final MiniPlayerOrientationManager$start$1$1 miniPlayerOrientationManager$start$1$1 = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$1$1
                @Override // o.drM
                /* renamed from: d */
                public final Boolean invoke(Integer num) {
                    boolean z;
                    C8632dsu.c((Object) num, "");
                    if (num.intValue() == 2) {
                        C1339Xw.c cVar = C1339Xw.d;
                        C1332Xp c1332Xp = C1332Xp.b;
                        if (cVar.a((Context) C1332Xp.b(Context.class))) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
            };
            Observable<Integer> filter = a2.filter(new Predicate() { // from class: o.cif
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean a3;
                    a3 = C6717cia.a(drM.this, obj);
                    return a3;
                }
            });
            final drM<Integer, Boolean> drm = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$1$2
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final Boolean invoke(Integer num) {
                    C8632dsu.c((Object) num, "");
                    return Boolean.valueOf(FragmentActivity.this.getRequestedOrientation() != 14);
                }
            };
            Observable<Integer> delay = filter.filter(new Predicate() { // from class: o.cig
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean e;
                    e = C6717cia.e(drM.this, obj);
                    return e;
                }
            }).delay(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
            C8632dsu.a(delay, "");
            DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(delay, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$1$3
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
                    Map d2;
                    Map k;
                    Throwable th2;
                    C8632dsu.c((Object) th, "");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
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
            }, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$1$4
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Integer num) {
                    c(num);
                    return dpR.c;
                }

                public final void c(Integer num) {
                    C6717cia.a.getLogTag();
                    FragmentActivity.this.setRequestedOrientation(-1);
                }
            }, 2, (Object) null));
            final FragmentActivity requireActivity2 = fragment.requireActivity();
            Observable d2 = C9935zP.b.d(fragment).d(AbstractC6719cic.class);
            final MiniPlayerOrientationManager$start$2$1 miniPlayerOrientationManager$start$2$1 = new drM<AbstractC6719cic, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$2$1
                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(AbstractC6719cic abstractC6719cic) {
                    C8632dsu.c((Object) abstractC6719cic, "");
                    return Boolean.valueOf(abstractC6719cic instanceof AbstractC6719cic.e.d);
                }
            };
            Observable filter2 = d2.filter(new Predicate() { // from class: o.cie
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean i;
                    i = C6717cia.i(drM.this, obj);
                    return i;
                }
            });
            C8632dsu.a(filter2, "");
            SubscribersKt.subscribeBy$default(filter2, (drM) null, (drO) null, new drM<AbstractC6719cic, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerOrientationManager$start$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC6719cic abstractC6719cic) {
                    a(abstractC6719cic);
                    return dpR.c;
                }

                public final void a(AbstractC6719cic abstractC6719cic) {
                    boolean z;
                    InterfaceC6718cib interfaceC6718cib;
                    int i;
                    InterfaceC6718cib interfaceC6718cib2;
                    z = C6717cia.this.d;
                    if (z) {
                        return;
                    }
                    C8632dsu.d(abstractC6719cic);
                    C6717cia.a.getLogTag();
                    FragmentActivity fragmentActivity = requireActivity2;
                    if (((AbstractC6719cic.e.d) abstractC6719cic).b()) {
                        interfaceC6718cib2 = C6717cia.this.f;
                        interfaceC6718cib2.a();
                        i = 6;
                    } else {
                        interfaceC6718cib = C6717cia.this.f;
                        interfaceC6718cib.b();
                        i = 1;
                    }
                    fragmentActivity.setRequestedOrientation(i);
                }
            }, 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public final void a(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, Configuration configuration) {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        C8632dsu.c((Object) configuration, "");
        if (this.h) {
            return;
        }
        if (fragment.getContext() == null) {
            throw new IllegalStateException("call create() before calling onConfigurationChanged()");
        }
        Integer num = this.c;
        int i = configuration.orientation;
        if (num == null || num.intValue() != i) {
            this.c = Integer.valueOf(configuration.orientation);
            d dVar = a;
            dVar.getLogTag();
            a aVar = this.g;
            FragmentActivity requireActivity = fragment.requireActivity();
            C8632dsu.a(requireActivity, "");
            if (aVar.b(requireActivity, configuration.orientation)) {
                Integer c = miniPlayerVideoGroupViewModel.c();
                FragmentActivity requireActivity2 = fragment.requireActivity();
                if (configuration.orientation == 2) {
                    if (c != null) {
                        this.g.b(fragment, miniPlayerVideoGroupViewModel);
                        Window window = requireActivity2.getWindow();
                        C8632dsu.a(window, "");
                        C9708vW.a(window);
                        miniPlayerVideoGroupViewModel.d(true);
                        AbstractC6719cic.e.b bVar = new AbstractC6719cic.e.b(false, c.intValue());
                        C9935zP d4 = C9935zP.b.d(fragment);
                        d4.d(AbstractC6719cic.class);
                        d4.b(AbstractC6719cic.class, bVar);
                        this.e = this.f.e();
                        return;
                    }
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d3 = dqE.d();
                    k2 = dqE.k(d3);
                    C1596aHd c1596aHd = new C1596aHd("No focused item while changing to landscape", null, null, true, k2, false, false, 96, null);
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
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th2);
                        return;
                    } else {
                        dVar2.e().b(c1596aHd, th2);
                        return;
                    }
                } else if (c != null) {
                    this.g.e(fragment, miniPlayerVideoGroupViewModel);
                    requireActivity2.getWindow().getDecorView().setSystemUiVisibility(this.j);
                    miniPlayerVideoGroupViewModel.d(false);
                    AbstractC6719cic.e.b bVar2 = new AbstractC6719cic.e.b(true, c.intValue());
                    C9935zP d5 = C9935zP.b.d(fragment);
                    d5.d(AbstractC6719cic.class);
                    d5.b(AbstractC6719cic.class, bVar2);
                    InterfaceC6718cib.d dVar3 = this.e;
                    if (dVar3 != null) {
                        InterfaceC6718cib.b.d(this.f, dVar3, null, 2, null);
                        this.e = null;
                        return;
                    }
                    return;
                } else {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd2 = new C1596aHd("No focused item while changing to portrait", null, null, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b2 = c1596aHd2.b();
                        if (b2 != null) {
                            String c3 = errorType2.c();
                            c1596aHd2.a(c3 + " " + b2);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th = new Throwable(c1596aHd2.b());
                    } else {
                        th = c1596aHd2.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a3 = dVar4.a();
                    if (a3 != null) {
                        a3.e(c1596aHd2, th);
                        return;
                    } else {
                        dVar4.e().b(c1596aHd2, th);
                        return;
                    }
                }
            }
            dVar.getLogTag();
            return;
        }
        a.getLogTag();
    }

    public final void b() {
        a.getLogTag();
        this.h = true;
        this.b.clear();
        this.g.b();
        InterfaceC6718cib.d dVar = this.e;
        if (dVar != null) {
            InterfaceC6718cib.b.d(this.f, dVar, null, 2, null);
            this.e = null;
        }
    }
}
