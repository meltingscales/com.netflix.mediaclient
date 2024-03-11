package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;

/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult) {
        this.value = textLayoutResult;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default  reason: not valid java name */
    public static /* synthetic */ int m479getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m480getOffsetForPosition3MmeM6k(j, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k  reason: not valid java name */
    public final int m480getOffsetForPosition3MmeM6k(long j, boolean z) {
        if (z) {
            j = m478coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.value.m2142getOffsetForPositionk4lQ0M(m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j));
    }

    /* renamed from: isPositionOnText-k-4lQ0M  reason: not valid java name */
    public final boolean m481isPositionOnTextk4lQ0M(long j) {
        long m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release = m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m478coercedInVisibleBoundsOfInputTextMKHz9U(j));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m1138getYimpl(m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release));
        return Offset.m1137getXimpl(m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m1137getXimpl(m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release) <= this.value.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release  reason: not valid java name */
    public final long m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
                return j;
            }
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
            return layoutCoordinates3 == null ? j : layoutCoordinates2.mo1810localPositionOfR5De75A(layoutCoordinates3, j);
        }
        return j;
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release  reason: not valid java name */
    public final long m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
                return j;
            }
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
            return layoutCoordinates3 == null ? j : layoutCoordinates3.mo1810localPositionOfR5De75A(layoutCoordinates2, j);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L13;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m478coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L24:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m484access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m478coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }
}
