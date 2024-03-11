package com.netflix.mediaclient.ui.profiles;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5956cOq;
import o.C6705ciO;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8814dzn;
import o.RG;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dyQ;

/* loaded from: classes4.dex */
public final class SwitchProfileSheet$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<View, dpR> a;
    int b;
    final /* synthetic */ C5956cOq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchProfileSheet$2(C5956cOq c5956cOq, drM<? super View, dpR> drm, InterfaceC8585dra<? super SwitchProfileSheet$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c5956cOq;
        this.a = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SwitchProfileSheet$2(this.d, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SwitchProfileSheet$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ C5956cOq a;
        final /* synthetic */ drM<View, dpR> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(C5956cOq c5956cOq, drM<? super View, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.a = c5956cOq;
            this.c = drm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.a, this.c, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            C6705ciO c6705ciO;
            e = C8586drb.e();
            int i = this.d;
            if (i == 0) {
                C8556dpz.d(obj);
                c6705ciO = this.a.j;
                InterfaceC8814dzn<C6705ciO.a> c = c6705ciO.c();
                final C5956cOq c5956cOq = this.a;
                final drM<View, dpR> drm = this.c;
                dyQ<? super C6705ciO.a> dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.profiles.SwitchProfileSheet.2.1.4
                    @Override // o.dyQ
                    /* renamed from: c */
                    public final Object emit(C6705ciO.a aVar, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        RG rg;
                        RG rg2;
                        if (C8632dsu.c(aVar, C6705ciO.a.c.e)) {
                            rg2 = C5956cOq.this.e;
                            rg2.b(false);
                        } else if (C8632dsu.c(aVar, C6705ciO.a.C0116a.e)) {
                            rg = C5956cOq.this.e;
                            rg.a(false);
                        } else if (C8632dsu.c(aVar, C6705ciO.a.b.b)) {
                            drm.invoke(C5956cOq.this);
                        }
                        return dpR.c;
                    }
                };
                this.d = 1;
                if (c.collect(dyq, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        LifecycleOwner lifecycleOwner;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            lifecycleOwner = this.d.f;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.a, null);
            this.b = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == e) {
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
