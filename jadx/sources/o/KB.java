package o;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.unit.Dp;
import o.KB;
import o.dpR;

/* loaded from: classes3.dex */
public final class KB {
    public static final void d(final String str, final drO<dpR> dro, final ImageBitmap imageBitmap, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) imageBitmap, "");
        Composer startRestartGroup = composer.startRestartGroup(503293265);
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (i2 & 16) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(503293265, i, -1, "com.netflix.hawkins.consumer.component.button.HawkinsButtonIconStackedForShareSheet (HawkinsButtonIconStackedForShareSheet.kt:63)");
        }
        int i3 = i >> 3;
        c(str, dro, modifier2, z2, ComposableLambdaKt.composableLambda(startRestartGroup, 1204732527, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.button.HawkinsButtonIconStackedForShareSheetKt$HawkinsButtonIconStackedForShareSheet$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1204732527, i4, -1, "com.netflix.hawkins.consumer.component.button.HawkinsButtonIconStackedForShareSheet.<anonymous> (HawkinsButtonIconStackedForShareSheet.kt:70)");
                    }
                    ImageKt.Image(new BitmapPainter(ImageBitmap.this, 0L, 0L, 6, null), null, SizeKt.m295size3ABfNKs(Modifier.Companion, Dp.m2492constructorimpl(48)), null, null, 0.0f, null, composer2, 440, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i & 14) | 24576 | (i & 112) | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final boolean z3 = z2;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.consumer.component.button.HawkinsButtonIconStackedForShareSheetKt$HawkinsButtonIconStackedForShareSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i4) {
                    KB.d(str, dro, imageBitmap, modifier3, z3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.lang.String r15, final o.drO<o.dpR> r16, final com.netflix.hawkins.consumer.icons.HawkinsIcon r17, androidx.compose.ui.Modifier r18, boolean r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KB.d(java.lang.String, o.drO, com.netflix.hawkins.consumer.icons.HawkinsIcon, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.lang.String r17, final o.drO<o.dpR> r18, androidx.compose.ui.Modifier r19, boolean r20, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KB.c(java.lang.String, o.drO, androidx.compose.ui.Modifier, boolean, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }
}
