package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import o.C8626dso;
import o.C8632dsu;
import o.C8634dsw;
import o.C8799dyz;
import o.InterfaceC8792dys;
import o.dpR;
import o.drM;
import o.drO;
import o.dyI;

/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m2490boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m1170boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m1126boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(C8634dsw.d)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m2525boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m2542boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    public static final State<Float> animateFloatAsState(float f, AnimationSpec<Float> animationSpec, float f2, String str, drM<? super Float, dpR> drm, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(668842840);
        AnimationSpec<Float> animationSpec2 = (i2 & 2) != 0 ? defaultAnimation : animationSpec;
        float f3 = (i2 & 4) != 0 ? 0.01f : f2;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        drM<? super Float, dpR> drm2 = (i2 & 16) != 0 ? null : drm;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        composer.startReplaceableGroup(841393662);
        if (animationSpec2 == defaultAnimation) {
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(Float.valueOf(f3));
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        }
        composer.endReplaceableGroup();
        int i3 = i << 3;
        State<Float> animateValueAsState = animateValueAsState(Float.valueOf(f), VectorConvertersKt.getVectorConverter(C8626dso.e), animationSpec2, Float.valueOf(f3), str2, drm2, composer, (i & 14) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateDpAsState-AjpBEmI  reason: not valid java name */
    public static final State<Dp> m53animateDpAsStateAjpBEmI(float f, AnimationSpec<Dp> animationSpec, String str, drM<? super Dp, dpR> drm, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1407150062);
        SpringSpec<Dp> springSpec = (i2 & 2) != 0 ? dpDefaultSpring : animationSpec;
        String str2 = (i2 & 4) != 0 ? "DpAnimation" : str;
        drM<? super Dp, dpR> drm2 = (i2 & 8) != 0 ? null : drm;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i3 = i << 6;
        State<Dp> animateValueAsState = animateValueAsState(Dp.m2490boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), springSpec, null, str2, drm2, composer, ((i << 3) & 896) | (i & 14) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t2, String str, drM<? super T, dpR> drm, Composer composer, int i, int i2) {
        AnimationSpec<T> animationSpec2;
        composer.startReplaceableGroup(-1994373980);
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        drM<? super T, dpR> drm2 = (i2 & 32) != 0 ? null : drm;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(drm2, composer, (i >> 15) & 14);
        if (t3 != null && (animationSpec2 instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec2;
            if (!C8632dsu.c(springSpec.getVisibilityThreshold(), t3)) {
                animationSpec2 = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t3);
            }
        }
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = C8799dyz.e(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        final InterfaceC8792dys interfaceC8792dys = (InterfaceC8792dys) rememberedValue4;
        EffectsKt.SideEffect(new drO<dpR>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                interfaceC8792dys.d((dyI) t);
            }
        }, composer, 0);
        EffectsKt.LaunchedEffect(interfaceC8792dys, new AnimateAsStateKt$animateValueAsState$3(interfaceC8792dys, animatable, rememberUpdatedState2, rememberUpdatedState, null), composer, 72);
        State<T> state = (State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> drM<T, dpR> animateValueAsState$lambda$4(State<? extends drM<? super T, dpR>> state) {
        return (drM) ((drM<? super T, dpR>) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }
}
