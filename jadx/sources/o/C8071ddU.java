package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: o.ddU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8071ddU {
    private static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] h = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i) {
        return (i & 16) == 16 ? h : (i & 32) == 32 ? b : c;
    }

    private static final byte[] e(int i) {
        return (i & 16) == 16 ? a : (i & 32) == 32 ? e : d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] c(byte[] bArr, byte[] bArr2, int i, int i2) {
        e(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    private static byte[] e(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] e2 = e(i4);
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = e2[i5 >>> 18];
            bArr2[i3 + 1] = e2[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = e2[i5 >>> 18];
            bArr2[i3 + 1] = e2[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = e2[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = e2[i5 >>> 18];
            bArr2[i3 + 1] = e2[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = e2[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = e2[i5 & 63];
            return bArr2;
        }
    }

    public static String b(byte[] bArr) {
        return d(bArr, 0, bArr.length, 0);
    }

    public static String e(byte[] bArr, int i) {
        return d(bArr, 0, bArr.length, i);
    }

    public static String d(byte[] bArr, int i, int i2, int i3) {
        byte[] c2 = c(bArr, i, i2, i3);
        try {
            return new String(c2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(c2);
        }
    }

    public static byte[] c(byte[] bArr, int i, int i2, int i3) {
        b bVar;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        } else if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        } else if ((i3 & 2) != 0) {
            OutputStream outputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    b bVar2 = new b(byteArrayOutputStream2, i3 | 1);
                    try {
                        gZIPOutputStream2 = new GZIPOutputStream(bVar2);
                        try {
                            gZIPOutputStream2.write(bArr, i, i2);
                            gZIPOutputStream2.close();
                            try {
                                gZIPOutputStream2.close();
                            } catch (Exception unused) {
                            }
                            try {
                                bVar2.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused3) {
                            }
                            return byteArrayOutputStream2.toByteArray();
                        } catch (IOException e2) {
                            e = e2;
                            outputStream = bVar2;
                            gZIPOutputStream = gZIPOutputStream2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            bVar = outputStream;
                            outputStream = gZIPOutputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    outputStream.close();
                                } catch (Exception unused4) {
                                }
                                try {
                                    bVar.close();
                                } catch (Exception unused5) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused6) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = gZIPOutputStream2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            bVar = bVar2;
                            outputStream.close();
                            bVar.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        gZIPOutputStream2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    gZIPOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    bVar = null;
                }
            } catch (IOException e5) {
                e = e5;
                bVar = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bVar = null;
                byteArrayOutputStream = null;
            }
        } else {
            boolean z = (i3 & 8) != 0;
            int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
            if (z) {
                i4 += i4 / 76;
            }
            int i5 = i4;
            byte[] bArr2 = new byte[i5];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i2 - 2) {
                e(bArr, i6 + i, 3, bArr2, i7, i3);
                int i9 = i8 + 4;
                if (!z || i9 < 76) {
                    i8 = i9;
                } else {
                    bArr2[i7 + 4] = 10;
                    i7++;
                    i8 = 0;
                }
                i6 += 3;
                i7 += 4;
            }
            if (i6 < i2) {
                e(bArr, i6 + i, i2 - i6, bArr2, i7, i3);
                i7 += 4;
            }
            int i10 = i7;
            if (i10 <= i5 - 1) {
                byte[] bArr3 = new byte[i10];
                System.arraycopy(bArr2, 0, bArr3, 0, i10);
                return bArr3;
            }
            return bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr != null) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Destination array was null.");
            }
            if (i < 0 || (i4 = i + 3) >= bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
            }
            if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
            }
            byte[] c2 = c(i3);
            byte b2 = bArr[i + 2];
            if (b2 == 61) {
                bArr2[i2] = (byte) ((((c2[bArr[i + 1]] & 255) << 12) | ((c2[bArr[i]] & 255) << 18)) >>> 16);
                return 1;
            }
            byte b3 = bArr[i4];
            if (b3 == 61) {
                int i6 = ((c2[bArr[i + 1]] & 255) << 12) | ((c2[bArr[i]] & 255) << 18) | ((c2[b2] & 255) << 6);
                bArr2[i2] = (byte) (i6 >>> 16);
                bArr2[i2 + 1] = (byte) (i6 >>> 8);
                return 2;
            }
            int i7 = ((c2[bArr[i + 1]] & 255) << 12) | ((c2[bArr[i]] & 255) << 18) | ((c2[b2] & 255) << 6) | (c2[b3] & 255);
            bArr2[i2] = (byte) (i7 >> 16);
            bArr2[i2 + 1] = (byte) (i7 >> 8);
            bArr2[i5] = (byte) i7;
            return 3;
        }
        throw new IllegalArgumentException("Source array was null.");
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$");
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot decode null source array.");
        }
        if (i < 0 || (i4 = i + i2) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return new byte[0];
        }
        if (i2 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
        }
        byte[] c2 = c(i3);
        byte[] bArr2 = new byte[(i2 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i5 = 0;
        int i6 = 0;
        while (i < i4) {
            byte b2 = bArr[i];
            byte b3 = c2[b2 & 255];
            if (b3 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(b2 & 255), Integer.valueOf(i)));
            }
            if (b3 >= -1) {
                int i7 = i6 + 1;
                bArr3[i6] = b2;
                if (i7 > 3) {
                    i5 += a(bArr3, 0, bArr2, i5, i3);
                    if (bArr[i] == 61) {
                        break;
                    }
                    i6 = 0;
                } else {
                    i6 = i7;
                }
            }
            i++;
        }
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr4, 0, i5);
        return bArr4;
    }

    public static byte[] d(String str) {
        return c(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] c(String str, int i) {
        byte[] bytes;
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        if (str == null) {
            throw new IllegalArgumentException("Input string was null.");
        }
        try {
            bytes = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] b2 = b(bytes, 0, bytes.length, i);
        boolean z = (i & 4) != 0;
        if (b2 == null || b2.length < 4 || z || 35615 != ((b2[0] & 255) | ((b2[1] << 8) & 65280))) {
            return b2;
        }
        byte[] bArr = new byte[2048];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayInputStream = new ByteArrayInputStream(b2);
                try {
                    GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                    while (true) {
                        try {
                            int read = gZIPInputStream2.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = gZIPInputStream2;
                            gZIPInputStream = byteArrayOutputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Exception unused3) {
                            }
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused4) {
                            }
                            throw th;
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        gZIPInputStream2.close();
                    } catch (Exception unused6) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused7) {
                    }
                    return byteArray;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = 0;
            byteArrayInputStream = null;
        }
    }

    /* renamed from: o.ddU$b */
    /* loaded from: classes5.dex */
    public static class b extends FilterOutputStream {
        private int a;
        private byte[] b;
        private byte[] c;
        private boolean d;
        private byte[] e;
        private int f;
        private boolean g;
        private int h;
        private boolean i;
        private int j;

        public b(OutputStream outputStream, int i) {
            super(outputStream);
            this.d = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.i = z;
            int i2 = z ? 3 : 4;
            this.a = i2;
            this.e = new byte[i2];
            this.j = 0;
            this.f = 0;
            this.g = false;
            this.b = new byte[4];
            this.h = i;
            this.c = C8071ddU.c(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) {
            if (this.g) {
                ((FilterOutputStream) this).out.write(i);
            } else if (this.i) {
                byte[] bArr = this.e;
                int i2 = this.j;
                int i3 = i2 + 1;
                this.j = i3;
                bArr[i2] = (byte) i;
                int i4 = this.a;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(C8071ddU.c(this.b, bArr, i4, this.h));
                    int i5 = this.f + 4;
                    this.f = i5;
                    if (this.d && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.f = 0;
                    }
                    this.j = 0;
                }
            } else {
                byte b = this.c[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.e;
                int i6 = this.j;
                int i7 = i6 + 1;
                this.j = i7;
                bArr2[i6] = (byte) i;
                if (i7 >= this.a) {
                    ((FilterOutputStream) this).out.write(this.b, 0, C8071ddU.a(bArr2, 0, this.b, 0, this.h));
                    this.j = 0;
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (this.g) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }

        public void e() {
            int i = this.j;
            if (i > 0) {
                if (this.i) {
                    ((FilterOutputStream) this).out.write(C8071ddU.c(this.b, this.e, i, this.h));
                    this.j = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            e();
            super.close();
            this.e = null;
            ((FilterOutputStream) this).out = null;
        }
    }
}
