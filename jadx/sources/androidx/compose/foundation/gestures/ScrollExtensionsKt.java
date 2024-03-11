package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import o.InterfaceC8585dra;

/* loaded from: classes.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, o.InterfaceC8585dra<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r7 = (kotlin.jvm.internal.Ref.FloatRef) r7
            o.C8556dpz.d(r10)
            goto L54
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            o.C8556dpz.d(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r3 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.L$0 = r10
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L53
            return r0
        L53:
            r7 = r10
        L54:
            float r7 = r7.d
            java.lang.Float r7 = o.C8589dre.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, o.dra):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f, AnimationSpec animationSpec, InterfaceC8585dra interfaceC8585dra, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, interfaceC8585dra);
    }
}
