package com.airbnb.mvrx;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8928fv;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowExtensionsKt$collectLatest$flow$1<T> extends SuspendLambda implements drX<T, InterfaceC8585dra<? super Boolean>, Object> {
    int b;
    final /* synthetic */ AbstractC8928fv c;
    final /* synthetic */ ConcurrentHashMap<String, Object> d;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$collectLatest$flow$1(ConcurrentHashMap<String, Object> concurrentHashMap, AbstractC8928fv abstractC8928fv, InterfaceC8585dra<? super FlowExtensionsKt$collectLatest$flow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = concurrentHashMap;
        this.c = abstractC8928fv;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(T t, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        return ((FlowExtensionsKt$collectLatest$flow$1) create(t, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FlowExtensionsKt$collectLatest$flow$1 flowExtensionsKt$collectLatest$flow$1 = new FlowExtensionsKt$collectLatest$flow$1(this.d, this.c, interfaceC8585dra);
        flowExtensionsKt$collectLatest$flow$1.e = obj;
        return flowExtensionsKt$collectLatest$flow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            return C8589dre.e(this.d.containsKey(this.c.b()) && C8632dsu.c(this.e, this.d.get(this.c.b())));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
