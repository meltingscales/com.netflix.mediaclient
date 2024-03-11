package com.netflix.android.widgetry.utils.coroutines;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C9879yM;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class ControlledRunner$cancelPreviousThenRun$2<T> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super T>, Object> {
    final /* synthetic */ drM<InterfaceC8585dra<? super T>, Object> a;
    int b;
    final /* synthetic */ C9879yM<T> c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ControlledRunner$cancelPreviousThenRun$2(C9879yM<T> c9879yM, drM<? super InterfaceC8585dra<? super T>, ? extends Object> drm, InterfaceC8585dra<? super ControlledRunner$cancelPreviousThenRun$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c9879yM;
        this.a = drm;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return ((ControlledRunner$cancelPreviousThenRun$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ControlledRunner$cancelPreviousThenRun$2 controlledRunner$cancelPreviousThenRun$2 = new ControlledRunner$cancelPreviousThenRun$2(this.c, this.a, interfaceC8585dra);
        controlledRunner$cancelPreviousThenRun$2.d = obj;
        return controlledRunner$cancelPreviousThenRun$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007e -> B:13:0x0051). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r12.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            o.C8556dpz.d(r13)
            goto L8c
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.d
            o.dwZ r1 = (o.dwZ) r1
            o.C8556dpz.d(r13)
            goto L51
        L27:
            java.lang.Object r1 = r12.d
            o.dwZ r1 = (o.dwZ) r1
            o.C8556dpz.d(r13)
            goto L76
        L2f:
            o.C8556dpz.d(r13)
            java.lang.Object r13 = r12.d
            r6 = r13
            o.dwU r6 = (o.dwU) r6
            r7 = 0
            kotlinx.coroutines.CoroutineStart r8 = kotlinx.coroutines.CoroutineStart.LAZY
            com.netflix.android.widgetry.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$newTask$1 r9 = new com.netflix.android.widgetry.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$newTask$1
            o.drM<o.dra<? super T>, java.lang.Object> r13 = r12.a
            r9.<init>(r13, r5)
            r10 = 1
            r11 = 0
            o.dwZ r1 = o.C8738dws.a(r6, r7, r8, r9, r10, r11)
            com.netflix.android.widgetry.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$1 r13 = new com.netflix.android.widgetry.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2$1
            o.yM<T> r6 = r12.c
            r13.<init>()
            r1.e(r13)
        L51:
            o.yM<T> r13 = r12.c
            java.util.concurrent.atomic.AtomicReference r13 = o.C9879yM.a(r13)
            boolean r13 = androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r13, r5, r1)
            if (r13 != 0) goto L81
            o.yM<T> r13 = r12.c
            java.util.concurrent.atomic.AtomicReference r13 = o.C9879yM.a(r13)
            java.lang.Object r13 = r13.get()
            o.dwZ r13 = (o.dwZ) r13
            if (r13 == 0) goto L76
            r12.d = r1
            r12.b = r4
            java.lang.Object r13 = o.dxG.e(r13, r12)
            if (r13 != r0) goto L76
            return r0
        L76:
            r12.d = r1
            r12.b = r3
            java.lang.Object r13 = o.C8782dyi.b(r12)
            if (r13 != r0) goto L51
            return r0
        L81:
            r12.d = r5
            r12.b = r2
            java.lang.Object r13 = r1.b(r12)
            if (r13 != r0) goto L8c
            return r0
        L8c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.widgetry.utils.coroutines.ControlledRunner$cancelPreviousThenRun$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
