package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
final class Android {
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isOnAndroidDevice() {
        return (MEMORY_CLASS == null || IS_ROBOLECTRIC) ? false : true;
    }

    Android() {
    }

    static {
        IS_ROBOLECTRIC = getClassForName("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
