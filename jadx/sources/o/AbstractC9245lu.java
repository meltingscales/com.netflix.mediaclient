package o;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.C9246lv;

/* renamed from: o.lu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9245lu {
    private final Comparator<? super File> a;
    private final d b;
    private final InterfaceC9200lB c;
    private final int d;
    private final Lock e = new ReentrantLock();
    private final Collection<File> f = new ConcurrentSkipListSet();
    private final File i;

    /* renamed from: o.lu$d */
    /* loaded from: classes2.dex */
    public interface d {
        void a(Exception exc, File file, String str);
    }

    protected InterfaceC9200lB a() {
        return this.c;
    }

    public abstract String c(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final d i() {
        return this.b;
    }

    public AbstractC9245lu(File file, int i, Comparator<? super File> comparator, InterfaceC9200lB interfaceC9200lB, d dVar) {
        this.i = file;
        this.d = i;
        this.a = comparator;
        this.c = interfaceC9200lB;
        this.b = dVar;
        d(file);
    }

    private final boolean d(File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e) {
            a().c("Could not prepare file storage directory", e);
            return false;
        }
    }

    public final void d(String str, String str2) {
        BufferedWriter bufferedWriter;
        if (d(this.i)) {
            b();
            this.e.lock();
            String absolutePath = new File(this.i, str2).getAbsolutePath();
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    try {
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                        try {
                            bufferedWriter.write(str);
                            bufferedWriter.close();
                        } catch (Exception e) {
                            e = e;
                            bufferedWriter2 = bufferedWriter;
                            File file = new File(absolutePath);
                            d dVar = this.b;
                            if (dVar != null) {
                                dVar.a(e, file, "NDK Crash report copy");
                            }
                            C9244lt.d(file, a());
                            if (bufferedWriter2 != null) {
                                bufferedWriter2.close();
                            }
                            this.e.unlock();
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (Exception e2) {
                                    a().e(C8632dsu.d("Failed to close unsent payload writer: ", (Object) str2), e2);
                                }
                            }
                            this.e.unlock();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = bufferedWriter2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                a().e(C8632dsu.d("Failed to close unsent payload writer: ", (Object) str2), e4);
            }
            this.e.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c(C9246lv.a aVar) {
        C9246lv c9246lv;
        Closeable closeable = null;
        if (!d(this.i) || this.d == 0) {
            return null;
        }
        b();
        String absolutePath = new File(this.i, c((Object) aVar)).getAbsolutePath();
        Lock lock = this.e;
        lock.lock();
        try {
            try {
                c9246lv = new C9246lv(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
                try {
                    c9246lv.c(aVar);
                    a().a("Saved unsent payload to disk: '" + ((Object) absolutePath) + '\'');
                    C9244lt.b(c9246lv);
                    this.e.unlock();
                    return absolutePath;
                } catch (FileNotFoundException e) {
                    e = e;
                    a().e("Ignoring FileNotFoundException - unable to create file", e);
                    C9244lt.b(c9246lv);
                    this.e.unlock();
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    File file = new File(absolutePath);
                    d dVar = this.b;
                    if (dVar != null) {
                        dVar.a(e, file, "Crash report serialization");
                    }
                    C9244lt.d(file, a());
                    C9244lt.b(c9246lv);
                    this.e.unlock();
                    return null;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                c9246lv = null;
            } catch (Exception e4) {
                e = e4;
                c9246lv = null;
            } catch (Throwable th) {
                th = th;
                C9244lt.b(closeable);
                this.e.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable = lock;
            C9244lt.b(closeable);
            this.e.unlock();
            throw th;
        }
    }

    public final void b() {
        File[] listFiles;
        ArrayList a;
        Set a2;
        if (!d(this.i) || (listFiles = this.i.listFiles()) == null) {
            return;
        }
        a = C8569dql.a(Arrays.copyOf(listFiles, listFiles.length));
        if (a.size() >= this.d) {
            Collections.sort(a, this.a);
            int i = 0;
            while (i < a.size() && a.size() >= this.d) {
                File file = (File) a.get(i);
                if (!this.f.contains(file)) {
                    InterfaceC9200lB a3 = a();
                    a3.d("Discarding oldest error as stored error limit reached: '" + ((Object) file.getPath()) + '\'');
                    a2 = dqP.a(file);
                    d(a2);
                    a.remove(i);
                    i += -1;
                }
                i++;
            }
        }
    }

    public final List<File> e() {
        File[] listFiles;
        this.e.lock();
        try {
            ArrayList arrayList = new ArrayList();
            if (d(this.i) && (listFiles = this.i.listFiles()) != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file = listFiles[i];
                    i++;
                    if (file.length() == 0) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                    } else if (file.isFile() && !this.f.contains(file)) {
                        arrayList.add(file);
                    }
                }
            }
            this.f.addAll(arrayList);
            return arrayList;
        } finally {
            this.e.unlock();
        }
    }

    public final void c(Collection<? extends File> collection) {
        this.e.lock();
        if (collection != null) {
            try {
                this.f.removeAll(collection);
            } finally {
                this.e.unlock();
            }
        }
    }

    public final void d(Collection<? extends File> collection) {
        this.e.lock();
        if (collection != null) {
            try {
                this.f.removeAll(collection);
                for (File file : collection) {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                this.e.unlock();
            }
        }
    }
}
