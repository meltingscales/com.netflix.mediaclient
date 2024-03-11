package o;

import android.os.Handler;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ac  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2216ac {
    private final Executor a;
    private final DiffUtil.ItemCallback<AbstractC3073as<?>> c;
    private volatile List<? extends AbstractC3073as<?>> e;
    private final d g;
    private final b d = new b();
    private volatile List<? extends AbstractC3073as<?>> b = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ac$d */
    /* loaded from: classes2.dex */
    public interface d {
        void d(C2755am c2755am);
    }

    public List<? extends AbstractC3073as<?>> d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2216ac(Handler handler, d dVar, DiffUtil.ItemCallback<AbstractC3073as<?>> itemCallback) {
        this.a = new ExecutorC1835aQ(handler);
        this.g = dVar;
        this.c = itemCallback;
    }

    public boolean b() {
        return this.d.d();
    }

    public boolean e() {
        return this.d.a();
    }

    public boolean a(List<AbstractC3073as<?>> list) {
        boolean b2;
        synchronized (this) {
            b2 = b();
            e(list, this.d.b());
        }
        return b2;
    }

    public void e(final List<? extends AbstractC3073as<?>> list) {
        final int b2;
        final List<? extends AbstractC3073as<?>> list2;
        synchronized (this) {
            b2 = this.d.b();
            list2 = this.e;
        }
        if (list == list2) {
            c(b2, list, C2755am.d(list2));
        } else if (list == null || list.isEmpty()) {
            c(b2, null, (list2 == null || list2.isEmpty()) ? null : C2755am.b(list2));
        } else if (list2 == null || list2.isEmpty()) {
            c(b2, list, C2755am.a(list));
        } else {
            final e eVar = new e(list2, list, this.c);
            this.a.execute(new Runnable() { // from class: o.ac.2
                @Override // java.lang.Runnable
                public void run() {
                    DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(eVar);
                    C2216ac c2216ac = C2216ac.this;
                    int i = b2;
                    List list3 = list;
                    c2216ac.c(i, list3, C2755am.e(list2, list3, calculateDiff));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i, final List<? extends AbstractC3073as<?>> list, final C2755am c2755am) {
        C2050aY.b.execute(new Runnable() { // from class: o.ac.1
            @Override // java.lang.Runnable
            public void run() {
                boolean e2 = C2216ac.this.e(list, i);
                if (c2755am == null || !e2) {
                    return;
                }
                C2216ac.this.g.d(c2755am);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(List<? extends AbstractC3073as<?>> list, int i) {
        synchronized (this) {
            if (this.d.d(i)) {
                this.e = list;
                if (list == null) {
                    this.b = Collections.emptyList();
                } else {
                    this.b = Collections.unmodifiableList(list);
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ac$b */
    /* loaded from: classes2.dex */
    public static class b {
        private volatile int b;
        private volatile int e;

        private b() {
        }

        int b() {
            int i;
            synchronized (this) {
                i = this.b + 1;
                this.b = i;
            }
            return i;
        }

        boolean d() {
            boolean a;
            synchronized (this) {
                a = a();
                this.e = this.b;
            }
            return a;
        }

        boolean a() {
            boolean z;
            synchronized (this) {
                z = this.b > this.e;
            }
            return z;
        }

        boolean d(int i) {
            boolean z;
            synchronized (this) {
                z = this.b == i && i > this.e;
                if (z) {
                    this.e = i;
                }
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ac$e */
    /* loaded from: classes2.dex */
    public static class e extends DiffUtil.Callback {
        final List<? extends AbstractC3073as<?>> b;
        private final DiffUtil.ItemCallback<AbstractC3073as<?>> c;
        final List<? extends AbstractC3073as<?>> e;

        e(List<? extends AbstractC3073as<?>> list, List<? extends AbstractC3073as<?>> list2, DiffUtil.ItemCallback<AbstractC3073as<?>> itemCallback) {
            this.b = list;
            this.e = list2;
            this.c = itemCallback;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.e.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return this.c.areItemsTheSame(this.b.get(i), this.e.get(i2));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return this.c.areContentsTheSame(this.b.get(i), this.e.get(i2));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public Object getChangePayload(int i, int i2) {
            return this.c.getChangePayload(this.b.get(i), this.e.get(i2));
        }
    }
}
