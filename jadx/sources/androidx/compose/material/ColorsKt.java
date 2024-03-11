package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.netflix.android.org.json.zip.JSONzip;
import o.drO;

/* loaded from: classes.dex */
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new drO<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Colors invoke() {
            Colors m572lightColors2qZNXz8;
            m572lightColors2qZNXz8 = ColorsKt.m572lightColors2qZNXz8((r43 & 1) != 0 ? ColorKt.Color(4284612846L) : 0L, (r43 & 2) != 0 ? ColorKt.Color(4281794739L) : 0L, (r43 & 4) != 0 ? ColorKt.Color(4278442694L) : 0L, (r43 & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (r43 & 16) != 0 ? Color.Companion.m1310getWhite0d7_KjU() : 0L, (r43 & 32) != 0 ? Color.Companion.m1310getWhite0d7_KjU() : 0L, (r43 & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (r43 & 128) != 0 ? Color.Companion.m1310getWhite0d7_KjU() : 0L, (r43 & JSONzip.end) != 0 ? Color.Companion.m1303getBlack0d7_KjU() : 0L, (r43 & 512) != 0 ? Color.Companion.m1303getBlack0d7_KjU() : 0L, (r43 & 1024) != 0 ? Color.Companion.m1303getBlack0d7_KjU() : 0L, (r43 & 2048) != 0 ? Color.Companion.m1310getWhite0d7_KjU() : 0L);
            return m572lightColors2qZNXz8;
        }
    });

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m572lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static final long getPrimarySurface(Colors colors) {
        return colors.isLight() ? colors.m565getPrimary0d7_KjU() : colors.m569getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m570contentColorFor4WTKRHQ(Colors colors, long j) {
        if (!Color.m1294equalsimpl0(j, colors.m565getPrimary0d7_KjU()) && !Color.m1294equalsimpl0(j, colors.m566getPrimaryVariant0d7_KjU())) {
            if (!Color.m1294equalsimpl0(j, colors.m567getSecondary0d7_KjU()) && !Color.m1294equalsimpl0(j, colors.m568getSecondaryVariant0d7_KjU())) {
                return Color.m1294equalsimpl0(j, colors.m558getBackground0d7_KjU()) ? colors.m560getOnBackground0d7_KjU() : Color.m1294equalsimpl0(j, colors.m569getSurface0d7_KjU()) ? colors.m564getOnSurface0d7_KjU() : Color.m1294equalsimpl0(j, colors.m559getError0d7_KjU()) ? colors.m561getOnError0d7_KjU() : Color.Companion.m1309getUnspecified0d7_KjU();
            }
            return colors.m563getOnSecondary0d7_KjU();
        }
        return colors.m562getOnPrimary0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m571contentColorForek8zF_U(long j, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        long m570contentColorFor4WTKRHQ = m570contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (m570contentColorFor4WTKRHQ == Color.Companion.m1309getUnspecified0d7_KjU()) {
            m570contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1302unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m570contentColorFor4WTKRHQ;
    }
}
