package com.netflix.mediaclient.ui.commander.impl.ui.components;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlaybackSliderKt$PlaybackSlider$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableFloatState a;
    int b;
    final /* synthetic */ boolean d;
    final /* synthetic */ MutableState<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackSliderKt$PlaybackSlider$2$1(boolean z, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, InterfaceC8585dra<? super PlaybackSliderKt$PlaybackSlider$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = z;
        this.e = mutableState;
        this.a = mutableFloatState;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlaybackSliderKt$PlaybackSlider$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlaybackSliderKt$PlaybackSlider$2$1(this.d, this.e, this.a, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002e -> B:16:0x0031). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C8556dpz.d(r6)
            goto L31
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            o.C8556dpz.d(r6)
        L1a:
            boolean r6 = r5.d
            if (r6 == 0) goto L3e
            androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r5.e
            boolean r6 = o.C3567bCq.b(r6)
            if (r6 != 0) goto L3e
            r5.b = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = o.C8749dxc.b(r3, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            androidx.compose.runtime.MutableFloatState r6 = r5.a
            float r1 = o.C3567bCq.b(r6)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r3
            o.C3567bCq.b(r6, r1)
            goto L1a
        L3e:
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.ui.components.PlaybackSliderKt$PlaybackSlider$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
