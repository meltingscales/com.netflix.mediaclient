package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FilledCardTokens {
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    private static final float DraggedContainerElevation;
    private static final float FocusContainerElevation;
    private static final float HoverContainerElevation;
    public static final FilledCardTokens INSTANCE = new FilledCardTokens();
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float PressedContainerElevation;

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m897getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m898getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m899getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m900getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m901getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m902getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    private FilledCardTokens() {
    }

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        ContainerColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m879getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledContainerElevation = elevationTokens.m879getLevel0D9Ej5fM();
        DraggedContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m879getLevel0D9Ej5fM();
        HoverContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = Dp.m2492constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m879getLevel0D9Ej5fM();
    }
}
