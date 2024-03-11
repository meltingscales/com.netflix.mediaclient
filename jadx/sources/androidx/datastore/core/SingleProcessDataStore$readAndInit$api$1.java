package androidx.datastore.core;

import kotlin.jvm.internal.Ref;
import o.dBK;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref.ObjectRef<T> $initData;
    final /* synthetic */ Ref.BooleanRef $initializationComplete;
    final /* synthetic */ dBK $updateLock;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleProcessDataStore$readAndInit$api$1(dBK dbk, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.$updateLock = dbk;
        this.$initializationComplete = booleanRef;
        this.$initData = objectRef;
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:30:0x0095, B:32:0x0099, B:49:0x00da, B:50:0x00e1), top: B:54:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b1, B:38:0x00b9), top: B:55:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #0 {all -> 0x00e2, blocks: (B:30:0x0095, B:32:0x0099, B:49:0x00da, B:50:0x00e1), top: B:54:0x0095 }] */
    @Override // androidx.datastore.core.InitializerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateData(o.drX<? super T, ? super o.InterfaceC8585dra<? super T>, ? extends java.lang.Object> r11, o.InterfaceC8585dra<? super T> r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.updateData(o.drX, o.dra):java.lang.Object");
    }
}
