package com.netflix.mediaclient.util;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class CdxProfileSwitchHelper$fetchUxConfig$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Context a;
    int b;
    final /* synthetic */ InterfaceC5283bvo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdxProfileSwitchHelper$fetchUxConfig$1(Context context, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super CdxProfileSwitchHelper$fetchUxConfig$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = context;
        this.c = interfaceC5283bvo;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CdxProfileSwitchHelper$fetchUxConfig$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CdxProfileSwitchHelper$fetchUxConfig$1(this.a, this.c, interfaceC8585dra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r3 != false) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r14.b
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            o.C8556dpz.d(r15)
            goto Lef
        L10:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L18:
            o.C8556dpz.d(r15)
            android.content.Context r15 = r14.a
            o.bvo r1 = r14.c
            java.lang.String r3 = r1.getProfileGuid()
            if (r3 == 0) goto L2b
            boolean r3 = o.C8684dus.a(r3)
            if (r3 == 0) goto Lc9
        L2b:
            o.aHe$d r3 = o.InterfaceC1597aHe.b
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map r9 = o.dqF.d(r3)
            o.aHd r3 = new o.aHd
            java.lang.String r5 = "SPY-35060 - User profile has a null or blank profile GUID"
            r6 = 0
            r7 = 0
            r8 = 1
            r10 = 0
            r11 = 0
            r12 = 96
            r13 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.netflix.mediaclient.api.logging.error.ErrorType r4 = r3.a
            if (r4 == 0) goto L76
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.e
            java.lang.String r6 = "errorType"
            java.lang.String r7 = r4.c()
            r5.put(r6, r7)
            java.lang.String r5 = r3.b()
            if (r5 == 0) goto L76
            java.lang.String r4 = r4.c()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r3.a(r4)
        L76:
            java.lang.String r4 = r3.b()
            if (r4 == 0) goto L8c
            java.lang.Throwable r4 = r3.i
            if (r4 == 0) goto L8c
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r5 = r3.b()
            java.lang.Throwable r6 = r3.i
            r4.<init>(r5, r6)
            goto Lb6
        L8c:
            java.lang.String r4 = r3.b()
            if (r4 == 0) goto L9c
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r5 = r3.b()
            r4.<init>(r5)
            goto Lb6
        L9c:
            java.lang.Throwable r4 = r3.i
            if (r4 == 0) goto Laf
            if (r4 == 0) goto La3
            goto Lb6
        La3:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        Laf:
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r5 = "Handled exception with no message"
            r4.<init>(r5)
        Lb6:
            o.aHi$d r5 = o.InterfaceC1601aHi.c
            o.aHe r6 = r5.c()
            if (r6 == 0) goto Lc2
            r6.d(r3, r4)
            goto Lc9
        Lc2:
            o.aHb r5 = r5.e()
            r5.b(r3, r4)
        Lc9:
            o.aGb$e r3 = o.C1567aGb.a
            o.aGb r1 = r3.e(r1)
            o.aFY$b r3 = o.aFY.b
            o.aFY r15 = r3.e(r15)
            o.aFU r15 = r15.e(r1)
            java.lang.Class<o.dea$b> r1 = o.C8130dea.b.class
            java.lang.Object r15 = dagger.hilt.EntryPoints.get(r15, r1)
            o.dea$b r15 = (o.C8130dea.b) r15
            o.dij r15 = r15.d()
            r14.b = r2
            r1 = 0
            java.lang.Object r15 = r15.a(r1, r14)
            if (r15 != r0) goto Lef
            return r0
        Lef:
            o.dpR r15 = o.dpR.c
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.util.CdxProfileSwitchHelper$fetchUxConfig$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
