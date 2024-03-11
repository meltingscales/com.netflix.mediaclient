package o;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.netflix.android.org.json.zip.JSONzip;

/* loaded from: classes3.dex */
public final class LY {
    private static final float a;
    public static final LY b = new LY();
    private static final float c = androidx.compose.ui.unit.Dp.m2492constructorimpl(56);
    private static final float d = androidx.compose.ui.unit.Dp.m2492constructorimpl(280);
    private static final float e;
    private static final float f;
    private static final float g;

    public final float d() {
        return d;
    }

    private LY() {
    }

    public final Shape b(Composer composer, int i) {
        composer.startReplaceableGroup(-764316797);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-764316797, i, -1, "com.netflix.hawkins.internal.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:70)");
        }
        RoundedCornerShape e2 = C1039Mg.e.a().e();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e2;
    }

    public final PaddingValues a(float f2, float f3, float f4, float f5) {
        return PaddingKt.m272PaddingValuesa9UjIt4(f2, f4, f3, f5);
    }

    public static /* synthetic */ PaddingValues c(LY ly, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = C1033Ma.j();
        }
        if ((i & 2) != 0) {
            f3 = C1033Ma.j();
        }
        if ((i & 4) != 0) {
            f4 = C1033Ma.j();
        }
        if ((i & 8) != 0) {
            f5 = C1033Ma.j();
        }
        return ly.e(f2, f3, f4, f5);
    }

    public final PaddingValues e(float f2, float f3, float f4, float f5) {
        return PaddingKt.m272PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    public static /* synthetic */ PaddingValues b(LY ly, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = C1033Ma.j();
        }
        if ((i & 2) != 0) {
            f3 = C1033Ma.h();
        }
        if ((i & 4) != 0) {
            f4 = C1033Ma.j();
        }
        if ((i & 8) != 0) {
            f5 = androidx.compose.ui.unit.Dp.m2492constructorimpl(0);
        }
        return ly.b(f2, f3, f4, f5);
    }

    public final PaddingValues b(float f2, float f3, float f4, float f5) {
        return PaddingKt.m272PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    public final LZ c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1601787041);
        long d2 = (i6 & 1) != 0 ? C1037Me.d(C1039Mg.e.q()) : j;
        long d3 = (i6 & 2) != 0 ? C1037Me.d(C1039Mg.e.x()) : j2;
        long m1292copywmQWz5c$default = (i6 & 4) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long d4 = (i6 & 8) != 0 ? C1037Me.d(C1039Mg.e.o()) : j4;
        long d5 = (i6 & 16) != 0 ? C1037Me.d(C1039Mg.e.d()) : j5;
        long d6 = (i6 & 32) != 0 ? C1037Me.d(C1039Mg.e.d()) : j6;
        long d7 = (i6 & 64) != 0 ? C1037Me.d(C1039Mg.e.d()) : j7;
        long d8 = (i6 & 128) != 0 ? C1037Me.d(C1039Mg.e.d()) : j8;
        long d9 = (i6 & JSONzip.end) != 0 ? C1037Me.d(C1039Mg.e.c()) : j9;
        long d10 = (i6 & 512) != 0 ? C1037Me.d(C1039Mg.e.k()) : j10;
        TextSelectionColors textSelectionColors2 = (i6 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long d11 = (i6 & 2048) != 0 ? C1037Me.d(C1039Mg.e.r()) : j11;
        long d12 = (i6 & 4096) != 0 ? C1037Me.d(C1039Mg.e.e()) : j12;
        long m1292copywmQWz5c$default2 = (i6 & 8192) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long d13 = (i6 & 16384) != 0 ? C1037Me.d(C1039Mg.e.m()) : j14;
        long d14 = (32768 & i6) != 0 ? C1037Me.d(C1039Mg.e.v()) : j15;
        long d15 = (65536 & i6) != 0 ? C1037Me.d(C1039Mg.e.A()) : j16;
        long m1292copywmQWz5c$default3 = (131072 & i6) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long d16 = (262144 & i6) != 0 ? C1037Me.d(C1039Mg.e.n()) : j18;
        long d17 = (524288 & i6) != 0 ? C1037Me.d(C1039Mg.e.w()) : j19;
        long d18 = (1048576 & i6) != 0 ? C1037Me.d(C1039Mg.e.G()) : j20;
        long m1292copywmQWz5c$default4 = (2097152 & i6) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long d19 = (4194304 & i6) != 0 ? C1037Me.d(C1039Mg.e.p()) : j22;
        long d20 = (8388608 & i6) != 0 ? C1037Me.d(C1039Mg.e.s()) : j23;
        long d21 = (16777216 & i6) != 0 ? C1037Me.d(C1039Mg.e.B()) : j24;
        long m1292copywmQWz5c$default5 = (33554432 & i6) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long d22 = (67108864 & i6) != 0 ? C1037Me.d(C1039Mg.e.l()) : j26;
        long d23 = (134217728 & i6) != 0 ? C1037Me.d(C1039Mg.e.y()) : j27;
        long d24 = (268435456 & i6) != 0 ? C1037Me.d(C1039Mg.e.y()) : j28;
        long m1292copywmQWz5c$default6 = (536870912 & i6) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long d25 = (i6 & 1073741824) != 0 ? C1037Me.d(C1039Mg.e.y()) : j30;
        long d26 = (i7 & 1) != 0 ? C1037Me.d(C1039Mg.e.u()) : j31;
        long d27 = (i7 & 2) != 0 ? C1037Me.d(C1039Mg.e.D()) : j32;
        long m1292copywmQWz5c$default7 = (i7 & 4) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long d28 = (i7 & 8) != 0 ? C1037Me.d(C1039Mg.e.t()) : j34;
        long d29 = (i7 & 16) != 0 ? C1037Me.d(C1039Mg.e.z()) : j35;
        long d30 = (i7 & 32) != 0 ? C1037Me.d(C1039Mg.e.z()) : j36;
        long m1292copywmQWz5c$default8 = (i7 & 64) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.z()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long d31 = (i7 & 128) != 0 ? C1037Me.d(C1039Mg.e.z()) : j38;
        long d32 = (i7 & JSONzip.end) != 0 ? C1037Me.d(C1039Mg.e.C()) : j39;
        long d33 = (i7 & 512) != 0 ? C1037Me.d(C1039Mg.e.C()) : j40;
        long m1292copywmQWz5c$default9 = (i7 & 1024) != 0 ? Color.m1292copywmQWz5c$default(C1037Me.d(C1039Mg.e.C()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long d34 = (i7 & 2048) != 0 ? C1037Me.d(C1039Mg.e.C()) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1601787041, i, i2, "com.netflix.hawkins.internal.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:316)");
        }
        LZ lz = new LZ(d2, d3, m1292copywmQWz5c$default, d4, d5, d6, d7, d8, d9, d10, textSelectionColors2, d11, d12, m1292copywmQWz5c$default2, d13, d14, d15, m1292copywmQWz5c$default3, d16, d17, d18, m1292copywmQWz5c$default4, d19, d20, d21, m1292copywmQWz5c$default5, d22, d23, d24, m1292copywmQWz5c$default6, d25, d26, d27, m1292copywmQWz5c$default7, d28, d29, d30, m1292copywmQWz5c$default8, d31, d32, d33, m1292copywmQWz5c$default9, d34, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lz;
    }

    static {
        float m2492constructorimpl = androidx.compose.ui.unit.Dp.m2492constructorimpl(1);
        g = m2492constructorimpl;
        float m2492constructorimpl2 = androidx.compose.ui.unit.Dp.m2492constructorimpl(2);
        a = m2492constructorimpl2;
        f = m2492constructorimpl;
        e = m2492constructorimpl2;
    }
}
