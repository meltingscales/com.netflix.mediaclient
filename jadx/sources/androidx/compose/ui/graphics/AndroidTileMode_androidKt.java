package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;

/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {
    /* renamed from: toAndroidTileMode-0vamqd0  reason: not valid java name */
    public static final Shader.TileMode m1225toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.Companion;
        if (TileMode.m1462equalsimpl0(i, companion.m1466getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m1462equalsimpl0(i, companion.m1469getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m1462equalsimpl0(i, companion.m1468getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m1462equalsimpl0(i, companion.m1467getDecal3opZhB0())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
