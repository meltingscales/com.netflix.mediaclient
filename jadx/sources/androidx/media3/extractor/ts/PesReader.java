package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class PesReader implements TsPayloadReader {
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private boolean ptsFlag;
    private final ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private long timeUs;
    private TimestampAdjuster timestampAdjuster;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
    private int state = 0;

    private void setState(int i) {
        this.state = i;
        this.bytesRead = 0;
    }

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void consume(ParsableByteArray parsableByteArray, int i) {
        Assertions.checkStateNotNull(this.timestampAdjuster);
        if ((i & 1) != 0) {
            int i2 = this.state;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.payloadSize != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + this.payloadSize + " more bytes");
                    }
                    this.reader.packetFinished(parsableByteArray.limit() == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            setState(1);
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i3 = this.state;
            if (i3 == 0) {
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (continueRead(parsableByteArray, this.pesScratch.data, Math.min(10, this.extendedHeaderLength)) && continueRead(parsableByteArray, null, this.extendedHeaderLength)) {
                        parseHeaderExtension();
                        i |= this.dataAlignmentIndicator ? 4 : 0;
                        this.reader.packetStarted(this.timeUs, i);
                        setState(3);
                    }
                } else if (i3 == 3) {
                    int bytesLeft = parsableByteArray.bytesLeft();
                    int i4 = this.payloadSize;
                    int i5 = i4 == -1 ? 0 : bytesLeft - i4;
                    if (i5 > 0) {
                        bytesLeft -= i5;
                        parsableByteArray.setLimit(parsableByteArray.getPosition() + bytesLeft);
                    }
                    this.reader.consume(parsableByteArray);
                    int i6 = this.payloadSize;
                    if (i6 != -1) {
                        int i7 = i6 - bytesLeft;
                        this.payloadSize = i7;
                        if (i7 == 0) {
                            this.reader.packetFinished(false);
                            setState(1);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (continueRead(parsableByteArray, this.pesScratch.data, 9)) {
                setState(parseHeader() ? 2 : 0);
            }
        }
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(min);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, min);
        }
        int i2 = this.bytesRead + min;
        this.bytesRead = i2;
        return i2 == i;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int readBits = this.pesScratch.readBits(24);
        if (readBits != 1) {
            Log.w("PesReader", "Unexpected start code prefix: " + readBits);
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        int readBits2 = this.pesScratch.readBits(16);
        this.pesScratch.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int readBits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = readBits3;
        if (readBits2 == 0) {
            this.payloadSize = -1;
        } else {
            int i = (readBits2 - 3) - readBits3;
            this.payloadSize = i;
            if (i < 0) {
                Log.w("PesReader", "Found negative packet payload size: " + this.payloadSize);
                this.payloadSize = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void parseHeaderExtension() {
        char c;
        this.pesScratch.setPosition(0);
        this.timeUs = -9223372036854775807L;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            long readBits = this.pesScratch.readBits(3);
            this.pesScratch.skipBits(1);
            long readBits2 = this.pesScratch.readBits(15) << 15;
            this.pesScratch.skipBits(1);
            long readBits3 = this.pesScratch.readBits(15);
            this.pesScratch.skipBits(1);
            if (this.seenFirstDts || !this.dtsFlag) {
                c = 30;
            } else {
                this.pesScratch.skipBits(4);
                this.pesScratch.skipBits(1);
                long readBits4 = this.pesScratch.readBits(15) << 15;
                this.pesScratch.skipBits(1);
                long readBits5 = this.pesScratch.readBits(15);
                this.pesScratch.skipBits(1);
                c = 30;
                this.timestampAdjuster.adjustTsTimestamp((this.pesScratch.readBits(3) << 30) | readBits4 | readBits5);
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp((readBits << c) | readBits2 | readBits3);
        }
    }
}
