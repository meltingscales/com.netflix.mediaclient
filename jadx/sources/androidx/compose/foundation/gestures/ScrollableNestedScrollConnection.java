package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;
    private final ScrollingLogic scrollingLogic;

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long mo201onPreScrollOzD1aCk(long j, int i) {
        if (NestedScrollSource.m1676equalsimpl0(i, NestedScrollSource.Companion.m1681getFlingWNlRxjI())) {
            this.scrollingLogic.registerNestedFling(true);
        }
        return Offset.Companion.m1149getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long mo200onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.enabled) {
            return this.scrollingLogic.m205performRawScrollMKHz9U(j2);
        }
        return Offset.Companion.m1149getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo199onPostFlingRZ2iAVY(long r3, long r5, o.InterfaceC8585dra<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 + r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = o.C8588drd.c()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            long r5 = r3.J$0
            java.lang.Object r3 = r3.L$0
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection) r3
            o.C8556dpz.d(r4)
            goto L4e
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L37:
            o.C8556dpz.d(r4)
            boolean r4 = r2.enabled
            if (r4 == 0) goto L59
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r2.scrollingLogic
            r3.L$0 = r2
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.m203doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L4d
            return r7
        L4d:
            r3 = r2
        L4e:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r0 = r4.m2593unboximpl()
            long r4 = androidx.compose.ui.unit.Velocity.m2589minusAH228Gc(r5, r0)
            goto L60
        L59:
            androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r3.m2594getZero9UxMQ8M()
            r3 = r2
        L60:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m2580boximpl(r4)
            r4.m2593unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r3 = r3.scrollingLogic
            r5 = 0
            r3.registerNestedFling(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo199onPostFlingRZ2iAVY(long, long, o.dra):java.lang.Object");
    }
}
