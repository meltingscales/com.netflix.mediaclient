package androidx.media3.common.util;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes2.dex */
public final class Assertions {
    @Pure
    public static void checkArgument(boolean z) {
    }

    @Pure
    public static void checkArgument(boolean z, Object obj) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String checkNotEmpty(String str) {
        return str;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(T t) {
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkNotNull(T t, Object obj) {
        return t;
    }

    @Pure
    public static void checkState(boolean z) {
    }

    @Pure
    public static void checkState(boolean z, Object obj) {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(T t) {
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T checkStateNotNull(T t, Object obj) {
        return t;
    }

    @Pure
    public static int checkIndex(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }
}
