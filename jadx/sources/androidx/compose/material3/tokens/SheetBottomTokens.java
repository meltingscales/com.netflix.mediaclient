package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SheetBottomTokens {
    private static final float DockedModalContainerElevation;
    private static final float DockedStandardContainerElevation;
    public static final SheetBottomTokens INSTANCE = new SheetBottomTokens();
    private static final ColorSchemeKeyTokens DockedContainerColor = ColorSchemeKeyTokens.Surface;
    private static final ShapeKeyTokens DockedContainerShape = ShapeKeyTokens.CornerExtraLargeTop;
    private static final ColorSchemeKeyTokens DockedContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final ColorSchemeKeyTokens DockedDragHandleColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float DockedDragHandleHeight = Dp.m2492constructorimpl((float) 4.0d);
    private static final float DockedDragHandleWidth = Dp.m2492constructorimpl((float) 32.0d);
    private static final ShapeKeyTokens DockedMinimizedContainerShape = ShapeKeyTokens.CornerNone;

    public final ColorSchemeKeyTokens getDockedContainerColor() {
        return DockedContainerColor;
    }

    public final ShapeKeyTokens getDockedContainerShape() {
        return DockedContainerShape;
    }

    public final ColorSchemeKeyTokens getDockedDragHandleColor() {
        return DockedDragHandleColor;
    }

    /* renamed from: getDockedDragHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m943getDockedDragHandleHeightD9Ej5fM() {
        return DockedDragHandleHeight;
    }

    /* renamed from: getDockedDragHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m944getDockedDragHandleWidthD9Ej5fM() {
        return DockedDragHandleWidth;
    }

    /* renamed from: getDockedModalContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m945getDockedModalContainerElevationD9Ej5fM() {
        return DockedModalContainerElevation;
    }

    private SheetBottomTokens() {
    }

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DockedModalContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        DockedStandardContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
    }
}
