package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cbT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6339cbT extends BaseVerticalRecyclerViewAdapter.d {
    private final View d;
    private final AnimatedVectorDrawableCompat e;
    public static final e c = new e(null);
    public static final int a = 8;

    public /* synthetic */ C6339cbT(View view, C8627dsp c8627dsp) {
        this(view);
    }

    public static final C6339cbT c(ViewGroup viewGroup) {
        return c.d(viewGroup);
    }

    private C6339cbT(View view) {
        super(view);
        View findViewById = view.findViewById(com.netflix.mediaclient.ui.R.g.dt);
        this.d = findViewById;
        AnimatedVectorDrawableCompat create = AnimatedVectorDrawableCompat.create(findViewById.getContext(), com.netflix.mediaclient.ui.R.e.b);
        C8632dsu.d(create);
        this.e = create;
        findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.cbV
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C6339cbT.b(C6339cbT.this, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* renamed from: o.cbT$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AnimatedLoadingMoreRowViewHolder");
        }

        public final C6339cbT d(ViewGroup viewGroup) {
            C8632dsu.c((Object) viewGroup, "");
            View view = new View(viewGroup.getContext());
            view.setId(com.netflix.mediaclient.ui.R.g.dt);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.addView(view);
            frameLayout.setClipChildren(false);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) viewGroup.getContext().getResources().getDimension(com.netflix.mediaclient.ui.R.b.u)));
            return new C6339cbT(frameLayout, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C6339cbT c6339cbT, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8632dsu.c((Object) c6339cbT, "");
        if (i == i5 && i3 == i7) {
            return;
        }
        View view2 = c6339cbT.d;
        C8632dsu.a(view2, "");
        C9870yD.c(view2, c6339cbT.e, i3 - i);
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.d
    public void a() {
        b();
        super.a();
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.d
    public void d() {
        c();
        super.d();
    }

    private final void b() {
        Map d;
        Map k;
        Throwable th;
        if (C8141del.a()) {
            return;
        }
        try {
            if (this.e.isRunning()) {
                return;
            }
            this.d.setBackground(this.e);
            this.e.start();
        } catch (Exception e2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Unable to load avd_lolomo_single_row_loading_more_skeleton", e2, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
        }
    }

    private final void c() {
        if (C8141del.a()) {
            return;
        }
        Drawable background = this.d.getBackground();
        if (background instanceof AnimatedVectorDrawableCompat) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) background;
            if (animatedVectorDrawableCompat.isRunning()) {
                animatedVectorDrawableCompat.stop();
            }
        }
        this.d.setBackground(null);
    }
}
