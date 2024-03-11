package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ExtendedFabPrimaryTokens {
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final ColorSchemeKeyTokens FocusLabelTextColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens HoverLabelTextColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final float LoweredContainerElevation;
    private static final float LoweredFocusContainerElevation;
    private static final float LoweredHoverContainerElevation;
    private static final float LoweredPressedContainerElevation;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    private static final ColorSchemeKeyTokens PressedLabelTextColor;
    public static final ExtendedFabPrimaryTokens INSTANCE = new ExtendedFabPrimaryTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    private ExtendedFabPrimaryTokens() {
    }

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        ContainerHeight = Dp.m2492constructorimpl((float) 56.0d);
        ContainerShape = ShapeKeyTokens.CornerLarge;
        FocusContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusIconColor = colorSchemeKeyTokens;
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverContainerElevation = elevationTokens.m883getLevel4D9Ej5fM();
        HoverIconColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        IconSize = Dp.m2492constructorimpl((float) 24.0d);
        LabelTextColor = colorSchemeKeyTokens;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        LoweredContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        LoweredFocusContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        LoweredHoverContainerElevation = elevationTokens.m881getLevel2D9Ej5fM();
        LoweredPressedContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
        PressedLabelTextColor = colorSchemeKeyTokens;
    }
}
