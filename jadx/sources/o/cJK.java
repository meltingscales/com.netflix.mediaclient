package o;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.state.live.LiveMode;
import com.netflix.model.leafs.advisory.Advisory;
import o.C5810cJe;
import o.C5813cJh;
import o.C5836cKd;
import o.C8632dsu;
import o.cID;
import o.cIY;
import o.cJF;
import o.cJK;
import o.cJM;
import o.cJT;
import o.cJZ;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class cJK {
    public static final void a(final C5836cKd c5836cKd, final drM<? super cJF, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) c5836cKd, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(2097086091);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2097086091, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerLiveUIExperience (PlayerLiveUIExperience.kt:27)");
        }
        if (c5836cKd.t().e() == LiveMode.e && !c5836cKd.I()) {
            cID.b bVar = cID.a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                final Modifier modifier2 = modifier;
                endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerLiveUIExperienceKt$PlayerLiveUIExperience$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void c(Composer composer2, int i3) {
                        cJK.a(C5836cKd.this, drm, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        c(composer2, num.intValue());
                        return dpR.c;
                    }
                });
                return;
            }
            return;
        }
        boolean m = c5836cKd.m();
        final boolean a = c5836cKd.a();
        final LiveMode e = c5836cKd.t().e();
        if (LiveMode.a != e) {
            LiveMode liveMode = LiveMode.c;
        }
        C5808cJc.c(m, a, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, 1339870690, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerLiveUIExperienceKt$PlayerLiveUIExperience$3
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
                int i4;
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1339870690, i3, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerLiveUIExperience.<anonymous> (PlayerLiveUIExperience.kt:47)");
                    }
                    cJM.d(C5836cKd.this.f(), a, drm, (Modifier) null, composer2, 0, 8);
                    composer2.startReplaceableGroup(-409373077);
                    LiveMode liveMode2 = e;
                    if (liveMode2 == LiveMode.a || liveMode2 == LiveMode.b || liveMode2 == LiveMode.c || liveMode2 == LiveMode.d) {
                        cJT.a(C5836cKd.this.i(), C5836cKd.this.g(), a, C5836cKd.this.s(), C5836cKd.this.j(), C5836cKd.this.k(), C5836cKd.this.y(), C5836cKd.this.v(), C5836cKd.this.w(), C5836cKd.this.A().b(), C5836cKd.this.A().e(), C5836cKd.this.A().a(), C5836cKd.this.A().c(), C5836cKd.this.p(), C5836cKd.this.z(), C5836cKd.this.B(), true, drm, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer2, 0, 102236160, 0);
                    }
                    composer2.endReplaceableGroup();
                    Watermark C = C5836cKd.this.C();
                    composer2.startReplaceableGroup(-409371245);
                    if (C != null) {
                        i4 = 1;
                        if (C.isValid()) {
                            String identifier = C.getIdentifier();
                            C8632dsu.a(identifier, "");
                            int opacity = C.getOpacity();
                            Watermark.Anchor anchor = C.getAnchor();
                            C8632dsu.a(anchor, "");
                            C5813cJh.e(identifier, opacity, anchor, null, composer2, 0, 8);
                        }
                    } else {
                        i4 = 1;
                    }
                    composer2.endReplaceableGroup();
                    cJZ n = C5836cKd.this.n();
                    boolean z = a;
                    Advisory e2 = n.e();
                    String a2 = n.a();
                    drM<cJF, dpR> drm2 = drm;
                    Modifier.Companion companion = Modifier.Companion;
                    float f = 36;
                    cIY.b(z, e2, a2, drm2, PaddingKt.m277paddingqDBjuR0$default(companion, Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(f), 0.0f, 0.0f, 12, null), composer2, 64, 0);
                    if (C5836cKd.this.t().d() != null) {
                        C5810cJe.b(C5836cKd.this.t().b(), a, C5836cKd.this.t().d().intValue(), SizeKt.fillMaxSize$default(companion, 0.0f, i4, null), composer2, 3072, 0);
                    }
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
            endRestartGroup2.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerLiveUIExperienceKt$PlayerLiveUIExperience$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i3) {
                    cJK.a(C5836cKd.this, drm, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
