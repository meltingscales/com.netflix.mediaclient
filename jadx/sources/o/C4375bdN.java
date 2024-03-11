package o;

import android.media.VolumeShaper;
import android.os.Build;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.util.Arrays;

/* renamed from: o.bdN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4375bdN extends DefaultAudioSink {
    private static final float[] c = {1.0f, 1.0f, 0.0f, 1.0f};
    private static final float[] d = {1.0f, 0.0f, 1.0f};
    private VolumeShaper b;

    public C4375bdN(DefaultAudioSink.Builder builder) {
        super(builder);
    }

    public void e(int i, long j) {
        long j2;
        float[] fArr;
        float[] fArr2;
        VolumeShaper.Configuration.Builder duration;
        VolumeShaper.Configuration.Builder curve;
        VolumeShaper.Configuration.Builder interpolatorType;
        VolumeShaper.Configuration build;
        VolumeShaper createVolumeShaper;
        VolumeShaper.Operation operation;
        if (Build.VERSION.SDK_INT < 26 || this.audioTrack == null) {
            return;
        }
        VolumeShaper volumeShaper = this.b;
        if (volumeShaper != null) {
            volumeShaper.close();
        }
        long submittedFrames = getSubmittedFrames() - this.audioTrackPositionTracker.getPlaybackHeadPosition();
        long framesToDurationUs = this.configuration.framesToDurationUs(submittedFrames) + j;
        if (framesToDurationUs < j) {
            C1044Mm.j("NetflixAudioSink", "unexpected AudioTrack head position %d [%d], timeToTransitionUs %d", Long.valueOf(framesToDurationUs), Long.valueOf(submittedFrames), Long.valueOf(j));
            return;
        }
        int i2 = 2;
        int i3 = 1;
        if (i == 1) {
            long min = Math.min(10000L, framesToDurationUs);
            long j3 = framesToDurationUs + min;
            if (framesToDurationUs > min) {
                fArr = c;
                float f = (float) framesToDurationUs;
                float f2 = (float) min;
                float f3 = (float) j3;
                fArr2 = new float[]{0.0f, (f - f2) / f3, f / f3, 1.0f};
            } else {
                fArr = d;
                fArr2 = new float[]{0.0f, 0.5f, 1.0f};
            }
            framesToDurationUs = j3;
        } else {
            if (i == 2) {
                j2 = 250000;
                if (framesToDurationUs > 250000) {
                    fArr = c;
                    float f4 = (float) framesToDurationUs;
                    fArr2 = new float[]{0.0f, (f4 - ((float) 250000)) / f4, 0.99f, 1.0f};
                } else {
                    fArr = d;
                    fArr2 = new float[]{0.0f, 0.99f, 1.0f};
                    i2 = 1;
                }
            } else if (i != 3) {
                C1044Mm.j("NetflixAudioSink", "easeType %s is not handled.", Integer.valueOf(i));
                return;
            } else {
                j2 = 2250000 + framesToDurationUs;
                fArr = new float[]{1.0f, 0.33f, 0.7f, 1.0f};
                float f5 = (float) j2;
                fArr2 = new float[]{0.0f, ((float) framesToDurationUs) / f5, (f5 - ((float) 1125000)) / f5, 1.0f};
            }
            framesToDurationUs = j2;
            i3 = i2;
        }
        long usToMs = Util.usToMs(framesToDurationUs);
        C1044Mm.a("NetflixAudioSink", "duration %d ms", Long.valueOf(usToMs));
        C1044Mm.a("NetflixAudioSink", "curve: time %s, fade %s", Arrays.toString(fArr2), Arrays.toString(fArr));
        try {
            C4386bdY.c();
            duration = C4387bdZ.c().setDuration(usToMs);
            curve = duration.setCurve(fArr2, fArr);
            interpolatorType = curve.setInterpolatorType(i3);
            build = interpolatorType.build();
            createVolumeShaper = this.audioTrack.createVolumeShaper(build);
            this.b = createVolumeShaper;
            operation = VolumeShaper.Operation.PLAY;
            createVolumeShaper.apply(operation);
        } catch (Exception e) {
            C1044Mm.j("NetflixAudioSink", "Failed to set up VolumeShaper for fading [%s]", e);
        }
    }
}
