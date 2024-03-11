package com.airbnb.mvrx;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8928fv;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowExtensionsKt$collectLatest$flow$2<T> extends SuspendLambda implements drX<T, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ AbstractC8928fv b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ ConcurrentHashMap<String, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$collectLatest$flow$2(ConcurrentHashMap<String, Object> concurrentHashMap, AbstractC8928fv abstractC8928fv, InterfaceC8585dra<? super FlowExtensionsKt$collectLatest$flow$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = concurrentHashMap;
        this.b = abstractC8928fv;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowExtensionsKt$collectLatest$flow$2) create(t, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FlowExtensionsKt$collectLatest$flow$2 flowExtensionsKt$collectLatest$flow$2 = new FlowExtensionsKt$collectLatest$flow$2(this.e, this.b, interfaceC8585dra);
        flowExtensionsKt$collectLatest$flow$2.d = obj;
        return flowExtensionsKt$collectLatest$flow$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            this.e.put(this.b.b(), this.d);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
