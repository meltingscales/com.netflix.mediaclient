package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.Map;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dqE;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class LazySaveableStateHolderKt {
    public static final void LazySaveableStateHolderProvider(final InterfaceC8612dsa<? super SaveableStateHolder, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(674185128);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(interfaceC8612dsa) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674185128, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) startRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            final LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.rememberSaveable(new Object[]{saveableStateRegistry}, LazySaveableStateHolder.Companion.saver(saveableStateRegistry), null, new drO<LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final LazySaveableStateHolder invoke() {
                    Map d;
                    SaveableStateRegistry saveableStateRegistry2 = SaveableStateRegistry.this;
                    d = dqE.d();
                    return new LazySaveableStateHolder(saveableStateRegistry2, d);
                }
            }, startRestartGroup, 72, 4);
            CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder), ComposableLambdaKt.composableLambda(startRestartGroup, 1863926504, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1863926504, i3, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
                        }
                        LazySaveableStateHolder.this.setWrappedHolder(SaveableStateHolderKt.rememberSaveableStateHolder(composer2, 0));
                        interfaceC8612dsa.invoke(LazySaveableStateHolder.this, composer2, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    LazySaveableStateHolderKt.LazySaveableStateHolderProvider(interfaceC8612dsa, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
