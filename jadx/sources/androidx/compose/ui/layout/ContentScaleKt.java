package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m1795access$computeFillHeightiLBOSCw(long j, long j2) {
        return m1799computeFillHeightiLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m1796access$computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return m1800computeFillMaxDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m1797access$computeFillMinDimensioniLBOSCw(long j, long j2) {
        return m1801computeFillMinDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m1798access$computeFillWidthiLBOSCw(long j, long j2) {
        return m1802computeFillWidthiLBOSCw(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final float m1800computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(m1802computeFillWidthiLBOSCw(j, j2), m1799computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final float m1801computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(m1802computeFillWidthiLBOSCw(j, j2), m1799computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final float m1802computeFillWidthiLBOSCw(long j, long j2) {
        return Size.m1176getWidthimpl(j2) / Size.m1176getWidthimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final float m1799computeFillHeightiLBOSCw(long j, long j2) {
        return Size.m1174getHeightimpl(j2) / Size.m1174getHeightimpl(j);
    }
}
