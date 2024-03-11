package androidx.media3.exoplayer.image;

import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;

/* loaded from: classes2.dex */
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    ImageOutputBuffer dequeueOutputBuffer();

    @Override // androidx.media3.decoder.Decoder
    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer);
}
