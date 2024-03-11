package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import o.drM;

/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    private boolean canFocus = true;
    private FocusRequester down;
    private FocusRequester end;
    private drM<? super FocusDirection, FocusRequester> enter;
    private drM<? super FocusDirection, FocusRequester> exit;
    private FocusRequester left;
    private FocusRequester next;
    private FocusRequester previous;
    private FocusRequester right;
    private FocusRequester start;
    private FocusRequester up;

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public drM<FocusDirection, FocusRequester> getEnter() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public drM<FocusDirection, FocusRequester> getExit() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        this.canFocus = z;
    }

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.enter = new drM<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
            @Override // o.drM
            public /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m1097invoke3ESFkO8(focusDirection.m1081unboximpl());
            }

            /* renamed from: invoke-3ESFkO8  reason: not valid java name */
            public final FocusRequester m1097invoke3ESFkO8(int i) {
                return FocusRequester.Companion.getDefault();
            }
        };
        this.exit = new drM<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
            @Override // o.drM
            public /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m1098invoke3ESFkO8(focusDirection.m1081unboximpl());
            }

            /* renamed from: invoke-3ESFkO8  reason: not valid java name */
            public final FocusRequester m1098invoke3ESFkO8(int i) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }
}
