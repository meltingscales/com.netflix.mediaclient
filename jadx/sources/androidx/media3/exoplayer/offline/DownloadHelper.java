package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();

    /* loaded from: classes5.dex */
    public static class LiveContentUnsupportedException extends IOException {
    }
}
