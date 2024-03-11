package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource;

import android.net.Uri;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.LiveStreamMissingSegmentProbe;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC4796bme;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class LiveStreamMissingSegmentProbe$probe$2$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super LiveStreamMissingSegmentProbe.SegmentPresence>, Object> {
    final /* synthetic */ LiveStreamMissingSegmentProbe a;
    final /* synthetic */ Uri b;
    int c;
    final /* synthetic */ InterfaceC4796bme d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamMissingSegmentProbe$probe$2$1$1(LiveStreamMissingSegmentProbe liveStreamMissingSegmentProbe, InterfaceC4796bme interfaceC4796bme, Uri uri, InterfaceC8585dra<? super LiveStreamMissingSegmentProbe$probe$2$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = liveStreamMissingSegmentProbe;
        this.d = interfaceC4796bme;
        this.b = uri;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super LiveStreamMissingSegmentProbe.SegmentPresence> interfaceC8585dra) {
        return ((LiveStreamMissingSegmentProbe$probe$2$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LiveStreamMissingSegmentProbe$probe$2$1$1(this.a, this.d, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            LiveStreamMissingSegmentProbe liveStreamMissingSegmentProbe = this.a;
            InterfaceC4796bme interfaceC4796bme = this.d;
            C8632dsu.a(interfaceC4796bme, "");
            Uri uri = this.b;
            this.c = 1;
            obj = liveStreamMissingSegmentProbe.e(interfaceC4796bme, uri, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
