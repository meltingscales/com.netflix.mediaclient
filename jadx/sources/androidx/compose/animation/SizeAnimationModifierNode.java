package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private drX<? super IntSize, ? super IntSize, dpR> listener;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    /* renamed from: setLookaheadConstraints-BRTryo0  reason: not valid java name */
    private final void m47setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraints = j;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M  reason: not valid java name */
    private final long m48targetConstraintsZezNO4M(long j) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j;
    }

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final drX<IntSize, IntSize, dpR> getListener() {
        return this.listener;
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(drX<? super IntSize, ? super IntSize, dpR> drx) {
        this.listener = drx;
    }

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, drX<? super IntSize, ? super IntSize, dpR> drx) {
        MutableState mutableStateOf$default;
        this.animationSpec = animationSpec;
        this.listener = drx;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animData$delegate = mutableStateOf$default;
    }

    /* loaded from: classes.dex */
    public static final class AnimData {
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j, C8627dsp c8627dsp) {
            this(animatable, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnimData) {
                AnimData animData = (AnimData) obj;
                return C8632dsu.c(this.anim, animData.anim) && IntSize.m2545equalsimpl0(this.startSize, animData.startSize);
            }
            return false;
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g  reason: not valid java name */
        public final long m50getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m2548hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI  reason: not valid java name */
        public final void m51setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m2549toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0;
        if (measureScope.isLookingAhead()) {
            m47setLookaheadConstraintsBRTryo0(j);
            mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        } else {
            mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(m48targetConstraintsZezNO4M(j));
        }
        long IntSize = IntSizeKt.IntSize(mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight());
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = IntSize;
        } else {
            if (AnimationModifierKt.m15isValidozmzZPI(this.lookaheadSize)) {
                IntSize = this.lookaheadSize;
            }
            IntSize = ConstraintsKt.m2483constrain4WqzIAM(j, m49animateTomzRDjE0(IntSize));
        }
        return MeasureScope.layout$default(measureScope, IntSize.m2547getWidthimpl(IntSize), IntSize.m2546getHeightimpl(IntSize), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: animateTo-mzRDjE0  reason: not valid java name */
    public final long m49animateTomzRDjE0(long j) {
        AnimData animData = getAnimData();
        if (animData != null) {
            if (!IntSize.m2545equalsimpl0(j, animData.getAnim().getTargetValue().m2550unboximpl())) {
                animData.m51setStartSizeozmzZPI(animData.getAnim().getValue().m2550unboximpl());
                C8737dwr.c(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m2542boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m2542boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), j, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m2550unboximpl();
    }

    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }
}
