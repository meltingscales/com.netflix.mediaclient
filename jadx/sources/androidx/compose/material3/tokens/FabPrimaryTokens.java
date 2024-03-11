package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FabPrimaryTokens {
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
    public static final FabPrimaryTokens INSTANCE = new FabPrimaryTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m885getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m886getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m887getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m888getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m889getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m890getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    private FabPrimaryTokens() {
    }

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        float f = (float) 56.0d;
        ContainerHeight = Dp.m2492constructorimpl(f);
        ContainerShape = ShapeKeyTokens.CornerLarge;
        ContainerWidth = Dp.m2492constructorimpl(f);
        FocusContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusIconColor = colorSchemeKeyTokens;
        HoverContainerElevation = elevationTokens.m883getLevel4D9Ej5fM();
        HoverIconColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        IconSize = Dp.m2492constructorimpl((float) 24.0d);
        LoweredContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        LoweredFocusContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        LoweredHoverContainerElevation = elevationTokens.m881getLevel2D9Ej5fM();
        LoweredPressedContainerElevation = elevationTokens.m880getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m882getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
    }
}
