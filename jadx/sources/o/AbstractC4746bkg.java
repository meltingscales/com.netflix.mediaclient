package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamRange;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioSwitchConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid;

/* renamed from: o.bkg  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4746bkg extends AudioStreamConfig {
    private final AudioStreamRange audioStreamRange;
    private final AudioSwitchConfig audioSwitchConfig;
    private final Sigmoid bandwidthMarginAudioSigmoid;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamConfig
    @SerializedName("audioStreamRange")
    public AudioStreamRange audioStreamRange() {
        return this.audioStreamRange;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamConfig
    @SerializedName("audioSwitchConfig")
    public AudioSwitchConfig audioSwitchConfig() {
        return this.audioSwitchConfig;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamConfig
    @SerializedName("bandwidthMarginAudioSigmoid")
    public Sigmoid bandwidthMarginAudioSigmoid() {
        return this.bandwidthMarginAudioSigmoid;
    }

    public AbstractC4746bkg(AudioStreamRange audioStreamRange, AudioSwitchConfig audioSwitchConfig, Sigmoid sigmoid) {
        if (audioStreamRange == null) {
            throw new NullPointerException("Null audioStreamRange");
        }
        this.audioStreamRange = audioStreamRange;
        if (audioSwitchConfig == null) {
            throw new NullPointerException("Null audioSwitchConfig");
        }
        this.audioSwitchConfig = audioSwitchConfig;
        if (sigmoid == null) {
            throw new NullPointerException("Null bandwidthMarginAudioSigmoid");
        }
        this.bandwidthMarginAudioSigmoid = sigmoid;
    }

    public String toString() {
        return "AudioStreamConfig{audioStreamRange=" + this.audioStreamRange + ", audioSwitchConfig=" + this.audioSwitchConfig + ", bandwidthMarginAudioSigmoid=" + this.bandwidthMarginAudioSigmoid + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStreamConfig) {
            AudioStreamConfig audioStreamConfig = (AudioStreamConfig) obj;
            return this.audioStreamRange.equals(audioStreamConfig.audioStreamRange()) && this.audioSwitchConfig.equals(audioStreamConfig.audioSwitchConfig()) && this.bandwidthMarginAudioSigmoid.equals(audioStreamConfig.bandwidthMarginAudioSigmoid());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.audioStreamRange.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.audioSwitchConfig.hashCode()) * 1000003) ^ this.bandwidthMarginAudioSigmoid.hashCode();
    }
}
