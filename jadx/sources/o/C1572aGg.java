package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import o.C1572aGg;
import o.InterfaceC1571aGf;
import o.dpR;

/* renamed from: o.aGg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1572aGg {
    private static final ProvidableCompositionLocal<InterfaceC1571aGf> a = CompositionLocalKt.staticCompositionLocalOf(new drO<InterfaceC1571aGf>() { // from class: com.netflix.mediaclient.imageloadercompose.api.ImageRepositoryKt$LocalImageRepository$1
        @Override // o.drO
        /* renamed from: c */
        public final InterfaceC1571aGf invoke() {
            return null;
        }
    });

    public static final ProvidableCompositionLocal<InterfaceC1571aGf> a() {
        return a;
    }

    public static final void b(final InterfaceC1571aGf interfaceC1571aGf, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        C8632dsu.c((Object) interfaceC1571aGf, "");
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(1755306533);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(interfaceC1571aGf) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1755306533, i2, -1, "com.netflix.mediaclient.imageloadercompose.api.ProvideLocalImageRepository (ImageRepository.kt:41)");
            }
            CompositionLocalKt.CompositionLocalProvider(a.provides(interfaceC1571aGf), drx, startRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.imageloadercompose.api.ImageRepositoryKt$ProvideLocalImageRepository$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i3) {
                    C1572aGg.b(InterfaceC1571aGf.this, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
