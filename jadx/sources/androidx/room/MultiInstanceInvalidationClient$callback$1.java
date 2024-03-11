package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import java.util.Arrays;
import java.util.concurrent.Executor;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.this$0 = multiInstanceInvalidationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInvalidation$lambda$0(MultiInstanceInvalidationClient multiInstanceInvalidationClient, String[] strArr) {
        C8632dsu.c((Object) multiInstanceInvalidationClient, "");
        C8632dsu.c((Object) strArr, "");
        multiInstanceInvalidationClient.getInvalidationTracker().notifyObserversByTableNames((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(final String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        Executor executor = this.this$0.getExecutor();
        final MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$callback$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0(MultiInstanceInvalidationClient.this, strArr);
            }
        });
    }
}
