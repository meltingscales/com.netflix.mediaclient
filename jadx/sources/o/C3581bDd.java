package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.coroutines.EmptyCoroutineContext;
import o.C3581bDd;
import o.dpR;

/* renamed from: o.bDd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3581bDd<Model, Result> implements dmY<Result> {
    private final InterfaceC8613dsb<Model, InterfaceC8478dnb<Result>, Composer, Integer, dpR> a;
    private final Model d;

    /* JADX WARN: Multi-variable type inference failed */
    public C3581bDd(Model model, InterfaceC8613dsb<? super Model, ? super InterfaceC8478dnb<Result>, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        C8632dsu.c((Object) model, "");
        C8632dsu.c((Object) interfaceC8613dsb, "");
        this.d = model;
        this.a = interfaceC8613dsb;
    }

    @Override // o.dmY
    public void e(final InterfaceC8478dnb<Result> interfaceC8478dnb, Composer composer, final int i) {
        int i2;
        C8632dsu.c((Object) interfaceC8478dnb, "");
        Composer startRestartGroup = composer.startRestartGroup(652024804);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(interfaceC8478dnb) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652024804, i2, -1, "com.netflix.mediaclient.ui.commander.impl.ui.overlay.BottomSheetOverlay.Content (BottomSheetOverlay.kt:13)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.e, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            final dwU coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            this.a.invoke(this.d, new InterfaceC8478dnb() { // from class: o.bDe
            }, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>(this) { // from class: com.netflix.mediaclient.ui.commander.impl.ui.overlay.BottomSheetOverlay$Content$2
                final /* synthetic */ C3581bDd<Model, Result> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.b = this;
                }

                public final void e(Composer composer2, int i3) {
                    this.b.e(interfaceC8478dnb, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
