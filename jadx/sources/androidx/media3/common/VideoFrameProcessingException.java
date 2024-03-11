package androidx.media3.common;

/* loaded from: classes2.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        if (exc instanceof VideoFrameProcessingException) {
            return (VideoFrameProcessingException) exc;
        }
        return new VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
