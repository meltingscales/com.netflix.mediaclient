package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: o.ck  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6796ck<T> {
    public static Executor a = Executors.newCachedThreadPool();
    private volatile C6849cl<T> b;
    private final Set<InterfaceC6690ci<T>> c;
    private final Set<InterfaceC6690ci<Throwable>> d;
    private final Handler e;

    public C6796ck(Callable<C6849cl<T>> callable) {
        this(callable, false);
    }

    public C6796ck(Callable<C6849cl<T>> callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (z) {
            try {
                a(callable.call());
                return;
            } catch (Throwable th) {
                a(new C6849cl<>(th));
                return;
            }
        }
        a.execute(new c(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C6849cl<T> c6849cl) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = c6849cl;
        c();
    }

    public C6796ck<T> c(InterfaceC6690ci<T> interfaceC6690ci) {
        synchronized (this) {
            C6849cl<T> c6849cl = this.b;
            if (c6849cl != null && c6849cl.b() != null) {
                interfaceC6690ci.a(c6849cl.b());
            }
            this.c.add(interfaceC6690ci);
        }
        return this;
    }

    public C6796ck<T> e(InterfaceC6690ci<T> interfaceC6690ci) {
        synchronized (this) {
            this.c.remove(interfaceC6690ci);
        }
        return this;
    }

    public C6796ck<T> d(InterfaceC6690ci<Throwable> interfaceC6690ci) {
        synchronized (this) {
            C6849cl<T> c6849cl = this.b;
            if (c6849cl != null && c6849cl.e() != null) {
                interfaceC6690ci.a(c6849cl.e());
            }
            this.d.add(interfaceC6690ci);
        }
        return this;
    }

    public C6796ck<T> b(InterfaceC6690ci<Throwable> interfaceC6690ci) {
        synchronized (this) {
            this.d.remove(interfaceC6690ci);
        }
        return this;
    }

    private void c() {
        this.e.post(new Runnable() { // from class: o.cj
            @Override // java.lang.Runnable
            public final void run() {
                C6796ck.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        C6849cl<T> c6849cl = this.b;
        if (c6849cl == null) {
            return;
        }
        if (c6849cl.b() != null) {
            d((C6796ck<T>) c6849cl.b());
        } else {
            c(c6849cl.e());
        }
    }

    private void d(T t) {
        synchronized (this) {
            for (InterfaceC6690ci interfaceC6690ci : new ArrayList(this.c)) {
                interfaceC6690ci.a(t);
            }
        }
    }

    private void c(Throwable th) {
        synchronized (this) {
            ArrayList<InterfaceC6690ci> arrayList = new ArrayList(this.d);
            if (arrayList.isEmpty()) {
                C8909fc.a("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            for (InterfaceC6690ci interfaceC6690ci : arrayList) {
                interfaceC6690ci.a(th);
            }
        }
    }

    /* renamed from: o.ck$c */
    /* loaded from: classes2.dex */
    class c extends FutureTask<C6849cl<T>> {
        c(Callable<C6849cl<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C6796ck.this.a(get());
            } catch (InterruptedException | ExecutionException e) {
                C6796ck.this.a(new C6849cl(e));
            }
        }
    }
}
