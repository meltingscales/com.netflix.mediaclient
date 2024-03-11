package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class BackHandlerKt {
    public static final void BackHandler(final boolean z, final drO<dpR> dro, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(dro) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(dro, startRestartGroup, (i3 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new OnBackPressedCallback(z) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        drO BackHandler$lambda$0;
                        BackHandler$lambda$0 = BackHandlerKt.BackHandler$lambda$0(rememberUpdatedState);
                        BackHandler$lambda$0.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) rememberedValue;
            startRestartGroup.startReplaceableGroup(-3686552);
            boolean changed = startRestartGroup.changed(backHandlerKt$BackHandler$backCallback$1$1);
            boolean changed2 = startRestartGroup.changed(Boolean.valueOf(z));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new drO<dpR>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* bridge */ /* synthetic */ dpR invoke() {
                        invoke2();
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        setEnabled(z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((drO) rememberedValue2, startRestartGroup, 0);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    OnBackPressedDispatcher.this.addCallback(lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
                    final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$12 = backHandlerKt$BackHandler$backCallback$1$1;
                    return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            remove();
                        }
                    };
                }
            }, startRestartGroup, 72);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer2, int i5) {
                BackHandlerKt.BackHandler(z, dro, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final drO<dpR> BackHandler$lambda$0(State<? extends drO<dpR>> state) {
        return state.getValue();
    }
}
