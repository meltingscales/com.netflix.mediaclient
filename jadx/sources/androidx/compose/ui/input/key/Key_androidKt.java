package androidx.compose.ui.input.key;

/* loaded from: classes.dex */
public final class Key_androidKt {
    /* renamed from: getNativeKeyCode-YVgTNJs  reason: not valid java name */
    public static final int m1665getNativeKeyCodeYVgTNJs(long j) {
        return (int) (j >> 32);
    }

    public static final long Key(int i) {
        return Key.m1626constructorimpl((i << 32) | (0 & 4294967295L));
    }
}
