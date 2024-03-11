package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LiveStreamMissingSegmentProbe$checkForMissingSegment$2 extends ContinuationImpl {
    /* synthetic */ Object a;
    int c;
    final /* synthetic */ LiveStreamMissingSegmentProbe e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamMissingSegmentProbe$checkForMissingSegment$2(LiveStreamMissingSegmentProbe liveStreamMissingSegmentProbe, InterfaceC8585dra<? super LiveStreamMissingSegmentProbe$checkForMissingSegment$2> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = liveStreamMissingSegmentProbe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.d(null, 0, this);
    }
}
