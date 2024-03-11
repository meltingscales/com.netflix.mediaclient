package okhttp3.internal.http2;

import o.C8627dsp;

/* loaded from: classes5.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final c b = new c(null);
    private final int t;

    public final int c() {
        return this.t;
    }

    ErrorCode(int i) {
        this.t = i;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final ErrorCode e(int i) {
            ErrorCode[] values;
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.c() == i) {
                    return errorCode;
                }
            }
            return null;
        }
    }
}
