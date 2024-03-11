package com.airbnb.mvrx;

import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class FlowExtensionsKt$assertOneActiveSubscription$1<T> extends SuspendLambda implements InterfaceC8612dsa<dyQ<? super T>, Throwable, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ LifecycleOwner b;
    final /* synthetic */ FlowExtensionsKt$assertOneActiveSubscription$observer$1 c;
    int d;
    final /* synthetic */ Set<String> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$assertOneActiveSubscription$1(Set<String> set, String str, LifecycleOwner lifecycleOwner, FlowExtensionsKt$assertOneActiveSubscription$observer$1 flowExtensionsKt$assertOneActiveSubscription$observer$1, InterfaceC8585dra<? super FlowExtensionsKt$assertOneActiveSubscription$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.e = set;
        this.a = str;
        this.b = lifecycleOwner;
        this.c = flowExtensionsKt$assertOneActiveSubscription$observer$1;
    }

    @Override // o.InterfaceC8612dsa
    /* renamed from: b */
    public final Object invoke(dyQ<? super T> dyq, Throwable th, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return new FlowExtensionsKt$assertOneActiveSubscription$1(this.e, this.a, this.b, this.c, interfaceC8585dra).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            this.e.remove(this.a);
            this.b.getLifecycle().removeObserver(this.c);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
