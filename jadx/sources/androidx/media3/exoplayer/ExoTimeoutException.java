package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
public final class ExoTimeoutException extends RuntimeException {
    public final int timeoutOperation;

    private static String getErrorMessage(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }

    public ExoTimeoutException(int i) {
        super(getErrorMessage(i));
        this.timeoutOperation = i;
    }
}
