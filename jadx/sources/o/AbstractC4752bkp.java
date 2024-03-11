package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* renamed from: o.bkp  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4752bkp extends Sigmoid {
    private final double center;
    private final double end;
    private final double gamma;
    private final double scale;
    private final double start;

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid
    @SerializedName("center")
    public double center() {
        return this.center;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid
    @SerializedName("end")
    public double end() {
        return this.end;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid
    @SerializedName("gamma")
    public double gamma() {
        return this.gamma;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid
    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.SCALE)
    public double scale() {
        return this.scale;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid
    @SerializedName("start")
    public double start() {
        return this.start;
    }

    public AbstractC4752bkp(double d, double d2, double d3, double d4, double d5) {
        this.start = d;
        this.end = d2;
        this.center = d3;
        this.scale = d4;
        this.gamma = d5;
    }

    public String toString() {
        return "Sigmoid{start=" + this.start + ", end=" + this.end + ", center=" + this.center + ", scale=" + this.scale + ", gamma=" + this.gamma + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Sigmoid) {
            Sigmoid sigmoid = (Sigmoid) obj;
            return Double.doubleToLongBits(this.start) == Double.doubleToLongBits(sigmoid.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(sigmoid.end()) && Double.doubleToLongBits(this.center) == Double.doubleToLongBits(sigmoid.center()) && Double.doubleToLongBits(this.scale) == Double.doubleToLongBits(sigmoid.scale()) && Double.doubleToLongBits(this.gamma) == Double.doubleToLongBits(sigmoid.gamma());
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.center) >>> 32) ^ Double.doubleToLongBits(this.center)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.scale) >>> 32) ^ Double.doubleToLongBits(this.scale)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.gamma) >>> 32) ^ Double.doubleToLongBits(this.gamma)));
    }
}
