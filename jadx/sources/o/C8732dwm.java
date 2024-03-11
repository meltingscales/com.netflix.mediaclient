package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dwm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8732dwm<T> {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C8732dwm.class, "notCompletedCount");
    private final dwZ<T>[] c;
    private volatile int notCompletedCount;

    /* JADX WARN: Multi-variable type inference failed */
    public C8732dwm(dwZ<? extends T>[] dwzArr) {
        this.c = dwzArr;
        this.notCompletedCount = dwzArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dwm$a */
    /* loaded from: classes5.dex */
    public final class a extends AbstractC8744dwy {
        private final C8732dwm<T>.e[] d;

        public a(C8732dwm<T>.e[] eVarArr) {
            this.d = eVarArr;
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(Throwable th) {
            e(th);
            return dpR.c;
        }

        @Override // o.AbstractC8742dww
        public void e(Throwable th) {
            e();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.d + ']';
        }

        public final void e() {
            for (C8732dwm<T>.e eVar : this.d) {
                eVar.e().co_();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dwm$e */
    /* loaded from: classes5.dex */
    public final class e extends dxL {
        private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_disposer");
        private volatile Object _disposer;
        public InterfaceC8760dxn b;
        private final InterfaceC8743dwx<List<? extends T>> e;

        public final void d(InterfaceC8760dxn interfaceC8760dxn) {
            this.b = interfaceC8760dxn;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC8743dwx<? super List<? extends T>> interfaceC8743dwx) {
            this.e = interfaceC8743dwx;
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(Throwable th) {
            e(th);
            return dpR.c;
        }

        public final InterfaceC8760dxn e() {
            InterfaceC8760dxn interfaceC8760dxn = this.b;
            if (interfaceC8760dxn != null) {
                return interfaceC8760dxn;
            }
            C8632dsu.d("");
            return null;
        }

        public final C8732dwm<T>.a c() {
            return (a) c.get(this);
        }

        public final void b(C8732dwm<T>.a aVar) {
            c.set(this, aVar);
        }

        @Override // o.dwM
        public void e(Throwable th) {
            if (th != null) {
                Object d = this.e.d(th);
                if (d != null) {
                    this.e.b(d);
                    C8732dwm<T>.a c2 = c();
                    if (c2 != null) {
                        c2.e();
                    }
                }
            } else if (C8732dwm.e.decrementAndGet(C8732dwm.this) == 0) {
                InterfaceC8743dwx<List<? extends T>> interfaceC8743dwx = this.e;
                dwZ[] dwzArr = ((C8732dwm) C8732dwm.this).c;
                ArrayList arrayList = new ArrayList(dwzArr.length);
                for (dwZ dwz : dwzArr) {
                    arrayList.add(dwz.e());
                }
                Result.c cVar = Result.e;
                interfaceC8743dwx.resumeWith(Result.e(arrayList));
            }
        }
    }

    public final Object a(InterfaceC8585dra<? super List<? extends T>> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e2;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        int length = this.c.length;
        e[] eVarArr = new e[length];
        for (int i = 0; i < length; i++) {
            dwZ dwz = this.c[i];
            dwz.o();
            e eVar = new e(c8741dwv);
            eVar.d(dwz.e(eVar));
            dpR dpr = dpR.c;
            eVarArr[i] = eVar;
        }
        C8732dwm<T>.a aVar = new a(eVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            eVarArr[i2].b(aVar);
        }
        if (c8741dwv.e()) {
            aVar.e();
        } else {
            c8741dwv.a((drM<? super Throwable, dpR>) aVar);
        }
        Object b2 = c8741dwv.b();
        e2 = C8586drb.e();
        if (b2 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
