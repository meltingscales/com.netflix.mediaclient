package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class VNode {
    private drM<? super VNode, dpR> invalidateListener;

    public /* synthetic */ VNode(C8627dsp c8627dsp) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public drM<VNode, dpR> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public void setInvalidateListener$ui_release(drM<? super VNode, dpR> drm) {
        this.invalidateListener = drm;
    }

    private VNode() {
    }

    public final void invalidate() {
        drM<VNode, dpR> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }
}
