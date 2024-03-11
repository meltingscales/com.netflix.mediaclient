package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.hawkins.consumer.tokens.Token;
import o.PT;
import o.dpR;

/* loaded from: classes3.dex */
public final class PT {
    private static final float e = androidx.compose.ui.unit.Dp.m2492constructorimpl(93);
    private static final float d = androidx.compose.ui.unit.Dp.m2492constructorimpl(165);

    public static final /* synthetic */ void d(Composer composer, int i) {
        a(composer, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r37, final java.lang.String r38, final o.drO<o.dpR> r39, androidx.compose.ui.Modifier r40, boolean r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PT.b(java.lang.String, java.lang.String, o.drO, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1803490369);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1803490369, i, -1, "com.netflix.mediaclient.android.sharing.impl.LoaderForContent (ShareSheetContentPreviewRow.kt:117)");
            }
            BoxKt.Box(BackgroundKt.m110backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), LA.c(Token.Color.C0513du.e, startRestartGroup, 6), null, 2, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetContentPreviewRowKt$LoaderForContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i2) {
                    PT.a(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
