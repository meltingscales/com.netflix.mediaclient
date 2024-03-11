package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C1218Tf;
import o.C1219Tg;
import o.C1596aHd;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;

/* renamed from: o.Tg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1219Tg extends RecyclerView.ItemDecoration implements Drawable.Callback {
    public static final e a = new e(null);
    public static final int d = 8;
    private final C1218Tf b;
    private int c;
    private int e;
    private final RecyclerView h;

    public /* synthetic */ C1219Tg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Typeface typeface, int i9, int i10, RecyclerView recyclerView, C8627dsp c8627dsp) {
        this(i, i2, i3, i4, i5, i6, i7, i8, typeface, i9, i10, recyclerView);
    }

    public final void d(int i) {
        this.e = i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) runnable, "");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) runnable, "");
    }

    private C1219Tg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Typeface typeface, int i9, int i10, RecyclerView recyclerView) {
        this.e = i10;
        this.h = recyclerView;
        C1332Xp c1332Xp = C1332Xp.b;
        C1218Tf c1218Tf = new C1218Tf(i2, i3, i, i8, i4, i5, i6, i7, (int) TypedValue.applyDimension(1, 24, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), typeface, i9, false, 2048, null);
        this.b = c1218Tf;
        c1218Tf.setCallback(this);
        this.c = -1;
    }

    /* renamed from: o.Tg$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("CarouselPageIndicatorItemDecoration");
        }

        public static /* synthetic */ C1219Tg a(e eVar, RecyclerView recyclerView, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Typeface typeface, int i11, Object obj) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = (i11 & 2) != 0 ? C9834xU.h.n : i;
            int i19 = (i11 & 4) != 0 ? -1 : i2;
            int argb = (i11 & 8) != 0 ? Color.argb(127, 216, 216, 216) : i3;
            int i20 = (i11 & 16) == 0 ? i4 : -1;
            if ((i11 & 32) != 0) {
                C1332Xp c1332Xp = C1332Xp.b;
                i12 = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            } else {
                i12 = i5;
            }
            if ((i11 & 64) != 0) {
                C1332Xp c1332Xp2 = C1332Xp.b;
                i13 = (int) TypedValue.applyDimension(1, 3, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            } else {
                i13 = i6;
            }
            if ((i11 & 128) != 0) {
                C1332Xp c1332Xp3 = C1332Xp.b;
                i14 = (int) TypedValue.applyDimension(1, 2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            } else {
                i14 = i7;
            }
            if ((i11 & JSONzip.end) != 0) {
                C1332Xp c1332Xp4 = C1332Xp.b;
                i15 = (int) TypedValue.applyDimension(1, 6, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            } else {
                i15 = i8;
            }
            if ((i11 & 512) != 0) {
                C1332Xp c1332Xp5 = C1332Xp.b;
                i16 = (int) TypedValue.applyDimension(2, 12, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            } else {
                i16 = i9;
            }
            if ((i11 & 1024) != 0) {
                C1332Xp c1332Xp6 = C1332Xp.b;
                i17 = (int) TypedValue.applyDimension(1, 24, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            } else {
                i17 = i10;
            }
            return eVar.b(recyclerView, i18, i19, argb, i20, i12, i13, i14, i15, i16, i17, (i11 & 2048) != 0 ? C1336Xt.b((Activity) C9737vz.b(recyclerView.getContext(), Activity.class)) : typeface);
        }

        public final C1219Tg b(RecyclerView recyclerView, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Typeface typeface) {
            C8632dsu.c((Object) recyclerView, "");
            C1219Tg c1219Tg = new C1219Tg(i2, i3, i4, i5, i6, i7, i8, i9, typeface, i, i10, recyclerView, null);
            recyclerView.addItemDecoration(c1219Tg);
            return c1219Tg;
        }
    }

    public final void c(int i) {
        if (i != this.c) {
            this.c = i;
            this.b.e(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        rect.bottom = this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(final Canvas canvas, final RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C9726vo.d(adapter, layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null, recyclerView.getChildAt(0), new InterfaceC8612dsa<RecyclerView.Adapter, LinearLayoutManager, View, dpR>() { // from class: com.netflix.mediaclient.android.widget.carousel.CarouselPageIndicatorItemDecoration$onDrawOver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(RecyclerView.Adapter adapter2, LinearLayoutManager linearLayoutManager, View view) {
                c(adapter2, linearLayoutManager, view);
                return dpR.c;
            }

            public final void c(RecyclerView.Adapter adapter2, LinearLayoutManager linearLayoutManager, View view) {
                int findFirstVisibleItemPosition;
                int findLastVisibleItemPosition;
                int i;
                float f;
                C1218Tf c1218Tf;
                C1218Tf c1218Tf2;
                C1218Tf c1218Tf3;
                C1218Tf c1218Tf4;
                C1218Tf c1218Tf5;
                C1218Tf c1218Tf6;
                Map d2;
                Map k;
                Throwable th;
                C8632dsu.c((Object) adapter2, "");
                C8632dsu.c((Object) linearLayoutManager, "");
                C8632dsu.c((Object) view, "");
                boolean z = RecyclerView.this.getLayoutDirection() == 1;
                if (z) {
                    findFirstVisibleItemPosition = (adapter2.getItemCount() - 1) - linearLayoutManager.findLastVisibleItemPosition();
                    findLastVisibleItemPosition = (adapter2.getItemCount() - 1) - linearLayoutManager.findFirstVisibleItemPosition();
                    i = 0;
                } else {
                    findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    i = 1;
                }
                boolean z2 = findFirstVisibleItemPosition == findLastVisibleItemPosition;
                if (!z2) {
                    if (!z2) {
                        View childAt = RecyclerView.this.getChildAt(i);
                        if (childAt != null) {
                            RecyclerView recyclerView2 = RecyclerView.this;
                            f = (1.0f / recyclerView2.getWidth()) * (recyclerView2.getWidth() - childAt.getX());
                            c1218Tf = this.b;
                            c1218Tf.getBounds().top = 0;
                            c1218Tf2 = this.b;
                            c1218Tf2.getBounds().left = 0;
                            c1218Tf3 = this.b;
                            c1218Tf3.getBounds().right = RecyclerView.this.getWidth();
                            c1218Tf4 = this.b;
                            c1218Tf4.getBounds().bottom = RecyclerView.this.getHeight();
                            c1218Tf5 = this.b;
                            c1218Tf5.c(findFirstVisibleItemPosition, adapter2.getItemCount(), Math.max(0.0f, f), z);
                            c1218Tf6 = this.b;
                            c1218Tf6.draw(canvas);
                        }
                        RecyclerView recyclerView3 = RecyclerView.this;
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        String str = C1219Tg.a.getLogTag() + " first=" + findFirstVisibleItemPosition + " last=" + findLastVisibleItemPosition + " childCount=" + recyclerView3.getChildCount();
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            c1596aHd.e.put("errorType", errorType.c());
                            String b = c1596aHd.b();
                            if (b != null) {
                                c1596aHd.a(errorType.c() + " " + b);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th = new Throwable(c1596aHd.b());
                        } else {
                            th = c1596aHd.i;
                            if (th == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar.a();
                        if (a2 != null) {
                            a2.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                f = 0.0f;
                c1218Tf = this.b;
                c1218Tf.getBounds().top = 0;
                c1218Tf2 = this.b;
                c1218Tf2.getBounds().left = 0;
                c1218Tf3 = this.b;
                c1218Tf3.getBounds().right = RecyclerView.this.getWidth();
                c1218Tf4 = this.b;
                c1218Tf4.getBounds().bottom = RecyclerView.this.getHeight();
                c1218Tf5 = this.b;
                c1218Tf5.c(findFirstVisibleItemPosition, adapter2.getItemCount(), Math.max(0.0f, f), z);
                c1218Tf6 = this.b;
                c1218Tf6.draw(canvas);
            }
        });
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        C8632dsu.c((Object) drawable, "");
        if (C8632dsu.c(drawable, this.b)) {
            this.h.invalidate();
        }
    }
}
