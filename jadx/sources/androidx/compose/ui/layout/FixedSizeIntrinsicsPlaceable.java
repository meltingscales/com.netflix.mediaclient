package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntSizeKt;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void mo1804placeAtf8xVGno(long j, float f, drM<? super GraphicsLayerScope, dpR> drm) {
    }

    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m1825setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
    }
}
