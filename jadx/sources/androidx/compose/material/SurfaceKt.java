package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* renamed from: Surface-F-jzlyU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m658SurfaceFjzlyU(androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, androidx.compose.foundation.BorderStroke r32, float r33, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m658SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* renamed from: Surface-LPr_se0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m659SurfaceLPr_se0(final o.drO<o.dpR> r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.ui.graphics.Shape r31, long r32, long r34, androidx.compose.foundation.BorderStroke r36, float r37, androidx.compose.foundation.interaction.MutableInteractionSource r38, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m659SurfaceLPr_se0(o.drO, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg  reason: not valid java name */
    public static final Modifier m662surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m109backgroundbw27NRU(ShadowKt.m1073shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape) : Modifier.Companion), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M  reason: not valid java name */
    public static final long m663surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:634)");
        }
        if (Color.m1294equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m569getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo585apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
