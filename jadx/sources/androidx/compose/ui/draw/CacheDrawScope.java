package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private DrawResult drawResult;

    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    public final void setCacheParams$ui_release(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setDrawResult$ui_release(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m1067getSizeNHjbRc() {
        return this.cacheParams.mo1066getSizeNHjbRc();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final DrawResult onDrawWithContent(drM<? super ContentDrawScope, dpR> drm) {
        DrawResult drawResult = new DrawResult(drm);
        this.drawResult = drawResult;
        return drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }
}
