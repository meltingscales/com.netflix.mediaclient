package com.netflix.mediaclient.autologin.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.graphql.models.type.TokenScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8051ddA;
import o.C8052ddB;
import o.C8069ddS;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC1239Ua;
import o.InterfaceC1338Xv;
import o.InterfaceC8585dra;
import o.TY;
import o.TZ;
import o.dpR;
import o.drM;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes3.dex */
public final class AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<Activity, dpR> a;
    final /* synthetic */ String b;
    final /* synthetic */ TZ c;
    final /* synthetic */ TokenScope d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1(TZ tz, TokenScope tokenScope, String str, drM<? super Activity, dpR> drm, InterfaceC8585dra<? super AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = tz;
        this.d = tokenScope;
        this.b = str;
        this.a = drm;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1(this.c, this.d, this.b, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC1239Ua interfaceC1239Ua;
        AppCompatActivity appCompatActivity;
        dwQ dwq;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC1239Ua = this.c.c;
            TokenScope tokenScope = this.d;
            this.e = 1;
            obj = interfaceC1239Ua.e(tokenScope, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        appCompatActivity = this.c.a;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity);
        dwq = this.c.f;
        C8737dwr.c(lifecycleScope, dwq, null, new AnonymousClass1((TY) obj, this.b, this.c, this.a, null), 2, null);
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.autologin.impl.AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ String a;
        int b;
        final /* synthetic */ TY c;
        final /* synthetic */ drM<Activity, dpR> d;
        final /* synthetic */ TZ e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TY ty, String str, TZ tz, drM<? super Activity, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = ty;
            this.a = str;
            this.e = tz;
            this.d = drm;
        }

        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, this.a, this.e, this.d, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppCompatActivity appCompatActivity;
            InterfaceC1338Xv interfaceC1338Xv;
            AppCompatActivity appCompatActivity2;
            C8586drb.e();
            if (this.b == 0) {
                C8556dpz.d(obj);
                TY ty = this.c;
                if (!(ty instanceof TY.a)) {
                    drM<Activity, dpR> drm = this.d;
                    appCompatActivity = this.e.a;
                    drm.invoke(appCompatActivity);
                } else {
                    String c = C8051ddA.c(this.a, ((TY.a) ty).e());
                    interfaceC1338Xv = this.e.d;
                    Intent c2 = C8069ddS.c(C8052ddB.c(c, interfaceC1338Xv.b()));
                    try {
                        appCompatActivity2 = this.e.a;
                        appCompatActivity2.startActivity(c2);
                    } catch (Throwable th) {
                        C8069ddS.c.a(th);
                    }
                }
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
