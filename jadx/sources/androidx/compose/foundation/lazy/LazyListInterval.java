package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {
    private final InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR> item;
    private final drM<Integer, Object> key;
    private final drM<Integer, Object> type;

    public final InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public drM<Integer, Object> getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public drM<Integer, Object> getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListInterval(drM<? super Integer, ? extends Object> drm, drM<? super Integer, ? extends Object> drm2, InterfaceC8613dsb<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        this.key = drm;
        this.type = drm2;
        this.item = interfaceC8613dsb;
    }
}
