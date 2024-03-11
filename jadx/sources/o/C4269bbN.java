package o;

import androidx.media3.common.util.Util;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: o.bbN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4269bbN {
    private static final int d = Util.getIntegerCodeForString("sidx");

    /* renamed from: o.bbN$e */
    /* loaded from: classes3.dex */
    public static class e {
        private final long d;
        private final long e;

        e(long j, long j2) {
            this.e = j;
            this.d = j2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    static e a(String str) {
        Object e2;
        RandomAccessFile randomAccessFile;
        long j = -1;
        long j2 = 0;
        int i = -1;
        try {
            i = new File(str).exists();
            randomAccessFile = new RandomAccessFile(str, "r");
            try {
                j = randomAccessFile.length();
                while (true) {
                    int readInt = randomAccessFile.readInt();
                    if (randomAccessFile.readInt() == d) {
                        randomAccessFile.close();
                        C1044Mm.a("NetflixFMP4Parser", "sidx offset=%d size=%d", Long.valueOf(j2), Integer.valueOf(readInt));
                        return new e(readInt, j2);
                    }
                    randomAccessFile.skipBytes(readInt - 8);
                    j2 += readInt;
                }
            } catch (IOException e3) {
                e2 = e3;
                if (randomAccessFile != null) {
                    try {
                        C1044Mm.e("NetflixFMP4Parser", "closing RandomAccessFile");
                        randomAccessFile.close();
                    } catch (Exception e4) {
                        C1044Mm.e("NetflixFMP4Parser", "exception while closing RandomAccessFile:", e4);
                    }
                }
                C1044Mm.j("NetflixFMP4Parser", "ParseSidxInfo fileName=%s fileSize=%d offsetInFile=%d fileExists=%d exception=%s", str, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), e2);
                throw new Exception("filename=" + str + " fileSize=" + j + " offsetInFile=" + j2 + " fileExists=" + i + "  exception=" + e2);
            }
        } catch (IOException e5) {
            e2 = e5;
            randomAccessFile = null;
        }
    }

    public static boolean d(String str) {
        e eVar;
        try {
            eVar = a(str);
        } catch (Exception unused) {
            eVar = null;
        }
        return eVar == null;
    }
}
