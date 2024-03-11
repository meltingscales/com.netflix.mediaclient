package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FabPrimaryLargeTokens {
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidth;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float LoweredContainerElevation;
    private static final float LoweredFocusContainerElevation;
    private static final float LoweredHoverContainerElevation;
    private static final float LoweredPressedContainerElevation;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    public static final FabPrimaryLargeTokens INSTANCE = new FabPrimaryLargeTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m884getIconSizeD9Ej5fM() {
        return IconSize;
    }

    private FabPrimaryLargeTokens() {
    }

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        float f = (float) 96.0d;
        ContainerHeight = Dp.m2492constructorimpl(f);
        ContainerShape = ShapeKeyTokens.CornerExtraLarge;
        ContainerWidth = Dp.m2492constructorimpl(f);
        FocusContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusIconColor = colorSchemeKeyTokens;
        HoverContainerElevation = elevationTokens.m883getLevel4D9Ej5fM();
        HoverIconColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        IconSize = Dp.m2492constructorimpl((float) 36.0d);
        LoweredContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        LoweredFocusContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        LoweredHoverContainerElevation = elevationTokens.m881getLevel2D9Ej5fM();
        LoweredPressedContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
    }
}
