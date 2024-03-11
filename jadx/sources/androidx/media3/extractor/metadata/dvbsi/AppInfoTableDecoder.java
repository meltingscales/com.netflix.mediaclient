package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return parseAit(new ParsableBitArray(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static Metadata parseAit(ParsableBitArray parsableBitArray) {
        parsableBitArray.skipBits(12);
        int readBits = parsableBitArray.readBits(12);
        int bytePosition = parsableBitArray.getBytePosition();
        parsableBitArray.skipBits(44);
        parsableBitArray.skipBytes(parsableBitArray.readBits(12));
        parsableBitArray.skipBits(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (parsableBitArray.getBytePosition() >= (bytePosition + readBits) - 4) {
                break;
            }
            parsableBitArray.skipBits(48);
            int readBits2 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(4);
            int bytePosition2 = parsableBitArray.getBytePosition() + parsableBitArray.readBits(12);
            String str2 = null;
            while (parsableBitArray.getBytePosition() < bytePosition2) {
                int readBits3 = parsableBitArray.readBits(8);
                int readBits4 = parsableBitArray.readBits(8);
                int bytePosition3 = parsableBitArray.getBytePosition() + readBits4;
                if (readBits3 == 2) {
                    int readBits5 = parsableBitArray.readBits(16);
                    parsableBitArray.skipBits(8);
                    if (readBits5 != 3) {
                    }
                    while (parsableBitArray.getBytePosition() < bytePosition3) {
                        str = parsableBitArray.readBytesAsString(parsableBitArray.readBits(8), Charsets.US_ASCII);
                        int readBits6 = parsableBitArray.readBits(8);
                        for (int i = 0; i < readBits6; i++) {
                            parsableBitArray.skipBytes(parsableBitArray.readBits(8));
                        }
                    }
                } else if (readBits3 == 21) {
                    str2 = parsableBitArray.readBytesAsString(readBits4, Charsets.US_ASCII);
                }
                parsableBitArray.setPosition(bytePosition3 * 8);
            }
            parsableBitArray.setPosition(bytePosition2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(readBits2, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}