package androidx.compose.runtime;

import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public interface Composition {
    void dispose();

    boolean getHasInvalidations();

    boolean isDisposed();

    void setContent(drX<? super Composer, ? super Integer, dpR> drx);
}
