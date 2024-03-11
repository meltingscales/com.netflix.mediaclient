package com.netflix.mediaclient.ui.mylist.impl.video;

import com.netflix.android.org.json.zip.JSONzip;
import dagger.Lazy;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7011coC;
import o.C7052cot;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bZI;
import o.bZK;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes6.dex */
public final class MyListViewModelVideo$observeVideosLiveState$3$1 extends SuspendLambda implements drX<bZK, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ C7052cot c;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListViewModelVideo$observeVideosLiveState$3$1(C7052cot c7052cot, InterfaceC8585dra<? super MyListViewModelVideo$observeVideosLiveState$3$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c7052cot;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(bZK bzk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MyListViewModelVideo$observeVideosLiveState$3$1) create(bzk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MyListViewModelVideo$observeVideosLiveState$3$1 myListViewModelVideo$observeVideosLiveState$3$1 = new MyListViewModelVideo$observeVideosLiveState$3$1(this.c, interfaceC8585dra);
        myListViewModelVideo$observeVideosLiveState$3$1.e = obj;
        return myListViewModelVideo$observeVideosLiveState$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        final bZK bzk;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            bZK bzk2 = (bZK) this.e;
            lazy = this.c.i;
            Set<String> b = bzk2.b();
            this.e = bzk2;
            this.a = 1;
            if (((bZI) lazy.get()).c(b, this) == e) {
                return e;
            }
            bzk = bzk2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            bzk = (bZK) this.e;
            C8556dpz.d(obj);
        }
        this.c.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$3$1.1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C7011coC invoke(C7011coC c7011coC) {
                C7011coC b2;
                C8632dsu.c((Object) c7011coC, "");
                b2 = c7011coC.b((r26 & 1) != 0 ? c7011coC.m : null, (r26 & 2) != 0 ? c7011coC.h : null, (r26 & 4) != 0 ? c7011coC.a : false, (r26 & 8) != 0 ? c7011coC.i : null, (r26 & 16) != 0 ? c7011coC.j : null, (r26 & 32) != 0 ? c7011coC.d : null, (r26 & 64) != 0 ? c7011coC.l : null, (r26 & 128) != 0 ? c7011coC.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC.g : null, (r26 & 512) != 0 ? c7011coC.e : null, (r26 & 1024) != 0 ? c7011coC.c : false, (r26 & 2048) != 0 ? c7011coC.b : bZK.this);
                return b2;
            }
        });
        return dpR.c;
    }
}
