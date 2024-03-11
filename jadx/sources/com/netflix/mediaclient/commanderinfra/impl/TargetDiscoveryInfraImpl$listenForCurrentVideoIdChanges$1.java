package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1309Ws;
import o.C1320Xd;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;

/* loaded from: classes3.dex */
public final class TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C1309Ws a;
    int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1(C1309Ws c1309Ws, InterfaceC8585dra<? super TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c1309Ws;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1(this.a, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3<T> implements dyQ {
        final /* synthetic */ C1309Ws a;

        AnonymousClass3(C1309Ws c1309Ws) {
            this.a = c1309Ws;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // o.dyQ
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.String r6, o.InterfaceC8585dra<? super o.dpR> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1 r0 = (com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.d = r1
                goto L18
            L13:
                com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1 r0 = new com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.c
                java.lang.Object r1 = o.C8588drd.c()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r6 = r0.e
                o.Ws r6 = (o.C1309Ws) r6
                java.lang.Object r0 = r0.b
                java.lang.String r0 = (java.lang.String) r0
                o.C8556dpz.d(r7)
                goto L5a
            L31:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L39:
                o.C8556dpz.d(r7)
                o.Ws$a r7 = o.C1309Ws.e
                r7.getLogTag()
                if (r6 == 0) goto L64
                o.Ws r7 = r5.a
                o.VB r2 = o.C1309Ws.d(r7)
                r0.b = r6
                r0.e = r7
                r0.d = r3
                java.lang.Object r0 = r2.d(r6, r0)
                if (r0 != r1) goto L56
                return r1
            L56:
                r4 = r0
                r0 = r6
                r6 = r7
                r7 = r4
            L5a:
                o.We r7 = (o.C1295We) r7
                o.C1309Ws.c(r6, r7)
                o.Xm r6 = o.C1329Xm.c
                r6.d(r0)
            L64:
                o.dpR r6 = o.dpR.c
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.commanderinfra.impl.TargetDiscoveryInfraImpl$listenForCurrentVideoIdChanges$1.AnonymousClass3.emit(java.lang.String, o.dra):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8812dzl<String> b = C1320Xd.c.b();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.a);
            this.b = 1;
            if (b.collect(anonymousClass3, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        throw new KotlinNothingValueException();
    }
}
