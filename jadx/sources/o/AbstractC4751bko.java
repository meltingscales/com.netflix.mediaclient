package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.PacingConfig;
import java.util.Arrays;

/* renamed from: o.bko  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4751bko extends PacingConfig {
    private final String algorithm;
    private final long minRequiredBuffer;
    private final int[] rateDiscountFactors;
    private final boolean shouldPaceOnWifi;
    private final int staticPacingRateKbps;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.PacingConfig
    @SerializedName("algorithm")
    public String algorithm() {
        return this.algorithm;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.PacingConfig
    @SerializedName("minRequiredBuffer")
    public long minRequiredBuffer() {
        return this.minRequiredBuffer;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.PacingConfig
    @SerializedName("rateDiscountFactors")
    public int[] rateDiscountFactors() {
        return this.rateDiscountFactors;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.PacingConfig
    @SerializedName("shouldPaceOnWifi")
    public boolean shouldPaceOnWifi() {
        return this.shouldPaceOnWifi;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.PacingConfig
    @SerializedName("staticPacingRateKbps")
    public int staticPacingRateKbps() {
        return this.staticPacingRateKbps;
    }

    public AbstractC4751bko(long j, boolean z, int[] iArr, int i, String str) {
        this.minRequiredBuffer = j;
        this.shouldPaceOnWifi = z;
        if (iArr == null) {
            throw new NullPointerException("Null rateDiscountFactors");
        }
        this.rateDiscountFactors = iArr;
        this.staticPacingRateKbps = i;
        if (str == null) {
            throw new NullPointerException("Null algorithm");
        }
        this.algorithm = str;
    }

    public String toString() {
        return "PacingConfig{minRequiredBuffer=" + this.minRequiredBuffer + ", shouldPaceOnWifi=" + this.shouldPaceOnWifi + ", rateDiscountFactors=" + Arrays.toString(this.rateDiscountFactors) + ", staticPacingRateKbps=" + this.staticPacingRateKbps + ", algorithm=" + this.algorithm + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PacingConfig) {
            PacingConfig pacingConfig = (PacingConfig) obj;
            if (this.minRequiredBuffer == pacingConfig.minRequiredBuffer() && this.shouldPaceOnWifi == pacingConfig.shouldPaceOnWifi()) {
                if (Arrays.equals(this.rateDiscountFactors, pacingConfig instanceof AbstractC4751bko ? ((AbstractC4751bko) pacingConfig).rateDiscountFactors : pacingConfig.rateDiscountFactors()) && this.staticPacingRateKbps == pacingConfig.staticPacingRateKbps() && this.algorithm.equals(pacingConfig.algorithm())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.minRequiredBuffer;
        int i = (int) (j ^ (j >>> 32));
        int i2 = this.shouldPaceOnWifi ? 1231 : 1237;
        return ((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ Arrays.hashCode(this.rateDiscountFactors)) * 1000003) ^ this.staticPacingRateKbps) * 1000003) ^ this.algorithm.hashCode();
    }
}
