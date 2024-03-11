package androidx.compose.ui.focus;

import o.drM;

/* loaded from: classes.dex */
public interface FocusProperties {
    boolean getCanFocus();

    void setCanFocus(boolean z);

    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    default drM<FocusDirection, FocusRequester> getEnter() {
        return new drM<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // o.drM
            public /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m1095invoke3ESFkO8(focusDirection.m1081unboximpl());
            }

            /* renamed from: invoke-3ESFkO8  reason: not valid java name */
            public final FocusRequester m1095invoke3ESFkO8(int i) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    default drM<FocusDirection, FocusRequester> getExit() {
        return new drM<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // o.drM
            public /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m1096invoke3ESFkO8(focusDirection.m1081unboximpl());
            }

            /* renamed from: invoke-3ESFkO8  reason: not valid java name */
            public final FocusRequester m1096invoke3ESFkO8(int i) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }
}
