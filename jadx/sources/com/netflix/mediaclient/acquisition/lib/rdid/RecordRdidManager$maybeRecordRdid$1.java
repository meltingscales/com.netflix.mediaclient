package com.netflix.mediaclient.acquisition.lib.rdid;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RecordRdidManager$maybeRecordRdid$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecordRdidManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordRdidManager$maybeRecordRdid$1(RecordRdidManager recordRdidManager, InterfaceC8585dra<? super RecordRdidManager$maybeRecordRdid$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.this$0 = recordRdidManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object maybeRecordRdid;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        maybeRecordRdid = this.this$0.maybeRecordRdid(this);
        return maybeRecordRdid;
    }
}
