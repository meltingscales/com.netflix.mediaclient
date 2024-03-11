package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.ums.ThemeAsset;
import com.netflix.mediaclient.ui.ums.UserMessageAreaThemedTooltip;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.List;
import o.C6198cXm;
import o.dpR;

/* renamed from: o.cXm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6198cXm extends UserMessageAreaView {
    public static final d c = new d(null);
    public static final int e = 8;
    private final ImageResolutionClass a;
    private ThemeAsset b;
    private final InterfaceC8554dpx d;

    /* renamed from: o.cXm$b */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[UserMessageAreaView.MessageType.values().length];
            try {
                iArr[UserMessageAreaView.MessageType.TOOLTIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserMessageAreaView.MessageType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserMessageAreaView.MessageType.SHEET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
            int[] iArr2 = new int[ThemeAsset.values().length];
            try {
                iArr2[ThemeAsset.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr2;
            int[] iArr3 = new int[ImageResolutionClass.values().length];
            try {
                iArr3[ImageResolutionClass.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ImageResolutionClass.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ImageResolutionClass.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr3;
        }
    }

    public static final C6198cXm c(Context context, ImageResolutionClass imageResolutionClass, ViewGroup viewGroup, View view, UserMessageAreaThemedTooltip.TooltipDirection tooltipDirection) {
        return c.d(context, imageResolutionClass, viewGroup, view, tooltipDirection);
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public boolean bL_() {
        return false;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public boolean l() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6198cXm(Context context, UserMessageAreaView.MessageType messageType, ImageResolutionClass imageResolutionClass) {
        super(context, messageType);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) messageType, "");
        this.a = imageResolutionClass;
        b2 = dpB.b(new drO<UserMessageAreaThemedTooltip>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaThemedView$tooltip$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final UserMessageAreaThemedTooltip invoke() {
                return (UserMessageAreaThemedTooltip) C6198cXm.this.findViewById(R.g.gN);
            }
        });
        this.d = b2;
        if (messageType == UserMessageAreaView.MessageType.TOOLTIP) {
            setVisibility(8);
        }
    }

    /* renamed from: o.cXm$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C6198cXm d(Context context, ImageResolutionClass imageResolutionClass, ViewGroup viewGroup, View view, UserMessageAreaThemedTooltip.TooltipDirection tooltipDirection) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) tooltipDirection, "");
            C6198cXm c6198cXm = new C6198cXm(context, UserMessageAreaView.MessageType.TOOLTIP, imageResolutionClass);
            viewGroup.addView(c6198cXm, -1, -2);
            c6198cXm.setGravity(1);
            c6198cXm.d(view, tooltipDirection);
            return c6198cXm;
        }

        public final C6198cXm b(Context context, ImageResolutionClass imageResolutionClass) {
            C8632dsu.c((Object) context, "");
            return new C6198cXm(context, UserMessageAreaView.MessageType.BANNER, imageResolutionClass);
        }

        public final C6198cXm e(Context context, ImageResolutionClass imageResolutionClass) {
            C8632dsu.c((Object) context, "");
            return new C6198cXm(context, UserMessageAreaView.MessageType.DIALOG, imageResolutionClass);
        }

        public final C6198cXm a(Context context, ImageResolutionClass imageResolutionClass) {
            C8632dsu.c((Object) context, "");
            return new C6198cXm(context, UserMessageAreaView.MessageType.SHEET, imageResolutionClass);
        }
    }

    public final UserMessageAreaThemedTooltip n() {
        return (UserMessageAreaThemedTooltip) this.d.getValue();
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int j() {
        UserMessageAreaView.MessageType messageType = this.f13325o;
        int i = messageType == null ? -1 : b.d[messageType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? com.netflix.mediaclient.ui.R.i.bF : com.netflix.mediaclient.ui.R.i.bI : com.netflix.mediaclient.ui.R.i.bH : com.netflix.mediaclient.ui.R.i.bM;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public boolean b(String str) {
        Drawable a2 = str != null ? a(str) : null;
        if (a2 == null) {
            return super.b(str);
        }
        this.h.setImageDrawable(a2);
        return true;
    }

    private final Drawable a(String str) {
        int i;
        Integer c2;
        int i2;
        UserMessageAreaView.MessageType messageType = this.f13325o;
        if (messageType == UserMessageAreaView.MessageType.BANNER || messageType == UserMessageAreaView.MessageType.TOOLTIP) {
            if (C8632dsu.c((Object) str, (Object) "gift")) {
                i = com.netflix.mediaclient.ui.R.e.G;
            } else {
                i = C8632dsu.c((Object) str, (Object) "shield") ? com.netflix.mediaclient.ui.R.e.ah : com.netflix.mediaclient.ui.R.e.p;
            }
            ThemeAsset themeAsset = this.b;
            if (themeAsset != null && (c2 = themeAsset.c()) != null) {
                return new LayerDrawable(new Drawable[]{ResourcesCompat.getDrawable(getResources(), c2.intValue(), getContext().getTheme()), ResourcesCompat.getDrawable(getResources(), i, getContext().getTheme())});
            }
            return ResourcesCompat.getDrawable(getResources(), i, getContext().getTheme());
        }
        if (C8632dsu.c((Object) str, (Object) "gift")) {
            i2 = com.netflix.mediaclient.ui.R.e.I;
        } else {
            i2 = C8632dsu.c((Object) str, (Object) "shield") ? com.netflix.mediaclient.ui.R.e.ah : com.netflix.mediaclient.ui.R.e.r;
        }
        return ResourcesCompat.getDrawable(getResources(), i2, getContext().getTheme());
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void b() {
        UmaAlert umaAlert = this.m;
        this.b = e(umaAlert != null ? umaAlert.themeName() : null);
        if (this.f13325o == UserMessageAreaView.MessageType.TOOLTIP) {
            TextView textView = this.i;
            UmaAlert umaAlert2 = this.m;
            textView.setText(umaAlert2 != null ? umaAlert2.tooltipTitle() : null);
            UmaAlert umaAlert3 = this.m;
            b(umaAlert3 != null ? umaAlert3.tooltipIcon() : null);
            UserMessageAreaThemedTooltip n = n();
            if ((n != null ? n.b() : null) == UserMessageAreaThemedTooltip.TooltipDirection.a) {
                setBackgroundResource(com.netflix.mediaclient.ui.R.e.aO);
            }
            k();
            return;
        }
        super.b();
        if (this.f13325o != UserMessageAreaView.MessageType.BANNER) {
            w();
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void e(boolean z) {
        if (this.f13325o == UserMessageAreaView.MessageType.TOOLTIP) {
            drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaThemedView$dismiss$logAndRemove$1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }

                public final void c() {
                    ViewParent parent = C6198cXm.this.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(C6198cXm.this);
                    }
                    C6198cXm.this.x();
                }
            };
            if (z) {
                setAlpha(1.0f);
                animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new a(dro));
                return;
            }
            dro.invoke();
            return;
        }
        super.e(z);
    }

    /* renamed from: o.cXm$a */
    /* loaded from: classes5.dex */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ drO<dpR> d;

        a(drO<dpR> dro) {
            this.d = dro;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            Handler handler = new Handler(Looper.getMainLooper());
            final drO<dpR> dro = this.d;
            handler.post(new Runnable() { // from class: o.cXn
                @Override // java.lang.Runnable
                public final void run() {
                    C6198cXm.a.e(drO.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(drO dro) {
            C8632dsu.c((Object) dro, "");
            dro.invoke();
        }
    }

    public final void a(UmaAlert umaAlert) {
        C8632dsu.c((Object) umaAlert, "");
        this.m = umaAlert;
        b();
    }

    public final void p() {
        InterfaceC1593aHa.c.a("Uma Tooltip showTooltip start");
        setAlpha(0.0f);
        setVisibility(0);
        animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new c());
        new Handler().postDelayed(new Runnable() { // from class: o.cXl
            @Override // java.lang.Runnable
            public final void run() {
                C6198cXm.a(C6198cXm.this);
            }
        }, 10000L);
    }

    /* renamed from: o.cXm$c */
    /* loaded from: classes5.dex */
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            Handler handler = new Handler(Looper.getMainLooper());
            final C6198cXm c6198cXm = C6198cXm.this;
            handler.post(new Runnable() { // from class: o.cXo
                @Override // java.lang.Runnable
                public final void run() {
                    C6198cXm.c.e(C6198cXm.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(C6198cXm c6198cXm) {
            C8632dsu.c((Object) c6198cXm, "");
            c6198cXm.y();
            InterfaceC1593aHa.c.a("Uma Tooltip showTooltip complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C6198cXm c6198cXm) {
        C8632dsu.c((Object) c6198cXm, "");
        c6198cXm.e(true);
    }

    private final void w() {
        String d2;
        String d3;
        ThemeAsset themeAsset = this.b;
        if (themeAsset != null) {
            setBackgroundResource(themeAsset.a());
        }
        ThemeAsset themeAsset2 = this.b;
        if (themeAsset2 == null || (d2 = themeAsset2.d()) == null || (d3 = d(d2)) == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        NetflixImageView netflixImageView = (NetflixImageView) findViewById(com.netflix.mediaclient.ui.R.g.gG);
        if (netflixImageView == null) {
            return;
        }
        netflixImageView.setAlpha(0.0f);
        netflixImageView.showImage(new ShowImageRequest().a(d3).a(true).a(new j(currentTimeMillis, netflixImageView)));
    }

    /* renamed from: o.cXm$j */
    /* loaded from: classes5.dex */
    public static final class j implements SingleObserver<ShowImageRequest.a> {
        final /* synthetic */ NetflixImageView d;
        final /* synthetic */ long e;

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
        }

        j(long j, NetflixImageView netflixImageView) {
            this.e = j;
            this.d = netflixImageView;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: e */
        public void onSuccess(ShowImageRequest.a aVar) {
            C8632dsu.c((Object) aVar, "");
            if (System.currentTimeMillis() - this.e > 250) {
                this.d.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator());
            } else {
                this.d.setAlpha(1.0f);
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int a() {
        return this.f13325o == UserMessageAreaView.MessageType.BANNER ? com.netflix.mediaclient.ui.R.l.I : this.b == ThemeAsset.a ? com.netflix.mediaclient.ui.R.l.H : com.netflix.mediaclient.ui.R.l.N;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int h() {
        return this.f13325o == UserMessageAreaView.MessageType.BANNER ? com.netflix.mediaclient.ui.R.l.M : this.b == ThemeAsset.a ? com.netflix.mediaclient.ui.R.l.A : com.netflix.mediaclient.ui.R.l.D;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int o() {
        ThemeAsset themeAsset = this.b;
        if (themeAsset == null || b.a[themeAsset.ordinal()] != 1) {
            return getContext().getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.ab);
        }
        C1332Xp c1332Xp = C1332Xp.b;
        return (int) TypedValue.applyDimension(1, 15, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }

    private final ThemeAsset e(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -816343937:
                    if (str.equals("violet")) {
                        return ThemeAsset.c;
                    }
                    break;
                case 3321813:
                    if (str.equals("lime")) {
                        return ThemeAsset.e;
                    }
                    break;
                case 93332111:
                    if (str.equals("azure")) {
                        return ThemeAsset.b;
                    }
                    break;
                case 113101865:
                    if (str.equals("white")) {
                        return ThemeAsset.a;
                    }
                    break;
            }
        }
        return ThemeAsset.d;
    }

    private final String d(String str) {
        String str2;
        ImageResolutionClass imageResolutionClass = this.a;
        if (imageResolutionClass == null || (str2 = imageResolutionClass.d) == null) {
            str2 = ImageResolutionClass.LOW.d;
        }
        return "https://assets.nflxext.com/ffe/siteui/acquisition/referral/mobile/android/" + str2 + "/" + str;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void k() {
        Object f;
        Object f2;
        if (this.f13325o == UserMessageAreaView.MessageType.TOOLTIP) {
            UserMessageAreaThemedTooltip n = n();
            C8632dsu.d(n);
            UmaAlert umaAlert = this.m;
            List<UmaCta> list = umaAlert != null ? umaAlert.tooltipCtas() : null;
            if (list != null) {
                f2 = C8576dqs.f((List<? extends Object>) list, 0);
                UmaCta umaCta = (UmaCta) f2;
                if (umaCta != null) {
                    n.setClickListener(e(umaCta));
                }
            }
            if (list != null) {
                f = C8576dqs.f((List<? extends Object>) list, 1);
                UmaCta umaCta2 = (UmaCta) f;
                if (umaCta2 != null) {
                    n.setCloseClickListener(e(umaCta2));
                    return;
                }
                return;
            }
            return;
        }
        super.k();
        UmaAlert umaAlert2 = this.m;
        if ((umaAlert2 != null ? umaAlert2.modalPlacement() : null) != UmaAlert.ModalPlacement.BOTTOM) {
            return;
        }
        C6193cXh.a.c(this, this.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r1 != null) goto L15;
     */
    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.netflix.mediaclient.service.webclient.model.leafs.UmaCta r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6198cXm.c(com.netflix.mediaclient.service.webclient.model.leafs.UmaCta, int, boolean):void");
    }

    /* renamed from: o.cXm$e */
    /* loaded from: classes5.dex */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ UserMessageAreaThemedTooltip.TooltipDirection a;
        final /* synthetic */ View c;

        e(View view, UserMessageAreaThemedTooltip.TooltipDirection tooltipDirection) {
            this.c = view;
            this.a = tooltipDirection;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C6198cXm.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C6198cXm.this.a(this.c, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(View view, UserMessageAreaThemedTooltip.TooltipDirection tooltipDirection) {
        UserMessageAreaThemedTooltip n = n();
        if (n != null) {
            n.setTooltipDirection(tooltipDirection);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new e(view, tooltipDirection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(View view, UserMessageAreaThemedTooltip.TooltipDirection tooltipDirection) {
        int height;
        UserMessageAreaThemedTooltip n = n();
        if (n == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (tooltipDirection == UserMessageAreaThemedTooltip.TooltipDirection.e) {
            height = iArr[1] + view.getHeight();
        } else {
            height = iArr[1] - getHeight();
        }
        setY(height);
        int width = iArr[0] + (view.getWidth() / 2);
        if (n.getWidth() >= getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.Z)) {
            Rect rect = new Rect();
            n.a().getGlobalVisibleRect(rect);
            int i = rect.left;
            if (width > rect.right || i > width) {
                n.setX(n.getX() + (width - (C8310dhv.a() ? rect.left : rect.right)));
            }
        }
        ImageView c2 = n.c();
        c2.setX((width - n.getX()) - (c2.getWidth() / 2));
    }
}
