package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Property;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Action;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.cHR;
import o.cIE;

/* loaded from: classes4.dex */
public abstract class cBX extends cBZ {
    public static final b c = new b(null);
    protected NetflixImageView d;
    protected CommonMetaData.Layout e;
    private final ArrayList<View> g;
    private AnimatorSet h;
    private boolean i;
    private ConstraintLayout j;
    private Animation k;
    private int l;
    private final PathInterpolator m;
    private boolean n;

    /* renamed from: o */
    private float f13648o;
    private long p;
    private final AnimatorSet q;
    private AnimatorSet r;
    private float s;
    private Animator t;
    private AnimatorSet u;
    private boolean x;
    private boolean y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cBX(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cBX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public String a() {
        return null;
    }

    public final void a(boolean z) {
        this.x = z;
    }

    public final ArrayList<View> b() {
        return this.g;
    }

    protected final void c(boolean z) {
        this.y = z;
    }

    public final boolean c() {
        return this.i;
    }

    protected final void d(CommonMetaData.Layout layout) {
        C8632dsu.c((Object) layout, "");
        this.e = layout;
    }

    protected abstract void e(float f);

    protected final void e(NetflixImageView netflixImageView) {
        C8632dsu.c((Object) netflixImageView, "");
        this.d = netflixImageView;
    }

    public final int f() {
        return this.l;
    }

    public final long g() {
        return this.p;
    }

    public final PathInterpolator i() {
        return this.m;
    }

    public final float j() {
        return this.f13648o;
    }

    public final boolean k() {
        return this.n;
    }

    public final boolean n() {
        return this.y;
    }

    public final boolean o() {
        return this.x;
    }

    public /* synthetic */ cBX(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cBX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.m = new PathInterpolator(0.645f, 0.045f, 0.355f, 1.0f);
        this.g = new ArrayList<>();
        this.q = new AnimatorSet();
        this.u = new AnimatorSet();
        this.i = true;
        this.l = -1;
        this.p = 1600L;
    }

    public final CommonMetaData.Layout d() {
        CommonMetaData.Layout layout = this.e;
        if (layout != null) {
            return layout;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("InteractiveChoicePointUI");
        }
    }

    public final NetflixImageView m() {
        NetflixImageView netflixImageView = this.d;
        if (netflixImageView != null) {
            return netflixImageView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(cIE.b.E);
        C8632dsu.a(findViewById, "");
        this.j = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(cIE.b.am);
        C8632dsu.a(findViewById2, "");
        e((NetflixImageView) findViewById2);
        this.i = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f;
    }

    public final void d(aJY ajy, InterfaceC9638uF interfaceC9638uF, cHQ chq, Moment moment, BaseLayout baseLayout, int i) {
        InteractiveSceneConfig config;
        int i2;
        int i3;
        float c2;
        SurfaceView N;
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) baseLayout, "");
        d(ajy);
        c(interfaceC9638uF);
        e(chq);
        e(moment);
        this.l = i;
        CommonMetaData.Layout layout = (CommonMetaData.Layout) baseLayout;
        d(layout);
        InteractiveSceneConfig config2 = moment.config();
        int i4 = 0;
        this.n = config2 != null ? C8632dsu.c(config2.queueSelectedChoice(), Boolean.TRUE) : false;
        this.n = !(moment.config() != null ? C8632dsu.c(config.queueSelectedChoice(), Boolean.FALSE) : false);
        c.getLogTag();
        this.y = false;
        this.x = false;
        this.s = 0.0f;
        int c3 = C8150deu.c((Activity) C8141del.d(getContext(), NetflixActivity.class));
        int height = ajy != null ? ajy.getHeight() : c3;
        int height2 = (ajy == null || (N = ajy.N()) == null) ? c3 : N.getHeight();
        if (1 > height || height > height2) {
            i2 = (c3 - height2) / 2;
            i3 = height2;
        } else {
            i2 = 0;
            i3 = height;
        }
        Integer height3 = layout.canvasSize().height();
        C8632dsu.a(height3, "");
        float floatValue = i3 / height3.floatValue();
        ConstraintLayout constraintLayout = this.j;
        if (constraintLayout == null) {
            C8632dsu.d("");
            constraintLayout = null;
        }
        this.f13648o = constraintLayout.getLayoutParams().height;
        InteractiveSceneConfig config3 = moment.config();
        if (config3 != null && config3.is4By3()) {
            this.s = 0.0f;
        } else if (height2 <= height) {
            this.s = 35 * floatValue;
        } else {
            float f = (height2 - height) / 2;
            if (f < this.f13648o) {
                c2 = C8657dts.c(0.0f, (35 * floatValue) - f);
                this.s = c2;
            }
        }
        float f2 = this.f13648o;
        float f3 = this.s;
        if (f2 > f3) {
            this.f13648o = f2 - f3;
        }
        setSubtitleY((int) (i2 + h()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C8632dsu.d(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        marginLayoutParams.height = i3;
        marginLayoutParams.topMargin = i2;
        InteractiveSceneConfig config4 = moment.config();
        if (config4 == null || !config4.is4By3()) {
            i4 = (int) ((35 * floatValue) + 0.5d);
        }
        marginLayoutParams.bottomMargin = i2 + i4;
        setLayoutParams(marginLayoutParams);
        t();
        e(floatValue);
    }

    public float h() {
        ConstraintLayout constraintLayout = this.j;
        if (constraintLayout == null) {
            C8632dsu.d("");
            constraintLayout = null;
        }
        return constraintLayout.getLayoutParams().height;
    }

    public final void c(List<Animator> list) {
        List f;
        C8632dsu.c((Object) list, "");
        ConstraintLayout constraintLayout = this.j;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            C8632dsu.d("");
            constraintLayout = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, View.TRANSLATION_Y, 0.0f, this.f13648o);
        cCM ccm = cCM.a;
        Context context = getContext();
        C8632dsu.a(context, "");
        ofFloat.setDuration(ccm.d(context, this.p));
        ofFloat.setStartDelay(280L);
        ofFloat.setInterpolator(this.m);
        ConstraintLayout constraintLayout3 = this.j;
        if (constraintLayout3 == null) {
            C8632dsu.d("");
        } else {
            constraintLayout2 = constraintLayout3;
        }
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout2, property, 1.0f, 0.0f);
        ofFloat2.setStartDelay(1880L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(cBZ.a.a());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m(), property, 1.0f, 0.5f);
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        ofFloat3.setDuration(ccm.d(context2, 40L));
        ofFloat3.setInterpolator(this.m);
        C8632dsu.d(ofFloat);
        C8632dsu.d(ofFloat2);
        f = C8569dql.f(ofFloat, ofFloat2);
        f.addAll(list);
        this.q.playTogether(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(cBX cbx, Collection collection, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initHideUserSelectionChoicePointAnimation");
        }
        if ((i & 1) != 0) {
            collection = C8569dql.i();
        }
        cbx.c(collection);
    }

    public final void c(Collection<? extends Animator> collection) {
        List f;
        C8632dsu.c((Object) collection, "");
        ConstraintLayout constraintLayout = this.j;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            C8632dsu.d("");
            constraintLayout = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, View.TRANSLATION_Y, 0.0f, this.f13648o);
        cCM ccm = cCM.a;
        Context context = getContext();
        C8632dsu.a(context, "");
        ofFloat.setDuration(ccm.d(context, this.p));
        ofFloat.setStartDelay(280L);
        ofFloat.setInterpolator(this.m);
        ConstraintLayout constraintLayout3 = this.j;
        if (constraintLayout3 == null) {
            C8632dsu.d("");
        } else {
            constraintLayout2 = constraintLayout3;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout2, View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setStartDelay(1880L);
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        ofFloat2.setDuration(ccm.d(context2, 200L));
        ofFloat2.setInterpolator(cBZ.a.a());
        C8632dsu.d(ofFloat);
        C8632dsu.d(ofFloat2);
        f = C8569dql.f(ofFloat, ofFloat2);
        f.addAll(collection);
        this.u.playTogether(f);
    }

    private final void e(cHR chr, aJY ajy, Moment moment) {
        long e2;
        e2 = C8657dts.e(0L, C5639cCw.e.d(ajy, moment) - 1000);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setAnimationListener(new c(chr, moment));
        scaleAnimation.setInterpolator(cBZ.a.a());
        scaleAnimation.setDuration(e2);
        this.k = scaleAnimation;
        m().setScaleX(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m(), View.SCALE_X, 1.0f, 0.0f);
        this.t = ofFloat;
        if (ofFloat != null) {
            cCM ccm = cCM.a;
            Context context = getContext();
            C8632dsu.a(context, "");
            ofFloat.setDuration(ccm.d(context, e2));
        }
        Animator animator = this.t;
        if (animator != null) {
            animator.setInterpolator(new LinearInterpolator());
        }
        Animator animator2 = this.t;
        if (animator2 != null) {
            animator2.addListener(new e(booleanRef, this, chr, moment));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ cHR b;
        final /* synthetic */ Moment c;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        c(cHR chr, Moment moment) {
            cBX.this = r1;
            this.b = chr;
            this.c = moment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (animation == null || !animation.hasEnded()) {
                return;
            }
            cBX.this.m().setVisibility(8);
            if (cBX.this.o()) {
                return;
            }
            cBX.this.a(this.b, this.c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AnimatorListenerAdapter {
        final /* synthetic */ cBX a;
        final /* synthetic */ Moment c;
        final /* synthetic */ Ref.BooleanRef d;
        final /* synthetic */ cHR e;

        e(Ref.BooleanRef booleanRef, cBX cbx, cHR chr, Moment moment) {
            this.d = booleanRef;
            this.a = cbx;
            this.e = chr;
            this.c = moment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationCancel(animator);
            this.d.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.a.c(false);
            if (this.d.a) {
                return;
            }
            if (this.a.o()) {
                this.a.u.start();
                Iterator<View> it = this.a.b().iterator();
                while (it.hasNext()) {
                    ViewPropertyAnimator alpha = it.next().animate().alpha(0.0f);
                    cCM ccm = cCM.a;
                    Context context = this.a.getContext();
                    C8632dsu.a(context, "");
                    alpha.setDuration(ccm.d(context, 800L)).setStartDelay(200L).setInterpolator(this.a.i()).start();
                }
                return;
            }
            this.a.q.start();
            this.a.a(this.e, this.c);
        }
    }

    public final void a(cHR chr, Moment moment) {
        Choice choice;
        boolean e2;
        List<Choice> choices = moment.choices();
        if (choices == null || (choice = choices.get(this.l)) == null) {
            return;
        }
        Choice.ChoiceAction action = choice.action();
        e2 = C8691duz.e(action != null ? action.type() : null, Action.ActionType.NEXT_EPISODE, false, 2, null);
        if (e2) {
            if (chr != null) {
                chr.d(moment, choice, choice.impressionData(), this.x);
                return;
            }
            return;
        }
        String segmentId = choice.segmentId();
        if (segmentId != null) {
            if (this.n && !moment.isInterstitialPostPlay()) {
                if (chr != null) {
                    String id = choice.id();
                    C8632dsu.a(id, "");
                    cHR.d.a(chr, false, moment, id, segmentId, choice.impressionData(), null, null, 96, null);
                }
            } else if (chr != null) {
                boolean z = this.x;
                String id2 = choice.id();
                C8632dsu.a(id2, "");
                chr.d(z, moment, id2, segmentId, choice.impressionData(), choice.startTimeMs());
            }
        }
    }

    @Override // o.cBZ
    public void e() {
        if (!this.i) {
            ConstraintLayout constraintLayout = this.j;
            if (constraintLayout == null) {
                C8632dsu.d("");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(8);
        }
        Animator animator = this.t;
        if (animator != null) {
            animator.cancel();
        }
        this.y = false;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.r;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public final void e(List<Animator> list) {
        ConstraintLayout constraintLayout;
        C8632dsu.c((Object) list, "");
        setVisibility(0);
        ConstraintLayout constraintLayout2 = this.j;
        if (constraintLayout2 == null) {
            C8632dsu.d("");
            constraintLayout2 = null;
        }
        constraintLayout2.setVisibility(this.i ? 0 : 8);
        ConstraintLayout constraintLayout3 = this.j;
        if (constraintLayout3 == null) {
            C8632dsu.d("");
            constraintLayout3 = null;
        }
        constraintLayout3.setAlpha(this.i ? 0.0f : 1.0f);
        m().setVisibility(0);
        m().setAlpha(this.i ? 0.0f : 1.0f);
        m().setScaleX(1.0f);
        ConstraintLayout constraintLayout4 = this.j;
        if (constraintLayout4 == null) {
            C8632dsu.d("");
            constraintLayout4 = null;
        }
        constraintLayout4.setTranslationY(this.i ? this.f13648o : 0.0f);
        NetflixImageView m = m();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m, property, 0.0f, 1.0f);
        cCM ccm = cCM.a;
        Context context = getContext();
        C8632dsu.a(context, "");
        ObjectAnimator duration = ofFloat.setDuration(ccm.d(context, 1000L));
        C8632dsu.a(duration, "");
        ConstraintLayout constraintLayout5 = this.j;
        if (constraintLayout5 == null) {
            C8632dsu.d("");
            constraintLayout5 = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout5, property, 0.0f, 1.0f);
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        ObjectAnimator duration2 = ofFloat2.setDuration(ccm.d(context2, 200L));
        C8632dsu.a(duration2, "");
        ConstraintLayout constraintLayout6 = this.j;
        if (constraintLayout6 == null) {
            C8632dsu.d("");
            constraintLayout6 = null;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout6, View.TRANSLATION_Y, this.f13648o, 0.0f);
        Context context3 = getContext();
        C8632dsu.a(context3, "");
        ObjectAnimator duration3 = ofFloat3.setDuration(ccm.d(context3, this.p));
        C8632dsu.a(duration3, "");
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.setStartDelay(200L);
        list.add(duration);
        AnimatorSet animatorSet2 = this.h;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(list);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.r = animatorSet3;
        animatorSet3.playSequentially(duration2, duration3, this.h);
        AnimatorSet animatorSet4 = this.r;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(this.m);
        }
        AnimatorSet animatorSet5 = this.r;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new a());
        }
        if (this.i) {
            AnimatorSet animatorSet6 = this.r;
            if (animatorSet6 != null) {
                animatorSet6.start();
                return;
            }
            return;
        }
        if (this.k != null) {
            m().setScaleX(1.0f);
            m().setVisibility(0);
            m().startAnimation(this.k);
        }
        this.y = true;
        ConstraintLayout constraintLayout7 = this.j;
        if (constraintLayout7 == null) {
            C8632dsu.d("");
            constraintLayout = null;
        } else {
            constraintLayout = constraintLayout7;
        }
        constraintLayout.setVisibility(0);
    }

    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
            cBX.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationEnd(animator);
            cBX.this.c(true);
            Animator animator2 = cBX.this.t;
            if (animator2 != null) {
                animator2.start();
            }
        }
    }

    @Override // o.cBZ
    public void l() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        Animator animator;
        Animator animator2 = this.t;
        if (animator2 != null && animator2.isStarted() && (animator = this.t) != null) {
            animator.pause();
        }
        AnimatorSet animatorSet3 = this.h;
        if (animatorSet3 != null && animatorSet3.isStarted() && (animatorSet2 = this.h) != null) {
            animatorSet2.pause();
        }
        AnimatorSet animatorSet4 = this.r;
        if (animatorSet4 == null || !animatorSet4.isStarted() || (animatorSet = this.r) == null) {
            return;
        }
        animatorSet.pause();
    }

    @Override // o.cBZ
    public void s() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        Animator animator;
        Animator animator2 = this.t;
        if (animator2 != null && animator2.isPaused() && (animator = this.t) != null) {
            animator.resume();
        }
        AnimatorSet animatorSet3 = this.h;
        if (animatorSet3 != null && animatorSet3.isPaused() && (animatorSet2 = this.h) != null) {
            animatorSet2.resume();
        }
        AnimatorSet animatorSet4 = this.r;
        if (animatorSet4 == null || !animatorSet4.isPaused() || (animatorSet = this.r) == null) {
            return;
        }
        animatorSet.resume();
    }

    protected final void t() {
        c.getLogTag();
        e(u(), y(), q());
    }
}
