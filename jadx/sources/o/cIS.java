package o;

import android.content.Context;
import android.icu.text.NumberFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import o.C5827cJv;
import o.C5829cJx;
import o.C5831cJz;
import o.cII;
import o.cIS;
import o.cJA;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIS {
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final boolean r18, final o.InterfaceC5816cJk r19, final boolean r20, final boolean r21, final boolean r22, final o.drM<? super o.cJA, o.dpR> r23, final o.drM<? super o.C5831cJz, o.dpR> r24, final o.drM<? super o.C5829cJx, o.dpR> r25, final o.drM<? super o.C5827cJv, o.dpR> r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cIS.d(boolean, o.cJk, boolean, boolean, boolean, o.drM, o.drM, o.drM, o.drM, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final boolean z, final float f, final drM<? super cJA, dpR> drm, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1892383612);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(drm) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1892383612, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.SpeedButton (PlayerBottomBar.kt:67)");
            }
            String b = b(f, startRestartGroup, (i2 >> 3) & 14);
            String stringResource = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.P, startRestartGroup, 0);
            HawkinsIcon.eV eVVar = HawkinsIcon.eV.c;
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "speedPlayerUIControls");
            startRestartGroup.startReplaceableGroup(1220552663);
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$SpeedButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    public final void e() {
                        drm.invoke(cJA.b);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        e();
                        return dpR.c;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            cIQ.c(b, stringResource, eVVar, z, testTag, (drO) rememberedValue, startRestartGroup, ((i2 << 9) & 7168) | 24960, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$SpeedButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    cIS.e(z, f, drm, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private static final String b(float f, Composer composer, int i) {
        composer.startReplaceableGroup(-2032066819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2032066819, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.rememberPlaybackSpeedString (PlayerBottomBar.kt:81)");
        }
        composer.startReplaceableGroup(-455219564);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Object obj = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMinimumFractionDigits(0);
            numberFormat.setMaximumFractionDigits(2);
            composer.updateRememberedValue(numberFormat);
            obj = numberFormat;
        }
        NumberFormat numberFormat2 = (NumberFormat) obj;
        composer.endReplaceableGroup();
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-455219368);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = C1333Xq.e(context, cII.c.d).d("playbackSpeed", numberFormat2.format(Float.valueOf(f))).c();
            composer.updateRememberedValue(rememberedValue2);
        }
        String str = (String) rememberedValue2;
        composer.endReplaceableGroup();
        C8632dsu.d((Object) str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final drM<? super C5831cJz, dpR> drm, final boolean z, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1009803604);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009803604, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.LockButton (PlayerBottomBar.kt:104)");
            }
            String stringResource = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.ec, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.C, startRestartGroup, 0);
            HawkinsIcon.jB jBVar = HawkinsIcon.jB.b;
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "lockPlayerUIControls");
            startRestartGroup.startReplaceableGroup(-444173124);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$LockButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    public final void d() {
                        drm.invoke(C5831cJz.b);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        d();
                        return dpR.c;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            cIQ.c(stringResource, stringResource2, jBVar, z, testTag, (drO) rememberedValue, startRestartGroup, ((i2 << 6) & 7168) | 24960, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$LockButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    cIS.h(drm, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final drM<? super C5829cJx, dpR> drm, final boolean z, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1239190041);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1239190041, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.EpisodesButton (PlayerBottomBar.kt:119)");
            }
            String stringResource = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.ag, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.f, startRestartGroup, 0);
            HawkinsIcon a = HawkinsIcon.C0212dc.c.a();
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "episodesButtonTestTag");
            startRestartGroup.startReplaceableGroup(694857025);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$EpisodesButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    public final void a() {
                        drm.invoke(C5829cJx.c);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            cIQ.c(stringResource, stringResource2, a, z, testTag, (drO) rememberedValue, startRestartGroup, ((i2 << 6) & 7168) | 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$EpisodesButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    cIS.d(drm, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final drM<? super C5827cJv, dpR> drm, final boolean z, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1663908513);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1663908513, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.AudioAndSubtitlesButton (PlayerBottomBar.kt:134)");
            }
            String stringResource = StringResources_androidKt.stringResource(cII.c.c, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.i, startRestartGroup, 0);
            HawkinsIcon a = HawkinsIcon.iI.c.a();
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "audioAndSubtitlesButtonTestTag");
            startRestartGroup.startReplaceableGroup(-1621918361);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$AudioAndSubtitlesButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        d();
                        return dpR.c;
                    }

                    public final void d() {
                        drm.invoke(C5827cJv.c);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            cIQ.c(stringResource, stringResource2, a, z, testTag, (drO) rememberedValue, startRestartGroup, ((i2 << 6) & 7168) | 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerBottomBarKt$AudioAndSubtitlesButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    cIS.b(drm, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
