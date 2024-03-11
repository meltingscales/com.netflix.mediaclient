package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Fmp4TimestampAdjuster;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.mp4.Atom;
import com.google.common.base.Function;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
public class FragmentedMp4Extractor implements Extractor {
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;
    private final Track sideloadedTrack;
    private long sidxOffset;
    private long sidxSize;
    private final Fmp4TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = FragmentedMp4Extractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType("application/x-emsg").build();

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    public long getSidxOffset() {
        return this.sidxOffset;
    }

    public long getSidxSize() {
        return this.sidxSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Track modifyTrack(Track track) {
        return track;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FragmentedMp4Extractor()};
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster) {
        this(i, timestampAdjuster, null, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster, Track track, List<Format> list) {
        this(i, timestampAdjuster, track, list, null);
    }

    public FragmentedMp4Extractor(int i, Fmp4TimestampAdjuster fmp4TimestampAdjuster, Track track, List<Format> list, TrackOutput trackOutput) {
        this.sidxOffset = -1L;
        this.sidxSize = -1L;
        this.flags = i;
        this.timestampAdjuster = fmp4TimestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return Sniffer.sniffFragmented(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            this.trackBundles.put(0, new TrackBundle(extractorOutput.track(0, track.type), new TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new DefaultSampleValues(0, 0, 0, 0)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        int size = this.trackBundles.size();
        for (int i = 0; i < size; i++) {
            this.trackBundles.valueAt(i).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(extractorInput);
                } else if (i == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j = this.atomSize;
        if (j == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        int i = this.atomType;
        if ((i == 1836019558 || i == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i2 = 0; i2 < size; i2++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i2).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i3 = this.atomType;
        if (i3 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i3)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else if (this.atomSize > 2147483647L) {
            throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
        } else {
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) {
        int i = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            if (this.atomType == 1936286840) {
                this.sidxOffset = extractorInput.getPosition() - this.atomHeaderBytesRead;
                this.sidxSize = this.atomSize;
            }
            extractorInput.readFully(parsableByteArray.getData(), 8, i);
            onLeafAtomRead(new Atom.LeafAtom(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void processAtomEnded(long j) {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private void onLeafAtomRead(Atom.LeafAtom leafAtom, long j) {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafAtom);
            return;
        }
        int i = leafAtom.type;
        if (i != 1936286840) {
            if (i == 1701671783) {
                onEmsgLeafAtomRead(leafAtom.data);
                return;
            }
            return;
        }
        TrackBundle valueAt = this.trackBundles.valueAt(0);
        Track track = valueAt != null ? valueAt.moovSampleTable.track : null;
        Assertions.checkNotNull(track);
        Pair<Long, ChunkIndex> parseSidx = parseSidx(leafAtom.data, j, track.getMediaTimeOffset() == -1 ? this.timestampAdjuster : null);
        this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
        this.extractorOutput.seekMap((SeekMap) parseSidx.second);
        this.haveOutputSeekMap = true;
    }

    private void onContainerAtomRead(Atom.ContainerAtom containerAtom) {
        int i = containerAtom.type;
        if (i == 1836019574) {
            onMoovContainerAtomRead(containerAtom);
        } else if (i == 1836019558) {
            onMoofContainerAtomRead(containerAtom);
        } else if (this.containerAtoms.isEmpty()) {
        } else {
            this.containerAtoms.peek().add(containerAtom);
        }
    }

    private void onMoovContainerAtomRead(Atom.ContainerAtom containerAtom) {
        int i = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1836475768));
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerAtom2.leafChildren.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            Atom.LeafAtom leafAtom = containerAtom2.leafChildren.get(i2);
            int i3 = leafAtom.type;
            if (i3 == 1953654136) {
                Pair<Integer, DefaultSampleValues> parseTrex = parseTrex(leafAtom.data);
                sparseArray.put(((Integer) parseTrex.first).intValue(), (DefaultSampleValues) parseTrex.second);
            } else if (i3 == 1835362404) {
                j = parseMehd(leafAtom.data);
            }
        }
        List<TrackSampleTable> parseTraks = AtomParsers.parseTraks(containerAtom, new GaplessInfoHolder(), j, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new Function() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FragmentedMp4Extractor.this.modifyTrack((Track) obj);
            }
        });
        int size2 = parseTraks.size();
        if (this.trackBundles.size() == 0) {
            while (i < size2) {
                TrackSampleTable trackSampleTable = parseTraks.get(i);
                Track track = trackSampleTable.track;
                this.trackBundles.put(track.id, new TrackBundle(this.extractorOutput.track(i, track.type), trackSampleTable, getDefaultSampleValues(sparseArray, track.id)));
                this.durationUs = Math.max(this.durationUs, track.durationUs);
                i++;
            }
            this.extractorOutput.endTracks();
            return;
        }
        Assertions.checkState(this.trackBundles.size() == size2);
        while (i < size2) {
            TrackSampleTable trackSampleTable2 = parseTraks.get(i);
            Track track2 = trackSampleTable2.track;
            this.trackBundles.get(track2.id).reset(trackSampleTable2, getDefaultSampleValues(sparseArray, track2.id));
            i++;
        }
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i));
    }

    private void onMoofContainerAtomRead(Atom.ContainerAtom containerAtom) {
        parseMoof(containerAtom, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                this.trackBundles.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != -9223372036854775807L) {
            int size2 = this.trackBundles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.trackBundles.valueAt(i2).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = -9223372036854775807L;
        }
    }

    private void initExtraTracks() {
        int i;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i2 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i] = this.extractorOutput.track(100, 5);
            i++;
            i3 = 101;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i2 < this.ceaTrackOutputs.length) {
            TrackOutput track = this.extractorOutput.track(i3, 3);
            track.format(this.closedCaptionFormats.get(i2));
            this.ceaTrackOutputs[i2] = track;
            i2++;
            i3++;
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        long scaleLargeTimestamp;
        String str;
        long scaleLargeTimestamp2;
        String str2;
        long readUnsignedInt;
        long j;
        TrackOutput[] trackOutputArr;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion == 0) {
            String str3 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            String str4 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            scaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, readUnsignedInt2);
            long j2 = this.segmentIndexEarliestPresentationTimeUs;
            long j3 = j2 != -9223372036854775807L ? j2 + scaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt2);
            str2 = str4;
            readUnsignedInt = parsableByteArray.readUnsignedInt();
            j = j3;
        } else if (parseFullAtomVersion != 1) {
            Log.w("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + parseFullAtomVersion);
            return;
        } else {
            long readUnsignedInt3 = parsableByteArray.readUnsignedInt();
            j = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, readUnsignedInt3);
            long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt3);
            long readUnsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            scaleLargeTimestamp2 = scaleLargeTimestamp3;
            readUnsignedInt = readUnsignedInt4;
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            scaleLargeTimestamp = -9223372036854775807L;
        }
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str, str2, scaleLargeTimestamp2, readUnsignedInt, bArr)));
        int bytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, bytesLeft);
        }
        if (j == -9223372036854775807L) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(scaleLargeTimestamp, true, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
        } else if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(j, false, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
        } else {
            Fmp4TimestampAdjuster fmp4TimestampAdjuster = this.timestampAdjuster;
            if (fmp4TimestampAdjuster != null && !fmp4TimestampAdjuster.isInitialized()) {
                this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(j, false, bytesLeft));
                this.pendingMetadataSampleBytes += bytesLeft;
                return;
            }
            Fmp4TimestampAdjuster fmp4TimestampAdjuster2 = this.timestampAdjuster;
            if (fmp4TimestampAdjuster2 != null) {
                j = fmp4TimestampAdjuster2.adjustSampleTimestamp(j);
            }
            for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
                trackOutput2.sampleMetadata(j, 1, bytesLeft, 0, null);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        return Pair.create(Integer.valueOf(readInt), new DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, boolean z, int i, byte[] bArr) {
        int size = containerAtom.containerChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i2);
            if (containerAtom2.type == 1953653094) {
                parseTraf(containerAtom2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void parseTraf(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, boolean z, int i, byte[] bArr) {
        TrackBundle parseTfhd = parseTfhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1952868452))).data, sparseArray, z);
        if (parseTfhd == null) {
            return;
        }
        TrackFragment trackFragment = parseTfhd.fragment;
        long j = trackFragment.nextFragmentDecodeTime;
        boolean z2 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
        parseTfhd.resetFragmentInfo();
        parseTfhd.currentlyInFragment = true;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1952867444);
        if (leafAtomOfType != null && (i & 2) == 0) {
            trackFragment.nextFragmentDecodeTime = parseTfdt(leafAtomOfType.data);
            trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
        } else {
            trackFragment.nextFragmentDecodeTime = j;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = z2;
        }
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_sdtp);
        if (leafAtomOfType2 != null) {
            parseSdtp(leafAtomOfType2.data, trackFragment);
        }
        parseTruns(containerAtom, parseTfhd, i);
        TrackEncryptionBox sampleDescriptionEncryptionBox = parseTfhd.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Assertions.checkNotNull(trackFragment.header)).sampleDescriptionIndex);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1935763834);
        if (leafAtomOfType3 != null) {
            parseSaiz((TrackEncryptionBox) Assertions.checkNotNull(sampleDescriptionEncryptionBox), leafAtomOfType3.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1935763823);
        if (leafAtomOfType4 != null) {
            parseSaio(leafAtomOfType4.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(1936027235);
        if (leafAtomOfType5 != null) {
            parseSenc(leafAtomOfType5.data, trackFragment);
        }
        parseSampleGroups(containerAtom, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        int size = containerAtom.leafChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i2);
            if (leafAtom.type == 1970628964) {
                parseUuid(leafAtom.data, trackFragment, bArr);
            }
        }
    }

    private static void parseTruns(Atom.ContainerAtom containerAtom, TrackBundle trackBundle, int i) {
        List<Atom.LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Atom.LeafAtom leafAtom = list.get(i4);
            if (leafAtom.type == 1953658222) {
                ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i3 += readUnsignedIntToInt;
                    i2++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Atom.LeafAtom leafAtom2 = list.get(i7);
            if (leafAtom2.type == 1953658222) {
                i6 = parseTrun(trackBundle, i5, i, leafAtom2.data, i6);
                i5++;
            }
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        int i;
        int i2 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt > trackFragment.sampleCount) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + readUnsignedIntToInt + " is greater than fragment sample count" + trackFragment.sampleCount, null);
        }
        if (readUnsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i = 0;
            for (int i3 = 0; i3 < readUnsignedIntToInt; i3++) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i += readUnsignedByte2;
                zArr[i3] = readUnsignedByte2 > i2;
            }
        } else {
            i = readUnsignedByte * readUnsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, readUnsignedByte > i2);
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, readUnsignedIntToInt, trackFragment.sampleCount, false);
        if (i > 0) {
            trackFragment.initEncryptionData(i);
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((Atom.parseFullAtomFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != 1) {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + readUnsignedIntToInt, null);
        }
        trackFragment.auxiliaryDataPosition += Atom.parseFullAtomVersion(readInt) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        TrackBundle valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (valueAt == null) {
            return null;
        }
        if ((parseFullAtomFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = valueAt.fragment;
            trackFragment.dataPosition = readUnsignedLongToLong;
            trackFragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = valueAt.defaultSampleValues;
        if ((parseFullAtomFlags & 2) != 0) {
            i = parsableByteArray.readInt() - 1;
        } else {
            i = defaultSampleValues.sampleDescriptionIndex;
        }
        if ((parseFullAtomFlags & 8) != 0) {
            i2 = parsableByteArray.readInt();
        } else {
            i2 = defaultSampleValues.duration;
        }
        if ((parseFullAtomFlags & 16) != 0) {
            i3 = parsableByteArray.readInt();
        } else {
            i3 = defaultSampleValues.size;
        }
        if ((parseFullAtomFlags & 32) != 0) {
            i4 = parsableByteArray.readInt();
        } else {
            i4 = defaultSampleValues.flags;
        }
        valueAt.fragment.header = new DefaultSampleValues(i, i2, i3, i4);
        return valueAt;
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(Track track) {
        long[] jArr;
        long[] jArr2 = track.editListDurations;
        if (jArr2 == null || jArr2.length != 1 || (jArr = track.editListMediaTimes) == null) {
            return false;
        }
        long j = jArr2[0];
        if (j == 0) {
            return true;
        }
        return Util.scaleLargeTimestamp(j + jArr[0], 1000000L, track.movieTimescale) >= track.durationUs;
    }

    private static int parseTrun(TrackBundle trackBundle, int i, int i2, ParsableByteArray parsableByteArray, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        long j;
        boolean z6;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        Track track = trackBundle.moovSampleTable.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = (DefaultSampleValues) Util.castNonNull(trackFragment.header);
        trackFragment.trunLength[i] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j2 = trackFragment.dataPosition;
        jArr[i] = j2;
        if ((parseFullAtomFlags & 1) != 0) {
            jArr[i] = j2 + parsableByteArray.readInt();
        }
        boolean z7 = (parseFullAtomFlags & 4) != 0;
        int i9 = defaultSampleValues.flags;
        if (z7) {
            i9 = parsableByteArray.readInt();
        }
        boolean z8 = (parseFullAtomFlags & JSONzip.end) != 0;
        boolean z9 = (parseFullAtomFlags & 512) != 0;
        boolean z10 = (parseFullAtomFlags & 1024) != 0;
        boolean z11 = (parseFullAtomFlags & 2048) != 0;
        long j3 = isEdtsListDurationForEntireMediaTimeline(track) ? ((long[]) Util.castNonNull(track.editListMediaTimes))[0] : 0L;
        int[] iArr = trackFragment.sampleSizeTable;
        long[] jArr2 = trackFragment.samplePresentationTimesUs;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        boolean[] zArr2 = trackFragment.sampleIsDisposable;
        int i10 = i9;
        boolean z12 = track.type == 2 && (i2 & 1) != 0;
        int i11 = i3 + trackFragment.trunLength[i];
        long j4 = track.timescale;
        TrackFragment trackFragment2 = trackFragment;
        long j5 = trackFragment.nextFragmentDecodeTime;
        int i12 = i3;
        while (i12 < i11) {
            if (z8) {
                i4 = parsableByteArray.readInt();
                z = z8;
            } else {
                z = z8;
                i4 = defaultSampleValues.duration;
            }
            int checkNonNegative = checkNonNegative(i4);
            if (z9) {
                i5 = parsableByteArray.readInt();
                z2 = z9;
            } else {
                z2 = z9;
                i5 = defaultSampleValues.size;
            }
            int checkNonNegative2 = checkNonNegative(i5);
            if (z10) {
                z3 = z7;
                i6 = parsableByteArray.readInt();
            } else if (i12 == 0 && z7) {
                z3 = z7;
                i6 = i10;
            } else {
                z3 = z7;
                i6 = defaultSampleValues.flags;
            }
            if (z11) {
                z4 = z11;
                i7 = i11;
                z5 = z12;
                i8 = parsableByteArray.readInt();
            } else {
                z4 = z11;
                i7 = i11;
                z5 = z12;
                i8 = 0;
            }
            long scaleLargeTimestamp = Util.scaleLargeTimestamp((i8 + j5) - j3, 1000000L, j4);
            jArr2[i12] = scaleLargeTimestamp;
            DefaultSampleValues defaultSampleValues2 = defaultSampleValues;
            TrackFragment trackFragment3 = trackFragment2;
            if (trackFragment3.nextFragmentDecodeTimeIncludesMoov) {
                j = j3;
            } else {
                j = j3;
                jArr2[i12] = scaleLargeTimestamp + trackBundle.moovSampleTable.durationUs;
            }
            iArr[i12] = checkNonNegative2;
            if (z10 && ((i6 >> 22) & 3) == 2) {
                z6 = true;
                zArr2[i12] = z6;
                zArr[i12] = ((i6 >> 16) & 1) != 0 && (!z5 || i12 == 0);
                j5 += checkNonNegative;
                i12++;
                trackFragment2 = trackFragment3;
                defaultSampleValues = defaultSampleValues2;
                j3 = j;
                z8 = z;
                z9 = z2;
                z7 = z3;
                z11 = z4;
                z12 = z5;
                i11 = i7;
            }
            z6 = false;
            zArr2[i12] = z6;
            zArr[i12] = ((i6 >> 16) & 1) != 0 && (!z5 || i12 == 0);
            j5 += checkNonNegative;
            i12++;
            trackFragment2 = trackFragment3;
            defaultSampleValues = defaultSampleValues2;
            j3 = j;
            z8 = z;
            z9 = z2;
            z7 = z3;
            z11 = z4;
            z12 = z5;
            i11 = i7;
        }
        int i13 = i11;
        trackFragment2.nextFragmentDecodeTime = j5;
        return i13;
    }

    private static int checkNonNegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) {
        parsableByteArray.setPosition(i + 8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((parseFullAtomFlags & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (parseFullAtomFlags & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 0) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
        } else if (readUnsignedIntToInt != trackFragment.sampleCount) {
            throw ParserException.createForMalformedContainer("Senc sample count " + readUnsignedIntToInt + " is different from fragment sample count" + trackFragment.sampleCount, null);
        } else {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
            trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
            trackFragment.fillEncryptionData(parsableByteArray);
        }
    }

    private static void parseSampleGroups(Atom.ContainerAtom containerAtom, String str, TrackFragment trackFragment) {
        byte[] bArr;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i = 0; i < containerAtom.leafChildren.size(); i++) {
            Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i);
            ParsableByteArray parsableByteArray3 = leafAtom.data;
            int i2 = leafAtom.type;
            if (i2 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == 1936025959) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i2 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == 1936025959) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (parseFullAtomVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int parseFullAtomVersion2 = Atom.parseFullAtomVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (parseFullAtomVersion2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (parseFullAtomVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        boolean z = parsableByteArray2.readUnsignedByte() == 1;
        if (z) {
            int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (readUnsignedByte2 == 0) {
                int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                byte[] bArr3 = new byte[readUnsignedByte3];
                parsableByteArray2.readBytes(bArr3, 0, readUnsignedByte3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, (readUnsignedByte & 240) >> 4, readUnsignedByte & 15, bArr);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j, Fmp4TimestampAdjuster fmp4TimestampAdjuster) {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        int[] iArr;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j2 = readUnsignedLongToLong;
        long j3 = readUnsignedLongToLong2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, readUnsignedInt);
        if (fmp4TimestampAdjuster != null) {
            scaleLargeTimestamp = fmp4TimestampAdjuster.adjustSampleTimestamp(scaleLargeTimestamp);
        }
        long j4 = scaleLargeTimestamp;
        parsableByteArray.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr2 = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j5 = j4;
        long j6 = j + j3;
        long j7 = j2;
        int i = 0;
        while (i < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((readInt & Integer.MIN_VALUE) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr2[i] = readInt & Integer.MAX_VALUE;
            jArr[i] = j6;
            jArr3[i] = j5;
            long j8 = j7 + readUnsignedInt2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            long j9 = j4;
            long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(j8, 1000000L, readUnsignedInt);
            jArr5[i] = scaleLargeTimestamp2 - jArr4[i];
            parsableByteArray.skipBytes(4);
            j6 += iArr[i];
            i++;
            iArr2 = iArr2;
            jArr = jArr;
            jArr2 = jArr5;
            readUnsignedShort = readUnsignedShort;
            j7 = j8;
            j5 = scaleLargeTimestamp2;
            jArr3 = jArr4;
            j4 = j9;
        }
        return Pair.create(Long.valueOf(j4), new ChunkIndex(iArr2, jArr, jArr2, jArr3));
    }

    private void readEncryptionData(ExtractorInput extractorInput) {
        int size = this.trackBundles.size();
        long j = Long.MAX_VALUE;
        TrackBundle trackBundle = null;
        for (int i = 0; i < size; i++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j2 = trackFragment.auxiliaryDataPosition;
                if (j2 < j) {
                    trackBundle = this.trackBundles.valueAt(i);
                    j = j2;
                }
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundle.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean readSample(ExtractorInput extractorInput) {
        int sampleData;
        TrackBundle trackBundle = this.currentTrackBundle;
        Throwable th = null;
        if (trackBundle == null) {
            trackBundle = getNextTrackBundle(this.trackBundles);
            if (trackBundle == null) {
                int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int currentSampleOffset = (int) (trackBundle.getCurrentSampleOffset() - extractorInput.getPosition());
            if (currentSampleOffset < 0) {
                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            extractorInput.skipFully(currentSampleOffset);
            this.currentTrackBundle = trackBundle;
        }
        int i = 4;
        int i2 = 1;
        if (this.parserState == 3) {
            int currentSampleSize = trackBundle.getCurrentSampleSize();
            this.sampleSize = currentSampleSize;
            if (trackBundle.currentSampleIndex < trackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(currentSampleSize);
                trackBundle.skipSampleEncryptionData();
                if (!trackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (trackBundle.moovSampleTable.track.sampleTransformation == 1) {
                this.sampleSize = currentSampleSize - 8;
                extractorInput.skipFully(8);
            }
            if ("audio/ac4".equals(trackBundle.moovSampleTable.track.format.sampleMimeType)) {
                this.sampleBytesWritten = trackBundle.outputSampleEncryptionData(this.sampleSize, 7);
                Ac4Util.getAc4SampleHeader(this.sampleSize, this.scratch);
                trackBundle.output.sampleData(this.scratch, 7);
                this.sampleBytesWritten += 7;
            } else {
                this.sampleBytesWritten = trackBundle.outputSampleEncryptionData(this.sampleSize, 0);
            }
            this.sampleSize += this.sampleBytesWritten;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        Track track = trackBundle.moovSampleTable.track;
        TrackOutput trackOutput = trackBundle.output;
        long currentSamplePresentationTimeUs = trackBundle.getCurrentSamplePresentationTimeUs();
        if (this.timestampAdjuster != null && track.getMediaTimeOffset() == -1) {
            currentSamplePresentationTimeUs = this.timestampAdjuster.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        long j = currentSamplePresentationTimeUs;
        if (track.nalUnitLengthFieldLength == 0) {
            while (true) {
                int i3 = this.sampleBytesWritten;
                int i4 = this.sampleSize;
                if (i3 >= i4) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData((DataReader) extractorInput, i4 - i3, false);
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i5 = track.nalUnitLengthFieldLength;
            int i6 = 4 - i5;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i7 = this.sampleCurrentNalBytesRemaining;
                if (i7 == 0) {
                    extractorInput.readFully(data, i6, i5 + 1);
                    this.nalPrefix.setPosition(0);
                    int readInt = this.nalPrefix.readInt();
                    if (readInt < i2) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.sampleCurrentNalBytesRemaining = readInt - 1;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, i);
                    trackOutput.sampleData(this.nalPrefix, i2);
                    this.processSeiNalUnitPayload = (this.ceaTrackOutputs.length <= 0 || !NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, data[i])) ? 0 : i2;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i6;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i7);
                        extractorInput.readFully(this.nalBuffer.getData(), 0, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        sampleData = this.sampleCurrentNalBytesRemaining;
                        int unescapeStream = NalUnitUtil.unescapeStream(this.nalBuffer.getData(), this.nalBuffer.limit());
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(unescapeStream);
                        CeaUtil.consume(j, this.nalBuffer, this.ceaTrackOutputs);
                    } else {
                        sampleData = trackOutput.sampleData((DataReader) extractorInput, i7, false);
                    }
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int currentSampleFlags = trackBundle.getCurrentSampleFlags();
        if (trackBundle.fragment.sampleIsDisposable[this.currentTrackBundle.currentSampleIndex]) {
            currentSampleFlags |= 1048576;
        }
        int i8 = currentSampleFlags;
        TrackEncryptionBox encryptionBoxIfEncrypted = trackBundle.getEncryptionBoxIfEncrypted();
        trackOutput.sampleMetadata(j, i8, this.sampleSize, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.cryptoData : null);
        outputPendingMetadataSamples(j);
        if (!trackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return true;
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo removeFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= removeFirst.size;
            long j2 = removeFirst.sampleTimeUs;
            if (removeFirst.sampleTimeIsRelative) {
                j2 += j;
            }
            Fmp4TimestampAdjuster fmp4TimestampAdjuster = this.timestampAdjuster;
            if (fmp4TimestampAdjuster != null) {
                j2 = fmp4TimestampAdjuster.adjustSampleTimestamp(j2);
            }
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j2, 1, removeFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static TrackBundle getNextTrackBundle(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackBundle valueAt = sparseArray.valueAt(i);
            if ((valueAt.currentlyInFragment || valueAt.currentSampleIndex != valueAt.moovSampleTable.sampleCount) && (!valueAt.currentlyInFragment || valueAt.currentTrackRunIndex != valueAt.fragment.trunCount)) {
                long currentSampleOffset = valueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j) {
                    trackBundle = valueAt;
                    j = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<Atom.LeafAtom> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Atom.LeafAtom leafAtom = list.get(i);
            if (leafAtom.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = leafAtom.data.getData();
                UUID parseUuid = PsshAtomUtil.parseUuid(data);
                if (parseUuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(parseUuid, "video/mp4", data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j, boolean z, int i) {
            this.sampleTimeUs = j;
            this.sampleTimeIsRelative = z;
            this.size = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TrackBundle {
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        public final TrackFragment fragment = new TrackFragment();
        public final ParsableByteArray scratch = new ParsableByteArray();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            reset(trackSampleTable, defaultSampleValues);
        }

        public void reset(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.output.format(trackSampleTable.track.format);
            resetFragmentInfo();
            this.fragment.mediaTimeOffset = trackSampleTable.track.getMediaTimeOffset() != -1 ? trackSampleTable.track.getMediaTimeOffset() : 0L;
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            this.output.format(this.moovSampleTable.track.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j) {
            int i = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i >= trackFragment.sampleCount || trackFragment.getSamplePresentationTimeUs(i) > j) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i]) {
                    this.firstSampleToOutputIndex = i;
                }
                i++;
            }
        }

        public long getCurrentSamplePresentationTimeUs() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.timestampsUs[this.currentSampleIndex];
            }
            return this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public long getCurrentSampleOffset() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.offsets[this.currentSampleIndex];
            }
            return this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public int getCurrentSampleSize() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.sizes[this.currentSampleIndex];
            }
            return this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        public int getCurrentSampleFlags() {
            int i;
            if (!this.currentlyInFragment) {
                i = this.moovSampleTable.flags[this.currentSampleIndex];
            } else {
                i = this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            }
            return getEncryptionBoxIfEncrypted() != null ? i | 1073741824 : i;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (this.currentlyInFragment) {
                int i = this.currentSampleInTrackRun + 1;
                this.currentSampleInTrackRun = i;
                int[] iArr = this.fragment.trunLength;
                int i2 = this.currentTrackRunIndex;
                if (i == iArr[i2]) {
                    this.currentTrackRunIndex = i2 + 1;
                    this.currentSampleInTrackRun = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int outputSampleEncryptionData(int i, int i2) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int i3 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i3 != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                i3 = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean sampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            boolean z = sampleHasSubsampleEncryptionTable || i2 != 0;
            this.encryptionSignalByte.getData()[0] = (byte) ((z ? 128 : 0) | i3);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, i3, 1);
            if (z) {
                if (!sampleHasSubsampleEncryptionTable) {
                    this.scratch.reset(8);
                    byte[] data = this.scratch.getData();
                    data[0] = 0;
                    data[1] = 1;
                    data[2] = (byte) ((i2 >> 8) & PrivateKeyType.INVALID);
                    data[3] = (byte) (i2 & PrivateKeyType.INVALID);
                    data[4] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
                    data[5] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
                    data[6] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
                    data[7] = (byte) (i & PrivateKeyType.INVALID);
                    this.output.sampleData(this.scratch, 8, 1);
                    return i3 + 9;
                }
                ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
                int readUnsignedShort = parsableByteArray3.readUnsignedShort();
                parsableByteArray3.skipBytes(-2);
                int i4 = (readUnsignedShort * 6) + 2;
                if (i2 != 0) {
                    this.scratch.reset(i4);
                    byte[] data2 = this.scratch.getData();
                    parsableByteArray3.readBytes(data2, 0, i4);
                    int i5 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i2;
                    data2[2] = (byte) ((i5 >> 8) & PrivateKeyType.INVALID);
                    data2[3] = (byte) (i5 & PrivateKeyType.INVALID);
                    parsableByteArray3 = this.scratch;
                }
                this.output.sampleData(parsableByteArray3, i4, 1);
                return i3 + 1 + i4;
            }
            return i3 + 1;
        }

        public void skipSampleEncryptionData() {
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            int i = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i != 0) {
                parsableByteArray.skipBytes(i);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (this.currentlyInFragment) {
                int i = ((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
                TrackEncryptionBox trackEncryptionBox = this.fragment.trackEncryptionBox;
                if (trackEncryptionBox == null) {
                    trackEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i);
                }
                if (trackEncryptionBox == null || !trackEncryptionBox.isEncrypted) {
                    return null;
                }
                return trackEncryptionBox;
            }
            return null;
        }
    }

    private static void parseSdtp(ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        parsableByteArray.setPosition(12);
        int bytesLeft = parsableByteArray.bytesLeft();
        if (bytesLeft > 0) {
            trackFragment.sampleIsDisposable = new boolean[bytesLeft];
        }
        for (int i = 0; i < bytesLeft; i++) {
            trackFragment.sampleIsDisposable[i] = ((parsableByteArray.readUnsignedByte() >> 2) & 3) == 2;
        }
    }
}
