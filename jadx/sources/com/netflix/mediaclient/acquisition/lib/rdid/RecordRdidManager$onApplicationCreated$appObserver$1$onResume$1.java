package com.netflix.mediaclient.acquisition.lib.rdid;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RecordRdid;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class RecordRdidManager$onApplicationCreated$appObserver$1$onResume$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int label;
    final /* synthetic */ RecordRdidManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordRdidManager$onApplicationCreated$appObserver$1$onResume$1(RecordRdidManager recordRdidManager, InterfaceC8585dra<? super RecordRdidManager$onApplicationCreated$appObserver$1$onResume$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = recordRdidManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new RecordRdidManager$onApplicationCreated$appObserver$1$onResume$1(this.this$0, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((RecordRdidManager$onApplicationCreated$appObserver$1$onResume$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            RecordRdidManager recordRdidManager = this.this$0;
            long b = Config_FastProperty_RecordRdid.Companion.b();
            this.label = 1;
            if (recordRdidManager.maybeRecordRdidIfLastCallOutdated$netflix_modules_lib_acquisition_impl_release(b, this) == e) {
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
