package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import o.C4755bkv;

/* loaded from: classes3.dex */
public abstract class StreamRange {
    @SerializedName("algVMAF")
    public abstract int algVMAF();

    @SerializedName("maxBitrate")
    public abstract int maxBitrate();

    @SerializedName("maxBitrateNoThroughput")
    public abstract int maxBitrateNoThroughput();

    @SerializedName("maxBitrateNoVMAF")
    public abstract int maxBitrateNoVMAF();

    @SerializedName("maxVMAF")
    public abstract int maxVMAF();

    @SerializedName("maxVMAFNoThroughput")
    public abstract int maxVMAFNoThroughput();

    @SerializedName("minBitrate")
    public abstract int minBitrate();

    @SerializedName("minResolutionForMaxVMAF")
    public abstract int minResolutionForMaxVMAF();

    @SerializedName("minVMAF")
    public abstract int minVMAF();

    public static TypeAdapter<StreamRange> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(-1799549543);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 108, 672)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(-1799549543, obj);
            }
            return (TypeAdapter) ((Constructor) obj).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String toString() {
        return "StreamRange{minBitrate=" + minBitrate() + ", maxBitrate='" + maxBitrate() + ", maxBitrateNoVMAF=" + maxBitrateNoVMAF() + ", maxBitrateNoThroughput=" + maxBitrateNoThroughput() + ", minVMAF=" + minVMAF() + ", maxVMAF=" + maxVMAF() + ", maxVMAFNoThroughput=" + maxVMAFNoThroughput() + ", algVMAF=" + algVMAF() + ", minResolutionForMaxVMAF=" + minResolutionForMaxVMAF() + '}';
    }

    public static StreamRange createStreamRange(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new AutoValue_StreamRange(i, i2, i3, i4, i5, i6, i7, i8, i9);
    }
}
