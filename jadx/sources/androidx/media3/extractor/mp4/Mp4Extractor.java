package androidx.media3.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Atom;
import com.google.common.base.Function;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = Mp4Extractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private long[][] accumulatedSampleSizes;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private boolean seenFtypAtom;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private Mp4Track[] tracks;

    private static int brandToFileType(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Track lambda$processMoovAtom$1(Track track) {
        return track;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp4Extractor()};
    }

    public Mp4Extractor() {
        this(0);
    }

    public Mp4Extractor(int i) {
        this.flags = i;
        this.parserState = (i & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        Mp4Track[] mp4TrackArr;
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            }
            this.sefReader.reset();
            this.slowMotionMetadataEntries.clear();
            return;
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j2);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return readSefData(extractorInput, positionHolder);
                        }
                        throw new IllegalStateException();
                    }
                    return readSample(extractorInput, positionHolder);
                } else if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return getSeekPoints(j, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long r19, int r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r5 != 0) goto L13
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            androidx.media3.extractor.SeekPoint r2 = androidx.media3.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.firstVideoTrackIndex
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r5) goto L58
            r4 = r4[r6]
            androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            int r6 = getSynchronizationSampleIndex(r4, r1)
            if (r6 != r5) goto L33
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            androidx.media3.extractor.SeekPoint r2 = androidx.media3.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L33:
            long[] r9 = r4.timestampsUs
            r10 = r9[r6]
            long[] r9 = r4.offsets
            r12 = r9[r6]
            int r9 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r9 >= 0) goto L56
            int r9 = r4.sampleCount
            int r9 = r9 + (-1)
            if (r6 >= r9) goto L56
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L56
            if (r1 == r6) goto L56
            long[] r2 = r4.timestampsUs
            r14 = r2[r1]
            long[] r2 = r4.offsets
            r1 = r2[r1]
            goto L65
        L56:
            r1 = r10
            goto L5d
        L58:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L5d:
            r9 = -1
            r14 = r7
            r16 = r1
            r1 = r9
            r10 = r16
        L65:
            if (r3 != r5) goto L84
            r3 = 0
        L68:
            androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r3 >= r5) goto L84
            int r5 = r0.firstVideoTrackIndex
            if (r3 == r5) goto L81
            r4 = r4[r3]
            androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            long r12 = maybeAdjustSeekOffset(r4, r10, r12)
            int r5 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r5 == 0) goto L81
            long r1 = maybeAdjustSeekOffset(r4, r14, r1)
        L81:
            int r3 = r3 + 1
            goto L68
        L84:
            androidx.media3.extractor.SeekPoint r3 = new androidx.media3.extractor.SeekPoint
            r3.<init>(r10, r12)
            int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r4 != 0) goto L93
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            r1.<init>(r3)
            return r1
        L93:
            androidx.media3.extractor.SeekPoint r4 = new androidx.media3.extractor.SeekPoint
            r4.<init>(r14, r1)
            androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.getSeekPoints(long, int):androidx.media3.extractor.SeekMap$SeekPoints");
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) {
        Atom.ContainerAtom peek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
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
            if (length == -1 && (peek = this.containerAtoms.peek()) != null) {
                length = peek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j2 = this.atomSize;
            long j3 = this.atomHeaderBytesRead;
            long j4 = (position + j2) - j3;
            if (j2 != j3 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, j4));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j4);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - this.atomHeaderBytesRead);
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) {
        boolean z;
        long j = this.atomSize - this.atomHeaderBytesRead;
        long position = extractorInput.getPosition();
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j);
            if (this.atomType == 1718909296) {
                this.seenFtypAtom = true;
                this.fileType = processFtypAtom(parsableByteArray);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, parsableByteArray));
            }
        } else {
            if (!this.seenFtypAtom && this.atomType == 1835295092) {
                this.fileType = 1;
            }
            if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                extractorInput.skipFully((int) j);
            } else {
                positionHolder.position = extractorInput.getPosition() + j;
                z = true;
                processAtomEnded(position + j);
                return z && this.parserState != 2;
            }
        }
        z = false;
        processAtomEnded(position + j);
        if (z) {
            return false;
        }
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int read = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (read == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return read;
    }

    private void processAtomEnded(long j) {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            Atom.ContainerAtom pop = this.containerAtoms.pop();
            if (pop.type == 1836019574) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processMoovAtom(Atom.ContainerAtom containerAtom) {
        Metadata metadata;
        List<TrackSampleTable> list;
        int i;
        int i2;
        boolean z;
        int i3;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        boolean z3 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1969517665);
        if (leafAtomOfType != null) {
            Metadata parseUdta = AtomParsers.parseUdta(leafAtomOfType);
            gaplessInfoHolder.setFromMetadata(parseUdta);
            metadata = parseUdta;
        } else {
            metadata = null;
        }
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(1835365473);
        Metadata parseMdtaFromMeta = containerAtomOfType != null ? AtomParsers.parseMdtaFromMeta(containerAtomOfType) : null;
        Metadata metadata2 = new Metadata(AtomParsers.parseMvhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516))).data));
        long j = -9223372036854775807L;
        List<TrackSampleTable> parseTraks = AtomParsers.parseTraks(containerAtom, gaplessInfoHolder, -9223372036854775807L, null, (this.flags & 1) != 0, z3, new Function() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                Track lambda$processMoovAtom$1;
                lambda$processMoovAtom$1 = Mp4Extractor.lambda$processMoovAtom$1((Track) obj);
                return lambda$processMoovAtom$1;
            }
        });
        int size = parseTraks.size();
        int i4 = 0;
        Metadata metadata3 = metadata;
        int i5 = -1;
        long j2 = -9223372036854775807L;
        while (i4 < size) {
            TrackSampleTable trackSampleTable = parseTraks.get(i4);
            if (trackSampleTable.sampleCount == 0) {
                list = parseTraks;
                i2 = size;
                z = z2;
            } else {
                Track track = trackSampleTable.track;
                long j3 = track.durationUs;
                if (j3 == j) {
                    j3 = trackSampleTable.durationUs;
                }
                j2 = Math.max(j2, j3);
                list = parseTraks;
                Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i4, track.type));
                if ("audio/true-hd".equals(track.format.sampleMimeType)) {
                    i = trackSampleTable.maximumSize * 16;
                } else {
                    i = trackSampleTable.maximumSize + 30;
                }
                Format.Builder buildUpon = track.format.buildUpon();
                buildUpon.setMaxInputSize(i);
                i2 = size;
                if (track.type == 2 && j3 > 0 && (i3 = trackSampleTable.sampleCount) > 1) {
                    buildUpon.setFrameRate(i3 / (((float) j3) / 1000000.0f));
                }
                MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, buildUpon);
                int i6 = track.type;
                Metadata[] metadataArr = new Metadata[3];
                metadataArr[0] = this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries);
                z = true;
                metadataArr[1] = metadata3;
                metadataArr[2] = metadata2;
                MetadataUtil.setFormatMetadata(i6, parseMdtaFromMeta, buildUpon, metadataArr);
                mp4Track.trackOutput.format(buildUpon.build());
                if (track.type == 2 && i5 == -1) {
                    i5 = arrayList.size();
                }
                arrayList.add(mp4Track);
            }
            i4++;
            z2 = z;
            parseTraks = list;
            size = i2;
            j = -9223372036854775807L;
        }
        this.firstVideoTrackIndex = i5;
        this.durationUs = j2;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i;
        PositionHolder positionHolder2;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i2 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j = trackSampleTable.offsets[i2];
        int i3 = trackSampleTable.sizes[i2];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j2 = (j - position) + this.sampleBytesRead;
        if (j2 < 0) {
            i = 1;
            positionHolder2 = positionHolder;
        } else if (j2 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            if (mp4Track.track.sampleTransformation == 1) {
                j2 += 8;
                i3 -= 8;
            }
            extractorInput.skipFully((int) j2);
            Track track = mp4Track.track;
            if (track.nalUnitLengthFieldLength != 0) {
                byte[] data = this.nalLength.getData();
                data[0] = 0;
                data[1] = 0;
                data[2] = 0;
                int i4 = mp4Track.track.nalUnitLengthFieldLength;
                int i5 = 4 - i4;
                while (this.sampleBytesWritten < i3) {
                    int i6 = this.sampleCurrentNalBytesRemaining;
                    if (i6 == 0) {
                        extractorInput.readFully(data, i5, i4);
                        this.sampleBytesRead += i4;
                        this.nalLength.setPosition(0);
                        int readInt = this.nalLength.readInt();
                        if (readInt < 0) {
                            throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                        }
                        this.sampleCurrentNalBytesRemaining = readInt;
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                        i3 += i5;
                    } else {
                        int sampleData = trackOutput.sampleData((DataReader) extractorInput, i6, false);
                        this.sampleBytesRead += sampleData;
                        this.sampleBytesWritten += sampleData;
                        this.sampleCurrentNalBytesRemaining -= sampleData;
                    }
                }
            } else {
                if ("audio/ac4".equals(track.format.sampleMimeType)) {
                    if (this.sampleBytesWritten == 0) {
                        Ac4Util.getAc4SampleHeader(i3, this.scratch);
                        trackOutput.sampleData(this.scratch, 7);
                        this.sampleBytesWritten += 7;
                    }
                    i3 += 7;
                } else if (trueHdSampleRechunker != null) {
                    trueHdSampleRechunker.startSample(extractorInput);
                }
                while (true) {
                    int i7 = this.sampleBytesWritten;
                    if (i7 >= i3) {
                        break;
                    }
                    int sampleData2 = trackOutput.sampleData((DataReader) extractorInput, i3 - i7, false);
                    this.sampleBytesRead += sampleData2;
                    this.sampleBytesWritten += sampleData2;
                    this.sampleCurrentNalBytesRemaining -= sampleData2;
                }
            }
            int i8 = i3;
            TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
            long j3 = trackSampleTable2.timestampsUs[i2];
            int i9 = trackSampleTable2.flags[i2];
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.sampleMetadata(trackOutput, j3, i9, i8, 0, null);
                if (i2 + 1 == mp4Track.sampleTable.sampleCount) {
                    trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
                }
            } else {
                trackOutput.sampleMetadata(j3, i9, i8, 0, null);
            }
            mp4Track.sampleIndex++;
            this.sampleTrackIndex = -1;
            this.sampleBytesRead = 0;
            this.sampleBytesWritten = 0;
            this.sampleCurrentNalBytesRemaining = 0;
            return 0;
        } else {
            positionHolder2 = positionHolder;
            i = 1;
        }
        positionHolder2.position = j;
        return i;
    }

    private int getTrackIndexOfNextReadSample(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i3 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i3];
            int i4 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i4 != trackSampleTable.sampleCount) {
                long j5 = trackSampleTable.offsets[i4];
                long j6 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        TrackOutput track = this.extractorOutput.track(0, 4);
        MotionPhotoMetadata motionPhotoMetadata = this.motionPhotoMetadata;
        track.format(new Format.Builder().setMetadata(motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processUnparsedAtom(long j) {
        if (this.atomType == 1836086884) {
            long j2 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + j2, this.atomSize - j2);
        }
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i = 0; i < mp4TrackArr.length; i++) {
            jArr[i] = new long[mp4TrackArr[i].sampleTable.sampleCount];
            jArr2[i] = mp4TrackArr[i].sampleTable.timestampsUs[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < mp4TrackArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < mp4TrackArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            TrackSampleTable trackSampleTable = mp4TrackArr[i3].sampleTable;
            j += trackSampleTable.sizes[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = trackSampleTable.timestampsUs[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j, long j2) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j);
        return synchronizationSampleIndex == -1 ? j2 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j2);
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int brandToFileType = brandToFileType(parsableByteArray.readInt());
        if (brandToFileType != 0) {
            return brandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int brandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (brandToFileType2 != 0) {
                return brandToFileType2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = "audio/true-hd".equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }
}
