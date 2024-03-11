package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate;
    private final Map<S, State<IntSize>> targetSizeMap;
    private final Transition<S> transition;

    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        MutableState mutableStateOf$default;
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m2542boximpl(IntSize.Companion.m2551getZeroYbymL2g()), null, 2, null);
        this.measuredSize$delegate = mutableStateOf$default;
        this.targetSizeMap = new LinkedHashMap();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release  reason: not valid java name */
    public final void m10setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize$delegate.setValue(IntSize.m2542boximpl(j));
    }

    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i) {
        Modifier modifier;
        composer.startReplaceableGroup(93755870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (C8632dsu.c(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            Transition.DeferredAnimation createDeferredAnimation = TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                rememberedValue2 = ((sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.Companion) : Modifier.Companion).then(new SizeModifier(createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    /* loaded from: classes.dex */
    public static final class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildData) && this.isTarget == ((ChildData) obj).isTarget;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTarget);
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            return this;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }

        public ChildData(boolean z) {
            this.isTarget = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public MeasureResult mo11measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = AnimatedContentTransitionScopeImpl.this;
            drM<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> drm = new drM<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<IntSize> invoke(Object obj) {
                    return invoke((Transition.Segment) ((Transition.Segment) obj));
                }

                public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                    FiniteAnimationSpec<IntSize> mo52createAnimationSpecTemP2vQ;
                    State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(segment.getInitialState());
                    long m2550unboximpl = state != null ? state.getValue().m2550unboximpl() : IntSize.Companion.m2551getZeroYbymL2g();
                    State<IntSize> state2 = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(segment.getTargetState());
                    long m2550unboximpl2 = state2 != null ? state2.getValue().m2550unboximpl() : IntSize.Companion.m2551getZeroYbymL2g();
                    SizeTransform value = this.getSizeTransform().getValue();
                    return (value == null || (mo52createAnimationSpecTemP2vQ = value.mo52createAnimationSpecTemP2vQ(m2550unboximpl, m2550unboximpl2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : mo52createAnimationSpecTemP2vQ;
                }
            };
            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = AnimatedContentTransitionScopeImpl.this;
            State<IntSize> animate = this.sizeAnimation.animate(drm, new drM<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // o.drM
                public /* synthetic */ IntSize invoke(Object obj) {
                    return IntSize.m2542boximpl(m12invokeYEO4UFw(obj));
                }

                /* renamed from: invoke-YEO4UFw  reason: not valid java name */
                public final long m12invokeYEO4UFw(S s) {
                    State<IntSize> state = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release().get(s);
                    return state != null ? state.getValue().m2550unboximpl() : IntSize.Companion.m2551getZeroYbymL2g();
                }
            });
            AnimatedContentTransitionScopeImpl.this.setAnimatedSize$animation_release(animate);
            final long mo1056alignKFBX0sM = AnimatedContentTransitionScopeImpl.this.getContentAlignment().mo1056alignKFBX0sM(IntSizeKt.IntSize(mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight()), animate.getValue().m2550unboximpl(), LayoutDirection.Ltr);
            return MeasureScope.layout$default(measureScope, IntSize.m2547getWidthimpl(animate.getValue().m2550unboximpl()), IntSize.m2546getHeightimpl(animate.getValue().m2550unboximpl()), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.m1827place70tqf50$default(placementScope, Placeable.this, mo1056alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
