package o;

import android.graphics.Canvas;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: o.aC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1457aC extends ItemTouchHelper.Callback {
    protected abstract void a(C1511aE c1511aE, int i);

    protected abstract boolean b(RecyclerView recyclerView, C1511aE c1511aE, C1511aE c1511aE2);

    protected abstract int e(RecyclerView recyclerView, C1511aE c1511aE);

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        return e(recyclerView, (C1511aE) viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        C8632dsu.c((Object) viewHolder2, "");
        return b(recyclerView, (C1511aE) viewHolder, (C1511aE) viewHolder2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        C8632dsu.c((Object) viewHolder, "");
        a((C1511aE) viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        C8632dsu.c((Object) viewHolder2, "");
        return d(recyclerView, (C1511aE) viewHolder, (C1511aE) viewHolder2);
    }

    protected boolean d(RecyclerView recyclerView, C1511aE c1511aE, C1511aE c1511aE2) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) c1511aE, "");
        C8632dsu.c((Object) c1511aE2, "");
        return super.canDropOver(recyclerView, c1511aE, c1511aE2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        C8632dsu.c((Object) viewHolder, "");
        return e((C1511aE) viewHolder);
    }

    protected float e(C1511aE c1511aE) {
        C8632dsu.c((Object) c1511aE, "");
        return super.getSwipeThreshold(c1511aE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        C8632dsu.c((Object) viewHolder, "");
        return a((C1511aE) viewHolder);
    }

    protected final float a(C1511aE c1511aE) {
        C8632dsu.c((Object) c1511aE, "");
        return super.getMoveThreshold(c1511aE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: a */
    public C1511aE chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<? extends RecyclerView.ViewHolder> list, int i, int i2) {
        C8632dsu.c((Object) viewHolder, "");
        C8632dsu.c((Object) list, "");
        return c((C1511aE) viewHolder, list, i, i2);
    }

    protected final C1511aE c(C1511aE c1511aE, List<? extends C1511aE> list, int i, int i2) {
        C8632dsu.c((Object) c1511aE, "");
        C8632dsu.c((Object) list, "");
        RecyclerView.ViewHolder chooseDropTarget = super.chooseDropTarget(c1511aE, list, i, i2);
        if (chooseDropTarget instanceof C1511aE) {
            return (C1511aE) chooseDropTarget;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        d((C1511aE) viewHolder, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(C1511aE c1511aE, int i) {
        super.onSelectedChanged(c1511aE, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        C8632dsu.c((Object) viewHolder2, "");
        d(recyclerView, (C1511aE) viewHolder, i, (C1511aE) viewHolder2, i2, i3, i4);
    }

    protected final void d(RecyclerView recyclerView, C1511aE c1511aE, int i, C1511aE c1511aE2, int i2, int i3, int i4) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) c1511aE, "");
        C8632dsu.c((Object) c1511aE2, "");
        super.onMoved(recyclerView, c1511aE, i, c1511aE2, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        d(recyclerView, (C1511aE) viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(RecyclerView recyclerView, C1511aE c1511aE) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) c1511aE, "");
        super.clearView(recyclerView, c1511aE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        a(canvas, recyclerView, (C1511aE) viewHolder, f, f2, i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Canvas canvas, RecyclerView recyclerView, C1511aE c1511aE, float f, float f2, int i, boolean z) {
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) c1511aE, "");
        super.onChildDraw(canvas, recyclerView, c1511aE, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) viewHolder, "");
        e(canvas, recyclerView, viewHolder instanceof C1511aE ? (C1511aE) viewHolder : null, f, f2, i, z);
    }

    protected final void e(Canvas canvas, RecyclerView recyclerView, C1511aE c1511aE, float f, float f2, int i, boolean z) {
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.d(c1511aE);
        super.onChildDrawOver(canvas, recyclerView, c1511aE, f, f2, i, z);
    }
}
