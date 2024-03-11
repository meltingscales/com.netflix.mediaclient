package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.util.AccessibilityUtils;
import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C5511cAc;
import o.C5528cAt;
import o.C7639czx;
import o.C9834xU;
import o.cHK;
import o.cIE;
import o.dpR;

/* renamed from: o.cAc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5511cAc extends ConstraintLayout {
    public static final a d = new a(null);
    private final C5509cAa a;
    private CountDownTimer b;
    private C9935zP c;
    private boolean e;
    private Animator f;
    private View g;
    private boolean h;
    private final List<C7598czI> i;
    private final List<C5526cAr> j;
    private C7596czG n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13644o;

    /* renamed from: o.cAc$d */
    /* loaded from: classes4.dex */
    static final class d implements View.OnClickListener {
        public static final d e = new d();

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5511cAc(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5511cAc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    protected final List<C7598czI> a() {
        return this.i;
    }

    protected final List<C5526cAr> c() {
        return this.j;
    }

    public final C7596czG e() {
        return this.n;
    }

    public final void setAutoplayEnabled(boolean z) {
        this.e = z;
    }

    public final void setTilesShown(boolean z) {
        this.f13644o = z;
    }

    public final void setViewBinding(C7596czG c7596czG) {
        C8632dsu.c((Object) c7596czG, "");
        this.n = c7596czG;
    }

    public /* synthetic */ C5511cAc(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5511cAc(final Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        this.i = new ArrayList();
        this.a = new C5509cAa();
        this.j = new ArrayList();
        this.e = true;
        this.h = true;
        C7596czG e2 = C7596czG.e(LayoutInflater.from(context), this);
        C8632dsu.a(e2, "");
        this.n = e2;
        setBackground(new C9895yc(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(context, C9834xU.c.F), ContextCompat.getColor(context, C9834xU.c.w), ContextCompat.getColor(context, C9834xU.c.A)}));
        bJB bjb = this.n.a;
        C8632dsu.a(bjb, "");
        bjb.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        bjb.setLayoutManager(linearLayoutManager);
        bjb.addItemDecoration(new cAD(bjb.getResources().getColor(C9834xU.c.I, null), bjb.getResources().getColor(C9834xU.c.D, null)));
        bjb.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.cAm
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                C5511cAc.d(C5511cAc.this, view, i3, i4, i5, i6);
            }
        });
        post(new Runnable() { // from class: o.cAl
            @Override // java.lang.Runnable
            public final void run() {
                C5511cAc.a(C5511cAc.this, context);
            }
        });
    }

    /* renamed from: o.cAc$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PostPlayPreviewsThreeUpView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long d() {
            if (C8067ddQ.c()) {
                return C8067ddQ.e();
            }
            return 10L;
        }
    }

    /* renamed from: o.cAc$b */
    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C5511cAc.this.f = null;
        }
    }

    /* renamed from: o.cAc$e */
    /* loaded from: classes4.dex */
    public static final class e implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LinearLayout linearLayout = C5511cAc.this.e().i;
            C8632dsu.a(linearLayout, "");
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: o.cAc$f */
    /* loaded from: classes4.dex */
    public static final class f implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C5511cAc.this.e().i.setAlpha(1.0f);
            C5511cAc.this.e().i.setTranslationY(0.0f);
        }
    }

    /* renamed from: o.cAc$i */
    /* loaded from: classes4.dex */
    public static final class i implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5511cAc c5511cAc = C5511cAc.this;
            d dVar = d.e;
            c5511cAc.setOnClickListener(dVar);
            c5511cAc.setClickable(dVar != null);
        }
    }

    /* renamed from: o.cAc$j */
    /* loaded from: classes4.dex */
    public static final class j implements Animator.AnimatorListener {
        final /* synthetic */ drO e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public j(drO dro) {
            this.e = dro;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5511cAc c5511cAc = C5511cAc.this;
            c5511cAc.setOnClickListener(null);
            c5511cAc.setClickable(false);
            this.e.invoke();
            C5511cAc.this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5511cAc c5511cAc, View view, int i2, int i3, int i4, int i5) {
        C8632dsu.c((Object) c5511cAc, "");
        if (i2 > 0) {
            c5511cAc.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5511cAc c5511cAc, Context context) {
        C8632dsu.c((Object) c5511cAc, "");
        C8632dsu.c((Object) context, "");
        int width = c5511cAc.n.i.getWidth() / 3;
        for (int i2 = 0; i2 < 3; i2++) {
            C7598czI d2 = C7598czI.d(LayoutInflater.from(context), c5511cAc.n.i, false);
            C8632dsu.a(d2, "");
            d2.c().setLayoutParams(new LinearLayout.LayoutParams(width, -2));
            c5511cAc.n.i.addView(d2.c());
            c5511cAc.i.add(d2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.clear();
    }

    public final void setPreviews(final List<C5528cAt> list) {
        C8632dsu.c((Object) list, "");
        post(new Runnable() { // from class: o.cAg
            @Override // java.lang.Runnable
            public final void run() {
                C5511cAc.e(C5511cAc.this, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5511cAc c5511cAc, List list) {
        C8632dsu.c((Object) c5511cAc, "");
        C8632dsu.c((Object) list, "");
        c5511cAc.j.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5511cAc.j.add(new C5526cAr((C5528cAt) it.next(), false));
        }
        c5511cAc.i();
        c5511cAc.setDisplayArtClickListeners();
    }

    public void b() {
        post(new Runnable() { // from class: o.cAi
            @Override // java.lang.Runnable
            public final void run() {
                C5511cAc.a(C5511cAc.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5511cAc c5511cAc) {
        C8632dsu.c((Object) c5511cAc, "");
        c5511cAc.d();
        c5511cAc.animate().alpha(0.0f).setDuration(300L).start();
        LinearLayout linearLayout = c5511cAc.n.i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_Y, 0.0f, linearLayout.getHeight());
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        C8632dsu.d(ofFloat);
        ofFloat.addListener(new e());
        ofFloat.start();
    }

    public void e(int i2) {
        if (C8067ddQ.c() || !this.e) {
            return;
        }
        d.getLogTag();
        LinearLayout linearLayout = this.n.c;
        C8632dsu.a(linearLayout, "");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.n.i;
        C8632dsu.a(linearLayout2, "");
        linearLayout2.setVisibility(8);
        setAlpha(1.0f);
        d(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void f(int i2) {
        this.n.a.smoothScrollToPosition(i2);
        C9935zP c9935zP = this.c;
        if (c9935zP != null) {
            c9935zP.b(cHK.class, new cHK.f(this.j.get(i2).a().a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.n.b.setAlpha(0.0f);
    }

    /* renamed from: o.cAc$n */
    /* loaded from: classes4.dex */
    public static final class n extends CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C5511cAc.this.e().e.setText(C5511cAc.this.b(TimeUnit.MILLISECONDS.toSeconds(j)));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Object f;
            ConstraintLayout c;
            C5511cAc.d.getLogTag();
            f = C8576dqs.f((List<? extends Object>) C5511cAc.this.a(), 0);
            C7598czI c7598czI = (C7598czI) f;
            if (c7598czI != null && (c = c7598czI.c()) != null) {
                c.callOnClick();
            }
            C1204Sr c1204Sr = C5511cAc.this.e().e;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(8);
        }
    }

    protected final void d() {
        this.h = false;
        CountDownTimer countDownTimer = this.b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C1204Sr c1204Sr = this.n.e;
        C8632dsu.a(c1204Sr, "");
        c1204Sr.setVisibility(8);
    }

    public String b(long j2) {
        String c2 = C1333Xq.d(j2 == 1 ? cIE.a.z : cIE.a.D).d("numberOfSeconds", Long.valueOf(j2)).c();
        C8632dsu.a(c2, "");
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (this.f13644o) {
            return;
        }
        post(new Runnable() { // from class: o.cAk
            @Override // java.lang.Runnable
            public final void run() {
                C5511cAc.f(C5511cAc.this);
            }
        });
    }

    public final void b(int i2) {
        Object f2;
        C5528cAt a2;
        C5528cAt.c g2;
        TrackingInfoHolder a3;
        f2 = C8576dqs.f((List<? extends Object>) this.j, i2);
        C5526cAr c5526cAr = (C5526cAr) f2;
        if (c5526cAr == null || (a2 = c5526cAr.a()) == null || (g2 = a2.g()) == null || (a3 = g2.a()) == null) {
            return;
        }
        this.a.c(a3);
    }

    /* renamed from: o.cAc$c */
    /* loaded from: classes4.dex */
    public static final class c implements SingleObserver<ShowImageRequest.a> {
        final /* synthetic */ int e;

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            C8632dsu.c((Object) disposable, "");
        }

        c(int i) {
            this.e = i;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: d */
        public void onSuccess(ShowImageRequest.a aVar) {
            C8632dsu.c((Object) aVar, "");
            C5511cAc.this.c().get(this.e).a(true);
            C5511cAc.this.j();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
            C5511cAc.this.c().get(this.e).a(true);
        }
    }

    /* renamed from: o.cAc$g */
    /* loaded from: classes4.dex */
    public static final class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationEnd(animator);
            C5511cAc.this.e().d.setVisibility(8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationCancel(animator);
            C5511cAc.this.e().d.setVisibility(8);
        }
    }

    /* renamed from: o.cAc$h */
    /* loaded from: classes4.dex */
    public static final class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5511cAc.this.h();
        }
    }

    private final void e(final NetflixImageView netflixImageView, View view, View view2, String str, drO<dpR> dro) {
        final Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        view2.getGlobalVisibleRect(rect2);
        final RectF rectF = new RectF(rect);
        final RectF rectF2 = new RectF(rect2);
        netflixImageView.setPivotX(0.0f);
        netflixImageView.setPivotY(0.0f);
        float width = rectF2.width();
        float width2 = rectF.width();
        float height = rectF2.height();
        float height2 = rectF.height();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(rect.width(), rect.height());
        netflixImageView.setX(rectF.left);
        netflixImageView.setY(rectF.top);
        netflixImageView.setLayoutParams(layoutParams);
        netflixImageView.showImage(str);
        netflixImageView.setAlpha(1.0f);
        netflixImageView.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(400L);
        final float f2 = width - width2;
        final float f3 = height - height2;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cAh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5511cAc.a(f2, f3, rect, rectF, rectF2, netflixImageView, valueAnimator);
            }
        });
        C8632dsu.d(ofFloat);
        ofFloat.addListener(new i());
        ofFloat.addListener(new j(dro));
        ofFloat.addListener(new b());
        ofFloat.start();
        this.f = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(float f2, float f3, Rect rect, RectF rectF, RectF rectF2, NetflixImageView netflixImageView, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) rectF, "");
        C8632dsu.c((Object) rectF2, "");
        C8632dsu.c((Object) netflixImageView, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(rect.width() + ((int) (f2 * floatValue)), rect.height() + ((int) (f3 * floatValue)));
        float f4 = rectF.left;
        netflixImageView.setX(f4 - ((f4 - rectF2.left) * floatValue));
        float f5 = rectF.top;
        netflixImageView.setY(f5 - ((f5 - rectF2.top) * floatValue));
        netflixImageView.setLayoutParams(layoutParams);
    }

    @SuppressLint({"CheckResult"})
    public final void setEventBus(C9935zP c9935zP) {
        C8632dsu.c((Object) c9935zP, "");
        this.c = c9935zP;
        Observable d2 = c9935zP.d(cHK.class);
        final drM<cHK, dpR> drm = new drM<cHK, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewsThreeUpView$setEventBus$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cHK chk) {
                c(chk);
                return dpR.c;
            }

            public final void c(cHK chk) {
                if (chk instanceof cHK.b) {
                    C5511cAc.this.g();
                } else if (chk instanceof cHK.h) {
                    C5511cAc.this.c(((cHK.h) chk).b());
                } else if (chk instanceof cHK.m) {
                    C5511cAc.this.a(((cHK.m) chk).c());
                } else if (chk instanceof cHK.g) {
                    C5511cAc.this.c(((cHK.g) chk).c());
                }
            }
        };
        d2.subscribe(new Consumer() { // from class: o.cAj
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5511cAc.d(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i2) {
        Iterator<C5526cAr> it = this.j.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (it.next().a().a() == i2) {
                break;
            } else {
                i4++;
            }
        }
        int i5 = i4 + 1;
        if (i5 >= 0 && i5 < this.j.size()) {
            i3 = i5;
        }
        f(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i2) {
        Iterator<C5526cAr> it = this.j.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (it.next().a().a() == i2) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = i3 - 1;
        if (i4 < 0 || i4 >= this.j.size()) {
            i4 = this.j.size() - 1;
        }
        f(i4);
    }

    public void h() {
        if (this.h) {
            this.h = false;
            a aVar = d;
            aVar.getLogTag();
            Context context = getContext();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.b = new n(AccessibilityUtils.a(context, (int) timeUnit.toMillis(aVar.d()), false, 4, null), timeUnit.toMillis(1L)).start();
        }
    }

    private final void i() {
        boolean g2;
        boolean g3;
        int i2 = 0;
        for (Object obj : this.i) {
            if (i2 < 0) {
                C8569dql.h();
            }
            C7598czI c7598czI = (C7598czI) obj;
            String d2 = this.j.get(i2).a().d();
            String ancestorTitle = this.j.get(i2).a().c().getAncestorTitle();
            g2 = C8691duz.g(d2);
            if (!g2) {
                c7598czI.e.showImage(new ShowImageRequest().a(d2).b(true).a(new c(i2)));
                c7598czI.e.setContentDescription(C1333Xq.d(cIE.a.a).d(SignupConstants.Field.VIDEO_TITLE, ancestorTitle).c());
            } else {
                c7598czI.e.setImageResource(C9834xU.c.b);
            }
            String e2 = this.j.get(i2).a().e();
            g3 = C8691duz.g(e2);
            if (!g3) {
                c7598czI.a.showImage(new ShowImageRequest().a(e2).a(true));
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i2) {
        d.getLogTag();
        this.n.a.scrollToPosition(i2);
        this.n.a.setVisibility(0);
        C9935zP c9935zP = this.c;
        if (c9935zP != null) {
            c9935zP.b(cHK.class, new cHK.f(this.j.get(i2).a().a()));
        }
        this.n.a.animate().alpha(1.0f).setDuration(300L).setListener(new g());
    }

    public void setDisplayArtClickListeners() {
        final int i2 = 0;
        for (Object obj : this.i) {
            if (i2 < 0) {
                C8569dql.h();
            }
            final C7598czI c7598czI = (C7598czI) obj;
            ConstraintLayout c2 = c7598czI.c();
            C8632dsu.a(c2, "");
            c2.setOnClickListener(new View.OnClickListener() { // from class: o.cAf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5511cAc.d(C5511cAc.this, c7598czI, i2, view);
                }
            });
            c2.setClickable(true);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C5511cAc c5511cAc) {
        C8632dsu.c((Object) c5511cAc, "");
        a aVar = d;
        aVar.getLogTag();
        c5511cAc.f13644o = true;
        if (c5511cAc.e) {
            c5511cAc.n.e.setText(c5511cAc.b(aVar.d()));
            c5511cAc.postDelayed(new h(), 200L);
        } else {
            C1204Sr c1204Sr = c5511cAc.n.e;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(8);
        }
        c5511cAc.n.c.animate().alpha(1.0f).setDuration(300L).start();
        c5511cAc.n.f.sendAccessibilityEvent(8);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder play = animatorSet.play(ObjectAnimator.ofFloat(c5511cAc.n.i, View.ALPHA, 0.0f, 1.0f));
        LinearLayout linearLayout = c5511cAc.n.i;
        play.with(ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_Y, linearLayout.getHeight(), 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new f());
        animatorSet.start();
        for (C5526cAr c5526cAr : c5511cAc.j) {
            c5511cAc.a.b(c5526cAr.a().g().a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final C5511cAc c5511cAc, C7598czI c7598czI, final int i2, View view) {
        C8632dsu.c((Object) c5511cAc, "");
        C8632dsu.c((Object) c7598czI, "");
        d.getLogTag();
        c5511cAc.d();
        Animator animator = c5511cAc.f;
        if (animator == null || !animator.isRunning()) {
            Animator animator2 = c5511cAc.f;
            if (animator2 != null) {
                animator2.cancel();
            }
            NetflixImageView netflixImageView = c5511cAc.n.d;
            C8632dsu.a(netflixImageView, "");
            NetflixImageView netflixImageView2 = c7598czI.e;
            C8632dsu.a(netflixImageView2, "");
            c5511cAc.e(netflixImageView, netflixImageView2, c5511cAc, c7598czI.e.getImageUrl(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewsThreeUpView$setDisplayArtClickListeners$1$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    C5511cAc.this.d(i2);
                }
            });
            c5511cAc.a.e(c5511cAc.j.get(i2).a().g().a());
            bJB bjb = c5511cAc.n.a;
            C8632dsu.a(bjb, "");
            View b2 = C9703vR.b(bjb, 0);
            ViewGroup viewGroup = b2 instanceof ViewGroup ? (ViewGroup) b2 : null;
            c5511cAc.g = viewGroup != null ? viewGroup.findViewById(C7639czx.e.g) : null;
            if (c7598czI.a.isImageLoaded()) {
                c7598czI.a.showImage(c5511cAc.j.get(i2).a().e());
            }
            View view2 = c5511cAc.g;
            if (view2 != null) {
                NetflixImageView netflixImageView3 = c5511cAc.n.b;
                C8632dsu.a(netflixImageView3, "");
                NetflixImageView netflixImageView4 = c7598czI.a;
                C8632dsu.a(netflixImageView4, "");
                c5511cAc.e(netflixImageView3, netflixImageView4, view2, c7598czI.a.getImageUrl(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.PostPlayPreviewsThreeUpView$setDisplayArtClickListeners$1$1$3$1
                    public final void e() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        e();
                        return dpR.c;
                    }
                });
            }
        }
    }
}
