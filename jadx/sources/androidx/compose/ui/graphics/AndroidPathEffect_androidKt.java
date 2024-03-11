package androidx.compose.ui.graphics;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    public static final android.graphics.PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        C8632dsu.d(pathEffect);
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }
}
