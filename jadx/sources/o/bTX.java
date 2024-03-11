package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.LolomoRecyclerView;
import com.netflix.model.leafs.ArtworkColors;
import o.dpR;

/* loaded from: classes4.dex */
public final class bTX extends bLI implements InterfaceC9907yo, InterfaceC6373ccA {
    public static final e j = new e(null);
    private View f;
    private boolean g;
    private final b h;
    private drM<? super View, dpR> i;
    private Drawable n;

    /* renamed from: o  reason: collision with root package name */
    private C9893ya f13542o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bTX(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bTX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.InterfaceC9907yo
    /* renamed from: c */
    public bTX d() {
        return this;
    }

    public View f() {
        return this.f;
    }

    public final C9893ya g() {
        return this.f13542o;
    }

    public final void setOnHeaderViewChanged(drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.i = drm;
    }

    public /* synthetic */ bTX(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bTX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.h = new b();
        this.g = true;
        this.i = new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyRecyclerView$onHeaderViewChanged$1
            public final void a(View view) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                a(view);
                return dpR.c;
            }
        };
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("LolomoEpoxyRecyclerView");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.ItemDecoration {
        private final Paint a;

        b() {
            Paint paint = new Paint();
            paint.setColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
            paint.setAlpha(89);
            this.a = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            C8632dsu.c((Object) canvas, "");
            C8632dsu.c((Object) recyclerView, "");
            C8632dsu.c((Object) state, "");
            canvas.drawRect(0.0f, 0.0f, recyclerView.getWidth(), recyclerView.getHeight(), this.a);
        }
    }

    public final void setCanBrowse(boolean z) {
        if (this.g != z) {
            setInteractionsLocked(!z);
            if (z) {
                removeItemDecoration(this.h);
            } else {
                addItemDecoration(this.h);
            }
            this.g = z;
        }
    }

    public void setBackgroundItemDecoration(C9893ya c9893ya) {
        C8632dsu.c((Object) c9893ya, "");
        e();
        addItemDecoration(c9893ya);
        this.f13542o = c9893ya;
        invalidate();
    }

    @Override // o.InterfaceC9907yo
    public Drawable a() {
        return getBackground();
    }

    @Override // o.InterfaceC9907yo
    public void setStaticBackground(Drawable drawable) {
        this.n = drawable;
        setBackground(drawable);
    }

    @Override // o.InterfaceC9907yo
    public void e() {
        C9893ya c9893ya = this.f13542o;
        if (c9893ya != null) {
            removeItemDecoration(c9893ya);
            this.f13542o = null;
        }
    }

    @Override // o.InterfaceC6373ccA
    public void setHeaderView(View view) {
        boolean c = C8632dsu.c(this.f, view);
        this.f = view;
        if (!c) {
            this.i.invoke(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, o.InterfaceC6373ccA
    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof LolomoRecyclerView.SavedState) {
            parcelable = ((LolomoRecyclerView.SavedState) parcelable).getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }
}
