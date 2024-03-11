package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: o.ya  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9893ya extends RecyclerView.ItemDecoration {
    private int a;
    private List<Integer> b;
    private final Drawable c;
    private final InterfaceC9640uH e;

    public final void a(int i) {
        this.a = i;
    }

    public final InterfaceC9640uH b() {
        return this.e;
    }

    public final int d() {
        return this.a;
    }

    private final void c(View view, int i) {
        int i2 = i + 1;
        if (this.b.size() == i2) {
            List<Integer> list = this.b;
            list.add(Integer.valueOf(list.get(i).intValue() + view.getMeasuredHeight()));
            return;
        }
        List<Integer> list2 = this.b;
        list2.set(i2, Integer.valueOf(list2.get(i).intValue() + view.getMeasuredHeight()));
    }

    private final Integer c(int i) {
        if (i == -1 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        View childAt;
        int childAdapterPosition;
        Integer c;
        int intValue;
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        if (recyclerView.getChildCount() <= 0 || (childAt = recyclerView.getChildAt(0)) == null || (c = c((childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)))) == null || (intValue = c.intValue()) >= this.c.getBounds().height()) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (childAt.getY() - intValue) + this.a);
        this.c.draw(canvas);
        canvas.restore();
        c(childAt, childAdapterPosition);
    }
}
