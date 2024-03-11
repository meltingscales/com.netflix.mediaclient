package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import o.drM;

/* loaded from: classes.dex */
public final class TransformableKt {
    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new drM<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$1
            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final Boolean m219invokek4lQ0M(long j) {
                return Boolean.TRUE;
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(Offset offset) {
                return m219invokek4lQ0M(offset.m1146unboximpl());
            }
        }, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, drM<? super Offset, Boolean> drm, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, drm, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ec, code lost:
        if (r11.invoke(androidx.compose.ui.geometry.Offset.m1126boximpl(r1)).booleanValue() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0299, code lost:
        if (r5 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029b, code lost:
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a0 A[EDGE_INSN: B:101:0x02a0->B:89:0x02a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0270 -> B:82:0x027e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r29, boolean r30, o.InterfaceC8792dys<androidx.compose.foundation.gestures.TransformEvent> r31, o.drM<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> r32, o.InterfaceC8585dra<? super o.dpR> r33) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, o.dys, o.drM, o.dra):java.lang.Object");
    }
}
