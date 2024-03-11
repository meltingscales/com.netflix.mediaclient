package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class cAD extends RecyclerView.ItemDecoration {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    public static final e e = new e(null);
    private final int g;
    private final int h;
    private final Paint i;
    private final Interpolator j = new AccelerateDecelerateInterpolator();

    public cAD(int i, int i2) {
        this.h = i;
        this.g = i2;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStrokeWidth(b);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        super.onDrawOver(canvas, recyclerView, state);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i = c;
        int max = (i * itemCount) + (Math.max(0, itemCount - 1) * a);
        float width = (recyclerView.getWidth() - max) / 2.0f;
        float height = recyclerView.getHeight() - (d / 2.0f);
        a(canvas, width, height, itemCount);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C8632dsu.d(layoutManager);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        boolean z = linearLayoutManager.getLayoutDirection() == 1;
        int findLastVisibleItemPosition = z ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
        if (findLastVisibleItemPosition == -1) {
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findLastVisibleItemPosition);
        float interpolation = this.j.getInterpolation(((findViewByPosition != null ? findViewByPosition.getLeft() : 0) * (-1)) / (findViewByPosition != null ? findViewByPosition.getWidth() : 0));
        if (z) {
            C1332Xp c1332Xp = C1332Xp.b;
            f = ((recyclerView.getWidth() + max) / 2.0f) - ((i + ((int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()))) / 2);
        } else {
            f = width;
        }
        c(canvas, f, height, findLastVisibleItemPosition, interpolation, z);
    }

    private final void a(Canvas canvas, float f, float f2, int i) {
        this.i.setColor(this.g);
        int i2 = c;
        int i3 = a;
        for (int i4 = 0; i4 < i; i4++) {
            canvas.drawCircle(f, f2, c / 2.0f, this.i);
            f += i2 + i3;
        }
    }

    private final void c(Canvas canvas, float f, float f2, int i, float f3, boolean z) {
        this.i.setColor(this.h);
        int i2 = c;
        int i3 = a;
        float f4 = (i2 + i3) * i;
        float f5 = z ? f - f4 : f + f4;
        if (f3 == 0.0f) {
            canvas.drawCircle(f5, f2, i2 / 2.0f, this.i);
            return;
        }
        float f6 = i2;
        canvas.drawCircle(f5 + (f6 * f3) + (i3 * f3), f2, f6 / 2.0f, this.i);
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        d = (int) TypedValue.applyDimension(1, 36, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        float f = 4;
        b = (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        c = (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        a = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }
}
