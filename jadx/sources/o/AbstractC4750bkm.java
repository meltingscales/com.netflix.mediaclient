package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioSwitchConfig;

/* renamed from: o.bkm  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4750bkm extends AudioSwitchConfig {
    private final double downSwitchFactor;
    private final int lockPeriodAfterDownswitch;
    private final int lowestBufForUpswitch;
    private final double upSwitchFactor;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioSwitchConfig
    @SerializedName("downSwitchFactor")
    public double downSwitchFactor() {
        return this.downSwitchFactor;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioSwitchConfig
    @SerializedName("lockPeriodAfterDownswitch")
    public int lockPeriodAfterDownswitch() {
        return this.lockPeriodAfterDownswitch;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioSwitchConfig
    @SerializedName("lowestBufForUpswitch")
    public int lowestBufForUpswitch() {
        return this.lowestBufForUpswitch;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioSwitchConfig
    @SerializedName("upSwitchFactor")
    public double upSwitchFactor() {
        return this.upSwitchFactor;
    }

    public AbstractC4750bkm(double d, double d2, int i, int i2) {
        this.upSwitchFactor = d;
        this.downSwitchFactor = d2;
        this.lowestBufForUpswitch = i;
        this.lockPeriodAfterDownswitch = i2;
    }

    public String toString() {
        return "AudioSwitchConfig{upSwitchFactor=" + this.upSwitchFactor + ", downSwitchFactor=" + this.downSwitchFactor + ", lowestBufForUpswitch=" + this.lowestBufForUpswitch + ", lockPeriodAfterDownswitch=" + this.lockPeriodAfterDownswitch + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSwitchConfig) {
            AudioSwitchConfig audioSwitchConfig = (AudioSwitchConfig) obj;
            return Double.doubleToLongBits(this.upSwitchFactor) == Double.doubleToLongBits(audioSwitchConfig.upSwitchFactor()) && Double.doubleToLongBits(this.downSwitchFactor) == Double.doubleToLongBits(audioSwitchConfig.downSwitchFactor()) && this.lowestBufForUpswitch == audioSwitchConfig.lowestBufForUpswitch() && this.lockPeriodAfterDownswitch == audioSwitchConfig.lockPeriodAfterDownswitch();
        }
        return false;
    }

    public int hashCode() {
        return ((((((((int) ((Double.doubleToLongBits(this.upSwitchFactor) >>> 32) ^ Double.doubleToLongBits(this.upSwitchFactor))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.downSwitchFactor) >>> 32) ^ Double.doubleToLongBits(this.downSwitchFactor)))) * 1000003) ^ this.lowestBufForUpswitch) * 1000003) ^ this.lockPeriodAfterDownswitch;
    }
}
