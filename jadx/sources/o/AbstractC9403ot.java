package o;

/* renamed from: o.ot  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC9403ot extends AbstractC9399op {
    private boolean b(char c) {
        return '0' <= c && c <= '9';
    }

    abstract long b();

    abstract long b(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    abstract long c();

    abstract long e();

    abstract long e(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    private long e(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z3;
        int i9;
        int compare;
        int e;
        int i10 = i3;
        int i11 = -1;
        int i12 = i;
        long j2 = 0;
        char c2 = 0;
        boolean z4 = false;
        while (true) {
            c = '.';
            if (i12 >= i10) {
                break;
            }
            c2 = charSequence.charAt(i12);
            if (!b(c2)) {
                if (c2 != '.') {
                    break;
                }
                z4 |= i11 >= 0;
                int i13 = i12;
                while (i13 < i10 - 8 && (e = e(charSequence, i13 + 1)) >= 0) {
                    j2 = (j2 * 100000000) + e;
                    i13 += 8;
                }
                int i14 = i12;
                i12 = i13;
                i11 = i14;
            } else {
                j2 = ((j2 * 10) + c2) - 48;
            }
            i12++;
        }
        if (i11 < 0) {
            i6 = i12 - i;
            i5 = i12;
            i4 = 0;
        } else {
            i4 = (i11 - i12) + 1;
            i5 = i11;
            i6 = (i12 - i) - 1;
        }
        if (c2 == 'e' || c2 == 'E') {
            i7 = i12 + 1;
            char charAt = i7 < i10 ? charSequence.charAt(i7) : (char) 0;
            boolean z5 = charAt == '-';
            if (z5 || charAt == '+') {
                i7 = i12 + 2;
                charAt = i7 < i10 ? charSequence.charAt(i7) : (char) 0;
            }
            z4 |= !b(charAt);
            i8 = 0;
            while (true) {
                if (i8 < 1024) {
                    i8 = ((i8 * 10) + charAt) - 48;
                }
                i7++;
                charAt = i7 < i10 ? charSequence.charAt(i7) : (char) 0;
                if (!b(charAt)) {
                    break;
                }
                i10 = i3;
            }
            if (z5) {
                i8 = -i8;
            }
            i4 += i8;
            c2 = charAt;
        } else {
            i7 = i12;
            i8 = 0;
        }
        if (i7 < i10 && (c2 == 'd' || c2 == 'D' || c2 == 'f' || c2 == 'F')) {
            i7++;
        }
        int a = a(charSequence, i7, i10);
        if (z4 || a < i10) {
            return -1L;
        }
        if (z2 || i6 != 0) {
            if (i6 > 19) {
                int i15 = i;
                long j3 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    char charAt2 = charSequence.charAt(i15);
                    if (charAt2 != c) {
                        compare = Long.compare(j3 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE);
                        if (compare >= 0) {
                            break;
                        }
                        j3 = ((j3 * 10) + charAt2) - 48;
                    } else {
                        i16++;
                    }
                    i15++;
                    c = '.';
                }
                z3 = i15 < i12;
                j = j3;
                i9 = (i5 - i15) + i16 + i8;
            } else {
                j = j2;
                z3 = false;
                i9 = 0;
            }
            return b(charSequence, i2, i3, z, j, i4, z3, i9);
        }
        return -1L;
    }

    public long d(CharSequence charSequence, int i, int i2) {
        int a;
        int i3;
        int i4 = i + i2;
        if (i < 0 || i4 > charSequence.length() || (a = a(charSequence, i, i4)) == i4) {
            return -1L;
        }
        char charAt = charSequence.charAt(a);
        boolean z = charAt == '-';
        if (z || charAt == '+') {
            a++;
            charAt = a < i4 ? charSequence.charAt(a) : (char) 0;
            if (charAt == 0) {
                return -1L;
            }
        }
        if (charAt >= 'I') {
            if (charAt == 'N') {
                return b(charSequence, a, i4);
            }
            return d(charSequence, a, i4, z);
        }
        boolean z2 = charAt == '0';
        if (z2) {
            int i5 = a + 1;
            char charAt2 = i5 < i4 ? charSequence.charAt(i5) : (char) 0;
            if (charAt2 == 'x' || charAt2 == 'X') {
                return e(charSequence, a + 2, i, i4, z);
            }
            i3 = i5;
        } else {
            i3 = a;
        }
        return e(charSequence, i3, i, i4, z, z2);
    }

    private long e(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int min;
        long j;
        boolean z2;
        int i4;
        char c;
        int i5;
        int i6;
        long j2;
        int i7;
        boolean z3;
        int compare;
        int i8 = i;
        long j3 = 0;
        int i9 = -1;
        char c2 = 0;
        boolean z4 = false;
        while (true) {
            if (i8 >= i3) {
                break;
            }
            c2 = charSequence.charAt(i8);
            byte b = c2 > 127 ? (byte) -1 : AbstractC9399op.e[c2];
            if (b < 0) {
                if (b != -4) {
                    break;
                }
                z4 |= i9 >= 0;
                i9 = i8;
            } else {
                j3 = (j3 << 4) | b;
            }
            i8++;
        }
        int i10 = i8 - i;
        if (i9 < 0) {
            i9 = i8;
            min = 0;
        } else {
            i10--;
            min = Math.min((i9 - i8) + 1, 1024) * 4;
        }
        boolean z5 = c2 == 'p' || c2 == 'P';
        if (z5) {
            i6 = i8 + 1;
            c = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            boolean z6 = c == '-';
            if (z6 || c == '+') {
                i6 = i8 + 2;
                c = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            }
            boolean b2 = b(c);
            j = j3;
            int i11 = 0;
            do {
                if (i11 < 1024) {
                    i11 = ((i11 * 10) + c) - 48;
                }
                z2 = true;
                i6++;
                c = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            } while (b(c));
            if (z6) {
                i11 = -i11;
            }
            z4 |= !b2;
            i5 = i11;
            i4 = min + i11;
        } else {
            j = j3;
            z2 = true;
            i4 = min;
            c = c2;
            i5 = 0;
            i6 = i8;
        }
        if (i6 < i3 && (c == 'd' || c == 'D' || c == 'f' || c == 'F')) {
            i6++;
        }
        int a = a(charSequence, i6, i3);
        if (z4 || a < i3 || i10 == 0 || !z5) {
            return -1L;
        }
        if (i10 > 16) {
            int i12 = i;
            long j4 = 0;
            int i13 = 0;
            while (i12 < i8) {
                char charAt = charSequence.charAt(i12);
                byte b3 = charAt > 127 ? (byte) -1 : AbstractC9399op.e[charAt];
                if (b3 >= 0) {
                    compare = Long.compare(j4 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE);
                    if (compare >= 0) {
                        break;
                    }
                    j4 = (j4 << 4) | b3;
                } else {
                    i13++;
                }
                i12++;
            }
            j2 = j4;
            z3 = i12 < i8 ? z2 : false;
            a = i12;
            i7 = i13;
        } else {
            j2 = j;
            i7 = 0;
            z3 = false;
        }
        return e(charSequence, i2, i3, z, j2, i4, z3, (i9 - a) + i7 + i5);
    }

    private long d(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i + 7;
        if (i3 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i3) == 'y' && a(charSequence, i + 8, i2) == i2) {
            return z ? b() : e();
        }
        return -1L;
    }

    private long b(CharSequence charSequence, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i3) == 'N' && a(charSequence, i + 3, i2) == i2) {
            return c();
        }
        return -1L;
    }

    private int a(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    private int e(CharSequence charSequence, int i) {
        return C9405ov.b(charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32) | (charSequence.charAt(i + 3) << 48), (charSequence.charAt(i + 7) << 48) | (charSequence.charAt(i + 5) << 16) | charSequence.charAt(i + 4) | (charSequence.charAt(i + 6) << 32));
    }
}
