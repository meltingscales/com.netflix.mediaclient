package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid;

/* renamed from: o.bkj  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4748bkj extends ChunkAggregatorConfig {
    private final int defaultResponseTimeMs;
    private final int defaultTpKbps;
    private final Sigmoid maxDurationMsSigmoid;
    private final int maxSize;
    private final Sigmoid minDurationMsSigmoid;
    private final double minLoadingRatio;
    private final int minSize;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("defaultResponseTimeMs")
    public int defaultResponseTimeMs() {
        return this.defaultResponseTimeMs;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("defaultTpKbps")
    public int defaultTpKbps() {
        return this.defaultTpKbps;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("maxDurationMsSigmoid")
    public Sigmoid maxDurationMsSigmoid() {
        return this.maxDurationMsSigmoid;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("maxSize")
    public int maxSize() {
        return this.maxSize;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("minDurationMsSigmoid")
    public Sigmoid minDurationMsSigmoid() {
        return this.minDurationMsSigmoid;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("minLoadingRatio")
    public double minLoadingRatio() {
        return this.minLoadingRatio;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig
    @SerializedName("minSize")
    public int minSize() {
        return this.minSize;
    }

    public AbstractC4748bkj(int i, int i2, double d, int i3, int i4, Sigmoid sigmoid, Sigmoid sigmoid2) {
        this.minSize = i;
        this.maxSize = i2;
        this.minLoadingRatio = d;
        this.defaultTpKbps = i3;
        this.defaultResponseTimeMs = i4;
        if (sigmoid == null) {
            throw new NullPointerException("Null minDurationMsSigmoid");
        }
        this.minDurationMsSigmoid = sigmoid;
        if (sigmoid2 == null) {
            throw new NullPointerException("Null maxDurationMsSigmoid");
        }
        this.maxDurationMsSigmoid = sigmoid2;
    }

    public String toString() {
        return "ChunkAggregatorConfig{minSize=" + this.minSize + ", maxSize=" + this.maxSize + ", minLoadingRatio=" + this.minLoadingRatio + ", defaultTpKbps=" + this.defaultTpKbps + ", defaultResponseTimeMs=" + this.defaultResponseTimeMs + ", minDurationMsSigmoid=" + this.minDurationMsSigmoid + ", maxDurationMsSigmoid=" + this.maxDurationMsSigmoid + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChunkAggregatorConfig) {
            ChunkAggregatorConfig chunkAggregatorConfig = (ChunkAggregatorConfig) obj;
            return this.minSize == chunkAggregatorConfig.minSize() && this.maxSize == chunkAggregatorConfig.maxSize() && Double.doubleToLongBits(this.minLoadingRatio) == Double.doubleToLongBits(chunkAggregatorConfig.minLoadingRatio()) && this.defaultTpKbps == chunkAggregatorConfig.defaultTpKbps() && this.defaultResponseTimeMs == chunkAggregatorConfig.defaultResponseTimeMs() && this.minDurationMsSigmoid.equals(chunkAggregatorConfig.minDurationMsSigmoid()) && this.maxDurationMsSigmoid.equals(chunkAggregatorConfig.maxDurationMsSigmoid());
        }
        return false;
    }

    public int hashCode() {
        int i = this.minSize;
        int i2 = this.maxSize;
        int i3 = this.defaultTpKbps;
        int i4 = this.defaultResponseTimeMs;
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.minLoadingRatio) >>> 32) ^ Double.doubleToLongBits(this.minLoadingRatio)))) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ this.minDurationMsSigmoid.hashCode()) * 1000003) ^ this.maxDurationMsSigmoid.hashCode();
    }
}
