package o;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.NotImplementedError;

/* renamed from: o.deK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8114deK<T> extends Task<T> {
    private final Throwable b;

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) onFailureListener, "");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnFailureListener(OnFailureListener onFailureListener) {
        C8632dsu.c((Object) onFailureListener, "");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) onFailureListener, "");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnSuccessListener(Activity activity, OnSuccessListener<? super T> onSuccessListener) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) onSuccessListener, "");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnSuccessListener(OnSuccessListener<? super T> onSuccessListener) {
        C8632dsu.c((Object) onSuccessListener, "");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnSuccessListener(Executor executor, OnSuccessListener<? super T> onSuccessListener) {
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) onSuccessListener, "");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return true;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return false;
    }

    public C8114deK(Throwable th) {
        C8632dsu.c((Object) th, "");
        this.b = th;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        Throwable th = this.b;
        if (th == null) {
            return null;
        }
        if (th instanceof Exception) {
            return (Exception) th;
        }
        return new RuntimeException(this.b);
    }

    @Override // com.google.android.gms.tasks.Task
    public T getResult() {
        throw new NotImplementedError("An operation is not implemented: Not supported");
    }

    @Override // com.google.android.gms.tasks.Task
    public <X extends Throwable> T getResult(Class<X> cls) {
        C8632dsu.c((Object) cls, "");
        throw new NotImplementedError("An operation is not implemented: Not supported");
    }
}
