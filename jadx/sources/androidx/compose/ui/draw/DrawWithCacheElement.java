package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {
    private final drM<CacheDrawScope, DrawResult> onBuildDrawCache;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && C8632dsu.c(this.onBuildDrawCache, ((DrawWithCacheElement) obj).onBuildDrawCache);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(drM<? super CacheDrawScope, DrawResult> drm) {
        this.onBuildDrawCache = drm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CacheDrawModifierNodeImpl create() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.setBlock(this.onBuildDrawCache);
    }
}
