package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    private final drO<LazyLayoutItemProvider> itemProvider;
    private final Map<Object, CachedItemContent> lambdasCache = new LinkedHashMap();
    private final SaveableStateHolder saveableStateHolder;

    public final drO<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, drO<? extends LazyLayoutItemProvider> dro) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = dro;
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        int index = invoke.getIndex(obj);
        if (index != -1) {
            return invoke.getContentType(index);
        }
        return null;
    }

    public final drX<Composer, Integer, dpR> getContent(int i, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i && C8632dsu.c(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i, obj, obj2);
        this.lambdasCache.put(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    /* loaded from: classes.dex */
    final class CachedItemContent {
        private drX<? super Composer, ? super Integer, dpR> _content;
        private final Object contentType;
        private int index;
        private final Object key;

        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Object getKey() {
            return this.key;
        }

        public CachedItemContent(int i, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i;
        }

        public final drX<Composer, Integer, dpR> getContent() {
            drX drx = this._content;
            if (drx == null) {
                drX<Composer, Integer, dpR> createContentLambda = createContentLambda();
                this._content = createContentLambda;
                return createContentLambda;
            }
            return drx;
        }

        private final drX<Composer, Integer, dpR> createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer, int i) {
                    SaveableStateHolder saveableStateHolder;
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                        }
                        LazyLayoutItemProvider invoke = LazyLayoutItemContentFactory.this.getItemProvider().invoke();
                        int index = this.getIndex();
                        if ((index >= invoke.getItemCount() || !C8632dsu.c(invoke.getKey(index), this.getKey())) && (index = invoke.getIndex(this.getKey())) != -1) {
                            this.index = index;
                        }
                        int i2 = index;
                        boolean z = i2 != -1;
                        LazyLayoutItemContentFactory lazyLayoutItemContentFactory2 = LazyLayoutItemContentFactory.this;
                        LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                        composer.startReusableGroup(207, Boolean.valueOf(z));
                        boolean changed = composer.changed(z);
                        if (z) {
                            saveableStateHolder = lazyLayoutItemContentFactory2.saveableStateHolder;
                            LazyLayoutItemContentFactoryKt.m374access$SkippableItemJVlU9Rs(invoke, StableValue.m388constructorimpl(saveableStateHolder), i2, StableValue.m388constructorimpl(cachedItemContent.getKey()), composer, 0);
                        } else {
                            composer.deactivateToEndGroup(changed);
                        }
                        composer.endReusableGroup();
                        Object key = this.getKey();
                        final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = this;
                        EffectsKt.DisposableEffect(key, new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.2
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent3 = LazyLayoutItemContentFactory.CachedItemContent.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                                    }
                                };
                            }
                        }, composer, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
        }
    }
}
