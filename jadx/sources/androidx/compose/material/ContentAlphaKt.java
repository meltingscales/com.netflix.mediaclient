package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import o.drO;

/* loaded from: classes.dex */
public final class ContentAlphaKt {
    private static final ProvidableCompositionLocal<Float> LocalContentAlpha = CompositionLocalKt.compositionLocalOf$default(null, new drO<Float>() { // from class: androidx.compose.material.ContentAlphaKt$LocalContentAlpha$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Float invoke() {
            return Float.valueOf(1.0f);
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
