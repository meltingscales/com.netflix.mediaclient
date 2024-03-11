package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {
    private static final Modifier HorizontalScrollableClipModifier;
    private static final float MaxSupportedElevation = Dp.m2492constructorimpl(30);
    private static final Modifier VerticalScrollableClipModifier;

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }

    public static final Modifier clipScrollableContainer(Modifier modifier, Orientation orientation) {
        return modifier.then(orientation == Orientation.Vertical ? VerticalScrollableClipModifier : HorizontalScrollableClipModifier);
    }

    static {
        Modifier.Companion companion = Modifier.Companion;
        HorizontalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
            public Outline mo139createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
                float mo187roundToPx0680j_4 = density.mo187roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(0.0f, -mo187roundToPx0680j_4, Size.m1176getWidthimpl(j), Size.m1174getHeightimpl(j) + mo187roundToPx0680j_4));
            }
        });
        VerticalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo139createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
                float mo187roundToPx0680j_4 = density.mo187roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(-mo187roundToPx0680j_4, 0.0f, Size.m1176getWidthimpl(j) + mo187roundToPx0680j_4, Size.m1174getHeightimpl(j)));
            }
        });
    }
}
