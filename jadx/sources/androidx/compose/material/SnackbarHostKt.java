package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.netflix.android.org.json.zip.JSONzip;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class SnackbarHostKt {

    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SnackbarHost(final SnackbarHostState snackbarHostState, Modifier modifier, InterfaceC8612dsa<? super SnackbarData, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? JSONzip.end : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                interfaceC8612dsa = ComposableSingletons$SnackbarHostKt.INSTANCE.m582getLambda1$material_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431012348, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)");
            }
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData, new SnackbarHostKt$SnackbarHost$1(currentSnackbarData, (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), startRestartGroup, 64);
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier, interfaceC8612dsa, startRestartGroup, (i3 & 112) | (i3 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final InterfaceC8612dsa<? super SnackbarData, ? super Composer, ? super Integer, dpR> interfaceC8612dsa2 = interfaceC8612dsa;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i6) {
                    SnackbarHostKt.SnackbarHost(SnackbarHostState.this, modifier2, interfaceC8612dsa2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[LOOP:2: B:73:0x01ba->B:74:0x01bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FadeInFadeOutWithScale(final androidx.compose.material.SnackbarData r16, androidx.compose.ui.Modifier r17, final o.InterfaceC8612dsa<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, o.dsa, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, drO<dpR> dro, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1016418159);
        if ((i2 & 4) != 0) {
            dro = new drO<dpR>() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }
            };
        }
        drO<dpR> dro2 = dro;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SnackbarHostKt$animatedOpacity$2(animatable, z, animationSpec, dro2, null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(2003504988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SnackbarHostKt$animatedScale$1(animatable, z, animationSpec, null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }
}
