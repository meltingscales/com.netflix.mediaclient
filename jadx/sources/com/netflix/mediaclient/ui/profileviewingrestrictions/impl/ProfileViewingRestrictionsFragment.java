package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractApplicationC1040Mh;
import o.AbstractC5992cPz;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8928fv;
import o.C1020Ln;
import o.C1045Mp;
import o.C1333Xq;
import o.C1343Ya;
import o.C2536aht;
import o.C5015bql;
import o.C5987cPu;
import o.C5989cPw;
import o.C5991cPy;
import o.C8242dgg;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8916fj;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8983gx;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC5283bvo;
import o.InterfaceC5984cPr;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.KE;
import o.cKB;
import o.cKD;
import o.cPA;
import o.cPC;
import o.cPF;
import o.cPG;
import o.cPI;
import o.cPJ;
import o.cPM;
import o.cPN;
import o.cQQ;
import o.dpA;
import o.dpR;
import o.dqK;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ProfileViewingRestrictionsFragment extends AbstractC5992cPz implements InterfaceC8894fN {
    @Inject
    public C8242dgg cacheHelper;
    private final InterfaceC8554dpx k;
    private final InterfaceC8554dpx l;
    private final cPI m = new cPI();
    private final InterfaceC8554dpx n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC5283bvo f13316o;
    @Inject
    public cKD profileLock;
    @Inject
    public InterfaceC5984cPr viewingRestrictionsRepository;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(ProfileViewingRestrictionsFragment.class, "viewModel", "getViewModel()Lcom/netflix/mediaclient/ui/profileviewingrestrictions/impl/ViewingRestrictionsViewModel;", 0)), dsA.c(new PropertyReference1Impl(ProfileViewingRestrictionsFragment.class, "blockedTitlesViewModel", "getBlockedTitlesViewModel()Lcom/netflix/mediaclient/ui/profileviewingrestrictions/impl/BlockedTitlesViewModel;", 0))};
    public static final b j = new b(null);
    public static final int b = 8;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProfileViewingRestrictionsPage.values().length];
            try {
                iArr[ProfileViewingRestrictionsPage.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileViewingRestrictionsPage.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileViewingRestrictionsPage.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileViewingRestrictionsPage.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // o.InterfaceC8894fN
    public void e() {
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC8882fB<ProfileViewingRestrictionsFragment, cPN> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM b;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv e;

        public g(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.c = z;
            this.b = drm;
            this.e = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: b */
        public InterfaceC8554dpx<cPN> c(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, dtC<?> dtc) {
            C8632dsu.c((Object) profileViewingRestrictionsFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.e;
            return d.d(profileViewingRestrictionsFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(cPM.class), this.c, this.b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC8882fB<ProfileViewingRestrictionsFragment, C5989cPw> {
        final /* synthetic */ drM a;
        final /* synthetic */ InterfaceC8660dtv b;
        final /* synthetic */ boolean c;
        final /* synthetic */ drO e;

        public j(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, drO dro) {
            this.b = interfaceC8660dtv;
            this.c = z;
            this.a = drm;
            this.e = dro;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<C5989cPw> c(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, dtC<?> dtc) {
            C8632dsu.c((Object) profileViewingRestrictionsFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.b;
            final drO dro = this.e;
            return d.d(profileViewingRestrictionsFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$special$$inlined$activityViewModel$default$3$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    return (String) drO.this.invoke();
                }
            }, dsA.a(cPA.class), this.c, this.a);
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

    public ProfileViewingRestrictionsFragment() {
        final InterfaceC8660dtv a2 = dsA.a(cPN.class);
        g gVar = new g(a2, false, new drM<InterfaceC8890fJ<cPN, cPM>, cPN>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.cPN, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final cPN invoke(InterfaceC8890fJ<cPN, cPM> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, cPM.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2);
        dtC<?>[] dtcArr = e;
        this.l = gVar.c(this, dtcArr[0]);
        final InterfaceC8660dtv a3 = dsA.a(C5989cPw.class);
        final drO<String> dro = new drO<String>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$special$$inlined$activityViewModel$default$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final String invoke() {
                String name = drI.e(InterfaceC8660dtv.this).getName();
                C8632dsu.a(name, "");
                return name;
            }
        };
        this.k = new j(a3, false, new drM<InterfaceC8890fJ<C5989cPw, cPA>, C5989cPw>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$special$$inlined$activityViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [o.cPw, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final C5989cPw invoke(InterfaceC8890fJ<C5989cPw, cPA> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                return C8903fW.e(c8903fW, e2, cPA.class, new C8916fj(requireActivity, C8931fy.a(this), null, null, 12, null), (String) dro.invoke(), false, interfaceC8890fJ, 16, null);
            }
        }, dro).c(this, dtcArr[1]);
        this.n = dpA.d(new drO<String>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$profileId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final String invoke() {
                String string = ProfileViewingRestrictionsFragment.this.requireArguments().getString("extra_profile_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalArgumentException("profileId cannot be null".toString());
            }
        });
    }

    public final cKD F() {
        cKD ckd = this.profileLock;
        if (ckd != null) {
            return ckd;
        }
        C8632dsu.d("");
        return null;
    }

    public final C8242dgg I() {
        C8242dgg c8242dgg = this.cacheHelper;
        if (c8242dgg != null) {
            return c8242dgg;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cPN M() {
        return (cPN) this.l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5989cPw L() {
        return (C5989cPw) this.k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String N() {
        return (String) this.n.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ProfileViewingRestrictionsFragment");
        }

        public final ProfileViewingRestrictionsFragment a(Bundle bundle) {
            C8632dsu.c((Object) bundle, "");
            ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment = new ProfileViewingRestrictionsFragment();
            profileViewingRestrictionsFragment.setArguments(bundle);
            return profileViewingRestrictionsFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-158298123, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return dpR.c;
            }

            public final void d(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-158298123, i, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment.onCreateView.<anonymous>.<anonymous> (ProfileViewingRestrictionsFragment.kt:96)");
                }
                ProfileViewingRestrictionsFragment.this.a(null, composer, 64, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Pair) t).d(), (Integer) ((Pair) t2).d());
            return compareValues;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Pair) t).d(), (Integer) ((Pair) t2).d());
            return compareValues;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(cPG.b.s));
        }
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        this.f13316o = k != null ? k.b(N()) : null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP d2 = C9935zP.b.d(by_());
        SubscribersKt.subscribeBy$default(d2.d(cKB.class), (drM) null, (drO) null, new drM<cKB, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cKB ckb) {
                c(ckb);
                return dpR.c;
            }

            public final void c(cKB ckb) {
                cPN M;
                C8632dsu.c((Object) ckb, "");
                if (ckb instanceof cKB.a) {
                    if (((cKB.a) ckb).e()) {
                        ProfileViewingRestrictionsFragment.this.c("PasswordValidDialog");
                        M = ProfileViewingRestrictionsFragment.this.M();
                        M.b(ProfileViewingRestrictionsPage.e);
                        return;
                    }
                    return;
                }
                ProfileViewingRestrictionsFragment.j.getLogTag();
            }
        }, 3, (Object) null);
        L().d(d2);
    }

    public final void a(Modifier modifier, Composer composer, final int i, final int i2) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1860236456);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1860236456, i, -1, "com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment.ViewingRestrictionsScreen (ProfileViewingRestrictionsFragment.kt:136)");
        }
        State a2 = C8983gx.a(M(), new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$currentPage$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPM) obj).b();
            }
        }, startRestartGroup, 72);
        State a3 = C8983gx.a(M(), new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$maturityLevel$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPM) obj).e();
            }
        }, startRestartGroup, 72);
        State a4 = C8983gx.a(M(), new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$optedForKids$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return Boolean.valueOf(((cPM) obj).a());
            }
        }, startRestartGroup, 72);
        State a5 = C8983gx.a(M(), new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$ratings$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPM) obj).d();
            }
        }, startRestartGroup, 72);
        State a6 = C8983gx.a(L(), new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$blockedTitles$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return ((cPA) obj).a();
            }
        }, startRestartGroup, 72);
        C8983gx.a(L(), new PropertyReference1Impl() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$blockedTitlesChanged$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.dtE
            public Object get(Object obj) {
                return Boolean.valueOf(((cPA) obj).c());
            }
        }, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(a(a2), new ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$1(a2, this, null), startRestartGroup, 64);
        EffectsKt.LaunchedEffect(dpR.c, new ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$2(this, null), startRestartGroup, 70);
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion2 = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion4.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        BackHandlerKt.BackHandler((a(a2) == ProfileViewingRestrictionsPage.c || a(a2) == ProfileViewingRestrictionsPage.a) ? false : true, new ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$1(this, a2, a3, a4), startRestartGroup, 0, 0);
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        float f = 12;
        Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(companion, Dp.m2492constructorimpl(f));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor2 = companion4.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m273padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl2 = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        final Modifier modifier2 = companion;
        KE.d(HawkinsButtonType.d, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$2$1
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
                FragmentActivity activity = ProfileViewingRestrictionsFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }, HawkinsIcon.C0407v.b, getString(R.o.D), SizeKt.m295size3ABfNKs(companion2, Dp.m2492constructorimpl(24)), null, null, false, startRestartGroup, 24966, 224);
        SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion2, Dp.m2492constructorimpl(f)), startRestartGroup, 6);
        C1020Ln.c(b(a(a2)), SemanticsModifierKt.semantics$default(companion2, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$2$2
            public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                C8632dsu.c((Object) semanticsPropertyReceiver, "");
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                b(semanticsPropertyReceiver);
                return dpR.c;
            }
        }, 1, null), (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.ax.d, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24576, 0, 16364);
        a(a2);
        ProfileViewingRestrictionsPage profileViewingRestrictionsPage = ProfileViewingRestrictionsPage.b;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        int i3 = c.a[a(a2).ordinal()];
        if (i3 == 1) {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-598245205);
            cPC.b(null, composer2, 0, 1);
            composer2.endReplaceableGroup();
        } else if (i3 == 2) {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-598245080);
            cPJ.a(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$3
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
                    String N;
                    cKD F = ProfileViewingRestrictionsFragment.this.F();
                    NetflixActivity by_ = ProfileViewingRestrictionsFragment.this.by_();
                    N = ProfileViewingRestrictionsFragment.this.N();
                    String string = ProfileViewingRestrictionsFragment.this.getString(cPG.b.t);
                    C8632dsu.a(string, "");
                    F.a(by_, N, string);
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$4
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
                    cPN M;
                    M = ProfileViewingRestrictionsFragment.this.M();
                    M.b(ProfileViewingRestrictionsPage.b);
                }
            }, e(b(a3), f(a5)), b(i(a6)), !f(a5).isEmpty(), null, composer2, 0, 32);
            composer2.endReplaceableGroup();
        } else if (i3 == 3) {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-598244123);
            cPN M = M();
            String string = getString(cPG.b.u);
            C8632dsu.a(string, "");
            String string2 = getString(cPG.b.j);
            C8632dsu.a(string2, "");
            String string3 = getString(cPG.b.m);
            C8632dsu.a(string3, "");
            String string4 = getString(cPG.b.f13686o);
            C8632dsu.a(string4, "");
            cPF.a(M, string, string2, string3, string4, this.m, null, composer2, 262152, 64);
            composer2.endReplaceableGroup();
        } else if (i3 == 4) {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-598243548);
            C9935zP d2 = C9935zP.b.d(by_());
            Context requireContext = requireContext();
            String string5 = getString(cPG.b.g);
            String string6 = getString(cPG.b.f);
            String string7 = getString(cPG.b.n);
            String string8 = getString(cPG.b.k);
            String N = N();
            String string9 = getString(cPG.b.i);
            String string10 = getString(cPG.b.b);
            String string11 = getString(cPG.b.d);
            cPI cpi = this.m;
            C8632dsu.d(requireContext);
            C8632dsu.d((Object) string5);
            C8632dsu.d((Object) string6);
            C8632dsu.d((Object) string8);
            C8632dsu.d((Object) string7);
            C8632dsu.d((Object) string9);
            C8632dsu.d((Object) string10);
            C8632dsu.d((Object) string11);
            C5991cPy.e(d2, requireContext, string5, string6, string8, string7, string9, string10, string11, N, cpi, null, composer2, 72, 8, 2048);
            composer2.endReplaceableGroup();
        } else {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-598242588);
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer3, int i4) {
                    ProfileViewingRestrictionsFragment.this.a(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    e(composer3, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private final String b(ProfileViewingRestrictionsPage profileViewingRestrictionsPage) {
        int i = c.a[profileViewingRestrictionsPage.ordinal()];
        if (i == 1) {
            String string = getString(cPG.b.s);
            C8632dsu.a(string, "");
            return string;
        } else if (i == 2) {
            String string2 = getString(cPG.b.s);
            C8632dsu.a(string2, "");
            return string2;
        } else if (i == 3) {
            String string3 = getString(cPG.b.q);
            C8632dsu.a(string3, "");
            return string3;
        } else if (i == 4) {
            String string4 = getString(cPG.b.r);
            C8632dsu.a(string4, "");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final String b(List<C5987cPu> list) {
        String c2 = C1333Xq.d(cPG.b.l).a(list.size()).c();
        C8632dsu.a(c2, "");
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, boolean z) {
        M().b(ProfileViewingRestrictionsPage.a);
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            k.a(N(), Integer.valueOf(i), Boolean.valueOf(z), new d());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends C5015bql {
        d() {
        }

        @Override // o.C5015bql, o.InterfaceC5018bqo
        public void a(Status status, AccountData accountData) {
            C8632dsu.c((Object) status, "");
            ProfileViewingRestrictionsFragment.this.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AutoDispose"})
    public final void G() {
        CompositeDisposable compositeDisposable = this.f;
        Completable andThen = new cQQ().o().ignoreElements().andThen(I().c());
        ProfileViewingRestrictionsFragment$flushAndRestart$1 profileViewingRestrictionsFragment$flushAndRestart$1 = new ProfileViewingRestrictionsFragment$flushAndRestart$1(this);
        C8632dsu.d(andThen);
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(andThen, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$flushAndRestart$2
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
                C8632dsu.c((Object) th, "");
                ProfileViewingRestrictionsFragment.this.J();
            }
        }, profileViewingRestrictionsFragment$flushAndRestart$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        AbstractApplicationC1040Mh.getInstance().d(requireActivity(), "Profile Viewing Restrictions Change");
    }

    public final String e(Integer num, List<Pair<Integer, String>> list) {
        List c2;
        Object obj;
        Object y;
        Object B;
        String str = "";
        C8632dsu.c((Object) list, "");
        if (list.isEmpty()) {
            return "";
        }
        c2 = C8576dqs.c((Iterable) list, (Comparator) new e());
        Iterator it = c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int intValue = ((Number) ((Pair) obj).d()).intValue();
            if (num != null && intValue == num.intValue()) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        String str2 = pair != null ? (String) pair.a() : null;
        y = C8576dqs.y(c2);
        int intValue2 = ((Number) ((Pair) y).d()).intValue();
        B = C8576dqs.B((List<? extends Object>) c2);
        int intValue3 = ((Number) ((Pair) B).d()).intValue();
        if (num != null && num.intValue() == intValue2) {
            if (str2 != null) {
                str = str2;
            }
        } else if (num != null && num.intValue() == intValue3) {
            str = getResources().getString(cPG.b.x);
        } else if (str2 != null) {
            str = C1333Xq.d(cPG.b.y).d("maturityRating", str2).c();
        }
        C8632dsu.d((Object) str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List<C1343Ya.a> list, cPN cpn) {
        List n;
        List<Pair<Integer, String>> c2;
        C2536aht e2;
        C2536aht e3;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<C1343Ya.a> it = list.iterator();
        while (it.hasNext()) {
            C1343Ya.a next = it.next();
            String str = null;
            Integer e4 = (next == null || (e3 = next.e()) == null) ? null : e3.e();
            if (next != null && (e2 = next.e()) != null) {
                str = e2.a();
            }
            C9726vo.d(e4, str, new drX<Integer, String, String>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$formatMaturityRatingsAndUpdateState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ String invoke(Integer num, String str2) {
                    return b(num.intValue(), str2);
                }

                public final String b(int i, String str2) {
                    C8632dsu.c((Object) str2, "");
                    if (linkedHashMap.containsKey(Integer.valueOf(i))) {
                        String string = this.getString(cPG.b.p);
                        C8632dsu.a(string, "");
                        Map<Integer, String> map = linkedHashMap;
                        return map.put(Integer.valueOf(i), linkedHashMap.get(Integer.valueOf(i)) + string + str2);
                    }
                    return linkedHashMap.put(Integer.valueOf(i), str2);
                }
            });
        }
        n = dqK.n(linkedHashMap);
        c2 = C8576dqs.c((Iterable) n, (Comparator) new a());
        cpn.d(c2);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.m.c();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        FragmentManager supportFragmentManager;
        NetflixActivity bj_ = bj_();
        Fragment findFragmentByTag = (bj_ == null || (supportFragmentManager = bj_.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag(str);
        DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), ((NetflixFrag) this).d, view.getPaddingRight(), this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewingRestrictionsPage a(State<? extends ProfileViewingRestrictionsPage> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer b(State<Integer> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<Pair<Integer, String>> f(State<? extends List<Pair<Integer, String>>> state) {
        return state.getValue();
    }

    private static final List<C5987cPu> i(State<? extends List<C5987cPu>> state) {
        return state.getValue();
    }
}
