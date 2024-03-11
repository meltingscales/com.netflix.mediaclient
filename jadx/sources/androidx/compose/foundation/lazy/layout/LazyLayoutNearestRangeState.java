package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import o.C8627dsp;
import o.C8654dtp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<C8654dtp> {
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    public LazyLayoutNearestRangeState(int i, int i2, int i3) {
        this.slidingWindowSize = i2;
        this.extraItemCount = i3;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i, i2, i3), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i;
    }

    public final void update(int i) {
        if (i != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i;
            setValue(Companion.calculateNearestItemsRange(i, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* loaded from: classes.dex */
    static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C8654dtp calculateNearestItemsRange(int i, int i2, int i3) {
            C8654dtp g;
            int i4 = (i / i2) * i2;
            g = C8657dts.g(Math.max(i4 - i3, 0), i4 + i2 + i3);
            return g;
        }
    }

    @Override // androidx.compose.runtime.State
    public C8654dtp getValue() {
        return (C8654dtp) this.value$delegate.getValue();
    }

    private void setValue(C8654dtp c8654dtp) {
        this.value$delegate.setValue(c8654dtp);
    }
}
