package o;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.lomo.CwView;
import java.util.Map;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cdC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6428cdC extends CwView {
    private NetflixImageView f;
    private final Drawable h;
    private final NetflixActivity i;
    private View j;
    private ImageView k;
    private Drawable l;
    private final Drawable m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private C6521ceq f13719o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6428cdC(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6428cdC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // com.netflix.mediaclient.ui.lomo.CwView
    public int a() {
        return com.netflix.mediaclient.ui.R.i.B;
    }

    public /* synthetic */ C6428cdC(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6428cdC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.i = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        this.h = ResourcesCompat.getDrawable(context.getResources(), com.netflix.mediaclient.ui.R.e.x, context.getTheme());
        this.m = ResourcesCompat.getDrawable(context.getResources(), C9834xU.j.q, context.getTheme());
    }

    @Override // com.netflix.mediaclient.ui.lomo.CwView
    public void b() {
        super.b();
        View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.aJ);
        C8632dsu.a(findViewById, "");
        this.f = (NetflixImageView) findViewById;
        View findViewById2 = findViewById(com.netflix.mediaclient.ui.R.g.aK);
        C8632dsu.a(findViewById2, "");
        this.j = findViewById2;
        j();
        Drawable drawable = getContext().getDrawable(C9834xU.j.N);
        NetflixImageView netflixImageView = null;
        if (drawable != null) {
            NetflixImageView netflixImageView2 = this.f;
            if (netflixImageView2 == null) {
                C8632dsu.d("");
                netflixImageView2 = null;
            }
            NetflixImageView.addOverlay$default(netflixImageView2, drawable, 0, 2, null);
        }
        Drawable drawable2 = this.m;
        this.l = drawable2;
        if (drawable2 != null) {
            NetflixImageView netflixImageView3 = this.f;
            if (netflixImageView3 == null) {
                C8632dsu.d("");
            } else {
                netflixImageView = netflixImageView3;
            }
            netflixImageView.addOverlay(drawable2, 17);
            this.n = true;
        }
        this.k = (ImageView) findViewById(com.netflix.mediaclient.ui.R.g.aL);
        this.f13719o = new C6521ceq((NetflixActivity) C8141del.d(getContext(), NetflixActivity.class), this);
        ImageView imageView = this.k;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    /* renamed from: o.cdC$a */
    /* loaded from: classes4.dex */
    public static final class a extends ViewOutlineProvider {
        private final Rect a = new Rect();
        final /* synthetic */ float e;

        a(float f) {
            this.e = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            boolean z;
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) outline, "");
            Rect rect = this.a;
            View view2 = C6428cdC.this.j;
            View view3 = null;
            if (view2 == null) {
                C8632dsu.d("");
                view2 = null;
            }
            rect.top = view2.getPaddingTop() - ((int) this.e);
            Rect rect2 = this.a;
            View view4 = C6428cdC.this.j;
            if (view4 == null) {
                C8632dsu.d("");
                view4 = null;
            }
            rect2.left = view4.getPaddingLeft();
            Rect rect3 = this.a;
            View view5 = C6428cdC.this.j;
            if (view5 == null) {
                C8632dsu.d("");
                view5 = null;
            }
            int measuredWidth = view5.getMeasuredWidth();
            View view6 = C6428cdC.this.j;
            if (view6 == null) {
                C8632dsu.d("");
                view6 = null;
            }
            rect3.right = measuredWidth - view6.getPaddingRight();
            Rect rect4 = this.a;
            View view7 = C6428cdC.this.j;
            if (view7 == null) {
                C8632dsu.d("");
                view7 = null;
            }
            int measuredHeight = view7.getMeasuredHeight();
            View view8 = C6428cdC.this.j;
            if (view8 == null) {
                C8632dsu.d("");
                view8 = null;
            }
            rect4.bottom = measuredHeight - view8.getPaddingBottom();
            View view9 = C6428cdC.this.j;
            if (view9 == null) {
                C8632dsu.d("");
                view9 = null;
            }
            View view10 = C6428cdC.this.j;
            if (view10 == null) {
                C8632dsu.d("");
            } else {
                view3 = view10;
            }
            if (view3.getBackground() != null) {
                float f = this.e;
                if (f > 0.0f) {
                    outline.setRoundRect(this.a, f);
                    z = true;
                    view9.setClipToOutline(z);
                }
            }
            z = false;
            view9.setClipToOutline(z);
        }
    }

    private final void j() {
        float dimension = getResources().getDimension(C9834xU.a.s);
        View view = this.j;
        if (view == null) {
            C8632dsu.d("");
            view = null;
        }
        view.setOutlineProvider(new a(dimension));
    }

    @Override // com.netflix.mediaclient.ui.lomo.CwView, o.InterfaceC6434cdI.c
    /* renamed from: b */
    public void c(InterfaceC5179btq interfaceC5179btq, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        C8632dsu.c((Object) interfaceC5179btq, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        super.c(interfaceC5179btq, interfaceC5149btM, trackingInfoHolder, i, z);
        C9726vo.d(this.k, interfaceC5179btq, new drX<ImageView, InterfaceC5179btq, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.CwViewWithMenu$update$1
            {
                super(2);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[ORIG_RETURN, RETURN] */
            @Override // o.drX
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final o.dpR invoke(android.widget.ImageView r5, o.InterfaceC5179btq r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r5, r0)
                    o.C8632dsu.c(r6, r0)
                    java.lang.String r1 = r6.getTitle()
                    if (r1 == 0) goto L37
                    boolean r2 = o.C8684dus.a(r1)
                    if (r2 == 0) goto L15
                    goto L37
                L15:
                    o.dsE r2 = o.dsE.b
                    o.cdC r2 = o.C6428cdC.this
                    android.content.res.Resources r2 = r2.getResources()
                    int r3 = com.netflix.mediaclient.ui.R.o.z
                    java.lang.String r2 = r2.getString(r3)
                    o.C8632dsu.a(r2, r0)
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    r3 = 1
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
                    java.lang.String r1 = java.lang.String.format(r2, r1)
                    o.C8632dsu.a(r1, r0)
                    goto L43
                L37:
                    o.cdC r0 = o.C6428cdC.this
                    android.content.res.Resources r0 = r0.getResources()
                    int r1 = com.netflix.mediaclient.ui.R.o.ly
                    java.lang.String r1 = r0.getString(r1)
                L43:
                    r5.setContentDescription(r1)
                    o.cdC r0 = o.C6428cdC.this
                    o.ceq r0 = o.C6428cdC.c(r0)
                    if (r0 == 0) goto L58
                    o.cdC r1 = o.C6428cdC.this
                    com.netflix.mediaclient.clutils.TrackingInfoHolder r1 = r1.c
                    r0.d(r5, r6, r1)
                    o.dpR r5 = o.dpR.c
                    goto L59
                L58:
                    r5 = 0
                L59:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.lomo.CwViewWithMenu$update$1.invoke(android.widget.ImageView, o.btq):o.dpR");
            }
        });
        k();
    }

    private final boolean i() {
        NetflixActivity netflixActivity = this.i;
        return (netflixActivity == null || !C1584aGs.d(netflixActivity).g() || this.b.isPlayable()) ? false : true;
    }

    private final void k() {
        Drawable drawable;
        Drawable drawable2;
        NetflixImageView netflixImageView = null;
        if (i()) {
            boolean z = this.n;
            if (z && this.h == this.l) {
                return;
            }
            if (z && (drawable2 = this.l) != null) {
                NetflixImageView netflixImageView2 = this.f;
                if (netflixImageView2 == null) {
                    C8632dsu.d("");
                    netflixImageView2 = null;
                }
                netflixImageView2.removeOverlay(drawable2);
            }
            this.l = this.h;
        } else {
            boolean z2 = this.n;
            if (z2 && this.m == this.l) {
                return;
            }
            if (z2 && (drawable = this.l) != null) {
                NetflixImageView netflixImageView3 = this.f;
                if (netflixImageView3 == null) {
                    C8632dsu.d("");
                    netflixImageView3 = null;
                }
                netflixImageView3.removeOverlay(drawable);
            }
            this.l = this.m;
        }
        Drawable drawable3 = this.l;
        if (drawable3 != null) {
            NetflixImageView netflixImageView4 = this.f;
            if (netflixImageView4 == null) {
                C8632dsu.d("");
            } else {
                netflixImageView = netflixImageView4;
            }
            netflixImageView.addOverlay(drawable3, 17);
            this.n = true;
        }
    }

    @Override // com.netflix.mediaclient.ui.lomo.CwView, o.InterfaceC6434cdI.c
    public boolean c() {
        NetflixImageView netflixImageView = this.f;
        if (netflixImageView == null) {
            C8632dsu.d("");
            netflixImageView = null;
        }
        return netflixImageView.isImageContentMissingForPresentationTracking();
    }

    @Override // com.netflix.mediaclient.ui.lomo.CwView
    public void b(InterfaceC5149btM interfaceC5149btM, boolean z) {
        Map d;
        Map k;
        Throwable th;
        boolean g;
        String e = e(this.b, interfaceC5149btM);
        if (e != null) {
            g = C8691duz.g(e);
            if (!g) {
                NetflixImageView netflixImageView = this.f;
                if (netflixImageView == null) {
                    C8632dsu.d("");
                    netflixImageView = null;
                }
                netflixImageView.showImage(new ShowImageRequest().a(e).j(z));
                return;
            }
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("image url is empty, CwView.loadImage", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
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
