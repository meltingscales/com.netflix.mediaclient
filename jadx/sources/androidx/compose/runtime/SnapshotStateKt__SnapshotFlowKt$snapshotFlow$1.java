package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dyQ;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends SuspendLambda implements drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(drO<? extends T> dro, InterfaceC8585dra<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$block = dro;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, interfaceC8585dra);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke((dyQ) ((dyQ) obj), interfaceC8585dra);
    }

    public final Object invoke(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:33:0x00c6, B:35:0x00ca, B:40:0x00d4, B:43:0x00e2, B:47:0x00f8, B:49:0x0101, B:11:0x0037, B:44:0x00ed, B:46:0x00f5, B:45:0x00f1), top: B:72:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:33:0x00c6, B:35:0x00ca, B:40:0x00d4, B:43:0x00e2, B:47:0x00f8, B:49:0x0101, B:11:0x0037, B:44:0x00ed, B:46:0x00f5, B:45:0x00f1), top: B:72:0x0037 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e0 -> B:70:0x00ae). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ff -> B:70:0x00ae). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0113 -> B:28:0x00ad). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
