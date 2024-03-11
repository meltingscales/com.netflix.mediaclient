package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import o.C8627dsp;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private boolean hasCustomSpans;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final drX<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new drX<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$Companion$DefaultSpan$1
        @Override // o.drX
        public /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m339boximpl(m348invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw  reason: not valid java name */
        public final long m348invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    public LazyGridIntervalContent(drM<? super LazyGridScope, dpR> drm) {
        drm.invoke(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i, drM<? super Integer, ? extends Object> drm, drX<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> drx, drM<? super Integer, ? extends Object> drm2, InterfaceC8613dsb<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        getIntervals().addInterval(i, new LazyGridInterval(drm, drx == null ? DefaultSpan : drx, drm2, interfaceC8613dsb));
        if (drx != null) {
            this.hasCustomSpans = true;
        }
    }

    /* loaded from: classes.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
