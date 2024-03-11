package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.dwF;
import o.dwH;
import o.dwY;

/* loaded from: classes.dex */
public final class RippleAnimation {
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final dwF<dpR> finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;
    private Float targetRadius;

    public /* synthetic */ RippleAnimation(Offset offset, float f, boolean z, C8627dsp c8627dsp) {
        this(offset, f, z);
    }

    private RippleAnimation(Offset offset, float f, boolean z) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.origin = offset;
        this.radius = f;
        this.bounded = z;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = dwH.b(null);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishedFadingIn$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = mutableStateOf$default2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animate(o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            o.C8556dpz.d(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            o.C8556dpz.d(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            o.C8556dpz.d(r7)
            goto L56
        L47:
            o.C8556dpz.d(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            o.dwF<o.dpR> r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(o.dra):java.lang.Object");
    }

    private final Object fadeIn(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new RippleAnimation$fadeIn$2(this, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    private final Object fadeOut(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new RippleAnimation$fadeOut$2(this, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.a((dwF<dpR>) dpR.c);
    }

    /* renamed from: draw-4WTKRHQ  reason: not valid java name */
    public final void m703draw4WTKRHQ(DrawScope drawScope, long j) {
        Float valueOf;
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m705getRippleStartRadiusuvyYCjk(drawScope.mo1562getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            if (Float.isNaN(this.radius)) {
                valueOf = Float.valueOf(RippleAnimationKt.m704getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo1562getSizeNHjbRc()));
            } else {
                valueOf = Float.valueOf(drawScope.mo193toPx0680j_4(this.radius));
            }
            this.targetRadius = valueOf;
        }
        if (this.origin == null) {
            this.origin = Offset.m1126boximpl(drawScope.mo1561getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m1126boximpl(OffsetKt.Offset(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()) / 2.0f, Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()) / 2.0f));
        }
        float floatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f = this.startRadius;
        C8632dsu.d(f);
        float floatValue2 = f.floatValue();
        Float f2 = this.targetRadius;
        C8632dsu.d(f2);
        float lerp = MathHelpersKt.lerp(floatValue2, f2.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        C8632dsu.d(offset);
        float m1137getXimpl = Offset.m1137getXimpl(offset.m1146unboximpl());
        Offset offset2 = this.targetCenter;
        C8632dsu.d(offset2);
        float lerp2 = MathHelpersKt.lerp(m1137getXimpl, Offset.m1137getXimpl(offset2.m1146unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        C8632dsu.d(offset3);
        float m1138getYimpl = Offset.m1138getYimpl(offset3.m1146unboximpl());
        Offset offset4 = this.targetCenter;
        C8632dsu.d(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m1138getYimpl, Offset.m1138getYimpl(offset4.m1146unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m1292copywmQWz5c$default = Color.m1292copywmQWz5c$default(j, Color.m1295getAlphaimpl(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, m1292copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float m1176getWidthimpl = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc());
        float m1174getHeightimpl = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc());
        int m1283getIntersectrtfAjoo = ClipOp.Companion.m1283getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1541clipRectN_I0leg(0.0f, 0.0f, m1176getWidthimpl, m1174getHeightimpl, m1283getIntersectrtfAjoo);
        DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, m1292copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
        drawContext.getCanvas().restore();
        drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
    }

    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z));
    }

    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z));
    }
}
