package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.transition.Slide;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTasteData;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteTitlesStackManager;
import com.netflix.model.leafs.originals.TagSummary;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3529bBf;
import o.AbstractC3534bBk;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8918fl;
import o.AbstractC8928fv;
import o.C1045Mp;
import o.C1193Sg;
import o.C1203Sq;
import o.C1204Sr;
import o.C1332Xp;
import o.C1333Xq;
import o.C1346Yd;
import o.C2272adC;
import o.C2635ajm;
import o.C3528bBe;
import o.C3533bBj;
import o.C3539bBp;
import o.C3540bBq;
import o.C3541bBr;
import o.C3542bBs;
import o.C3543bBt;
import o.C3545bBv;
import o.C3546bBw;
import o.C3547bBx;
import o.C3548bBy;
import o.C8569dql;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C8737dwr;
import o.C8903fW;
import o.C8925fs;
import o.C8927fu;
import o.C8930fx;
import o.C8931fy;
import o.C8932fz;
import o.C8971gl;
import o.C8974go;
import o.C8980gu;
import o.C9702vQ;
import o.C9703vR;
import o.C9834xU;
import o.C9870yD;
import o.C9935zP;
import o.GF;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.aEO;
import o.aLN;
import o.aLP;
import o.bAB;
import o.bAG;
import o.bAK;
import o.bBA;
import o.bBB;
import o.bBC;
import o.bBD;
import o.dnV;
import o.dpD;
import o.dpR;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dwU;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class CollectTasteDialogFrag extends AbstractC3529bBf implements InterfaceC8894fN {
    static final /* synthetic */ dtC<Object>[] a;
    public static final a b;
    private static int d = 0;
    private static byte e$ss2$566 = 0;
    private static int i = 1;
    private d c;
    @Inject
    public Lazy<CollectTaste> collectTaste;
    private final InterfaceC8554dpx e;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[CollectTasteTitlesStackManager.Companion.SwipeDirection.values().length];
            try {
                iArr[CollectTasteTitlesStackManager.Companion.SwipeDirection.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollectTasteTitlesStackManager.Companion.SwipeDirection.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CollectTasteTitlesStackManager.Companion.SwipeDirection.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
            int[] iArr2 = new int[CollectTasteTitlesStackManager.Companion.HintAnimationDirection.values().length];
            try {
                iArr2[CollectTasteTitlesStackManager.Companion.HintAnimationDirection.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CollectTasteTitlesStackManager.Companion.HintAnimationDirection.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CollectTasteTitlesStackManager.Companion.HintAnimationDirection.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CollectTasteTitlesStackManager.Companion.HintAnimationDirection.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            e = iArr2;
        }
    }

    static void d() {
        e$ss2$566 = (byte) 24;
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC8882fB<CollectTasteDialogFrag, C3533bBj> {
        final /* synthetic */ boolean a;
        final /* synthetic */ drM c;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ InterfaceC8660dtv e;

        public e(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.a = z;
            this.c = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<C3533bBj> c(CollectTasteDialogFrag collectTasteDialogFrag, dtC<?> dtc) {
            C8632dsu.c((Object) collectTasteDialogFrag, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(collectTasteDialogFrag, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C3528bBe.class), this.a, this.c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner a;

        public b(LifecycleOwner lifecycleOwner) {
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
            this.a.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onViewCreated$$inlined$createDestroyObservable$1$1
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

    @Override // o.InterfaceC8894fN
    public LifecycleOwner X_() {
        return InterfaceC8894fN.b.d(this);
    }

    @Override // o.InterfaceC8894fN
    public <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        return InterfaceC8894fN.b.e(this, abstractC8899fS, abstractC8928fv, drx);
    }

    @Override // o.InterfaceC8894fN
    public void i_() {
        InterfaceC8894fN.b.e(this);
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("CollectTasteDialogFrag");
        }

        public final CollectTasteDialogFrag c(CollectTasteData collectTasteData) {
            C8632dsu.c((Object) collectTasteData, "");
            CollectTasteDialogFrag collectTasteDialogFrag = new CollectTasteDialogFrag();
            collectTasteDialogFrag.setArguments(BundleKt.bundleOf(dpD.a("collect_taste_data", collectTasteData)));
            return collectTasteDialogFrag;
        }
    }

    public CollectTasteDialogFrag() {
        final InterfaceC8660dtv a2 = dsA.a(C3533bBj.class);
        this.e = new e(a2, false, new drM<InterfaceC8890fJ<C3533bBj, C3528bBe>, C3533bBj>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bBj, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final C3533bBj invoke(InterfaceC8890fJ<C3533bBj, C3528bBe> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C3528bBe.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, a[0]);
        Slide slide = new Slide();
        slide.setSlideEdge(8388613);
        slide.setDuration(250L);
        setEnterTransition(slide);
        setExitTransition(slide);
    }

    public final Lazy<CollectTaste> b() {
        Lazy<CollectTaste> lazy = this.collectTaste;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d {
        private final C1333Xq a;
        private final CollectTasteEpoxyController b;
        private final bAK c;
        private final aLP d;
        private final bBD e;
        private boolean f;
        private final C3545bBv g;
        private final C3547bBx h;
        private boolean i;
        private boolean j;
        private final List<TagSummary> l;
        private final CollectTasteTitlesStackManager m;

        public final bBD a() {
            return this.e;
        }

        public final void a(boolean z) {
            this.j = z;
        }

        public final C1333Xq b() {
            return this.a;
        }

        public final aLP c() {
            return this.d;
        }

        public final void c(boolean z) {
            this.f = z;
        }

        public final bAK d() {
            return this.c;
        }

        public final CollectTasteEpoxyController e() {
            return this.b;
        }

        public final void e(boolean z) {
            this.i = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.m, dVar.m) && C8632dsu.c(this.h, dVar.h) && C8632dsu.c(this.g, dVar.g) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a) && this.i == dVar.i && this.j == dVar.j && this.f == dVar.f && C8632dsu.c(this.l, dVar.l) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public final boolean f() {
            return this.f;
        }

        public final boolean g() {
            return this.i;
        }

        public final C3547bBx h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.m.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.f)) * 31) + this.l.hashCode()) * 31) + this.d.hashCode();
        }

        public final C3545bBv i() {
            return this.g;
        }

        public final boolean j() {
            return this.j;
        }

        public final List<TagSummary> k() {
            return this.l;
        }

        public final CollectTasteTitlesStackManager m() {
            return this.m;
        }

        public String toString() {
            bAK bak = this.c;
            CollectTasteEpoxyController collectTasteEpoxyController = this.b;
            CollectTasteTitlesStackManager collectTasteTitlesStackManager = this.m;
            C3547bBx c3547bBx = this.h;
            C3545bBv c3545bBv = this.g;
            bBD bbd = this.e;
            C1333Xq c1333Xq = this.a;
            boolean z = this.i;
            boolean z2 = this.j;
            boolean z3 = this.f;
            List<TagSummary> list = this.l;
            aLP alp = this.d;
            return "Holder(binding=" + bak + ", controller=" + collectTasteEpoxyController + ", titlesStackManager=" + collectTasteTitlesStackManager + ", lottieDrawableManager=" + c3547bBx + ", hintAnimationManager=" + c3545bBv + ", collectTasteRatingCLHelper=" + bbd + ", counterCopyFormatter=" + c1333Xq + ", firstRateUpInteractionCompleted=" + z + ", firstRateDownInteractionCompleted=" + z2 + ", refreshIsRequested=" + z3 + ", tags=" + list + ", falcorRepository=" + alp + ")";
        }

        public d(bAK bak, CollectTasteEpoxyController collectTasteEpoxyController, CollectTasteTitlesStackManager collectTasteTitlesStackManager, C3547bBx c3547bBx, C3545bBv c3545bBv, bBD bbd, C1333Xq c1333Xq, boolean z, boolean z2, boolean z3, List<TagSummary> list, aLP alp) {
            C8632dsu.c((Object) bak, "");
            C8632dsu.c((Object) collectTasteEpoxyController, "");
            C8632dsu.c((Object) collectTasteTitlesStackManager, "");
            C8632dsu.c((Object) c3547bBx, "");
            C8632dsu.c((Object) c3545bBv, "");
            C8632dsu.c((Object) bbd, "");
            C8632dsu.c((Object) c1333Xq, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) alp, "");
            this.c = bak;
            this.b = collectTasteEpoxyController;
            this.m = collectTasteTitlesStackManager;
            this.h = c3547bBx;
            this.g = c3545bBv;
            this.e = bbd;
            this.a = c1333Xq;
            this.i = z;
            this.j = z2;
            this.f = z3;
            this.l = list;
            this.d = alp;
        }

        public /* synthetic */ d(bAK bak, CollectTasteEpoxyController collectTasteEpoxyController, CollectTasteTitlesStackManager collectTasteTitlesStackManager, C3547bBx c3547bBx, C3545bBv c3545bBv, bBD bbd, C1333Xq c1333Xq, boolean z, boolean z2, boolean z3, List list, aLP alp, int i, C8627dsp c8627dsp) {
            this(bak, collectTasteEpoxyController, collectTasteTitlesStackManager, c3547bBx, c3545bBv, bbd, c1333Xq, (i & 128) != 0 ? false : z, (i & JSONzip.end) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? new ArrayList() : list, alp);
        }
    }

    static {
        d();
        a = new dtC[]{dsA.c(new PropertyReference1Impl(CollectTasteDialogFrag.class, "collectTasteViewModel", "getCollectTasteViewModel()Lcom/netflix/mediaclient/ui/collecttaste/impl/rating/CollectTasteViewModel;", 0))};
        b = new a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3533bBj g() {
        return (C3533bBj) this.e.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(bAG.b.d, viewGroup, false);
        C8632dsu.d(inflate);
        e(inflate);
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        bAK b2 = bAK.b(view);
        C8632dsu.a(b2, "");
        C9935zP d2 = C9935zP.b.d(this);
        C3539bBp b3 = C3542bBs.b();
        C3540bBq e2 = C3541bBr.e();
        C3548bBy d3 = C3546bBw.d();
        dnV dnv = b2.w;
        C8632dsu.a(dnv, "");
        CollectTasteTitlesStackManager collectTasteTitlesStackManager = new CollectTasteTitlesStackManager(dnv, C3543bBt.d(), b3, d3, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onViewCreated$titlesStackManager$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                e(num.intValue());
                return dpR.c;
            }

            public final void e(int i2) {
                CollectTasteDialogFrag.this.c(i2);
            }
        }, new drX<CollectTasteTitlesStackManager.Companion.SwipeDirection, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onViewCreated$titlesStackManager$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(CollectTasteTitlesStackManager.Companion.SwipeDirection swipeDirection, Integer num) {
                c(swipeDirection, num.intValue());
                return dpR.c;
            }

            public final void c(CollectTasteTitlesStackManager.Companion.SwipeDirection swipeDirection, int i2) {
                C8632dsu.c((Object) swipeDirection, "");
                CollectTasteDialogFrag.this.d(swipeDirection, i2);
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onViewCreated$titlesStackManager$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                CollectTasteDialogFrag.this.k();
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onViewCreated$titlesStackManager$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                CollectTasteDialogFrag.this.o();
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onViewCreated$titlesStackManager$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                CollectTasteDialogFrag.this.n();
            }
        });
        C3547bBx c3547bBx = new C3547bBx();
        Bundle arguments = getArguments();
        CollectTasteData collectTasteData = arguments != null ? (CollectTasteData) arguments.getParcelable("collect_taste_data") : null;
        if (collectTasteData == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        CollectTasteEpoxyController collectTasteEpoxyController = new CollectTasteEpoxyController(requireContext);
        C3545bBv c3545bBv = new C3545bBv(null, d2, d3, e2, collectTasteTitlesStackManager, c3547bBx, 1, null);
        bBD bbd = new bBD(collectTasteData.b());
        C1333Xq d4 = C1333Xq.d(bAG.e.p);
        C8632dsu.a(d4, "");
        aLN.b bVar = aLN.a;
        Observable<dpR> subscribeOn = Observable.create(new b(this)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        this.c = new d(b2, collectTasteEpoxyController, collectTasteTitlesStackManager, c3547bBx, c3545bBv, bbd, d4, false, false, false, null, bVar.a(subscribeOn), 1920, null);
        h();
        c(d2);
        i_();
        p().a().e();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.c = null;
        super.onDestroyView();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(g(), new drM<C3528bBe, Boolean>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$isLoadingData$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(C3528bBe c3528bBe) {
                C8632dsu.c((Object) c3528bBe, "");
                return Boolean.valueOf(c3528bBe.e());
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3528bBe c3528bBe) {
                e(c3528bBe);
                return dpR.c;
            }

            public final void e(C3528bBe c3528bBe) {
                C3533bBj g;
                CollectTasteDialogFrag.d p;
                C3533bBj g2;
                CollectTasteDialogFrag.d p2;
                C3533bBj g3;
                CollectTasteDialogFrag.d p3;
                C8632dsu.c((Object) c3528bBe, "");
                AbstractC8918fl<RefreshState> a2 = c3528bBe.a();
                if (a2 instanceof C8974go) {
                    CollectTasteDialogFrag.this.b(c3528bBe);
                } else if (a2 instanceof C8971gl) {
                    if (RefreshState.c == c3528bBe.a().c()) {
                        g3 = CollectTasteDialogFrag.this.g();
                        p3 = CollectTasteDialogFrag.this.p();
                        g3.e(p3.c(), "BULK_RATER_MODULE_NO_PAYOFF");
                        CollectTasteDialogFrag.this.b().get().a().d(new bAB.a(CollectTaste.MessageType.b));
                    } else {
                        g2 = CollectTasteDialogFrag.this.g();
                        p2 = CollectTasteDialogFrag.this.p();
                        g2.e(p2.c(), "BULK_RATER_MODULE_GOT_PAYOFF");
                    }
                    CollectTasteDialogFrag.this.j();
                } else if (a2 instanceof C8927fu) {
                    g = CollectTasteDialogFrag.this.g();
                    p = CollectTasteDialogFrag.this.p();
                    g.e(p.c(), "BULK_RATER_MODULE_NO_PAYOFF");
                    CollectTasteDialogFrag.this.b().get().a().d(new bAB.a(CollectTaste.MessageType.b));
                    CollectTasteDialogFrag.this.j();
                }
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$handleBackPressed$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3528bBe c3528bBe) {
                d(c3528bBe);
                return dpR.c;
            }

            public final void d(C3528bBe c3528bBe) {
                CollectTasteDialogFrag.d p;
                int i2;
                C8632dsu.c((Object) c3528bBe, "");
                p = CollectTasteDialogFrag.this.p();
                bBD a2 = p.a();
                i2 = CollectTasteDialogFrag.this.i();
                a2.a(c3528bBe, i2);
            }
        });
        s();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final int i2) {
        a(i2);
        b(i2);
        t();
        C3545bBv i3 = p().i();
        if (i2 == 0 && !i3.d()) {
            C1204Sr c1204Sr = p().d().d;
            C8632dsu.a(c1204Sr, "");
            i3.a(c1204Sr);
            dwU e2 = g().e();
            GF gf = GF.e;
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            C8737dwr.c(e2, gf.d(requireContext), null, new CollectTasteDialogFrag$onTitleCardAppeared$1(i3, null), 2, null);
        }
        C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onTitleCardAppeared$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3528bBe c3528bBe) {
                b(c3528bBe);
                return dpR.c;
            }

            public final void b(C3528bBe c3528bBe) {
                CollectTasteDialogFrag.d p;
                C8632dsu.c((Object) c3528bBe, "");
                p = CollectTasteDialogFrag.this.p();
                p.a().c(c3528bBe, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(CollectTasteTitlesStackManager.Companion.SwipeDirection swipeDirection, final int i2) {
        C3547bBx h = p().h();
        int i3 = c.b[swipeDirection.ordinal()];
        if (i3 == 1) {
            b(i2, 1);
            h.d();
        } else if (i3 == 2) {
            b(i2, 2);
            h.b();
        } else if (i3 != 3) {
        } else {
            C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$onTitleCardDisappeared$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3528bBe c3528bBe) {
                    e(c3528bBe);
                    return dpR.c;
                }

                public final void e(C3528bBe c3528bBe) {
                    CollectTasteDialogFrag.d p;
                    C8632dsu.c((Object) c3528bBe, "");
                    p = CollectTasteDialogFrag.this.p();
                    p.a().b(c3528bBe, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        p().c(true);
        g().f();
        dwU e2 = g().e();
        GF gf = GF.e;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        C8737dwr.c(e2, gf.d(requireContext), null, new CollectTasteDialogFrag$onTitleCardStackEmpty$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        g().e(p().c(), "BULK_RATER_MODULE_SKIP_ALL");
        b().get().a().d(new bAB.a(CollectTaste.MessageType.a));
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        g().e(p().c(), "BULK_RATER_MODULE_THUMB_DOWN_ALL");
        b().get().a().d(new bAB.a(CollectTaste.MessageType.d));
        j();
    }

    private final void e(View view) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: o.bAW
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat e2;
                e2 = CollectTasteDialogFrag.e(view2, windowInsetsCompat);
                return e2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat) {
        C9870yD.d(view, 3, windowInsetsCompat.getSystemWindowInsetBottom());
        return windowInsetsCompat;
    }

    private final void c(C9935zP c9935zP) {
        final C3545bBv i2 = p().i();
        final bAK d2 = p().d();
        CompositeDisposable compositeDisposable = this.onDestroyDisposable;
        C8632dsu.a(compositeDisposable, "");
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC3534bBk.class), (drM) null, (drO) null, new drM<AbstractC3534bBk, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$subscribeEvents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC3534bBk abstractC3534bBk) {
                b(abstractC3534bBk);
                return dpR.c;
            }

            public final void b(AbstractC3534bBk abstractC3534bBk) {
                C8632dsu.c((Object) abstractC3534bBk, "");
                if (abstractC3534bBk instanceof AbstractC3534bBk.d) {
                    CollectTasteDialogFrag.this.b((AbstractC3534bBk.d) abstractC3534bBk);
                } else if (C8632dsu.c(abstractC3534bBk, AbstractC3534bBk.b.a)) {
                    CollectTasteDialogFrag.this.d(100L);
                    C3545bBv c3545bBv = i2;
                    ImageView imageView = d2.q;
                    C8632dsu.a(imageView, "");
                    c3545bBv.d(imageView);
                    C3545bBv c3545bBv2 = i2;
                    ImageView imageView2 = d2.g;
                    C8632dsu.a(imageView2, "");
                    c3545bBv2.d(imageView2);
                } else if (C8632dsu.c(abstractC3534bBk, AbstractC3534bBk.c.b)) {
                    CollectTasteDialogFrag.this.d(150L);
                }
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(long j) {
        C3545bBv i2 = p().i();
        bAK d2 = p().d();
        ConstraintLayout constraintLayout = d2.m;
        C8632dsu.a(constraintLayout, "");
        i2.c(constraintLayout);
        dnV dnv = d2.w;
        C8632dsu.a(dnv, "");
        i2.c(dnv);
        q();
        NetflixImageView netflixImageView = d2.a;
        C8632dsu.a(netflixImageView, "");
        i2.a(netflixImageView, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(AbstractC3534bBk.d dVar) {
        C3545bBv i2 = p().i();
        bAK d2 = p().d();
        int i3 = c.e[dVar.b().ordinal()];
        if (i3 == 1) {
            ImageView imageView = p().d().q;
            C8632dsu.a(imageView, "");
            i2.j(imageView);
        } else if (i3 == 2) {
            ImageView imageView2 = d2.q;
            C8632dsu.a(imageView2, "");
            i2.i(imageView2);
        } else if (i3 == 3) {
            ImageView imageView3 = d2.g;
            C8632dsu.a(imageView3, "");
            i2.b(imageView3);
        } else if (i3 != 4) {
        } else {
            ImageView imageView4 = d2.g;
            C8632dsu.a(imageView4, "");
            i2.f(imageView4);
        }
    }

    private final void h() {
        C3545bBv i2 = p().i();
        ConstraintLayout constraintLayout = p().d().m;
        C8632dsu.a(constraintLayout, "");
        i2.e(constraintLayout);
        dnV dnv = p().d().w;
        C8632dsu.a(dnv, "");
        i2.e(dnv);
        l();
        p().h().a();
        m();
        p().i().b();
        p().m().e();
    }

    private final void l() {
        int i2 = 2 % 2;
        Pair<Integer, Integer> c2 = bBA.c();
        int intValue = c2.b().intValue();
        int intValue2 = c2.c().intValue();
        C1204Sr c1204Sr = p().d().s;
        C8632dsu.a(c1204Sr, "");
        String string = requireContext().getString(intValue);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            u(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = d + 15;
            i = i3 % 128;
            int i4 = i3 % 2;
        }
        c1204Sr.setText(string);
        C9870yD.d(c1204Sr, 1, intValue2);
        c1204Sr.setVisibility(0);
        int i5 = i + 103;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void m() {
        bAK d2 = p().d();
        C1193Sg c1193Sg = d2.e;
        C8632dsu.a(c1193Sg, "");
        C1332Xp c1332Xp = C1332Xp.b;
        C9702vQ.c(c1193Sg, (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        d2.h.setImageDrawable(p().h().e());
        d2.n.setImageDrawable(p().h().c());
    }

    private final void q() {
        List<View> j;
        bAK d2 = p().d();
        ConstraintLayout constraintLayout = d2.m;
        C8632dsu.a(constraintLayout, "");
        C1193Sg c1193Sg = d2.e;
        C8632dsu.a(c1193Sg, "");
        LinearLayout linearLayout = d2.j;
        C8632dsu.a(linearLayout, "");
        LinearLayout linearLayout2 = d2.f13490o;
        C8632dsu.a(linearLayout2, "");
        C1203Sq c1203Sq = d2.l;
        C8632dsu.a(c1203Sq, "");
        j = C8569dql.j(constraintLayout, c1193Sg, linearLayout, linearLayout2, c1203Sq);
        for (View view : j) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.bAX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CollectTasteDialogFrag.c(CollectTasteDialogFrag.this, view2);
                }
            });
            view.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CollectTasteDialogFrag collectTasteDialogFrag, View view) {
        C8632dsu.c((Object) collectTasteDialogFrag, "");
        C8632dsu.d(view);
        collectTasteDialogFrag.a(view);
    }

    private final void a(View view) {
        int id = view.getId();
        if (id == bAG.a.e) {
            C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$handleOnClickEvent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3528bBe c3528bBe) {
                    c(c3528bBe);
                    return dpR.c;
                }

                public final void c(C3528bBe c3528bBe) {
                    CollectTasteDialogFrag.d p;
                    int i2;
                    C8632dsu.c((Object) c3528bBe, "");
                    p = CollectTasteDialogFrag.this.p();
                    bBD a2 = p.a();
                    i2 = CollectTasteDialogFrag.this.i();
                    a2.d(c3528bBe, i2);
                }
            });
            s();
        } else if (id == bAG.a.s) {
            if (!p().j()) {
                bBB bbb = bBB.d;
                Context requireContext = requireContext();
                C8632dsu.a(requireContext, "");
                bbb.a(requireContext, bAG.e.w);
                p().a(true);
            }
            p().h().d();
            CollectTasteTitlesStackManager m = p().m();
            dnV dnv = p().d().w;
            C8632dsu.a(dnv, "");
            m.e(dnv, CollectTasteTitlesStackManager.Companion.SwipeDirection.e);
        } else if (id != bAG.a.x) {
            if (id == bAG.a.p) {
                f();
                CollectTasteTitlesStackManager m2 = p().m();
                dnV dnv2 = p().d().w;
                C8632dsu.a(dnv2, "");
                m2.e(dnv2, CollectTasteTitlesStackManager.Companion.SwipeDirection.b);
            }
        } else {
            if (!p().g()) {
                bBB bbb2 = bBB.d;
                Context requireContext2 = requireContext();
                C8632dsu.a(requireContext2, "");
                bbb2.a(requireContext2, bAG.e.x);
                p().e(true);
            }
            p().h().b();
            CollectTasteTitlesStackManager m3 = p().m();
            dnV dnv3 = p().d().w;
            C8632dsu.a(dnv3, "");
            m3.e(dnv3, CollectTasteTitlesStackManager.Companion.SwipeDirection.c);
        }
    }

    private final void f() {
        bAK d2 = p().d();
        d2.l.setTextColor(ContextCompat.getColor(requireContext(), C9834xU.c.I));
        dwU e2 = g().e();
        GF gf = GF.e;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        C8737dwr.c(e2, gf.d(requireContext), null, new CollectTasteDialogFrag$animateSkipButtonTextColor$1(d2, this, null), 2, null);
    }

    private final void t() {
        C1333Xq d2;
        C1204Sr c1204Sr = p().d().d;
        C1333Xq d3 = p().b().d("current_title_index", Integer.valueOf(p().m().a() + 1));
        c1204Sr.setText((d3 == null || (d2 = d3.d("total_titles_count", Integer.valueOf(p().m().d()))) == null) ? null : d2.c());
    }

    private final void b(final int i2) {
        int d2;
        Pair pair = (Pair) C8980gu.c(g(), new drM<C3528bBe, Pair<? extends List<? extends C2635ajm.d>, ? extends String>>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$renderTags$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Pair<List<C2635ajm.d>, String> invoke(C3528bBe c3528bBe) {
                C8632dsu.c((Object) c3528bBe, "");
                return bBC.e.d(c3528bBe, i2);
            }
        });
        List<C2635ajm.d> list = (List) pair.b();
        String str = (String) pair.c();
        NetflixTagsTextView netflixTagsTextView = p().d().r;
        C8632dsu.a(netflixTagsTextView, "");
        List<TagSummary> k = p().k();
        if (list != null && !list.isEmpty()) {
            k.clear();
            d2 = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (C2635ajm.d dVar : list) {
                arrayList.add(new aEO(dVar));
            }
            k.addAll(arrayList);
            netflixTagsTextView.setVisibility(0);
            ArrayList arrayList2 = new ArrayList();
            for (C2635ajm.d dVar2 : list) {
                if (dVar2 != null) {
                    String e2 = dVar2.e();
                    if (e2 == null) {
                        e2 = "";
                    }
                    arrayList2.add(e2);
                }
            }
            if (str != null) {
                netflixTagsTextView.setSeparatorColor(Color.parseColor("#" + str));
            }
            netflixTagsTextView.setTags(arrayList2);
            return;
        }
        netflixTagsTextView.setVisibility(8);
    }

    private final void a(final int i2) {
        final bAK d2 = p().d();
        C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$updateMetadata$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3528bBe c3528bBe) {
                e(c3528bBe);
                return dpR.c;
            }

            public final void e(C3528bBe c3528bBe) {
                boolean g;
                CollectTasteDialogFrag.d p;
                CollectTasteDialogFrag.d p2;
                CollectTasteDialogFrag.d p3;
                CollectTasteDialogFrag.d p4;
                C8632dsu.c((Object) c3528bBe, "");
                bBC bbc = bBC.e;
                C2272adC c2 = bbc.c(c3528bBe, i2);
                String e2 = bbc.e(c2);
                d2.v.setText(e2);
                C1204Sr c1204Sr = d2.v;
                C8632dsu.a(c1204Sr, "");
                c1204Sr.setVisibility(e2.length() > 0 ? 0 : 8);
                Pair<Drawable, String> d3 = bbc.d(c2);
                Drawable b2 = d3.b();
                String c3 = d3.c();
                if (b2 != null) {
                    d2.b.setVisibility(8);
                    NetflixImageView netflixImageView = d2.p;
                    netflixImageView.setVisibility(0);
                    netflixImageView.setImageDrawable(b2);
                    netflixImageView.setContentDescription(c3);
                } else {
                    d2.p.setVisibility(8);
                    String a2 = bbc.a(c2);
                    C1204Sr c1204Sr2 = d2.b;
                    if (a2.length() == 0) {
                        c1204Sr2.setVisibility(8);
                    } else {
                        c1204Sr2.setVisibility(0);
                        c1204Sr2.setText(a2);
                    }
                }
                C1204Sr c1204Sr3 = d2.t;
                Context requireContext = this.requireContext();
                C8632dsu.a(requireContext, "");
                Pair<String, String> c4 = bbc.c(requireContext, c2);
                String b3 = c4.b();
                String c5 = c4.c();
                if (b3.length() > 0) {
                    c1204Sr3.setText(b3);
                    c1204Sr3.setContentDescription(c5);
                    c1204Sr3.setVisibility(0);
                }
                NetflixActivity requireNetflixActivity = this.requireNetflixActivity();
                C8632dsu.a(requireNetflixActivity, "");
                Pair<String, String> a3 = bbc.a(requireNetflixActivity, c2);
                String b4 = a3.b();
                String c6 = a3.c();
                g = C8691duz.g(b4);
                if (g) {
                    p4 = this.p();
                    p4.d().c.setVisibility(8);
                    return;
                }
                p = this.p();
                p.d().c.setText(b4);
                p2 = this.p();
                p2.d().c.setContentDescription(c6);
                p3 = this.p();
                p3.d().c.setVisibility(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        dwU e2 = g().e();
        GF gf = GF.e;
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        C8737dwr.c(e2, gf.d(requireContext), null, new CollectTasteDialogFrag$dismissWithDelay$1(this, null), 2, null);
    }

    private final void b(final int i2, final int i3) {
        C8980gu.c(g(), new drM<C3528bBe, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$sendRatingInteraction$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final dpR invoke(C3528bBe c3528bBe) {
                CollectTasteDialogFrag.d p;
                C3533bBj g;
                CollectTasteDialogFrag.d p2;
                C8632dsu.c((Object) c3528bBe, "");
                bBC bbc = bBC.e;
                int c2 = bbc.c(c3528bBe);
                String e2 = bbc.e(c3528bBe, i2);
                if (e2 != null) {
                    CollectTasteDialogFrag collectTasteDialogFrag = this;
                    int i4 = i2;
                    int i5 = i3;
                    p = collectTasteDialogFrag.p();
                    final bBD.b c3 = p.a().c(c3528bBe, i4, i5);
                    g = collectTasteDialogFrag.g();
                    p2 = collectTasteDialogFrag.p();
                    g.a(p2.c(), c2, e2, i5, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag$sendRatingInteraction$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Throwable th) {
                            c(th);
                            return dpR.c;
                        }

                        public final void c(Throwable th) {
                            if (th == null) {
                                bBD.b.C0101b.b(bBD.b.this, true, null, 2, null);
                            } else {
                                bBD.b.this.a(false, th.getMessage());
                            }
                        }
                    });
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(C3528bBe c3528bBe) {
        AbstractC8918fl<Pair<List<InterfaceC5222bug<? extends InterfaceC5223buh>>, List<C1346Yd.e>>> b2 = c3528bBe.b();
        if (b2 instanceof C8974go) {
            C3533bBj g = g();
            bBC bbc = bBC.e;
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            g.e(bbc.d(requireContext));
        } else if (b2 instanceof C8932fz) {
        } else {
            if (b2 instanceof C8971gl) {
                CollectTasteEpoxyController e2 = p().e();
                e2.setData(c3528bBe);
                p().d().w.setAdapter(e2.getAdapter());
                return;
            }
            boolean z = b2 instanceof C8927fu;
        }
    }

    private final void s() {
        if (!p().f() && (p().g() || p().j())) {
            g().f();
            r();
            return;
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d p() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("collect taste holder is null".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        if (p().f()) {
            return p().m().a() - 1;
        }
        return p().m().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        int i2 = 2 % 2;
        int i3 = d + 95;
        i = i3 % 128;
        int i4 = i3 % 2;
        bAK d2 = p().d();
        ProgressBar progressBar = d2.f;
        C8632dsu.a(progressBar, "");
        if (progressBar.getVisibility() == 0) {
            return;
        }
        ConstraintLayout constraintLayout = d2.m;
        C8632dsu.a(constraintLayout, "");
        for (View view : C9703vR.e(constraintLayout)) {
            view.setVisibility(8);
        }
        C1204Sr c1204Sr = d2.s;
        String string = requireContext().getString(bBA.b());
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            u(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i5 = d + 57;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        c1204Sr.setText(string);
        C1332Xp c1332Xp = C1332Xp.b;
        C9870yD.d(c1204Sr, 1, (int) TypedValue.applyDimension(1, 118, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        c1204Sr.setVisibility(0);
        d2.f.setVisibility(0);
        p().a().c();
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$566);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
