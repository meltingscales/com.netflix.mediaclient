package com.airbnb.mvrx;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.PausingDispatcherKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8782dyi;
import o.C8895fO;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyR;
import o.dyS;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public final class FlowExtensionsKt$collectLatest$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ LifecycleOwner a;
    int b;
    final /* synthetic */ dyS<T> d;
    final /* synthetic */ drX<T, InterfaceC8585dra<? super dpR>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$collectLatest$1(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, LifecycleOwner lifecycleOwner, InterfaceC8585dra<? super FlowExtensionsKt$collectLatest$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dys;
        this.e = drx;
        this.a = lifecycleOwner;
    }

    public final Object a(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowExtensionsKt$collectLatest$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FlowExtensionsKt$collectLatest$1(this.d, this.e, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    public /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return a(dwu, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            this.b = 1;
            if (C8782dyi.b(this) == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        dyS<T> dys = this.d;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.a, null);
        this.b = 2;
        if (dyR.d(dys, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.airbnb.mvrx.FlowExtensionsKt$collectLatest$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> extends SuspendLambda implements drX<T, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ drX<T, InterfaceC8585dra<? super dpR>, Object> a;
        /* synthetic */ Object c;
        int d;
        final /* synthetic */ LifecycleOwner e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, LifecycleOwner lifecycleOwner, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.a = drx;
            this.e = lifecycleOwner;
        }

        public final Object a(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(t, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.e, interfaceC8585dra);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.drX
        public /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return a(obj, interfaceC8585dra);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.d;
            if (i == 0) {
                C8556dpz.d(obj);
                Object obj2 = this.c;
                Boolean bool = C8895fO.d;
                C8632dsu.a(bool, "");
                if (bool.booleanValue()) {
                    this.d = 1;
                    if (this.a.invoke(obj2, this) == e) {
                        return e;
                    }
                } else {
                    LifecycleOwner lifecycleOwner = this.e;
                    C00371 c00371 = new C00371(this.a, obj2, null);
                    this.d = 2;
                    if (PausingDispatcherKt.whenStarted(lifecycleOwner, c00371, this) == e) {
                        return e;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.airbnb.mvrx.FlowExtensionsKt$collectLatest$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C00371 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
            final /* synthetic */ T a;
            int d;
            final /* synthetic */ drX<T, InterfaceC8585dra<? super dpR>, Object> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00371(drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, T t, InterfaceC8585dra<? super C00371> interfaceC8585dra) {
                super(2, interfaceC8585dra);
                this.e = drx;
                this.a = t;
            }

            public final Object a(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return ((C00371) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                return new C00371(this.e, this.a, interfaceC8585dra);
            }

            @Override // o.drX
            public /* synthetic */ Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                return a(dwu, interfaceC8585dra);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object e;
                e = C8586drb.e();
                int i = this.d;
                if (i == 0) {
                    C8556dpz.d(obj);
                    drX<T, InterfaceC8585dra<? super dpR>, Object> drx = this.e;
                    T t = this.a;
                    this.d = 1;
                    if (drx.invoke(t, this) == e) {
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
    }
}
