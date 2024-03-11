package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollDraggableState implements DraggableState, DragScope {
    private ScrollScope latestScrollScope;
    private ScrollingLogic scrollLogic;

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        this.latestScrollScope = scrollScope;
    }

    public ScrollDraggableState(ScrollingLogic scrollingLogic) {
        ScrollScope scrollScope;
        this.scrollLogic = scrollingLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f) {
        ScrollingLogic scrollingLogic = this.scrollLogic;
        scrollingLogic.m202dispatchScroll3eAAhYA(this.latestScrollScope, scrollingLogic.m211toOffsettuRUvjQ(f), NestedScrollSource.Companion.m1680getDragWNlRxjI());
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, drX<? super DragScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object scroll = this.scrollLogic.getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, drx, null), interfaceC8585dra);
        e = C8586drb.e();
        return scroll == e ? scroll : dpR.c;
    }
}
