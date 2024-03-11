package okhttp3.internal.http2;

import java.io.IOException;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        C8632dsu.d(errorCode, "");
        this.a = errorCode;
    }
}
