package com.netflix.mediaclient.ui.mylist.impl.game;

import com.netflix.android.org.json.zip.JSONzip;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6971cnP;
import o.C6975cnT;
import o.C6977cnV;
import o.C7011coC;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8971gl;
import o.InterfaceC8585dra;
import o.dAU;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MyListViewModelGame$fetchMore$1$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C6971cnP a;
    Object b;
    final /* synthetic */ String c;
    final /* synthetic */ C7011coC d;
    int e;
    final /* synthetic */ C6975cnT g;
    private /* synthetic */ Object j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListViewModelGame$fetchMore$1$1$1(C6975cnT c6975cnT, String str, C7011coC c7011coC, C6971cnP c6971cnP, InterfaceC8585dra<? super MyListViewModelGame$fetchMore$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.g = c6975cnT;
        this.c = str;
        this.d = c7011coC;
        this.a = c6971cnP;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MyListViewModelGame$fetchMore$1$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MyListViewModelGame$fetchMore$1$1$1 myListViewModelGame$fetchMore$1$1$1 = new MyListViewModelGame$fetchMore$1$1$1(this.g, this.c, this.d, this.a, interfaceC8585dra);
        myListViewModelGame$fetchMore$1$1$1.j = obj;
        return myListViewModelGame$fetchMore$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C6977cnV c6977cnV;
        C6975cnT c6975cnT;
        C6971cnP c6971cnP;
        List g;
        e = C8586drb.e();
        int i = this.e;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                dwU dwu = (dwU) this.j;
                C6975cnT c6975cnT2 = this.g;
                String str = this.c;
                C7011coC c7011coC = this.d;
                C6971cnP c6971cnP2 = this.a;
                Result.c cVar = Result.e;
                c6977cnV = c6975cnT2.e;
                Single<C6971cnP> b = c6977cnV.b(25, str, c7011coC.a());
                this.j = c6975cnT2;
                this.b = c6971cnP2;
                this.e = 1;
                obj = dAU.d(b, this);
                if (obj == e) {
                    return e;
                }
                c6975cnT = c6975cnT2;
                c6971cnP = c6971cnP2;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                c6971cnP = (C6971cnP) this.b;
                C6975cnT c6975cnT3 = (C6975cnT) this.j;
                C8556dpz.d(obj);
                c6975cnT = c6975cnT3;
            }
            C6971cnP c6971cnP3 = (C6971cnP) obj;
            String b2 = c6971cnP3.b();
            g = C8576dqs.g((Collection) c6971cnP.e(), (Iterable) c6971cnP3.e());
            final C6971cnP e2 = C6971cnP.e(c6971cnP, 0, b2, g, 0, null, null, 57, null);
            c6975cnT.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1$1$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final C7011coC invoke(C7011coC c7011coC2) {
                    C7011coC b3;
                    C8632dsu.c((Object) c7011coC2, "");
                    b3 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : false, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : new C8971gl(C6971cnP.this), (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                    return b3;
                }
            });
            Result.e(dpR.c);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            Result.e(C8556dpz.a(th));
        }
        return dpR.c;
    }
}
