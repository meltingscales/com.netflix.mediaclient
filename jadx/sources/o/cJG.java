package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayPauseButtonState;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.ads.AdBreakProgressPhase;
import o.C1333Xq;
import o.C5810cJe;
import o.C5813cJh;
import o.C5834cKb;
import o.C5836cKd;
import o.C8632dsu;
import o.cII;
import o.cJG;
import o.cJM;
import o.cJR;
import o.cJS;
import o.cJY;
import o.dpR;

/* loaded from: classes4.dex */
public final class cJG {
    public static final void d(final C5836cKd c5836cKd, final drM<? super cJF, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) c5836cKd, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(-1538041275);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538041275, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerAdsUIExperience (PlayerAdsUIExperience.kt:27)");
        }
        C5834cKb c = c5836cKd.c();
        if (c.e() == -1 || c.j() == AdBreakProgressPhase.b) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                final Modifier modifier2 = modifier;
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerAdsUIExperienceKt$PlayerAdsUIExperience$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(Composer composer2, int i3) {
                        cJG.d(C5836cKd.this, drm, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        a(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        final boolean m = c5836cKd.m();
        final boolean a = c5836cKd.a();
        C5808cJc.c(m, a, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, 1379603292, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerAdsUIExperienceKt$PlayerAdsUIExperience$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                d(composer2, num.intValue());
                return dpR.c;
            }

            public final void d(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379603292, i3, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerAdsUIExperience.<anonymous> (PlayerAdsUIExperience.kt:46)");
                    }
                    cJM.d(C5836cKd.this.f(), a, drm, (Modifier) null, composer2, 0, 8);
                    String c2 = C1333Xq.d(cII.c.i).d(SignupConstants.Field.VIDEO_TITLE, C5836cKd.this.D()).c();
                    boolean i4 = C5836cKd.this.i();
                    boolean g = C5836cKd.this.g();
                    PlayPauseButtonState s = C5836cKd.this.s();
                    cJY p = C5836cKd.this.p();
                    boolean z = C5836cKd.this.z();
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    C8632dsu.d((Object) c2);
                    cJS.c(i4, g, c2, c2, p, s, z, a, drm, fillMaxSize$default, composer2, 805306368, 0);
                    boolean z2 = m;
                    C5834cKb c3 = C5836cKd.this.c();
                    cJR.c(!z2, c3.c(), c3.f(), c3.a(), c3.d(), c3.b(), c3.j(), a, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer2, 100663296, 0);
                    Watermark C = C5836cKd.this.C();
                    composer2.startReplaceableGroup(1580961215);
                    if (C != null && C.isValid()) {
                        String identifier = C.getIdentifier();
                        C8632dsu.a(identifier, "");
                        int opacity = C.getOpacity();
                        Watermark.Anchor anchor = C.getAnchor();
                        C8632dsu.a(anchor, "");
                        C5813cJh.e(identifier, opacity, anchor, null, composer2, 0, 8);
                    }
                    composer2.endReplaceableGroup();
                    C5810cJe.b(c3.i(), a, cII.c.b, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer2, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i << 3) & 896) | 196608, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier3 = modifier;
            endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerAdsUIExperienceKt$PlayerAdsUIExperience$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    cJG.d(C5836cKd.this, drm, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
