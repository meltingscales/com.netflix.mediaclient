package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<dpR> $onDragCancel;
    final /* synthetic */ drO<dpR> $onDragEnd;
    final /* synthetic */ drM<Offset, dpR> $onDragStart;
    final /* synthetic */ drX<PointerInputChange, Float, dpR> $onVerticalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(drM<? super Offset, dpR> drm, drX<? super PointerInputChange, ? super Float, dpR> drx, drO<dpR> dro, drO<dpR> dro2, InterfaceC8585dra<? super DragGestureDetectorKt$detectVerticalDragGestures$5> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$onDragStart = drm;
        this.$onVerticalDrag = drx;
        this.$onDragEnd = dro;
        this.$onDragCancel = dro2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC8585dra);
        dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // o.drX
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            o.C8556dpz.d(r13)
            goto La7
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r3 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
            o.C8556dpz.d(r13)
            goto L72
        L2a:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            o.C8556dpz.d(r13)
            goto L4d
        L32:
            o.C8556dpz.d(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r12.L$0 = r13
            r12.label = r4
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r13
            r8 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L4a
            return r0
        L4a:
            r11 = r1
            r1 = r13
            r13 = r11
        L4d:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            long r5 = r13.m1727getIdJ3iCeTQ()
            int r7 = r13.m1732getTypeT8wyACA()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
            r8.<init>()
            r12.L$0 = r1
            r12.L$1 = r10
            r12.label = r3
            r4 = r1
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m168awaitVerticalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
            if (r13 != r0) goto L70
            return r0
        L70:
            r3 = r1
            r1 = r10
        L72:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            if (r13 == 0) goto Lba
            o.drM<androidx.compose.ui.geometry.Offset, o.dpR> r4 = r12.$onDragStart
            long r5 = r13.m1729getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m1126boximpl(r5)
            r4.invoke(r5)
            o.drX<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, o.dpR> r4 = r12.$onVerticalDrag
            float r1 = r1.d
            java.lang.Float r1 = o.C8589dre.e(r1)
            r4.invoke(r13, r1)
            long r4 = r13.m1727getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
            o.drX<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, o.dpR> r1 = r12.$onVerticalDrag
            r13.<init>()
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m172verticalDragjO51t88(r3, r4, r13, r12)
            if (r13 != r0) goto La7
            return r0
        La7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb5
            o.drO<o.dpR> r13 = r12.$onDragEnd
            r13.invoke()
            goto Lba
        Lb5:
            o.drO<o.dpR> r13 = r12.$onDragCancel
            r13.invoke()
        Lba:
            o.dpR r13 = o.dpR.c
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
