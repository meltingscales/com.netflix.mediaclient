package com.netflix.mediaclient.android.sharing.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.Logger;
import com.netflix.cl.model.ShareInfo;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.ShareEnded;
import com.netflix.cl.model.event.session.action.Share;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC1131Pw;
import o.AbstractC8882fB;
import o.AbstractC8899fS;
import o.AbstractC8918fl;
import o.AbstractC8928fv;
import o.C1045Mp;
import o.C1135Qa;
import o.C1137Qc;
import o.C1572aGg;
import o.C8151dev;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8927fu;
import o.C8930fx;
import o.C8931fy;
import o.C8932fz;
import o.C8971gl;
import o.C8974go;
import o.C8980gu;
import o.InterfaceC1570aGe;
import o.InterfaceC1571aGf;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8888fH;
import o.InterfaceC8890fJ;
import o.InterfaceC8894fN;
import o.InterfaceC8976gq;
import o.PN;
import o.PZ;
import o.QI;
import o.dpR;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dxD;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ShareSheetFragment extends AbstractC1131Pw implements InterfaceC8894fN {
    private Long a;
    private final InterfaceC8554dpx c;
    @Inject
    public InterfaceC1570aGe imageLoaderCompose;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(ShareSheetFragment.class, "viewModel", "getViewModel()Lcom/netflix/mediaclient/android/sharing/impl/ShareSheetViewModel;", 0))};
    public static final b d = new b(null);
    public static final int b = 8;

    @Override // o.InterfaceC8894fN
    public void e() {
    }

    /* loaded from: classes3.dex */
    public static final class e extends AbstractC8882fB<ShareSheetFragment, C1135Qa> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv d;
        final /* synthetic */ drM e;

        public e(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.c = z;
            this.e = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<C1135Qa> c(ShareSheetFragment shareSheetFragment, dtC<?> dtc) {
            C8632dsu.c((Object) shareSheetFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(shareSheetFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$special$$inlined$fragmentViewModel$default$2$1
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
            }, dsA.a(C1137Qc.class), this.c, this.e);
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

    public ShareSheetFragment() {
        final InterfaceC8660dtv a = dsA.a(C1135Qa.class);
        this.c = new e(a, false, new drM<InterfaceC8890fJ<C1135Qa, C1137Qc>, C1135Qa>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.Qa, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final C1135Qa invoke(InterfaceC8890fJ<C1135Qa, C1137Qc> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C1137Qc.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a).c(this, e[0]);
    }

    public final InterfaceC1570aGe b() {
        InterfaceC1570aGe interfaceC1570aGe = this.imageLoaderCompose;
        if (interfaceC1570aGe != null) {
            return interfaceC1570aGe;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1135Qa d() {
        return (C1135Qa) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return C8151dev.f();
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ShareSheetFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    /* renamed from: e */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(562010695, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                e(composer, num.intValue());
                return dpR.c;
            }

            public final void e(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(562010695, i, -1, "com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment.onCreateView.<anonymous>.<anonymous> (ShareSheetFragment.kt:67)");
                    }
                    InterfaceC1571aGf a = ShareSheetFragment.this.b().a();
                    final ShareSheetFragment shareSheetFragment = ShareSheetFragment.this;
                    C1572aGg.b(a, ComposableLambdaKt.composableLambda(composer, 1886901464, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onCreateView$1$1.1
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                            e(composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void e(Composer composer2, int i2) {
                            C1135Qa d2;
                            boolean g;
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1886901464, i2, -1, "com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ShareSheetFragment.kt:68)");
                            }
                            d2 = ShareSheetFragment.this.d();
                            g = ShareSheetFragment.this.g();
                            final ShareSheetFragment shareSheetFragment2 = ShareSheetFragment.this;
                            PZ.e(d2, g, new drO<dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment.onCreateView.1.1.1.1
                                {
                                    super(0);
                                }

                                @Override // o.drO
                                public /* synthetic */ dpR invoke() {
                                    a();
                                    return dpR.c;
                                }

                                public final void a() {
                                    ShareSheetFragment.this.dismiss();
                                }
                            }, new AnonymousClass2(ShareSheetFragment.this), composer2, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* renamed from: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$onCreateView$1$1$1$2  reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements drM<PN, dpR> {
                            AnonymousClass2(Object obj) {
                                super(1, obj, ShareSheetFragment.class, "onShareTargetClick", "onShareTargetClick(Lcom/netflix/mediaclient/android/sharing/impl/ShareEvent;)V", 0);
                            }

                            public final void a(PN pn) {
                                C8632dsu.c((Object) pn, "");
                                ((ShareSheetFragment) this.receiver).b(pn);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(PN pn) {
                                a(pn);
                                return dpR.c;
                            }
                        }
                    }), composer, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(PN pn) {
        C8980gu.c(d(), new ShareSheetFragment$onShareTargetClick$1(this, pn));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareEnded c(Long l, ShareInfo[] shareInfoArr) {
        if (l == null) {
            return null;
        }
        Session session = Logger.INSTANCE.getSession(l);
        if (session instanceof Share) {
            return new ShareEnded((Share) session, shareInfoArr);
        }
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Logger logger = Logger.INSTANCE;
        if (logger.getSession(this.a) != null) {
            logger.cancelSession(this.a);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(d(), new drM<C1137Qc, Boolean>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C1137Qc c1137Qc) {
                boolean z;
                C8632dsu.c((Object) c1137Qc, "");
                AbstractC8918fl<List<QI<Parcelable>>> e2 = c1137Qc.e();
                if ((e2 instanceof C8974go) || (e2 instanceof C8932fz)) {
                    z = true;
                } else if (!(e2 instanceof C8971gl) && !(e2 instanceof C8927fu)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }
}
