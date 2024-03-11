package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import dagger.Lazy;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3651bFt;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC3663bGe;
import o.InterfaceC4004bSr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ C3651bFt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1(C3651bFt c3651bFt, String str, InterfaceC8585dra<? super DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c3651bFt;
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1(this.d, this.c, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.details.DetailsPageRemindMeDeeplinkHandler$handleRemindMe$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int b;
        final /* synthetic */ C3651bFt d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C3651bFt c3651bFt, String str, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = c3651bFt;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.d, this.e, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            Lazy lazy;
            Object a;
            Activity activity;
            e = C8586drb.e();
            int i = this.b;
            if (i == 0) {
                C8556dpz.d(obj);
                lazy = this.d.d;
                String str = this.e;
                TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.DEEPLINK);
                this.b = 1;
                a = ((InterfaceC3663bGe) lazy.get()).a(str, trackingInfoHolder, true, (InterfaceC8585dra<? super Result<Boolean>>) this);
                if (a == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
                a = ((Result) obj).c();
            }
            if (Result.h(a)) {
                InterfaceC4004bSr.a aVar = InterfaceC4004bSr.c;
                activity = this.d.a;
                String a2 = LoMoType.REMINDERS.a();
                C8632dsu.a(a2, "");
                aVar.c(activity, a2, null, null, null);
                this.d.d();
            }
            return dpR.c;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Activity activity;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            activity = this.d.a;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.c, null);
            this.b = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle((LifecycleOwner) activity, state, anonymousClass1, this) == e) {
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
