package com.apollographql.apollo3.cache.normalized.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dyR;
import o.dyS;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class WatcherInterceptorKt$flattenConcatPolyfill$1<T> extends SuspendLambda implements drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dyS<dyS<T>> c;
    int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatcherInterceptorKt$flattenConcatPolyfill$1(dyS<? extends dyS<? extends T>> dys, InterfaceC8585dra<? super WatcherInterceptorKt$flattenConcatPolyfill$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = dys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        WatcherInterceptorKt$flattenConcatPolyfill$1 watcherInterceptorKt$flattenConcatPolyfill$1 = new WatcherInterceptorKt$flattenConcatPolyfill$1(this.c, interfaceC8585dra);
        watcherInterceptorKt$flattenConcatPolyfill$1.e = obj;
        return watcherInterceptorKt$flattenConcatPolyfill$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WatcherInterceptorKt$flattenConcatPolyfill$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            final dyQ dyq = (dyQ) this.e;
            dyS<dyS<T>> dys = this.c;
            dyQ<? super dyS<T>> dyq2 = new dyQ() { // from class: com.apollographql.apollo3.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1.5
                @Override // o.dyQ
                /* renamed from: a */
                public final Object emit(dyS<? extends T> dys2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    Object e2;
                    Object e3 = dyR.e(dyq, dys2, interfaceC8585dra);
                    e2 = C8586drb.e();
                    return e3 == e2 ? e3 : dpR.c;
                }
            };
            this.d = 1;
            if (dys.collect(dyq2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
