package o;

import androidx.recyclerview.widget.RecyclerView;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;

/* loaded from: classes5.dex */
public class dnZ extends RecyclerView.AdapterDataObserver {
    private final RecyclerView e;

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
    }

    public dnZ(RecyclerView recyclerView) {
        this.e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        c().e(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        CardStackLayoutManager c = c();
        int b = c.b();
        if (c.getItemCount() == 0) {
            c.e(0);
        } else if (i < b) {
            c.e(Math.min(b - (b - i), c.getItemCount() - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        c().removeAllViews();
    }

    private CardStackLayoutManager c() {
        RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
        if (layoutManager instanceof CardStackLayoutManager) {
            return (CardStackLayoutManager) layoutManager;
        }
        throw new IllegalStateException("CardStackView must be set CardStackLayoutManager.");
    }
}
