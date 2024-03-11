package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import o.C8586drb;
import o.C8627dsp;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class DrawerState {
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private Density density;

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final void setDensity$material_release(Density density) {
        this.density = density;
    }

    public DrawerState(DrawerValue drawerValue, drM<? super DrawerValue, Boolean> drm) {
        TweenSpec tweenSpec;
        tweenSpec = DrawerKt.AnimationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new drM<Float, Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final Float invoke(float f) {
                Density requireDensity;
                float f2;
                requireDensity = DrawerState.this.requireDensity();
                f2 = DrawerKt.DrawerPositionalThreshold;
                return Float.valueOf(requireDensity.mo193toPx0680j_4(f2));
            }

            @Override // o.drM
            public /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }, new drO<Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Float invoke() {
                Density requireDensity;
                float f;
                requireDensity = DrawerState.this.requireDensity();
                f = DrawerKt.DrawerVelocityThreshold;
                return Float.valueOf(requireDensity.mo193toPx0680j_4(f));
            }
        }, tweenSpec, drm);
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Object close(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return animateTo$default == e ? animateTo$default : dpR.c;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<DrawerState, DrawerValue> Saver(final drM<? super DrawerValue, Boolean> drm) {
            return SaverKt.Saver(new drX<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // o.drX
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new drM<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, drm);
                }
            });
        }
    }
}
