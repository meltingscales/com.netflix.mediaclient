package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import o.C8627dsp;
import o.drM;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final Companion Companion = new Companion(null);
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, LayoutDirection layoutDirection, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8  reason: not valid java name */
    public <T> T mo372layouto7g1Pn8(final int i, drM<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> drm) {
        int firstPlacedIndex;
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return drm.invoke(emptyBeyondBoundsScope);
        }
        if (m370isForward4vf7U8o(i)) {
            firstPlacedIndex = this.state.getLastPlacedIndex();
        } else {
            firstPlacedIndex = this.state.getFirstPlacedIndex();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = (T) this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
        T t = null;
        while (t == null && m369hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d, i)) {
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d);
            objectRef.d = (T) m368addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d, i);
            this.state.remeasure();
            t = drm.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    boolean m369hasMoreContentFR3nfPY;
                    m369hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierLocal.this.m369hasMoreContentFR3nfPY(objectRef.d, i);
                    return m369hasMoreContentFR3nfPY;
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.d);
        this.state.remeasure();
        return t;
    }

    /* renamed from: isForward-4vf7U8o  reason: not valid java name */
    private final boolean m370isForward4vf7U8o(int i) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (!BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(i, companion.m1789getBeforehoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(i, companion.m1788getAfterhoxUOeE())) {
                return true;
            }
            if (BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(i, companion.m1787getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(i, companion.m1790getBelowhoxUOeE())) {
                if (!this.reverseLayout) {
                    return true;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(i, companion.m1791getLefthoxUOeE())) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i2 == 1) {
                    return this.reverseLayout;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!this.reverseLayout) {
                    return true;
                }
            } else if (!BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(i, companion.m1792getRighthoxUOeE())) {
                LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                throw new KotlinNothingValueException();
            } else {
                int i3 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.reverseLayout;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (!this.reverseLayout) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: addNextInterval-FR3nfPY  reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m368addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m370isForward4vf7U8o(i)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY  reason: not valid java name */
    public final boolean m369hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        if (m371isOppositeToOrientation4vf7U8o(i)) {
            return false;
        }
        if (m370isForward4vf7U8o(i)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN, SYNTHETIC] */
    /* renamed from: isOppositeToOrientation-4vf7U8o  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m371isOppositeToOrientation4vf7U8o(int r3) {
        /*
            r2 = this;
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion
            int r1 = r0.m1787getAbovehoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(r3, r1)
            if (r1 == 0) goto Ld
            goto L17
        Ld:
            int r1 = r0.m1790getBelowhoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(r3, r1)
            if (r1 == 0) goto L1e
        L17:
            androidx.compose.foundation.gestures.Orientation r3 = r2.orientation
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r3 != r0) goto L50
            goto L39
        L1e:
            int r1 = r0.m1791getLefthoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(r3, r1)
            if (r1 == 0) goto L29
            goto L33
        L29:
            int r1 = r0.m1792getRighthoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(r3, r1)
            if (r1 == 0) goto L3b
        L33:
            androidx.compose.foundation.gestures.Orientation r3 = r2.orientation
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r3 != r0) goto L50
        L39:
            r3 = 1
            goto L51
        L3b:
            int r1 = r0.m1789getBeforehoxUOeE()
            boolean r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(r3, r1)
            if (r1 == 0) goto L46
            goto L50
        L46:
            int r0 = r0.m1788getAfterhoxUOeE()
            boolean r3 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m1783equalsimpl0(r3, r0)
            if (r3 == 0) goto L52
        L50:
            r3 = 0
        L51:
            return r3
        L52:
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection()
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.m371isOppositeToOrientation4vf7U8o(int):boolean");
    }
}
