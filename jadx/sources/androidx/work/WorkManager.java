package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes2.dex */
public abstract class WorkManager {
    public abstract Operation cancelUniqueWork(String str);

    public abstract Operation enqueue(List<? extends WorkRequest> list);

    public abstract Operation enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    public static WorkManager getInstance(Context context) {
        return WorkManagerImpl.getInstance(context);
    }

    public static void initialize(Context context, Configuration configuration) {
        WorkManagerImpl.initialize(context, configuration);
    }

    public final Operation enqueue(WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }
}
