package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements InterfaceC8612dsa<dwU, MonotonicFrameClock, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, InterfaceC8585dra<? super Recomposer$runRecomposeAndApplyChanges$2> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.this$0 = recomposer;
    }

    @Override // o.InterfaceC8612dsa
    public final Object invoke(dwU dwu, MonotonicFrameClock monotonicFrameClock, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, interfaceC8585dra);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c8 -> B:23:0x00fd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f5 -> B:22:0x00f8). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        identityArraySet.clear();
        identityArraySet2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            dpR dpr = dpR.c;
        }
    }
}
