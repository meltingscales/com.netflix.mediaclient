package androidx.media3.extractor.ts;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;

/* loaded from: classes5.dex */
final class TsDurationReader {
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private final int timestampSearchBytes;
    private final TimestampAdjuster pcrTimestampAdjuster = new TimestampAdjuster(0);
    private long firstPcrValue = -9223372036854775807L;
    private long lastPcrValue = -9223372036854775807L;
    private long durationUs = -9223372036854775807L;
    private final ParsableByteArray packetBuffer = new ParsableByteArray();

    public long getDurationUs() {
        return this.durationUs;
    }

    public TimestampAdjuster getPcrTimestampAdjuster() {
        return this.pcrTimestampAdjuster;
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TsDurationReader(int i) {
        this.timestampSearchBytes = i;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder, int i) {
        if (i <= 0) {
            return finishReadDuration(extractorInput);
        }
        if (this.isLastPcrValueRead) {
            if (this.lastPcrValue == -9223372036854775807L) {
                return finishReadDuration(extractorInput);
            }
            if (this.isFirstPcrValueRead) {
                long j = this.firstPcrValue;
                if (j == -9223372036854775807L) {
                    return finishReadDuration(extractorInput);
                }
                long adjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(this.lastPcrValue) - this.pcrTimestampAdjuster.adjustTsTimestamp(j);
                this.durationUs = adjustTsTimestamp;
                if (adjustTsTimestamp < 0) {
                    Log.w("TsDurationReader", "Invalid duration: " + this.durationUs + ". Using TIME_UNSET instead.");
                    this.durationUs = -9223372036854775807L;
                }
                return finishReadDuration(extractorInput);
            }
            return readFirstPcrValue(extractorInput, positionHolder, i);
        }
        return readLastPcrValue(extractorInput, positionHolder, i);
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
        this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i) {
        int min = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength());
        long j = 0;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
        this.firstPcrValue = readFirstPcrValueFromBuffer(this.packetBuffer, i);
        this.isFirstPcrValueRead = true;
        return 0;
    }

    private long readFirstPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i) {
        int limit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < limit; position++) {
            if (parsableByteArray.getData()[position] == 71) {
                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, position, i);
                if (readPcrFromPacket != -9223372036854775807L) {
                    return readPcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int readLastPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i) {
        long length = extractorInput.getLength();
        int min = (int) Math.min(this.timestampSearchBytes, length);
        long j = length - min;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
        this.lastPcrValue = readLastPcrValueFromBuffer(this.packetBuffer, i);
        this.isLastPcrValueRead = true;
        return 0;
    }

    private long readLastPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        for (int i2 = limit - 188; i2 >= position; i2--) {
            if (TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, limit, i2)) {
                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i2, i);
                if (readPcrFromPacket != -9223372036854775807L) {
                    return readPcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }
}
