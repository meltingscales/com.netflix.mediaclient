package androidx.compose.ui.graphics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    /* renamed from: BlendModeColorFilter-xETnrds  reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m1263BlendModeColorFilterxETnrds(long j, int i) {
        BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline3.m();
        return BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline2.m(ColorKt.m1317toArgb8_81llA(j), AndroidBlendMode_androidKt.m1185toAndroidBlendModes9anfk8(i));
    }

    public final BlendModeColorFilter createBlendModeColorFilter(android.graphics.BlendModeColorFilter blendModeColorFilter) {
        int color;
        android.graphics.BlendMode mode;
        color = blendModeColorFilter.getColor();
        long Color = ColorKt.Color(color);
        mode = blendModeColorFilter.getMode();
        return new BlendModeColorFilter(Color, AndroidBlendMode_androidKt.toComposeBlendMode(mode), blendModeColorFilter, null);
    }
}
