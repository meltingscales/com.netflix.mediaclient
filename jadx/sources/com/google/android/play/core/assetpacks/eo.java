package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import o.C9580sM;

/* loaded from: classes5.dex */
final class eo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final com.google.android.play.core.assetpacks.internal.o a;
    private static int[] b$s52$189 = null;
    private static int i = 0;
    private static int j = 1;
    private final bh c;
    private final String d;
    private final int e;
    private final long f;
    private final String g;
    private final byte[] b = new byte[8192];
    private int h = -1;

    static {
        d();
        a = new com.google.android.play.core.assetpacks.internal.o("SliceMetadataManager");
        int i2 = i + 67;
        j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public eo(bh bhVar, String str, int i2, long j2, String str2) {
        this.c = bhVar;
        this.d = str;
        this.e = i2;
        this.f = j2;
        this.g = str2;
    }

    static void d() {
        b$s52$189 = new int[]{1685252468, -281147683, 1509822831, -1848697234, -639653102, -1285200061, 1121413147, 1407377294, 214891945, 1992822212, -153227288, 1388205460, 128238662, 1159846694, -255699823, 942476797, 20659293, -1973586584};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File c() {
        int i2 = 2 % 2;
        File file = new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.h)));
        int i3 = j + 109;
        i = i3 % 128;
        int i4 = i3 % 2;
        return file;
    }

    private final File n() {
        int i2 = 2 % 2;
        File o2 = this.c.o(this.d, this.e, this.f, this.g);
        if (!o2.exists()) {
            int i3 = i + 7;
            j = i3 % 128;
            if (i3 % 2 != 0) {
                o2.mkdirs();
            } else {
                o2.mkdirs();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = j + 103;
        i = i4 % 128;
        int i5 = i4 % 2;
        return o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i2 = 2 % 2;
        int i3 = j + 37;
        i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.n(this.d, this.e, this.f, this.g).exists();
            obj.hashCode();
            throw null;
        }
        File n = this.c.n(this.d, this.e, this.f, this.g);
        if (n.exists()) {
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) != 4) {
                    if (properties.getProperty("previousChunk") != null) {
                        return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                    }
                    throw new ck("Slice checkpoint file corrupt.");
                }
                int i4 = i + 63;
                j = i4 % 128;
                if (i4 % 2 != 0) {
                    return -1;
                }
                throw null;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j2, byte[] bArr, int i2, int i3) {
        int i4 = 2 % 2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
            int i5 = i + 41;
            j = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(byte[] bArr) {
        int i2 = 2 % 2;
        this.h++;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.h))));
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                int i3 = j + 101;
                i = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 30 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (IOException e2) {
            throw new ck("Could not write metadata file.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(byte[] bArr, int i2, int i3) {
        int i4 = 2 % 2;
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i3);
            fileOutputStream.close();
            int i5 = j + 41;
            i = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        int i2 = 2 % 2;
        int i3 = i + 67;
        j = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.n(this.d, this.e, this.f, this.g).exists();
            throw null;
        }
        File n = this.c.n(this.d, this.e, this.f, this.g);
        if (n.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(n);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    return false;
                } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                    int i4 = i + 103;
                    j = i4 % 128;
                    return i4 % 2 != 0;
                } else {
                    int i5 = j + 11;
                    i = i5 % 128;
                    if (i5 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
            } catch (IOException e) {
                a.b("Could not read checkpoint while checking if extraction finished. %s", e);
            }
        }
        return false;
    }

    private final File o() {
        int i2 = 2 % 2;
        int i3 = j + 69;
        i = i3 % 128;
        int i4 = i3 % 2;
        File n = this.c.n(this.d, this.e, this.f, this.g);
        n.getParentFile().mkdirs();
        n.createNewFile();
        int i5 = i + 5;
        j = i5 % 128;
        if (i5 % 2 != 0) {
            return n;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(InputStream inputStream, long j2) {
        int read;
        int i2 = 2 % 2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j2);
            do {
                read = inputStream.read(this.b);
                if (read > 0) {
                    int i3 = j + 89;
                    i = i3 % 128;
                    if (i3 % 2 != 0) {
                        randomAccessFile.write(this.b, 1, read);
                    } else {
                        randomAccessFile.write(this.b, 0, read);
                    }
                }
            } while (read == 8192);
            int i4 = j + 57;
            i = i4 % 128;
            int i5 = i4 % 2;
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i2) {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            int i4 = i + 1;
            j = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(byte[] bArr, InputStream inputStream) {
        int i2 = 2 % 2;
        this.h++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.b);
            while (read > 0) {
                int i3 = i + 117;
                j = i3 % 128;
                if (i3 % 2 == 0) {
                    fileOutputStream.write(this.b, 1, read);
                    read = inputStream.read(this.b);
                } else {
                    fileOutputStream.write(this.b, 0, read);
                    read = inputStream.read(this.b);
                }
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                int i4 = i + 43;
                j = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i2) {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            int i4 = j + 75;
            i = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(byte[] bArr, int i2) {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        Object obj = null;
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File m = this.c.m(this.d, this.e, this.f, this.g);
            if (m.exists()) {
                int i4 = i + 47;
                j = i4 % 128;
                if (i4 % 2 == 0) {
                    m.delete();
                    obj.hashCode();
                    throw null;
                }
                m.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(m);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                int i5 = i + 3;
                j = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str, long j2, long j3, int i2) {
        int i3 = 2 % 2;
        Properties properties = new Properties();
        Object[] objArr = new Object[1];
        q(1, new int[]{-1000131214, 502266567}, objArr);
        properties.put("fileStatus", ((String) objArr[0]).intern());
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            int i4 = j + 9;
            i = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final em b() {
        int i2 = 2 % 2;
        int i3 = i + 47;
        j = i3 % 128;
        int i4 = i3 % 2;
        File n = this.c.n(this.d, this.e, this.f, this.g);
        if (!n.exists()) {
            throw new ck("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(n);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new ck("Slice checkpoint file corrupt.");
            }
            try {
                int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                bp bpVar = new bp(parseInt, property, parseLong, parseLong2, parseInt2);
                int i5 = i + 107;
                j = i5 % 128;
                int i6 = i5 % 2;
                return bpVar;
            } catch (NumberFormatException e) {
                throw new ck("Slice checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    private static void q(int i2, int[] iArr, Object[] objArr) {
        int i3 = 2 % 2;
        C9580sM c9580sM = new C9580sM();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b$s52$189;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr3[i4] = (int) (iArr2[i4] ^ 8179569925890482642L);
            }
            int i5 = $10 + 69;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b$s52$189;
        if (iArr5 != null) {
            int i7 = $11 + 45;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i9 = 0; i9 < length3; i9++) {
                iArr6[i9] = (int) (iArr5[i9] ^ 8179569925890482642L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        c9580sM.a = 0;
        while (c9580sM.a < iArr.length) {
            cArr[0] = (char) (iArr[c9580sM.a] >> 16);
            cArr[1] = (char) iArr[c9580sM.a];
            cArr[2] = (char) (iArr[c9580sM.a + 1] >> 16);
            cArr[3] = (char) iArr[c9580sM.a + 1];
            c9580sM.b = (cArr[0] << 16) + cArr[1];
            c9580sM.e = (cArr[2] << 16) + cArr[3];
            C9580sM.e(iArr4);
            int i10 = $11 + 77;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = $10 + 89;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                c9580sM.b ^= iArr4[i12];
                c9580sM.e = C9580sM.e(c9580sM.b) ^ c9580sM.e;
                int i15 = c9580sM.b;
                c9580sM.b = c9580sM.e;
                c9580sM.e = i15;
            }
            int i16 = c9580sM.b;
            c9580sM.b = c9580sM.e;
            c9580sM.e = i16;
            c9580sM.e ^= iArr4[16];
            c9580sM.b ^= iArr4[17];
            int i17 = c9580sM.b;
            int i18 = c9580sM.e;
            cArr[0] = (char) (c9580sM.b >>> 16);
            cArr[1] = (char) c9580sM.b;
            cArr[2] = (char) (c9580sM.e >>> 16);
            cArr[3] = (char) c9580sM.e;
            C9580sM.e(iArr4);
            cArr2[c9580sM.a * 2] = cArr[0];
            cArr2[(c9580sM.a * 2) + 1] = cArr[1];
            cArr2[(c9580sM.a * 2) + 2] = cArr[2];
            cArr2[(c9580sM.a * 2) + 3] = cArr[3];
            c9580sM.a += 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
