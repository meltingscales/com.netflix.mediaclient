package androidx.compose.runtime;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import o.InterfaceC8554dpx;
import o.dpA;
import o.drO;

/* loaded from: classes.dex */
public final class ActualAndroid_androidKt {
    private static final InterfaceC8554dpx DefaultMonotonicFrameClock$delegate = dpA.d(new drO<MonotonicFrameClock>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final MonotonicFrameClock invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : SdkStubsFallbackFrameClock.INSTANCE;
        }
    });
    private static final long MainThreadId;

    public static final long getMainThreadId() {
        return MainThreadId;
    }

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        MainThreadId = j;
    }

    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t, snapshotMutationPolicy);
    }

    public static final MutableIntState createSnapshotMutableIntState(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final MutableLongState createSnapshotMutableLongState(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    public static final MutableFloatState createSnapshotMutableFloatState(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final void logError(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
