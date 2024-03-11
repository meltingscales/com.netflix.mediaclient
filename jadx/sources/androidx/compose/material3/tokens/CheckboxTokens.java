package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class CheckboxTokens {
    private static final float ContainerHeight;
    private static final RoundedCornerShape ContainerShape;
    private static final float ContainerWidth;
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final ColorSchemeKeyTokens SelectedDisabledContainerColor;
    private static final float SelectedDisabledContainerOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedDisabledIconColor;
    private static final ColorSchemeKeyTokens SelectedErrorContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorFocusIconColor;
    private static final float SelectedErrorFocusOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorHoverIconColor;
    private static final float SelectedErrorHoverOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedErrorIconColor;
    private static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor;
    private static final ColorSchemeKeyTokens SelectedErrorPressedIconColor;
    private static final float SelectedErrorPressedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedFocusContainerColor;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final float SelectedFocusOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedHoverContainerColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final float SelectedHoverOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final float SelectedOutlineWidth;
    private static final ColorSchemeKeyTokens SelectedPressedContainerColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final float SelectedPressedOutlineWidth;
    private static final ShapeKeyTokens StateLayerShape;
    private static final float StateLayerSize;
    private static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor;
    private static final float UnselectedDisabledOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor;
    private static final float UnselectedErrorFocusOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor;
    private static final float UnselectedErrorHoverOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedErrorOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor;
    private static final float UnselectedErrorPressedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;
    private static final float UnselectedFocusOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedHoverOutlineColor;
    private static final float UnselectedHoverOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor;
    private static final float UnselectedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedPressedOutlineColor;
    private static final float UnselectedPressedOutlineWidth;

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return SelectedDisabledContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m841getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return UnselectedDisabledOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    private CheckboxTokens() {
    }

    static {
        float f = (float) 18.0d;
        ContainerHeight = Dp.m2492constructorimpl(f);
        float f2 = (float) 2.0d;
        ContainerShape = RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(f2));
        ContainerWidth = Dp.m2492constructorimpl(f);
        IconSize = Dp.m2492constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        SelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        SelectedDisabledContainerColor = colorSchemeKeyTokens2;
        float f3 = (float) 0.0d;
        SelectedDisabledContainerOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        SelectedErrorContainerColor = colorSchemeKeyTokens3;
        SelectedErrorFocusContainerColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        SelectedErrorFocusIconColor = colorSchemeKeyTokens4;
        SelectedErrorFocusOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedErrorHoverContainerColor = colorSchemeKeyTokens3;
        SelectedErrorHoverIconColor = colorSchemeKeyTokens4;
        SelectedErrorHoverOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedErrorIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedContainerColor = colorSchemeKeyTokens3;
        SelectedErrorPressedIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedFocusContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        SelectedFocusIconColor = colorSchemeKeyTokens5;
        SelectedFocusOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedHoverContainerColor = colorSchemeKeyTokens;
        SelectedHoverIconColor = colorSchemeKeyTokens5;
        SelectedHoverOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedIconColor = colorSchemeKeyTokens5;
        SelectedOutlineWidth = Dp.m2492constructorimpl(f3);
        SelectedPressedContainerColor = colorSchemeKeyTokens;
        SelectedPressedIconColor = colorSchemeKeyTokens5;
        SelectedPressedOutlineWidth = Dp.m2492constructorimpl(f3);
        StateLayerShape = ShapeKeyTokens.CornerFull;
        StateLayerSize = Dp.m2492constructorimpl((float) 40.0d);
        UnselectedDisabledOutlineColor = colorSchemeKeyTokens2;
        UnselectedDisabledOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedErrorFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorFocusOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedErrorHoverOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorHoverOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedErrorOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedFocusOutlineColor = colorSchemeKeyTokens2;
        UnselectedFocusOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedHoverOutlineColor = colorSchemeKeyTokens2;
        UnselectedHoverOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedOutlineWidth = Dp.m2492constructorimpl(f2);
        UnselectedPressedOutlineColor = colorSchemeKeyTokens2;
        UnselectedPressedOutlineWidth = Dp.m2492constructorimpl(f2);
    }
}
