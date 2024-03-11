package o;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.interactive.Action;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.TrackingInfo;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C5636cCt;
import o.C5650cDg;
import o.C5651cDh;
import o.C8632dsu;
import o.cCW;
import o.cHR;
import o.cIE;
import o.dpR;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.cCt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5636cCt extends cBY {
    public static final c i = new c(null);
    private ArrayList<Boolean> g;
    private final ArrayList<String> h;
    private int k;
    private UiDefinition.Layout.Config l;
    private int m;
    private RS n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13653o;
    private TransitionType r;
    private cCV s;
    private boolean t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5636cCt(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5636cCt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5636cCt(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5636cCt(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        this.k = -1;
        this.m = -1;
        this.r = TransitionType.IMMEDIATE;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
    }

    /* renamed from: o.cCt$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("InteractiveTriviaMultiChoicePoint");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (o.C8632dsu.c(r3, java.lang.Boolean.TRUE) != false) goto L22;
     */
    @Override // o.cBY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(o.aJY r3, o.InterfaceC9638uF r4, o.cHR r5, com.netflix.model.leafs.originals.interactive.Moment r6, com.netflix.model.leafs.originals.interactive.BaseLayout r7, com.netflix.model.leafs.originals.interactive.InteractiveMoments r8, int r9) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r7, r0)
            o.C8632dsu.c(r8, r0)
            super.d(r3, r4, r5, r6, r7, r8, r9)
            r2.k = r9
            com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig r3 = r6.config()
            r4 = 0
            if (r3 == 0) goto L22
            java.lang.String r3 = r3.transitionType()
            goto L23
        L22:
            r3 = r4
        L23:
            com.netflix.model.leafs.originals.interactive.TransitionType r8 = com.netflix.model.leafs.originals.interactive.TransitionType.LAZY
            java.lang.String r9 = r8.getTransition()
            boolean r9 = o.C8632dsu.c(r3, r9)
            if (r9 == 0) goto L30
            goto L71
        L30:
            com.netflix.model.leafs.originals.interactive.TransitionType r9 = com.netflix.model.leafs.originals.interactive.TransitionType.IMMEDIATE
            java.lang.String r0 = r9.getTransition()
            boolean r0 = o.C8632dsu.c(r3, r0)
            if (r0 == 0) goto L3d
            goto L70
        L3d:
            com.netflix.model.leafs.originals.interactive.TransitionType r0 = com.netflix.model.leafs.originals.interactive.TransitionType.DELAYED_SEAMLESS
            java.lang.String r1 = r0.getTransition()
            boolean r3 = o.C8632dsu.c(r3, r1)
            if (r3 == 0) goto L4b
            r8 = r0
            goto L71
        L4b:
            com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig r3 = r6.config()
            if (r3 == 0) goto L57
            java.lang.Boolean r3 = r3.queueSelectedChoice()
            if (r3 != 0) goto L67
        L57:
            com.netflix.model.leafs.originals.interactive.UiDefinition$Layout r3 = r2.c()
            com.netflix.model.leafs.originals.interactive.UiDefinition$Layout$Config r3 = r3.config()
            if (r3 == 0) goto L66
            java.lang.Boolean r3 = r3.queueSelectedChoice()
            goto L67
        L66:
            r3 = r4
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r3 = o.C8632dsu.c(r3, r6)
            if (r3 == 0) goto L70
            goto L71
        L70:
            r8 = r9
        L71:
            r2.r = r8
            o.cCt$c r3 = o.C5636cCt.i
            r3.getLogTag()
            boolean r3 = r7 instanceof com.netflix.model.leafs.originals.interactive.UiDefinition.Layout
            if (r3 == 0) goto L7f
            com.netflix.model.leafs.originals.interactive.UiDefinition$Layout r7 = (com.netflix.model.leafs.originals.interactive.UiDefinition.Layout) r7
            goto L80
        L7f:
            r7 = r4
        L80:
            if (r7 == 0) goto L86
            com.netflix.model.leafs.originals.interactive.UiDefinition$Layout$Config r4 = r7.config()
        L86:
            r2.l = r4
            if (r5 == 0) goto L8f
            o.cBQ$n r3 = o.cBQ.n.c
            r5.b(r3)
        L8f:
            r2.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5636cCt.d(o.aJY, o.uF, o.cHR, com.netflix.model.leafs.originals.interactive.Moment, com.netflix.model.leafs.originals.interactive.BaseLayout, com.netflix.model.leafs.originals.interactive.InteractiveMoments, int):void");
    }

    @Override // o.cBY
    public void setupUI() {
        m();
        B();
        t();
        A();
    }

    @Override // o.cBY
    public void setupObservable() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5649cDf abstractC5649cDf : b()) {
            arrayList.add(abstractC5649cDf.n());
        }
        Observable merge = Observable.merge(arrayList);
        final drM<C5650cDg, dpR> drm = new drM<C5650cDg, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTriviaMultiChoicePoint$setupObservable$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5650cDg c5650cDg) {
                c(c5650cDg);
                return dpR.c;
            }

            public final void c(C5650cDg c5650cDg) {
                if (c5650cDg instanceof C5650cDg.c) {
                    return;
                }
                if (c5650cDg instanceof C5650cDg.d) {
                    C5636cCt.this.n();
                } else if (!(c5650cDg instanceof C5650cDg.a)) {
                    if (c5650cDg instanceof C5650cDg.e) {
                        C5636cCt.this.b(C5651cDh.j.b);
                        C5650cDg.e eVar = (C5650cDg.e) c5650cDg;
                        C5636cCt.this.a(eVar.b(), eVar.c());
                    }
                } else {
                    C5650cDg.a aVar = (C5650cDg.a) c5650cDg;
                    C5636cCt.this.b(new C5651cDh.h(aVar.e(), aVar.d()));
                    String d2 = aVar.d();
                    switch (d2.hashCode()) {
                        case -934426595:
                            if (d2.equals(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
                                C5636cCt.this.b(new C5651cDh.h(aVar.e(), VisualStateDefinition.ELEMENT_STATE.RESULT));
                                return;
                            }
                            return;
                        case -691041417:
                            if (d2.equals("focused")) {
                                C5636cCt.this.m = aVar.e();
                                C5636cCt.this.k = aVar.e();
                                cCW.b(C5636cCt.this.o(), true, aVar.e(), null, 4, null);
                                return;
                            }
                            return;
                        case 113405357:
                            if (d2.equals(VisualStateDefinition.ELEMENT_STATE.WRONG)) {
                                C5636cCt c5636cCt = C5636cCt.this;
                                C8632dsu.d(c5650cDg);
                                c5636cCt.a(aVar, false);
                                return;
                            }
                            return;
                        case 955164778:
                            if (d2.equals(VisualStateDefinition.ELEMENT_STATE.CORRECT)) {
                                C5636cCt c5636cCt2 = C5636cCt.this;
                                C8632dsu.d(c5650cDg);
                                c5636cCt2.a(aVar, true);
                                return;
                            }
                            return;
                        case 1191572123:
                            if (d2.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                C5636cCt.this.b(new C5651cDh.h(aVar.e(), VisualStateDefinition.ELEMENT_STATE.SELECTED));
                                return;
                            }
                            return;
                        case 1544803905:
                            if (d2.equals("default")) {
                                cCW.b(C5636cCt.this.o(), false, aVar.e(), null, 4, null);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        setPlayerUIEventsObservable(merge.subscribe(new Consumer() { // from class: o.cCz
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5636cCt.e(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C5650cDg.a aVar, boolean z) {
        Choice choice;
        Choice choice2;
        String id;
        this.g.add(Boolean.valueOf(z));
        List<Choice> choices = q().choices();
        if (choices != null && (choice2 = choices.get(aVar.e())) != null && (id = choice2.id()) != null) {
            this.h.add(id);
        }
        b(new C5651cDh.h(aVar.e(), z ? VisualStateDefinition.ELEMENT_STATE.CORRECT : VisualStateDefinition.ELEMENT_STATE.WRONG));
        cHR u = u();
        if (u != null) {
            List<Choice> choices2 = q().choices();
            u.c((choices2 == null || (choice = choices2.get(aVar.e())) == null) ? null : choice.impressionData());
        }
        o().d(aVar.e(), q().choices(), new i(z));
    }

    /* renamed from: o.cCt$i */
    /* loaded from: classes4.dex */
    public static final class i extends cCS {
        final /* synthetic */ boolean e;

        i(boolean z) {
            this.e = z;
        }

        @Override // o.cCS, o.cCK
        public void e() {
            C5636cCt.this.c(this.e ? Audio.TYPE.explicitSelectionCorrect : Audio.TYPE.explicitSelectionWrong);
        }

        @Override // o.cCS, o.cCK
        public void b() {
            Choice choice;
            List<Choice> choices = C5636cCt.this.q().choices();
            if (choices != null) {
                C5636cCt c5636cCt = C5636cCt.this;
                choice = null;
                int i = 0;
                for (Object obj : choices) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    Choice choice2 = (Choice) obj;
                    Condition condition = c5636cCt.d().preconditions().get(choice2.preconditionId());
                    int size = c5636cCt.g.size();
                    List<Integer> answerSequence = c5636cCt.q().answerSequence();
                    boolean z = size < (answerSequence != null ? answerSequence.size() : 0) && (condition == null || condition.meetsCondition(c5636cCt.d()));
                    choice2.isEnabled = z;
                    if (z && choice == null) {
                        choice = choice2;
                    }
                    c5636cCt.b(new C5651cDh.h(i, z ? "default" : VisualStateDefinition.ELEMENT_STATE.DISABLED));
                    i++;
                }
            } else {
                choice = null;
            }
            View findViewWithTag = C5636cCt.this.findViewWithTag(choice != null ? choice.id() : null);
            if (findViewWithTag != null) {
                findViewWithTag.sendAccessibilityEvent(8);
            }
            cCW.a(C5636cCt.this.o(), C5636cCt.this.q().choices(), null, 2, null);
        }
    }

    /* renamed from: o.cCt$d */
    /* loaded from: classes4.dex */
    public static final class d extends cCS {
        d() {
        }

        @Override // o.cCS, o.cCK
        public void e() {
            Object obj;
            C5636cCt.i.getLogTag();
            RS rs = C5636cCt.this.n;
            if (rs != null) {
                rs.setVisibility(0);
                rs.c(true);
            }
            Iterator<T> it = C5636cCt.this.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AbstractC5649cDf) obj) instanceof C5644cDa) {
                    break;
                }
            }
            AbstractC5649cDf abstractC5649cDf = (AbstractC5649cDf) obj;
            if (abstractC5649cDf != null) {
                Context context = C5636cCt.this.getContext();
                C8632dsu.a(context, "");
                AccessibilityUtils.b(context, ((C5644cDa) abstractC5649cDf).b());
            }
            C5636cCt.this.C();
            C5636cCt.this.c("init");
        }
    }

    private final void k() {
        setVisibility(0);
        o().a(q().choices(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        cCM ccm = cCM.a;
        Context context = getContext();
        C8632dsu.a(context, "");
        if (ccm.b(context)) {
            int i2 = getLayoutParams().width / 2;
            int i3 = getLayoutParams().height - (getLayoutParams().height / 4);
            C5640cCx c5640cCx = (C5640cCx) findViewById(cIE.b.N);
            if (c5640cCx != null) {
                ViewGroup.LayoutParams layoutParams = c5640cCx.getLayoutParams();
                C8632dsu.d(layoutParams);
                i2 = (c5640cCx.getLayoutParams().width / 2) + C9687vB.c((ViewGroup.MarginLayoutParams) layoutParams);
                ViewGroup.LayoutParams layoutParams2 = c5640cCx.getLayoutParams();
                C8632dsu.d(layoutParams2);
                i3 = (c5640cCx.getLayoutParams().height / 2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, i2, i3, 0.0f, getLayoutParams().height);
            Context context2 = getContext();
            C8632dsu.a(context2, "");
            Animator duration = createCircularReveal.setDuration(ccm.d(context2, 1000L));
            duration.addListener(new h());
            duration.start();
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(600L);
        alphaAnimation.setAnimationListener(new g());
        startAnimation(alphaAnimation);
    }

    /* renamed from: o.cCt$h */
    /* loaded from: classes4.dex */
    public static final class h implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            UiDefinition.Layout.Choice choice;
            C8632dsu.c((Object) animator, "");
            C5636cCt.i.getLogTag();
            C5636cCt c5636cCt = C5636cCt.this;
            List<UiDefinition.Layout.Choice> choices = c5636cCt.c().elements().choices();
            View findViewWithTag = c5636cCt.findViewWithTag((choices == null || (choice = choices.get(0)) == null) ? null : choice.id());
            if (findViewWithTag != null) {
                findViewWithTag.sendAccessibilityEvent(8);
            }
            C5636cCt.this.D();
        }
    }

    /* renamed from: o.cCt$g */
    /* loaded from: classes4.dex */
    public static final class g implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            UiDefinition.Layout.Choice choice;
            C5636cCt.i.getLogTag();
            C5636cCt c5636cCt = C5636cCt.this;
            List<UiDefinition.Layout.Choice> choices = c5636cCt.c().elements().choices();
            View findViewWithTag = c5636cCt.findViewWithTag((choices == null || (choice = choices.get(0)) == null) ? null : choice.id());
            if (findViewWithTag != null) {
                findViewWithTag.sendAccessibilityEvent(8);
            }
            C5636cCt.this.D();
        }
    }

    /* renamed from: o.cCt$j */
    /* loaded from: classes4.dex */
    public static final class j implements Animation.AnimationListener {
        final /* synthetic */ Choice d;
        final /* synthetic */ C5636cCt e;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        j(Choice choice, C5636cCt c5636cCt) {
            this.d = choice;
            this.e = c5636cCt;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Choice choice = this.d;
            Choice.ChoiceAction action = choice != null ? choice.action() : null;
            if (action != null && (action.type().equals(Action.ActionType.NEXT_EPISODE) || action.type().equals(Action.ActionType.PLAY_VIDEO))) {
                cHR u = this.e.u();
                if (u != null) {
                    Moment q = this.e.q();
                    Choice choice2 = this.d;
                    u.d(q, choice2, choice2.impressionData(), this.e.t);
                    return;
                }
                return;
            }
            Choice choice3 = this.d;
            String segmentId = choice3 != null ? choice3.segmentId() : null;
            cHR u2 = this.e.u();
            if (u2 != null) {
                boolean z = this.e.t;
                Moment q2 = this.e.q();
                Choice choice4 = this.d;
                String id = choice4 != null ? choice4.id() : null;
                if (id == null) {
                    id = "";
                }
                String str = id;
                Choice choice5 = this.d;
                cHR.d.a(u2, z, q2, str, segmentId, choice5 != null ? choice5.impressionData() : null, this.e.r, null, 64, null);
            }
            aJY y = this.e.y();
            if (y != null) {
                long o2 = y.o();
                C5636cCt c5636cCt = this.e;
                cHR u3 = c5636cCt.u();
                if (u3 != null) {
                    u3.a(MomentState.b, c5636cCt.q(), o2);
                }
            }
        }
    }

    private final void e(Animation.AnimationListener animationListener) {
        cCM ccm = cCM.a;
        Context context = getContext();
        C8632dsu.a(context, "");
        if (ccm.b(context)) {
            int width = getWidth() / 2;
            int height = getHeight() - (getHeight() / 4);
            C5640cCx c5640cCx = (C5640cCx) findViewById(cIE.b.N);
            if (c5640cCx != null) {
                ViewGroup.LayoutParams layoutParams = c5640cCx.getLayoutParams();
                C8632dsu.d(layoutParams);
                width = (c5640cCx.getWidth() / 2) + C9687vB.c((ViewGroup.MarginLayoutParams) layoutParams);
                ViewGroup.LayoutParams layoutParams2 = c5640cCx.getLayoutParams();
                C8632dsu.d(layoutParams2);
                height = (c5640cCx.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, width, height, getHeight(), 0.0f);
            Context context2 = getContext();
            C8632dsu.a(context2, "");
            Animator duration = createCircularReveal.setDuration(ccm.d(context2, 1500L));
            duration.addListener(new f(animationListener, this));
            duration.start();
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(600L);
        alphaAnimation.setAnimationListener(new l(animationListener, this));
        startAnimation(alphaAnimation);
    }

    /* renamed from: o.cCt$f */
    /* loaded from: classes4.dex */
    public static final class f implements Animator.AnimatorListener {
        final /* synthetic */ C5636cCt a;
        final /* synthetic */ Animation.AnimationListener d;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        f(Animation.AnimationListener animationListener, C5636cCt c5636cCt) {
            this.d = animationListener;
            this.a = c5636cCt;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.d.onAnimationStart(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.a.setVisibility(8);
            this.d.onAnimationEnd(null);
        }
    }

    /* renamed from: o.cCt$l */
    /* loaded from: classes4.dex */
    public static final class l implements Animation.AnimationListener {
        final /* synthetic */ Animation.AnimationListener a;
        final /* synthetic */ C5636cCt d;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        l(Animation.AnimationListener animationListener, C5636cCt c5636cCt) {
            this.a = animationListener;
            this.d = c5636cCt;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.a.onAnimationStart(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.d.setVisibility(8);
            this.a.onAnimationEnd(null);
        }
    }

    private final void m() {
        C5640cCx c5640cCx;
        BackgroundImageElement background = c().elements().background(d());
        if (background == null || (c5640cCx = (C5640cCx) findViewById(cIE.b.N)) == null) {
            return;
        }
        c5640cCx.setVisibility(0);
        b().add(new cCY(j(), d(), q(), background, c5640cCx, f(), i(), h(), r()));
    }

    private final void B() {
        LayoutTimer timer;
        UiDefinition.Layout.Elements elements = c().elements();
        cCV ccv = null;
        if (elements != null && (timer = elements.timer()) != null) {
            String type = timer.type();
            if (type != null && type.hashCode() == 1905897312 && type.equals("SpriteTimer")) {
                Observable<C5651cDh> j2 = j();
                InteractiveMoments d2 = d();
                Moment q = q();
                View e2 = C9703vR.e(this, cIE.c.h, 0, 2, null);
                C8632dsu.d(e2);
                ccv = new C5645cDb(j2, d2, q, (FrameLayout) e2, timer, f(), i(), h(), r());
            } else {
                Observable<C5651cDh> j3 = j();
                InteractiveMoments d3 = d();
                Moment q2 = q();
                View e3 = C9703vR.e(this, cIE.c.e, 0, 2, null);
                C8632dsu.d(e3);
                ccv = new C5647cDd(j3, d3, q2, (FrameLayout) e3, timer, f(), i(), h(), r());
            }
            b().add(ccv);
        }
        this.s = ccv;
    }

    private final void t() {
        List<UiDefinition.Layout.Choice> choices;
        List<Choice> choices2;
        List h2;
        int d2;
        List<Integer> answerSequence = q().answerSequence();
        if (answerSequence == null || answerSequence.size() <= 0 || (choices = c().elements().choices()) == null || (choices2 = q().choices()) == null) {
            return;
        }
        int size = choices2.size() / answerSequence.size();
        C8632dsu.d(choices2);
        C8632dsu.d(choices);
        h2 = C8576dqs.h(choices2, choices);
        d2 = C8572dqo.d(h2, 10);
        ArrayList arrayList = new ArrayList(d2);
        int i2 = 0;
        int i3 = 0;
        for (Object obj : h2) {
            if (i3 < 0) {
                C8569dql.h();
            }
            Pair pair = (Pair) obj;
            Integer num = answerSequence.get(i3 / size);
            String str = (num != null && num.intValue() == i3 % size) ? VisualStateDefinition.ELEMENT_STATE.CORRECT : VisualStateDefinition.ELEMENT_STATE.WRONG;
            Object a2 = pair.a();
            C8632dsu.a(a2, "");
            Object d3 = pair.d();
            C8632dsu.a(d3, "");
            Choice choice = (Choice) d3;
            View e2 = C9703vR.e(this, cIE.c.d, 0, 2, null);
            C8632dsu.d(e2);
            arrayList.add(new b(i3, (UiDefinition.Layout.Choice) a2, choice, str, (C5624cCh) e2));
            i3++;
        }
        for (Object obj2 : arrayList) {
            if (i2 < 0) {
                C8569dql.h();
            }
            b bVar = (b) obj2;
            Observable<C5651cDh> j2 = j();
            InteractiveMoments d4 = d();
            Moment q = q();
            Map<String, Style> f2 = f();
            HashMap<String, Image> i4 = i();
            float h3 = h();
            InterfaceC9638uF r = r();
            UiDefinition.Layout.Config config = this.l;
            b().add(new cDB(j2, d4, q, bVar, f2, i4, h3, r, i2, config != null ? config.choicesSupportFallbackLabel() : true, x()));
            b(new C5651cDh.h(i2, bVar.e().isEnabled ? "default" : VisualStateDefinition.ELEMENT_STATE.DISABLED));
            i2++;
        }
    }

    private final void A() {
        HeaderLayoutElement header = c().elements().header();
        if (header != null) {
            C1204Sr c1204Sr = (C1204Sr) findViewById(cIE.b.aQ);
            c1204Sr.setVisibility(0);
            ArrayList<AbstractC5649cDf> b2 = b();
            Observable<C5651cDh> j2 = j();
            InteractiveMoments d2 = d();
            Moment q = q();
            C8632dsu.d(c1204Sr);
            String headerText = q().headerText();
            ImageAssetId headerImage = q().headerImage();
            String assetId = headerImage != null ? headerImage.assetId() : null;
            Map<String, Style> f2 = f();
            HashMap<String, Image> i2 = i();
            float h2 = h();
            InterfaceC9638uF r = r();
            UiDefinition.Layout.Config config = this.l;
            b2.add(new C5644cDa(j2, d2, q, c1204Sr, headerText, assetId, header, f2, i2, h2, r, config != null ? config.choicesSupportFallbackLabel() : true));
        }
    }

    /* renamed from: o.cCt$e */
    /* loaded from: classes4.dex */
    public static final class e extends cCS {
        final /* synthetic */ String b;
        final /* synthetic */ Choice d;

        e(Choice choice, String str) {
            this.d = choice;
            this.b = str;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            C5636cCt.i.getLogTag();
            if (C5636cCt.this.r != TransitionType.LAZY) {
                C5636cCt.this.b(C5651cDh.e.b);
            }
            if (C5636cCt.this.q().isInterstitialPostPlay() || C5636cCt.this.q().isFallbackTutorial()) {
                cHR u = C5636cCt.this.u();
                if (u != null) {
                    boolean z = C5636cCt.this.t;
                    Moment q = C5636cCt.this.q();
                    String id = this.d.id();
                    C8632dsu.a(id, "");
                    u.d(z, q, id, this.b, this.d.impressionData(), this.d.startTimeMs());
                    return;
                }
                return;
            }
            cHR u2 = C5636cCt.this.u();
            if (u2 != null) {
                Moment q2 = C5636cCt.this.q();
                String id2 = this.d.id();
                C8632dsu.a(id2, "");
                cHR.d.a(u2, true, q2, id2, this.b, this.d.impressionData(), C5636cCt.this.r, null, 64, null);
            }
        }

        @Override // o.cCS, o.cCK
        public void e() {
            C5636cCt.i.getLogTag();
            RS rs = C5636cCt.this.n;
            if (rs != null) {
                rs.e(true);
            }
        }
    }

    /* renamed from: o.cCt$a */
    /* loaded from: classes4.dex */
    public static final class a extends cCS {
        final /* synthetic */ int a;
        final /* synthetic */ e d;

        a(e eVar, int i) {
            this.d = eVar;
            this.a = i;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            C5636cCt.this.o().a(this.d);
            C5636cCt.this.b(this.a, VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
    }

    @Override // o.cBY, o.cBZ
    public void e() {
        setVisibility(8);
        clearAnimation();
        b(C5651cDh.e.b);
        super.e();
    }

    @Override // o.cBZ
    public void l() {
        o().c();
        b(C5651cDh.a.a);
    }

    @Override // o.cBZ
    public void s() {
        o().a();
        b(C5651cDh.i.b);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        i.getLogTag();
    }

    /* renamed from: o.cCt$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final C5624cCh a;
        private final int b;
        private final String c;
        private final UiDefinition.Layout.Choice d;
        private final Choice e;

        public final UiDefinition.Layout.Choice a() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final C5624cCh d() {
            return this.a;
        }

        public final Choice e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.b) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            int i = this.b;
            UiDefinition.Layout.Choice choice = this.d;
            Choice choice2 = this.e;
            String str = this.c;
            C5624cCh c5624cCh = this.a;
            return "TriviaButtonMetadata(index=" + i + ", layoutMetaData=" + choice + ", choiceMetadata=" + choice2 + ", onclickState=" + str + ", view=" + c5624cCh + ")";
        }

        public b(int i, UiDefinition.Layout.Choice choice, Choice choice2, String str, C5624cCh c5624cCh) {
            C8632dsu.c((Object) choice, "");
            C8632dsu.c((Object) choice2, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c5624cCh, "");
            this.b = i;
            this.d = choice;
            this.e = choice2;
            this.c = str;
            this.a = c5624cCh;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        i.getLogTag();
        this.f13653o = true;
        b(new C5651cDh.k(C5639cCw.e.d(y(), q())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        Choice choice;
        i.getLogTag();
        this.f13653o = false;
        List<Integer> answerSequence = q().answerSequence();
        int size = answerSequence != null ? answerSequence.size() : -1;
        int i2 = 0;
        for (Boolean bool : this.g) {
            i2 += bool.booleanValue() ? 1 : 0;
        }
        boolean z = i2 == size ? 1 : 0;
        if (z != 0) {
            c(Audio.TYPE.timeoutPass);
        } else {
            c(Audio.TYPE.timeoutFail);
        }
        TrackingInfo trackingInfo = q().trackingInfo(d());
        if (trackingInfo != null) {
            Moment.Builder builder = q().toBuilder();
            JSONObject copyValues = trackingInfo.copyValues(new JSONObject());
            copyValues.put("correctAnswerCount", i2);
            copyValues.put("selectedAnswers", new JSONArray((Collection) this.h));
            dpR dpr = dpR.c;
            Moment build = builder.trackingInfo(new TrackingInfo(copyValues)).build();
            C8632dsu.a(build, "");
            e(build);
        }
        b(new C5651cDh.m(z));
        b(C5651cDh.g.a);
        RS rs = this.n;
        if (rs != null) {
            rs.e(true);
        }
        List<Choice> choices = q().choices();
        if (choices != null) {
            this.k = !z;
            i.getLogTag();
            if (i2 != 0) {
                int size2 = choices.size();
                int i3 = this.k;
                if (i3 >= 0 && i3 < size2) {
                    choice = choices.get(i3);
                    e(new j(choice, this));
                }
            }
            choice = null;
            e(new j(choice, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i2, Choice choice) {
        cHR u;
        this.t = true;
        this.k = i2;
        i.getLogTag();
        String segmentId = choice.segmentId();
        if (this.r == TransitionType.LAZY && segmentId != null && (u = u()) != null) {
            Moment q = q();
            String id = choice.id();
            C8632dsu.a(id, "");
            cHR.d.a(u, true, q, id, segmentId, choice.impressionData(), this.r, null, 64, null);
        }
        a aVar = new a(new e(choice, segmentId), i2);
        c(Audio.TYPE.explicitSelection);
        o().c(this.r, i2, aVar);
    }
}
