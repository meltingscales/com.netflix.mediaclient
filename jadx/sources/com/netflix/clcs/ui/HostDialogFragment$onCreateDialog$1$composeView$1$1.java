package com.netflix.clcs.ui;

import android.content.Context;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import com.netflix.hawkins.consumer.tokens.Theme;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import o.C0884Gh;
import o.C0897Gu;
import o.C1572aGg;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.FD;
import o.FX;
import o.InterfaceC1571aGf;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class HostDialogFragment$onCreateDialog$1$composeView$1$1 extends Lambda implements drX<Composer, Integer, dpR> {
    final /* synthetic */ C0897Gu d;
    final /* synthetic */ InterstitialCoordinator e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostDialogFragment$onCreateDialog$1$composeView$1$1(C0897Gu c0897Gu, InterstitialCoordinator interstitialCoordinator) {
        super(2);
        this.d = c0897Gu;
        this.e = interstitialCoordinator;
    }

    @Override // o.drX
    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
        a(composer, num.intValue());
        return dpR.c;
    }

    public final void a(Composer composer, int i) {
        InterfaceC8812dzl interfaceC8812dzl;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(282462047, i, -1, "com.netflix.clcs.ui.HostDialogFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (HostDialogFragment.kt:94)");
            }
            interfaceC8812dzl = this.d.e;
            final State collectAsState = SnapshotStateKt.collectAsState(interfaceC8812dzl, null, composer, 8, 1);
            InterfaceC1571aGf c = this.e.c((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            final InterstitialCoordinator interstitialCoordinator = this.e;
            final C0897Gu c0897Gu = this.d;
            C1572aGg.b(c, ComposableLambdaKt.composableLambda(composer, -1451941968, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.HostDialogFragment$onCreateDialog$1$composeView$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }

                public final void d(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1451941968, i2, -1, "com.netflix.clcs.ui.HostDialogFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HostDialogFragment.kt:100)");
                        }
                        FX e = HostDialogFragment$onCreateDialog$1$composeView$1$1.e(collectAsState);
                        Modifier testTag = TestTagKt.testTag(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion))), "clcs_host_dialog");
                        final InterstitialCoordinator interstitialCoordinator2 = interstitialCoordinator;
                        final State<FX> state = collectAsState;
                        final C0897Gu c0897Gu2 = c0897Gu;
                        CrossfadeKt.Crossfade(e, testTag, (FiniteAnimationSpec<Float>) null, "clcs_screen_crossfade", ComposableLambdaKt.composableLambda(composer2, 979264777, true, new InterfaceC8612dsa<FX, Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.HostDialogFragment.onCreateDialog.1.composeView.1.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // o.InterfaceC8612dsa
                            public /* synthetic */ dpR invoke(FX fx, Composer composer3, Integer num) {
                                b(fx, composer3, num.intValue());
                                return dpR.c;
                            }

                            public final void b(FX fx, Composer composer3, int i3) {
                                FX.b e2;
                                FX.b e3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(979264777, i3, -1, "com.netflix.clcs.ui.HostDialogFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HostDialogFragment.kt:109)");
                                }
                                String str = null;
                                FD a = (fx == null || (e3 = fx.e()) == null) ? null : e3.a();
                                if (a != null) {
                                    InterstitialCoordinator interstitialCoordinator3 = InterstitialCoordinator.this;
                                    final State<FX> state2 = state;
                                    final C0897Gu c0897Gu3 = c0897Gu2;
                                    Theme f = fx.f();
                                    FX e4 = HostDialogFragment$onCreateDialog$1$composeView$1$1.e(state2);
                                    if (e4 != null && (e2 = e4.e()) != null) {
                                        str = e2.b();
                                    }
                                    C0884Gh.b(a, f, str, interstitialCoordinator3, null, composer3, 4096, 16);
                                    EffectsKt.DisposableEffect(dpR.c, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: com.netflix.clcs.ui.HostDialogFragment$onCreateDialog$1$composeView$1$1$1$1$1$1
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* loaded from: classes2.dex */
                                        public static final class e implements DisposableEffectResult {
                                            final /* synthetic */ C0897Gu b;
                                            final /* synthetic */ State c;

                                            public e(C0897Gu c0897Gu, State state) {
                                                this.b = c0897Gu;
                                                this.c = state;
                                            }

                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                FX e;
                                                if (HostDialogFragment$onCreateDialog$1$composeView$1$1.e(this.c) == null || !((e = HostDialogFragment$onCreateDialog$1$composeView$1$1.e(this.c)) == null || C0897Gu.a.d(e))) {
                                                    this.b.dismissAllowingStateLoss();
                                                }
                                            }
                                        }

                                        @Override // o.drM
                                        /* renamed from: a */
                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                            C8632dsu.c((Object) disposableEffectScope, "");
                                            return new e(C0897Gu.this, state2);
                                        }
                                    }, composer3, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 27656, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composer, 56);
            EffectsKt.LaunchedEffect(dpR.c, new AnonymousClass2(this.d, this.e, null), composer, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.clcs.ui.HostDialogFragment$onCreateDialog$1$composeView$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ InterstitialCoordinator a;
        final /* synthetic */ C0897Gu d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C0897Gu c0897Gu, InterstitialCoordinator interstitialCoordinator, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = c0897Gu;
            this.a = interstitialCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.d, this.a, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC8812dzl interfaceC8812dzl;
            C8586drb.e();
            if (this.e == 0) {
                C8556dpz.d(obj);
                interfaceC8812dzl = this.d.e;
                interfaceC8812dzl.d(this.a.a());
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FX e(State<FX> state) {
        return state.getValue();
    }
}
