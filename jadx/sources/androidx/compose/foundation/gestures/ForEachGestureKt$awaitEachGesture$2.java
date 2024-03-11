package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drX;

/* loaded from: classes.dex */
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> $block;
    final /* synthetic */ dqZ $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForEachGestureKt$awaitEachGesture$2(dqZ dqz, drX<? super AwaitPointerEventScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super ForEachGestureKt$awaitEachGesture$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$currentContext = dqz;
        this.$block = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, interfaceC8585dra);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // o.drX
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: CancellationException -> 0x0031, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:21:0x0043, B:24:0x0050, B:11:0x0025, B:14:0x002d), top: B:35:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0058 -> B:19:0x003b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006b -> B:19:0x003b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            o.C8556dpz.d(r7)
            goto L3b
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            o.C8556dpz.d(r7)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L3b
        L29:
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            o.C8556dpz.d(r7)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L50
        L31:
            r7 = move-exception
            goto L5b
        L33:
            o.C8556dpz.d(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
        L3b:
            o.dqZ r7 = r6.$currentContext
            boolean r7 = o.dxG.b(r7)
            if (r7 == 0) goto L6f
            o.drX<androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.dra<? super o.dpR>, java.lang.Object> r7 = r6.$block     // Catch: java.util.concurrent.CancellationException -> L31
            r6.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L31
            r6.label = r4     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r7 = r7.invoke(r1, r6)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r7 != r0) goto L50
            return r0
        L50:
            r6.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L31
            r6.label = r3     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r7 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r6)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r7 != r0) goto L3b
            return r0
        L5b:
            o.dqZ r5 = r6.$currentContext
            boolean r5 = o.dxG.b(r5)
            if (r5 == 0) goto L6e
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r6)
            if (r7 != r0) goto L3b
            return r0
        L6e:
            throw r7
        L6f:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
