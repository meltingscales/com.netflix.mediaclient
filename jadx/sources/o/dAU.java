package o;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlinx.coroutines.rx2.Mode;
import o.dpR;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes5.dex */
public final class dAU {

    /* loaded from: classes5.dex */
    public static final class a implements CompletableObserver {
        final /* synthetic */ InterfaceC8743dwx<dpR> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC8743dwx<? super dpR> interfaceC8743dwx) {
            this.c = interfaceC8743dwx;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            dAU.e(this.c, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            InterfaceC8743dwx<dpR> interfaceC8743dwx = this.c;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(dpR.c));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            InterfaceC8743dwx<dpR> interfaceC8743dwx = this.c;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(th)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class e<T> implements SingleObserver<T> {
        final /* synthetic */ InterfaceC8743dwx<T> e;

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC8743dwx<? super T> interfaceC8743dwx) {
            this.e = interfaceC8743dwx;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            dAU.e((InterfaceC8743dwx<?>) this.e, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            InterfaceC8743dwx<T> interfaceC8743dwx = this.e;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(t));
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            InterfaceC8743dwx<T> interfaceC8743dwx = this.e;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(th)));
        }
    }

    public static final <T> Object e(ObservableSource<T> observableSource, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return b(observableSource, Mode.FIRST, null, interfaceC8585dra, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object d(io.reactivex.ObservableSource<T> r7, o.drO<? extends T> r8, o.InterfaceC8585dra<? super T> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1 r0 = (kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1 r0 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.c
            r8 = r7
            o.drO r8 = (o.drO) r8
            o.C8556dpz.d(r9)
            goto L4c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            o.C8556dpz.d(r9)
            kotlinx.coroutines.rx2.Mode r9 = kotlinx.coroutines.rx2.Mode.FIRST_OR_DEFAULT
            r4.c = r8
            r4.a = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r9
            java.lang.Object r9 = b(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            if (r9 != 0) goto L52
            java.lang.Object r9 = r8.invoke()
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dAU.d(io.reactivex.ObservableSource, o.drO, o.dra):java.lang.Object");
    }

    public static final void e(InterfaceC8743dwx<?> interfaceC8743dwx, final Disposable disposable) {
        interfaceC8743dwx.a(new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$disposeOnCancellation$1
            {
                super(1);
            }

            public final void c(Throwable th) {
                Disposable.this.dispose();
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }
        });
    }

    static /* synthetic */ Object b(ObservableSource observableSource, Mode mode, Object obj, InterfaceC8585dra interfaceC8585dra, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return d(observableSource, mode, obj, interfaceC8585dra);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class d<T> implements Observer<T> {
        private Disposable a;
        final /* synthetic */ Mode b;
        final /* synthetic */ InterfaceC8743dwx<T> c;
        private boolean d;
        final /* synthetic */ T e;
        private T g;

        /* renamed from: o.dAU$d$d  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public final /* synthetic */ class C0120d {
            public static final /* synthetic */ int[] e;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.FIRST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Mode.LAST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Mode.SINGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                e = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC8743dwx<? super T> interfaceC8743dwx, Mode mode, T t) {
            this.c = interfaceC8743dwx;
            this.b = mode;
            this.e = t;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(final Disposable disposable) {
            this.a = disposable;
            this.c.a(new drM<Throwable, dpR>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                {
                    super(1);
                }

                public final void b(Throwable th) {
                    Disposable.this.dispose();
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }
            });
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            int i = C0120d.e[this.b.ordinal()];
            Disposable disposable = null;
            if (i == 1 || i == 2) {
                if (this.d) {
                    return;
                }
                this.d = true;
                InterfaceC8743dwx<T> interfaceC8743dwx = this.c;
                Result.c cVar = Result.e;
                interfaceC8743dwx.resumeWith(Result.e(t));
                Disposable disposable2 = this.a;
                if (disposable2 == null) {
                    C8632dsu.d("");
                } else {
                    disposable = disposable2;
                }
                disposable.dispose();
            } else if (i == 3 || i == 4) {
                if (this.b != Mode.SINGLE || !this.d) {
                    this.g = t;
                    this.d = true;
                    return;
                }
                if (this.c.d()) {
                    InterfaceC8743dwx<T> interfaceC8743dwx2 = this.c;
                    Result.c cVar2 = Result.e;
                    interfaceC8743dwx2.resumeWith(Result.e(C8556dpz.a(new IllegalArgumentException("More than one onNext value for " + this.b))));
                }
                Disposable disposable3 = this.a;
                if (disposable3 == null) {
                    C8632dsu.d("");
                } else {
                    disposable = disposable3;
                }
                disposable.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.d) {
                if (this.c.d()) {
                    InterfaceC8743dwx<T> interfaceC8743dwx = this.c;
                    Result.c cVar = Result.e;
                    interfaceC8743dwx.resumeWith(Result.e(this.g));
                }
            } else if (this.b == Mode.FIRST_OR_DEFAULT) {
                InterfaceC8743dwx<T> interfaceC8743dwx2 = this.c;
                Result.c cVar2 = Result.e;
                interfaceC8743dwx2.resumeWith(Result.e(this.e));
            } else if (this.c.d()) {
                InterfaceC8743dwx<T> interfaceC8743dwx3 = this.c;
                Result.c cVar3 = Result.e;
                interfaceC8743dwx3.resumeWith(Result.e(C8556dpz.a(new NoSuchElementException("No value received via onNext for " + this.b))));
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            InterfaceC8743dwx<T> interfaceC8743dwx = this.c;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(th)));
        }
    }

    public static final Object b(CompletableSource completableSource, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e2;
        Object e3;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        completableSource.subscribe(new a(c8741dwv));
        Object b2 = c8741dwv.b();
        e2 = C8586drb.e();
        if (b2 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        e3 = C8586drb.e();
        return b2 == e3 ? b2 : dpR.c;
    }

    public static final <T> Object d(SingleSource<T> singleSource, InterfaceC8585dra<? super T> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e2;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        singleSource.subscribe(new e(c8741dwv));
        Object b2 = c8741dwv.b();
        e2 = C8586drb.e();
        if (b2 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }

    private static final <T> Object d(ObservableSource<T> observableSource, Mode mode, T t, InterfaceC8585dra<? super T> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e2;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        observableSource.subscribe(new d(c8741dwv, mode, t));
        Object b2 = c8741dwv.b();
        e2 = C8586drb.e();
        if (b2 == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
