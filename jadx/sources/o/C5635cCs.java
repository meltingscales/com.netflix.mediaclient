package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.StringsObject;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.TrackingInfo;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.HeaderLayoutElement;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.PlayerScoreContainerElement;
import com.netflix.model.leafs.originals.interactive.template.QuestionsHelper;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C5635cCs;
import o.C5650cDg;
import o.C5651cDh;
import o.cBQ;
import o.cBZ;
import o.cCW;
import o.cIE;
import o.dpR;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.cCs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5635cCs extends cBY {
    private C5644cDa g;
    private QuestionsHelper h;
    private boolean i;
    private C5647cDd l;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13652o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5635cCs(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5635cCs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5635cCs(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5635cCs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.i = true;
    }

    @Override // o.cBY
    public void d(aJY ajy, InterfaceC9638uF interfaceC9638uF, cHR chr, Moment moment, BaseLayout baseLayout, InteractiveMoments interactiveMoments, int i) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) baseLayout, "");
        C8632dsu.c((Object) interactiveMoments, "");
        super.d(ajy, interfaceC9638uF, chr, moment, baseLayout, interactiveMoments, i);
        if (chr != null) {
            chr.b(cBQ.n.c);
        }
        t();
    }

    @Override // o.cBY
    public void setupUI() {
        QuestionsHelper questionsHelper;
        String str;
        this.h = new QuestionsHelper(q().questions(), d());
        n();
        k();
        QuestionsHelper questionsHelper2 = this.h;
        Choice choice = null;
        if (questionsHelper2 == null) {
            C8632dsu.d("");
            questionsHelper2 = null;
        }
        Moment currentQuestion = questionsHelper2.getCurrentQuestion();
        if (currentQuestion != null) {
            HeaderLayoutElement header = c().elements().header();
            if (header != null) {
                Observable<C5651cDh> j = j();
                InteractiveMoments d2 = d();
                Moment q = q();
                View findViewById = findViewById(cIE.b.aQ);
                C8632dsu.a(findViewById, "");
                C1204Sr c1204Sr = (C1204Sr) findViewById;
                String headerText = currentQuestion.headerText();
                ImageAssetId headerImage = currentQuestion.headerImage();
                String assetId = headerImage != null ? headerImage.assetId() : null;
                C8632dsu.d(header);
                this.g = new C5644cDa(j, d2, q, c1204Sr, headerText, assetId, header, f(), i(), h(), r(), false, 2048, null);
                ArrayList<AbstractC5649cDf> b2 = b();
                C5644cDa c5644cDa = this.g;
                if (c5644cDa == null) {
                    C8632dsu.d("");
                    c5644cDa = null;
                }
                b2.add(c5644cDa);
            }
            List<Choice> choices = currentQuestion.choices();
            List<UiDefinition.Layout.Choice> choices2 = c().elements().choices();
            if (choices2 != null) {
                C8632dsu.d(choices2);
                int i = 0;
                int i2 = 0;
                for (Object obj : choices2) {
                    if (i2 < 0) {
                        C8569dql.h();
                    }
                    UiDefinition.Layout.Choice choice2 = (UiDefinition.Layout.Choice) obj;
                    View e2 = C9703vR.e(this, cIE.c.d, i, 2, choice);
                    C8632dsu.d(e2);
                    C5624cCh c5624cCh = (C5624cCh) e2;
                    Choice choice3 = ((choices != null ? choices.size() : i) <= i2 || choices == null) ? choice : choices.get(i2);
                    List<Choice> list = choices;
                    int i3 = i2;
                    b().add(new c(currentQuestion, i2, c5624cCh, choice2, choice3, j(), d(), q(), a(), f(), i(), h(), r()));
                    b(new C5651cDh.h(i3, "default"));
                    i2 = i3 + 1;
                    currentQuestion = currentQuestion;
                    choices = list;
                    i = i;
                    choice = null;
                }
            }
            PlayerScoreContainerElement p1ScoreLabel = c().elements().p1ScoreLabel();
            if (p1ScoreLabel != null) {
                ArrayList<AbstractC5649cDf> b3 = b();
                Observable<C5651cDh> j2 = j();
                InteractiveMoments d3 = d();
                Moment q2 = q();
                View findViewById2 = findViewById(cIE.b.aV);
                C8632dsu.a(findViewById2, "findViewById(...)");
                C8632dsu.d(p1ScoreLabel);
                str = "findViewById(...)";
                b3.add(new C5654cDk(j2, d3, q2, (FrameLayout) findViewById2, p1ScoreLabel, f(), i(), h(), r(), false, 512, null));
            } else {
                str = "findViewById(...)";
            }
            PlayerScoreContainerElement p2ScoreLabel = c().elements().p2ScoreLabel();
            if (p2ScoreLabel != null) {
                ArrayList<AbstractC5649cDf> b4 = b();
                Observable<C5651cDh> j3 = j();
                InteractiveMoments d4 = d();
                Moment q3 = q();
                View findViewById3 = findViewById(cIE.b.aY);
                C8632dsu.a(findViewById3, str);
                C8632dsu.d(p2ScoreLabel);
                b4.add(new C5654cDk(j3, d4, q3, (FrameLayout) findViewById3, p2ScoreLabel, f(), i(), h(), r(), false, 512, null));
            }
            TriviaStreakIndicatorElement streakIndicator = c().elements().streakIndicator();
            if (streakIndicator != null) {
                ArrayList<AbstractC5649cDf> b5 = b();
                Observable<C5651cDh> j4 = j();
                InteractiveMoments d5 = d();
                Moment q4 = q();
                View findViewById4 = findViewById(cIE.b.aT);
                C8632dsu.a(findViewById4, str);
                C8632dsu.d(streakIndicator);
                b5.add(new C5664cDu(j4, d5, q4, (FrameLayout) findViewById4, streakIndicator, f(), i(), h(), r(), false, 512, null));
            }
            BackgroundImageElement controlsIcon = c().elements().controlsIcon();
            if (controlsIcon != null) {
                ArrayList<AbstractC5649cDf> b6 = b();
                Observable<C5651cDh> j5 = j();
                InteractiveMoments d6 = d();
                Moment q5 = q();
                C8632dsu.d(controlsIcon);
                View findViewById5 = findViewById(cIE.b.K);
                C8632dsu.a(findViewById5, str);
                b6.add(new cCY(j5, d6, q5, controlsIcon, findViewById5, f(), i(), h(), r()));
            }
            LabelElement leftPointsEarnedLabel = c().elements().leftPointsEarnedLabel(d());
            if (leftPointsEarnedLabel != null) {
                C1204Sr c1204Sr2 = (C1204Sr) findViewById(cIE.b.aP);
                ArrayList<AbstractC5649cDf> b7 = b();
                Observable<C5651cDh> j6 = j();
                InteractiveMoments d7 = d();
                Moment q6 = q();
                StringsObject interactiveStrings = q().interactiveStrings();
                b7.add(new d(c1204Sr2, leftPointsEarnedLabel, j6, d7, q6, interactiveStrings != null ? interactiveStrings.get(leftPointsEarnedLabel.id(), d()) : null, f(), i(), h(), r()));
            }
            LabelElement rightPointsEarnedLabel = c().elements().rightPointsEarnedLabel(d());
            if (rightPointsEarnedLabel != null) {
                C1204Sr c1204Sr3 = (C1204Sr) findViewById(cIE.b.aU);
                ArrayList<AbstractC5649cDf> b8 = b();
                Observable<C5651cDh> j7 = j();
                InteractiveMoments d8 = d();
                Moment q7 = q();
                StringsObject interactiveStrings2 = q().interactiveStrings();
                b8.add(new e(c1204Sr3, rightPointsEarnedLabel, j7, d8, q7, interactiveStrings2 != null ? interactiveStrings2.get(rightPointsEarnedLabel.id(), d()) : null, f(), i(), h(), r()));
            }
        }
        QuestionsHelper questionsHelper3 = this.h;
        if (questionsHelper3 == null) {
            C8632dsu.d("questionHelper");
            questionsHelper = null;
        } else {
            questionsHelper = questionsHelper3;
        }
        b(new C5651cDh.f(questionsHelper.getCurrentQuestion()));
    }

    /* renamed from: o.cCs$c */
    /* loaded from: classes4.dex */
    public static final class c extends C5659cDp {
        final /* synthetic */ UiDefinition.Layout.Choice a;
        private boolean b;
        final /* synthetic */ C5624cCh e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Moment moment, int i, C5624cCh c5624cCh, UiDefinition.Layout.Choice choice, Choice choice2, Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment2, cBU cbu, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
            super(observable, interactiveMoments, moment2, c5624cCh, choice, choice2, cbu, map, hashMap, f, interfaceC9638uF, i, false);
            Integer num;
            this.e = c5624cCh;
            this.a = choice;
            C8632dsu.d(choice);
            List<Integer> correctInput = moment.correctInput();
            boolean z = false;
            if (correctInput != null && (num = correctInput.get(0)) != null && num.intValue() == i) {
                z = true;
            }
            this.b = z;
        }

        @Override // o.C5659cDp
        public void c() {
            CharSequence text = this.e.h().getText();
            boolean z = text == null || text.length() == 0;
            C5640cCx c = this.e.c();
            View.OnClickListener q = z ? null : q();
            c.setOnClickListener(q);
            c.setClickable(q != null);
            this.e.c().setOnTouchListener(z ? null : r());
            C5640cCx d = this.e.d();
            View.OnClickListener q2 = z ? null : q();
            d.setOnClickListener(q2);
            d.setClickable(q2 != null);
            this.e.d().setOnTouchListener(z ? null : r());
        }

        @Override // o.cCX, o.AbstractC5649cDf
        public void a(int i) {
            if (i != b() && this.b) {
                UiDefinition.Layout.Choice.ChoiceChildren children = this.a.children();
                cCN b = b(children != null ? children.label() : null);
                if (b != null) {
                    b.c(i);
                    return;
                }
                return;
            }
            super.a(i);
        }

        @Override // o.AbstractC5649cDf
        public void e(Moment moment) {
            ImageElement background;
            ImageElement background2;
            List<Integer> correctInput;
            List<Choice> choices;
            super.e(moment);
            boolean z = false;
            d(false);
            String str = null;
            if (moment != null && (choices = moment.choices()) != null) {
                if (choices.size() > b()) {
                    Choice choice = choices.get(b());
                    d(choice);
                    str = choice.text();
                } else {
                    d((Choice) null);
                }
            }
            this.e.h().setText(str);
            if (s() == null) {
                this.e.c().setVisibility(8);
                this.e.d().setVisibility(8);
            } else {
                this.e.c().setVisibility(0);
                this.e.d().setVisibility(0);
                UiDefinition.Layout.Choice.ChoiceChildren children = this.a.children();
                if (children != null) {
                    C5624cCh c5624cCh = this.e;
                    Choice s = s();
                    if (s == null || (background2 = s.background()) == null || (background = background2.merge(children.background())) == null) {
                        background = children.background();
                    }
                    if (background != null) {
                        AbstractC5649cDf.d.b(c5624cCh.c(), o().get(background.styleId()), m());
                    }
                }
            }
            c();
            if (moment != null && (correctInput = moment.correctInput()) != null) {
                int b = b();
                Integer num = correctInput.get(0);
                if (num != null && b == num.intValue()) {
                    z = true;
                }
            }
            this.b = z;
        }
    }

    /* renamed from: o.cCs$d */
    /* loaded from: classes4.dex */
    public static final class d extends C5667cDx {
        final /* synthetic */ C1204Sr a;
        final /* synthetic */ LabelElement e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1204Sr c1204Sr, LabelElement labelElement, Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, String str, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
            super(observable, interactiveMoments, moment, c1204Sr, labelElement, str, map, hashMap, f, interfaceC9638uF, false, 1024, null);
            this.a = c1204Sr;
            this.e = labelElement;
            C8632dsu.d(c1204Sr);
            C8632dsu.d(labelElement);
        }

        @Override // o.AbstractC5649cDf
        public void e(int i) {
            super.e(i);
            this.a.setText(c(this.e.id()));
        }
    }

    /* renamed from: o.cCs$e */
    /* loaded from: classes4.dex */
    public static final class e extends C5667cDx {
        final /* synthetic */ LabelElement a;
        final /* synthetic */ C1204Sr c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C1204Sr c1204Sr, LabelElement labelElement, Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, String str, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF) {
            super(observable, interactiveMoments, moment, c1204Sr, labelElement, str, map, hashMap, f, interfaceC9638uF, false, 1024, null);
            this.c = c1204Sr;
            this.a = labelElement;
            C8632dsu.d(c1204Sr);
            C8632dsu.d(labelElement);
        }

        @Override // o.AbstractC5649cDf
        public void e(int i) {
            super.e(i);
            this.c.setText(c(this.a.id()));
        }
    }

    private final void k() {
        LayoutTimer timer;
        UiDefinition.Layout.Elements elements = c().elements();
        C5647cDd c5647cDd = null;
        if (elements != null && (timer = elements.timer()) != null) {
            Observable<C5651cDh> j = j();
            InteractiveMoments d2 = d();
            Moment q = q();
            View e2 = C9703vR.e(this, cIE.c.e, 0, 2, null);
            C8632dsu.d(e2);
            FrameLayout frameLayout = (FrameLayout) e2;
            ConstraintLayout constraintLayout = (ConstraintLayout) frameLayout.findViewById(cIE.b.bT);
            if (constraintLayout != null) {
                C8632dsu.d(constraintLayout);
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.clear(cIE.b.bT, 7);
                constraintSet.clear(cIE.b.bQ, 7);
                constraintSet.applyTo(constraintLayout);
            }
            dpR dpr = dpR.c;
            c5647cDd = new C5647cDd(j, d2, q, frameLayout, timer, f(), i(), h(), r());
            b().add(c5647cDd);
        }
        this.l = c5647cDd;
    }

    private final void t() {
        setVisibility(0);
        cCW o2 = o();
        QuestionsHelper questionsHelper = this.h;
        if (questionsHelper == null) {
            C8632dsu.d("");
            questionsHelper = null;
        }
        Moment currentQuestion = questionsHelper.getCurrentQuestion();
        o2.a(currentQuestion != null ? currentQuestion.choices() : null, new b());
    }

    /* renamed from: o.cCs$b */
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
            C5635cCs.this.z();
        }

        @Override // o.cCK
        public void e() {
            cBZ.a.getLogTag();
            C5635cCs.this.c("init");
        }
    }

    private final void n() {
        BackgroundImageElement background = c().elements().background(d());
        if (background != null) {
            Observable<C5651cDh> j = j();
            InteractiveMoments d2 = d();
            Moment q = q();
            View findViewById = findViewById(cIE.b.N);
            C8632dsu.a(findViewById, "");
            new cCY(j, d2, q, background, findViewById, f(), i(), h(), r());
        }
    }

    @Override // o.cBY
    public void setupObservable() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5649cDf abstractC5649cDf : b()) {
            arrayList.add(abstractC5649cDf.n());
        }
        Observable merge = Observable.merge(arrayList);
        final drM<C5650cDg, dpR> drm = new drM<C5650cDg, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTemplateTriviaVerseChoicePoint$setupObservable$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5650cDg c5650cDg) {
                a(c5650cDg);
                return dpR.c;
            }

            public final void a(C5650cDg c5650cDg) {
                if (c5650cDg instanceof C5650cDg.c) {
                    C5635cCs.this.f13652o = true;
                } else if (c5650cDg instanceof C5650cDg.d) {
                    C5635cCs.this.f13652o = false;
                    C5635cCs.this.m();
                } else if (c5650cDg instanceof C5650cDg.b) {
                    C5650cDg.b bVar = (C5650cDg.b) c5650cDg;
                    C5635cCs.this.b(new C5651cDh.c(bVar.a()));
                    int a2 = bVar.a();
                    if (a2 == 1) {
                        C5635cCs.this.i = false;
                    } else if (a2 != 10) {
                    } else {
                        cBZ.a.getLogTag();
                        C5635cCs.this.b(new C5651cDh.h(-1, VisualStateDefinition.ELEMENT_STATE.LAST_10_SECS));
                    }
                } else if (c5650cDg instanceof C5650cDg.a) {
                    C5650cDg.a aVar = (C5650cDg.a) c5650cDg;
                    C5635cCs.this.b(new C5651cDh.h(aVar.e(), aVar.d()));
                    String d2 = aVar.d();
                    int hashCode = d2.hashCode();
                    if (hashCode == -691041417) {
                        if (d2.equals("focused")) {
                            cCW.b(C5635cCs.this.o(), true, aVar.e(), null, 4, null);
                        }
                    } else if (hashCode == 1191572123) {
                        if (d2.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                            C5635cCs.this.b(new C5651cDh.h(aVar.e(), VisualStateDefinition.ELEMENT_STATE.SELECTED));
                        }
                    } else if (hashCode == 1544803905 && d2.equals("default")) {
                        cCW.b(C5635cCs.this.o(), false, aVar.e(), null, 4, null);
                    }
                } else if (c5650cDg instanceof C5650cDg.e) {
                    C5635cCs.this.b(C5651cDh.j.b);
                    C5650cDg.e eVar = (C5650cDg.e) c5650cDg;
                    C5635cCs.this.d(eVar.b(), eVar.c());
                } else if (c5650cDg instanceof C5650cDg.i) {
                    C5635cCs.this.c(((C5650cDg.i) c5650cDg).e());
                }
            }
        };
        setPlayerUIEventsObservable(merge.subscribe(new Consumer() { // from class: o.cCu
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5635cCs.a(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final void d(int i, Choice choice) {
        List<Integer> correctInput;
        QuestionsHelper questionsHelper = this.h;
        if (questionsHelper == null) {
            C8632dsu.d("");
            questionsHelper = null;
        }
        Moment currentQuestion = questionsHelper.getCurrentQuestion();
        if (currentQuestion == null || (correctInput = currentQuestion.correctInput()) == null) {
            return;
        }
        Integer num = correctInput.get(0);
        if (num != null) {
            C8632dsu.d(num);
            ?? r4 = i == num.intValue() ? 1 : 0;
            Moment merge = currentQuestion.merge(q());
            TrackingInfo trackingInfo = merge.trackingInfo(d());
            JSONObject copyValues = trackingInfo != null ? trackingInfo.copyValues(new JSONObject()) : null;
            if (copyValues == null) {
                copyValues = new JSONObject();
            }
            copyValues.put("correctAnswerCount", (int) r4);
            copyValues.put("questionId", currentQuestion.id());
            copyValues.put("selectedAnswers", new JSONArray(new String[]{choice.id()}));
            Moment build = merge.toBuilder().trackingInfo(new TrackingInfo(copyValues)).build();
            cHR u = u();
            if (u != null) {
                String id = choice.id();
                C8632dsu.a(id, "");
                u.b(build, id, choice.impressionData());
            }
            if (r4 != 0) {
                b(new C5651cDh.h(i, VisualStateDefinition.ELEMENT_STATE.CORRECT));
            } else {
                b(new C5651cDh.h(i, VisualStateDefinition.ELEMENT_STATE.WRONG));
            }
            o().d(i, currentQuestion.choices(), new a(r4, i, this));
        }
    }

    /* renamed from: o.cCs$a */
    /* loaded from: classes4.dex */
    public static final class a implements cCK {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ C5635cCs c;

        @Override // o.cCK
        public void a() {
        }

        @Override // o.cCK
        public void c() {
        }

        a(boolean z, int i, C5635cCs c5635cCs) {
            this.b = z;
            this.a = i;
            this.c = c5635cCs;
        }

        @Override // o.cCK
        public void e() {
            if (this.b) {
                int i = this.a;
                if (i == 0 || i == 3) {
                    cCW.d(this.c.o(), (cCK) null, 1, (Object) null);
                } else {
                    cCW.a(this.c.o(), null, 1, null);
                }
            }
        }

        @Override // o.cCK
        public void b() {
            List<Choice> choices;
            QuestionsHelper questionsHelper = this.c.h;
            if (questionsHelper == null) {
                C8632dsu.d("");
                questionsHelper = null;
            }
            Moment currentQuestion = questionsHelper.getCurrentQuestion();
            if (currentQuestion != null && (choices = currentQuestion.choices()) != null) {
                C5635cCs c5635cCs = this.c;
                int i = 0;
                for (Object obj : choices) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    Choice choice = (Choice) obj;
                    c5635cCs.b(new C5651cDh.h(i, "default"));
                    i++;
                }
            }
            if (this.c.i) {
                QuestionsHelper questionsHelper2 = this.c.h;
                if (questionsHelper2 == null) {
                    C8632dsu.d("");
                    questionsHelper2 = null;
                }
                Moment nextQuestion = questionsHelper2.getNextQuestion();
                cHR u = this.c.u();
                if (u != null) {
                    u.c(nextQuestion != null ? nextQuestion.impressionData() : null);
                }
                this.c.b(new C5651cDh.f(nextQuestion));
                cCW.a(this.c.o(), nextQuestion != null ? nextQuestion.choices() : null, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        b(C5651cDh.g.a);
        cCW.b(o(), null, 1, null);
    }

    @Override // o.cBZ
    public void l() {
        b(C5651cDh.a.a);
        o().c();
    }

    @Override // o.cBZ
    public void s() {
        b(C5651cDh.i.b);
        o().a();
    }

    @Override // o.cBY, o.cBZ
    public void e() {
        super.e();
        b(C5651cDh.e.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        cBZ.a.getLogTag();
        this.i = true;
        b(new C5651cDh.k(C5639cCw.e.d(y(), q())));
    }
}
