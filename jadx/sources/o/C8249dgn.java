package o;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC8248dgm;

/* renamed from: o.dgn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8249dgn implements InterfaceC8248dgm {
    private final File a;
    private final Map<String, InterfaceC8248dgm.d> b;
    private final int c;
    private boolean d;
    private int e;
    private long g;

    private C8249dgn(File file, int i, int i2, boolean z) {
        this.b = new HashMap();
        this.g = 0L;
        this.a = file;
        this.c = i;
        this.d = z;
    }

    public C8249dgn(File file) {
        this(file, 5242880, 1024, false);
    }

    public C8249dgn(File file, boolean z) {
        this(file, 5242880, 1024, z);
    }

    @Override // o.InterfaceC8248dgm
    public void c(InterfaceC8248dgm.b bVar) {
        synchronized (this) {
            if (!this.a.exists()) {
                if (!this.a.mkdirs()) {
                    C1044Mm.d("nf_log_fs", "Unable to create cache dir " + this.a.getAbsolutePath());
                }
                if (bVar != null) {
                    bVar.d(null);
                }
                return;
            }
            this.g = 0L;
            b(this.a);
            if (bVar != null) {
                Collection<InterfaceC8248dgm.d> values = this.b.values();
                bVar.d((InterfaceC8248dgm.d[]) values.toArray(new InterfaceC8248dgm.d[values.size()]));
            }
        }
    }

    private int b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i = 0;
        for (File file2 : listFiles) {
            if (file2 != null && file2.exists()) {
                if (file2.isDirectory()) {
                    i += b(file2);
                } else {
                    d(file2);
                    i++;
                }
            }
        }
        return i;
    }

    private void d(File file) {
        C8257dgv c8257dgv = new C8257dgv(C8257dgv.e(this.a, file), file);
        this.b.put(file.getName(), c8257dgv);
        this.g += c8257dgv.a();
    }

    @Override // o.InterfaceC8248dgm
    public String b(String str, byte[] bArr, String str2) {
        String e;
        synchronized (this) {
            e = e(str, bArr, str2, null, null);
        }
        return e;
    }

    @Override // o.InterfaceC8248dgm
    public String a(String str, byte[] bArr, String str2, InterfaceC8248dgm.c cVar) {
        String e;
        synchronized (this) {
            e = e(str, bArr, str2, cVar, null);
        }
        return e;
    }

    private String e(String str, byte[] bArr, String str2, InterfaceC8248dgm.c cVar, String str3) {
        File file;
        String e;
        synchronized (this) {
            a(bArr.length);
            long f = C8106deC.f(this.a);
            if (f < bArr.length) {
                C1044Mm.j("nf_log_fs", "Even after pruning, we may NOT have enough space available. Free space: %d vs entry space %d", Long.valueOf(f), Integer.valueOf(bArr.length));
            }
            File c2 = c(str2, C8257dgv.a(str, str3));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c2, C8168dfL.h(str3)));
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                C8257dgv c8257dgv = new C8257dgv(str2, c2);
                this.b.put(c2.getName(), c8257dgv);
                this.g += c8257dgv.a();
                if (cVar != null) {
                    cVar.e(c8257dgv.e());
                }
                e = c8257dgv.e();
            } catch (IOException e2) {
                C1044Mm.e("nf_log_fs", "Failed to save data to file system!", e2);
                if (!file.delete()) {
                    C1044Mm.d("nf_log_fs", "Failed to save data. Could not clean up file " + file.getAbsolutePath());
                }
                if (cVar != null) {
                    cVar.e(null);
                }
                return null;
            }
        }
        return e;
    }

    @Override // o.InterfaceC8248dgm
    public void c(String str, InterfaceC8248dgm.e eVar) {
        c cVar;
        synchronized (this) {
            InterfaceC8248dgm.d dVar = this.b.get(str);
            if (dVar == null) {
                C1044Mm.e("nf_log_fs", "Entry not found!");
                if (eVar != null) {
                    eVar.d(str, null, null, 0L);
                }
                return;
            }
            C1044Mm.e("nf_log_fs", "Entry found!");
            File c2 = c(dVar.c(), str);
            c cVar2 = null;
            try {
                try {
                    cVar = new c(new FileInputStream(c2));
                    try {
                        byte[] d = d(cVar, (int) (c2.length() - cVar.a));
                        if (eVar != null) {
                            eVar.d(str, dVar.c(), d, c2.lastModified());
                        }
                        try {
                            cVar.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException e) {
                        e = e;
                        cVar2 = cVar;
                        C1044Mm.e("nf_log_fs", " Failed to load file " + c2.getAbsolutePath(), e);
                        e(str);
                        if (cVar2 != null) {
                            try {
                                cVar2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (eVar != null) {
                            eVar.d(str, null, null, 0L);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = null;
            }
        }
    }

    @Override // o.InterfaceC8248dgm
    public void e(String str) {
        synchronized (this) {
            InterfaceC8248dgm.d remove = this.b.remove(str);
            if (remove != null && c(remove.c(), str).delete() && this.g >= remove.a()) {
                this.g -= remove.a();
            }
        }
    }

    @Override // o.InterfaceC8248dgm
    public void a() {
        synchronized (this) {
            a(this.a, false);
            this.b.clear();
            this.g = 0L;
            C1044Mm.e("nf_log_fs", "Cache cleared.");
        }
    }

    private void a(File file, boolean z) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, true);
                } else {
                    file2.delete();
                }
            }
        }
        if (z) {
            file.delete();
        }
    }

    @Override // o.InterfaceC8248dgm
    public InterfaceC8248dgm.d[] b() {
        InterfaceC8248dgm.d[] dVarArr;
        synchronized (this) {
            dVarArr = (InterfaceC8248dgm.d[]) this.b.values().toArray(new InterfaceC8248dgm.d[this.b.size()]);
        }
        return dVarArr;
    }

    private File c(String str, String str2) {
        String c2 = c(str);
        if (c2 == null) {
            return new File(this.a, str2);
        }
        File file = new File(this.a, c2);
        if (!file.exists()) {
            try {
                file.mkdir();
                return new File(file, str2);
            } catch (Throwable th) {
                C1044Mm.b("nf_log_fs", th, "Unable to create profile log directory!", new Object[0]);
                return new File(this.a, str2);
            }
        } else if (file.isDirectory()) {
            return new File(file, str2);
        } else {
            C1044Mm.e("nf_log_fs", "File %s exists and it is not directory!", file);
            return new File(this.a, str2);
        }
    }

    private String c(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return C8137deh.e(str);
    }

    private static byte[] d(InputStream inputStream, int i) {
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

    /* renamed from: o.dgn$c */
    /* loaded from: classes5.dex */
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

    private void a(int i) {
        if (i > this.e) {
            this.e = i;
        }
        if (e(i) || b(i)) {
            C1044Mm.e("nf_log_fs", "Pruning oldest entries.");
            SystemClock.elapsedRealtime();
            ArrayList<InterfaceC8248dgm.d> arrayList = new ArrayList(this.b.values());
            Collections.sort(arrayList, new Comparator<InterfaceC8248dgm.d>() { // from class: o.dgn.2
                @Override // java.util.Comparator
                /* renamed from: c */
                public int compare(InterfaceC8248dgm.d dVar, InterfaceC8248dgm.d dVar2) {
                    if (dVar.b() == dVar2.b()) {
                        return 0;
                    }
                    return dVar.b() < dVar2.b() ? -1 : 1;
                }
            });
            for (InterfaceC8248dgm.d dVar : arrayList) {
                File c2 = c(dVar.c(), dVar.e());
                long length = c2.length();
                if (c2.delete()) {
                    long j = this.g;
                    if (j >= length) {
                        this.g = j - length;
                    }
                } else {
                    C1044Mm.d("nf_log_fs", "Could not delete entry " + c2.getName());
                }
                this.b.remove(dVar.e());
                if (this.g + i < this.c) {
                    return;
                }
            }
            return;
        }
        C1044Mm.e("nf_log_fs", "No need to prune oldest entries.");
    }

    private boolean e(int i) {
        boolean z = this.g + ((long) i) > ((long) this.c);
        C1044Mm.a("nf_log_fs", "Need to prune based on using too much space: %b", Boolean.valueOf(z));
        return z;
    }

    private boolean b(int i) {
        long f = C8106deC.f(this.a);
        boolean z = ((long) i) > f;
        C1044Mm.a("nf_log_fs", "Used space %d in bytes. Need to prune based on not having enough space (%d in bytes) on device: %b", Long.valueOf(this.g), Long.valueOf(f), Boolean.valueOf(z));
        return z;
    }
}
