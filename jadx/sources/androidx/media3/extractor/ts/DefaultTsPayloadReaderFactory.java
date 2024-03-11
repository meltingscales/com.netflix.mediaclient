package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private final List<Format> closedCaptionFormats;
    private final int flags;

    private boolean isSet(int i) {
        return (i & this.flags) != 0;
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int i) {
        this(i, ImmutableList.of());
    }

    public DefaultTsPayloadReaderFactory(int i, List<Format> list) {
        this.flags = i;
        this.closedCaptionFormats = list;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public TsPayloadReader createPayloadReader(int i, TsPayloadReader.EsInfo esInfo) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new PesReader(new MpegAudioReader(esInfo.language));
            }
            if (i != 21) {
                if (i == 27) {
                    if (isSet(4)) {
                        return null;
                    }
                    return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 172) {
                                if (i != 257) {
                                    if (i != 134) {
                                        if (i != 135) {
                                            switch (i) {
                                                case 15:
                                                    if (isSet(2)) {
                                                        return null;
                                                    }
                                                    return new PesReader(new AdtsReader(false, esInfo.language));
                                                case 16:
                                                    return new PesReader(new H263Reader(buildUserDataReader(esInfo)));
                                                case 17:
                                                    if (isSet(2)) {
                                                        return null;
                                                    }
                                                    return new PesReader(new LatmReader(esInfo.language));
                                                default:
                                                    switch (i) {
                                                        case 128:
                                                            break;
                                                        case 129:
                                                            break;
                                                        case 130:
                                                            if (!isSet(64)) {
                                                                return null;
                                                            }
                                                            break;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return new PesReader(new Ac3Reader(esInfo.language));
                                    } else if (isSet(16)) {
                                        return null;
                                    } else {
                                        return new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                                    }
                                }
                                return new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
                            }
                            return new PesReader(new Ac4Reader(esInfo.language));
                        }
                        return new PesReader(new DtsReader(esInfo.language));
                    }
                    return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
                } else {
                    return new PesReader(new H265Reader(buildSeiReader(esInfo)));
                }
            }
            return new PesReader(new Id3Reader());
        }
        return new PesReader(new H262Reader(buildUserDataReader(esInfo)));
    }

    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        return new SeiReader(getClosedCaptionFormats(esInfo));
    }

    private UserDataReader buildUserDataReader(TsPayloadReader.EsInfo esInfo) {
        return new UserDataReader(getClosedCaptionFormats(esInfo));
    }

    private List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i;
        List<byte[]> list;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> list2 = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            if (readUnsignedByte == 134) {
                list2 = new ArrayList<>();
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                for (int i2 = 0; i2 < (readUnsignedByte3 & 31); i2++) {
                    String readString = parsableByteArray.readString(3);
                    int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                    boolean z = (readUnsignedByte4 & 128) != 0;
                    if (z) {
                        i = readUnsignedByte4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte readUnsignedByte5 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (z) {
                        list = CodecSpecificDataUtil.buildCea708InitializationData((readUnsignedByte5 & 64) != 0);
                    } else {
                        list = null;
                    }
                    list2.add(new Format.Builder().setSampleMimeType(str).setLanguage(readString).setAccessibilityChannel(i).setInitializationData(list).build());
                }
            }
            parsableByteArray.setPosition(position + readUnsignedByte2);
        }
        return list2;
    }
}
