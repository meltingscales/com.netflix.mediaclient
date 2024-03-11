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
public final class DragGestureDetectorKt$detectDragGestures$5 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<PointerInputChange, Offset, dpR> $onDrag;
    final /* synthetic */ drO<dpR> $onDragCancel;
    final /* synthetic */ drO<dpR> $onDragEnd;
    final /* synthetic */ drM<Offset, dpR> $onDragStart;
    float F$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$5(drM<? super Offset, dpR> drm, drX<? super PointerInputChange, ? super Offset, dpR> drx, drO<dpR> dro, drO<dpR> dro2, InterfaceC8585dra<? super DragGestureDetectorKt$detectDragGestures$5> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$onDragStart = drm;
        this.$onDrag = drx;
        this.$onDragCancel = dro;
        this.$onDragEnd = dro2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, interfaceC8585dra);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // o.drX
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d2 -> B:65:0x01fc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x017b -> B:65:0x01fc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01c7 -> B:57:0x01d1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01e0 -> B:22:0x00ef). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01f9 -> B:65:0x01fc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0261 -> B:22:0x00ef). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
