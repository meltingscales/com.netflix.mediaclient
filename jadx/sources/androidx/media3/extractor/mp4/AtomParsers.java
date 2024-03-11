package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.mp4.Atom;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AtomParsers {
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static boolean canTrimSamplesWithTimestampChange(int i) {
        return i != 1;
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) {
        Track apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (apply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(apply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + readInt));
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseSmta(parsableByteArray, position + readInt));
            } else if (readInt2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return metadata;
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long readLong;
        long readLong2;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            readLong = parsableByteArray.readUnsignedInt();
            readLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readLong = parsableByteArray.readLong();
            readLong2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(readLong, readLong2, parsableByteArray.readUnsignedInt());
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1751411826);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1801812339);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1768715124);
        if (leafAtomOfType != null && leafAtomOfType2 != null && leafAtomOfType3 != null && parseHdlr(leafAtomOfType.data) == 1835299937) {
            ParsableByteArray parsableByteArray = leafAtomOfType2.data;
            parsableByteArray.setPosition(12);
            int readInt = parsableByteArray.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(4);
                strArr[i] = parsableByteArray.readString(readInt2 - 8);
            }
            ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
            parsableByteArray2.setPosition(8);
            ArrayList arrayList = new ArrayList();
            while (parsableByteArray2.bytesLeft() > 8) {
                int position = parsableByteArray2.getPosition();
                int readInt3 = parsableByteArray2.readInt();
                int readInt4 = parsableByteArray2.readInt() - 1;
                if (readInt4 >= 0 && readInt4 < readInt) {
                    MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                    if (parseMdtaMetadataEntryFromIlst != null) {
                        arrayList.add(parseMdtaMetadataEntryFromIlst);
                    }
                } else {
                    Log.w("AtomParsers", "Skipped metadata with unknown key index: " + readInt4);
                }
                parsableByteArray2.setPosition(position + readInt3);
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> parseEdts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1953196132))).data);
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long j3 = parseMvhd(leafAtom2.data).timescale;
        long scaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        Pair<Long, String> parseMdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1835296868))).data);
        Atom.LeafAtom leafAtomOfType = ((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212))).getLeafAtomOfType(1937011556);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafAtomOfType.data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(1701082227)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr2 = (long[]) parseEdts.second;
            jArr = (long[]) parseEdts.first;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.id, trackTypeForHdlr, ((Long) parseMdhd.first).longValue(), j3, scaleLargeTimestamp, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        long[] jArr;
        Track track2;
        int i6;
        int[] iArr;
        int[] iArr2;
        long[] jArr2;
        int i7;
        long[] jArr3;
        long j;
        int i8;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        long[] jArr5;
        int[] iArr6;
        int i9;
        boolean z3;
        int i10;
        int i11;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1937011578);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1937013298);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1937007471);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011827))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i3 = parsableByteArray4.readUnsignedIntToInt();
            if (i3 > 0) {
                i2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                i2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            i2 = -1;
            i3 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        if (fixedSampleSize != -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i3 == 0)) {
            int i12 = chunkIterator.length;
            long[] jArr6 = new long[i12];
            int[] iArr7 = new int[i12];
            while (chunkIterator.moveNext()) {
                int i13 = chunkIterator.index;
                jArr6[i13] = chunkIterator.offset;
                iArr7[i13] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr6, iArr7, readUnsignedIntToInt3);
            long[] jArr7 = rechunk.offsets;
            iArr2 = rechunk.sizes;
            int i14 = rechunk.maximumSize;
            long[] jArr8 = rechunk.timestamps;
            int[] iArr8 = rechunk.flags;
            long j2 = rechunk.duration;
            i6 = sampleCount;
            jArr3 = jArr7;
            i7 = i14;
            jArr2 = jArr8;
            iArr = iArr8;
            j = j2;
            track2 = track;
        } else {
            long[] jArr9 = new long[sampleCount];
            int[] iArr9 = new int[sampleCount];
            long[] jArr10 = new long[sampleCount];
            int[] iArr10 = new int[sampleCount];
            int i15 = readUnsignedIntToInt;
            int i16 = i;
            int i17 = i2;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            long j3 = 0;
            long j4 = 0;
            while (true) {
                if (i19 >= sampleCount) {
                    break;
                }
                long j5 = j3;
                boolean z4 = true;
                while (i20 == 0) {
                    z4 = chunkIterator.moveNext();
                    if (!z4) {
                        break;
                    }
                    j5 = chunkIterator.offset;
                    i20 = chunkIterator.numSamples;
                    sampleCount = sampleCount;
                    i17 = i17;
                }
                int i23 = i17;
                int i24 = sampleCount;
                if (!z4) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    jArr9 = Arrays.copyOf(jArr9, i19);
                    iArr9 = Arrays.copyOf(iArr9, i19);
                    jArr10 = Arrays.copyOf(jArr10, i19);
                    iArr10 = Arrays.copyOf(iArr10, i19);
                    sampleCount = i19;
                    break;
                }
                int i25 = i16;
                if (parsableByteArray5 != null) {
                    while (i22 == 0 && i25 > 0) {
                        i22 = parsableByteArray5.readUnsignedIntToInt();
                        i21 = parsableByteArray5.readInt();
                        i25--;
                    }
                    i22--;
                }
                int i26 = i21;
                jArr9[i19] = j5;
                int readNextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArr9[i19] = readNextSampleSize;
                long[] jArr11 = jArr9;
                SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                if (readNextSampleSize > i18) {
                    i18 = readNextSampleSize;
                }
                jArr10[i19] = j4 + i26;
                iArr10[i19] = parsableByteArray4 == null ? 1 : 0;
                int i27 = i23;
                if (i19 == i27) {
                    iArr10[i19] = 1;
                    i3--;
                    if (i3 > 0) {
                        i27 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int[] iArr11 = iArr10;
                i16 = i25;
                j4 += readUnsignedIntToInt3;
                readUnsignedIntToInt2--;
                if (readUnsignedIntToInt2 == 0 && i15 > 0) {
                    i15--;
                    readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
                    readUnsignedIntToInt3 = parsableByteArray3.readInt();
                }
                i20--;
                i19++;
                i21 = i26;
                sampleCount = i24;
                i17 = i27;
                iArr10 = iArr11;
                stz2SampleSizeBox = sampleSizeBox;
                jArr9 = jArr11;
                j3 = j5 + iArr9[i19];
            }
            int i28 = i20;
            long j6 = i21;
            if (parsableByteArray5 != null) {
                for (int i29 = i16; i29 > 0; i29--) {
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z2 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                }
            }
            z2 = true;
            if (i3 == 0 && readUnsignedIntToInt2 == 0 && i28 == 0 && i15 == 0) {
                i4 = i22;
                if (i4 == 0 && z2) {
                    i5 = sampleCount;
                    jArr = jArr9;
                    track2 = track;
                    i6 = i5;
                    iArr = iArr10;
                    iArr2 = iArr9;
                    jArr2 = jArr10;
                    i7 = i18;
                    jArr3 = jArr;
                    j = j4 + j6;
                }
            } else {
                i4 = i22;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent stbl box for track ");
            i5 = sampleCount;
            jArr = jArr9;
            track2 = track;
            sb.append(track2.id);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i3);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(readUnsignedIntToInt2);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i28);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i15);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i4);
            sb.append(!z2 ? ", ctts invalid" : "");
            Log.w("AtomParsers", sb.toString());
            i6 = i5;
            iArr = iArr10;
            iArr2 = iArr9;
            jArr2 = jArr10;
            i7 = i18;
            jArr3 = jArr;
            j = j4 + j6;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        long[] jArr12 = track2.editListDurations;
        if (jArr12 == null) {
            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
            return new TrackSampleTable(track, jArr3, iArr2, i7, jArr2, iArr, scaleLargeTimestamp);
        }
        if (jArr12.length == 1 && track2.type == 1 && jArr2.length >= 2) {
            long j7 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long scaleLargeTimestamp2 = j7 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
            i8 = i6;
            if (canApplyEditWithGaplessInfo(jArr2, j, j7, scaleLargeTimestamp2)) {
                long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j7 - jArr2[0], track2.format.sampleRate, track2.timescale);
                long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr3, iArr2, i7, jArr2, iArr, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            }
        } else {
            i8 = i6;
        }
        long[] jArr13 = track2.editListDurations;
        if (jArr13.length == 1 && jArr13[0] == 0) {
            long j8 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            for (int i30 = 0; i30 < jArr2.length; i30++) {
                jArr2[i30] = Util.scaleLargeTimestamp(jArr2[i30] - j8, 1000000L, track2.timescale);
            }
            return new TrackSampleTable(track, jArr3, iArr2, i7, jArr2, iArr, Util.scaleLargeTimestamp(j - j8, 1000000L, track2.timescale));
        }
        boolean z5 = track2.type == 1;
        int[] iArr12 = new int[jArr13.length];
        int[] iArr13 = new int[jArr13.length];
        long[] jArr14 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        int i31 = 0;
        int i32 = 0;
        boolean z6 = false;
        int i33 = 0;
        while (true) {
            long[] jArr15 = track2.editListDurations;
            if (i31 >= jArr15.length) {
                break;
            }
            int i34 = i7;
            int[] iArr14 = iArr2;
            long j9 = jArr14[i31];
            if (j9 != -1) {
                long j10 = jArr15[i31];
                boolean z7 = z6;
                int i35 = i33;
                iArr6 = iArr;
                i9 = i34;
                long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(j10, track2.timescale, track2.movieTimescale);
                iArr12[i31] = Util.binarySearchFloor(jArr2, j9, true, true);
                iArr13[i31] = Util.binarySearchCeil(jArr2, j9 + scaleLargeTimestamp5, z5, false);
                while (true) {
                    i10 = iArr12[i31];
                    i11 = iArr13[i31];
                    if (i10 >= i11 || (iArr6[i10] & 1) != 0) {
                        break;
                    }
                    iArr12[i31] = i10 + 1;
                }
                i32 += i11 - i10;
                z3 = z7 | (i35 != i10);
                i33 = i11;
            } else {
                iArr6 = iArr;
                i9 = i34;
                z3 = z6;
            }
            i31++;
            iArr2 = iArr14;
            z6 = z3;
            iArr = iArr6;
            i7 = i9;
        }
        int i36 = i7;
        int[] iArr15 = iArr2;
        int[] iArr16 = iArr;
        boolean z8 = z6 | (i32 != i8);
        long[] jArr16 = z8 ? new long[i32] : jArr3;
        int[] iArr17 = z8 ? new int[i32] : iArr15;
        if (z8) {
            i36 = 0;
        }
        int[] iArr18 = z8 ? new int[i32] : iArr16;
        long[] jArr17 = new long[i32];
        int i37 = 0;
        int i38 = 0;
        long j11 = 0;
        while (i37 < track2.editListDurations.length) {
            long j12 = track2.editListMediaTimes[i37];
            int i39 = iArr12[i37];
            int i40 = iArr13[i37];
            int[] iArr19 = iArr13;
            if (z8) {
                int i41 = i40 - i39;
                System.arraycopy(jArr3, i39, jArr16, i38, i41);
                jArr4 = jArr3;
                iArr5 = iArr15;
                System.arraycopy(iArr5, i39, iArr17, i38, i41);
                iArr3 = iArr12;
                iArr4 = iArr16;
                System.arraycopy(iArr4, i39, iArr18, i38, i41);
            } else {
                jArr4 = jArr3;
                iArr3 = iArr12;
                iArr4 = iArr16;
                iArr5 = iArr15;
            }
            int i42 = i36;
            while (i39 < i40) {
                int[] iArr20 = iArr4;
                int[] iArr21 = iArr18;
                long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale);
                long j13 = j11;
                long scaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr2[i39] - j12, 1000000L, track2.timescale);
                long[] jArr18 = jArr2;
                if (canTrimSamplesWithTimestampChange(track2.type)) {
                    jArr5 = jArr16;
                    scaleLargeTimestamp7 = Math.max(0L, scaleLargeTimestamp7);
                } else {
                    jArr5 = jArr16;
                }
                jArr17[i38] = scaleLargeTimestamp6 + scaleLargeTimestamp7;
                if (z8 && iArr17[i38] > i42) {
                    i42 = iArr5[i39];
                }
                i38++;
                i39++;
                track2 = track;
                j11 = j13;
                jArr16 = jArr5;
                iArr18 = iArr21;
                jArr2 = jArr18;
                iArr4 = iArr20;
            }
            int[] iArr22 = iArr4;
            long j14 = j11;
            long j15 = track2.editListDurations[i37];
            i37++;
            j11 = j14 + j15;
            i36 = i42;
            iArr15 = iArr5;
            jArr16 = jArr16;
            iArr18 = iArr18;
            jArr2 = jArr2;
            iArr13 = iArr19;
            jArr3 = jArr4;
            iArr12 = iArr3;
            iArr16 = iArr22;
        }
        return new TrackSampleTable(track, jArr16, iArr17, i36, jArr17, iArr18, Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale));
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String readString = parsableByteArray.readString(readShort);
        int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (readInt < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte == 12 || readUnsignedByte == 13) {
                    float f = readUnsignedByte == 12 ? 240.0f : 120.0f;
                    parsableByteArray.skipBytes(1);
                    return new Metadata(new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
                }
                return null;
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r0 == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.media3.extractor.mp4.AtomParsers.TkhdData parseTkhd(androidx.media3.common.util.ParsableByteArray r10) {
        /*
            r0 = 8
            r10.setPosition(r0)
            int r1 = r10.readInt()
            int r1 = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(r1)
            r2 = 16
            if (r1 != 0) goto L13
            r3 = r0
            goto L14
        L13:
            r3 = r2
        L14:
            r10.skipBytes(r3)
            int r3 = r10.readInt()
            r4 = 4
            r10.skipBytes(r4)
            int r5 = r10.getPosition()
            if (r1 != 0) goto L26
            r0 = r4
        L26:
            r6 = 0
            r7 = r6
        L28:
            if (r7 >= r0) goto L4a
            byte[] r8 = r10.getData()
            int r9 = r5 + r7
            r8 = r8[r9]
            r9 = -1
            if (r8 == r9) goto L47
            if (r1 != 0) goto L3c
            long r0 = r10.readUnsignedInt()
            goto L40
        L3c:
            long r0 = r10.readUnsignedLongToLong()
        L40:
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 != 0) goto L52
            goto L4d
        L47:
            int r7 = r7 + 1
            goto L28
        L4a:
            r10.skipBytes(r0)
        L4d:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L52:
            r10.skipBytes(r2)
            int r2 = r10.readInt()
            int r5 = r10.readInt()
            r10.skipBytes(r4)
            int r4 = r10.readInt()
            int r10 = r10.readInt()
            r7 = 65536(0x10000, float:9.18355E-41)
            r8 = -65536(0xffffffffffff0000, float:NaN)
            if (r2 != 0) goto L77
            if (r5 != r7) goto L77
            if (r4 != r8) goto L77
            if (r10 != 0) goto L77
            r6 = 90
            goto L8c
        L77:
            if (r2 != 0) goto L82
            if (r5 != r8) goto L82
            if (r4 != r7) goto L82
            if (r10 != 0) goto L82
            r6 = 270(0x10e, float:3.78E-43)
            goto L8c
        L82:
            if (r2 != r8) goto L8c
            if (r5 != 0) goto L8c
            if (r4 != 0) goto L8c
            if (r10 != r8) goto L8c
            r6 = 180(0xb4, float:2.52E-43)
        L8c:
            androidx.media3.extractor.mp4.AtomParsers$TkhdData r10 = new androidx.media3.extractor.mp4.AtomParsers$TkhdData
            r10.<init>(r3, r0, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.AtomParsers.parseTkhd(androidx.media3.common.util.ParsableByteArray):androidx.media3.extractor.mp4.AtomParsers$TkhdData");
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        int i3;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i3, readInt2, i, i2, drmInitData, stsdData, i4);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i4);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) {
        String str;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        List<byte[]> list;
        float f;
        int i9;
        int i10;
        int i11;
        String str2;
        List<byte[]> list2;
        float f2;
        String str3;
        int i12 = i2;
        int i13 = i3;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i12 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i14 = i;
        if (i14 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i13);
            if (parseSampleEntryEncryptionData != null) {
                i14 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = "video/3gpp";
        String str5 = i14 == 1831958048 ? "video/mpeg" : i14 == 1211250227 ? "video/3gpp" : null;
        float f3 = 1.0f;
        List<byte[]> list3 = null;
        String str6 = null;
        ByteBuffer byteBuffer = null;
        byte[] bArr = null;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = 8;
        int i20 = 8;
        EsdsData esdsData = null;
        boolean z = false;
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                str = str4;
                if (parsableByteArray.getPosition() - i12 == i13) {
                    break;
                }
            } else {
                str = str4;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str5 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list3 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f3 = parse.pixelWidthHeightRatio;
                }
                str6 = parse.codecs;
                int i21 = parse.colorSpace;
                int i22 = parse.colorRange;
                int i23 = parse.colorTransfer;
                int i24 = parse.bitdepthLuma;
                i20 = parse.bitdepthChroma;
                i19 = i24;
                drmInitData2 = drmInitData3;
                i7 = readUnsignedShort2;
                i17 = i21;
                i8 = i14;
                i16 = i23;
                str5 = "video/avc";
                i15 = i22;
            } else if (readInt2 == 1752589123) {
                ExtractorUtil.checkContainerInput(str5 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                List<byte[]> list4 = parse2.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                if (!z) {
                    f3 = parse2.pixelWidthHeightRatio;
                }
                String str7 = parse2.codecs;
                int i25 = parse2.colorSpace;
                int i26 = parse2.colorRange;
                int i27 = parse2.colorTransfer;
                int i28 = parse2.bitdepthLuma;
                i20 = parse2.bitdepthChroma;
                drmInitData2 = drmInitData3;
                i7 = readUnsignedShort2;
                i8 = i14;
                i17 = i25;
                i16 = i27;
                i19 = i28;
                str6 = str7;
                str5 = "video/hevc";
                i15 = i26;
                list3 = list4;
            } else {
                if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                    drmInitData2 = drmInitData3;
                    i7 = readUnsignedShort2;
                    i8 = i14;
                    list = list3;
                    f = f3;
                    i9 = i16;
                    i10 = i17;
                    DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                    if (parse3 != null) {
                        str6 = parse3.codecs;
                        str5 = "video/dolby-vision";
                    }
                } else {
                    if (readInt2 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str5 == null, null);
                        str3 = i14 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        parsableByteArray.setPosition(position2 + 12);
                        parsableByteArray.skipBytes(2);
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        int i29 = readUnsignedByte >> 4;
                        boolean z2 = (readUnsignedByte & 1) != 0;
                        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                        int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte2);
                        i11 = z2 ? 1 : 2;
                        i16 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte3);
                        i19 = i29;
                        i15 = i11;
                        i17 = isoColorPrimariesToColorSpace;
                    } else if (readInt2 == 1635135811) {
                        ExtractorUtil.checkContainerInput(str5 == null, null);
                        parsableByteArray.setPosition(position2 + 8);
                        parsableByteArray.skipBytes(1);
                        int readUnsignedByte4 = parsableByteArray.readUnsignedByte() >> 5;
                        int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                        boolean z3 = ((readUnsignedByte5 >> 6) & 1) != 0;
                        if (readUnsignedByte4 == 2 && z3) {
                            if ((1 & (readUnsignedByte5 >> 5)) != 0) {
                                i19 = 12;
                                str3 = "video/av01";
                            }
                            i19 = 10;
                            str3 = "video/av01";
                        } else {
                            if (readUnsignedByte4 <= 2) {
                                if (!z3) {
                                    i19 = 8;
                                }
                                i19 = 10;
                            }
                            str3 = "video/av01";
                        }
                    } else {
                        if (readInt2 == 1668050025) {
                            if (byteBuffer == null) {
                                byteBuffer = allocateHdrStaticInfo();
                            }
                            ByteBuffer byteBuffer2 = byteBuffer;
                            byteBuffer2.position(21);
                            byteBuffer2.putShort(parsableByteArray.readShort());
                            byteBuffer2.putShort(parsableByteArray.readShort());
                            byteBuffer = byteBuffer2;
                            drmInitData2 = drmInitData3;
                            i7 = readUnsignedShort2;
                            i8 = i14;
                            list2 = list3;
                            f2 = f3;
                        } else if (readInt2 == 1835295606) {
                            if (byteBuffer == null) {
                                byteBuffer = allocateHdrStaticInfo();
                            }
                            ByteBuffer byteBuffer3 = byteBuffer;
                            short readShort = parsableByteArray.readShort();
                            short readShort2 = parsableByteArray.readShort();
                            short readShort3 = parsableByteArray.readShort();
                            i8 = i14;
                            short readShort4 = parsableByteArray.readShort();
                            short readShort5 = parsableByteArray.readShort();
                            drmInitData2 = drmInitData3;
                            short readShort6 = parsableByteArray.readShort();
                            list2 = list3;
                            short readShort7 = parsableByteArray.readShort();
                            f2 = f3;
                            short readShort8 = parsableByteArray.readShort();
                            long readUnsignedInt = parsableByteArray.readUnsignedInt();
                            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                            i7 = readUnsignedShort2;
                            byteBuffer3.position(1);
                            byteBuffer3.putShort(readShort5);
                            byteBuffer3.putShort(readShort6);
                            byteBuffer3.putShort(readShort);
                            byteBuffer3.putShort(readShort2);
                            byteBuffer3.putShort(readShort3);
                            byteBuffer3.putShort(readShort4);
                            byteBuffer3.putShort(readShort7);
                            byteBuffer3.putShort(readShort8);
                            byteBuffer3.putShort((short) (readUnsignedInt / 10000));
                            byteBuffer3.putShort((short) (readUnsignedInt2 / 10000));
                            byteBuffer = byteBuffer3;
                        } else {
                            drmInitData2 = drmInitData3;
                            i7 = readUnsignedShort2;
                            i8 = i14;
                            list = list3;
                            f = f3;
                            if (readInt2 == 1681012275) {
                                ExtractorUtil.checkContainerInput(str5 == null, null);
                                str5 = str;
                            } else if (readInt2 == 1702061171) {
                                ExtractorUtil.checkContainerInput(str5 == null, null);
                                EsdsData parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                str2 = parseEsdsFromParent.mimeType;
                                byte[] bArr2 = parseEsdsFromParent.initializationData;
                                list3 = bArr2 != null ? ImmutableList.of(bArr2) : list;
                                esdsData = parseEsdsFromParent;
                                str5 = str2;
                                f3 = f;
                            } else if (readInt2 == 1885434736) {
                                f3 = parsePaspFromParent(parsableByteArray, position2);
                                list3 = list;
                                z = true;
                            } else if (readInt2 == 1937126244) {
                                bArr = parseProjFromParent(parsableByteArray, position2, readInt);
                            } else if (readInt2 == 1936995172) {
                                int readUnsignedByte6 = parsableByteArray.readUnsignedByte();
                                parsableByteArray.skipBytes(3);
                                if (readUnsignedByte6 == 0) {
                                    int readUnsignedByte7 = parsableByteArray.readUnsignedByte();
                                    if (readUnsignedByte7 == 0) {
                                        i18 = 0;
                                    } else if (readUnsignedByte7 == 1) {
                                        i18 = 1;
                                    } else if (readUnsignedByte7 == 2) {
                                        i18 = 2;
                                    } else if (readUnsignedByte7 == 3) {
                                        i18 = 3;
                                    }
                                }
                            } else if (readInt2 == 1668246642) {
                                i10 = i17;
                                i9 = i16;
                                if (i10 == -1 && i9 == -1) {
                                    int readInt3 = parsableByteArray.readInt();
                                    if (readInt3 == 1852009592 || readInt3 == 1852009571) {
                                        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                        int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                        parsableByteArray.skipBytes(2);
                                        boolean z4 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                        int isoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                        i11 = z4 ? 1 : 2;
                                        i17 = isoColorPrimariesToColorSpace2;
                                        i16 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                                        i15 = i11;
                                        list3 = list;
                                        f3 = f;
                                    } else {
                                        Log.w("AtomParsers", "Unsupported color type: " + Atom.getAtomTypeString(readInt3));
                                    }
                                }
                            } else {
                                i9 = i16;
                                i10 = i17;
                            }
                            str2 = str5;
                            list3 = list;
                            str5 = str2;
                            f3 = f;
                        }
                        list3 = list2;
                        f3 = f2;
                    }
                    str5 = str3;
                    drmInitData2 = drmInitData3;
                    i7 = readUnsignedShort2;
                    i8 = i14;
                    list2 = list3;
                    f2 = f3;
                    i20 = i19;
                    list3 = list2;
                    f3 = f2;
                }
                i17 = i10;
                i16 = i9;
                list3 = list;
                f3 = f;
            }
            position += readInt;
            i12 = i2;
            i13 = i3;
            stsdData2 = stsdData;
            str4 = str;
            i14 = i8;
            drmInitData3 = drmInitData2;
            readUnsignedShort2 = i7;
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i30 = readUnsignedShort2;
        List<byte[]> list5 = list3;
        float f4 = f3;
        int i31 = i16;
        int i32 = i17;
        if (str5 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str5).setCodecs(str6).setWidth(readUnsignedShort).setHeight(i30).setPixelWidthHeightRatio(f4).setRotationDegrees(i5).setProjectionData(bArr).setStereoMode(i18).setInitializationData(list5).setDrmInitData(drmInitData4).setColorInfo(new ColorInfo.Builder().setColorSpace(i32).setColorRange(i15).setColorTransfer(i31).setHdrStaticInfo(byteBuffer != null ? byteBuffer.array() : null).setLumaBitdepth(i19).setChromaBitdepth(i20).build());
        if (esdsData != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0155, code lost:
        if (r8 == (-1)) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, androidx.media3.common.DrmInitData r30, androidx.media3.extractor.mp4.AtomParsers.StsdData r31, int r32) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.AtomParsers.parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, readUnsignedInt2 > 0 ? readUnsignedInt2 : -1L, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        int i4 = 0;
        int i5 = -1;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i5 = i3;
                i4 = readInt;
            }
            i3 += readInt;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
            ExtractorUtil.checkContainerInput(i5 != -1, "schi atom is mandatory");
            TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i5, i4, str);
            ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
            return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i3 = 0;
                    i4 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = (readUnsignedByte & 240) >> 4;
                    i4 = readUnsignedByte & 15;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i3, i4, bArr);
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long readUnsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                readUnsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                readUnsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = readUnsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StsdData {
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & PrivateKeyType.INVALID;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
