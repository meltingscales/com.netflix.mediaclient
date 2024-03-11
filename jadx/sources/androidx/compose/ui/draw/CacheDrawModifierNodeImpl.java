package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {
    private drM<? super CacheDrawScope, DrawResult> block;
    private final CacheDrawScope cacheDrawScope;
    private boolean isCacheValid;

    public final drM<CacheDrawScope, DrawResult> getBlock() {
        return this.block;
    }

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, drM<? super CacheDrawScope, DrawResult> drm) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = drm;
        cacheDrawScope.setCacheParams$ui_release(this);
    }

    public final void setBlock(drM<? super CacheDrawScope, DrawResult> drm) {
        this.block = drm;
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        this.isCacheValid = false;
        this.cacheDrawScope.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    private final DrawResult getOrBuildCachedDrawBlock() {
        if (!this.isCacheValid) {
            final CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.setDrawResult$ui_release(null);
            ObserverModifierNodeKt.observeReads(this, new drO<dpR>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
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
                    CacheDrawModifierNodeImpl.this.getBlock().invoke(cacheDrawScope);
                }
            });
            if (cacheDrawScope.getDrawResult$ui_release() == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
            this.isCacheValid = true;
        }
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        C8632dsu.d(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        getOrBuildCachedDrawBlock().getBlock$ui_release().invoke(contentDrawScope);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo1066getSizeNHjbRc() {
        return IntSizeKt.m2553toSizeozmzZPI(DelegatableNodeKt.m1853requireCoordinator64DMado(this, NodeKind.m1935constructorimpl(128)).mo1809getSizeYbymL2g());
    }
}
