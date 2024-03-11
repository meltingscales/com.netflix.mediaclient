package androidx.media3.extractor;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Ac3Util {
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {VoipConfiguration.MAX_SAMPLERATE_48K, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, JSONzip.end, 320, 384, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes5.dex */
    public static final class SyncFrameInfo {
        public final int bitrate;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        private SyncFrameInfo(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.mimeType = str;
            this.streamType = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
            this.bitrate = i6;
        }
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(8);
        int i2 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i2++;
        }
        int i3 = BITRATE_BY_HALF_FRMSIZECOD[parsableBitArray.readBits(5)] * 1000;
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new Format.Builder().setId(str).setSampleMimeType("audio/ac3").setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i3).setPeakBitrate(i3).build();
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        String str3;
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int readBits = parsableBitArray.readBits(13);
        parsableBitArray.skipBits(3);
        int i = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(10);
        int i2 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i2++;
        }
        parsableBitArray.skipBits(3);
        int readBits2 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(1);
        if (readBits2 > 0) {
            parsableBitArray.skipBits(6);
            if (parsableBitArray.readBits(1) != 0) {
                i2 += 2;
            }
            parsableBitArray.skipBits(1);
        }
        if (parsableBitArray.bitsLeft() > 7) {
            parsableBitArray.skipBits(7);
            if (parsableBitArray.readBits(1) != 0) {
                str3 = "audio/eac3-joc";
                parsableBitArray.byteAlign();
                parsableByteArray.setPosition(parsableBitArray.getBytePosition());
                return new Format.Builder().setId(str).setSampleMimeType(str3).setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(str2).setPeakBitrate(readBits * 1000).build();
            }
        }
        str3 = "audio/eac3";
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new Format.Builder().setId(str).setSampleMimeType(str3).setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(str2).setPeakBitrate(readBits * 1000).build();
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        boolean z = parsableBitArray.readBits(5) > 10;
        parsableBitArray.setPosition(position);
        int i10 = -1;
        if (z) {
            parsableBitArray.skipBits(16);
            int readBits = parsableBitArray.readBits(2);
            if (readBits == 0) {
                i10 = 0;
            } else if (readBits == 1) {
                i10 = 1;
            } else if (readBits == 2) {
                i10 = 2;
            }
            parsableBitArray.skipBits(3);
            int readBits2 = (parsableBitArray.readBits(11) + 1) * 2;
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 == 3) {
                i8 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int readBits4 = parsableBitArray.readBits(2);
                int i11 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[readBits4];
                i7 = readBits4;
                i8 = SAMPLE_RATE_BY_FSCOD[readBits3];
                i9 = i11;
            }
            int calculateEac3Bitrate = calculateEac3Bitrate(readBits2, i8, i9);
            int readBits5 = parsableBitArray.readBits(3);
            boolean readBit = parsableBitArray.readBit();
            i = CHANNEL_COUNT_BY_ACMOD[readBits5] + (readBit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (readBits5 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i10 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (readBits5 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((readBits5 & 1) != 0 && readBits5 > 2) {
                    parsableBitArray.skipBits(6);
                }
                if ((readBits5 & 4) != 0) {
                    parsableBitArray.skipBits(6);
                }
                if (readBit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i10 == 0) {
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (readBits5 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    int readBits6 = parsableBitArray.readBits(2);
                    if (readBits6 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (readBits6 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (readBits6 == 3) {
                        int readBits7 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((readBits7 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (readBits5 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (readBits5 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (i7 == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i12 = 0; i12 < i9; i12++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (readBits5 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (readBits5 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits5 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits3 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i10 == 0 && i7 != 3) {
                parsableBitArray.skipBit();
            }
            if (i10 == 2 && (i7 == 3 || parsableBitArray.readBit())) {
                parsableBitArray.skipBits(6);
            }
            str = (parsableBitArray.readBit() && parsableBitArray.readBits(6) == 1 && parsableBitArray.readBits(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i3 = i10;
            i4 = readBits2;
            i5 = i8;
            i6 = i9 * JSONzip.end;
            i2 = calculateEac3Bitrate;
        } else {
            parsableBitArray.skipBits(32);
            int readBits8 = parsableBitArray.readBits(2);
            String str2 = readBits8 == 3 ? null : "audio/ac3";
            int readBits9 = parsableBitArray.readBits(6);
            int i13 = BITRATE_BY_HALF_FRMSIZECOD[readBits9 / 2];
            int ac3SyncframeSize = getAc3SyncframeSize(readBits8, readBits9);
            parsableBitArray.skipBits(8);
            int readBits10 = parsableBitArray.readBits(3);
            if ((readBits10 & 1) != 0 && readBits10 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((readBits10 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (readBits10 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            int i14 = readBits8 < iArr.length ? iArr[readBits8] : -1;
            i = CHANNEL_COUNT_BY_ACMOD[readBits10] + (parsableBitArray.readBit() ? 1 : 0);
            i2 = i13 * 1000;
            i3 = -1;
            str = str2;
            i4 = ac3SyncframeSize;
            i5 = i14;
            i6 = 1536;
        }
        return new SyncFrameInfo(str, i3, i, i5, i4, i6, i2);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return getAc3SyncframeSize((b & 192) >> 6, b & 63);
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * JSONzip.end;
        }
        return 1536;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        for (int i = position; i <= limit - 10; i++) {
            if ((Util.getBigEndianInt(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) != 186) {
                return 0;
            }
            return 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i) {
        boolean z = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (z ? 9 : 8)) >> 4) & 7);
    }

    private static int getAc3SyncframeSize(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = BITRATE_BY_HALF_FRMSIZECOD[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }

    private static int calculateEac3Bitrate(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }
}
