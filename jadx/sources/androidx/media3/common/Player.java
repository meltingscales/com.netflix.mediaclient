package androidx.media3.common;

import android.os.Bundle;
import android.view.SurfaceView;
import androidx.media3.common.Bundleable;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public interface Player {

    /* loaded from: classes2.dex */
    public interface Listener {
        default void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        default void onAvailableCommandsChanged(Commands commands) {
        }

        default void onCues(CueGroup cueGroup) {
        }

        @Deprecated
        default void onCues(List<Cue> list) {
        }

        default void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        default void onDeviceVolumeChanged(int i, boolean z) {
        }

        default void onEvents(Player player, Events events) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        default void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        default void onMetadata(Metadata metadata) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i) {
        }

        default void onPositionDiscontinuity(PositionInfo positionInfo, PositionInfo positionInfo2, int i) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i) {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }

        default void onTimelineChanged(Timeline timeline, int i) {
        }

        default void onTracksChanged(Tracks tracks) {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }

        default void onVolumeChanged(float f) {
        }
    }

    void addListener(Listener listener);

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    Object getCurrentManifest();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    Timeline getCurrentTimeline();

    Tracks getCurrentTracks();

    @Deprecated
    int getCurrentWindowIndex();

    long getDuration();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    PlaybackException getPlayerError();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void removeListener(Listener listener);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVolume(float f);

    /* loaded from: classes2.dex */
    public static final class Events {
        private final FlagSet flags;

        public Events(FlagSet flagSet) {
            this.flags = flagSet;
        }

        public int hashCode() {
            return this.flags.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.flags.equals(((Events) obj).flags);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PositionInfo implements Bundleable {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final MediaItem mediaItem;
        public final int mediaItemIndex;
        public final int periodIndex;
        public final Object periodUid;
        public final long positionMs;
        @Deprecated
        public final int windowIndex;
        public final Object windowUid;
        static final String FIELD_MEDIA_ITEM_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_MEDIA_ITEM = Util.intToStringMaxRadix(1);
        static final String FIELD_PERIOD_INDEX = Util.intToStringMaxRadix(2);
        static final String FIELD_POSITION_MS = Util.intToStringMaxRadix(3);
        static final String FIELD_CONTENT_POSITION_MS = Util.intToStringMaxRadix(4);
        private static final String FIELD_AD_GROUP_INDEX = Util.intToStringMaxRadix(5);
        private static final String FIELD_AD_INDEX_IN_AD_GROUP = Util.intToStringMaxRadix(6);
        public static final Bundleable.Creator<PositionInfo> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Player$PositionInfo$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Player.PositionInfo fromBundle;
                fromBundle = Player.PositionInfo.fromBundle(bundle);
                return fromBundle;
            }
        };

        public PositionInfo(Object obj, int i, MediaItem mediaItem, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.windowUid = obj;
            this.windowIndex = i;
            this.mediaItemIndex = i;
            this.mediaItem = mediaItem;
            this.periodUid = obj2;
            this.periodIndex = i2;
            this.positionMs = j;
            this.contentPositionMs = j2;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PositionInfo.class != obj.getClass()) {
                return false;
            }
            PositionInfo positionInfo = (PositionInfo) obj;
            return equalsForBundling(positionInfo) && Objects.equal(this.windowUid, positionInfo.windowUid) && Objects.equal(this.periodUid, positionInfo.periodUid);
        }

        public int hashCode() {
            Object obj = this.windowUid;
            int i = this.mediaItemIndex;
            return Objects.hashCode(obj, Integer.valueOf(i), this.mediaItem, this.periodUid, Integer.valueOf(this.periodIndex), Long.valueOf(this.positionMs), Long.valueOf(this.contentPositionMs), Integer.valueOf(this.adGroupIndex), Integer.valueOf(this.adIndexInAdGroup));
        }

        public boolean equalsForBundling(PositionInfo positionInfo) {
            return this.mediaItemIndex == positionInfo.mediaItemIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && Objects.equal(this.mediaItem, positionInfo.mediaItem);
        }

        public Bundle toBundle(int i) {
            Bundle bundle = new Bundle();
            if (i < 3 || this.mediaItemIndex != 0) {
                bundle.putInt(FIELD_MEDIA_ITEM_INDEX, this.mediaItemIndex);
            }
            MediaItem mediaItem = this.mediaItem;
            if (mediaItem != null) {
                bundle.putBundle(FIELD_MEDIA_ITEM, mediaItem.toBundle());
            }
            if (i < 3 || this.periodIndex != 0) {
                bundle.putInt(FIELD_PERIOD_INDEX, this.periodIndex);
            }
            if (i < 3 || this.positionMs != 0) {
                bundle.putLong(FIELD_POSITION_MS, this.positionMs);
            }
            if (i < 3 || this.contentPositionMs != 0) {
                bundle.putLong(FIELD_CONTENT_POSITION_MS, this.contentPositionMs);
            }
            int i2 = this.adGroupIndex;
            if (i2 != -1) {
                bundle.putInt(FIELD_AD_GROUP_INDEX, i2);
            }
            int i3 = this.adIndexInAdGroup;
            if (i3 != -1) {
                bundle.putInt(FIELD_AD_INDEX_IN_AD_GROUP, i3);
            }
            return bundle;
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            return toBundle(Integer.MAX_VALUE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PositionInfo fromBundle(Bundle bundle) {
            int i = bundle.getInt(FIELD_MEDIA_ITEM_INDEX, 0);
            Bundle bundle2 = bundle.getBundle(FIELD_MEDIA_ITEM);
            return new PositionInfo(null, i, bundle2 == null ? null : MediaItem.CREATOR.fromBundle(bundle2), null, bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getLong(FIELD_POSITION_MS, 0L), bundle.getLong(FIELD_CONTENT_POSITION_MS, 0L), bundle.getInt(FIELD_AD_GROUP_INDEX, -1), bundle.getInt(FIELD_AD_INDEX_IN_AD_GROUP, -1));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Commands implements Bundleable {
        private final FlagSet flags;
        public static final Commands EMPTY = new Builder().build();
        private static final String FIELD_COMMANDS = Util.intToStringMaxRadix(0);
        public static final Bundleable.Creator<Commands> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Player$Commands$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Player.Commands fromBundle;
                fromBundle = Player.Commands.fromBundle(bundle);
                return fromBundle;
            }
        };

        /* loaded from: classes2.dex */
        public static final class Builder {
            private static final int[] SUPPORTED_COMMANDS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
            private final FlagSet.Builder flagsBuilder = new FlagSet.Builder();

            public Builder add(int i) {
                this.flagsBuilder.add(i);
                return this;
            }

            public Builder addIf(int i, boolean z) {
                this.flagsBuilder.addIf(i, z);
                return this;
            }

            public Builder addAll(int... iArr) {
                this.flagsBuilder.addAll(iArr);
                return this;
            }

            public Builder addAll(Commands commands) {
                this.flagsBuilder.addAll(commands.flags);
                return this;
            }

            public Commands build() {
                return new Commands(this.flagsBuilder.build());
            }
        }

        private Commands(FlagSet flagSet) {
            this.flags = flagSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.flags.equals(((Commands) obj).flags);
            }
            return false;
        }

        public int hashCode() {
            return this.flags.hashCode();
        }

        @Override // androidx.media3.common.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.flags.size(); i++) {
                arrayList.add(Integer.valueOf(this.flags.get(i)));
            }
            bundle.putIntegerArrayList(FIELD_COMMANDS, arrayList);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Commands fromBundle(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(FIELD_COMMANDS);
            if (integerArrayList == null) {
                return EMPTY;
            }
            Builder builder = new Builder();
            for (int i = 0; i < integerArrayList.size(); i++) {
                builder.add(integerArrayList.get(i).intValue());
            }
            return builder.build();
        }
    }
}
