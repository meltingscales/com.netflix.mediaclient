package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class DensityKt {
    public static /* synthetic */ Density Density$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return Density(f, f2);
    }

    public static final Density Density(float f, float f2) {
        return new DensityImpl(f, f2);
    }
}
