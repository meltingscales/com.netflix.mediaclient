package o;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.bqb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5005bqb {
    final C9823xJ d;

    /* renamed from: o.bqb$e */
    /* loaded from: classes4.dex */
    public class e {
        final long a;
        final long d;
        final String e;

        public long a() {
            return this.d;
        }

        public long d() {
            return this.a;
        }

        public String e() {
            return this.e;
        }

        public e(String str, long j, long j2) {
            this.a = j2;
            this.e = str;
            this.d = j;
        }
    }

    public C5005bqb(C9823xJ c9823xJ) {
        this.d = c9823xJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C5005bqb.e d(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "%s: %s"
            java.lang.String r1 = "VolleyCacheWrapper"
            o.xJ r2 = r13.d
            java.io.File r14 = r2.e(r14)
            boolean r2 = r14.exists()
            r3 = 0
            if (r2 == 0) goto Lab
            o.bqb$c r2 = new o.bqb$c     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            e(r2)     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            o.bqb$e r4 = new o.bqb$e     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            java.lang.String r7 = r14.getAbsolutePath()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            int r5 = o.C5005bqb.c.b(r2)     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            long r8 = (long) r5     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            long r5 = r14.length()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            int r10 = o.C5005bqb.c.b(r2)     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            long r10 = (long) r10     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            long r10 = r5 - r10
            r5 = r4
            r6 = r13
            r5.<init>(r7, r8, r10)     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L8c
            r2.close()     // Catch: java.io.IOException -> L3d
            goto L51
        L3d:
            r2 = move-exception
            java.lang.String r14 = r14.getAbsolutePath()
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r2}
            java.lang.String r14 = java.lang.String.format(r0, r14)
            o.C1044Mm.e(r1, r14)
        L51:
            return r4
        L52:
            r4 = move-exception
            goto L59
        L54:
            r2 = move-exception
            goto L90
        L56:
            r2 = move-exception
            r4 = r2
            r2 = r3
        L59:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L8c
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8c
            r6 = 1
            r5[r6] = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = java.lang.String.format(r0, r5)     // Catch: java.lang.Throwable -> L8c
            o.C1044Mm.e(r1, r4)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto Lab
            r2.close()     // Catch: java.io.IOException -> L77
            goto Lab
        L77:
            r2 = move-exception
            java.lang.String r14 = r14.getAbsolutePath()
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r2}
            java.lang.String r14 = java.lang.String.format(r0, r14)
            o.C1044Mm.e(r1, r14)
            goto Lab
        L8c:
            r3 = move-exception
            r12 = r3
            r3 = r2
            r2 = r12
        L90:
            if (r3 == 0) goto Laa
            r3.close()     // Catch: java.io.IOException -> L96
            goto Laa
        L96:
            r3 = move-exception
            java.lang.String r14 = r14.getAbsolutePath()
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r3}
            java.lang.String r14 = java.lang.String.format(r0, r14)
            o.C1044Mm.e(r1, r14)
        Laa:
            throw r2
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5005bqb.d(java.lang.String):o.bqb$e");
    }

    /* renamed from: o.bqb$c */
    /* loaded from: classes4.dex */
    static class c extends FilterInputStream {
        private int a;

        private c(InputStream inputStream) {
            super(inputStream);
            this.a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.a++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.a += read;
            }
            return read;
        }
    }

    private static void e(InputStream inputStream) {
        Map hashMap;
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        objectInputStream.readByte();
        objectInputStream.readUTF();
        objectInputStream.readUTF();
        objectInputStream.readLong();
        objectInputStream.readLong();
        objectInputStream.readLong();
        int readInt = objectInputStream.readInt();
        if (readInt == 0) {
            hashMap = Collections.emptyMap();
        } else {
            hashMap = new HashMap(readInt);
        }
        for (int i = 0; i < readInt; i++) {
            hashMap.put(objectInputStream.readUTF().intern(), objectInputStream.readUTF().intern());
        }
    }
}
