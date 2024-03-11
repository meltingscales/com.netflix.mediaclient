package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonState;
import o.C8632dsu;
import o.C9834xU;
import o.cIT;
import o.cJD;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIT {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PlayPauseButtonState.values().length];
            try {
                iArr[PlayPauseButtonState.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayPauseButtonState.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayPauseButtonState.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    public static final void d(final PlayPauseButtonState playPauseButtonState, final drM<? super cJD, dpR> drm, Composer composer, final int i) {
        int i2;
        C8632dsu.c((Object) playPauseButtonState, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(-1714024237);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(playPauseButtonState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drm) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1714024237, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButton (PlayPauseButton.kt:25)");
            }
            int i3 = d.e[playPauseButtonState.ordinal()];
            if (i3 == 1) {
                startRestartGroup.startReplaceableGroup(418122490);
                a(drm, startRestartGroup, (i2 >> 3) & 14);
                startRestartGroup.endReplaceableGroup();
            } else if (i3 == 2) {
                startRestartGroup.startReplaceableGroup(418122586);
                d(drm, startRestartGroup, (i2 >> 3) & 14);
                startRestartGroup.endReplaceableGroup();
            } else if (i3 == 3) {
                startRestartGroup.startReplaceableGroup(418122683);
                c(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(418122731);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$PlayPauseButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i4) {
                    cIT.d(PlayPauseButtonState.this, drm, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final long a(Composer composer, int i) {
        composer.startReplaceableGroup(725093715);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(725093715, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.playPauseButtonDpSize (PlayPauseButton.kt:42)");
        }
        long mo191toDpSizekrfVVM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo191toDpSizekrfVVM(PainterResources_androidKt.painterResource(HawkinsIcon.C0312gw.c.e(), composer, 0).mo1570getIntrinsicSizeNHjbRc());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mo191toDpSizekrfVVM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final drM<? super cJD, dpR> drm, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1440901966);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1440901966, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PauseButton (PlayPauseButton.kt:50)");
            }
            startRestartGroup.startReplaceableGroup(1081805681);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$PauseButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    public final void a() {
                        drm.invoke(cJD.d.e);
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
            IconButtonKt.IconButton((drO) rememberedValue, null, false, null, cIP.b.a(), startRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$PauseButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i3) {
                    cIT.d(drm, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final drM<? super cJD, dpR> drm, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-2130097908);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2130097908, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayButton (PlayPauseButton.kt:67)");
            }
            startRestartGroup.startReplaceableGroup(-503022544);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$PlayButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    public final void b() {
                        drm.invoke(cJD.c.a);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        b();
                        return dpR.c;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton((drO) rememberedValue, null, false, null, cIP.b.d(), startRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$PlayButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i3) {
                    cIT.a(drm, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(309850670);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(309850670, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.LoadingIndicator (PlayPauseButton.kt:82)");
            }
            final String stringResource = StringResources_androidKt.stringResource(C9834xU.h.e, startRestartGroup, 0);
            Modifier m296size6HolHcs = SizeKt.m296size6HolHcs(Modifier.Companion, a(startRestartGroup, 0));
            startRestartGroup.startReplaceableGroup(-1087544627);
            boolean changed = startRestartGroup.changed(stringResource);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$LoadingIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        a(semanticsPropertyReceiver);
                        return dpR.c;
                    }

                    public final void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        C8632dsu.c((Object) semanticsPropertyReceiver, "");
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            KU.c(SemanticsModifierKt.semantics$default(m296size6HolHcs, false, (drM) rememberedValue, 1, null), null, null, 0.0f, startRestartGroup, 0, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonKt$LoadingIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i2) {
                    cIT.c(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
