package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class LinearProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;
    private static final ShapeKeyTokens ActiveShape;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor;
    public static final LinearProgressIndicatorTokens INSTANCE = new LinearProgressIndicatorTokens();
    private static final ColorSchemeKeyTokens TrackColor;
    private static final float TrackHeight;
    private static final ShapeKeyTokens TrackShape;

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    /* renamed from: getTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m904getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    private LinearProgressIndicatorTokens() {
    }

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f = (float) 4.0d;
        ActiveIndicatorHeight = Dp.m2492constructorimpl(f);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ActiveShape = shapeKeyTokens;
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        TrackColor = ColorSchemeKeyTokens.SurfaceVariant;
        TrackHeight = Dp.m2492constructorimpl(f);
        TrackShape = shapeKeyTokens;
    }
}
