package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.dew  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8152dew {
    public String a;
    protected long g = SystemClock.elapsedRealtime();
    protected AtomicBoolean h = new AtomicBoolean(false);
    protected AtomicBoolean j = new AtomicBoolean(false);
    protected List<c> d = Collections.synchronizedList(new ArrayList());

    /* renamed from: o.dew$c */
    /* loaded from: classes5.dex */
    public interface c {
        boolean e(int i, long j);
    }

    public abstract int c();

    public abstract void d(boolean z);

    public AbstractC8152dew(String str) {
        this.a = str;
    }

    public void c(c cVar) {
        if (cVar == null) {
            return;
        }
        this.d.add(cVar);
    }

    public void h() {
        this.j.set(true);
    }

    public boolean a() {
        if (d()) {
            d(true);
            return true;
        }
        return false;
    }

    public boolean d() {
        if (!this.j.get()) {
            C1044Mm.j(this.a, "Not started state::  we can not flush events");
            return false;
        } else if (this.h.get()) {
            C1044Mm.e(this.a, "Paused state:: we can not flush events");
            return false;
        } else if (this.d.size() > 0) {
            for (c cVar : this.d) {
                if (cVar.e(c(), this.g)) {
                    return true;
                }
            }
            return false;
        } else {
            C1044Mm.e(this.a, "No rules to flush queue, go and flush queue");
            return true;
        }
    }

    public boolean P_() {
        return this.h.get();
    }

    public boolean e() {
        return this.j.get();
    }

    /* renamed from: o.dew$a */
    /* loaded from: classes5.dex */
    public class a implements c {
        private final int d;

        public a(int i) {
            this.d = i;
        }

        @Override // o.AbstractC8152dew.c
        public boolean e(int i, long j) {
            return AbstractC8152dew.this.c() >= this.d;
        }
    }

    /* renamed from: o.dew$b */
    /* loaded from: classes5.dex */
    public class b implements c {
        private final long d;

        public b(long j) {
            this.d = j;
        }

        @Override // o.AbstractC8152dew.c
        public boolean e(int i, long j) {
            return SystemClock.elapsedRealtime() - j > this.d;
        }
    }
}
