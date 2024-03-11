package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;

/* loaded from: classes5.dex */
public class dnV extends RecyclerView {
    private final dnZ d;

    public dnV(Context context) {
        this(context, null);
    }

    public dnV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dnV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new dnZ(this);
        b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof CardStackLayoutManager) {
            super.setLayoutManager(layoutManager);
            return;
        }
        throw new IllegalArgumentException("CardStackView must be set CardStackLayoutManager.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (getLayoutManager() == null) {
            setLayoutManager(new CardStackLayoutManager(getContext()));
        }
        if (getAdapter() != null) {
            getAdapter().unregisterAdapterDataObserver(this.d);
            getAdapter().onDetachedFromRecyclerView(this);
        }
        adapter.registerAdapterDataObserver(this.d);
        super.setAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CardStackLayoutManager cardStackLayoutManager;
        if (motionEvent.getAction() == 0 && (cardStackLayoutManager = (CardStackLayoutManager) getLayoutManager()) != null) {
            cardStackLayoutManager.b(motionEvent.getX(), motionEvent.getY());
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void c() {
        if (getLayoutManager() instanceof CardStackLayoutManager) {
            smoothScrollToPosition(((CardStackLayoutManager) getLayoutManager()).b() + 1);
        }
    }

    private void b() {
        new C8506doc().attachToRecyclerView(this);
        setOverScrollMode(2);
    }
}
