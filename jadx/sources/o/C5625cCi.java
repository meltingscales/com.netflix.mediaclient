package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.interactive.Action;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import com.netflix.model.leafs.originals.interactive.TriviaContainerElement;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.C5625cCi;
import o.C5650cDg;
import o.C5651cDh;
import o.cBO;
import o.cCW;
import o.cHR;
import o.cIE;
import o.dpR;

/* renamed from: o.cCi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5625cCi extends cBY {
    public static final e i = new e(null);
    private int g;
    private int h;
    private RS k;
    private TransitionType l;
    private cCV m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13651o;
    private boolean r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5625cCi(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5625cCi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(String str) {
        this.n = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String k() {
        return this.n;
    }

    public /* synthetic */ C5625cCi(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5625cCi(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        this.g = -1;
        this.h = -1;
        this.l = TransitionType.IMMEDIATE;
    }

    /* renamed from: o.cCi$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("InteractiveTemplateChoicePoint");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (o.C8632dsu.c(r3, java.lang.Boolean.TRUE) != false) goto L22;
     */
    @Override // o.cBY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(o.aJY r2, o.InterfaceC9638uF r3, o.cHR r4, com.netflix.model.leafs.originals.interactive.Moment r5, com.netflix.model.leafs.originals.interactive.BaseLayout r6, com.netflix.model.leafs.originals.interactive.InteractiveMoments r7, int r8) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r7, r0)
            super.d(r2, r3, r4, r5, r6, r7, r8)
            r1.g = r8
            com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig r2 = r5.config()
            r3 = 0
            if (r2 == 0) goto L22
            java.lang.String r2 = r2.transitionType()
            goto L23
        L22:
            r2 = r3
        L23:
            com.netflix.model.leafs.originals.interactive.TransitionType r6 = com.netflix.model.leafs.originals.interactive.TransitionType.LAZY
            java.lang.String r7 = r6.getTransition()
            boolean r7 = o.C8632dsu.c(r2, r7)
            if (r7 == 0) goto L30
            goto L72
        L30:
            com.netflix.model.leafs.originals.interactive.TransitionType r7 = com.netflix.model.leafs.originals.interactive.TransitionType.IMMEDIATE
            java.lang.String r8 = r7.getTransition()
            boolean r8 = o.C8632dsu.c(r2, r8)
            if (r8 == 0) goto L3d
            goto L71
        L3d:
            com.netflix.model.leafs.originals.interactive.TransitionType r8 = com.netflix.model.leafs.originals.interactive.TransitionType.DELAYED_SEAMLESS
            java.lang.String r0 = r8.getTransition()
            boolean r2 = o.C8632dsu.c(r2, r0)
            if (r2 == 0) goto L4b
            r6 = r8
            goto L72
        L4b:
            com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig r2 = r5.config()
            if (r2 == 0) goto L5a
            java.lang.Boolean r2 = r2.queueSelectedChoice()
            if (r2 != 0) goto L58
            goto L5a
        L58:
            r3 = r2
            goto L68
        L5a:
            com.netflix.model.leafs.originals.interactive.UiDefinition$Layout r2 = r1.c()
            com.netflix.model.leafs.originals.interactive.UiDefinition$Layout$Config r2 = r2.config()
            if (r2 == 0) goto L68
            java.lang.Boolean r3 = r2.queueSelectedChoice()
        L68:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = o.C8632dsu.c(r3, r2)
            if (r2 == 0) goto L71
            goto L72
        L71:
            r6 = r7
        L72:
            r1.l = r6
            o.cCi$e r2 = o.C5625cCi.i
            r2.getLogTag()
            if (r4 == 0) goto L80
            o.cBQ$n r2 = o.cBQ.n.c
            r4.b(r2)
        L80:
            r1.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5625cCi.d(o.aJY, o.uF, o.cHR, com.netflix.model.leafs.originals.interactive.Moment, com.netflix.model.leafs.originals.interactive.BaseLayout, com.netflix.model.leafs.originals.interactive.InteractiveMoments, int):void");
    }

    @Override // o.cBY
    public void setupUI() {
        t();
        B();
        C();
        D();
        z();
        G();
        A();
    }

    @Override // o.cBY
    public void setupObservable() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5649cDf abstractC5649cDf : b()) {
            arrayList.add(abstractC5649cDf.n());
        }
        Observable merge = Observable.merge(arrayList);
        final drM<C5650cDg, dpR> drm = new drM<C5650cDg, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTemplateChoicePoint$setupObservable$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5650cDg c5650cDg) {
                c(c5650cDg);
                return dpR.c;
            }

            public final void c(C5650cDg c5650cDg) {
                cHR u;
                String str;
                if (c5650cDg instanceof C5650cDg.c) {
                    C5625cCi.this.f13651o = true;
                } else if (c5650cDg instanceof C5650cDg.d) {
                    C5625cCi.this.f13651o = false;
                    C5625cCi.this.m();
                } else if (!(c5650cDg instanceof C5650cDg.a)) {
                    if (c5650cDg instanceof C5650cDg.e) {
                        C5625cCi.this.b(C5651cDh.j.b);
                        C5650cDg.e eVar = (C5650cDg.e) c5650cDg;
                        C5625cCi.this.a(eVar.b(), eVar.c());
                    } else if (!(c5650cDg instanceof C5650cDg.h) || (u = C5625cCi.this.u()) == null) {
                    } else {
                        u.b(new cBO.A(((C5650cDg.h) c5650cDg).a()));
                    }
                } else {
                    C5650cDg.a aVar = (C5650cDg.a) c5650cDg;
                    C5625cCi.this.b(new C5651cDh.h(aVar.e(), aVar.d()));
                    String d2 = aVar.d();
                    switch (d2.hashCode()) {
                        case -934426595:
                            if (d2.equals(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
                                C5625cCi.this.b(new C5651cDh.h(aVar.e(), VisualStateDefinition.ELEMENT_STATE.RESULT));
                                return;
                            }
                            return;
                        case -691041417:
                            if (d2.equals("focused")) {
                                C5625cCi.this.h = aVar.e();
                                C5625cCi.this.g = aVar.e();
                                cCW.b(C5625cCi.this.o(), true, aVar.e(), null, 4, null);
                                return;
                            }
                            return;
                        case 113405357:
                            str = VisualStateDefinition.ELEMENT_STATE.WRONG;
                            break;
                        case 955164778:
                            str = VisualStateDefinition.ELEMENT_STATE.CORRECT;
                            break;
                        case 1191572123:
                            if (d2.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                C5625cCi.this.b(new C5651cDh.h(aVar.e(), VisualStateDefinition.ELEMENT_STATE.SELECTED));
                                return;
                            }
                            return;
                        case 1544803905:
                            if (d2.equals("default")) {
                                cCW.b(C5625cCi.this.o(), false, aVar.e(), null, 4, null);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                    d2.equals(str);
                }
            }
        };
        setPlayerUIEventsObservable(merge.subscribe(new Consumer() { // from class: o.cCl
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5625cCi.c(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void n() {
        setVisibility(0);
        o().a(q().choices(), new b());
    }

    /* renamed from: o.cCi$b */
    /* loaded from: classes4.dex */
    public static final class b implements cCK {
        @Override // o.cCK
        public void a() {
        }

        @Override // o.cCK
        public void c() {
        }

        b() {
        }

        @Override // o.cCK
        public void b() {
            C5625cCi.i.getLogTag();
            List<UiDefinition.Layout.Choice> choices = C5625cCi.this.c().elements().choices();
            if (choices != null) {
                C5625cCi c5625cCi = C5625cCi.this;
                Iterator<UiDefinition.Layout.Choice> it = choices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View findViewWithTag = c5625cCi.findViewWithTag(it.next().id());
                    if (findViewWithTag != null) {
                        findViewWithTag.sendAccessibilityEvent(8);
                        break;
                    }
                }
            }
            C5625cCi.this.o().e(C5625cCi.this.q().choices(), null);
            cCW.e(C5625cCi.this.o(), null, 1, null);
            C5625cCi.this.F();
        }

        @Override // o.cCK
        public void e() {
            C5625cCi.i.getLogTag();
            RS rs = C5625cCi.this.k;
            if (rs != null) {
                rs.setVisibility(0);
                rs.c(true);
            }
            C5625cCi.this.c("init");
            Context context = C5625cCi.this.getContext();
            C8632dsu.a(context, "");
            AccessibilityUtils.b(context, C5625cCi.this.k());
        }
    }

    /* renamed from: o.cCi$d */
    /* loaded from: classes4.dex */
    public static final class d extends cCS {
        final /* synthetic */ C5625cCi a;
        final /* synthetic */ Ref.BooleanRef b;
        final /* synthetic */ String e;

        d(Ref.BooleanRef booleanRef, C5625cCi c5625cCi, String str) {
            this.b = booleanRef;
            this.a = c5625cCi;
            this.e = str;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            if (this.b.a) {
                return;
            }
            C5625cCi.i.getLogTag();
            cHR u = this.a.u();
            if (u != null) {
                Moment q = this.a.q();
                String str = this.e;
                u.d(false, q, str, str, null, 0L);
            }
        }
    }

    /* renamed from: o.cCi$h */
    /* loaded from: classes4.dex */
    public static final class h extends cCS {
        final /* synthetic */ C5625cCi c;
        final /* synthetic */ Choice d;

        h(Choice choice, C5625cCi c5625cCi) {
            this.d = choice;
            this.c = c5625cCi;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            Choice choice = this.d;
            Choice.ChoiceAction action = choice != null ? choice.action() : null;
            Choice choice2 = this.d;
            String segmentId = choice2 != null ? choice2.segmentId() : null;
            if (action != null && (action.type().equals(Action.ActionType.NEXT_EPISODE) || action.type().equals(Action.ActionType.PLAY_VIDEO))) {
                cHR u = this.c.u();
                if (u != null) {
                    Moment q = this.c.q();
                    Choice choice3 = this.d;
                    u.d(q, choice3, choice3.impressionData(), this.c.r);
                    return;
                }
                return;
            }
            cHR u2 = this.c.u();
            if (u2 != null) {
                boolean z = this.c.r;
                Moment q2 = this.c.q();
                Choice choice4 = this.d;
                String id = choice4 != null ? choice4.id() : null;
                if (id == null) {
                    id = "";
                }
                String str = id;
                Choice choice5 = this.d;
                cHR.d.a(u2, z, q2, str, segmentId, choice5 != null ? choice5.impressionData() : null, this.c.l, null, 64, null);
            }
            aJY y = this.c.y();
            if (y != null) {
                long o2 = y.o();
                C5625cCi c5625cCi = this.c;
                cHR u3 = c5625cCi.u();
                if (u3 != null) {
                    u3.a(MomentState.b, c5625cCi.q(), o2);
                }
            }
        }
    }

    /* renamed from: o.cCi$g */
    /* loaded from: classes4.dex */
    public static final class g extends cCS {
        final /* synthetic */ h e;

        g(h hVar) {
            this.e = hVar;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            C5625cCi.this.o().a(this.e);
            C5625cCi c5625cCi = C5625cCi.this;
            c5625cCi.b(c5625cCi.g, VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
    }

    private final void t() {
        BackgroundImageElement background = c().elements().background(d());
        if (background != null) {
            C5640cCx c5640cCx = (C5640cCx) findViewById(cIE.b.s);
            c5640cCx.setVisibility(0);
            ArrayList<AbstractC5649cDf> b2 = b();
            Observable<C5651cDh> j = j();
            InteractiveMoments d2 = d();
            Moment q = q();
            C8632dsu.d(c5640cCx);
            b2.add(new cCY(j, d2, q, background, c5640cCx, f(), i(), h(), r()));
        }
    }

    private final void B() {
        LayoutTimer timer;
        UiDefinition.Layout.Elements elements = c().elements();
        cCV ccv = null;
        if (elements != null && (timer = elements.timer()) != null) {
            String type = timer.type();
            if (type != null && type.hashCode() == 1905897312 && type.equals("SpriteTimer")) {
                Observable<C5651cDh> j = j();
                InteractiveMoments d2 = d();
                Moment q = q();
                View e2 = C9703vR.e(this, cIE.c.h, 0, 2, null);
                C8632dsu.d(e2);
                ccv = new C5660cDq(j, d2, q, (FrameLayout) e2, timer, f(), i(), h(), r());
            } else {
                Observable<C5651cDh> j2 = j();
                InteractiveMoments d3 = d();
                Moment q2 = q();
                View e3 = C9703vR.e(this, cIE.c.e, 0, 2, null);
                C8632dsu.d(e3);
                ccv = new C5647cDd(j2, d3, q2, (FrameLayout) e3, timer, f(), i(), h(), r());
            }
            b().add(ccv);
        }
        this.m = ccv;
    }

    private final void C() {
        List<Choice> choices;
        List<UiDefinition.Layout.Choice> choices2 = c().elements().choices();
        if (choices2 == null || (choices = q().choices()) == null) {
            return;
        }
        C8632dsu.d(choices);
        int i2 = 0;
        for (Object obj : choices) {
            if (i2 < 0) {
                C8569dql.h();
            }
            Choice choice = (Choice) obj;
            if (choice != null && choice.isEnabled && choices2.size() > i2) {
                UiDefinition.Layout.Choice choice2 = choices2.get(i2);
                String type = choice2.type();
                if (type != null) {
                    int hashCode = type.hashCode();
                    if (hashCode != -1651981067) {
                        if (hashCode != -243307412) {
                            C8632dsu.d(choice2);
                            c(i2, choice, choice2);
                        } else {
                            C8632dsu.d(choice2);
                            c(i2, choice, choice2);
                        }
                    } else if (type.equals("TooltipButton")) {
                        C8632dsu.d(choice2);
                        d(i2, choice2, choice);
                    }
                }
                C8632dsu.d(choice2);
                b(i2, choice2, choice);
            }
            i2++;
        }
    }

    private final void d(int i2, UiDefinition.Layout.Choice choice, Choice choice2) {
        View e2 = C9703vR.e(this, cIE.c.m, 0, 2, null);
        C8632dsu.d(e2);
        b().add(new C5665cDv(j(), d(), q(), (C5633cCq) e2, choice, choice2, f(), i(), h(), r(), i2, x()));
        b(new C5651cDh.h(i2, "default"));
    }

    private final void c(int i2, Choice choice, UiDefinition.Layout.Choice choice2) {
        boolean g2;
        String text = choice.text();
        if (text != null) {
            g2 = C8691duz.g(text);
            if (g2) {
                return;
            }
            RS rs = (RS) findViewById(cIE.b.ag);
            if (rs != null) {
                rs.setVisibility(0);
                b().add(new C5657cDn(j(), d(), q(), rs, choice2, choice, f(), i(), h(), r(), i2));
            } else {
                rs = null;
            }
            this.k = rs;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void b(int i2, UiDefinition.Layout.Choice choice, Choice choice2) {
        View e2 = C9703vR.e(this, cIE.c.d, 0, 2, null);
        C8632dsu.d(e2);
        b().add(new C5659cDp(j(), d(), q(), (C5624cCh) e2, choice, choice2, a(), f(), i(), h(), r(), i2, x()));
        b(new C5651cDh.h(i2, "default"));
    }

    private final void z() {
        HeaderLayoutElement header = c().elements().header();
        if (header != null) {
            C1204Sr c1204Sr = (C1204Sr) findViewById(cIE.b.aQ);
            ArrayList<AbstractC5649cDf> b2 = b();
            Observable<C5651cDh> j = j();
            InteractiveMoments d2 = d();
            Moment q = q();
            C8632dsu.d(c1204Sr);
            String headerText = q().headerText();
            ImageAssetId headerImage = q().headerImage();
            b2.add(new C5644cDa(j, d2, q, c1204Sr, headerText, headerImage != null ? headerImage.assetId() : null, header, f(), i(), h(), r(), false, 2048, null));
            this.n = q().headerText();
        }
    }

    private final void G() {
        TriviaContainerElement tutorialContent = c().elements().tutorialContent();
        if (tutorialContent != null) {
            View e2 = C9703vR.e(this, cIE.c.j, 0, 2, null);
            C8632dsu.d(e2);
            FrameLayout frameLayout = (FrameLayout) e2;
            frameLayout.setId(View.generateViewId());
            frameLayout.setVisibility(0);
            b().add(new cDA(j(), d(), q(), frameLayout, tutorialContent, f(), i(), h(), r()));
            this.n = q().headerText();
        }
    }

    private final void A() {
        TriviaContainerElement resultsContent = c().elements().resultsContent(d());
        if (resultsContent != null) {
            View e2 = C9703vR.e(this, cIE.c.j, 0, 2, null);
            C8632dsu.d(e2);
            FrameLayout frameLayout = (FrameLayout) e2;
            frameLayout.setId(View.generateViewId());
            frameLayout.setVisibility(0);
            b().add(new cDA(j(), d(), q(), frameLayout, resultsContent, f(), i(), h(), r()));
            this.n = q().headerText();
        }
    }

    private final void D() {
        if (c().elements().toast() == null && c().elements().notification(d()) == null) {
            return;
        }
        e(q(), c());
        RS rs = this.k;
        if (rs != null) {
            ViewGroup.LayoutParams layoutParams = rs.getLayoutParams();
            C8632dsu.d(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin + (100 * h()));
            rs.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: o.cCi$c */
    /* loaded from: classes4.dex */
    public static final class c extends cCS {
        final /* synthetic */ boolean a;
        final /* synthetic */ Choice c;
        final /* synthetic */ String e;

        c(boolean z, Choice choice, String str) {
            this.a = z;
            this.c = choice;
            this.e = str;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            C5625cCi.i.getLogTag();
            if (C5625cCi.this.l != TransitionType.LAZY) {
                C5625cCi.this.b(C5651cDh.e.b);
            }
            if (this.a) {
                cHR u = C5625cCi.this.u();
                if (u != null) {
                    Moment q = C5625cCi.this.q();
                    Choice choice = this.c;
                    u.d(q, choice, choice.impressionData(), C5625cCi.this.r);
                }
            } else if (C5625cCi.this.q().isInterstitialPostPlay() || C5625cCi.this.q().isFallbackTutorial()) {
                cHR u2 = C5625cCi.this.u();
                if (u2 != null) {
                    boolean z = C5625cCi.this.r;
                    Moment q2 = C5625cCi.this.q();
                    String id = this.c.id();
                    C8632dsu.a(id, "");
                    u2.d(z, q2, id, this.e, this.c.impressionData(), this.c.startTimeMs());
                }
            } else {
                cHR u3 = C5625cCi.this.u();
                if (u3 != null) {
                    Moment q3 = C5625cCi.this.q();
                    String id2 = this.c.id();
                    C8632dsu.a(id2, "");
                    cHR.d.a(u3, true, q3, id2, this.e, this.c.impressionData(), C5625cCi.this.l, null, 64, null);
                }
            }
        }

        @Override // o.cCS, o.cCK
        public void e() {
            C5625cCi.i.getLogTag();
            RS rs = C5625cCi.this.k;
            if (rs != null) {
                rs.e(true);
            }
        }
    }

    /* renamed from: o.cCi$a */
    /* loaded from: classes4.dex */
    public static final class a extends cCS {
        final /* synthetic */ int a;
        final /* synthetic */ c c;

        a(c cVar, int i) {
            this.c = cVar;
            this.a = i;
        }

        @Override // o.cCS, o.cCK
        public void b() {
            C5625cCi.this.o().a(this.c);
            C5625cCi.this.b(this.a, VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
    }

    protected void c(int i2) {
        c(Audio.TYPE.explicitSelection);
    }

    @Override // o.cBY, o.cBZ
    public void e() {
        super.e();
        b(C5651cDh.e.b);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        i.getLogTag();
        b(new C5651cDh.k(C5639cCw.e.d(y(), q())));
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [o.buT] */
    public void m() {
        Boolean autoSelectChoiceOnTimeout;
        PlaylistTimestamp l;
        String str;
        ?? a2;
        C5213buX[] f;
        InteractiveSceneConfig config;
        e eVar = i;
        eVar.getLogTag();
        RS rs = this.k;
        if (rs != null) {
            rs.e(true);
        }
        b(C5651cDh.g.a);
        if (this.r && this.l == TransitionType.LAZY) {
            cCW.e(o(), this.l, this.g, this.r, this.h, null, 16, null);
            return;
        }
        if (this.l == TransitionType.IMMEDIATE && ((config = q().config()) == null || !C8632dsu.c(config.jumpImmediatelyOnTimeout(), Boolean.TRUE))) {
            this.l = TransitionType.LAZY;
        }
        Moment.TimeoutSegment timeoutSegment = q().timeoutSegment();
        Choice choice = null;
        String timeoutSegmentId = timeoutSegment != null ? timeoutSegment.getTimeoutSegmentId() : null;
        aJY y = y();
        if (timeoutSegmentId == null) {
            List<Choice> choices = q().choices();
            eVar.getLogTag();
            InteractiveSceneConfig config2 = q().config();
            if (config2 == null || (autoSelectChoiceOnTimeout = config2.autoSelectChoiceOnTimeout()) == null) {
                autoSelectChoiceOnTimeout = c().config().autoSelectChoiceOnTimeout();
            }
            if (C8632dsu.c(autoSelectChoiceOnTimeout, Boolean.FALSE)) {
                this.g = -1;
            }
            if (choices != null) {
                int size = choices.size();
                int i2 = this.g;
                if (i2 >= 0 && i2 < size) {
                    choice = choices.get(i2);
                }
            }
            g gVar = new g(new h(choice, this));
            c(Audio.TYPE.timeout);
            int i3 = this.g;
            if (i3 > -1) {
                b(new C5651cDh.h(i3, VisualStateDefinition.ELEMENT_STATE.SELECTED));
            }
            o().c(this.l, this.g, false, this.h, gVar);
            return;
        }
        eVar.getLogTag();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if ((y instanceof IPlaylistControl) && (l = y.l()) != null && (str = l.a) != null) {
            eVar.getLogTag();
            PlaylistMap<?> H = y.H();
            if (H != null && (a2 = H.a(str)) != 0 && (f = a2.f()) != null) {
                for (C5213buX c5213buX : f) {
                    e eVar2 = i;
                    eVar2.getLogTag();
                    if (C8632dsu.c((Object) c5213buX.d, (Object) timeoutSegmentId)) {
                        eVar2.getLogTag();
                        booleanRef.a = true;
                    }
                }
            }
        }
        if (booleanRef.a) {
            i.getLogTag();
            cHR u = u();
            if (u != null) {
                cHR.d.a(u, false, q(), timeoutSegmentId, timeoutSegmentId, null, null, null, 96, null);
            }
            this.g = -1;
        }
        o().d(new d(booleanRef, this, timeoutSegmentId));
    }

    public void a(int i2, Choice choice) {
        cHR u;
        String type;
        C8632dsu.c((Object) choice, "");
        boolean z = true;
        this.r = true;
        this.g = i2;
        i.getLogTag();
        String segmentId = choice.segmentId();
        Choice.ChoiceAction action = choice.action();
        if (action == null || (type = action.type()) == null || (!C8632dsu.c((Object) type, (Object) Action.ActionType.NEXT_EPISODE) && !C8632dsu.c((Object) type, (Object) Action.ActionType.PLAY_VIDEO))) {
            z = false;
        }
        if (this.l == TransitionType.LAZY && segmentId != null && (u = u()) != null) {
            Moment q = q();
            String id = choice.id();
            C8632dsu.a(id, "");
            cHR.d.a(u, true, q, id, segmentId, choice.impressionData(), this.l, null, 64, null);
        }
        a aVar = new a(new c(z, choice, segmentId), i2);
        c(i2);
        o().c(this.l, i2, aVar);
    }
}
