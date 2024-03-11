package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * (-1);
    }
}
