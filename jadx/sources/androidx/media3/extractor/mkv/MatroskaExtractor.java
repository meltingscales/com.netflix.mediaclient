package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.chromium.net.ConnectionSubtype;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
public class MatroskaExtractor implements Extractor {
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = MatroskaExtractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    protected int getElementType(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    protected boolean isLevel1Element(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = -9223372036854775807L;
        this.durationTimecode = -9223372036854775807L;
        this.durationUs = -9223372036854775807L;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = -9223372036854775807L;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.seekForCuesEnabled = (i & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return new Sniffer().sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = -9223372036854775807L;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track valueAt = this.tracks.valueAt(i);
            valueAt.assertOutputInitialized();
            valueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    protected void startMasterElement(int i, long j, long j2) {
        assertInitialized();
        if (i == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
        } else if (i == 174) {
            this.currentTrack = new Track();
        } else if (i == 187) {
            this.seenClusterPositionForCurrentCuePoint = false;
        } else if (i == 19899) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
        } else if (i == 20533) {
            getCurrentTrack(i).hasContentEncryption = true;
        } else if (i == 21968) {
            getCurrentTrack(i).hasColorInfo = true;
        } else if (i == 408125543) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j;
            this.segmentContentSize = j2;
        } else if (i == 475249515) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i == 524531317 && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
                return;
            }
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
            this.sentSeekMap = true;
        }
    }

    protected void endMasterElement(int i) {
        assertInitialized();
        if (i == 160) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && "A_OPUS".equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.blockSampleCount; i3++) {
                i2 += this.blockSampleSizes[i3];
            }
            int i4 = 0;
            while (i4 < this.blockSampleCount) {
                long j = this.blockTimeUs;
                long j2 = (track.defaultSampleDurationNs * i4) / 1000;
                int i5 = this.blockFlags;
                if (i4 == 0 && !this.blockHasReferenceBlock) {
                    i5 |= 1;
                }
                int i6 = this.blockSampleSizes[i4];
                int i7 = i2 - i6;
                commitSampleToOutput(track, j + j2, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.blockState = 0;
        } else if (i == 174) {
            Track track2 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track2.codecId;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
        } else if (i == 19899) {
            int i8 = this.seekEntryId;
            if (i8 != -1) {
                long j3 = this.seekEntryPosition;
                if (j3 != -1) {
                    if (i8 == 475249515) {
                        this.cuesContentPosition = j3;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i == 25152) {
            assertInTrackEntry(i);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
            }
        } else if (i == 28032) {
            assertInTrackEntry(i);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
        } else if (i == 357149030) {
            if (this.timecodeScale == -9223372036854775807L) {
                this.timecodeScale = 1000000L;
            }
            long j4 = this.durationTimecode;
            if (j4 != -9223372036854775807L) {
                this.durationUs = scaleTimecodeToUs(j4);
            }
        } else if (i == 374648427) {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        } else if (i == 475249515) {
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        }
    }

    protected void integerElement(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case 131:
                    getCurrentTrack(i).type = (int) j;
                    return;
                case 136:
                    getCurrentTrack(i).flagDefault = j == 1;
                    return;
                case 155:
                    this.blockDurationUs = scaleTimecodeToUs(j);
                    return;
                case 159:
                    getCurrentTrack(i).channelCount = (int) j;
                    return;
                case 176:
                    getCurrentTrack(i).width = (int) j;
                    return;
                case 179:
                    assertInCues(i);
                    this.cueTimesUs.add(scaleTimecodeToUs(j));
                    return;
                case 186:
                    getCurrentTrack(i).height = (int) j;
                    return;
                case 215:
                    getCurrentTrack(i).number = (int) j;
                    return;
                case 231:
                    this.clusterTimecodeUs = scaleTimecodeToUs(j);
                    return;
                case 238:
                    this.blockAdditionalId = (int) j;
                    return;
                case 241:
                    if (this.seenClusterPositionForCurrentCuePoint) {
                        return;
                    }
                    assertInCues(i);
                    this.cueClusterPositions.add(j);
                    this.seenClusterPositionForCurrentCuePoint = true;
                    return;
                case 251:
                    this.blockHasReferenceBlock = true;
                    return;
                case 16871:
                    getCurrentTrack(i).blockAddIdType = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.seekEntryPosition = j + this.segmentContentPosition;
                    return;
                case 21432:
                    int i2 = (int) j;
                    assertInTrackEntry(i);
                    if (i2 == 0) {
                        this.currentTrack.stereoMode = 0;
                        return;
                    } else if (i2 == 1) {
                        this.currentTrack.stereoMode = 2;
                        return;
                    } else if (i2 == 3) {
                        this.currentTrack.stereoMode = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.currentTrack.stereoMode = 3;
                        return;
                    }
                case 21680:
                    getCurrentTrack(i).displayWidth = (int) j;
                    return;
                case 21682:
                    getCurrentTrack(i).displayUnit = (int) j;
                    return;
                case 21690:
                    getCurrentTrack(i).displayHeight = (int) j;
                    return;
                case 21930:
                    getCurrentTrack(i).flagForced = j == 1;
                    return;
                case 21938:
                    assertInTrackEntry(i);
                    Track track = this.currentTrack;
                    track.hasColorInfo = true;
                    track.bitsPerChannel = (int) j;
                    return;
                case 21998:
                    getCurrentTrack(i).maxBlockAdditionId = (int) j;
                    return;
                case 22186:
                    getCurrentTrack(i).codecDelayNs = j;
                    return;
                case 22203:
                    getCurrentTrack(i).seekPreRollNs = j;
                    return;
                case 25188:
                    getCurrentTrack(i).audioBitDepth = (int) j;
                    return;
                case 30114:
                    this.blockGroupDiscardPaddingNs = j;
                    return;
                case 30321:
                    assertInTrackEntry(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.currentTrack.projectionType = 0;
                        return;
                    } else if (i3 == 1) {
                        this.currentTrack.projectionType = 1;
                        return;
                    } else if (i3 == 2) {
                        this.currentTrack.projectionType = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.currentTrack.projectionType = 3;
                        return;
                    }
                case 2352003:
                    getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                    return;
                case 2807729:
                    this.timecodeScale = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            assertInTrackEntry(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.currentTrack.colorRange = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.currentTrack.colorRange = 1;
                                return;
                            }
                        case 21946:
                            assertInTrackEntry(i);
                            int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j);
                            if (isoTransferCharacteristicsToColorTransfer != -1) {
                                this.currentTrack.colorTransfer = isoTransferCharacteristicsToColorTransfer;
                                return;
                            }
                            return;
                        case 21947:
                            assertInTrackEntry(i);
                            this.currentTrack.hasColorInfo = true;
                            int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j);
                            if (isoColorPrimariesToColorSpace != -1) {
                                this.currentTrack.colorSpace = isoColorPrimariesToColorSpace;
                                return;
                            }
                            return;
                        case 21948:
                            getCurrentTrack(i).maxContentLuminance = (int) j;
                            return;
                        case 21949:
                            getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    protected void floatElement(int i, double d) {
        if (i == 181) {
            getCurrentTrack(i).sampleRate = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    getCurrentTrack(i).primaryRChromaticityX = (float) d;
                    return;
                case 21970:
                    getCurrentTrack(i).primaryRChromaticityY = (float) d;
                    return;
                case 21971:
                    getCurrentTrack(i).primaryGChromaticityX = (float) d;
                    return;
                case 21972:
                    getCurrentTrack(i).primaryGChromaticityY = (float) d;
                    return;
                case 21973:
                    getCurrentTrack(i).primaryBChromaticityX = (float) d;
                    return;
                case 21974:
                    getCurrentTrack(i).primaryBChromaticityY = (float) d;
                    return;
                case 21975:
                    getCurrentTrack(i).whitePointChromaticityX = (float) d;
                    return;
                case 21976:
                    getCurrentTrack(i).whitePointChromaticityY = (float) d;
                    return;
                case 21977:
                    getCurrentTrack(i).maxMasteringLuminance = (float) d;
                    return;
                case 21978:
                    getCurrentTrack(i).minMasteringLuminance = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            getCurrentTrack(i).projectionPoseYaw = (float) d;
                            return;
                        case 30324:
                            getCurrentTrack(i).projectionPosePitch = (float) d;
                            return;
                        case 30325:
                            getCurrentTrack(i).projectionPoseRoll = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.durationTimecode = (long) d;
        }
    }

    protected void stringElement(int i, String str) {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
        } else if (i != 17026) {
            if (i == 21358) {
                getCurrentTrack(i).name = str;
            } else if (i != 2274716) {
            } else {
                getCurrentTrack(i).language = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
        }
    }

    protected void binaryElement(int i, int i2, ExtractorInput extractorInput) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        Throwable th = null;
        int i7 = 0;
        int i8 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i2);
                return;
            } else if (i == 16877) {
                handleBlockAddIDExtraData(getCurrentTrack(i), extractorInput, i2);
                return;
            } else if (i == 16981) {
                assertInTrackEntry(i);
                byte[] bArr = new byte[i2];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i2);
                return;
            } else if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                extractorInput.readFully(bArr2, 0, i2);
                getCurrentTrack(i).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            } else if (i == 21419) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            } else if (i == 25506) {
                assertInTrackEntry(i);
                byte[] bArr3 = new byte[i2];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i2);
                return;
            } else if (i == 30322) {
                assertInTrackEntry(i);
                byte[] bArr4 = new byte[i2];
                this.currentTrack.projectionData = bArr4;
                extractorInput.readFully(bArr4, 0, i2);
                return;
            } else {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i, null);
            }
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = -9223372036854775807L;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i9 = (this.scratch.getData()[2] & 6) >> 1;
            if (i9 == 0) {
                this.blockSampleCount = 1;
                int[] ensureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = ensureArrayCapacity;
                ensureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                int i10 = 4;
                readScratch(extractorInput, 4);
                int i11 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i11;
                int[] ensureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i11);
                this.blockSampleSizes = ensureArrayCapacity2;
                if (i9 == 2) {
                    int i12 = this.blockTrackNumberLength;
                    int i13 = this.blockSampleCount;
                    Arrays.fill(ensureArrayCapacity2, 0, i13, ((i2 - i12) - 4) / i13);
                } else if (i9 != 1) {
                    if (i9 == 3) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.blockSampleCount - i8;
                            if (i14 < i16) {
                                this.blockSampleSizes[i14] = i7;
                                int i17 = i10 + 1;
                                readScratch(extractorInput, i17);
                                if (this.scratch.getData()[i10] == 0) {
                                    throw ParserException.createForMalformedContainer("No valid varint length mask found", th);
                                }
                                int i18 = i7;
                                while (true) {
                                    if (i18 >= 8) {
                                        j = 0;
                                        i10 = i17;
                                        break;
                                    }
                                    int i19 = i8 << (7 - i18);
                                    if ((this.scratch.getData()[i10] & i19) != 0) {
                                        int i20 = i17 + i18;
                                        readScratch(extractorInput, i20);
                                        j = (~i19) & this.scratch.getData()[i10] & 255;
                                        while (i17 < i20) {
                                            j = (j << 8) | (this.scratch.getData()[i17] & 255);
                                            i17++;
                                            i20 = i20;
                                        }
                                        int i21 = i20;
                                        if (i14 > 0) {
                                            j -= (1 << ((i18 * 7) + 6)) - 1;
                                        }
                                        i10 = i21;
                                    } else {
                                        i18++;
                                        i8 = 1;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i22 = (int) j;
                                int[] iArr = this.blockSampleSizes;
                                if (i14 != 0) {
                                    i22 += iArr[i14 - 1];
                                }
                                iArr[i14] = i22;
                                i15 += i22;
                                i14++;
                                th = null;
                                i7 = 0;
                                i8 = 1;
                            } else {
                                this.blockSampleSizes[i16] = ((i2 - this.blockTrackNumberLength) - i10) - i15;
                                break;
                            }
                        }
                        throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i9, null);
                } else {
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        i4 = this.blockSampleCount - 1;
                        if (i23 >= i4) {
                            break;
                        }
                        this.blockSampleSizes[i23] = 0;
                        while (true) {
                            i5 = i10 + 1;
                            readScratch(extractorInput, i5);
                            int i25 = this.scratch.getData()[i10] & 255;
                            int[] iArr2 = this.blockSampleSizes;
                            i6 = iArr2[i23] + i25;
                            iArr2[i23] = i6;
                            if (i25 != 255) {
                                break;
                            }
                            i10 = i5;
                        }
                        i24 += i6;
                        i23++;
                        i10 = i5;
                    }
                    this.blockSampleSizes[i4] = ((i2 - this.blockTrackNumberLength) - i10) - i24;
                }
            }
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
            this.blockFlags = (track.type == 2 || (i == 163 && (this.scratch.getData()[2] & 128) == 128)) ? 1 : 0;
            this.blockState = 2;
            this.blockSampleIndex = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i26 = this.blockSampleIndex;
                if (i26 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                commitSampleToOutput(track, ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i26], false), 0);
                this.blockSampleIndex++;
            }
        } else {
            while (true) {
                int i27 = this.blockSampleIndex;
                if (i27 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i27] = writeSampleData(extractorInput, track, iArr3[i27], true);
                this.blockSampleIndex++;
            }
        }
    }

    protected void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) {
        if (track.blockAddIdType == 1685485123 || track.blockAddIdType == 1685480259) {
            byte[] bArr = new byte[i];
            track.dolbyVisionConfigBytes = bArr;
            extractorInput.readFully(bArr, 0, i);
            return;
        }
        extractorInput.skipFully(i);
    }

    protected void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) {
        if (i == 4 && "V_VP9".equals(track.codecId)) {
            this.supplementalData.reset(i2);
            extractorInput.readFully(this.supplementalData.getData(), 0, i2);
            return;
        }
        extractorInput.skipFully(i2);
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i) {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    protected Track getCurrentTrack(int i) {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    @RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j, i, i2, i3, track.cryptoData);
        } else {
            if ("S_TEXT/UTF8".equals(track.codecId) || "S_TEXT/ASS".equals(track.codecId) || "S_TEXT/WEBVTT".equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.blockDurationUs;
                    if (j2 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j2, this.subtitleSample.getData());
                        int position = this.subtitleSample.getPosition();
                        while (true) {
                            if (position >= this.subtitleSample.limit()) {
                                break;
                            } else if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            } else {
                                position++;
                            }
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        i2 += this.subtitleSample.limit();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int limit = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, limit, 2);
                    i2 += limit;
                }
            }
            track.output.sampleMetadata(j, i, i2, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private void readScratch(ExtractorInput extractorInput, int i) {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i, boolean z) {
        int i2;
        if ("S_TEXT/UTF8".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        } else if ("S_TEXT/ASS".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        } else if ("S_TEXT/WEBVTT".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            return finishWriteSampleData();
        } else {
            TrackOutput trackOutput = track.output;
            if (!this.sampleEncodingHandled) {
                if (track.hasContentEncryption) {
                    this.blockFlags &= -1073741825;
                    if (!this.sampleSignalByteRead) {
                        extractorInput.readFully(this.scratch.getData(), 0, 1);
                        this.sampleBytesRead++;
                        if ((this.scratch.getData()[0] & 128) == 128) {
                            throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                        }
                        this.sampleSignalByte = this.scratch.getData()[0];
                        this.sampleSignalByteRead = true;
                    }
                    byte b = this.sampleSignalByte;
                    if ((b & 1) == 1) {
                        boolean z2 = (b & 2) == 2;
                        this.blockFlags |= 1073741824;
                        if (!this.sampleInitializationVectorRead) {
                            extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                            this.sampleBytesRead += 8;
                            this.sampleInitializationVectorRead = true;
                            this.scratch.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                            this.scratch.setPosition(0);
                            trackOutput.sampleData(this.scratch, 1, 1);
                            this.sampleBytesWritten++;
                            this.encryptionInitializationVector.setPosition(0);
                            trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                            this.sampleBytesWritten += 8;
                        }
                        if (z2) {
                            if (!this.samplePartitionCountRead) {
                                extractorInput.readFully(this.scratch.getData(), 0, 1);
                                this.sampleBytesRead++;
                                this.scratch.setPosition(0);
                                this.samplePartitionCount = this.scratch.readUnsignedByte();
                                this.samplePartitionCountRead = true;
                            }
                            int i3 = this.samplePartitionCount * 4;
                            this.scratch.reset(i3);
                            extractorInput.readFully(this.scratch.getData(), 0, i3);
                            this.sampleBytesRead += i3;
                            short s = (short) ((this.samplePartitionCount / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i4);
                            }
                            this.encryptionSubsampleDataBuffer.position(0);
                            this.encryptionSubsampleDataBuffer.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.samplePartitionCount;
                                if (i5 >= i2) {
                                    break;
                                }
                                int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                                if (i5 % 2 == 0) {
                                    this.encryptionSubsampleDataBuffer.putShort((short) (readUnsignedIntToInt - i6));
                                } else {
                                    this.encryptionSubsampleDataBuffer.putInt(readUnsignedIntToInt - i6);
                                }
                                i5++;
                                i6 = readUnsignedIntToInt;
                            }
                            int i7 = (i - this.sampleBytesRead) - i6;
                            if (i2 % 2 == 1) {
                                this.encryptionSubsampleDataBuffer.putInt(i7);
                            } else {
                                this.encryptionSubsampleDataBuffer.putShort((short) i7);
                                this.encryptionSubsampleDataBuffer.putInt(0);
                            }
                            this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                            trackOutput.sampleData(this.encryptionSubsampleData, i4, 1);
                            this.sampleBytesWritten += i4;
                        }
                    }
                } else {
                    byte[] bArr = track.sampleStrippedBytes;
                    if (bArr != null) {
                        this.sampleStrippedBytes.reset(bArr, bArr.length);
                    }
                }
                if (track.samplesHaveSupplementalData(z)) {
                    this.blockFlags |= 268435456;
                    this.supplementalData.reset(0);
                    int limit = (this.sampleStrippedBytes.limit() + i) - this.sampleBytesRead;
                    this.scratch.reset(4);
                    this.scratch.getData()[0] = (byte) ((limit >> 24) & PrivateKeyType.INVALID);
                    this.scratch.getData()[1] = (byte) ((limit >> 16) & PrivateKeyType.INVALID);
                    this.scratch.getData()[2] = (byte) ((limit >> 8) & PrivateKeyType.INVALID);
                    this.scratch.getData()[3] = (byte) (limit & PrivateKeyType.INVALID);
                    trackOutput.sampleData(this.scratch, 4, 2);
                    this.sampleBytesWritten += 4;
                }
                this.sampleEncodingHandled = true;
            }
            int limit2 = i + this.sampleStrippedBytes.limit();
            if ("V_MPEG4/ISO/AVC".equals(track.codecId) || "V_MPEGH/ISO/HEVC".equals(track.codecId)) {
                byte[] data = this.nalLength.getData();
                data[0] = 0;
                data[1] = 0;
                data[2] = 0;
                int i8 = track.nalUnitLengthFieldLength;
                while (this.sampleBytesRead < limit2) {
                    int i9 = this.sampleCurrentNalBytesRemaining;
                    if (i9 == 0) {
                        writeToTarget(extractorInput, data, 4 - i8, i8);
                        this.sampleBytesRead += i8;
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                    } else {
                        int writeToOutput = writeToOutput(extractorInput, trackOutput, i9);
                        this.sampleBytesRead += writeToOutput;
                        this.sampleBytesWritten += writeToOutput;
                        this.sampleCurrentNalBytesRemaining -= writeToOutput;
                    }
                }
            } else {
                if (track.trueHdSampleRechunker != null) {
                    Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                    track.trueHdSampleRechunker.startSample(extractorInput);
                }
                while (true) {
                    int i10 = this.sampleBytesRead;
                    if (i10 >= limit2) {
                        break;
                    }
                    int writeToOutput2 = writeToOutput(extractorInput, trackOutput, limit2 - i10);
                    this.sampleBytesRead += writeToOutput2;
                    this.sampleBytesWritten += writeToOutput2;
                }
            }
            if ("A_VORBIS".equals(track.codecId)) {
                this.vorbisNumPageSamples.setPosition(0);
                trackOutput.sampleData(this.vorbisNumPageSamples, 4);
                this.sampleBytesWritten += 4;
            }
            return finishWriteSampleData();
        }
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        char c;
        byte[] formatSubtitleTimecode;
        int i;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 738597099) {
            if (str.equals("S_TEXT/ASS")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1045209816) {
            if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("S_TEXT/WEBVTT")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            formatSubtitleTimecode = formatSubtitleTimecode(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        } else if (c == 1) {
            formatSubtitleTimecode = formatSubtitleTimecode(j, "%02d:%02d:%02d.%03d", 1000L);
            i = 25;
        } else if (c == 2) {
            formatSubtitleTimecode = formatSubtitleTimecode(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(formatSubtitleTimecode, 0, bArr, i, formatSubtitleTimecode.length);
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        Assertions.checkArgument(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, min);
        }
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) {
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft > 0) {
            int min = Math.min(i, bytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, min);
            return min;
        }
        return trackOutput.sampleData((DataReader) extractorInput, i, false);
    }

    private SeekMap buildSeekMap(LongArray longArray, LongArray longArray2) {
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == -9223372036854775807L || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArr = new int[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArr3[i3] = longArray.get(i3);
            jArr[i3] = this.segmentContentPosition + longArray2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArr[i]);
        long j = this.durationUs - jArr3[i];
        jArr2[i] = j;
        if (j <= 0) {
            Log.w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new ChunkIndex(iArr, jArr, jArr2, jArr3);
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private long scaleTimecodeToUs(long j) {
        long j2 = this.timecodeScale;
        if (j2 == -9223372036854775807L) {
            throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return Util.scaleLargeTimestamp(j, j2, 1000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean isCodecSupported(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    /* loaded from: classes2.dex */
    final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j, long j2) {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j) {
            MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i, String str) {
            MatroskaExtractor.this.stringElement(i, str);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static final class Track {
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        protected Track() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public void initializeOutput(ExtractorOutput extractorOutput, int i) {
            char c;
            List<byte[]> singletonList;
            int i2;
            String str;
            List<byte[]> list;
            int i3;
            String str2;
            String str3;
            List<byte[]> list2;
            String str4;
            String str5;
            String str6;
            int i4;
            String str7;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            DolbyVisionConfig parse;
            String str8 = this.codecId;
            str8.hashCode();
            switch (str8.hashCode()) {
                case -2095576542:
                    if (str8.equals("V_MPEG4/ISO/AP")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str8.equals("V_MPEG4/ISO/SP")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str8.equals("A_MS/ACM")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str8.equals("A_TRUEHD")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str8.equals("A_VORBIS")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str8.equals("A_MPEG/L2")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str8.equals("A_MPEG/L3")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str8.equals("V_MS/VFW/FOURCC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str8.equals("S_DVBSUB")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str8.equals("V_MPEG4/ISO/ASP")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str8.equals("V_MPEG4/ISO/AVC")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str8.equals("S_VOBSUB")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str8.equals("A_DTS/LOSSLESS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str8.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str8.equals("A_AC3")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str8.equals("A_DTS")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str8.equals("V_AV1")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str8.equals("V_VP8")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str8.equals("V_VP9")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str8.equals("S_HDMV/PGS")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str8.equals("V_THEORA")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str8.equals("A_DTS/EXPRESS")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str8.equals("A_PCM/FLOAT/IEEE")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str8.equals("A_PCM/INT/BIG")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str8.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str8.equals("S_TEXT/ASS")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    if (str8.equals("V_MPEGH/ISO/HEVC")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 1045209816:
                    if (str8.equals("S_TEXT/WEBVTT")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str8.equals("S_TEXT/UTF8")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str8.equals("V_MPEG2")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str8.equals("A_EAC3")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str8.equals("A_FLAC")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str8.equals("A_OPUS")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str9 = "audio/x-unknown";
            String str10 = "audio/raw";
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.codecPrivate;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str9 = "video/mp4v-es";
                    str2 = null;
                    str10 = str9;
                    i3 = -1;
                    i2 = -1;
                    String str11 = str2;
                    list = singletonList;
                    str = str11;
                    break;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding != 0) {
                            i2 = pcmEncoding;
                            str = null;
                            list = null;
                            i3 = -1;
                            break;
                        } else {
                            Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        }
                    } else {
                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str2 = null;
                    str10 = str9;
                    i3 = -1;
                    i2 = -1;
                    String str112 = str2;
                    list = singletonList;
                    str = str112;
                    break;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str9 = "audio/true-hd";
                    singletonList = null;
                    str2 = null;
                    str10 = str9;
                    i3 = -1;
                    i2 = -1;
                    String str1122 = str2;
                    list = singletonList;
                    str = str1122;
                    break;
                case 4:
                    singletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str10 = "audio/vorbis";
                    i3 = 8192;
                    str2 = null;
                    i2 = -1;
                    String str11222 = str2;
                    list = singletonList;
                    str = str11222;
                    break;
                case 5:
                    str3 = "audio/mpeg-L2";
                    i3 = 4096;
                    str10 = str3;
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    String str112222 = str2;
                    list = singletonList;
                    str = str112222;
                    break;
                case 6:
                    str3 = "audio/mpeg";
                    i3 = 4096;
                    str10 = str3;
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    String str1122222 = str2;
                    list = singletonList;
                    str = str1122222;
                    break;
                case 7:
                    Pair<String, List<byte[]>> parseFourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str9 = (String) parseFourCcPrivate.first;
                    singletonList = (List) parseFourCcPrivate.second;
                    str2 = null;
                    str10 = str9;
                    i3 = -1;
                    i2 = -1;
                    String str11222222 = str2;
                    list = singletonList;
                    str = str11222222;
                    break;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    singletonList = ImmutableList.of(bArr2);
                    str9 = "application/dvbsubs";
                    str2 = null;
                    str10 = str9;
                    i3 = -1;
                    i2 = -1;
                    String str112222222 = str2;
                    list = singletonList;
                    str = str112222222;
                    break;
                case '\n':
                    AvcConfig parse2 = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list2 = parse2.initializationData;
                    this.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    str = parse2.codecs;
                    str4 = "video/avc";
                    str10 = str4;
                    list = list2;
                    i3 = -1;
                    i2 = -1;
                    break;
                case 11:
                    singletonList = ImmutableList.of(getCodecPrivate(this.codecId));
                    str9 = "application/vobsub";
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str1122222222 = str2;
                    list = singletonList;
                    str = str1122222222;
                    break;
                case '\f':
                    str5 = "audio/vnd.dts.hd";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str11222222222 = str2;
                    list = singletonList;
                    str = str11222222222;
                    break;
                case '\r':
                    singletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = parseAudioSpecificConfig.sampleRateHz;
                    this.channelCount = parseAudioSpecificConfig.channelCount;
                    str6 = parseAudioSpecificConfig.codecs;
                    str9 = "audio/mp4a-latm";
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str112222222222 = str2;
                    list = singletonList;
                    str = str112222222222;
                    break;
                case 14:
                    str5 = "audio/ac3";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str1122222222222 = str2;
                    list = singletonList;
                    str = str1122222222222;
                    break;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str11222222222222 = str2;
                    list = singletonList;
                    str = str11222222222222;
                    break;
                case 16:
                    str5 = "video/av01";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str112222222222222 = str2;
                    list = singletonList;
                    str = str112222222222222;
                    break;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str1122222222222222 = str2;
                    list = singletonList;
                    str = str1122222222222222;
                    break;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str11222222222222222 = str2;
                    list = singletonList;
                    str = str11222222222222222;
                    break;
                case 19:
                    singletonList = null;
                    str6 = null;
                    str9 = "application/pgs";
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str112222222222222222 = str2;
                    list = singletonList;
                    str = str112222222222222222;
                    break;
                case 20:
                    str5 = "video/x-unknown";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str1122222222222222222 = str2;
                    list = singletonList;
                    str = str1122222222222222222;
                    break;
                case 22:
                    if (this.audioBitDepth != 32) {
                        Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        singletonList = null;
                        str6 = null;
                        str2 = str6;
                        str7 = str9;
                        i5 = -1;
                        str10 = str7;
                        i3 = i5;
                        i2 = -1;
                        String str11222222222222222222 = str2;
                        list = singletonList;
                        str = str11222222222222222222;
                        break;
                    } else {
                        str = null;
                        list = null;
                        i3 = -1;
                        i2 = 4;
                        break;
                    }
                case 23:
                    int i10 = this.audioBitDepth;
                    if (i10 == 8) {
                        i2 = 3;
                        str = null;
                        list = null;
                        i3 = -1;
                        break;
                    } else {
                        if (i10 != 16) {
                            if (i10 != 24) {
                                if (i10 != 32) {
                                    Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                                    singletonList = null;
                                    str6 = null;
                                    str2 = str6;
                                    str7 = str9;
                                    i5 = -1;
                                    str10 = str7;
                                    i3 = i5;
                                    i2 = -1;
                                    String str112222222222222222222 = str2;
                                    list = singletonList;
                                    str = str112222222222222222222;
                                    break;
                                } else {
                                    i4 = 1610612736;
                                }
                            } else {
                                i4 = 1342177280;
                            }
                        } else {
                            i4 = 268435456;
                        }
                        i2 = i4;
                        str = null;
                        list = null;
                        i3 = -1;
                    }
                case 24:
                    i4 = Util.getPcmEncoding(this.audioBitDepth);
                    if (i4 == 0) {
                        Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        singletonList = null;
                        str6 = null;
                        str2 = str6;
                        str7 = str9;
                        i5 = -1;
                        str10 = str7;
                        i3 = i5;
                        i2 = -1;
                        String str1122222222222222222222 = str2;
                        list = singletonList;
                        str = str1122222222222222222222;
                        break;
                    }
                    i2 = i4;
                    str = null;
                    list = null;
                    i3 = -1;
                    break;
                case 25:
                    singletonList = ImmutableList.of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str6 = null;
                    str9 = "text/x-ssa";
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str11222222222222222222222 = str2;
                    list = singletonList;
                    str = str11222222222222222222222;
                    break;
                case 26:
                    HevcConfig parse3 = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list2 = parse3.initializationData;
                    this.nalUnitLengthFieldLength = parse3.nalUnitLengthFieldLength;
                    str = parse3.codecs;
                    str4 = "video/hevc";
                    str10 = str4;
                    list = list2;
                    i3 = -1;
                    i2 = -1;
                    break;
                case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                    str9 = "text/vtt";
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str112222222222222222222222 = str2;
                    list = singletonList;
                    str = str112222222222222222222222;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                    str9 = "application/x-subrip";
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str1122222222222222222222222 = str2;
                    list = singletonList;
                    str = str1122222222222222222222222;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                    str5 = "video/mpeg2";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str11222222222222222222222222 = str2;
                    list = singletonList;
                    str = str11222222222222222222222222;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                    str5 = "audio/eac3";
                    str9 = str5;
                    singletonList = null;
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str112222222222222222222222222 = str2;
                    list = singletonList;
                    str = str112222222222222222222222222;
                    break;
                case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                    singletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str9 = "audio/flac";
                    str6 = null;
                    str2 = str6;
                    str7 = str9;
                    i5 = -1;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str1122222222222222222222222222 = str2;
                    list = singletonList;
                    str = str1122222222222222222222222222;
                    break;
                case ' ':
                    singletonList = new ArrayList<>(3);
                    singletonList.add(getCodecPrivate(this.codecId));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    singletonList.add(allocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str7 = "audio/opus";
                    i5 = 5760;
                    str2 = null;
                    str10 = str7;
                    i3 = i5;
                    i2 = -1;
                    String str11222222222222222222222222222 = str2;
                    list = singletonList;
                    str = str11222222222222222222222222222;
                    break;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
            if (this.dolbyVisionConfigBytes != null && (parse = DolbyVisionConfig.parse(new ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                str = parse.codecs;
                str10 = "video/dolby-vision";
            }
            String str12 = str10;
            boolean z = this.flagDefault;
            int i11 = this.flagForced ? 2 : 0;
            Format.Builder builder = new Format.Builder();
            if (MimeTypes.isAudio(str12)) {
                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                i6 = 1;
            } else if (MimeTypes.isVideo(str12)) {
                if (this.displayUnit == 0) {
                    int i12 = this.displayWidth;
                    i7 = -1;
                    if (i12 == -1) {
                        i12 = this.width;
                    }
                    this.displayWidth = i12;
                    int i13 = this.displayHeight;
                    if (i13 == -1) {
                        i13 = this.height;
                    }
                    this.displayHeight = i13;
                } else {
                    i7 = -1;
                }
                float f = (this.displayWidth == i7 || (i9 = this.displayHeight) == i7) ? -1.0f : (this.height * i8) / (this.width * i9);
                ColorInfo build = this.hasColorInfo ? new ColorInfo.Builder().setColorSpace(this.colorSpace).setColorRange(this.colorRange).setColorTransfer(this.colorTransfer).setHdrStaticInfo(getHdrStaticInfo()).setLumaBitdepth(this.bitsPerChannel).setChromaBitdepth(this.bitsPerChannel).build() : null;
                if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                    i7 = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                }
                if (this.projectionType == 0 && Float.compare(this.projectionPoseYaw, 0.0f) == 0 && Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                    if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                        i7 = 0;
                    } else if (Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                        i7 = 90;
                    } else if (Float.compare(this.projectionPoseRoll, -180.0f) == 0 || Float.compare(this.projectionPoseRoll, 180.0f) == 0) {
                        i7 = 180;
                    } else if (Float.compare(this.projectionPoseRoll, -90.0f) == 0) {
                        i7 = 270;
                    }
                }
                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i7).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(build);
                i6 = 2;
            } else if (!"application/x-subrip".equals(str12) && !"text/x-ssa".equals(str12) && !"text/vtt".equals(str12) && !"application/vobsub".equals(str12) && !"application/pgs".equals(str12) && !"application/dvbsubs".equals(str12)) {
                throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
            } else {
                i6 = 3;
            }
            if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                builder.setLabel(this.name);
            }
            Format build2 = builder.setId(i).setSampleMimeType(str12).setMaxInputSize(i3).setLanguage(this.language).setSelectionFlags(i11 | (z ? 1 : 0)).setInitializationData(list).setCodecs(str).setDrmInitData(this.drmInitData).build();
            TrackOutput track = extractorOutput.track(this.number, i6);
            this.output = track;
            track.format(build2);
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            return "A_OPUS".equals(this.codecId) ? z : this.maxBlockAdditionId > 0;
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) (this.maxMasteringLuminance + 0.5f));
            order.putShort((short) (this.minMasteringLuminance + 0.5f));
            order.putShort((short) this.maxContentLuminance);
            order.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (readLittleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (readLittleEndianUnsignedInt == 826496599) {
                    byte[] data = parsableByteArray.getData();
                    for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                }
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4] & PrivateKeyType.INVALID;
                    if (i != 255) {
                        break;
                    }
                    i3 += PrivateKeyType.INVALID;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5] & PrivateKeyType.INVALID;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += PrivateKeyType.INVALID;
                    i5++;
                }
                int i8 = i5 + 1;
                if (bArr[i8] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i9 = i8 + i6;
                if (bArr[i9] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i10 = i9 + i7 + i2;
                if (bArr[i10] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i10];
                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }
    }
}
