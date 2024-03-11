package com.netflix.mediaclient.drm;

import android.annotation.TargetApi;
import android.media.MediaDrm;
import android.os.Handler;
import com.netflix.mediaclient.drm.NetflixMediaDrmApi23;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@TargetApi(23)
/* loaded from: classes3.dex */
public class PlatformMediaDrmApi23 extends PlatformMediaDrm implements NetflixMediaDrmApi23 {
    protected OnExpirationUpdateListenerWrapper mOnExpirationUpdateListener;
    protected OnKeyStatusChangeListenerWrapper mOnKeyStatusChangeListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformMediaDrmApi23(UUID uuid) {
        super(uuid);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi23
    public void setOnExpirationUpdateListener(NetflixMediaDrmApi23.OnExpirationUpdateListener onExpirationUpdateListener, Handler handler) {
        if (onExpirationUpdateListener != null) {
            this.mOnExpirationUpdateListener = new OnExpirationUpdateListenerWrapper(onExpirationUpdateListener);
        } else {
            this.mOnExpirationUpdateListener = null;
        }
        this.mMediaDrm.setOnExpirationUpdateListener(this.mOnExpirationUpdateListener, handler);
    }

    @Override // com.netflix.mediaclient.drm.NetflixMediaDrmApi23
    public void setOnKeyStatusChangeListener(NetflixMediaDrmApi23.OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler) {
        if (onKeyStatusChangeListener != null) {
            this.mOnKeyStatusChangeListener = new OnKeyStatusChangeListenerWrapper(onKeyStatusChangeListener);
        } else {
            this.mOnKeyStatusChangeListener = null;
        }
        this.mMediaDrm.setOnKeyStatusChangeListener(this.mOnKeyStatusChangeListener, handler);
    }

    /* loaded from: classes6.dex */
    class OnKeyStatusChangeListenerWrapper implements MediaDrm.OnKeyStatusChangeListener {
        private final NetflixMediaDrmApi23.OnKeyStatusChangeListener originalListener;

        public OnKeyStatusChangeListenerWrapper(NetflixMediaDrmApi23.OnKeyStatusChangeListener onKeyStatusChangeListener) {
            if (onKeyStatusChangeListener == null) {
                throw new IllegalArgumentException("Original listener can not be null");
            }
            this.originalListener = onKeyStatusChangeListener;
        }

        @Override // android.media.MediaDrm.OnKeyStatusChangeListener
        public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z) {
            this.originalListener.onKeyStatusChange(PlatformMediaDrmApi23.this, bArr, PlatformMediaDrmApi23.convertKeyStatuses(list), z);
        }
    }

    /* loaded from: classes6.dex */
    static class OnExpirationUpdateListenerWrapper implements MediaDrm.OnExpirationUpdateListener {
        private final NetflixMediaDrmApi23.OnExpirationUpdateListener originalListener;

        OnExpirationUpdateListenerWrapper(NetflixMediaDrmApi23.OnExpirationUpdateListener onExpirationUpdateListener) {
            if (onExpirationUpdateListener == null) {
                throw new IllegalArgumentException("Original listener can not be null");
            }
            this.originalListener = onExpirationUpdateListener;
        }

        @Override // android.media.MediaDrm.OnExpirationUpdateListener
        public void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
            this.originalListener.onExpirationUpdate(mediaDrm, bArr, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static List<NetflixMediaDrmApi23.KeyStatus> convertKeyStatuses(List<MediaDrm.KeyStatus> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(convertKeyStatus(list.get(i)));
        }
        return arrayList;
    }

    private static NetflixMediaDrmApi23.KeyStatus convertKeyStatus(MediaDrm.KeyStatus keyStatus) {
        if (keyStatus == null) {
            return null;
        }
        return new NetflixMediaDrmApi23.KeyStatus(keyStatus);
    }
}
