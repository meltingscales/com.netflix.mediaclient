package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import o.C1180Rt;
import o.C1729aMb;
import o.C5959cOt;
import o.C8632dsu;
import o.C9898yf;
import o.InterfaceC1078Nw;
import o.InterfaceC5147btK;
import o.aLL;
import o.aLO;
import o.aLZ;
import o.cOD;
import o.cOE;
import o.cOL;
import o.dpR;

/* loaded from: classes4.dex */
public final class cOD extends NetflixFrag {
    public static final b e = new b(null);
    private cOL b;
    private final C1180Rt.d j = new C1180Rt.d() { // from class: o.cOC
        @Override // o.C1180Rt.d
        public final void e() {
            cOD.g(cOD.this);
        }
    };
    private C1180Rt k;
    private final InterfaceC8554dpx l;
    private C5959cOt n;

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return true;
    }

    public cOD() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<cOE>() { // from class: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final cOE invoke() {
                Observable subscribeOn = Observable.create(new e(cOD.this)).subscribeOn(AndroidSchedulers.mainThread());
                C8632dsu.a(subscribeOn, "");
                return new cOE(subscribeOn);
            }

            /* loaded from: classes4.dex */
            public static final class e<T> implements ObservableOnSubscribe {
                final /* synthetic */ LifecycleOwner b;

                public e(LifecycleOwner lifecycleOwner) {
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
                    this.b.getLifecycle().addObserver(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: INVOKE  
                          (wrap: androidx.lifecycle.Lifecycle : 0x0018: INVOKE  (r0v6 androidx.lifecycle.Lifecycle A[REMOVE]) = 
                          (wrap: androidx.lifecycle.LifecycleOwner : 0x0016: IGET  (r0v5 androidx.lifecycle.LifecycleOwner A[REMOVE]) = 
                          (r2v0 'this' com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2$e<T> A[IMMUTABLE_TYPE, THIS])
                         com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2.e.b androidx.lifecycle.LifecycleOwner)
                         type: INTERFACE call: androidx.lifecycle.LifecycleOwner.getLifecycle():androidx.lifecycle.Lifecycle)
                          (wrap: androidx.lifecycle.DefaultLifecycleObserver : 0x001e: CONSTRUCTOR  (r1v1 androidx.lifecycle.DefaultLifecycleObserver A[REMOVE]) = (r3v0 'observableEmitter' io.reactivex.ObservableEmitter<o.dpR> A[DONT_INLINE]) call: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2$invoke$$inlined$createDestroyObservable$1$1.<init>(io.reactivex.ObservableEmitter):void type: CONSTRUCTOR)
                         type: VIRTUAL call: androidx.lifecycle.Lifecycle.addObserver(androidx.lifecycle.LifecycleObserver):void in method: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2.e.subscribe(io.reactivex.ObservableEmitter<o.dpR>):void, file: classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2$invoke$$inlined$createDestroyObservable$1$1, state: NOT_LOADED
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
                        androidx.lifecycle.LifecycleOwner r0 = r2.b
                        if (r0 == 0) goto L25
                        androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                        androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                        if (r0 != r1) goto L16
                        goto L25
                    L16:
                        androidx.lifecycle.LifecycleOwner r0 = r2.b
                        androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                        com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2$invoke$$inlined$createDestroyObservable$1$1 r1 = new com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2$invoke$$inlined$createDestroyObservable$1$1
                        r1.<init>(r3)
                        r0.addObserver(r1)
                        return
                    L25:
                        o.dpR r0 = o.dpR.c
                        r3.onNext(r0)
                        r3.onComplete()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$repository$2.e.subscribe(io.reactivex.ObservableEmitter):void");
                }
            }
        });
        this.l = b2;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("OriginalProfileIconsFragment");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cOL G() {
        cOL col = this.b;
        if (col != null) {
            return col;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(cOD cod) {
        C8632dsu.c((Object) cod, "");
        cod.e();
    }

    private final cOE a() {
        return (cOE) this.l.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.b = cOL.c(layoutInflater, viewGroup, false);
        FrameLayout c = G().c();
        C8632dsu.a(c, "");
        return c;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C1180Rt c1180Rt = new C1180Rt(view, this.j);
        this.k = c1180Rt;
        c1180Rt.b(false);
        G().d.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        Context context = view.getContext();
        C8632dsu.a(context, "");
        this.n = new C5959cOt(context);
        FragmentActivity activity = getActivity();
        C5959cOt c5959cOt = this.n;
        C9726vo.d(activity, c5959cOt != null ? c5959cOt.j() : null, new drX<FragmentActivity, C1729aMb, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$onViewCreated$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(FragmentActivity fragmentActivity, C1729aMb c1729aMb) {
                d(fragmentActivity, c1729aMb);
                return dpR.c;
            }

            public final void d(FragmentActivity fragmentActivity, C1729aMb c1729aMb) {
                cOL G;
                C8632dsu.c((Object) fragmentActivity, "");
                C8632dsu.c((Object) c1729aMb, "");
                G = cOD.this.G();
                G.d.setLolomoAdapter(new C9898yf(fragmentActivity, c1729aMb));
            }
        });
        e();
    }

    private final void e() {
        if (C9737vz.a(bj_())) {
            return;
        }
        C1180Rt c1180Rt = this.k;
        if (c1180Rt != null) {
            c1180Rt.b(false);
        }
        C8254dgs.c(G().d, false);
        Intent intent = by_().getIntent();
        a().c(intent.getStringExtra("EXTRA_ORIGINAL_ICONS_PROFILE_ID"), intent.getBooleanExtra("EXTRA_ORIGINAL_ICONS_IS_KIDS", true), new drM<aLO<? extends InterfaceC5147btK>, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.icons.impl.OriginalProfileIconsFragment$loadData$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(aLO<? extends InterfaceC5147btK> alo) {
                b(alo);
                return dpR.c;
            }

            public final void b(aLO<? extends InterfaceC5147btK> alo) {
                C5959cOt c5959cOt;
                cOL col;
                C8632dsu.c((Object) alo, "");
                if (cOD.this.isDetached()) {
                    return;
                }
                if (alo instanceof aLZ) {
                    cOD cod = cOD.this;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    cod.d(netflixImmutableStatus);
                    c5959cOt = cOD.this.n;
                    if (c5959cOt != null) {
                        col = cOD.this.b;
                        if (col != null && !C8632dsu.c(col.d.getAdapter(), c5959cOt)) {
                            col.d.setLolomoAdapter(c5959cOt);
                        }
                        c5959cOt.b((InterfaceC5147btK) ((aLZ) alo).e());
                    }
                } else if (alo instanceof aLL) {
                    cOD cod2 = cOD.this;
                    NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.ad;
                    C8632dsu.a(netflixImmutableStatus2, "");
                    cod2.d(netflixImmutableStatus2);
                    cOD.this.I();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        e.getLogTag();
        cOL col = this.b;
        if (col != null) {
            C8254dgs.a(col.d, false);
        }
        C1180Rt c1180Rt = this.k;
        if (c1180Rt != null) {
            c1180Rt.c(false);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), view.getPaddingBottom());
    }
}
