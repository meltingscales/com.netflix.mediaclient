package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8657dts;
import o.C8658dtt;
import o.InterfaceC8612dsa;
import o.InterfaceC8650dtl;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final Modifier IncreaseSemanticsBounds;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* renamed from: LinearProgressIndicator-_5eSR-E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m810LinearProgressIndicator_5eSRE(final o.drO<java.lang.Float> r18, androidx.compose.ui.Modifier r19, long r20, long r22, int r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m810LinearProgressIndicator_5eSRE(o.drO, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d2, code lost:
        if (r1.changed(r10) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* renamed from: LinearProgressIndicator-2cYBFYY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m808LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier r30, long r31, long r33, int r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m808LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    /* renamed from: LinearProgressIndicator-_5eSR-E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m809LinearProgressIndicator_5eSRE(final float r23, androidx.compose.ui.Modifier r24, long r25, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m809LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g  reason: not valid java name */
    public static final void m820drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        InterfaceC8650dtl e;
        Comparable b;
        Comparable b2;
        float m1176getWidthimpl = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc());
        float m1174getHeightimpl = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc());
        float f4 = 2;
        float f5 = m1174getHeightimpl / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * m1176getWidthimpl;
        float f7 = (z ? f2 : 1.0f - f) * m1176getWidthimpl;
        if (StrokeCap.m1444equalsimpl0(i, StrokeCap.Companion.m1448getButtKaPHkGw()) || m1174getHeightimpl > m1176getWidthimpl) {
            DrawScope.m1551drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        e = C8658dtt.e(f8, m1176getWidthimpl - f8);
        b = C8657dts.b(Float.valueOf(f6), e);
        float floatValue = ((Number) b).floatValue();
        b2 = C8657dts.b(Float.valueOf(f7), e);
        float floatValue2 = ((Number) b2).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m1551drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(floatValue, f5), OffsetKt.Offset(floatValue2, f5), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorTrack-AZGd3zU  reason: not valid java name */
    public static final void m821drawLinearIndicatorTrackAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m820drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /* renamed from: CircularProgressIndicator-DUhRLBM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m806CircularProgressIndicatorDUhRLBM(final o.drO<java.lang.Float> r27, androidx.compose.ui.Modifier r28, long r29, float r31, long r32, int r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m806CircularProgressIndicatorDUhRLBM(o.drO, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* renamed from: CircularProgressIndicator-LxG7B9w  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m807CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier r35, long r36, float r38, long r39, int r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m807CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* renamed from: CircularProgressIndicator-DUhRLBM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m805CircularProgressIndicatorDUhRLBM(final float r21, androidx.compose.ui.Modifier r22, long r23, float r25, long r26, int r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m805CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: drawCircularIndicator-42QJj7c  reason: not valid java name */
    private static final void m816drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m1176getWidthimpl = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()) - (f3 * width);
        DrawScope.m1546drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), SizeKt.Size(m1176getWidthimpl, m1176getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorTrack-bw27NRU  reason: not valid java name */
    public static final void m817drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m816drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c  reason: not valid java name */
    public static final void m818drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m816drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI  reason: not valid java name */
    public static final void m819drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m816drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m1444equalsimpl0(stroke.m1566getCapKaPHkGw(), StrokeCap.Companion.m1448getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m2492constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    static {
        float m2492constructorimpl = Dp.m2492constructorimpl(10);
        SemanticsBoundsPadding = m2492constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m275paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, new InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m822invoke3p2s80s(measureScope, measurable, constraints.m2478unboximpl());
            }

            /* renamed from: invoke-3p2s80s  reason: not valid java name */
            public final MeasureResult m822invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                float f;
                f = ProgressIndicatorKt.SemanticsBoundsPadding;
                final int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(f);
                int i = mo187roundToPx0680j_4 * 2;
                final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.m2488offsetNN6EwU(j, 0, i));
                return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight() - i, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
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
                        Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, -mo187roundToPx0680j_4, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }
        }), 0.0f, m2492constructorimpl, 1, null);
        LinearIndicatorWidth = Dp.m2492constructorimpl(240);
        LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m904getTrackHeightD9Ej5fM();
        CircularProgressIndicatorTokens circularProgressIndicatorTokens = CircularProgressIndicatorTokens.INSTANCE;
        CircularIndicatorDiameter = Dp.m2492constructorimpl(circularProgressIndicatorTokens.m843getSizeD9Ej5fM() - Dp.m2492constructorimpl(circularProgressIndicatorTokens.m842getActiveIndicatorWidthD9Ej5fM() * 2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
