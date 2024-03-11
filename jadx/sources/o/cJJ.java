package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import o.C5836cKd;
import o.InterfaceC5835cKc;
import o.cJJ;
import o.dpR;

/* loaded from: classes4.dex */
public final class cJJ {
    public static final void a(final C5836cKd c5836cKd, final drM<? super cJF, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) c5836cKd, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(-1941064437);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941064437, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPostPlayUIExperience (PlayerPostPlayUIExperience.kt:16)");
        }
        InterfaceC5835cKc x = c5836cKd.x();
        if (x instanceof InterfaceC5835cKc.b) {
            startRestartGroup.startReplaceableGroup(-79640300);
            cJU.d((InterfaceC5835cKc.b) x, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), true ^ c5836cKd.a(), startRestartGroup, i & 112, 0);
            startRestartGroup.endReplaceableGroup();
        } else if (x instanceof InterfaceC5835cKc.a) {
            startRestartGroup.startReplaceableGroup(-79639948);
            cJQ.e((InterfaceC5835cKc.a) x, drm, drm, drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), !c5836cKd.a(), startRestartGroup, (i & 112) | ((i << 3) & 896) | ((i << 6) & 7168), 0);
            startRestartGroup.endReplaceableGroup();
        } else if (x == null) {
            startRestartGroup.startReplaceableGroup(-79639406);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-79639396);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = modifier;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPostPlayUIExperienceKt$PlayerPostPlayUIExperience$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i3) {
                    cJJ.a(C5836cKd.this, drm, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
