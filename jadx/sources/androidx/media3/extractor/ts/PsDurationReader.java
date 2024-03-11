package androidx.media3.extractor.ts;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel;

/* loaded from: classes5.dex */
final class PsDurationReader {
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private final TimestampAdjuster scrTimestampAdjuster = new TimestampAdjuster(0);
    private long firstScrValue = -9223372036854775807L;
    private long lastScrValue = -9223372036854775807L;
    private long durationUs = -9223372036854775807L;
    private final ParsableByteArray packetBuffer = new ParsableByteArray();

    public long getDurationUs() {
        return this.durationUs;
    }

    public TimestampAdjuster getScrTimestampAdjuster() {
        return this.scrTimestampAdjuster;
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (this.isLastScrValueRead) {
            if (this.lastScrValue == -9223372036854775807L) {
                return finishReadDuration(extractorInput);
            }
            if (this.isFirstScrValueRead) {
                long j = this.firstScrValue;
                if (j == -9223372036854775807L) {
                    return finishReadDuration(extractorInput);
                }
                long adjustTsTimestamp = this.scrTimestampAdjuster.adjustTsTimestamp(this.lastScrValue) - this.scrTimestampAdjuster.adjustTsTimestamp(j);
                this.durationUs = adjustTsTimestamp;
                if (adjustTsTimestamp < 0) {
                    Log.w("PsDurationReader", "Invalid duration: " + this.durationUs + ". Using TIME_UNSET instead.");
                    this.durationUs = -9223372036854775807L;
                }
                return finishReadDuration(extractorInput);
            }
            return readFirstScrValue(extractorInput, positionHolder);
        }
        return readLastScrValue(extractorInput, positionHolder);
    }

    public static long readScrValueFromPack(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (parsableByteArray.bytesLeft() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(bArr, 0, 9);
        parsableByteArray.setPosition(position);
        if (checkMarkerBits(bArr)) {
            return readScrValueFromPackHeader(bArr);
        }
        return -9223372036854775807L;
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
        this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int min = (int) Math.min((long) VerifyCardContextViewModel.AUTO_SUBMIT_TIMEOUT_MS, extractorInput.getLength());
        long j = 0;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
        this.firstScrValue = readFirstScrValueFromBuffer(this.packetBuffer);
        this.isFirstScrValueRead = true;
        return 0;
    }

    private long readFirstScrValueFromBuffer(ParsableByteArray parsableByteArray) {
        int limit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < limit - 3; position++) {
            if (peekIntAtPosition(parsableByteArray.getData(), position) == 442) {
                parsableByteArray.setPosition(position + 4);
                long readScrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != -9223372036854775807L) {
                    return readScrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int readLastScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) {
        long length = extractorInput.getLength();
        int min = (int) Math.min((long) VerifyCardContextViewModel.AUTO_SUBMIT_TIMEOUT_MS, length);
        long j = length - min;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, min);
        this.lastScrValue = readLastScrValueFromBuffer(this.packetBuffer);
        this.isLastScrValueRead = true;
        return 0;
    }

    private long readLastScrValueFromBuffer(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        for (int limit = parsableByteArray.limit() - 4; limit >= position; limit--) {
            if (peekIntAtPosition(parsableByteArray.getData(), limit) == 442) {
                parsableByteArray.setPosition(limit + 4);
                long readScrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != -9223372036854775807L) {
                    return readScrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private static boolean checkMarkerBits(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long readScrValueFromPackHeader(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }
}
