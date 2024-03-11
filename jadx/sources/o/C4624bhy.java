package o;

import android.util.LongSparseArray;
import com.netflix.mediaclient.media.manifest.Stream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC4682bjC;

/* renamed from: o.bhy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4624bhy implements InterfaceC4682bjC, InterfaceC4872boA {
    private final LongSparseArray<C4726bju> a = new LongSparseArray<>();
    private final LongSparseArray<IOException> d = new LongSparseArray<>();
    private final LongSparseArray<List<InterfaceC4682bjC.e>> c = new LongSparseArray<>();
    private final CopyOnWriteArrayList<InterfaceC4682bjC.e> b = new CopyOnWriteArrayList<>();

    public void b(long j, C4726bju c4726bju) {
        synchronized (this) {
            this.a.put(j, c4726bju);
            this.d.remove(j);
            Iterator<InterfaceC4682bjC.e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().b(j, c4726bju);
            }
            List<InterfaceC4682bjC.e> list = this.c.get(j);
            if (list != null) {
                for (InterfaceC4682bjC.e eVar : list) {
                    eVar.b(j, c4726bju);
                }
            }
        }
    }

    public void c(long j, IOException iOException) {
        synchronized (this) {
            this.d.put(j, iOException);
            this.a.remove(j);
            Iterator<InterfaceC4682bjC.e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(j, iOException);
            }
            List<InterfaceC4682bjC.e> list = this.c.get(j);
            if (list != null) {
                for (InterfaceC4682bjC.e eVar : list) {
                    eVar.a(j, iOException);
                }
            }
        }
    }

    public C4726bju e(long j) {
        C4726bju c4726bju;
        synchronized (this) {
            c4726bju = this.a.get(j);
        }
        return c4726bju;
    }

    @Override // o.InterfaceC4682bjC
    public void e(long j, InterfaceC4682bjC.e eVar) {
        synchronized (this) {
            List<InterfaceC4682bjC.e> list = this.c.get(j);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.c.put(j, list);
            }
            list.add(eVar);
            C4726bju c4726bju = this.a.get(j);
            if (c4726bju != null) {
                eVar.b(j, c4726bju);
            } else {
                IOException iOException = this.d.get(j);
                if (iOException != null) {
                    eVar.a(j, iOException);
                }
            }
        }
    }

    public void b(InterfaceC4682bjC.e eVar) {
        synchronized (this) {
            this.b.add(eVar);
        }
    }

    @Override // o.InterfaceC4682bjC
    public void d(long j, InterfaceC4682bjC.e eVar) {
        synchronized (this) {
            List<InterfaceC4682bjC.e> list = this.c.get(j);
            if (list != null) {
                list.remove(eVar);
                if (list.isEmpty()) {
                    this.c.remove(j);
                }
            }
        }
    }

    @Override // o.InterfaceC4872boA
    public boolean d(long j) {
        boolean z;
        synchronized (this) {
            if (this.a.get(j) == null) {
                z = this.d.get(j) != null;
            }
        }
        return z;
    }

    public boolean a(long j) {
        boolean z;
        synchronized (this) {
            z = this.d.get(j) != null;
        }
        return z;
    }

    public void b() {
        synchronized (this) {
            this.a.clear();
            this.d.clear();
        }
    }

    public void c(long j, List<Stream> list) {
        synchronized (this) {
            C4726bju c4726bju = this.a.get(j);
            if (c4726bju != null && this.d.get(j) == null) {
                c4726bju.d(list);
            }
        }
    }
}
