package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8191dfi;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwQ;
import o.dwU;
import o.dwZ;

@Singleton
/* renamed from: o.dfi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8191dfi {
    private final ConcurrentHashMap<Object, dwZ<?>> a;
    private final dwQ d;
    private final dwU e;

    @Inject
    public C8191dfi(dwQ dwq, dwU dwu) {
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwu, "");
        this.d = dwq;
        this.e = dwu;
        this.a = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dwZ c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return (dwZ) drm.invoke(obj);
    }

    public final <P, R> Object b(final P p, final drX<? super P, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super R> interfaceC8585dra) {
        ConcurrentHashMap<Object, dwZ<?>> concurrentHashMap = this.a;
        final drM<Object, dwZ<?>> drm = new drM<Object, dwZ<?>>(this) { // from class: com.netflix.mediaclient.util.Memorizer$compute$computed$1
            final /* synthetic */ C8191dfi c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.c = this;
            }

            @Override // o.drM
            public /* synthetic */ dwZ<?> invoke(Object obj) {
                return d(obj);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: Add missing generic type declarations: [R] */
            /* renamed from: com.netflix.mediaclient.util.Memorizer$compute$computed$1$1  reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1<R> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super R>, Object> {
                int b;
                final /* synthetic */ C8191dfi c;
                final /* synthetic */ P d;
                final /* synthetic */ drX<P, InterfaceC8585dra<? super R>, Object> e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(drX<? super P, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, P p, C8191dfi c8191dfi, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.e = drx;
                    this.d = p;
                    this.c = c8191dfi;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.e, this.d, this.c, interfaceC8585dra);
                }

                public final Object e(dwU dwu, InterfaceC8585dra<? super R> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // o.drX
                public /* synthetic */ Object invoke(dwU dwu, Object obj) {
                    return e(dwu, (InterfaceC8585dra) obj);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    ConcurrentHashMap concurrentHashMap;
                    e = C8586drb.e();
                    int i = this.b;
                    try {
                        if (i == 0) {
                            C8556dpz.d(obj);
                            drX<P, InterfaceC8585dra<? super R>, Object> drx = this.e;
                            P p = this.d;
                            this.b = 1;
                            obj = drx.invoke(p, this);
                            if (obj == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        return obj;
                    } finally {
                        concurrentHashMap = this.c.a;
                        concurrentHashMap.remove(this.d);
                    }
                }
            }

            public final dwZ<?> d(Object obj) {
                dwU dwu;
                dwQ dwq;
                dwZ<?> d;
                C8632dsu.c(obj, "");
                dwu = this.c.e;
                dwq = this.c.d;
                d = C8737dwr.d(dwu, dwq, null, new AnonymousClass1(drx, p, this.c, null), 2, null);
                return d;
            }
        };
        dwZ<?> computeIfAbsent = concurrentHashMap.computeIfAbsent(p, new Function() { // from class: o.dff
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dwZ c;
                c = C8191dfi.c(drM.this, obj);
                return c;
            }
        });
        C8632dsu.a(computeIfAbsent, "");
        Object b = computeIfAbsent.b(interfaceC8585dra);
        C8586drb.e();
        return b;
    }
}
