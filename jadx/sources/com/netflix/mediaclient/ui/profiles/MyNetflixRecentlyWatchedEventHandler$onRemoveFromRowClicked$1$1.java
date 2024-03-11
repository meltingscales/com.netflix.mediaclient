package com.netflix.mediaclient.ui.profiles;

import android.app.Activity;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1;
import dagger.Lazy;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8054ddD;
import o.C8187dfe;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC4004bSr;
import o.InterfaceC8585dra;
import o.cMC;
import o.cMK;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ Long b;
    final /* synthetic */ cMC c;
    final /* synthetic */ Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1(cMC cmc, Long l, Long l2, InterfaceC8585dra<? super MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = cmc;
        this.d = l;
        this.b = l2;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1(this.c, this.d, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Lazy lazy;
        RecentlyWatchedVideoInfo recentlyWatchedVideoInfo;
        Activity activity;
        RecentlyWatchedVideoInfo recentlyWatchedVideoInfo2;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            lazy = this.c.e;
            recentlyWatchedVideoInfo = this.c.j;
            String f = recentlyWatchedVideoInfo.f();
            this.a = 1;
            obj = ((cMK) lazy.get()).c(f, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Logger.INSTANCE.endSession(this.d);
            InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
            activity = this.c.b;
            recentlyWatchedVideoInfo2 = this.c.j;
            aVar.a(activity, recentlyWatchedVideoInfo2.f());
        } else {
            ExtLogger.INSTANCE.failedAction(this.d, null);
            final cMC cmc = this.c;
            C8187dfe.c(new Runnable() { // from class: o.cME
                @Override // java.lang.Runnable
                public final void run() {
                    MyNetflixRecentlyWatchedEventHandler$onRemoveFromRowClicked$1$1.c(cMC.this);
                }
            });
        }
        Logger.INSTANCE.endSession(this.b);
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cMC cmc) {
        Activity activity;
        activity = cmc.b;
        C8054ddD.c(activity, R.o.dE, 1);
    }
}
