package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import o.C8569dql;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List<EdgeEffect> allEffects;
    private final EdgeEffect bottomEffect;
    private final EdgeEffect bottomEffectNegation;
    private int consumeCount;
    private long containerSize;
    private final Modifier effectModifier;
    private final MutableIntState invalidateCount$delegate;
    private boolean invalidationEnabled;
    private final EdgeEffect leftEffect;
    private final EdgeEffect leftEffectNegation;
    private final drM<IntSize, dpR> onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final EdgeEffect rightEffect;
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final EdgeEffect topEffect;
    private final EdgeEffect topEffectNegation;

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        List<EdgeEffect> j;
        Modifier modifier;
        this.overscrollConfig = overscrollConfiguration;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.rightEffect = create4;
        j = C8569dql.j(create3, create, create4, create2);
        this.allEffects = j;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            j.get(i).setColor(ColorKt.m1317toArgb8_81llA(this.overscrollConfig.m147getGlowColor0d7_KjU()));
        }
        this.consumeCount = -1;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m1182getZeroNHjbRc();
        drM<IntSize, dpR> drm = new drM<IntSize, dpR>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(IntSize intSize) {
                m106invokeozmzZPI(intSize.m2550unboximpl());
                return dpR.c;
            }

            /* renamed from: invoke-ozmzZPI  reason: not valid java name */
            public final void m106invokeozmzZPI(long j2) {
                long j3;
                EdgeEffect edgeEffect;
                EdgeEffect edgeEffect2;
                EdgeEffect edgeEffect3;
                EdgeEffect edgeEffect4;
                EdgeEffect edgeEffect5;
                EdgeEffect edgeEffect6;
                EdgeEffect edgeEffect7;
                EdgeEffect edgeEffect8;
                long m2553toSizeozmzZPI = IntSizeKt.m2553toSizeozmzZPI(j2);
                j3 = AndroidEdgeEffectOverscrollEffect.this.containerSize;
                boolean z = !Size.m1173equalsimpl0(m2553toSizeozmzZPI, j3);
                AndroidEdgeEffectOverscrollEffect.this.containerSize = IntSizeKt.m2553toSizeozmzZPI(j2);
                if (z) {
                    edgeEffect = AndroidEdgeEffectOverscrollEffect.this.topEffect;
                    edgeEffect.setSize(IntSize.m2547getWidthimpl(j2), IntSize.m2546getHeightimpl(j2));
                    edgeEffect2 = AndroidEdgeEffectOverscrollEffect.this.bottomEffect;
                    edgeEffect2.setSize(IntSize.m2547getWidthimpl(j2), IntSize.m2546getHeightimpl(j2));
                    edgeEffect3 = AndroidEdgeEffectOverscrollEffect.this.leftEffect;
                    edgeEffect3.setSize(IntSize.m2546getHeightimpl(j2), IntSize.m2547getWidthimpl(j2));
                    edgeEffect4 = AndroidEdgeEffectOverscrollEffect.this.rightEffect;
                    edgeEffect4.setSize(IntSize.m2546getHeightimpl(j2), IntSize.m2547getWidthimpl(j2));
                    edgeEffect5 = AndroidEdgeEffectOverscrollEffect.this.topEffectNegation;
                    edgeEffect5.setSize(IntSize.m2547getWidthimpl(j2), IntSize.m2546getHeightimpl(j2));
                    edgeEffect6 = AndroidEdgeEffectOverscrollEffect.this.bottomEffectNegation;
                    edgeEffect6.setSize(IntSize.m2547getWidthimpl(j2), IntSize.m2546getHeightimpl(j2));
                    edgeEffect7 = AndroidEdgeEffectOverscrollEffect.this.leftEffectNegation;
                    edgeEffect7.setSize(IntSize.m2546getHeightimpl(j2), IntSize.m2547getWidthimpl(j2));
                    edgeEffect8 = AndroidEdgeEffectOverscrollEffect.this.rightEffectNegation;
                    edgeEffect8.setSize(IntSize.m2546getHeightimpl(j2), IntSize.m2547getWidthimpl(j2));
                }
                if (z) {
                    AndroidEdgeEffectOverscrollEffect.this.invalidateOverscroll();
                    AndroidEdgeEffectOverscrollEffect.this.animateToRelease();
                }
            }
        };
        this.onNewSize = drm;
        Modifier.Companion companion = Modifier.Companion;
        modifier = AndroidOverscroll_androidKt.StretchOverscrollNonClippingLayer;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(companion.then(modifier), dpR.c, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), drm).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(AndroidEdgeEffectOverscrollEffect.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
        if (r6 == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143 A[ADDED_TO_REGION] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo105applyToScrollRhakbz0(long r18, int r20, o.drM<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r21) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo105applyToScrollRhakbz0(long, int, o.drM):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo104applyToFlingBMRW4eQ(long r11, o.drX<? super androidx.compose.ui.unit.Velocity, ? super o.InterfaceC8585dra<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r13, o.InterfaceC8585dra<? super o.dpR> r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo104applyToFlingBMRW4eQ(long, o.drX, o.dra):java.lang.Object");
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long m1183getCenteruvyYCjk = SizeKt.m1183getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m100pullLeft0a9Yr6o(Offset.Companion.m1149getZeroF1C5BW0(), m1183getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) != 0.0f) {
            m101pullRight0a9Yr6o(Offset.Companion.m1149getZeroF1C5BW0(), m1183getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
            m102pullTop0a9Yr6o(Offset.Companion.m1149getZeroF1C5BW0(), m1183getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m99pullBottom0a9Yr6o(Offset.Companion.m1149getZeroF1C5BW0(), m1183getCenteruvyYCjk);
        return true;
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean z;
        if (Size.m1178isEmptyimpl(this.containerSize)) {
            return;
        }
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.consumeCount = getInvalidateCount();
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        boolean z2 = false;
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z = drawRight(drawScope, this.rightEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (drawBottom(drawScope, this.bottomEffect, nativeCanvas) || z) {
                z2 = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            z = z2;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1174getHeightimpl(this.containerSize), drawScope.mo193toPx0680j_4(this.overscrollConfig.getDrawPadding().mo249calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo193toPx0680j_4(this.overscrollConfig.getDrawPadding().mo251calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int e;
        int save = canvas.save();
        e = dsT.e(Size.m1176getWidthimpl(this.containerSize));
        float mo250calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo250calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-e) + drawScope.mo193toPx0680j_4(mo250calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1176getWidthimpl(this.containerSize), (-Size.m1174getHeightimpl(this.containerSize)) + drawScope.mo193toPx0680j_4(this.overscrollConfig.getDrawPadding().mo248calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled && this.consumeCount == getInvalidateCount()) {
            setInvalidateCount(getInvalidateCount() + 1);
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M  reason: not valid java name */
    private final boolean m103releaseOppositeOverscrollk4lQ0M(long j) {
        boolean z;
        if (this.leftEffect.isFinished() || Offset.m1137getXimpl(j) >= 0.0f) {
            z = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m1137getXimpl(j));
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1137getXimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m1137getXimpl(j));
            z = z || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1138getYimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m1138getYimpl(j));
            z = z || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1138getYimpl(j) <= 0.0f) {
            return z;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m1138getYimpl(j));
        return z || this.bottomEffect.isFinished();
    }

    /* renamed from: pullTop-0a9Yr6o  reason: not valid java name */
    private final float m102pullTop0a9Yr6o(long j, long j2) {
        float m1137getXimpl = Offset.m1137getXimpl(j2) / Size.m1176getWidthimpl(this.containerSize);
        float m1138getYimpl = Offset.m1138getYimpl(j) / Size.m1174getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(this.topEffect, m1138getYimpl, m1137getXimpl) * Size.m1174getHeightimpl(this.containerSize) : Offset.m1138getYimpl(j);
    }

    /* renamed from: pullBottom-0a9Yr6o  reason: not valid java name */
    private final float m99pullBottom0a9Yr6o(long j, long j2) {
        float m1137getXimpl = Offset.m1137getXimpl(j2) / Size.m1176getWidthimpl(this.containerSize);
        float m1138getYimpl = Offset.m1138getYimpl(j) / Size.m1174getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -m1138getYimpl, 1 - m1137getXimpl)) * Size.m1174getHeightimpl(this.containerSize) : Offset.m1138getYimpl(j);
    }

    /* renamed from: pullLeft-0a9Yr6o  reason: not valid java name */
    private final float m100pullLeft0a9Yr6o(long j, long j2) {
        float m1138getYimpl = Offset.m1138getYimpl(j2) / Size.m1174getHeightimpl(this.containerSize);
        float m1137getXimpl = Offset.m1137getXimpl(j) / Size.m1176getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(this.leftEffect, m1137getXimpl, 1 - m1138getYimpl) * Size.m1176getWidthimpl(this.containerSize) : Offset.m1137getXimpl(j);
    }

    /* renamed from: pullRight-0a9Yr6o  reason: not valid java name */
    private final float m101pullRight0a9Yr6o(long j, long j2) {
        float m1138getYimpl = Offset.m1138getYimpl(j2) / Size.m1174getHeightimpl(this.containerSize);
        float m1137getXimpl = Offset.m1137getXimpl(j) / Size.m1176getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -m1137getXimpl, m1138getYimpl)) * Size.m1176getWidthimpl(this.containerSize) : Offset.m1137getXimpl(j);
    }

    private final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    private final void setInvalidateCount(int i) {
        this.invalidateCount$delegate.setIntValue(i);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }
}
