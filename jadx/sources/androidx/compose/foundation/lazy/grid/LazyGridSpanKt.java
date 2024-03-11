package androidx.compose.foundation.lazy.grid;

/* loaded from: classes.dex */
public final class LazyGridSpanKt {
    public static final long GridItemSpan(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The span value should be higher than 0".toString());
        }
        return GridItemSpan.m340constructorimpl(i);
    }
}
