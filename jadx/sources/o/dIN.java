package o;

import okio.ByteString;

/* loaded from: classes5.dex */
public final class dIN {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int b(char c) {
        return c(c);
    }

    public static final /* synthetic */ int b(byte[] bArr, int i) {
        return a(bArr, i);
    }

    public static final char[] b() {
        return a;
    }

    public static final void d(ByteString byteString, C7872dIo c7872dIo, int i, int i2) {
        C8632dsu.c((Object) byteString, "");
        C8632dsu.c((Object) c7872dIo, "");
        c7872dIo.e(byteString.c(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        if ('a' <= c && 'f' >= c) {
            return c - 'W';
        }
        if ('A' > c || 'F' < c) {
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }
        return c - '7';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(byte[] bArr, int i) {
        byte b;
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && 31 >= b2) || (Byte.MAX_VALUE <= b2 && 159 >= b2))) || b2 == 65533) {
                    return -1;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if ((b == 10 || b == 13 || ((b < 0 || 31 < b) && (Byte.MAX_VALUE > b || 159 < b))) && b != 65533) {
                            i4 += b < 65536 ? 1 : 2;
                        }
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length <= i7) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b3 = bArr[i7];
                if ((b3 & 192) != 128) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i8 = (b2 << 6) ^ (b3 ^ 3968);
                if (i8 < 128) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                } else if (i5 == i) {
                    return i4;
                } else {
                    if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && 31 >= i8) || (127 <= i8 && 159 >= i8))) || i8 == 65533) {
                        return -1;
                    }
                    i4 += i8 < 65536 ? 1 : 2;
                    dpR dpr = dpR.c;
                    i3 += 2;
                    i5++;
                }
            } else {
                if ((b2 >> 4) == -2) {
                    int i9 = i3 + 2;
                    if (length <= i9) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & 192) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b5 = bArr[i9];
                    if ((b5 & 192) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i10 = (b2 << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                    if (i10 < 2048) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else if (55296 <= i10 && 57343 >= i10) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else {
                        i2 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && 31 >= i10) || (127 <= i10 && 159 >= i10))) || i10 == 65533) {
                            return -1;
                        }
                        i4 += i10 < 65536 ? 1 : 2;
                        dpR dpr2 = dpR.c;
                        i3 += 3;
                    }
                } else if ((b2 >> 3) != -2) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                } else {
                    int i11 = i3 + 3;
                    if (length <= i11) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & 192) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i3 + 2];
                    if ((b7 & 192) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i11];
                    if ((b8 & 192) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i12 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                    if (i12 > 1114111) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else if (55296 <= i12 && 57343 >= i12) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else if (i12 < 65536) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else {
                        i2 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && 31 >= i12) || (127 <= i12 && 159 >= i12))) || i12 == 65533) {
                            return -1;
                        }
                        i4 += i12 < 65536 ? 1 : 2;
                        dpR dpr3 = dpR.c;
                        i3 += 4;
                    }
                }
                i5 = i2;
            }
        }
        return i4;
    }
}
