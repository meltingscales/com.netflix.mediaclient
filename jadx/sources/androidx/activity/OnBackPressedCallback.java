package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private drO<dpR> enabledChangedCallback;
    private boolean isEnabled;

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabledChangedCallback$activity_release(drO<dpR> dro) {
        this.enabledChangedCallback = dro;
    }

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        drO<dpR> dro = this.enabledChangedCallback;
        if (dro != null) {
            dro.invoke();
        }
    }

    public final void addCancellable(Cancellable cancellable) {
        C8632dsu.c((Object) cancellable, "");
        this.cancellables.add(cancellable);
    }

    public final void removeCancellable(Cancellable cancellable) {
        C8632dsu.c((Object) cancellable, "");
        this.cancellables.remove(cancellable);
    }

    public final void remove() {
        for (Cancellable cancellable : this.cancellables) {
            cancellable.cancel();
        }
    }
}
