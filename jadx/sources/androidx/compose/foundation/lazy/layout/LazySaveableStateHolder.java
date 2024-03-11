package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C8627dsp;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private final Set<Object> previouslyComposedKeys;
    private final MutableState wrappedHolder$delegate;
    private final SaveableStateRegistry wrappedRegistry;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, drO<? extends Object> dro) {
        return this.wrappedRegistry.registerProvider(str, dro);
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry) {
        MutableState mutableStateOf$default;
        this.wrappedRegistry = saveableStateRegistry;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.wrappedHolder$delegate = mutableStateOf$default;
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    public LazySaveableStateHolder(final SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new drM<Object, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry saveableStateRegistry2 = SaveableStateRegistry.this;
                return Boolean.valueOf(saveableStateRegistry2 != null ? saveableStateRegistry2.canBeSaved(obj) : true);
            }
        }));
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            for (Object obj : this.previouslyComposedKeys) {
                wrappedHolder.removeState(obj);
            }
        }
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        wrappedHolder.SaveableStateProvider(obj, drx, startRestartGroup, (i & 112) | 520);
        EffectsKt.DisposableEffect(obj, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                Set set;
                set = LazySaveableStateHolder.this.previouslyComposedKeys;
                set.remove(obj);
                final LazySaveableStateHolder lazySaveableStateHolder = LazySaveableStateHolder.this;
                final Object obj2 = obj;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Set set2;
                        set2 = LazySaveableStateHolder.this.previouslyComposedKeys;
                        set2.add(obj2);
                    }
                };
            }
        }, startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$3
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

                public final void invoke(Composer composer2, int i2) {
                    LazySaveableStateHolder.this.SaveableStateProvider(obj, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        wrappedHolder.removeState(obj);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(final SaveableStateRegistry saveableStateRegistry) {
            return SaverKt.Saver(new drX<SaverScope, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // o.drX
                public final Map<String, List<Object>> invoke(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
                    Map<String, List<Object>> performSave = lazySaveableStateHolder.performSave();
                    if (performSave.isEmpty()) {
                        return null;
                    }
                    return performSave;
                }
            }, new drM<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> map) {
                    return new LazySaveableStateHolder(SaveableStateRegistry.this, map);
                }
            });
        }
    }

    public final SaveableStateHolder getWrappedHolder() {
        return (SaveableStateHolder) this.wrappedHolder$delegate.getValue();
    }

    public final void setWrappedHolder(SaveableStateHolder saveableStateHolder) {
        this.wrappedHolder$delegate.setValue(saveableStateHolder);
    }
}
