package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;

/* loaded from: classes5.dex */
final class StreamNameChunk implements AviChunk {
    public final String name;

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 1852994675;
    }

    public static StreamNameChunk parseFrom(ParsableByteArray parsableByteArray) {
        return new StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    private StreamNameChunk(String str) {
        this.name = str;
    }
}