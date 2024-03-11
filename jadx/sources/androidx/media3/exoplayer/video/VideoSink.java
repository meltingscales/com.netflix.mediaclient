package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
interface VideoSink {

    /* loaded from: classes2.dex */
    public interface Listener {
        void onFirstFrameRendered(VideoSink videoSink);

        void onVideoSizeChanged(VideoSink videoSink, VideoSize videoSize);
    }

    /* loaded from: classes2.dex */
    public interface RenderControl {
        long getFrameRenderTimeNs(long j, long j2, long j3, float f);

        void onFrameDropped();

        void onFrameRendered();

        void onNextFrame(long j);
    }

    void flush();

    Surface getInputSurface();

    boolean isEnded();

    boolean isFrameDropAllowedOnInput();

    boolean isReady();

    long registerInputFrame(long j, boolean z);

    void registerInputStream(int i, Format format);

    void render(long j, long j2);

    void setListener(Listener listener, Executor executor);

    void setPlaybackSpeed(float f);

    /* loaded from: classes2.dex */
    public static final class VideoSinkException extends Exception {
        public final Format format;

        public VideoSinkException(Throwable th, Format format) {
            super(th);
            this.format = format;
        }
    }
}
