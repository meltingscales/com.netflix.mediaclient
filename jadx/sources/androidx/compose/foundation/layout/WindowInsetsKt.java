package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class WindowInsetsKt {
    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    /* renamed from: only-bOOhFvg  reason: not valid java name */
    public static final WindowInsets m312onlybOOhFvg(WindowInsets windowInsets, int i) {
        return new LimitInsets(windowInsets, i, null);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }

    public static final WindowInsets WindowInsets(int i, int i2, int i3, int i4) {
        return new FixedIntInsets(i, i2, i3, i4);
    }

    /* renamed from: WindowInsets-a9UjIt4  reason: not valid java name */
    public static final WindowInsets m310WindowInsetsa9UjIt4(float f, float f2, float f3, float f4) {
        return new FixedDpInsets(f, f2, f3, f4, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ WindowInsets m311WindowInsetsa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2492constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2492constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m2492constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m2492constructorimpl(0);
        }
        return m310WindowInsetsa9UjIt4(f, f2, f3, f4);
    }
}
