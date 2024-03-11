package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamRange;

/* renamed from: o.bkl  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4749bkl extends AudioStreamRange {
    private final int maxBitrate;
    private final int maxInitBitrate;
    private final int minBitrate;
    private final int minInitBitrate;

    public int hashCode() {
        return ((((((this.minInitBitrate ^ 1000003) * 1000003) ^ this.maxInitBitrate) * 1000003) ^ this.minBitrate) * 1000003) ^ this.maxBitrate;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamRange
    @SerializedName("maxBitrate")
    public int maxBitrate() {
        return this.maxBitrate;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamRange
    @SerializedName("maxInitBitrate")
    public int maxInitBitrate() {
        return this.maxInitBitrate;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamRange
    @SerializedName("minBitrate")
    public int minBitrate() {
        return this.minBitrate;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamRange
    @SerializedName("minInitBitrate")
    public int minInitBitrate() {
        return this.minInitBitrate;
    }

    public AbstractC4749bkl(int i, int i2, int i3, int i4) {
        this.minInitBitrate = i;
        this.maxInitBitrate = i2;
        this.minBitrate = i3;
        this.maxBitrate = i4;
    }

    public String toString() {
        return "AudioStreamRange{minInitBitrate=" + this.minInitBitrate + ", maxInitBitrate=" + this.maxInitBitrate + ", minBitrate=" + this.minBitrate + ", maxBitrate=" + this.maxBitrate + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStreamRange) {
            AudioStreamRange audioStreamRange = (AudioStreamRange) obj;
            return this.minInitBitrate == audioStreamRange.minInitBitrate() && this.maxInitBitrate == audioStreamRange.maxInitBitrate() && this.minBitrate == audioStreamRange.minBitrate() && this.maxBitrate == audioStreamRange.maxBitrate();
        }
        return false;
    }
}
