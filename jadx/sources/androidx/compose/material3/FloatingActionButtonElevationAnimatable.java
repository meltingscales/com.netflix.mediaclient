package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import o.C8586drb;
import o.C8627dsp;
import o.InterfaceC8585dra;
import o.dpR;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable {
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;
    private Interaction lastTargetInteraction;
    private float pressedElevation;
    private Interaction targetInteraction;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable<>(Dp.m2490boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    /* renamed from: calculateTarget-u2uoSUM  reason: not valid java name */
    private final float m788calculateTargetu2uoSUM(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    /* renamed from: updateElevation-lDy3nrA  reason: not valid java name */
    public final Object m789updateElevationlDy3nrA(float f, float f2, float f3, float f4, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        Object snapElevation = snapElevation(interfaceC8585dra);
        e = C8586drb.e();
        return snapElevation == e ? snapElevation : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object snapElevation(o.InterfaceC8585dra<? super o.dpR> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r0
            o.C8556dpz.d(r5)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            o.C8556dpz.d(r5)
            androidx.compose.foundation.interaction.Interaction r5 = r4.targetInteraction
            float r5 = r4.m788calculateTargetu2uoSUM(r5)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r4.animatable
            java.lang.Object r2 = r2.getTargetValue()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2
            float r2 = r2.m2498unboximpl()
            boolean r2 = androidx.compose.ui.unit.Dp.m2494equalsimpl0(r2, r5)
            if (r2 != 0) goto L70
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r4.animatable     // Catch: java.lang.Throwable -> L69
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.m2490boximpl(r5)     // Catch: java.lang.Throwable -> L69
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L69
            r0.label = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r2.snapTo(r5, r0)     // Catch: java.lang.Throwable -> L69
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
        L64:
            androidx.compose.foundation.interaction.Interaction r5 = r0.targetInteraction
            r0.lastTargetInteraction = r5
            goto L70
        L69:
            r5 = move-exception
            r0 = r4
        L6b:
            androidx.compose.foundation.interaction.Interaction r1 = r0.targetInteraction
            r0.lastTargetInteraction = r1
            throw r5
        L70:
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.snapElevation(o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateElevation(androidx.compose.foundation.interaction.Interaction r6, o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r0
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L31
            goto L68
        L31:
            r7 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            o.C8556dpz.d(r7)
            float r7 = r5.m788calculateTargetu2uoSUM(r6)
            r5.targetInteraction = r6
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r5.animatable     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.getTargetValue()     // Catch: java.lang.Throwable -> L6d
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2     // Catch: java.lang.Throwable -> L6d
            float r2 = r2.m2498unboximpl()     // Catch: java.lang.Throwable -> L6d
            boolean r2 = androidx.compose.ui.unit.Dp.m2494equalsimpl0(r2, r7)     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L67
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r5.animatable     // Catch: java.lang.Throwable -> L6d
            androidx.compose.foundation.interaction.Interaction r4 = r5.lastTargetInteraction     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6d
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = androidx.compose.material3.ElevationKt.m785animateElevationrAjV9yQ(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L6d
            if (r7 != r1) goto L67
            return r1
        L67:
            r0 = r5
        L68:
            r0.lastTargetInteraction = r6
            o.dpR r6 = o.dpR.c
            return r6
        L6d:
            r7 = move-exception
            r0 = r5
        L6f:
            r0.lastTargetInteraction = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.animateElevation(androidx.compose.foundation.interaction.Interaction, o.dra):java.lang.Object");
    }

    public final State<Dp> asState() {
        return this.animatable.asState();
    }
}
