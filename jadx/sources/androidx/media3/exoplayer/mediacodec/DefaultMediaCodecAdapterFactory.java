package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;

/* loaded from: classes2.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    private int asynchronousMode = 0;
    private boolean enableSynchronizeCodecInteractionsWithQueueing;

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) {
        int i;
        int i2 = Util.SDK_INT;
        if (i2 >= 23 && ((i = this.asynchronousMode) == 1 || (i == 0 && i2 >= 31))) {
            int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
            Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + Util.getTrackTypeString(trackType));
            return new AsynchronousMediaCodecAdapter.Factory(trackType, this.enableSynchronizeCodecInteractionsWithQueueing).createAdapter(configuration);
        }
        return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
    }
}
