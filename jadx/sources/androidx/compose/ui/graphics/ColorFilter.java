package androidx.compose.ui.graphics;

import o.C8627dsp;

/* loaded from: classes.dex */
public class ColorFilter {
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: tint-xETnrds$default  reason: not valid java name */
        public static /* synthetic */ ColorFilter m1312tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.Companion.m1258getSrcIn0nO6VwU();
            }
            return companion.m1313tintxETnrds(j, i);
        }

        /* renamed from: tint-xETnrds  reason: not valid java name */
        public final ColorFilter m1313tintxETnrds(long j, int i) {
            return new BlendModeColorFilter(j, i, (C8627dsp) null);
        }
    }
}
