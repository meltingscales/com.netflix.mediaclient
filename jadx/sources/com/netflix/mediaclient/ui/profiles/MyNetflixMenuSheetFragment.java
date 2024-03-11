package com.netflix.mediaclient.ui.profiles;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AbstractC5897cMk;
import o.C1333Xq;
import o.C5855cKw;
import o.C5898cMl;
import o.C5905cMs;
import o.C8055ddE;
import o.C8632dsu;
import o.InterfaceC1898aSi;
import o.InterfaceC8612dsa;
import o.LA;
import o.cLS;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class MyNetflixMenuSheetFragment extends cLS {
    @Inject
    public Lazy<C5898cMl> myNetflixMenuHelper;

    public final Lazy<C5898cMl> b() {
        Lazy<C5898cMl> lazy = this.myNetflixMenuHelper;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC1898aSi B;
        C8632dsu.c((Object) layoutInflater, "");
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        final boolean z = requireNetflixActivity.showContactUsInSlidingMenu() && (B = requireNetflixActivity.getServiceManager().B()) != null && B.b();
        final drM<AbstractC5897cMk, dpR> drm = new drM<AbstractC5897cMk, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment$onCreateView$1$onRowClick$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5897cMk abstractC5897cMk) {
                b(abstractC5897cMk);
                return dpR.c;
            }

            public final void b(AbstractC5897cMk abstractC5897cMk) {
                C8632dsu.c((Object) abstractC5897cMk, "");
                if (C8632dsu.c(abstractC5897cMk, AbstractC5897cMk.c.e)) {
                    MyNetflixMenuSheetFragment.this.b().get().e();
                } else if (C8632dsu.c(abstractC5897cMk, AbstractC5897cMk.b.e)) {
                    MyNetflixMenuSheetFragment.this.b().get().d();
                } else if (C8632dsu.c(abstractC5897cMk, AbstractC5897cMk.d.b)) {
                    MyNetflixMenuSheetFragment.this.b().get().a();
                } else if (C8632dsu.c(abstractC5897cMk, AbstractC5897cMk.a.c)) {
                    MyNetflixMenuSheetFragment.this.b().get().c();
                } else if (C8632dsu.c(abstractC5897cMk, AbstractC5897cMk.e.a)) {
                    MyNetflixMenuSheetFragment.this.b().get().b();
                }
            }
        };
        final String c = C1333Xq.d(C5855cKw.i.Q).d("appVersion", C8055ddE.h(composeView.getContext())).c();
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1644848442, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return dpR.c;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment$onCreateView$1$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements drO<dpR> {
                AnonymousClass1(Object obj) {
                    super(0, obj, MyNetflixMenuSheetFragment.class, "dismiss", "dismiss()V", 0);
                }

                public final void d() {
                    ((MyNetflixMenuSheetFragment) this.receiver).dismiss();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }
            }

            public final void d(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1644848442, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment.onCreateView.<anonymous>.<anonymous> (MyNetflixMenuSheetFragment.kt:53)");
                    }
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(MyNetflixMenuSheetFragment.this);
                    long c2 = LA.c(Token.Color.C0509dq.c, composer, 6);
                    long c3 = LA.c(Token.Color.hC.b, composer, 6);
                    final String str = c;
                    final boolean z2 = z;
                    final drM<AbstractC5897cMk, dpR> drm2 = drm;
                    ModalBottomSheet_androidKt.m795ModalBottomSheetdYc4hso(anonymousClass1, null, null, 0.0f, null, c2, 0L, 0.0f, c3, null, null, null, ComposableLambdaKt.composableLambda(composer, -1396473129, true, new InterfaceC8612dsa<ColumnScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment$onCreateView$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            c(columnScope, composer2, num.intValue());
                            return dpR.c;
                        }

                        public final void c(ColumnScope columnScope, Composer composer2, int i2) {
                            C8632dsu.c((Object) columnScope, "");
                            if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1396473129, i2, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixMenuSheetFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MyNetflixMenuSheetFragment.kt:59)");
                                }
                                String str2 = str;
                                C8632dsu.a(str2, "");
                                C5905cMs.d(str2, z2, drm2, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composer, 805306368, 384, 3294);
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
}
