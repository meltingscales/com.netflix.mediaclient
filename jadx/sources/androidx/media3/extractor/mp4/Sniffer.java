package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes5.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean sniffFragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, true, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput, boolean z) {
        return sniffInternal(extractorInput, false, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int, boolean] */
    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        int i;
        int i2;
        boolean z6;
        boolean z7;
        long length = extractorInput.getLength();
        long j2 = -1;
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i3 != 0 && length <= 4096) {
            j3 = length;
        }
        int i4 = (int) j3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        ?? r8 = 0;
        int i5 = 0;
        boolean z8 = false;
        while (i5 < i4) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), r8, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i = 16;
                parsableByteArray.setLimit(16);
                j = parsableByteArray.readLong();
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j2) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                j = readUnsignedInt;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                return r8;
            }
            i5 += i;
            if (readInt == 1836019574) {
                i4 += (int) j;
                if (i3 != 0 && i4 > length) {
                    i4 = (int) length;
                }
                z6 = r8;
            } else if (readInt == 1836019558 || readInt == 1836475768) {
                z3 = r8;
                z4 = true;
                z5 = true;
                break;
            } else {
                if (readInt == 1835295092) {
                    i2 = readInt;
                    z8 = true;
                } else {
                    i2 = readInt;
                }
                if ((i5 + j) - j4 >= i4) {
                    z5 = false;
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i6 = (int) (j - j4);
                i5 += i6;
                if (i2 != 1718909296) {
                    z6 = false;
                    if (i6 != 0) {
                        extractorInput.advancePeekPosition(i6);
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    parsableByteArray.reset(i6);
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            z7 = z8;
                            break;
                        }
                        if (i8 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt(), z2)) {
                            z7 = true;
                            break;
                        }
                        i8++;
                    }
                    z6 = false;
                    if (!z7) {
                        return false;
                    }
                    z8 = z7;
                }
            }
            r8 = z6;
            j2 = -1;
        }
        z3 = r8;
        z4 = true;
        z5 = z3;
        return (z8 && z == z5) ? z4 : z3;
    }

    private static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : COMPATIBLE_BRANDS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
