package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class CircularProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorWidth;
    private static final ShapeKeyTokens ActiveShape;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor;
    public static final CircularProgressIndicatorTokens INSTANCE = new CircularProgressIndicatorTokens();
    private static final float Size;

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM  reason: not valid java name */
    public final float m842getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    /* renamed from: getSize-D9Ej5fM  reason: not valid java name */
    public final float m843getSizeD9Ej5fM() {
        return Size;
    }

    private CircularProgressIndicatorTokens() {
    }

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ActiveShape = ShapeKeyTokens.CornerNone;
        ActiveIndicatorWidth = Dp.m2492constructorimpl((float) 4.0d);
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        Size = Dp.m2492constructorimpl((float) 48.0d);
    }
}
