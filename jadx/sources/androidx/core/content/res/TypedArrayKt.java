package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* loaded from: classes2.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final int getColorOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }
}
