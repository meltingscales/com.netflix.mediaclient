package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import o.C8569dql;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    private List<Integer> _headerIndexes;
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    public LazyListIntervalContent(drM<? super LazyListScope, dpR> drm) {
        drm.invoke(this);
    }

    public final List<Integer> getHeaderIndexes() {
        List<Integer> i;
        List<Integer> list = this._headerIndexes;
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i, drM<? super Integer, ? extends Object> drm, drM<? super Integer, ? extends Object> drm2, InterfaceC8613dsb<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        getIntervals().addInterval(i, new LazyListInterval(drm, drm2, interfaceC8613dsb));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(final Object obj, final Object obj2, final InterfaceC8612dsa<? super LazyItemScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa) {
        getIntervals().addInterval(1, new LazyListInterval(obj != null ? new drM<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i) {
                return obj;
            }

            @Override // o.drM
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, new drM<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i) {
                return obj2;
            }

            @Override // o.drM
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // o.InterfaceC8613dsb
            public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return dpR.c;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                if ((i2 & 14) == 0) {
                    i2 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if ((i2 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010194746, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                interfaceC8612dsa.invoke(lazyItemScope, composer, Integer.valueOf(i2 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
    }
}
