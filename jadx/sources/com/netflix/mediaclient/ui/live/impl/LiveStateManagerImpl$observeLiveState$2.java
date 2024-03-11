package com.netflix.mediaclient.ui.live.impl;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C2865aoD;
import o.InterfaceC8585dra;
import o.bZK;
import o.bZM;
import o.dpR;
import o.drX;
import o.dyQ;

/* loaded from: classes4.dex */
public final class LiveStateManagerImpl$observeLiveState$2 extends SuspendLambda implements drX<dyQ<? super bZK>, InterfaceC8585dra<? super dpR>, Object> {
    long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Set<Integer> c;
    final /* synthetic */ C2865aoD d;
    int e;
    private /* synthetic */ Object f;
    final /* synthetic */ bZM j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStateManagerImpl$observeLiveState$2(boolean z, bZM bzm, Set<Integer> set, C2865aoD c2865aoD, InterfaceC8585dra<? super LiveStateManagerImpl$observeLiveState$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = z;
        this.j = bzm;
        this.c = set;
        this.d = c2865aoD;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        LiveStateManagerImpl$observeLiveState$2 liveStateManagerImpl$observeLiveState$2 = new LiveStateManagerImpl$observeLiveState$2(this.b, this.j, this.c, this.d, interfaceC8585dra);
        liveStateManagerImpl$observeLiveState$2.f = obj;
        return liveStateManagerImpl$observeLiveState$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super bZK> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LiveStateManagerImpl$observeLiveState$2) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Type inference failed for: r1v10, types: [o.dyQ] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, o.dyQ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e1 -> B:38:0x00e4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.live.impl.LiveStateManagerImpl$observeLiveState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
