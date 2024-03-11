package com.netflix.mediaclient.ui.pauseads.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.netflix.mediaclient.ui.pauseads.api.PauseAdsUiModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.NotImplementedError;
import o.AbstractC7470cwn;
import o.C7473cwq;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1570aGe;
import o.InterfaceC7469cwm;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.drO;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class PauseAdsDialogFragment extends AbstractC7470cwn {
    private final InterfaceC8554dpx a;
    private InterfaceC7469cwm e;
    @Inject
    public InterfaceC1570aGe imageLoaderCompose;
    public static final e d = new e(null);
    public static final int c = 8;

    public PauseAdsDialogFragment() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<PauseAdsUiModel>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment$pauseAdsUiModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final PauseAdsUiModel invoke() {
                Parcelable parcelable = PauseAdsDialogFragment.this.requireArguments().getParcelable("pause_ads_ui_model");
                if (parcelable != null) {
                    C8632dsu.a(parcelable, "");
                    return (PauseAdsUiModel) parcelable;
                }
                throw new IllegalArgumentException("PauseAdsUiModel must be provided as an argument".toString());
            }
        });
        this.a = b;
    }

    public final InterfaceC1570aGe a() {
        InterfaceC1570aGe interfaceC1570aGe = this.imageLoaderCompose;
        if (interfaceC1570aGe != null) {
            return interfaceC1570aGe;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PauseAdsUiModel b() {
        return (PauseAdsUiModel) this.a.getValue();
    }

    @Override // o.AbstractC7470cwn, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        if (context instanceof InterfaceC7469cwm) {
            this.e = (InterfaceC7469cwm) context;
            return;
        }
        throw new NotImplementedError(context + " must implement PauseAdsEventListener");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1901235348, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return dpR.c;
            }

            public final void a(Composer composer, int i) {
                PauseAdsUiModel b;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901235348, i, -1, "com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment.onCreateView.<anonymous>.<anonymous> (PauseAdsDialogFragment.kt:42)");
                }
                b = PauseAdsDialogFragment.this.b();
                final PauseAdsDialogFragment pauseAdsDialogFragment = PauseAdsDialogFragment.this;
                C7473cwq.c(b, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment$onCreateView$1$1.1
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }

                    public final void b() {
                        InterfaceC7469cwm interfaceC7469cwm;
                        interfaceC7469cwm = PauseAdsDialogFragment.this.e;
                        if (interfaceC7469cwm == null) {
                            throw new IllegalArgumentException("Attempting to resume playback when pauseAdsEventListener is not set".toString());
                        }
                        interfaceC7469cwm.b();
                        PauseAdsDialogFragment.this.dismiss();
                    }
                }, PauseAdsDialogFragment.this.a(), null, composer, 520, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final PauseAdsDialogFragment b(PauseAdsUiModel pauseAdsUiModel) {
            C8632dsu.c((Object) pauseAdsUiModel, "");
            PauseAdsDialogFragment pauseAdsDialogFragment = new PauseAdsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("pause_ads_ui_model", pauseAdsUiModel);
            pauseAdsDialogFragment.setArguments(bundle);
            return pauseAdsDialogFragment;
        }
    }
}
