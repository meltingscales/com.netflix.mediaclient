package androidx.media3.extractor.flv;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.flv.TagPayloadReader;

/* loaded from: classes5.dex */
final class VideoTagPayloadReader extends TagPayloadReader {
    private int frameType;
    private boolean hasOutputFormat;
    private boolean hasOutputKeyframe;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int nalUnitLengthFieldLength;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean parseHeader(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = (readUnsignedByte >> 4) & 15;
        int i2 = readUnsignedByte & 15;
        if (i2 == 7) {
            this.frameType = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean parsePayload(ParsableByteArray parsableByteArray, long j) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        long readInt24 = parsableByteArray.readInt24();
        if (readUnsignedByte == 0 && !this.hasOutputFormat) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.bytesLeft()]);
            parsableByteArray.readBytes(parsableByteArray2.getData(), 0, parsableByteArray.bytesLeft());
            AvcConfig parse = AvcConfig.parse(parsableByteArray2);
            this.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
            this.output.format(new Format.Builder().setSampleMimeType("video/avc").setCodecs(parse.codecs).setWidth(parse.width).setHeight(parse.height).setPixelWidthHeightRatio(parse.pixelWidthHeightRatio).setInitializationData(parse.initializationData).build());
            this.hasOutputFormat = true;
            return false;
        } else if (readUnsignedByte == 1 && this.hasOutputFormat) {
            int i = this.frameType == 1 ? 1 : 0;
            if (this.hasOutputKeyframe || i != 0) {
                byte[] data = this.nalLength.getData();
                data[0] = 0;
                data[1] = 0;
                data[2] = 0;
                int i2 = this.nalUnitLengthFieldLength;
                int i3 = 0;
                while (parsableByteArray.bytesLeft() > 0) {
                    parsableByteArray.readBytes(this.nalLength.getData(), 4 - i2, this.nalUnitLengthFieldLength);
                    this.nalLength.setPosition(0);
                    int readUnsignedIntToInt = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    this.output.sampleData(this.nalStartCode, 4);
                    this.output.sampleData(parsableByteArray, readUnsignedIntToInt);
                    i3 = i3 + 4 + readUnsignedIntToInt;
                }
                this.output.sampleMetadata(j + (readInt24 * 1000), i, i3, 0, null);
                this.hasOutputKeyframe = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
