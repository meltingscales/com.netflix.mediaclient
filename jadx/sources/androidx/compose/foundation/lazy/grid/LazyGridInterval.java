package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    private final InterfaceC8613dsb<LazyGridItemScope, Integer, Composer, Integer, dpR> item;
    private final drM<Integer, Object> key;
    private final drX<LazyGridItemSpanScope, Integer, GridItemSpan> span;
    private final drM<Integer, Object> type;

    public final InterfaceC8613dsb<LazyGridItemScope, Integer, Composer, Integer, dpR> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public drM<Integer, Object> getKey() {
        return this.key;
    }

    public final drX<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public drM<Integer, Object> getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridInterval(drM<? super Integer, ? extends Object> drm, drX<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> drx, drM<? super Integer, ? extends Object> drm2, InterfaceC8613dsb<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        this.key = drm;
        this.span = drx;
        this.type = drm2;
        this.item = interfaceC8613dsb;
    }
}
