package com.netflix.mediaclient.acquisition.lib.rdid;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RdidConsentStateRepoImpl$maybeRecordRdid$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RdidConsentStateRepoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdidConsentStateRepoImpl$maybeRecordRdid$1(RdidConsentStateRepoImpl rdidConsentStateRepoImpl, InterfaceC8585dra<? super RdidConsentStateRepoImpl$maybeRecordRdid$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.this$0 = rdidConsentStateRepoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.maybeRecordRdid(this);
    }
}
