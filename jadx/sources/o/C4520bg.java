package o;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: o.bg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4520bg extends RecyclerView.RecycledViewPool {
    private final SparseArray<Queue<RecyclerView.ViewHolder>> b = new SparseArray<>();

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void clear() {
        this.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public RecyclerView.ViewHolder getRecycledView(int i) {
        Queue<RecyclerView.ViewHolder> queue = this.b.get(i);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        C8632dsu.c((Object) viewHolder, "");
        d(viewHolder.getItemViewType()).add(viewHolder);
    }

    private final Queue<RecyclerView.ViewHolder> d(int i) {
        Queue<RecyclerView.ViewHolder> queue = this.b.get(i);
        if (queue == null) {
            LinkedList linkedList = new LinkedList();
            this.b.put(i, linkedList);
            return linkedList;
        }
        return queue;
    }
}
