package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class DrawResult {
    private drM<? super ContentDrawScope, dpR> block;

    public final drM<ContentDrawScope, dpR> getBlock$ui_release() {
        return this.block;
    }

    public DrawResult(drM<? super ContentDrawScope, dpR> drm) {
        this.block = drm;
    }
}
