package androidx.collection;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(C8627dsp c8627dsp) {
        this();
    }

    public final int getCapacity() {
        return this._capacity;
    }

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            String str = (i2 & 2) != 0 ? "" : charSequence2;
            String str2 = (i2 & 4) == 0 ? charSequence3 : "";
            if ((i2 & 8) != 0) {
                i = -1;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            return longSet.joinToString(charSequence, str, str2, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        long[] jArr;
        long[] jArr2;
        int i2;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) charSequence3, "");
        C8632dsu.c((Object) charSequence4, "");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr3 = this.elements;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr4[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            jArr2 = jArr4;
                            i2 = length;
                            long j2 = jArr3[(i3 << 3) + i7];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(j2);
                            i4++;
                        } else {
                            jArr2 = jArr4;
                            i2 = length;
                        }
                        j >>= 8;
                        i7++;
                        i5 = 8;
                        jArr4 = jArr2;
                        length = i2;
                    }
                    jArr = jArr4;
                    int i8 = length;
                    if (i6 != i5) {
                        break;
                    }
                    length = i8;
                } else {
                    jArr = jArr4;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr4 = jArr;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LongSet) {
            LongSet longSet = (LongSet) obj;
            if (longSet._size != this._size) {
                return false;
            }
            long[] jArr = this.elements;
            long[] jArr2 = this.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128 && !longSet.contains(jArr[(i << 3) + i3])) {
                                return false;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final boolean contains(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = this._capacity;
        int i3 = ((hashCode ^ (hashCode << 16)) >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = ((i & 127) * 72340172838076673L) ^ j2;
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.elements[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public int hashCode() {
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            i3 += Long.hashCode(jArr[(i2 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }
}
