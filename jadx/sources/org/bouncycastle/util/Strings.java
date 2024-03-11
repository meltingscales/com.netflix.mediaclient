package org.bouncycastle.util;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.bouncycastle.util.encoders.UTF8;

/* loaded from: classes5.dex */
public final class Strings {
    private static String LINE_SEPARATOR;

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty("line.separator");
                    }
                });
            } catch (Exception unused) {
                LINE_SEPARATOR = "\n";
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = String.format("%n", new Object[0]);
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int transcodeToUTF16 = UTF8.transcodeToUTF16(bArr, cArr);
        if (transcodeToUTF16 >= 0) {
            return new String(cArr, 0, transcodeToUTF16);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < cArr.length) {
            char c = cArr[i5];
            if (c >= 128) {
                if (c < 2048) {
                    i3 = (c >> 6) | 192;
                    i4 = c;
                } else {
                    if (c < 55296 || c > 57343) {
                        i = (c >> 12) | 224;
                        i2 = c;
                    } else {
                        i5++;
                        if (i5 >= cArr.length) {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        char c2 = cArr[i5];
                        if (c > 56319) {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        int i6 = (((c & 1023) << 10) | (c2 & 1023)) + AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
                        outputStream.write((i6 >> 18) | 240);
                        i = ((i6 >> 12) & 63) | 128;
                        i2 = i6;
                    }
                    outputStream.write(i);
                    i3 = ((i2 >> 6) & 63) | 128;
                    i4 = i2;
                }
                outputStream.write(i3);
                c = (i4 & 63) | 128;
            }
            outputStream.write(c);
            i5++;
        }
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
