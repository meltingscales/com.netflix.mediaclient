package com.netflix.mediaclient.ui.player.v2;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5593cBd;
import o.InterfaceC8585dra;
import o.cBB;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C5593cBd>, Object> {
    final /* synthetic */ long a;
    final /* synthetic */ TaskMode b;
    final /* synthetic */ PlayerExtras c;
    final /* synthetic */ String d;
    final /* synthetic */ PlayContext e;
    private /* synthetic */ Object g;
    final /* synthetic */ VideoType h;
    final /* synthetic */ cBB i;
    int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1(String str, cBB cbb, TaskMode taskMode, VideoType videoType, PlayContext playContext, long j, PlayerExtras playerExtras, InterfaceC8585dra<? super PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = str;
        this.i = cbb;
        this.b = taskMode;
        this.h = videoType;
        this.e = playContext;
        this.a = j;
        this.c = playerExtras;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1 playerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1 = new PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1(this.d, this.i, this.b, this.h, this.e, this.a, this.c, interfaceC8585dra);
        playerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1.g = obj;
        return playerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C5593cBd> interfaceC8585dra) {
        return ((PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6 A[Catch: Exception -> 0x0252, TryCatch #0 {Exception -> 0x0252, blocks: (B:9:0x001d, B:99:0x0230, B:14:0x0030, B:41:0x0107, B:44:0x0115, B:46:0x011d, B:48:0x0131, B:50:0x0137, B:52:0x013d, B:54:0x0143, B:73:0x019d, B:75:0x01a9, B:77:0x01af, B:88:0x01d0, B:90:0x01d6, B:91:0x01da, B:93:0x01e8, B:96:0x0208, B:95:0x01ec, B:79:0x01b5, B:81:0x01bb, B:83:0x01c1, B:85:0x01c7, B:100:0x0233, B:101:0x023c, B:55:0x0148, B:57:0x0158, B:59:0x015e, B:60:0x0163, B:62:0x0173, B:64:0x0179, B:65:0x017e, B:67:0x018e, B:69:0x0194, B:102:0x023d, B:103:0x0246, B:104:0x0247, B:105:0x0250, B:17:0x003c, B:20:0x0048), top: B:111:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022f A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.dwU] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.PlayerRepositoryImpl_Ab52320$requestStreamingDetailsGraphql$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
