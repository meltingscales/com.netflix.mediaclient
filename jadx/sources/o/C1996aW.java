package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1996aW extends RecyclerView.AdapterDataObserver {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        if (!this.a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
