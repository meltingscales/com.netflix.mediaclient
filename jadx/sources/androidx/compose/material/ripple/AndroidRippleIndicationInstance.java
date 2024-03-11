package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;
import o.dsT;
import o.dwU;

/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final drO<dpR> onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;
    private final ViewGroup view;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, State state, State state2, ViewGroup viewGroup, C8627dsp c8627dsp) {
        this(z, f, state, state2, viewGroup);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    private AndroidRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2, ViewGroup viewGroup) {
        super(z, state2);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.rippleHostView$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.invalidateTick$delegate = mutableStateOf$default2;
        this.rippleSize = Size.Companion.m1182getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new drO<dpR>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                boolean invalidateTick;
                AndroidRippleIndicationInstance androidRippleIndicationInstance = AndroidRippleIndicationInstance.this;
                invalidateTick = androidRippleIndicationInstance.getInvalidateTick();
                androidRippleIndicationInstance.setInvalidateTick(!invalidateTick);
            }
        };
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        int mo187roundToPx0680j_4;
        this.rippleSize = contentDrawScope.mo1562getSizeNHjbRc();
        if (Float.isNaN(this.radius)) {
            mo187roundToPx0680j_4 = dsT.e(RippleAnimationKt.m704getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo1562getSizeNHjbRc()));
        } else {
            mo187roundToPx0680j_4 = contentDrawScope.mo187roundToPx0680j_4(this.radius);
        }
        this.rippleRadius = mo187roundToPx0680j_4;
        long m1302unboximpl = this.color.getValue().m1302unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m709drawStateLayerH2RKhps(contentDrawScope, this.radius, m1302unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m708updateRipplePropertiesbiQXAtU(contentDrawScope.mo1562getSizeNHjbRc(), this.rippleRadius, m1302unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, dwU dwu) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m707addRippleKOepWvA(press, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m1302unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    private final void dispose() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    public final void resetHostView() {
        setRippleHostView(null);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            C8632dsu.d(rippleContainer);
            return rippleContainer;
        }
        int childCount = this.view.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = this.view.getChildAt(i);
            if (childAt instanceof RippleContainer) {
                this.rippleContainer = (RippleContainer) childAt;
                break;
            }
            i++;
        }
        if (this.rippleContainer == null) {
            RippleContainer rippleContainer2 = new RippleContainer(this.view.getContext());
            this.view.addView(rippleContainer2);
            this.rippleContainer = rippleContainer2;
        }
        RippleContainer rippleContainer3 = this.rippleContainer;
        C8632dsu.d(rippleContainer3);
        return rippleContainer3;
    }

    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z));
    }
}
