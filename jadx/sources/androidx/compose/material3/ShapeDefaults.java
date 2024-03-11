package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ShapeTokens;

/* loaded from: classes.dex */
public final class ShapeDefaults {
    private static final CornerBasedShape ExtraLarge;
    private static final CornerBasedShape ExtraSmall;
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();
    private static final CornerBasedShape Large;
    private static final CornerBasedShape Medium;
    private static final CornerBasedShape Small;

    public final CornerBasedShape getExtraLarge() {
        return ExtraLarge;
    }

    public final CornerBasedShape getExtraSmall() {
        return ExtraSmall;
    }

    public final CornerBasedShape getLarge() {
        return Large;
    }

    public final CornerBasedShape getMedium() {
        return Medium;
    }

    public final CornerBasedShape getSmall() {
        return Small;
    }

    private ShapeDefaults() {
    }

    static {
        ShapeTokens shapeTokens = ShapeTokens.INSTANCE;
        ExtraSmall = shapeTokens.getCornerExtraSmall();
        Small = shapeTokens.getCornerSmall();
        Medium = shapeTokens.getCornerMedium();
        Large = shapeTokens.getCornerLarge();
        ExtraLarge = shapeTokens.getCornerExtraLarge();
    }
}
