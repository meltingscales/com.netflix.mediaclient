package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.C7939dav;

/* renamed from: o.dad  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7921dad extends RecyclerView.ItemDecoration {
    public static final b e = new b(null);
    private final Paint c;

    public C7921dad(Context context) {
        C8632dsu.c((Object) context, "");
        Paint paint = new Paint();
        paint.setColor(context.getColor(C7939dav.b.c));
        this.c = paint;
    }

    /* renamed from: o.dad$b */
    /* loaded from: classes5.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Object H;
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        if (recyclerView.getChildCount() > 0) {
            H = C8576dqs.H(C9703vR.e(recyclerView));
            View view = (View) H;
            if (view != null) {
                this.c.setAlpha(c(view));
                canvas.drawRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), this.c);
            }
        }
    }

    private final int c(View view) {
        int i;
        if (view.getHeight() > 0 && view.getY() < (view.getHeight() * (-1)) / 2.0f) {
            i = C8657dts.i((int) ((155 * (((view.getHeight() / 2.0f) + view.getY()) * (-1))) / (view.getHeight() / 4.0f)), 155);
            return i;
        }
        return 0;
    }
}
