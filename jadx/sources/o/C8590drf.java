package o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import o.C8556dpz;
import o.C8632dsu;
import o.drX;
import o.dsH;

/* renamed from: o.drf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8590drf {
    public static <R, P, T> Object a(InterfaceC8612dsa<? super R, ? super P, ? super InterfaceC8585dra<? super T>, ? extends Object> interfaceC8612dsa, R r, P p, InterfaceC8585dra<? super T> interfaceC8585dra) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c((Object) interfaceC8585dra, "");
        return ((InterfaceC8612dsa) dsH.a(interfaceC8612dsa, 3)).invoke(r, p, c(C8592drh.d(interfaceC8585dra)));
    }

    public static <R, T> InterfaceC8585dra<dpR> c(final drX<? super R, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, final R r, InterfaceC8585dra<? super T> interfaceC8585dra) {
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) interfaceC8585dra, "");
        final InterfaceC8585dra<?> d = C8592drh.d(interfaceC8585dra);
        if (drx instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) drx).create(r, d);
        }
        final dqZ context = d.getContext();
        if (context == EmptyCoroutineContext.e) {
            return new RestrictedContinuationImpl(d, drx, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                final /* synthetic */ Object a;
                final /* synthetic */ drX c;
                private int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(d);
                    this.c = drx;
                    this.a = r;
                    C8632dsu.d(d);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) {
                    int i = this.e;
                    if (i == 0) {
                        this.e = 1;
                        C8556dpz.d(obj);
                        C8632dsu.d(this.c);
                        return ((drX) dsH.a(this.c, 2)).invoke(this.a, this);
                    } else if (i == 1) {
                        this.e = 2;
                        C8556dpz.d(obj);
                        return obj;
                    } else {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                }
            };
        }
        return new ContinuationImpl(d, context, drx, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ drX b;
            private int c;
            final /* synthetic */ Object d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(d, context);
                this.b = drx;
                this.d = r;
                C8632dsu.d(d);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i = this.c;
                if (i == 0) {
                    this.c = 1;
                    C8556dpz.d(obj);
                    C8632dsu.d(this.b);
                    return ((drX) dsH.a(this.b, 2)).invoke(this.d, this);
                } else if (i == 1) {
                    this.c = 2;
                    C8556dpz.d(obj);
                    return obj;
                } else {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC8585dra<T> b(InterfaceC8585dra<? super T> interfaceC8585dra) {
        InterfaceC8585dra<T> interfaceC8585dra2;
        C8632dsu.c((Object) interfaceC8585dra, "");
        ContinuationImpl continuationImpl = interfaceC8585dra instanceof ContinuationImpl ? (ContinuationImpl) interfaceC8585dra : null;
        return (continuationImpl == null || (interfaceC8585dra2 = (InterfaceC8585dra<T>) continuationImpl.intercepted()) == null) ? interfaceC8585dra : interfaceC8585dra2;
    }

    private static final <T> InterfaceC8585dra<T> c(final InterfaceC8585dra<? super T> interfaceC8585dra) {
        final dqZ context = interfaceC8585dra.getContext();
        if (context == EmptyCoroutineContext.e) {
            return new RestrictedContinuationImpl(interfaceC8585dra) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(interfaceC8585dra);
                    C8632dsu.d(interfaceC8585dra);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) {
                    C8556dpz.d(obj);
                    return obj;
                }
            };
        }
        return new ContinuationImpl(interfaceC8585dra, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC8585dra, context);
                C8632dsu.d(interfaceC8585dra);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                C8556dpz.d(obj);
                return obj;
            }
        };
    }
}
