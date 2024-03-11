package com.netflix.mediaclient.ui.lomo.cwmenu;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.android.widgetry.widget.menu.MenuController;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.browse.api.task.enums.CmpTaskMode;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.AbstractC6507cec;
import o.AbstractC6526cev;
import o.C0963Ji;
import o.C1045Mp;
import o.C6004cQk;
import o.C8054ddD;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC4208baF;
import o.InterfaceC7216cry;
import o.InterfaceC7303ctf;
import o.InterfaceC8366diy;
import o.aLN;
import o.aLP;
import o.dpR;
import o.drM;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ContinueWatchingMenuDialogFragment extends AbstractC6526cev<AbstractC6507cec> {
    public static final e a = new e(null);
    public static final int e = 8;
    private Disposable d;
    private Long f;
    private InterfaceC7216cry g;
    private TrackingInfo j;
    @Inject
    public InterfaceC7303ctf offlineApi;

    @Override // o.AbstractC9971zz
    public void d() {
    }

    public ContinueWatchingMenuDialogFragment() {
        super(200L, false, null, Integer.valueOf(R.e.aA), true);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ContinueWatchingMenuDialogFragment");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner d;

        public b(LifecycleOwner lifecycleOwner) {
            this.d = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.d;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.d.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$onViewCreated$$inlined$createDestroyObservable$1$1
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

    /* loaded from: classes4.dex */
    public static final class d<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner b;

        public d(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.b;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.b.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$fetchNecessaryData$lambda$3$$inlined$createDestroyObservable$1$1
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

    protected final InterfaceC7303ctf h() {
        InterfaceC7303ctf interfaceC7303ctf = this.offlineApi;
        if (interfaceC7303ctf != null) {
            return interfaceC7303ctf;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC9971zz
    public void c(NetflixActivity netflixActivity, Bundle bundle) {
        Observable e2;
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) bundle, "");
        String string = bundle.getString("extra_cw_item_video_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(string, "");
        Parcelable parcelable = bundle.getParcelable("extra_tracking_info_holder");
        final TrackingInfoHolder trackingInfoHolder = parcelable instanceof TrackingInfoHolder ? (TrackingInfoHolder) parcelable : null;
        if (trackingInfoHolder == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.j = trackingInfoHolder.c((JSONObject) null);
        e2 = new C6004cQk().e(string, (r27 & 2) != 0, (r27 & 4) != 0 ? false : false, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? false : false, (r27 & 32) != 0 ? false : false, (r27 & 64) != 0 ? false : false, (r27 & 128) != 0 ? false : false, (r27 & JSONzip.end) != 0 ? false : false, (r27 & 512) != 0 ? false : false, (r27 & 1024) != 0 ? null : null, (r27 & 2048) == 0 ? false : false, (r27 & 4096) != 0 ? CmpTaskMode.FROM_CACHE_OR_NETWORK : null);
        final drM<C6004cQk.d<InterfaceC8366diy>, ObservableSource<? extends InterfaceC8366diy>> drm = new drM<C6004cQk.d<InterfaceC8366diy>, ObservableSource<? extends InterfaceC8366diy>>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final ObservableSource<? extends InterfaceC8366diy> invoke(C6004cQk.d<InterfaceC8366diy> dVar) {
                Completable d2;
                C8632dsu.c((Object) dVar, "");
                if (dVar.d().i()) {
                    return Observable.error(new StatusException(dVar.d()));
                }
                InterfaceC8366diy c = dVar.c();
                if (c != null) {
                    d2 = ContinueWatchingMenuDialogFragment.this.d(c);
                    return d2.andThen(Observable.just(c));
                }
                throw new IllegalStateException();
            }
        };
        Observable flatMap = e2.flatMap(new Function() { // from class: o.ceb
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource n;
                n = ContinueWatchingMenuDialogFragment.n(drM.this, obj);
                return n;
            }
        });
        final drM<InterfaceC8366diy, MenuController<AbstractC6507cec>> drm2 = new drM<InterfaceC8366diy, MenuController<AbstractC6507cec>>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* loaded from: classes4.dex */
            public static final class a<T> implements ObservableOnSubscribe {
                final /* synthetic */ LifecycleOwner a;

                public a(LifecycleOwner lifecycleOwner) {
                    this.a = lifecycleOwner;
                }

                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
                    C8632dsu.c((Object) observableEmitter, "");
                    LifecycleOwner lifecycleOwner = this.a;
                    if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        observableEmitter.onNext(dpR.c);
                        observableEmitter.onComplete();
                        return;
                    }
                    this.a.getLifecycle().addObserver(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: INVOKE  
                          (wrap: androidx.lifecycle.Lifecycle : 0x0018: INVOKE  (r0v6 androidx.lifecycle.Lifecycle A[REMOVE]) = 
                          (wrap: androidx.lifecycle.LifecycleOwner : 0x0016: IGET  (r0v5 androidx.lifecycle.LifecycleOwner A[REMOVE]) = 
                          (r2v0 'this' com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2$a<T> A[IMMUTABLE_TYPE, THIS])
                         com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2.a.a androidx.lifecycle.LifecycleOwner)
                         type: INTERFACE call: androidx.lifecycle.LifecycleOwner.getLifecycle():androidx.lifecycle.Lifecycle)
                          (wrap: androidx.lifecycle.DefaultLifecycleObserver : 0x001e: CONSTRUCTOR  (r1v1 androidx.lifecycle.DefaultLifecycleObserver A[REMOVE]) = (r3v0 'observableEmitter' io.reactivex.ObservableEmitter<o.dpR> A[DONT_INLINE]) call: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2$invoke$$inlined$createDestroyObservable$1$1.<init>(io.reactivex.ObservableEmitter):void type: CONSTRUCTOR)
                         type: VIRTUAL call: androidx.lifecycle.Lifecycle.addObserver(androidx.lifecycle.LifecycleObserver):void in method: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2.a.subscribe(io.reactivex.ObservableEmitter<o.dpR>):void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2$invoke$$inlined$createDestroyObservable$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 19 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r3, r0)
                        androidx.lifecycle.LifecycleOwner r0 = r2.a
                        if (r0 == 0) goto L25
                        androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                        androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                        if (r0 != r1) goto L16
                        goto L25
                    L16:
                        androidx.lifecycle.LifecycleOwner r0 = r2.a
                        androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                        com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2$invoke$$inlined$createDestroyObservable$1$1 r1 = new com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2$invoke$$inlined$createDestroyObservable$1$1
                        r1.<init>(r3)
                        r0.addObserver(r1)
                        return
                    L25:
                        o.dpR r0 = o.dpR.c
                        r3.onNext(r0)
                        r3.onComplete()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$2.a.subscribe(io.reactivex.ObservableEmitter):void");
                }
            }

            @Override // o.drM
            /* renamed from: b */
            public final MenuController<AbstractC6507cec> invoke(InterfaceC8366diy interfaceC8366diy) {
                C8632dsu.c((Object) interfaceC8366diy, "");
                TrackingInfoHolder trackingInfoHolder2 = TrackingInfoHolder.this;
                NetflixActivity requireNetflixActivity = this.requireNetflixActivity();
                C8632dsu.a(requireNetflixActivity, "");
                aLN.b bVar = aLN.a;
                Observable<dpR> subscribeOn = Observable.create(new a(this)).subscribeOn(AndroidSchedulers.mainThread());
                C8632dsu.a(subscribeOn, "");
                return new ContinueWatchingMenuController(interfaceC8366diy, trackingInfoHolder2, requireNetflixActivity, bVar.a(subscribeOn));
            }
        };
        Observable map = flatMap.map(new Function() { // from class: o.cdZ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MenuController o2;
                o2 = ContinueWatchingMenuDialogFragment.o(drM.this, obj);
                return o2;
            }
        });
        final drM<Throwable, dpR> drm3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$processArguments$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                ContinueWatchingMenuDialogFragment.e eVar = ContinueWatchingMenuDialogFragment.a;
                ContinueWatchingMenuDialogFragment.this.dismiss();
            }
        };
        c(map.doOnError(new Consumer() { // from class: o.cdX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContinueWatchingMenuDialogFragment.l(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuController o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MenuController) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Completable d(InterfaceC8366diy interfaceC8366diy) {
        InterfaceC8366diy i;
        if (interfaceC8366diy.getType() == VideoType.SHOW && (i = interfaceC8366diy.i()) != null) {
            int g = i.g();
            if (i.d() && g > 0 && ((float) TimeUnit.MILLISECONDS.toSeconds(i.aq_())) / g > 0.7f && i.aV_() && interfaceC8366diy.K() == null) {
                aLN.b bVar = aLN.a;
                Observable<dpR> subscribeOn = Observable.create(new d(this)).subscribeOn(AndroidSchedulers.mainThread());
                C8632dsu.a(subscribeOn, "");
                aLP a2 = bVar.a(subscribeOn);
                String id = i.getId();
                C8632dsu.a(id, "");
                Completable ignoreElements = a2.e(new C0963Ji(id, null, 2, null)).ignoreElements();
                C8632dsu.a(ignoreElements, "");
                return ignoreElements;
            }
        }
        Completable complete = Completable.complete();
        C8632dsu.a(complete, "");
        return complete;
    }

    @Override // o.AbstractC9971zz, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        Observable<AbstractC6507cec> e2 = e();
        Observable subscribeOn = Observable.create(new b(getViewLifecycleOwner())).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        Observable<AbstractC6507cec> takeUntil = e2.takeUntil(subscribeOn);
        final drM<AbstractC6507cec, dpR> drm = new drM<AbstractC6507cec, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6507cec abstractC6507cec) {
                b(abstractC6507cec);
                return dpR.c;
            }

            public final void b(AbstractC6507cec abstractC6507cec) {
                if (C8632dsu.c(abstractC6507cec, AbstractC6507cec.e.c)) {
                    ContinueWatchingMenuDialogFragment.this.dismiss();
                } else if (C8632dsu.c(abstractC6507cec, AbstractC6507cec.d.d)) {
                    ContinueWatchingMenuDialogFragment.this.g();
                } else if (C8632dsu.c(abstractC6507cec, AbstractC6507cec.b.a)) {
                    ContinueWatchingMenuDialogFragment.this.f();
                }
            }
        };
        Consumer<? super AbstractC6507cec> consumer = new Consumer() { // from class: o.cee
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContinueWatchingMenuDialogFragment.g(drM.this, obj);
            }
        };
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8054ddD.a(ContinueWatchingMenuDialogFragment.this.getContext(), "something went wrong", 1);
                ContinueWatchingMenuDialogFragment.this.dismiss();
            }
        };
        this.d = takeUntil.subscribe(consumer, new Consumer() { // from class: o.cef
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContinueWatchingMenuDialogFragment.i(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Long l = this.f;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
        this.f = Logger.INSTANCE.startSession(new Presentation(AppView.titleActionMenu, this.j));
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        j();
        Long l = this.f;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            this.f = null;
        }
    }

    @Override // o.AbstractC9971zz
    public void a() {
        super.a();
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.AbstractC9971zz
    public Disposable a(Observable<AbstractC6507cec> observable, final PublishSubject<AbstractC6507cec> publishSubject, final boolean z) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) publishSubject, "");
        final drM<AbstractC6507cec, dpR> drm = new drM<AbstractC6507cec, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.ContinueWatchingMenuDialogFragment$getClickItemSubscription$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6507cec abstractC6507cec) {
                d(abstractC6507cec);
                return dpR.c;
            }

            public final void d(AbstractC6507cec abstractC6507cec) {
                publishSubject.onNext(abstractC6507cec);
                if (z) {
                    this.dismiss();
                }
            }
        };
        return observable.subscribe(new Consumer() { // from class: o.cdY
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContinueWatchingMenuDialogFragment.f(drM.this, obj);
            }
        });
    }

    private final void b(ViewGroup viewGroup) {
        j();
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(getNetflixActivity());
        this.g = offlineAgentOrNull != null ? (InterfaceC7216cry) offlineAgentOrNull.e((InterfaceC4208baF) h().d(viewGroup, false)) : null;
    }

    private final void j() {
        InterfaceC4208baF offlineAgentOrNull = NetflixActivity.getOfflineAgentOrNull(getNetflixActivity());
        if (offlineAgentOrNull != null) {
            offlineAgentOrNull.d(this.g);
        }
        this.g = null;
    }
}
