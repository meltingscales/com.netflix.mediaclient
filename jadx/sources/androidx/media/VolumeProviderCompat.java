package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class VolumeProviderCompat {
    private Callback mCallback;
    private final String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public VolumeProviderCompat(int i, int i2, int i3, String str) {
        this.mControlType = i;
        this.mMaxVolume = i2;
        this.mCurrentVolume = i3;
        this.mControlId = str;
    }

    public final void setCurrentVolume(int i) {
        this.mCurrentVolume = i;
        ((VolumeProvider) getVolumeProvider()).setCurrentVolume(i);
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public Object getVolumeProvider() {
        if (this.mVolumeProviderFwk == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mVolumeProviderFwk = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, this.mControlId) { // from class: androidx.media.VolumeProviderCompat.1
                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i) {
                        VolumeProviderCompat.this.onSetVolumeTo(i);
                    }

                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i) {
                        VolumeProviderCompat.this.onAdjustVolume(i);
                    }
                };
            } else {
                this.mVolumeProviderFwk = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume) { // from class: androidx.media.VolumeProviderCompat.2
                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i) {
                        VolumeProviderCompat.this.onSetVolumeTo(i);
                    }

                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i) {
                        VolumeProviderCompat.this.onAdjustVolume(i);
                    }
                };
            }
        }
        return this.mVolumeProviderFwk;
    }
}
