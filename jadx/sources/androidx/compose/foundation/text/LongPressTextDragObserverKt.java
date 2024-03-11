package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwY;

/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {
    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = dwY.b(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, null), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, null), interfaceC8585dra);
        e = C8586drb.e();
        return awaitEachGesture == e ? awaitEachGesture : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new drM<Offset, dpR>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Offset offset) {
                m420invokek4lQ0M(offset.m1146unboximpl());
                return dpR.c;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m420invokek4lQ0M(long j) {
                TextDragObserver.this.mo453onStartk4lQ0M(j);
            }
        }, new drO<dpR>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextDragObserver.this.onStop();
            }
        }, new drO<dpR>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextDragObserver.this.onCancel();
            }
        }, new drX<PointerInputChange, Offset, dpR>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(PointerInputChange pointerInputChange, Offset offset) {
                m421invokeUv8p0NA(pointerInputChange, offset.m1146unboximpl());
                return dpR.c;
            }

            /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
            public final void m421invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                TextDragObserver.this.mo452onDragk4lQ0M(j);
            }
        }, interfaceC8585dra);
        e = C8586drb.e();
        return detectDragGestures == e ? detectDragGestures : dpR.c;
    }
}
