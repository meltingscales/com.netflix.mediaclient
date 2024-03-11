package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;

/* loaded from: classes2.dex */
public interface Decoder<I, O, E extends DecoderException> {
    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    void queueInputBuffer(I i);

    void release();
}
