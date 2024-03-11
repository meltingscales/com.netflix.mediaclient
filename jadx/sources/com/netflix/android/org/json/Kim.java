package com.netflix.android.org.json;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class Kim {
    private byte[] bytes;
    private int hashcode;
    public int length;
    private String string;

    public int hashCode() {
        return this.hashcode;
    }

    public Kim(byte[] bArr, int i, int i2) {
        this.bytes = null;
        this.string = null;
        this.hashcode = 0;
        int i3 = i2 - i;
        this.length = i3;
        if (i3 > 0) {
            this.bytes = new byte[i3];
            int i4 = 1;
            for (int i5 = 0; i5 < this.length; i5++) {
                int i6 = bArr[i5 + i] & 255;
                i4 += i6;
                this.hashcode += i4;
                this.bytes[i5] = (byte) i6;
            }
            this.hashcode += i4 << 16;
        }
    }

    public Kim(byte[] bArr, int i) {
        this(bArr, 0, i);
    }

    public Kim(Kim kim, int i, int i2) {
        this(kim.bytes, i, i2);
    }

    public Kim(String str) {
        int i;
        int i2;
        this.bytes = null;
        int i3 = 0;
        this.hashcode = 0;
        this.length = 0;
        this.string = null;
        int length = str.length();
        this.hashcode = 0;
        this.length = 0;
        if (length > 0) {
            int i4 = 0;
            while (i4 < length) {
                char charAt = str.charAt(i4);
                if (charAt <= 127) {
                    i2 = this.length + 1;
                } else if (charAt <= 16383) {
                    i2 = this.length + 2;
                } else {
                    if (charAt >= 55296 && charAt <= 57343) {
                        i4++;
                        char charAt2 = str.charAt(i4);
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            throw new JSONException("Bad UTF16");
                        }
                    }
                    this.length += 3;
                    i4++;
                }
                this.length = i2;
                i4++;
            }
            this.bytes = new byte[this.length];
            int i5 = 0;
            int i6 = 1;
            while (i3 < length) {
                int charAt3 = str.charAt(i3);
                if (charAt3 <= 127) {
                    this.bytes[i5] = (byte) charAt3;
                    i6 += charAt3;
                    this.hashcode += i6;
                    i5++;
                } else {
                    if (charAt3 <= 16383) {
                        int i7 = (charAt3 >>> 7) | 128;
                        byte[] bArr = this.bytes;
                        bArr[i5] = (byte) i7;
                        int i8 = i6 + i7;
                        int i9 = this.hashcode;
                        int i10 = charAt3 & 127;
                        bArr[i5 + 1] = (byte) i10;
                        i = i10 + i8;
                        this.hashcode = i9 + i8 + i;
                        i5 += 2;
                    } else {
                        if (charAt3 >= 55296 && charAt3 <= 56319) {
                            i3++;
                            charAt3 = (((charAt3 & 1023) << 10) | (str.charAt(i3) & 1023)) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                        }
                        int i11 = (charAt3 >>> 14) | 128;
                        byte[] bArr2 = this.bytes;
                        bArr2[i5] = (byte) i11;
                        int i12 = i6 + i11;
                        int i13 = this.hashcode;
                        int i14 = ((charAt3 >>> 7) & PrivateKeyType.INVALID) | 128;
                        bArr2[i5 + 1] = (byte) i14;
                        int i15 = i14 + i12;
                        int i16 = charAt3 & 127;
                        bArr2[i5 + 2] = (byte) i16;
                        i = i16 + i15;
                        this.hashcode = i13 + i12 + i15 + i;
                        i5 += 3;
                    }
                    i6 = i;
                }
                i3++;
            }
            this.hashcode += i6 << 16;
        }
    }

    public int characterAt(int i) {
        int i2 = get(i);
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = get(i + 1);
        if ((i3 & 128) == 0) {
            int i4 = ((i2 & 127) << 7) | i3;
            if (i4 > 127) {
                return i4;
            }
        } else {
            int i5 = get(i + 2);
            int i6 = ((i2 & 127) << 14) | ((i3 & 127) << 7) | i5;
            if ((i5 & 128) == 0 && i6 > 16383 && i6 <= 1114111 && (i6 < 55296 || i6 > 57343)) {
                return i6;
            }
        }
        throw new JSONException("Bad character at " + i);
    }

    public static int characterSize(int i) {
        if (i >= 0 && i <= 1114111) {
            if (i <= 127) {
                return 1;
            }
            return i <= 16383 ? 2 : 3;
        }
        throw new JSONException("Bad character " + i);
    }

    public int copy(byte[] bArr, int i) {
        System.arraycopy(this.bytes, 0, bArr, i, this.length);
        return i + this.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Kim) {
            Kim kim = (Kim) obj;
            if (this == kim) {
                return true;
            }
            if (this.hashcode != kim.hashcode) {
                return false;
            }
            return Arrays.equals(this.bytes, kim.bytes);
        }
        return false;
    }

    public int get(int i) {
        if (i < 0 || i > this.length) {
            throw new JSONException("Bad character at " + i);
        }
        return this.bytes[i] & 255;
    }

    public String toString() {
        if (this.string == null) {
            char[] cArr = new char[this.length];
            int i = 0;
            int i2 = 0;
            while (i < this.length) {
                int characterAt = characterAt(i);
                if (characterAt < 65536) {
                    cArr[i2] = (char) characterAt;
                    i2++;
                } else {
                    cArr[i2] = (char) (((characterAt - AleCryptoBouncyCastle.MAX_RANDOM_BYTES) >>> 10) | 55296);
                    cArr[i2 + 1] = (char) ((characterAt & 1023) | 56320);
                    i2 += 2;
                }
                i += characterSize(characterAt);
            }
            this.string = new String(cArr, 0, i2);
        }
        return this.string;
    }
}
