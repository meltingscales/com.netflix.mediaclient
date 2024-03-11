package com.netflix.mediaclient.android.sharing.impl;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
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
import com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment;
import com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onShareTargetClick$1;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.C1079Nx;
import o.C1137Qc;
import o.C1588aGw;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1126Pr;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.PN;
import o.QI;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dqE;
import o.drM;

/* loaded from: classes3.dex */
public final class ShareSheetFragment$onShareTargetClick$1 extends Lambda implements drM<C1137Qc, Disposable> {
    final /* synthetic */ ShareSheetFragment b;
    final /* synthetic */ PN e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSheetFragment$onShareTargetClick$1(ShareSheetFragment shareSheetFragment, PN pn) {
        super(1);
        this.b = shareSheetFragment;
        this.e = pn;
    }

    /* loaded from: classes3.dex */
    public static final class e<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner e;

        public e(LifecycleOwner lifecycleOwner) {
            this.e = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.e;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.e.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onShareTargetClick$1$invoke$$inlined$createDestroyObservable$1$1
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

    @Override // o.drM
    /* renamed from: e */
    public final Disposable invoke(final C1137Qc c1137Qc) {
        AppView appView;
        C8632dsu.c((Object) c1137Qc, "");
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new ShareCommand());
        ShareSheetFragment shareSheetFragment = this.b;
        AppView appView2 = AppView.shareButton;
        appView = shareSheetFragment.getAppView();
        CommandValue commandValue = CommandValue.ShareCommand;
        TrackingInfoHolder i = c1137Qc.c().i();
        shareSheetFragment.a = logger.startSession(new Share(appView2, appView, commandValue, i != null ? TrackingInfoHolder.e(i, null, 1, null) : null));
        logger.endSession(startSession);
        PN pn = this.e;
        if (pn instanceof PN.b) {
            QI<Parcelable> b = ((PN.b) pn).b();
            NetflixActivity requireNetflixActivity = this.b.requireNetflixActivity();
            C8632dsu.a(requireNetflixActivity, "");
            Observable<Intent> observable = b.d((FragmentActivity) requireNetflixActivity, (Shareable<Parcelable>) c1137Qc.c()).observeOn(AndroidSchedulers.mainThread()).toObservable();
            final PN pn2 = this.e;
            final drM<Intent, Pair<? extends QI<Parcelable>, ? extends Intent>> drm = new drM<Intent, Pair<? extends QI<Parcelable>, ? extends Intent>>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onShareTargetClick$1.1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final Pair<QI<Parcelable>, Intent> invoke(Intent intent) {
                    C8632dsu.c((Object) intent, "");
                    return new Pair<>(((PN.b) PN.this).b(), intent);
                }
            };
            Observable<R> map = observable.map(new Function() { // from class: o.PP
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Pair c;
                    c = ShareSheetFragment$onShareTargetClick$1.c(drM.this, obj);
                    return c;
                }
            });
            Observable subscribeOn = Observable.create(new e(this.b.getViewLifecycleOwner())).subscribeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(subscribeOn, "");
            Observable takeUntil = map.takeUntil(subscribeOn);
            final ShareSheetFragment shareSheetFragment2 = this.b;
            final drM<Pair<? extends QI<Parcelable>, ? extends Intent>, dpR> drm2 = new drM<Pair<? extends QI<Parcelable>, ? extends Intent>, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onShareTargetClick$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Pair<? extends QI<Parcelable>, ? extends Intent> pair) {
                    b(pair);
                    return dpR.c;
                }

                public final void b(Pair<? extends QI<Parcelable>, ? extends Intent> pair) {
                    Map d;
                    Map k;
                    Throwable th;
                    Long l;
                    Long l2;
                    ShareEnded c;
                    C8632dsu.c((Object) pair, "");
                    QI<Parcelable> d2 = pair.d();
                    Intent a = pair.a();
                    ShareSheetFragment.d.getLogTag();
                    try {
                        if (ShareSheetFragment.this.getNetflixActivity() != null) {
                            ShareSheetFragment shareSheetFragment3 = ShareSheetFragment.this;
                            C1137Qc c1137Qc2 = c1137Qc;
                            if (!C8632dsu.c(a, InterfaceC1126Pr.d.a())) {
                                shareSheetFragment3.requireNetflixActivity().startActivityForResult(a, 0);
                            }
                            l2 = shareSheetFragment3.a;
                            ShareableInternal<Parcelable> c2 = c1137Qc2.c();
                            NetflixActivity requireNetflixActivity2 = shareSheetFragment3.requireNetflixActivity();
                            C8632dsu.a(requireNetflixActivity2, "");
                            c = shareSheetFragment3.c(l2, new ShareInfo[]{new ShareInfo(c2.d(C1588aGw.a(requireNetflixActivity2), d2), d2.a())});
                            if (c != null) {
                                Logger.INSTANCE.endSession(c);
                            }
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
                                String c3 = errorType.c();
                                c1596aHd.a(c3 + " " + b2);
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
                        Logger logger2 = Logger.INSTANCE;
                        l = ShareSheetFragment.this.a;
                        Session session = logger2.getSession(l);
                        if (session != null) {
                            logger2.endSession(new ActionFailed(session, CLv2Utils.a(new Error(e2.getClass().getSimpleName(), null, null))));
                        }
                    }
                    ShareSheetFragment.this.dismiss();
                }
            };
            Consumer consumer = new Consumer() { // from class: o.PY
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShareSheetFragment$onShareTargetClick$1.b(drM.this, obj);
                }
            };
            final ShareSheetFragment shareSheetFragment3 = this.b;
            final drM<Throwable, dpR> drm3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onShareTargetClick$1.3
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    Long l;
                    Map b2;
                    Map k;
                    Throwable th2;
                    if (C1079Nx.e(th)) {
                        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                        b2 = dqD.b(dpD.a("errorSource", "ShareSheetFragment"));
                        k = dqE.k(b2);
                        C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b3 = c1596aHd.b();
                            if (b3 != null) {
                                String c = errorType.c();
                                c1596aHd.a(c + " " + b3);
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
                        InterfaceC1597aHe c2 = dVar2.c();
                        if (c2 != null) {
                            c2.d(c1596aHd, th2);
                        } else {
                            dVar2.e().b(c1596aHd, th2);
                        }
                    }
                    ShareSheetFragment.b bVar = ShareSheetFragment.d;
                    Logger logger2 = Logger.INSTANCE;
                    l = ShareSheetFragment.this.a;
                    Session session = logger2.getSession(l);
                    if (session != null) {
                        logger2.endSession(new ActionFailed(session, CLv2Utils.a(new Error(th.getClass().getSimpleName(), null, null))));
                    }
                    ShareSheetFragment.this.dismiss();
                }
            };
            return takeUntil.subscribe(consumer, new Consumer() { // from class: o.PU
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShareSheetFragment$onShareTargetClick$1.h(drM.this, obj);
                }
            });
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Pair) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
