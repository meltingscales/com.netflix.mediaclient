package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class AndroidPath_androidKt {
    public static final Path Path() {
        return new AndroidPath(null, 1, null);
    }

    public static final Path asComposePath(android.graphics.Path path) {
        return new AndroidPath(path);
    }
}
