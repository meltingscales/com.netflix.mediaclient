package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange;

/* renamed from: o.bks  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4754bks extends StreamRange {
    private final int algVMAF;
    private final int maxBitrate;
    private final int maxBitrateNoThroughput;
    private final int maxBitrateNoVMAF;
    private final int maxVMAF;
    private final int maxVMAFNoThroughput;
    private final int minBitrate;
    private final int minResolutionForMaxVMAF;
    private final int minVMAF;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("algVMAF")
    public int algVMAF() {
        return this.algVMAF;
    }

    public int hashCode() {
        return ((((((((((((((((this.minBitrate ^ 1000003) * 1000003) ^ this.maxBitrate) * 1000003) ^ this.maxBitrateNoVMAF) * 1000003) ^ this.maxBitrateNoThroughput) * 1000003) ^ this.minVMAF) * 1000003) ^ this.maxVMAF) * 1000003) ^ this.maxVMAFNoThroughput) * 1000003) ^ this.algVMAF) * 1000003) ^ this.minResolutionForMaxVMAF;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("maxBitrate")
    public int maxBitrate() {
        return this.maxBitrate;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("maxBitrateNoThroughput")
    public int maxBitrateNoThroughput() {
        return this.maxBitrateNoThroughput;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("maxBitrateNoVMAF")
    public int maxBitrateNoVMAF() {
        return this.maxBitrateNoVMAF;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("maxVMAF")
    public int maxVMAF() {
        return this.maxVMAF;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("maxVMAFNoThroughput")
    public int maxVMAFNoThroughput() {
        return this.maxVMAFNoThroughput;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("minBitrate")
    public int minBitrate() {
        return this.minBitrate;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("minResolutionForMaxVMAF")
    public int minResolutionForMaxVMAF() {
        return this.minResolutionForMaxVMAF;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange
    @SerializedName("minVMAF")
    public int minVMAF() {
        return this.minVMAF;
    }

    public AbstractC4754bks(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.minBitrate = i;
        this.maxBitrate = i2;
        this.maxBitrateNoVMAF = i3;
        this.maxBitrateNoThroughput = i4;
        this.minVMAF = i5;
        this.maxVMAF = i6;
        this.maxVMAFNoThroughput = i7;
        this.algVMAF = i8;
        this.minResolutionForMaxVMAF = i9;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamRange) {
            StreamRange streamRange = (StreamRange) obj;
            return this.minBitrate == streamRange.minBitrate() && this.maxBitrate == streamRange.maxBitrate() && this.maxBitrateNoVMAF == streamRange.maxBitrateNoVMAF() && this.maxBitrateNoThroughput == streamRange.maxBitrateNoThroughput() && this.minVMAF == streamRange.minVMAF() && this.maxVMAF == streamRange.maxVMAF() && this.maxVMAFNoThroughput == streamRange.maxVMAFNoThroughput() && this.algVMAF == streamRange.algVMAF() && this.minResolutionForMaxVMAF == streamRange.minResolutionForMaxVMAF();
        }
        return false;
    }
}
