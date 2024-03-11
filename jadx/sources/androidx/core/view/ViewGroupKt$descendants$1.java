package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dtW;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements drX<dtW<? super View>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, InterfaceC8585dra<? super ViewGroupKt$descendants$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_descendants = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, interfaceC8585dra);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    @Override // o.drX
    public final Object invoke(dtW<? super View> dtw, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ViewGroupKt$descendants$1) create(dtw, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:22:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:24:0x008f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            int r1 = r9.I$1
            int r4 = r9.I$0
            java.lang.Object r5 = r9.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r9.L$0
            o.dtW r6 = (o.dtW) r6
            o.C8556dpz.d(r10)
            goto L88
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            int r1 = r9.I$1
            int r4 = r9.I$0
            java.lang.Object r5 = r9.L$2
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r9.L$1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r9.L$0
            o.dtW r7 = (o.dtW) r7
            o.C8556dpz.d(r10)
            r10 = r7
            goto L68
        L3c:
            o.C8556dpz.d(r10)
            java.lang.Object r10 = r9.L$0
            o.dtW r10 = (o.dtW) r10
            android.view.ViewGroup r1 = r9.$this_descendants
            int r4 = r1.getChildCount()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L94
            android.view.View r6 = r1.getChildAt(r5)
            r9.L$0 = r10
            r9.L$1 = r1
            r9.L$2 = r6
            r9.I$0 = r5
            r9.I$1 = r4
            r9.label = r3
            java.lang.Object r7 = r10.d(r6, r9)
            if (r7 != r0) goto L63
            return r0
        L63:
            r8 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r8
        L68:
            boolean r7 = r5 instanceof android.view.ViewGroup
            if (r7 == 0) goto L8d
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            o.dtQ r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r9.L$0 = r10
            r9.L$1 = r6
            r7 = 0
            r9.L$2 = r7
            r9.I$0 = r4
            r9.I$1 = r1
            r9.label = r2
            java.lang.Object r5 = r10.b(r5, r9)
            if (r5 != r0) goto L86
            return r0
        L86:
            r5 = r6
            r6 = r10
        L88:
            r10 = r6
            r8 = r5
            r5 = r1
            r1 = r8
            goto L8f
        L8d:
            r5 = r1
            r1 = r6
        L8f:
            int r4 = r4 + r3
            r8 = r5
            r5 = r4
            r4 = r8
            goto L4a
        L94:
            o.dpR r10 = o.dpR.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
