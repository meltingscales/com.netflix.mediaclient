package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import o.C8469dmt;
import o.dmA;

/* loaded from: classes5.dex */
public final class dmE {
    public static final dmA a(final drM<? super dmA, dpR> drm, Composer composer, int i) {
        C8632dsu.c((Object) drm, "");
        composer.startReplaceableGroup(-956613935);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-956613935, i, -1, "com.slack.circuit.backstack.rememberSaveableBackStack (SaveableBackStack.kt:26)");
        }
        Object[] objArr = new Object[0];
        Saver<dmA, List<Object>> e = dmA.a.e();
        composer.startReplaceableGroup(-1481599523);
        boolean changedInstance = composer.changedInstance(drm);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<dmA>() { // from class: com.slack.circuit.backstack.SaveableBackStackKt$rememberSaveableBackStack$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: c */
                public final dmA invoke() {
                    dmA dma = new dmA();
                    drm.invoke(dma);
                    if (!C8469dmt.d(dma)) {
                        return dma;
                    }
                    throw new IllegalStateException("Backstack must be non-empty after init.".toString());
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        dmA dma = (dmA) RememberSaveableKt.rememberSaveable(objArr, e, null, (drO) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dma;
    }
}
