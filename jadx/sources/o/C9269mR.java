package o;

import com.bugsnag.android.internal.TaskType;

/* renamed from: o.mR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9269mR extends Thread {
    private final TaskType d;

    public final TaskType e() {
        return this.d;
    }

    public C9269mR(Runnable runnable, String str, TaskType taskType) {
        super(runnable, str);
        this.d = taskType;
    }
}
