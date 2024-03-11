package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    private final MutableState<dpR> state;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static MutableState<dpR> m381constructorimpl(MutableState<dpR> mutableState) {
        return mutableState;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m383equalsimpl(MutableState<dpR> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && C8632dsu.c(mutableState, ((ObservableScopeInvalidator) obj).m387unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m384hashCodeimpl(MutableState<dpR> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m386toStringimpl(MutableState<dpR> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m383equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m384hashCodeimpl(this.state);
    }

    public String toString() {
        return m386toStringimpl(this.state);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ MutableState m387unboximpl() {
        return this.state;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ MutableState m382constructorimpl$default(MutableState mutableState, int i, C8627dsp c8627dsp) {
        if ((i & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(dpR.c, SnapshotStateKt.neverEqualPolicy());
        }
        return m381constructorimpl(mutableState);
    }

    /* renamed from: attachToScope-impl  reason: not valid java name */
    public static final void m380attachToScopeimpl(MutableState<dpR> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: invalidateScope-impl  reason: not valid java name */
    public static final void m385invalidateScopeimpl(MutableState<dpR> mutableState) {
        mutableState.setValue(dpR.c);
    }
}
