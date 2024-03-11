package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo173calculateDeltaChangek4lQ0M(long j) {
            return Math.abs(Offset.m1137getXimpl(j));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo174calculatePostSlopOffset8S9VItk(long j, float f) {
            return OffsetKt.Offset(Offset.m1137getXimpl(j) - (Math.signum(Offset.m1137getXimpl(j)) * f), Offset.m1138getYimpl(j));
        }
    };
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M */
        public float mo173calculateDeltaChangek4lQ0M(long j) {
            return Math.abs(Offset.m1138getYimpl(j));
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk */
        public long mo174calculatePostSlopOffset8S9VItk(long j, float f) {
            return OffsetKt.Offset(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j) - (Math.signum(Offset.m1138getYimpl(j)) * f));
        }
    };
    private static final PointerDirectionConfig BidirectionalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$BidirectionalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculateDeltaChange-k-4lQ0M  reason: not valid java name */
        public float mo173calculateDeltaChangek4lQ0M(long j) {
            return Offset.m1135getDistanceimpl(j);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: calculatePostSlopOffset-8S9VItk  reason: not valid java name */
        public long mo174calculatePostSlopOffset8S9VItk(long j, float f) {
            return Offset.m1141minusMKHz9U(j, Offset.m1143timestuRUvjQ(Offset.m1132divtuRUvjQ(j, mo173calculateDeltaChangek4lQ0M(j)), f));
        }
    };

    /* renamed from: access$isPointerUp-DmW0f2w */
    public static final /* synthetic */ boolean m165access$isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        return m170isPointerUpDmW0f2w(pointerEvent, j);
    }

    public static final PointerDirectionConfig getBidirectionalPointerDirectionConfig() {
        return BidirectionalPointerDirectionConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0048 -> B:45:0x004b). Please submit an issue!!! */
    /* renamed from: drag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m169dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, o.drM<? super androidx.compose.ui.input.pointer.PointerInputChange, o.dpR> r7, o.InterfaceC8585dra<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            o.drM r4 = (o.drM) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            o.C8556dpz.d(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            o.C8556dpz.d(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m166awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = o.C8589dre.e(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = o.C8589dre.e(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m1727getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m169dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, o.drM, o.dra):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ca, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0067 -> B:81:0x006c). Please submit an issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m166awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, o.InterfaceC8585dra<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m166awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, o.dra):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, drM<? super Offset, dpR> drm, drO<dpR> dro, drO<dpR> dro2, drX<? super PointerInputChange, ? super Offset, dpR> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(drm, drx, dro2, dro, null), interfaceC8585dra);
        e = C8586drb.e();
        return awaitEachGesture == e ? awaitEachGesture : dpR.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0166, code lost:
        if (r9.isConsumed() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0127 -> B:131:0x016b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x015f -> B:127:0x0162). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x018a -> B:130:0x016a). Please submit an issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m168awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, o.drX<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, o.dpR> r23, o.InterfaceC8585dra<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m168awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, o.drX, o.dra):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ea, code lost:
        if ((!r0) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0079 -> B:94:0x007e). Please submit an issue!!! */
    /* renamed from: verticalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m172verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, o.drM<? super androidx.compose.ui.input.pointer.PointerInputChange, o.dpR> r20, o.InterfaceC8585dra<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m172verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, o.drM, o.dra):java.lang.Object");
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, drM<? super Offset, dpR> drm, drO<dpR> dro, drO<dpR> dro2, drX<? super PointerInputChange, ? super Float, dpR> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(drm, drx, dro, dro2, null), interfaceC8585dra);
        e = C8586drb.e();
        return awaitEachGesture == e ? awaitEachGesture : dpR.c;
    }

    static {
        float m2492constructorimpl = Dp.m2492constructorimpl((float) 0.125d);
        mouseSlop = m2492constructorimpl;
        float m2492constructorimpl2 = Dp.m2492constructorimpl(18);
        defaultTouchSlop = m2492constructorimpl2;
        mouseToTouchSlopRatio = m2492constructorimpl / m2492constructorimpl2;
    }

    public static final PointerDirectionConfig toPointerDirectionConfig(Orientation orientation) {
        return orientation == Orientation.Vertical ? VerticalPointerDirectionConfig : HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.ui.input.pointer.PointerInputChange, T, java.lang.Object] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m167awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, o.InterfaceC8585dra<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            o.C8556dpz.d(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L33
            goto La5
        L33:
            r4 = r10
            goto L9d
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            o.C8556dpz.d(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m170isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4b
            return r4
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L58:
            if (r5 >= r2) goto L6f
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m1727getIdJ3iCeTQ()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m1719equalsimpl0(r7, r10)
            if (r7 == 0) goto L6c
            goto L70
        L6c:
            int r5 = r5 + 1
            goto L58
        L6f:
            r6 = r4
        L70:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L75
            return r4
        L75:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            r11.d = r6
            androidx.compose.ui.platform.ViewConfiguration r12 = r9.getViewConfiguration()
            long r7 = r12.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            r12.<init>(r11, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            r0.L$0 = r6     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            r0.L$1 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            java.lang.Object r9 = r9.withTimeout(r7, r12, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            if (r9 != r1) goto La5
            return r1
        L9b:
            r9 = r10
            r4 = r6
        L9d:
            T r9 = r9.d
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto La4
            goto La5
        La4:
            r4 = r9
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m167awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, o.dra):java.lang.Object");
    }

    /* renamed from: isPointerUp-DmW0f2w */
    public static final boolean m170isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m1719equalsimpl0(pointerInputChange.m1727getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ */
    public static final float m171pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m1754equalsimpl0(i, PointerType.Companion.m1759getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
