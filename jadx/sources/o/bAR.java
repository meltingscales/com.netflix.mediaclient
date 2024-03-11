package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import o.C1030Lx;

/* loaded from: classes4.dex */
public final class bAR extends RecyclerView.ItemDecoration {
    public static final b d = new b(null);
    private final int a;
    private int b;
    private final int c;
    private final int e;
    private final TextPaint f;
    private StaticLayout g;
    private C9897ye h;
    private final int i;
    private int j;
    private int l;
    private final TextPaint n;

    /* renamed from: o  reason: collision with root package name */
    private StaticLayout f13492o;

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("CollectTastePayoffRowDecoration");
        }
    }

    public bAR(Context context, int i, int i2, int i3, int i4, String str, String str2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = i;
        this.e = i2;
        this.i = i3;
        this.a = i4;
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        C9897ye c9897ye = drawable != null ? new C9897ye(drawable, i2) : null;
        if (c9897ye == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.h = c9897ye;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        Typeface b2 = C1336Xt.b((Activity) C9737vz.b(context, Activity.class));
        int p = C8150deu.p(context);
        C1332Xp c1332Xp = C1332Xp.b;
        int applyDimension = (p - (i3 * 2)) - ((int) TypedValue.applyDimension(1, 32, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        textPaint2.setColor(context.getColor(C1030Lx.d.d));
        Paint.Style style = Paint.Style.FILL;
        textPaint2.setStyle(style);
        textPaint2.setTypeface(b2);
        textPaint2.setTextSize((int) TypedValue.applyDimension(1, 14, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        Paint.Align align = Paint.Align.CENTER;
        textPaint2.setTextAlign(align);
        StaticLayout c = c(str2, textPaint2, applyDimension);
        this.g = c;
        C8632dsu.d(c);
        int height = c.getHeight();
        float f = 21;
        this.j = ((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + height;
        textPaint.setColor(-1);
        textPaint.setStyle(style);
        textPaint.setTypeface(b2);
        textPaint.setTextSize((int) TypedValue.applyDimension(1, 24, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        textPaint.setTextAlign(align);
        StaticLayout c2 = c(str, textPaint, applyDimension);
        this.f13492o = c2;
        C8632dsu.d(c2);
        int height2 = c2.getHeight();
        float f2 = 8;
        this.l = ((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + height + ((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + height2;
        this.b = ((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + height + ((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + height2 + ((int) TypedValue.applyDimension(1, 25, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        View childAt = recyclerView.getChildAt(0);
        Rect rect = new Rect();
        recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
        Rect rect2 = new Rect(this.i, rect.top + this.a, recyclerView.getWidth() + this.i, rect.bottom + (this.a * 2));
        this.h.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.h.draw(canvas);
        int top = childAt.getTop();
        int i = this.j;
        StaticLayout staticLayout = this.g;
        C8632dsu.d(staticLayout);
        b(top, canvas, i, staticLayout);
        int top2 = childAt.getTop();
        int i2 = this.l;
        StaticLayout staticLayout2 = this.f13492o;
        C8632dsu.d(staticLayout2);
        b(top2, canvas, i2, staticLayout2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            if (recyclerView.getLayoutDirection() == 1) {
                rect.set(0, this.b, this.i, this.a);
                return;
            } else {
                rect.set(this.i, this.b, 0, this.a);
                return;
            }
        }
        rect.set(0, this.b, 0, this.a);
    }

    private final void b(int i, Canvas canvas, int i2, StaticLayout staticLayout) {
        canvas.save();
        canvas.translate(canvas.getWidth() / 2, i - i2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private final StaticLayout c(String str, TextPaint textPaint, int i) {
        Layout.Alignment alignment;
        if (C8310dhv.a()) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        return SK.b(str, 0, str.length(), textPaint, i, alignment, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i, 3);
    }
}
