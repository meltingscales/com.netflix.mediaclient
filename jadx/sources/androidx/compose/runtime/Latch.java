package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class Latch {
    private final Object lock = new Object();
    private List<InterfaceC8585dra<dpR>> awaiters = new ArrayList();
    private List<InterfaceC8585dra<dpR>> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        Object e2;
        if (isOpen()) {
            return dpR.c;
        }
        b = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        synchronized (this.lock) {
            this.awaiters.add(c8741dwv);
        }
        c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Object obj = Latch.this.lock;
                Latch latch = Latch.this;
                InterfaceC8743dwx<dpR> interfaceC8743dwx = c8741dwv;
                synchronized (obj) {
                    latch.awaiters.remove(interfaceC8743dwx);
                    dpR dpr = dpR.c;
                }
            }
        });
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b2 == e2 ? b2 : dpR.c;
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            dpR dpr = dpR.c;
        }
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (isOpen()) {
                return;
            }
            List<InterfaceC8585dra<dpR>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Result.c cVar = Result.e;
                list.get(i).resumeWith(Result.e(dpR.c));
            }
            list.clear();
            dpR dpr = dpR.c;
        }
    }
}
