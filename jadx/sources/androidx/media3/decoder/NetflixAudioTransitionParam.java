package androidx.media3.decoder;

/* loaded from: classes2.dex */
public class NetflixAudioTransitionParam {
    public final long timeToTransitionUs;
    public final int transitionType;
    public final long trimKeepAudioUs;

    public NetflixAudioTransitionParam(int i, long j) {
        this.trimKeepAudioUs = j;
        this.transitionType = i;
        this.timeToTransitionUs = 0L;
    }

    public NetflixAudioTransitionParam(int i, long j, long j2) {
        this.transitionType = i;
        this.timeToTransitionUs = j;
        this.trimKeepAudioUs = j2;
    }
}
