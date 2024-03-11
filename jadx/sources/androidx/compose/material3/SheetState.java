package androidx.compose.material3;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import o.C8586drb;
import o.C8627dsp;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class SheetState {
    public static final Companion Companion = new Companion(null);
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private Density density;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.skipPartiallyExpanded;
    }

    public final void setDensity$material3_release(Density density) {
        this.density = density;
    }

    public SheetState(boolean z, SheetValue sheetValue, drM<? super SheetValue, Boolean> drm, boolean z2) {
        this.skipPartiallyExpanded = z;
        this.skipHiddenState = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new drM<Float, Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final Float invoke(float f) {
                Density requireDensity;
                requireDensity = SheetState.this.requireDensity();
                return Float.valueOf(requireDensity.mo193toPx0680j_4(Dp.m2492constructorimpl(56)));
            }

            @Override // o.drM
            public /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }, new drO<Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Float invoke() {
                Density requireDensity;
                requireDensity = SheetState.this.requireDensity();
                return Float.valueOf(requireDensity.mo193toPx0680j_4(Dp.m2492constructorimpl(125)));
            }
        }, AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), drm);
    }

    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, drM drm, boolean z2, int i, C8627dsp c8627dsp) {
        this(z, density, (i & 4) != 0 ? SheetValue.Hidden : sheetValue, (i & 8) != 0 ? new drM<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetState.2
            @Override // o.drM
            public final Boolean invoke(SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : drm, (i & 16) != 0 ? false : z2);
    }

    public SheetState(boolean z, Density density, SheetValue sheetValue, drM<? super SheetValue, Boolean> drm, boolean z2) {
        this(z, sheetValue, drm, z2);
        this.density = density;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    public final Object expand(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return animateTo$default == e ? animateTo$default : dpR.c;
    }

    public final Object partialExpand(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (!(!this.skipPartiallyExpanded)) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
        }
        Object animateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return animateTo$material3_release$default == e ? animateTo$material3_release$default : dpR.c;
    }

    public final Object show(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return animateTo$material3_release$default == e ? animateTo$material3_release$default : dpR.c;
    }

    public final Object hide(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        if (!(!this.skipHiddenState)) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
        }
        Object animateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return animateTo$material3_release$default == e ? animateTo$material3_release$default : dpR.c;
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 2) != 0) {
            f = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f, interfaceC8585dra);
    }

    public final Object animateTo$material3_release(SheetValue sheetValue, float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, f, interfaceC8585dra);
        e = C8586drb.e();
        return animateTo == e ? animateTo : dpR.c;
    }

    public final Object settle$material3_release(float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object obj = this.anchoredDraggableState.settle(f, interfaceC8585dra);
        e = C8586drb.e();
        return obj == e ? obj : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z, final drM<? super SheetValue, Boolean> drm, final Density density) {
            return SaverKt.Saver(new drX<SaverScope, SheetState, SheetValue>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // o.drX
                public final SheetValue invoke(SaverScope saverScope, SheetState sheetState) {
                    return sheetState.getCurrentValue();
                }
            }, new drM<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public final SheetState invoke(SheetValue sheetValue) {
                    return new SheetState(z, density, sheetValue, drm, false, 16, null);
                }
            });
        }
    }
}
