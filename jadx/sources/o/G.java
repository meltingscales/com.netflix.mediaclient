package o;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$2;
import com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$3;
import o.C8632dsu;
import o.G;
import o.L;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final class G {
    private static final ProvidableCompositionLocal<OnBackPressedDispatcherOwner> a = CompositionLocalKt.staticCompositionLocalOf(new drO<OnBackPressedDispatcherOwner>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$LocalBackPressedDispatcher$1
        @Override // o.drO
        /* renamed from: c */
        public final OnBackPressedDispatcherOwner invoke() {
            return null;
        }
    });

    public static final void e(final boolean z, final drO<dpR> dro, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-876255588);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(dro) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876255588, i3, -1, "com.airbnb.android.showkase.ui.handler (BackButtonHandler.kt:29)");
            }
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) startRestartGroup.consume(a);
            if (onBackPressedDispatcherOwner == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$dispatcher$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(Composer composer2, int i5) {
                        G.e(z, dro, composer2, i | 1, i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        b(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            C8632dsu.a(onBackPressedDispatcher, "");
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new L(z);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final L l = (L) rememberedValue;
            EffectsKt.DisposableEffect(onBackPressedDispatcher, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    C8632dsu.c((Object) disposableEffectScope, "");
                    OnBackPressedDispatcher.this.addCallback(l);
                    return new d(l);
                }

                /* loaded from: classes5.dex */
                public static final class d implements DisposableEffectResult {
                    final /* synthetic */ L d;

                    public d(L l) {
                        this.d = l;
                    }

                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.d.remove();
                    }
                }
            }, startRestartGroup, 8);
            EffectsKt.LaunchedEffect(Boolean.valueOf(z), new BackButtonHandlerKt$handler$2(l, z, null), startRestartGroup, (i3 & 14) | 64);
            EffectsKt.LaunchedEffect(dro, new BackButtonHandlerKt$handler$3(l, dro, null), startRestartGroup, ((i3 >> 3) & 14) | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void c(Composer composer2, int i5) {
                G.e(z, dro, composer2, i | 1, i2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final void b(final drO<dpR> dro, Composer composer, final int i) {
        final int i2;
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-1799539737);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(dro) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1799539737, i2, -1, "com.airbnb.android.showkase.ui.BackButtonHandler (BackButtonHandler.kt:49)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while ((context instanceof ContextWrapper) && !(context instanceof OnBackPressedDispatcherOwner)) {
                context = ((ContextWrapper) context).getBaseContext();
                C8632dsu.a(context, "");
            }
            ProvidableCompositionLocal<OnBackPressedDispatcherOwner> providableCompositionLocal = a;
            C8632dsu.d(context);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides((ComponentActivity) context)}, ComposableLambdaKt.composableLambda(startRestartGroup, -955225945, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$BackButtonHandler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }

                public final void c(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-955225945, i3, -1, "com.airbnb.android.showkase.ui.BackButtonHandler.<anonymous> (BackButtonHandler.kt:66)");
                    }
                    final drO<dpR> dro2 = dro;
                    composer2.startReplaceableGroup(1157296644);
                    boolean changed = composer2.changed(dro2);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$BackButtonHandler$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                c();
                                return dpR.c;
                            }

                            public final void c() {
                                dro2.invoke();
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    G.e(false, (drO) rememberedValue, composer2, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$BackButtonHandler$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void e(Composer composer2, int i3) {
                G.b(dro, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                e(composer2, num.intValue());
                return dpR.c;
            }
        });
    }
}
