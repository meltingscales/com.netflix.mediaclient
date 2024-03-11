package androidx.compose.material3;

import java.util.Map;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    public static final <T> DraggableAnchors<T> DraggableAnchors(drM<? super DraggableAnchorsConfig<T>, dpR> drm) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        drm.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3_release());
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, InterfaceC8585dra interfaceC8585dra, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f, interfaceC8585dra);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), interfaceC8585dra, 2, null);
        e = C8586drb.e();
        return anchoredDrag$default == e ? anchoredDrag$default : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <I> java.lang.Object restartable(o.drO<? extends I> r4, o.drX<? super I, ? super o.InterfaceC8585dra<? super o.dpR>, ? extends java.lang.Object> r5, o.InterfaceC8585dra<? super o.dpR> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r6)     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            o.C8556dpz.d(r6)
            androidx.compose.material3.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = o.dwY.b(r6, r0)     // Catch: androidx.compose.material3.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            o.dpR r4 = o.dpR.c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnchoredDraggableKt.restartable(o.drO, o.drX, o.dra):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        Map d;
        d = dqE.d();
        return new MapDraggableAnchors<>(d);
    }
}
