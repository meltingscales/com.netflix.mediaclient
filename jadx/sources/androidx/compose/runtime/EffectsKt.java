package androidx.compose.runtime;

import java.util.Arrays;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;
import o.drX;
import o.dwG;
import o.dwU;
import o.dwY;
import o.dxD;
import o.dxG;
import o.dxK;

/* loaded from: classes.dex */
public final class EffectsKt {
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();

    public static final void SideEffect(drO<dpR> dro, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        composer.recordSideEffect(dro);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, drM<? super DisposableEffectScope, ? extends DisposableEffectResult> drm, Composer composer, int i) {
        composer.startReplaceableGroup(-1371986847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(drm));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void DisposableEffect(Object obj, Object obj2, drM<? super DisposableEffectScope, ? extends DisposableEffectResult> drm, Composer composer, int i) {
        composer.startReplaceableGroup(1429097729);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(drm));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, drM<? super DisposableEffectScope, ? extends DisposableEffectResult> drm, Composer composer, int i) {
        composer.startReplaceableGroup(-1239538271);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        boolean changed3 = composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(drm));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object obj, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        composer.startReplaceableGroup(1179185413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        dqZ applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, drx));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object obj, Object obj2, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        composer.startReplaceableGroup(590241125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        dqZ applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, drx));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        composer.startReplaceableGroup(-54093371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        dqZ applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        boolean changed3 = composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, drx));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void LaunchedEffect(Object[] objArr, drX<? super dwU, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        composer.startReplaceableGroup(-139560008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        dqZ applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, drx));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final dwU createCompositionCoroutineScope(dqZ dqz, Composer composer) {
        dwG c;
        dxD.c cVar = dxD.b;
        if (dqz.get(cVar) != null) {
            c = dxK.c(null, 1, null);
            c.c(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return dwY.c(c);
        }
        dqZ applyCoroutineContext = composer.getApplyCoroutineContext();
        return dwY.c(applyCoroutineContext.plus(dxG.a((dxD) applyCoroutineContext.get(cVar))).plus(dqz));
    }
}
