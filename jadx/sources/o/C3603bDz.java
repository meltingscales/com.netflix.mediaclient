package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import java.util.Locale;
import o.bBM;

/* renamed from: o.bDz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3603bDz {
    public static final C3600bDw b(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-956565556);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-956565556, i2, -1, "com.netflix.mediaclient.ui.commander.impl.ui.util.getFormattedTimeInfo (FormattedTimeInfo.kt:21)");
        }
        composer.startReplaceableGroup(1401057619);
        if (C8632dsu.c((Object) "iw", (Object) Locale.getDefault().getLanguage())) {
            int i3 = i / 60;
            String c = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.an, composer, 0)).d("runtime", String.valueOf(i3)).c();
            C8632dsu.a(c, "");
            String c2 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.R, composer, 0)).a(i3).c();
            C8632dsu.a(c2, "");
            C3600bDw c3600bDw = new C3600bDw(c, c2, 0, i3);
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return c3600bDw;
        }
        composer.endReplaceableGroup();
        int i4 = i / 3600;
        int i5 = (i - (i4 * 3600)) / 60;
        String c3 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.an, composer, 0)).d("runtime", "0").c();
        String c4 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.R, composer, 0)).a(0).c();
        if (i4 > 0) {
            composer.startReplaceableGroup(1401058632);
            if (i5 > 0) {
                composer.startReplaceableGroup(1401058659);
                c3 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.ap, composer, 0)).d("hours", String.valueOf(i4)).d("minutes", String.valueOf(i5)).c();
                String c5 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.P, composer, 0)).a(i4).c();
                String c6 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.O, composer, 0)).d("hours", c5).d("minutes", C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.R, composer, 0)).a(i5).c()).c();
                composer.endReplaceableGroup();
                c4 = c6;
            } else {
                composer.startReplaceableGroup(1401059480);
                String c7 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.ak, composer, 0)).d("hours", Integer.valueOf(i4)).c();
                String c8 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.P, composer, 0)).a(i4).c();
                composer.endReplaceableGroup();
                c3 = c7;
                c4 = c8;
            }
            composer.endReplaceableGroup();
        } else if (i5 > 0) {
            composer.startReplaceableGroup(1401059845);
            c3 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.an, composer, 0)).d("runtime", String.valueOf(i5)).c();
            c4 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.R, composer, 0)).a(i5).c();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1401060179);
            composer.endReplaceableGroup();
        }
        C8632dsu.d((Object) c3);
        C8632dsu.d((Object) c4);
        C3600bDw c3600bDw2 = new C3600bDw(c3, c4, i4, i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3600bDw2;
    }
}
