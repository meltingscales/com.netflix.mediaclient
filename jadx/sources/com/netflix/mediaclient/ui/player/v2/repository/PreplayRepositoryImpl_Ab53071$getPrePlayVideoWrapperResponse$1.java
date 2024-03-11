package com.netflix.mediaclient.ui.player.v2.repository;

import com.netflix.mediaclient.util.PlayContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5713cFp;
import o.C5720cFw;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C5713cFp.d>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    int d;
    final /* synthetic */ PlayContext e;
    final /* synthetic */ C5720cFw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1(String str, C5720cFw c5720cFw, PlayContext playContext, String str2, String str3, InterfaceC8585dra<? super PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = str;
        this.j = c5720cFw;
        this.e = playContext;
        this.b = str2;
        this.a = str3;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C5713cFp.d> interfaceC8585dra) {
        return ((PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1(this.c, this.j, this.e, this.b, this.a, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0110 A[Catch: IllegalArgumentException -> 0x0156, ApolloException -> 0x0176, TryCatch #2 {ApolloException -> 0x0176, IllegalArgumentException -> 0x0156, blocks: (B:5:0x000e, B:13:0x005c, B:16:0x006c, B:18:0x0074, B:20:0x0088, B:22:0x008e, B:24:0x0094, B:26:0x009a, B:40:0x00d9, B:42:0x00e5, B:44:0x00eb, B:55:0x010a, B:57:0x0110, B:58:0x0114, B:46:0x00f1, B:48:0x00f7, B:50:0x00fd, B:52:0x0103, B:59:0x0138, B:60:0x0141, B:27:0x009f, B:29:0x00af, B:31:0x00b5, B:32:0x00ba, B:34:0x00ca, B:36:0x00d0, B:61:0x0142, B:62:0x014b, B:63:0x014c, B:64:0x0155, B:10:0x0045), top: B:70:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.repository.PreplayRepositoryImpl_Ab53071$getPrePlayVideoWrapperResponse$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
