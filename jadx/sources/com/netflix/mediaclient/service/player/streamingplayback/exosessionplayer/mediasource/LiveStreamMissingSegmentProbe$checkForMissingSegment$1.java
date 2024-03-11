package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class LiveStreamMissingSegmentProbe$checkForMissingSegment$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Integer>, Object> {
    final /* synthetic */ LiveStreamMissingSegmentProbe a;
    final /* synthetic */ int b;
    final /* synthetic */ LoadErrorHandlingPolicy.LoadErrorInfo d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamMissingSegmentProbe$checkForMissingSegment$1(LiveStreamMissingSegmentProbe liveStreamMissingSegmentProbe, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, int i, InterfaceC8585dra<? super LiveStreamMissingSegmentProbe$checkForMissingSegment$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = liveStreamMissingSegmentProbe;
        this.d = loadErrorInfo;
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LiveStreamMissingSegmentProbe$checkForMissingSegment$1(this.a, this.d, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Integer> interfaceC8585dra) {
        return ((LiveStreamMissingSegmentProbe$checkForMissingSegment$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            LiveStreamMissingSegmentProbe liveStreamMissingSegmentProbe = this.a;
            Uri uri = this.d.loadEventInfo.uri;
            C8632dsu.a(uri, "");
            int i2 = this.b;
            this.e = 1;
            obj = liveStreamMissingSegmentProbe.d(uri, i2, this);
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
