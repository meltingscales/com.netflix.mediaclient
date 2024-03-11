package o;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.ShareInfo;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.ShareEnded;
import com.netflix.cl.model.event.session.action.ActionFailed;
import com.netflix.cl.model.event.session.action.Share;
import com.netflix.cl.model.event.session.command.ShareCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$1;
import com.netflix.mediaclient.android.sharing.impl.ShareMenuController;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.R;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import o.C1079Nx;
import o.C1588aGw;
import o.C1596aHd;
import o.C8054ddD;
import o.C8632dsu;
import o.InterfaceC1126Pr;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.PF;
import o.QI;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dqE;

/* loaded from: classes3.dex */
public final class PF<T> extends AbstractC9971zz<QI<T>> {
    private Disposable d;
    private ShareableInternal<T> f;
    private Long i;
    public static final c e = new c(null);
    public static final int a = 8;

    public PF() {
        super(400L, true, null, null, false);
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ShareDialogFragment");
        }
    }

    @Override // o.AbstractC9971zz
    public void c(NetflixActivity netflixActivity, Bundle bundle) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) bundle, "");
        ShareableInternal<T> shareableInternal = (ShareableInternal) bundle.getParcelable("Shareable");
        this.f = shareableInternal;
        if (shareableInternal == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("ShareDialogFragment - shareable null", null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            dismiss();
            return;
        }
        Observable<ShareMenuController<T>> c3 = shareableInternal.c(netflixActivity);
        C8632dsu.d(c3);
        c(c3);
    }

    /* loaded from: classes3.dex */
    public static final class a<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner c;

        public a(LifecycleOwner lifecycleOwner) {
            this.c = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.c;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.c.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareEnded b(Long l, ShareInfo[] shareInfoArr) {
        if (l == null) {
            return null;
        }
        Session session = Logger.INSTANCE.getSession(l);
        if (session instanceof Share) {
            return new ShareEnded((Share) session, shareInfoArr);
        }
        return null;
    }

    @Override // o.AbstractC9971zz, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        final ShareableInternal<T> shareableInternal = this.f;
        if (shareableInternal == null) {
            dismiss();
            return;
        }
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new ShareCommand());
        AppView appView = AppView.shareButton;
        AppView appView2 = getAppView();
        CommandValue commandValue = CommandValue.ShareCommand;
        TrackingInfoHolder i = shareableInternal.i();
        this.i = logger.startSession(new Share(appView, appView2, commandValue, i != null ? TrackingInfoHolder.e(i, null, 1, null) : null));
        logger.endSession(startSession);
        Observable<T> take = e().take(1L);
        Observable<T> subscribeOn = Observable.create(new a(getViewLifecycleOwner())).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        Observable<T> takeUntil = take.takeUntil(subscribeOn);
        final ShareDialogFragment$onViewCreated$1 shareDialogFragment$onViewCreated$1 = new ShareDialogFragment$onViewCreated$1(this, shareableInternal);
        Observable<R> flatMap = takeUntil.flatMap(new Function() { // from class: o.PH
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource c2;
                c2 = PF.c(drM.this, obj);
                return c2;
            }
        });
        final drM<Pair<? extends QI<T>, ? extends Intent>, dpR> drm = new drM<Pair<? extends QI<T>, ? extends Intent>, dpR>(this) { // from class: com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$2
            final /* synthetic */ PF<T> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.c = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Object obj) {
                b((Pair) obj);
                return dpR.c;
            }

            public final void b(Pair<? extends QI<T>, ? extends Intent> pair) {
                Map d;
                Map k;
                Throwable th;
                Long l;
                Long l2;
                ShareEnded b;
                if (pair != null) {
                    PF<T> pf = this.c;
                    ShareableInternal<T> shareableInternal2 = shareableInternal;
                    NetflixActivity i2 = pf.i();
                    QI<T> d2 = pair.d();
                    Intent a2 = pair.a();
                    PF.e.getLogTag();
                    if (i2 != null) {
                        try {
                            if (!C8632dsu.c(a2, InterfaceC1126Pr.d.a())) {
                                i2.startActivityForResult(a2, 0);
                            }
                            l2 = ((PF) pf).i;
                            b = pf.b(l2, new ShareInfo[]{new ShareInfo(shareableInternal2.d(C1588aGw.a(i2), d2), d2.a())});
                            if (b != null) {
                                Logger.INSTANCE.endSession(b);
                            }
                        } catch (ActivityNotFoundException e2) {
                            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                            d = dqE.d();
                            k = dqE.k(d);
                            C1596aHd c1596aHd = new C1596aHd("Error starting share activity", e2, null, true, k, false, false, 96, null);
                            ErrorType errorType = c1596aHd.a;
                            if (errorType != null) {
                                c1596aHd.e.put("errorType", errorType.c());
                                String b2 = c1596aHd.b();
                                if (b2 != null) {
                                    String c2 = errorType.c();
                                    c1596aHd.a(c2 + " " + b2);
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
                            InterfaceC1598aHf a3 = dVar.a();
                            if (a3 != null) {
                                a3.e(c1596aHd, th);
                            } else {
                                dVar.e().b(c1596aHd, th);
                            }
                            Logger logger2 = Logger.INSTANCE;
                            l = ((PF) pf).i;
                            Session session = logger2.getSession(l);
                            if (session != null) {
                                logger2.endSession(new ActionFailed(session, CLv2Utils.a(new Error(e2.getClass().getSimpleName(), null, null))));
                            }
                        }
                    }
                    pf.dismiss();
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.PG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PF.g(drM.this, obj);
            }
        };
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>(this) { // from class: com.netflix.mediaclient.android.sharing.impl.ShareDialogFragment$onViewCreated$3
            final /* synthetic */ PF<T> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.a = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                Long l;
                Map b;
                Map k;
                Throwable th2;
                if (C1079Nx.e(th)) {
                    InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                    b = dqD.b(dpD.a("errorSource", "ShareDialogFragment"));
                    k = dqE.k(b);
                    C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
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
                    InterfaceC1597aHe c3 = dVar2.c();
                    if (c3 != null) {
                        c3.d(c1596aHd, th2);
                    } else {
                        dVar2.e().b(c1596aHd, th2);
                    }
                }
                PF.c cVar = PF.e;
                Logger logger2 = Logger.INSTANCE;
                l = ((PF) this.a).i;
                Session session = logger2.getSession(l);
                if (session != null) {
                    logger2.endSession(new ActionFailed(session, CLv2Utils.a(new Error(th.getClass().getSimpleName(), null, null))));
                }
                this.a.dismiss();
                C8054ddD.c(this.a.getContext(), R.o.lt, 1);
            }
        };
        this.d = flatMap.subscribe(consumer, new Consumer() { // from class: o.PO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PF.f(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.AbstractC9971zz
    public void a() {
        super.a();
        Logger logger = Logger.INSTANCE;
        if (logger.getSession(this.i) != null) {
            logger.cancelSession(this.i);
        }
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
