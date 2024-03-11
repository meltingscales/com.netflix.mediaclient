package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import androidx.compose.animation.core.MutableTransitionState;
import com.netflix.model.leafs.advisory.Advisory;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC5823cJr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableTransitionState<Boolean> a;
    final /* synthetic */ drM<AbstractC5823cJr, dpR> b;
    final /* synthetic */ Advisory c;
    final /* synthetic */ String d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1(Advisory advisory, drM<? super AbstractC5823cJr, dpR> drm, String str, MutableTransitionState<Boolean> mutableTransitionState, InterfaceC8585dra<? super PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = advisory;
        this.b = drm;
        this.d = str;
        this.a = mutableTransitionState;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1(this.c, this.b, this.d, this.a, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r10.e
            r2 = 3
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r2) goto L17
            o.C8556dpz.d(r11)
            goto L86
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            o.C8556dpz.d(r11)
            goto L71
        L23:
            o.C8556dpz.d(r11)
            goto L56
        L27:
            o.C8556dpz.d(r11)
            com.netflix.model.leafs.advisory.Advisory r11 = r10.c
            boolean r1 = r11 instanceof com.netflix.model.leafs.advisory.ExpiringContentAdvisory
            if (r1 != 0) goto L38
            com.netflix.model.leafs.advisory.Advisory$Type r11 = r11.getType()
            com.netflix.model.leafs.advisory.Advisory$Type r1 = com.netflix.model.leafs.advisory.Advisory.Type.EXPIRY_NOTICE
            if (r11 != r1) goto L44
        L38:
            o.drM<o.cJr, o.dpR> r11 = r10.b
            o.cJr$e r1 = new o.cJr$e
            java.lang.String r6 = r10.d
            r1.<init>(r6)
            r11.invoke(r1)
        L44:
            com.netflix.model.leafs.advisory.Advisory r11 = r10.c
            float r11 = r11.getDelay()
            long r6 = (long) r11
            long r8 = (long) r3
            r10.e = r5
            long r6 = r6 * r8
            java.lang.Object r11 = o.C8749dxc.b(r6, r10)
            if (r11 != r0) goto L56
            return r0
        L56:
            androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r11 = r10.a
            java.lang.Boolean r1 = o.C8589dre.e(r5)
            r11.setTargetState(r1)
            com.netflix.model.leafs.advisory.Advisory r11 = r10.c
            float r11 = r11.getDuration()
            long r5 = (long) r11
            long r7 = (long) r3
            r10.e = r4
            long r5 = r5 * r7
            java.lang.Object r11 = o.C8749dxc.b(r5, r10)
            if (r11 != r0) goto L71
            return r0
        L71:
            androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r11 = r10.a
            r1 = 0
            java.lang.Boolean r1 = o.C8589dre.e(r1)
            r11.setTargetState(r1)
            r10.e = r2
            r1 = 1400(0x578, double:6.917E-321)
            java.lang.Object r11 = o.C8749dxc.b(r1, r10)
            if (r11 != r0) goto L86
            return r0
        L86:
            com.netflix.model.leafs.advisory.Advisory r11 = r10.c
            boolean r0 = r11 instanceof com.netflix.model.leafs.advisory.ExpiringContentAdvisory
            if (r0 != 0) goto L94
            com.netflix.model.leafs.advisory.Advisory$Type r11 = r11.getType()
            com.netflix.model.leafs.advisory.Advisory$Type r0 = com.netflix.model.leafs.advisory.Advisory.Type.EXPIRY_NOTICE
            if (r11 != r0) goto La0
        L94:
            o.drM<o.cJr, o.dpR> r11 = r10.b
            o.cJr$a r0 = new o.cJr$a
            java.lang.String r1 = r10.d
            r0.<init>(r1)
            r11.invoke(r0)
        La0:
            o.drM<o.cJr, o.dpR> r11 = r10.b
            o.cJr$c r0 = o.AbstractC5823cJr.c.e
            r11.invoke(r0)
            o.dpR r11 = o.dpR.c
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
