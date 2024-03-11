package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
final class OggPageHeader {
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    public long streamSerialNumber;
    public int type;
    public final int[] laces = new int[PrivateKeyType.INVALID];
    private final ParsableByteArray scratch = new ParsableByteArray((int) PrivateKeyType.INVALID);

    public void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0L;
        this.streamSerialNumber = 0L;
        this.pageSequenceNumber = 0L;
        this.pageChecksum = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }

    public boolean skipToNextPage(ExtractorInput extractorInput) {
        return skipToNextPage(extractorInput, -1L);
    }

    public boolean skipToNextPage(ExtractorInput extractorInput, long j) {
        int i;
        Assertions.checkArgument(extractorInput.getPosition() == extractorInput.getPeekPosition());
        this.scratch.reset(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || extractorInput.getPosition() + 4 < j) && ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, 4, true)) {
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt() == 1332176723) {
                    extractorInput.resetPeekPosition();
                    return true;
                }
                extractorInput.skipFully(1);
            }
        }
        do {
            if (i != 0 && extractorInput.getPosition() >= j) {
                break;
            }
        } while (extractorInput.skip(1) != -1);
        return false;
    }

    public boolean populate(ExtractorInput extractorInput, boolean z) {
        reset();
        this.scratch.reset(27);
        if (ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, 27, z) && this.scratch.readUnsignedInt() == 1332176723) {
            int readUnsignedByte = this.scratch.readUnsignedByte();
            this.revision = readUnsignedByte;
            if (readUnsignedByte != 0) {
                if (z) {
                    return false;
                }
                throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
            this.type = this.scratch.readUnsignedByte();
            this.granulePosition = this.scratch.readLittleEndianLong();
            this.streamSerialNumber = this.scratch.readLittleEndianUnsignedInt();
            this.pageSequenceNumber = this.scratch.readLittleEndianUnsignedInt();
            this.pageChecksum = this.scratch.readLittleEndianUnsignedInt();
            int readUnsignedByte2 = this.scratch.readUnsignedByte();
            this.pageSegmentCount = readUnsignedByte2;
            this.headerSize = readUnsignedByte2 + 27;
            this.scratch.reset(readUnsignedByte2);
            if (ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, this.pageSegmentCount, z)) {
                for (int i = 0; i < this.pageSegmentCount; i++) {
                    this.laces[i] = this.scratch.readUnsignedByte();
                    this.bodySize += this.laces[i];
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
