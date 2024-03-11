package com.netflix.mediaclient.drm;

import android.annotation.TargetApi;
import android.media.MediaDrm;
import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes3.dex */
public interface NetflixMediaDrmApi23 extends NetflixMediaDrm {
    public static final int EVENT_SESSION_RECLAIMED = 5;

    /* loaded from: classes6.dex */
    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j);
    }

    /* loaded from: classes6.dex */
    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(NetflixMediaDrm netflixMediaDrm, byte[] bArr, List<KeyStatus> list, boolean z);
    }

    void setOnExpirationUpdateListener(OnExpirationUpdateListener onExpirationUpdateListener, Handler handler);

    void setOnKeyStatusChangeListener(OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler);

    /* loaded from: classes6.dex */
    public static final class KeyStatus {
        public static final int STATUS_EXPIRED = 1;
        public static final int STATUS_INTERNAL_ERROR = 4;
        public static final int STATUS_OUTPUT_NOT_ALLOWED = 2;
        public static final int STATUS_PENDING = 3;
        public static final int STATUS_USABLE = 0;
        private final byte[] mKeyId;
        private final int mStatusCode;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface KeyStatusCode {
        }

        public byte[] getKeyId() {
            return this.mKeyId;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        @TargetApi(23)
        public KeyStatus(MediaDrm.KeyStatus keyStatus) {
            this.mKeyId = keyStatus.getKeyId();
            this.mStatusCode = keyStatus.getStatusCode();
        }

        public KeyStatus(byte[] bArr, int i) {
            this.mKeyId = bArr;
            this.mStatusCode = i;
        }
    }
}
