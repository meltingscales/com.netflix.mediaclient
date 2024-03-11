package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;

/* loaded from: classes2.dex */
public interface Scheduler {
    void cancel(String str);

    boolean hasLimitedSchedulingSlots();

    void schedule(WorkSpec... workSpecArr);
}
