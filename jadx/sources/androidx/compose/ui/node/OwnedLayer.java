package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas);

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc  reason: not valid java name */
    void mo1941inverseTransform58bKbWc(float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    boolean mo1942isInLayerk4lQ0M(long j);

    void mapBounds(MutableRect mutableRect, boolean z);

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    long mo1943mapOffset8S9VItk(long j, boolean z);

    /* renamed from: move--gyyYBs  reason: not valid java name */
    void mo1944movegyyYBs(long j);

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    void mo1945resizeozmzZPI(long j);

    void reuseLayer(drM<? super Canvas, dpR> drm, drO<dpR> dro);

    /* renamed from: transform-58bKbWc  reason: not valid java name */
    void mo1946transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope, LayoutDirection layoutDirection, Density density);
}
