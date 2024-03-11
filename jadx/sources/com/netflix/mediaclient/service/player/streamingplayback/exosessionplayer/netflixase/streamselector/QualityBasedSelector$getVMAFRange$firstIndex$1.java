package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector;

import com.netflix.mediaclient.media.manifest.SegmentVmaf;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.drM;

/* loaded from: classes6.dex */
public final class QualityBasedSelector$getVMAFRange$firstIndex$1 extends Lambda implements drM<SegmentVmaf, Integer> {
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityBasedSelector$getVMAFRange$firstIndex$1(long j) {
        super(1);
        this.b = j;
    }

    @Override // o.drM
    /* renamed from: d */
    public final Integer invoke(SegmentVmaf segmentVmaf) {
        return Integer.valueOf(C8632dsu.a(segmentVmaf.offsetMs(), this.b));
    }
}
