package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class RecomposeScopeImplKt {
    private static final Object callbackLock = new Object();

    public static final int updateChangedFlags(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
