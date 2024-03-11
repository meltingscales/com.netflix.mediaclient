package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8627dsp;
import o.dpR;
import o.dqE;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new drX<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // o.drX
        public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
            Map<Object, Map<String, List<Object>>> saveAll;
            saveAll = saveableStateHolderImpl.saveAll();
            return saveAll;
        }
    }, new drM<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Override // o.drM
        public /* bridge */ /* synthetic */ SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return invoke2((Map<Object, Map<String, List<Object>>>) map);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final SaveableStateHolderImpl invoke2(Map<Object, Map<String, List<Object>>> map) {
            return new SaveableStateHolderImpl(map);
        }
    });
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final Map<Object, RegistryHolder> registryHolders;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    public SaveableStateHolderImpl() {
        this(null, 1, null);
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        startRestartGroup.startReplaceableGroup(444418301);
        startRestartGroup.startReusableGroup(207, obj);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry parentSaveableStateRegistry = getParentSaveableStateRegistry();
            if (parentSaveableStateRegistry != null && !parentSaveableStateRegistry.canBeSaved(obj)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            rememberedValue = new RegistryHolder(obj);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final RegistryHolder registryHolder = (RegistryHolder) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry()), drx, startRestartGroup, i & 112);
        EffectsKt.DisposableEffect(dpR.c, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                Map map;
                Map map2;
                map = SaveableStateHolderImpl.this.registryHolders;
                boolean containsKey = map.containsKey(obj);
                Object obj2 = obj;
                if (!containsKey) {
                    SaveableStateHolderImpl.this.savedStates.remove(obj);
                    map2 = SaveableStateHolderImpl.this.registryHolders;
                    map2.put(obj, registryHolder);
                    final SaveableStateHolderImpl.RegistryHolder registryHolder2 = registryHolder;
                    final SaveableStateHolderImpl saveableStateHolderImpl = SaveableStateHolderImpl.this;
                    final Object obj3 = obj;
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Map map3;
                            SaveableStateHolderImpl.RegistryHolder.this.saveTo(saveableStateHolderImpl.savedStates);
                            map3 = saveableStateHolderImpl.registryHolders;
                            map3.remove(obj3);
                        }
                    };
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            }
        }, startRestartGroup, 6);
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$2
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
                    SaveableStateHolderImpl.this.SaveableStateProvider(obj, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> k;
        k = dqE.k(this.savedStates);
        for (RegistryHolder registryHolder : this.registryHolders.values()) {
            registryHolder.saveTo(k);
        }
        if (k.isEmpty()) {
            return null;
        }
        return k;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        RegistryHolder registryHolder = this.registryHolders.get(obj);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(obj);
        }
    }

    /* loaded from: classes.dex */
    public final class RegistryHolder {
        private final Object key;
        private final SaveableStateRegistry registry;
        private boolean shouldSave = true;

        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final void setShouldSave(boolean z) {
            this.shouldSave = z;
        }

        public RegistryHolder(Object obj) {
            this.key = obj;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) SaveableStateHolderImpl.this.savedStates.get(obj), new drM<Object, Boolean>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$RegistryHolder$registry$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drM
                public final Boolean invoke(Object obj2) {
                    SaveableStateRegistry parentSaveableStateRegistry = SaveableStateHolderImpl.this.getParentSaveableStateRegistry();
                    return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj2) : true);
                }
            });
        }

        public final void saveTo(Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> performSave = this.registry.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, performSave);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }
}
