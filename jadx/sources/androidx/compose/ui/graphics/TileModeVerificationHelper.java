package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* loaded from: classes.dex */
final class TileModeVerificationHelper {
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    public final Shader.TileMode getFrameworkTileModeDecal() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }

    /* renamed from: getComposeTileModeDecal-3opZhB0  reason: not valid java name */
    public final int m1470getComposeTileModeDecal3opZhB0() {
        return TileMode.Companion.m1467getDecal3opZhB0();
    }
}
