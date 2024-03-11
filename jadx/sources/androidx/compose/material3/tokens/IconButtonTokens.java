package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class IconButtonTokens {
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final ShapeKeyTokens StateLayerShape;
    private static final float StateLayerSize;
    private static final ColorSchemeKeyTokens UnselectedFocusIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverIconColor;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;
    public static final IconButtonTokens INSTANCE = new IconButtonTokens();
    private static final ColorSchemeKeyTokens DisabledIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final float IconSize = Dp.m2492constructorimpl((float) 24.0d);

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m903getIconSizeD9Ej5fM() {
        return IconSize;
    }

    private IconButtonTokens() {
    }

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        SelectedFocusIconColor = colorSchemeKeyTokens;
        SelectedHoverIconColor = colorSchemeKeyTokens;
        SelectedIconColor = colorSchemeKeyTokens;
        SelectedPressedIconColor = colorSchemeKeyTokens;
        StateLayerShape = ShapeKeyTokens.CornerFull;
        StateLayerSize = Dp.m2492constructorimpl((float) 40.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusIconColor = colorSchemeKeyTokens2;
        UnselectedHoverIconColor = colorSchemeKeyTokens2;
        UnselectedIconColor = colorSchemeKeyTokens2;
        UnselectedPressedIconColor = colorSchemeKeyTokens2;
    }
}
