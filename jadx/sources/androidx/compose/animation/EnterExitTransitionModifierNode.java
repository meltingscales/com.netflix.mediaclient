package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment currentAlignment;
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private boolean lookaheadConstraintsAvailable;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
            FiniteAnimationSpec<IntSize> finiteAnimationSpec;
            SpringSpec springSpec;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                ChangeSize changeSize = EnterExitTransitionModifierNode.this.getEnter().getData$animation_release().getChangeSize();
                if (changeSize != null) {
                    finiteAnimationSpec = changeSize.getAnimationSpec();
                }
                finiteAnimationSpec = null;
            } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                ChangeSize changeSize2 = EnterExitTransitionModifierNode.this.getExit().getData$animation_release().getChangeSize();
                if (changeSize2 != null) {
                    finiteAnimationSpec = changeSize2.getAnimationSpec();
                }
                finiteAnimationSpec = null;
            } else {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            }
            if (finiteAnimationSpec == null) {
                springSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                return springSpec;
            }
            return finiteAnimationSpec;
        }
    };
    private final drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec = new drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
            SpringSpec springSpec;
            SpringSpec springSpec2;
            FiniteAnimationSpec<IntOffset> animationSpec;
            SpringSpec springSpec3;
            FiniteAnimationSpec<IntOffset> animationSpec2;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                Slide slide = EnterExitTransitionModifierNode.this.getEnter().getData$animation_release().getSlide();
                if (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) {
                    springSpec3 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                    return springSpec3;
                }
                return animationSpec2;
            } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                Slide slide2 = EnterExitTransitionModifierNode.this.getExit().getData$animation_release().getSlide();
                if (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) {
                    springSpec2 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                    return springSpec2;
                }
                return animationSpec;
            } else {
                springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
        }
    };

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: setLookaheadConstraints-BRTryo0  reason: not valid java name */
    private final void m36setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final Alignment getAlignment() {
        Alignment alignment;
        Alignment alignment2;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
        } else {
            ChangeSize changeSize3 = this.exit.getData$animation_release().getChangeSize();
            if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
                return alignment;
            }
            ChangeSize changeSize4 = this.enter.getData$animation_release().getChangeSize();
            if (changeSize4 != null) {
                return changeSize4.getAlignment();
            }
        }
        return null;
    }

    /* renamed from: sizeByState-Uzc_VyU  reason: not valid java name */
    public final long m38sizeByStateUzc_VyU(EnterExitState enterExitState, long j) {
        drM<IntSize, IntSize> size;
        drM<IntSize, IntSize> size2;
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
                return (changeSize == null || (size = changeSize.getSize()) == null) ? j : size.invoke(IntSize.m2542boximpl(j)).m2550unboximpl();
            } else if (i == 3) {
                ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
                return (changeSize2 == null || (size2 = changeSize2.getSize()) == null) ? j : size2.invoke(IntSize.m2542boximpl(j)).m2550unboximpl();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    /* renamed from: targetOffsetByState-oFUgxo0  reason: not valid java name */
    public final long m40targetOffsetByStateoFUgxo0(EnterExitState enterExitState, long j) {
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m2538getZeronOccac();
        }
        if (getAlignment() != null && !C8632dsu.c(this.currentAlignment, getAlignment())) {
            int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ChangeSize changeSize = this.exit.getData$animation_release().getChangeSize();
                        if (changeSize != null) {
                            long m2550unboximpl = changeSize.getSize().invoke(IntSize.m2542boximpl(j)).m2550unboximpl();
                            Alignment alignment = getAlignment();
                            C8632dsu.d(alignment);
                            LayoutDirection layoutDirection = LayoutDirection.Ltr;
                            long mo1056alignKFBX0sM = alignment.mo1056alignKFBX0sM(j, m2550unboximpl, layoutDirection);
                            Alignment alignment2 = this.currentAlignment;
                            C8632dsu.d(alignment2);
                            long mo1056alignKFBX0sM2 = alignment2.mo1056alignKFBX0sM(j, m2550unboximpl, layoutDirection);
                            return IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(mo1056alignKFBX0sM) - IntOffset.m2533getXimpl(mo1056alignKFBX0sM2), IntOffset.m2534getYimpl(mo1056alignKFBX0sM) - IntOffset.m2534getYimpl(mo1056alignKFBX0sM2));
                        }
                        return IntOffset.Companion.m2538getZeronOccac();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return IntOffset.Companion.m2538getZeronOccac();
            }
            return IntOffset.Companion.m2538getZeronOccac();
        }
        return IntOffset.Companion.m2538getZeronOccac();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m2538getZeronOccac;
        State<IntOffset> animate;
        State<IntOffset> animate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
            long IntSize = IntSizeKt.IntSize(mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight());
            this.lookaheadSize = IntSize;
            m36setLookaheadConstraintsBRTryo0(j);
            return MeasureScope.layout$default(measureScope, IntSize.m2547getWidthimpl(IntSize), IntSize.m2546getHeightimpl(IntSize), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final drM<GraphicsLayerScope, dpR> init = this.graphicsLayerBlock.init();
        final Placeable mo1803measureBRTryo02 = measurable.mo1803measureBRTryo0(j);
        long IntSize2 = IntSizeKt.IntSize(mo1803measureBRTryo02.getWidth(), mo1803measureBRTryo02.getHeight());
        final long j2 = AnimationModifierKt.m15isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : IntSize2;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        State<IntSize> animate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new drM<EnterExitState, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m2542boximpl(m41invokeYEO4UFw(enterExitState));
            }

            /* renamed from: invoke-YEO4UFw  reason: not valid java name */
            public final long m41invokeYEO4UFw(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.m38sizeByStateUzc_VyU(enterExitState, j2);
            }
        }) : null;
        if (animate3 != null) {
            IntSize2 = animate3.getValue().m2550unboximpl();
        }
        long m2483constrain4WqzIAM = ConstraintsKt.m2483constrain4WqzIAM(j, IntSize2);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        final long m2538getZeronOccac2 = (deferredAnimation2 == null || (animate2 = deferredAnimation2.animate(new drM<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // o.drM
            public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
        }, new drM<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m2525boximpl(m42invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4  reason: not valid java name */
            public final long m42invokeBjo55l4(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.m40targetOffsetByStateoFUgxo0(enterExitState, j2);
            }
        })) == null) ? IntOffset.Companion.m2538getZeronOccac() : animate2.getValue().m2537unboximpl();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        long m2538getZeronOccac3 = (deferredAnimation3 == null || (animate = deferredAnimation3.animate(this.slideSpec, new drM<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m2525boximpl(m43invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4  reason: not valid java name */
            public final long m43invokeBjo55l4(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.m39slideTargetValueByStateoFUgxo0(enterExitState, j2);
            }
        })) == null) ? IntOffset.Companion.m2538getZeronOccac() : animate.getValue().m2537unboximpl();
        Alignment alignment2 = this.currentAlignment;
        if (alignment2 != null) {
            m2538getZeronOccac = alignment2.mo1056alignKFBX0sM(j2, m2483constrain4WqzIAM, LayoutDirection.Ltr);
        } else {
            m2538getZeronOccac = IntOffset.Companion.m2538getZeronOccac();
        }
        final long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m2538getZeronOccac) + IntOffset.m2533getXimpl(m2538getZeronOccac3), IntOffset.m2534getYimpl(m2538getZeronOccac) + IntOffset.m2534getYimpl(m2538getZeronOccac3));
        return MeasureScope.layout$default(measureScope, IntSize.m2547getWidthimpl(m2483constrain4WqzIAM), IntSize.m2546getHeightimpl(m2483constrain4WqzIAM), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                Placeable placeable = Placeable.this;
                int m2533getXimpl = IntOffset.m2533getXimpl(IntOffset);
                int m2533getXimpl2 = IntOffset.m2533getXimpl(m2538getZeronOccac2);
                placementScope.placeWithLayer(placeable, m2533getXimpl2 + m2533getXimpl, IntOffset.m2534getYimpl(IntOffset) + IntOffset.m2534getYimpl(m2538getZeronOccac2), 0.0f, init);
            }
        }, 4, null);
    }

    /* renamed from: slideTargetValueByState-oFUgxo0  reason: not valid java name */
    public final long m39slideTargetValueByStateoFUgxo0(EnterExitState enterExitState, long j) {
        drM<IntSize, IntOffset> slideOffset;
        drM<IntSize, IntOffset> slideOffset2;
        Slide slide = this.enter.getData$animation_release().getSlide();
        long m2538getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.Companion.m2538getZeronOccac() : slideOffset2.invoke(IntSize.m2542boximpl(j)).m2537unboximpl();
        Slide slide2 = this.exit.getData$animation_release().getSlide();
        long m2538getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.Companion.m2538getZeronOccac() : slideOffset.invoke(IntSize.m2542boximpl(j)).m2537unboximpl();
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m2538getZeronOccac2;
                }
                throw new NoWhenBranchMatchedException();
            }
            return m2538getZeronOccac;
        }
        return IntOffset.Companion.m2538getZeronOccac();
    }
}
