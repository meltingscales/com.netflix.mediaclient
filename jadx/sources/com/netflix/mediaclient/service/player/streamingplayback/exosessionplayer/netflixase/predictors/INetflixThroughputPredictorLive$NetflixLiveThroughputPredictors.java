package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.predictors;

import com.google.gson.annotations.SerializedName;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors {
    private static final /* synthetic */ INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors[] a;
    private static final /* synthetic */ InterfaceC8598drn b;
    @SerializedName("Sigmoid")
    public static final INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors d = new INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors("Sigmoid", 0);
    @SerializedName("Linear")
    public static final INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors c = new INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors("Linear", 1);
    @SerializedName("Exponential")
    public static final INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors e = new INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors("Exponential", 2);

    private static final /* synthetic */ INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors[] c() {
        return new INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors[]{d, c, e};
    }

    public static INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors valueOf(String str) {
        return (INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors) Enum.valueOf(INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors.class, str);
    }

    public static INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors[] values() {
        return (INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors[]) a.clone();
    }

    private INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors(String str, int i) {
    }

    static {
        INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors[] c2 = c();
        a = c2;
        b = C8600drp.e(c2);
    }
}
