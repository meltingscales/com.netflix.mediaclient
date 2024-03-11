package com.netflix.mediaclient.util;

import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8203dfu;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;

/* loaded from: classes5.dex */
public final class ObservableNotificationsMap$observeNotificationsRx$1 extends SuspendLambda implements drX<dyQ<? super Pair<? extends String, ? extends NotificationsListStatus>>, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    int c;
    final /* synthetic */ C8203dfu d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableNotificationsMap$observeNotificationsRx$1(String str, C8203dfu c8203dfu, InterfaceC8585dra<? super ObservableNotificationsMap$observeNotificationsRx$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = str;
        this.d = c8203dfu;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super Pair<String, ? extends NotificationsListStatus>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ObservableNotificationsMap$observeNotificationsRx$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ObservableNotificationsMap$observeNotificationsRx$1 observableNotificationsMap$observeNotificationsRx$1 = new ObservableNotificationsMap$observeNotificationsRx$1(this.e, this.d, interfaceC8585dra);
        observableNotificationsMap$observeNotificationsRx$1.a = obj;
        return observableNotificationsMap$observeNotificationsRx$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            String str = this.e;
            Pair pair = new Pair(str, this.d.e(str));
            this.c = 1;
            if (((dyQ) this.a).emit(pair, this) == e) {
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
