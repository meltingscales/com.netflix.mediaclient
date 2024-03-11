package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import io.reactivex.Observable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5989cPw;
import o.C5991cPy;
import o.C8556dpz;
import o.C8586drb;
import o.C8691duz;
import o.C8749dxc;
import o.C9935zP;
import o.InterfaceC8585dra;
import o.cPI;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class BlockedTitlesScreenKt$BlockedTitlesScreen$1$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ cPI a;
    final /* synthetic */ MutableState<String> b;
    final /* synthetic */ MutableState<Boolean> c;
    final /* synthetic */ C9935zP d;
    final /* synthetic */ Context e;
    int i;
    final /* synthetic */ C5989cPw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedTitlesScreenKt$BlockedTitlesScreen$1$2(C5989cPw c5989cPw, C9935zP c9935zP, Context context, cPI cpi, MutableState<String> mutableState, MutableState<Boolean> mutableState2, InterfaceC8585dra<? super BlockedTitlesScreenKt$BlockedTitlesScreen$1$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.j = c5989cPw;
        this.d = c9935zP;
        this.e = context;
        this.a = cpi;
        this.b = mutableState;
        this.c = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new BlockedTitlesScreenKt$BlockedTitlesScreen$1$2(this.j, this.d, this.e, this.a, this.b, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((BlockedTitlesScreenKt$BlockedTitlesScreen$1$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        String a;
        boolean g;
        String a2;
        String a3;
        e = C8586drb.e();
        int i = this.i;
        if (i == 0) {
            C8556dpz.d(obj);
            a = C5991cPy.a(this.b);
            g = C8691duz.g(a);
            if (!g) {
                C5991cPy.b(this.c, true);
                this.i = 1;
                if (C8749dxc.b(700L, this) == e) {
                    return e;
                }
            } else {
                this.j.f();
                return dpR.c;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                cPI cpi = this.a;
                a3 = C5991cPy.a(this.b);
                cpi.d(a3);
                C5991cPy.b(this.c, false);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        C5989cPw c5989cPw = this.j;
        a2 = C5991cPy.a(this.b);
        Observable<dpR> d = this.d.d();
        Context context = this.e;
        this.i = 2;
        if (c5989cPw.d(a2, d, context, this) == e) {
            return e;
        }
        cPI cpi2 = this.a;
        a3 = C5991cPy.a(this.b);
        cpi2.d(a3);
        C5991cPy.b(this.c, false);
        return dpR.c;
    }
}
