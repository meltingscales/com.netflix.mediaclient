package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import o.drO;

/* loaded from: classes.dex */
public final class ContentColorKt {
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new drO<Color>() { // from class: androidx.compose.material.ContentColorKt$LocalContentColor$1
        @Override // o.drO
        public /* synthetic */ Color invoke() {
            return Color.m1284boximpl(m584invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU  reason: not valid java name */
        public final long m584invoke0d7_KjU() {
            return Color.Companion.m1303getBlack0d7_KjU();
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
