package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.PlayerUIExperience;
import o.C5836cKd;
import o.C8632dsu;
import o.cIG;
import o.cJF;
import o.dpR;

/* loaded from: classes4.dex */
public final class cIG {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PlayerUIExperience.values().length];
            try {
                iArr[PlayerUIExperience.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerUIExperience.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerUIExperience.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerUIExperience.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerUIExperience.b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            c = iArr;
        }
    }

    public static final void e(final C5836cKd c5836cKd, Modifier modifier, drM<? super cJF, dpR> drm, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) c5836cKd, "");
        Composer startRestartGroup = composer.startRestartGroup(2085153655);
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 4) != 0) {
            drm = new drM<cJF, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIKt$PlayerUI$1
                public final void e(cJF cjf) {
                    C8632dsu.c((Object) cjf, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cJF cjf) {
                    e(cjf);
                    return dpR.c;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085153655, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUI (PlayerUI.kt:21)");
        }
        if (!c5836cKd.b()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                final Modifier modifier2 = modifier;
                final drM<? super cJF, dpR> drm2 = drm;
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIKt$PlayerUI$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(Composer composer2, int i3) {
                        cIG.e(C5836cKd.this, modifier2, drm2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        b(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        int i3 = a.c[c5836cKd.l().ordinal()];
        if (i3 == 1) {
            startRestartGroup.startReplaceableGroup(-2138399941);
            cJG.d(c5836cKd, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), startRestartGroup, ((i >> 3) & 112) | 8, 0);
            startRestartGroup.endReplaceableGroup();
        } else if (i3 == 2) {
            startRestartGroup.startReplaceableGroup(-2138399544);
            cJK.a(c5836cKd, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), startRestartGroup, ((i >> 3) & 112) | 8, 0);
            startRestartGroup.endReplaceableGroup();
        } else if (i3 == 3) {
            startRestartGroup.startReplaceableGroup(-2138399297);
            cJI.c(c5836cKd, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), startRestartGroup, ((i >> 3) & 112) | 8, 0);
            startRestartGroup.endReplaceableGroup();
        } else if (i3 == 4) {
            startRestartGroup.startReplaceableGroup(-2138399046);
            cJJ.a(c5836cKd, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), startRestartGroup, ((i >> 3) & 112) | 8, 0);
            startRestartGroup.endReplaceableGroup();
        } else if (i3 == 5) {
            startRestartGroup.startReplaceableGroup(-2138398795);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-2138398785);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier3 = modifier;
            final drM<? super cJF, dpR> drm3 = drm;
            endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.PlayerUIKt$PlayerUI$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i4) {
                    cIG.e(C5836cKd.this, modifier3, drm3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
