package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: o.dlf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8428dlf {
    private static final Map<MslConstants.CompressionAlgorithm, c> e = new ConcurrentHashMap();
    private static volatile int d = 200;

    /* renamed from: o.dlf$c */
    /* loaded from: classes5.dex */
    public interface c {
        byte[] b(byte[] bArr);

        byte[] c(byte[] bArr, int i);
    }

    static {
        e(MslConstants.CompressionAlgorithm.GZIP, new b());
        e(MslConstants.CompressionAlgorithm.LZW, new d());
    }

    /* renamed from: o.dlf$b */
    /* loaded from: classes5.dex */
    static class b implements c {
        private b() {
        }

        @Override // o.C8428dlf.c
        public byte[] b(byte[] bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        }

        @Override // o.C8428dlf.c
        public byte[] c(byte[] bArr, int i) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                int max = Math.max(bArr.length, 1024);
                byte[] bArr2 = new byte[max];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(max);
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read != -1) {
                        if (byteArrayOutputStream.size() + read > bArr.length * i) {
                            throw new IOException("Deflate ratio " + i + " exceeded. Aborting uncompression.");
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            } finally {
                gZIPInputStream.close();
            }
        }
    }

    /* renamed from: o.dlf$d */
    /* loaded from: classes5.dex */
    static class d implements c {
        private d() {
        }

        @Override // o.C8428dlf.c
        public byte[] b(byte[] bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            C8396dka c8396dka = new C8396dka(byteArrayOutputStream);
            try {
                c8396dka.write(bArr);
                c8396dka.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                c8396dka.close();
                throw th;
            }
        }

        @Override // o.C8428dlf.c
        public byte[] c(byte[] bArr, int i) {
            C8397dkb c8397dkb = new C8397dkb(new ByteArrayInputStream(bArr));
            try {
                int max = Math.max(bArr.length, 1024);
                byte[] bArr2 = new byte[max];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(max);
                while (true) {
                    int read = c8397dkb.read(bArr2);
                    if (read != -1) {
                        if (byteArrayOutputStream.size() + read > bArr.length * i) {
                            throw new IOException("Deflate ratio " + i + " exceeded. Aborting uncompression.");
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            } finally {
                c8397dkb.close();
            }
        }
    }

    public static void e(MslConstants.CompressionAlgorithm compressionAlgorithm, c cVar) {
        if (cVar == null) {
            e.remove(compressionAlgorithm);
        } else {
            e.put(compressionAlgorithm, cVar);
        }
    }

    public static byte[] e(MslConstants.CompressionAlgorithm compressionAlgorithm, byte[] bArr) {
        c cVar = e.get(compressionAlgorithm);
        if (cVar == null) {
            throw new MslException(C8373dje.cq, compressionAlgorithm.name());
        }
        try {
            byte[] b2 = cVar.b(bArr);
            if (b2 == null) {
                return null;
            }
            boolean z = b2.length > bArr.length;
            boolean z2 = b2.length * d < bArr.length;
            if (z || z2) {
                return null;
            }
            return b2;
        } catch (IOException e2) {
            C8373dje c8373dje = C8373dje.b;
            throw new MslException(c8373dje, "algo " + compressionAlgorithm.name(), e2);
        }
    }

    public static byte[] d(MslConstants.CompressionAlgorithm compressionAlgorithm, byte[] bArr) {
        c cVar = e.get(compressionAlgorithm);
        if (cVar == null) {
            throw new MslException(C8373dje.cq, compressionAlgorithm.name());
        }
        try {
            return cVar.c(bArr, d);
        } catch (IOException e2) {
            C8373dje c8373dje = C8373dje.bP;
            throw new MslException(c8373dje, "algo " + compressionAlgorithm.name(), e2);
        }
    }
}
