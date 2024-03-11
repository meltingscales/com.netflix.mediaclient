package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource;

import android.net.Uri;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LiveStreamMissingSegmentProbe$probe$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super List<? extends LiveStreamMissingSegmentProbe.SegmentPresence>>, Object> {
    final /* synthetic */ List<Uri> a;
    Object b;
    final /* synthetic */ LiveStreamMissingSegmentProbe c;
    Object d;
    int e;
    private /* synthetic */ Object g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveStreamMissingSegmentProbe$probe$2(LiveStreamMissingSegmentProbe liveStreamMissingSegmentProbe, List<? extends Uri> list, InterfaceC8585dra<? super LiveStreamMissingSegmentProbe$probe$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = liveStreamMissingSegmentProbe;
        this.a = list;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super List<? extends LiveStreamMissingSegmentProbe.SegmentPresence>> interfaceC8585dra) {
        return ((LiveStreamMissingSegmentProbe$probe$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        LiveStreamMissingSegmentProbe$probe$2 liveStreamMissingSegmentProbe$probe$2 = new LiveStreamMissingSegmentProbe$probe$2(this.c, this.a, interfaceC8585dra);
        liveStreamMissingSegmentProbe$probe$2.g = obj;
        return liveStreamMissingSegmentProbe$probe$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:19:0x0092). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r13.e
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r13.d
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r3 = r13.b
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r13.g
            java.util.Collection r4 = (java.util.Collection) r4
            o.C8556dpz.d(r14)
            goto L92
        L1c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L24:
            o.C8556dpz.d(r14)
            java.lang.Object r14 = r13.g
            o.dwU r14 = (o.dwU) r14
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe r1 = r13.c
            o.bmb r1 = com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.e(r1)
            o.bme r1 = r1.d()
            java.util.List<android.net.Uri> r3 = r13.a
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe r9 = r13.c
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r4 = o.C8570dqm.a(r3, r11)
            r10.<init>(r4)
            java.util.Iterator r12 = r3.iterator()
        L48:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r12.next()
            android.net.Uri r3 = (android.net.Uri) r3
            r4 = 0
            r5 = 0
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$probe$2$1$1 r6 = new com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$probe$2$1$1
            r7 = 0
            r6.<init>(r9, r1, r3, r7)
            r7 = 3
            r8 = 0
            r3 = r14
            o.dwZ r3 = o.C8738dws.a(r3, r4, r5, r6, r7, r8)
            r10.add(r3)
            goto L48
        L67:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r1 = o.C8570dqm.a(r10, r11)
            r14.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
            r3 = r1
            r1 = r14
        L76:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L99
            java.lang.Object r14 = r3.next()
            o.dwZ r14 = (o.dwZ) r14
            r13.g = r1
            r13.b = r3
            r13.d = r1
            r13.e = r2
            java.lang.Object r14 = r14.b(r13)
            if (r14 != r0) goto L91
            return r0
        L91:
            r4 = r1
        L92:
            com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$SegmentPresence r14 = (com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe.SegmentPresence) r14
            r1.add(r14)
            r1 = r4
            goto L76
        L99:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe$probe$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
