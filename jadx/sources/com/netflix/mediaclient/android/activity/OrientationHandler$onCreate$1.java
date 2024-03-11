package com.netflix.mediaclient.android.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1059Nd;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes3.dex */
public final class OrientationHandler$onCreate$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C1059Nd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationHandler$onCreate$1(C1059Nd c1059Nd, InterfaceC8585dra<? super OrientationHandler$onCreate$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c1059Nd;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((OrientationHandler$onCreate$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new OrientationHandler$onCreate$1(this.d, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.android.activity.OrientationHandler$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C1059Nd b;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C1059Nd c1059Nd, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = c1059Nd;
        }

        @Override // o.drX
        /* renamed from: c */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.b, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.e;
            if (i == 0) {
                C8556dpz.d(obj);
                dyS<WindowLayoutInfo> windowLayoutInfo = WindowInfoTracker.Companion.getOrCreate(this.b.d()).windowLayoutInfo(this.b.d());
                final C1059Nd c1059Nd = this.b;
                dyQ<? super WindowLayoutInfo> dyq = new dyQ() { // from class: com.netflix.mediaclient.android.activity.OrientationHandler.onCreate.1.1.2
                    @Override // o.dyQ
                    /* renamed from: d */
                    public final Object emit(WindowLayoutInfo windowLayoutInfo2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        C1059Nd.this.d(windowLayoutInfo2);
                        C1059Nd.this.d().onLayoutInfoChanged(windowLayoutInfo2);
                        return dpR.c;
                    }
                };
                this.e = 1;
                if (windowLayoutInfo.collect(dyq, this) == e) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            Lifecycle lifecycle = this.d.d().getLifecycle();
            C8632dsu.a(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, null);
            this.a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == e) {
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
