package androidx.compose.runtime;

import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public interface ReusableComposition extends Composition {
    void deactivate();

    void setContentWithReuse(drX<? super Composer, ? super Integer, dpR> drx);
}
