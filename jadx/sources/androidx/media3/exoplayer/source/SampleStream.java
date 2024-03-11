package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;

/* loaded from: classes2.dex */
public interface SampleStream {
    boolean isReady();

    void maybeThrowError();

    int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i);

    int skipData(long j);
}
