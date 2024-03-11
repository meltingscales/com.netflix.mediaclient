package o;

import android.os.SystemClock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import o.InterfaceC9854xo;

/* renamed from: o.xJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9823xJ implements InterfaceC9854xo {
    private final File a;
    private final int b;
    private final Map<String, e> e = new LinkedHashMap(16, 0.75f, true);
    private long d = 0;

    public C9823xJ(File file, int i) {
        this.a = file;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.InterfaceC9854xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC9854xo.d c(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.Map<java.lang.String, o.xJ$e> r0 = r10.e     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L86
            o.xJ$e r0 = (o.C9823xJ.e) r0     // Catch: java.lang.Throwable -> L86
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r10)
            return r1
        Le:
            java.io.File r2 = r10.e(r11)     // Catch: java.lang.Throwable -> L86
            r3 = 1
            r4 = 0
            o.xJ$c r5 = new o.xJ$c     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            o.C9823xJ.e.c(r5)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            long r6 = r2.length()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            int r8 = o.C9823xJ.c.d(r5)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            long r8 = (long) r8     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            long r6 = r6 - r8
            int r6 = (int) r6     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            if (r6 > 0) goto L45
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            java.lang.String r6 = r2.getAbsolutePath()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            r0[r4] = r6     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            java.lang.String r6 = "file removed from cache %s"
            o.C9862xw.e(r6, r0)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            r10.d(r11)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            r5.close()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L86
            monitor-exit(r10)
            return r1
        L43:
            monitor-exit(r10)
            return r1
        L45:
            byte[] r6 = b(r5, r6)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            o.xo$d r11 = r0.d(r6)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7c
            r5.close()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L86
            monitor-exit(r10)
            return r11
        L52:
            monitor-exit(r10)
            return r1
        L54:
            r0 = move-exception
            goto L5b
        L56:
            r11 = move-exception
            r5 = r1
            goto L7d
        L59:
            r0 = move-exception
            r5 = r1
        L5b:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L7c
            r6[r4] = r2     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            r6[r3] = r0     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "%s: %s"
            o.C9862xw.e(r0, r6)     // Catch: java.lang.Throwable -> L7c
            r10.d(r11)     // Catch: java.lang.Throwable -> L7c
            if (r5 == 0) goto L7a
            r5.close()     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L86
            goto L7a
        L78:
            monitor-exit(r10)
            return r1
        L7a:
            monitor-exit(r10)
            return r1
        L7c:
            r11 = move-exception
        L7d:
            if (r5 == 0) goto L85
            r5.close()     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L86
            goto L85
        L83:
            monitor-exit(r10)
            return r1
        L85:
            throw r11     // Catch: java.lang.Throwable -> L86
        L86:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9823xJ.c(java.lang.String):o.xo$d");
    }

    @Override // o.InterfaceC9854xo
    public void d() {
        FileInputStream fileInputStream;
        synchronized (this) {
            if (!this.a.exists()) {
                if (!this.a.mkdirs()) {
                    C9862xw.a("Unable to create cache dir %s", this.a.getAbsolutePath());
                }
                return;
            }
            File[] listFiles = this.a.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            e c2 = e.c(fileInputStream);
                            c2.e = file.length();
                            c(c2.c, c2);
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                            fileInputStream2 = fileInputStream;
                            if (file != null) {
                                file.delete();
                            }
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused4) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            }
        }
    }

    @Override // o.InterfaceC9854xo
    public void e(String str, InterfaceC9854xo.d dVar) {
        synchronized (this) {
            a(dVar.c.length);
            File e2 = e(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(e2);
                e eVar = new e(str, dVar);
                eVar.d(fileOutputStream);
                fileOutputStream.write(dVar.c);
                fileOutputStream.close();
                c(str, eVar);
            } catch (IOException unused) {
                if (e2.delete()) {
                    return;
                }
                C9862xw.e("Could not clean up file %s", e2.getAbsolutePath());
            }
        }
    }

    public void d(String str) {
        synchronized (this) {
            boolean delete = e(str).delete();
            b(str);
            if (!delete) {
                C9862xw.e("Could not delete cache entry for key=%s, filename=%s", str, a(str));
            }
        }
    }

    private String a(String str) {
        int length = str.length() / 2;
        int hashCode = str.substring(0, length).hashCode();
        return String.valueOf(hashCode) + String.valueOf(str.substring(length).hashCode());
    }

    public File e(String str) {
        return new File(this.a, a(str));
    }

    private void a(int i) {
        long j = i;
        if (this.d + j < this.b) {
            return;
        }
        SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, e>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            e value = it.next().getValue();
            if (e(value.c).delete()) {
                this.d -= value.e;
            } else {
                String str = value.c;
                C9862xw.e("Could not delete cache entry for key=%s, filename=%s", str, a(str));
            }
            it.remove();
            if (((float) (this.d + j)) < this.b * 0.9f) {
                return;
            }
        }
    }

    private void c(String str, e eVar) {
        if (!this.e.containsKey(str)) {
            this.d += eVar.e;
        } else {
            this.d += eVar.e - this.e.get(str).e;
        }
        this.e.put(str, eVar);
    }

    private void b(String str) {
        e eVar = this.e.get(str);
        if (eVar != null) {
            this.d -= eVar.e;
            this.e.remove(str);
        }
    }

    private static byte[] b(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xJ$e */
    /* loaded from: classes2.dex */
    public static class e {
        public long a;
        public Map<String, String> b;
        public String c;
        public String d;
        public long e;
        public long h;
        public long j;

        private e() {
        }

        public e(String str, InterfaceC9854xo.d dVar) {
            this.c = str;
            this.e = dVar.c.length;
            this.d = dVar.a;
            this.a = dVar.e;
            this.h = dVar.g;
            this.j = dVar.b;
            this.b = dVar.d;
        }

        public static e c(InputStream inputStream) {
            e eVar = new e();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            if (objectInputStream.readByte() != 2) {
                throw new IOException();
            }
            eVar.c = objectInputStream.readUTF();
            String readUTF = objectInputStream.readUTF();
            eVar.d = readUTF;
            if (readUTF.equals("")) {
                eVar.d = null;
            }
            eVar.a = objectInputStream.readLong();
            eVar.h = objectInputStream.readLong();
            eVar.j = objectInputStream.readLong();
            eVar.b = d(objectInputStream);
            return eVar;
        }

        public InterfaceC9854xo.d d(byte[] bArr) {
            InterfaceC9854xo.d dVar = new InterfaceC9854xo.d();
            dVar.c = bArr;
            dVar.a = this.d;
            dVar.e = this.a;
            dVar.g = this.h;
            dVar.b = this.j;
            dVar.d = this.b;
            return dVar;
        }

        public boolean d(OutputStream outputStream) {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeByte(2);
                objectOutputStream.writeUTF(this.c);
                String str = this.d;
                if (str == null) {
                    str = "";
                }
                objectOutputStream.writeUTF(str);
                objectOutputStream.writeLong(this.a);
                objectOutputStream.writeLong(this.h);
                objectOutputStream.writeLong(this.j);
                e(this.b, objectOutputStream);
                objectOutputStream.flush();
                return true;
            } catch (IOException e) {
                C9862xw.e("%s", e.toString());
                return false;
            }
        }

        private static void e(Map<String, String> map, ObjectOutputStream objectOutputStream) {
            if (map != null) {
                objectOutputStream.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    objectOutputStream.writeUTF(entry.getKey());
                    objectOutputStream.writeUTF(entry.getValue());
                }
                return;
            }
            objectOutputStream.writeInt(0);
        }

        private static Map<String, String> d(ObjectInputStream objectInputStream) {
            Map<String, String> treeMap;
            int readInt = objectInputStream.readInt();
            if (readInt == 0) {
                treeMap = Collections.emptyMap();
            } else {
                treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            }
            for (int i = 0; i < readInt; i++) {
                treeMap.put(objectInputStream.readUTF().intern(), objectInputStream.readUTF().intern());
            }
            return treeMap;
        }
    }

    /* renamed from: o.xJ$c */
    /* loaded from: classes2.dex */
    static class c extends FilterInputStream {
        private int e;

        private c(InputStream inputStream) {
            super(inputStream);
            this.e = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.e++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.e += read;
            }
            return read;
        }
    }
}
