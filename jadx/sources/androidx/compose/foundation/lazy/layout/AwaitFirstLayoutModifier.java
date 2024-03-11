package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import kotlin.Result;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    private InterfaceC8585dra<? super dpR> continuation;
    private boolean wasPositioned;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitForFirstLayout(o.InterfaceC8585dra<? super o.dpR> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            o.dra r1 = (o.InterfaceC8585dra) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            o.C8556dpz.d(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            o.C8556dpz.d(r5)
            boolean r5 = r4.wasPositioned
            if (r5 != 0) goto L71
            o.dra<? super o.dpR> r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            o.drc r2 = new o.drc
            o.dra r3 = o.C8588drd.c(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.b()
            java.lang.Object r3 = o.C8588drd.c()
            if (r2 != r3) goto L60
            o.C8592drh.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            kotlin.Result$c r5 = kotlin.Result.e
            o.dpR r5 = o.dpR.c
            java.lang.Object r5 = kotlin.Result.e(r5)
            r1.resumeWith(r5)
        L71:
            o.dpR r5 = o.dpR.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.waitForFirstLayout(o.dra):java.lang.Object");
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        InterfaceC8585dra<? super dpR> interfaceC8585dra = this.continuation;
        if (interfaceC8585dra != null) {
            Result.c cVar = Result.e;
            interfaceC8585dra.resumeWith(Result.e(dpR.c));
        }
        this.continuation = null;
    }
}
