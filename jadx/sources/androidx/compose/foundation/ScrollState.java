package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import o.C8586drb;
import o.C8627dsp;
import o.C8657dts;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dsT;

/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new drX<SaverScope, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // o.drX
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            return Integer.valueOf(scrollState.getValue());
        }
    }, new drM<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @Override // o.drM
        public /* synthetic */ ScrollState invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final ScrollState invoke(int i) {
            return new ScrollState(i);
        }
    });
    private float accumulator;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new drM<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }

        public final Float invoke(float f) {
            float f2;
            float a;
            int e;
            f2 = ScrollState.this.accumulator;
            float value = ScrollState.this.getValue() + f + f2;
            a = C8657dts.a(value, 0.0f, ScrollState.this.getMaxValue());
            boolean z = value == a;
            float value2 = a - ScrollState.this.getValue();
            e = dsT.e(value2);
            ScrollState scrollState = ScrollState.this;
            scrollState.setValue(scrollState.getValue() + e);
            ScrollState.this.accumulator = value2 - e;
            if (!z) {
                f = value2;
            }
            return Float.valueOf(f);
        }
    });
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new drO<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Boolean invoke() {
            return Boolean.valueOf(ScrollState.this.getValue() < ScrollState.this.getMaxValue());
        }
    });
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new drO<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Boolean invoke() {
            return Boolean.valueOf(ScrollState.this.getValue() > 0);
        }
    });

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public ScrollState(int i) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final void setMaxValue$foundation_release(int i) {
        this._maxValueState.setIntValue(i);
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            if (getValue() > i) {
                setValue(i);
            }
            dpR dpr = dpR.c;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, drX<? super ScrollScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object scroll = this.scrollableState.scroll(mutatePriority, drx, interfaceC8585dra);
        e = C8586drb.e();
        return scroll == e ? scroll : dpR.c;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i) {
        this.value$delegate.setIntValue(i);
    }

    public final void setViewportSize$foundation_release(int i) {
        this.viewportSize$delegate.setIntValue(i);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }
}
