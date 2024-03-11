package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4810bms;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AdsAuditPingSender$doPing$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    int d;
    final /* synthetic */ C4810bms e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsAuditPingSender$doPing$1(String str, C4810bms c4810bms, InterfaceC8585dra<? super AdsAuditPingSender$doPing$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = str;
        this.e = c4810bms;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AdsAuditPingSender$doPing$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AdsAuditPingSender$doPing$1(this.a, this.e, interfaceC8585dra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            o.C8588drd.c()
            int r0 = r5.d
            if (r0 != 0) goto L85
            o.C8556dpz.d(r6)
            r6 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
            if (r0 == 0) goto L2d
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "text/plain; charset=utf-8"
            r0.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
        L2d:
            o.bms r1 = r5.e     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r0 == 0) goto L3c
            int r3 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.Integer r3 = o.C8589dre.c(r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            goto L3d
        L3c:
            r3 = r6
        L3d:
            if (r0 == 0) goto L43
            java.lang.String r6 = r0.getResponseMessage()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
        L43:
            o.C4810bms.e(r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r0 == 0) goto L51
            java.io.InputStream r6 = r0.getInputStream()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r6 == 0) goto L51
            r6.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
        L51:
            if (r0 == 0) goto L6b
            goto L68
        L54:
            r6 = move-exception
            goto L77
        L56:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L5e
        L5b:
            r0 = move-exception
            goto L7a
        L5d:
            r0 = move-exception
        L5e:
            o.bms r1 = r5.e     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L73
            o.C4810bms.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L6b
            r0 = r6
        L68:
            r0.disconnect()
        L6b:
            o.bms$a r6 = o.C4810bms.b
            r6.getLogTag()
            o.dpR r6 = o.dpR.c
            return r6
        L73:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L77:
            r4 = r0
            r0 = r6
            r6 = r4
        L7a:
            if (r6 == 0) goto L7f
            r6.disconnect()
        L7f:
            o.bms$a r6 = o.C4810bms.b
            r6.getLogTag()
            throw r0
        L85:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.AdsAuditPingSender$doPing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
