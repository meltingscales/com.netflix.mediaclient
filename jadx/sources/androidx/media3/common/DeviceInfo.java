package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
public final class DeviceInfo implements Bundleable {
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;
    public final String routingControllerId;
    public static final DeviceInfo UNKNOWN = new Builder(0).build();
    private static final String FIELD_PLAYBACK_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_MIN_VOLUME = Util.intToStringMaxRadix(1);
    private static final String FIELD_MAX_VOLUME = Util.intToStringMaxRadix(2);
    private static final String FIELD_ROUTING_CONTROLLER_ID = Util.intToStringMaxRadix(3);
    public static final Bundleable.Creator<DeviceInfo> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.DeviceInfo$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            DeviceInfo lambda$static$0;
            lambda$static$0 = DeviceInfo.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };

    /* loaded from: classes2.dex */
    public static final class Builder {
        private int maxVolume;
        private int minVolume;
        private final int playbackType;
        private String routingControllerId;

        public Builder setMaxVolume(int i) {
            this.maxVolume = i;
            return this;
        }

        public Builder setMinVolume(int i) {
            this.minVolume = i;
            return this;
        }

        public Builder(int i) {
            this.playbackType = i;
        }

        public Builder setRoutingControllerId(String str) {
            Assertions.checkArgument(this.playbackType != 0 || str == null);
            this.routingControllerId = str;
            return this;
        }

        public DeviceInfo build() {
            Assertions.checkArgument(this.minVolume <= this.maxVolume);
            return new DeviceInfo(this);
        }
    }

    private DeviceInfo(Builder builder) {
        this.playbackType = builder.playbackType;
        this.minVolume = builder.minVolume;
        this.maxVolume = builder.maxVolume;
        this.routingControllerId = builder.routingControllerId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume && Util.areEqual(this.routingControllerId, deviceInfo.routingControllerId);
        }
        return false;
    }

    public int hashCode() {
        int i = this.playbackType;
        int i2 = this.minVolume;
        int i3 = this.maxVolume;
        String str = this.routingControllerId;
        return ((((((i + 527) * 31) + i2) * 31) + i3) * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.playbackType;
        if (i != 0) {
            bundle.putInt(FIELD_PLAYBACK_TYPE, i);
        }
        int i2 = this.minVolume;
        if (i2 != 0) {
            bundle.putInt(FIELD_MIN_VOLUME, i2);
        }
        int i3 = this.maxVolume;
        if (i3 != 0) {
            bundle.putInt(FIELD_MAX_VOLUME, i3);
        }
        String str = this.routingControllerId;
        if (str != null) {
            bundle.putString(FIELD_ROUTING_CONTROLLER_ID, str);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DeviceInfo lambda$static$0(Bundle bundle) {
        int i = bundle.getInt(FIELD_PLAYBACK_TYPE, 0);
        int i2 = bundle.getInt(FIELD_MIN_VOLUME, 0);
        int i3 = bundle.getInt(FIELD_MAX_VOLUME, 0);
        return new Builder(i).setMinVolume(i2).setMaxVolume(i3).setRoutingControllerId(bundle.getString(FIELD_ROUTING_CONTROLLER_ID)).build();
    }
}
