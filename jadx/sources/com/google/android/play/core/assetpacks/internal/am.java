package com.google.android.play.core.assetpacks.internal;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class am {
    public static long a(an anVar, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            throw new al("Unexpected magic=".concat(String.valueOf(String.format("%x", Integer.valueOf(readInt)))));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            throw new al("Unexpected version=" + read);
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return j2;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 != -1) {
                            b(bArr, anVar, outputStream, readUnsignedShort, read2, j3);
                            break;
                        } else {
                            throw new IOException("Unexpected end of patch");
                        }
                    case 250:
                        read2 = dataInputStream.readUnsignedShort();
                        b(bArr, anVar, outputStream, dataInputStream.readUnsignedShort(), read2, j3);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, dataInputStream.readUnsignedShort(), read2, j3);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 != -1) {
                            b(bArr, anVar, outputStream, readInt2, read2, j3);
                            break;
                        } else {
                            throw new IOException("Unexpected end of patch");
                        }
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        b(bArr, anVar, outputStream, dataInputStream.readInt(), read2, j3);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, dataInputStream.readInt(), read2, j3);
                        break;
                    case PrivateKeyType.INVALID /* 255 */:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, readLong, read2, j3);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                }
                j2 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    private static void b(byte[] bArr, an anVar, OutputStream outputStream, long j, int i, long j2) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 <= j2) {
            try {
                InputStream c = new ao(anVar, j, j3).c();
                while (i > 0) {
                    int min = Math.min(i, 16384);
                    int i2 = 0;
                    while (i2 < min) {
                        int read = c.read(bArr, i2, min - i2);
                        if (read == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i2 += read;
                    }
                    outputStream.write(bArr, 0, min);
                    i -= min;
                }
                c.close();
                return;
            } catch (EOFException e) {
                throw new IOException("patch underrun", e);
            }
        }
        throw new IOException("Output length overrun");
    }

    private static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int min = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
