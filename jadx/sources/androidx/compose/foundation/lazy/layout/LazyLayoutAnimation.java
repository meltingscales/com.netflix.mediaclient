package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import o.C8626dso;
import o.C8627dsp;
import o.C8737dwr;
import o.dpR;
import o.drM;
import o.dwU;

/* loaded from: classes.dex */
public final class LazyLayoutAnimation {
    private FiniteAnimationSpec<Float> appearanceSpec;
    private final dwU coroutineScope;
    private final MutableState isAppearanceAnimationInProgress$delegate;
    private final MutableState isPlacementAnimationInProgress$delegate;
    private final drM<GraphicsLayerScope, dpR> layerBlock;
    private long lookaheadOffset;
    private final MutableState placementDelta$delegate;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;
    private final MutableFloatState visibility$delegate;
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    public final drM<GraphicsLayerScope, dpR> getLayerBlock() {
        return this.layerBlock;
    }

    /* renamed from: getLookaheadOffset-nOcc-ac  reason: not valid java name */
    public final long m361getLookaheadOffsetnOccac() {
        return this.lookaheadOffset;
    }

    /* renamed from: getRawOffset-nOcc-ac  reason: not valid java name */
    public final long m363getRawOffsetnOccac() {
        return this.rawOffset;
    }

    public final void setAppearanceSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.appearanceSpec = finiteAnimationSpec;
    }

    /* renamed from: setLookaheadOffset--gyyYBs  reason: not valid java name */
    public final void m364setLookaheadOffsetgyyYBs(long j) {
        this.lookaheadOffset = j;
    }

    public final void setPlacementSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs  reason: not valid java name */
    public final void m365setRawOffsetgyyYBs(long j) {
        this.rawOffset = j;
    }

    public LazyLayoutAnimation(dwU dwu) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.coroutineScope = dwu;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isPlacementAnimationInProgress$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress$delegate = mutableStateOf$default2;
        long j = NotInitialized;
        this.rawOffset = j;
        IntOffset.Companion companion = IntOffset.Companion;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m2525boximpl(companion.m2538getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(C8626dso.e), null, null, 12, null);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m2525boximpl(companion.m2538getZeronOccac()), null, 2, null);
        this.placementDelta$delegate = mutableStateOf$default3;
        this.visibility$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
        this.layerBlock = new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$layerBlock$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setAlpha(LazyLayoutAnimation.this.getVisibility());
            }
        };
        this.lookaheadOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs  reason: not valid java name */
    public final void m359setPlacementDeltagyyYBs(long j) {
        this.placementDelta$delegate.setValue(IntOffset.m2525boximpl(j));
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            C8737dwr.c(this.coroutineScope, null, null, new LazyLayoutAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    /* renamed from: animatePlacementDelta--gyyYBs  reason: not valid java name */
    public final void m360animatePlacementDeltagyyYBs(long j) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long m362getPlacementDeltanOccac = m362getPlacementDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m362getPlacementDeltanOccac) - IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(m362getPlacementDeltanOccac) - IntOffset.m2534getYimpl(j));
        m359setPlacementDeltagyyYBs(IntOffset);
        setPlacementAnimationInProgress(true);
        C8737dwr.c(this.coroutineScope, null, null, new LazyLayoutAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, IntOffset, null), 3, null);
    }

    public final void animateAppearance() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.appearanceSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setAppearanceAnimationInProgress(true);
        setVisibility(0.0f);
        C8737dwr.c(this.coroutineScope, null, null, new LazyLayoutAnimation$animateAppearance$1(this, finiteAnimationSpec, null), 3, null);
    }

    public final void stopAnimations() {
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            C8737dwr.c(this.coroutineScope, null, null, new LazyLayoutAnimation$stopAnimations$1(this, null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            C8737dwr.c(this.coroutineScope, null, null, new LazyLayoutAnimation$stopAnimations$2(this, null), 3, null);
        }
        m359setPlacementDeltagyyYBs(IntOffset.Companion.m2538getZeronOccac());
        this.rawOffset = NotInitialized;
        setVisibility(1.0f);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNotInitialized-nOcc-ac  reason: not valid java name */
        public final long m366getNotInitializednOccac() {
            return LazyLayoutAnimation.NotInitialized;
        }
    }

    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z) {
        this.isPlacementAnimationInProgress$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z) {
        this.isAppearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getPlacementDelta-nOcc-ac  reason: not valid java name */
    public final long m362getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m2537unboximpl();
    }

    public final float getVisibility() {
        return this.visibility$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisibility(float f) {
        this.visibility$delegate.setFloatValue(f);
    }
}
