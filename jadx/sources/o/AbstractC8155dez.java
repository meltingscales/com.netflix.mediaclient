package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.dez  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8155dez<T> extends AbstractC8152dew {
    private List<T> e;

    protected abstract void c(List<T> list, boolean z);

    public AbstractC8155dez(String str) {
        super(str);
        this.e = Collections.synchronizedList(new ArrayList());
    }

    public final boolean a(T t) {
        synchronized (this) {
            if (t == null) {
                return false;
            }
            synchronized (this.e) {
                this.e.add(t);
            }
            if (d()) {
                d(true);
                return true;
            }
            return false;
        }
    }

    @Override // o.AbstractC8152dew
    public void d(boolean z) {
        synchronized (this) {
            if (!this.j.get()) {
                C1044Mm.j(this.a, "flushEvents:: can NOT flush queue, it is not started yet!");
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (this.e) {
                arrayList.addAll(this.e);
                this.e.clear();
                this.g = SystemClock.elapsedRealtime();
            }
            c(arrayList, z);
        }
    }

    @Override // o.AbstractC8152dew
    public int c() {
        return this.e.size();
    }
}
