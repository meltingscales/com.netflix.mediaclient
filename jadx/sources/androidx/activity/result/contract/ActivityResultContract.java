package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {
    public abstract Intent createIntent(Context context, I i);

    public SynchronousResult<O> getSynchronousResult(Context context, I i) {
        C8632dsu.c((Object) context, "");
        return null;
    }

    public abstract O parseResult(int i, Intent intent);

    /* loaded from: classes.dex */
    public static final class SynchronousResult<T> {
        private final T value;

        public final T getValue() {
            return this.value;
        }

        public SynchronousResult(T t) {
            this.value = t;
        }
    }
}
