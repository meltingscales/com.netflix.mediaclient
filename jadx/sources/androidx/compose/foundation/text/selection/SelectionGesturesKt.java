package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.List;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    public static final Modifier updateSelectionTouchMode(Modifier modifier, drM<? super Boolean, dpR> drm) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) 8675309, (drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object>) new SelectionGesturesKt$updateSelectionTouchMode$1(drm, null));
    }

    public static final Modifier selectionGestureInput(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:13:0x0031, B:31:0x00a2, B:33:0x00aa, B:35:0x00b9, B:37:0x00c5, B:38:0x00c8, B:39:0x00cb, B:40:0x00cf, B:18:0x0049, B:24:0x0070, B:26:0x0074, B:28:0x0082, B:21:0x0053), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:13:0x0031, B:31:0x00a2, B:33:0x00aa, B:35:0x00b9, B:37:0x00c5, B:38:0x00c8, B:39:0x00cb, B:40:0x00cf, B:18:0x0049, B:24:0x0070, B:26:0x0074, B:28:0x0082, B:21:0x0053), top: B:46:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, final androidx.compose.foundation.text.TextDragObserver r10, androidx.compose.ui.input.pointer.PointerEvent r11, o.InterfaceC8585dra<? super o.dpR> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$1
            r10 = r9
            androidx.compose.foundation.text.TextDragObserver r10 = (androidx.compose.foundation.text.TextDragObserver) r10
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            o.C8556dpz.d(r12)     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto La2
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            java.lang.Object r10 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r10 = (androidx.compose.foundation.text.TextDragObserver) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            o.C8556dpz.d(r12)     // Catch: java.util.concurrent.CancellationException -> Ld5
            r8 = r11
            r11 = r9
            r9 = r8
            goto L70
        L50:
            o.C8556dpz.d(r12)
            java.util.List r11 = r11.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r11 = o.C8570dqm.b(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r5 = r11.m1727getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$2 = r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m167awaitLongPressOrCancellationrnUCldI(r9, r5, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r12 != r1) goto L70
            return r1
        L70:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r12 == 0) goto Ld2
            long r4 = r11.m1729getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r6 = r12.m1729getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r11 = m523distanceIsTolerable2x9bVx0(r9, r4, r6)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 == 0) goto Ld2
            long r4 = r12.m1729getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r10.mo453onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r11 = r12.m1727getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> Ld5
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m169dragjO51t88(r9, r11, r2, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r12 != r1) goto La2
            return r1
        La2:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r11 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 == 0) goto Lcf
            androidx.compose.ui.input.pointer.PointerEvent r9 = r9.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.util.List r9 = r9.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            int r11 = r9.size()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r12 = 0
        Lb7:
            if (r12 >= r11) goto Lcb
            java.lang.Object r0 = r9.get(r12)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r1 == 0) goto Lc8
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Lc8:
            int r12 = r12 + 1
            goto Lb7
        Lcb:
            r10.onStop()     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto Ld2
        Lcf:
            r10.onCancel()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Ld2:
            o.dpR r9 = o.dpR.c
            return r9
        Ld5:
            r9 = move-exception
            r10.onCancel()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, final androidx.compose.foundation.text.selection.MouseSelectionObserver r8, androidx.compose.foundation.text.selection.ClicksCounter r9, androidx.compose.ui.input.pointer.PointerEvent r10, o.InterfaceC8585dra<? super o.dpR> r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, o.InterfaceC8585dra<? super androidx.compose.ui.input.pointer.PointerEvent> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            o.C8556dpz.d(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            o.C8556dpz.d(r8)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.dra):java.lang.Object");
    }

    /* renamed from: distanceIsTolerable-2x9bVx0  reason: not valid java name */
    private static final boolean m523distanceIsTolerable2x9bVx0(AwaitPointerEventScope awaitPointerEventScope, long j, long j2) {
        return Offset.m1135getDistanceimpl(Offset.m1141minusMKHz9U(j, j2)) < awaitPointerEventScope.getViewConfiguration().getTouchSlop();
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m1754equalsimpl0(changes.get(i).m1732getTypeT8wyACA(), PointerType.Companion.m1759getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
