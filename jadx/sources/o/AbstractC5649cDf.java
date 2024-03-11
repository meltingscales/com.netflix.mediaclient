package o;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.player.v2.interactive.uiview.InteractiveUIView$obs$1;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.ScreenPosition;
import com.netflix.model.leafs.originals.interactive.SourceRect;
import com.netflix.model.leafs.originals.interactive.StringsObject;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.BaseImageElement;
import com.netflix.model.leafs.originals.interactive.template.Element;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.C5651cDh;
import o.C8632dsu;
import o.dpR;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cDf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5649cDf {
    private static Typeface a;
    public static final d d = new d(null);
    private final InterfaceC9638uF b;
    private final HashMap<Element, cCN> c;
    private final Moment e;
    private final InteractiveMoments f;
    private final Map<String, Image> g;
    private final Observable<C5651cDh> h;
    private final boolean i;
    private final float j;
    private final Map<String, Style> l;
    private final Observable<C5650cDg> m;

    /* renamed from: o  reason: collision with root package name */
    private final Subject<C5650cDg> f13655o;

    public void c(long j) {
    }

    public void e(Moment moment) {
    }

    public void e(boolean z) {
    }

    public void f() {
    }

    public void f(int i) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public final InteractiveMoments k() {
        return this.f;
    }

    public final float m() {
        return this.j;
    }

    public final Observable<C5650cDg> n() {
        return this.m;
    }

    public final Map<String, Style> o() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5649cDf(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, Map<String, ? extends Style> map, Map<String, ? extends Image> map2, float f, InterfaceC9638uF interfaceC9638uF, boolean z) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.h = observable;
        this.f = interactiveMoments;
        this.e = moment;
        this.l = map;
        this.g = map2;
        this.j = f;
        this.b = interfaceC9638uF;
        this.i = z;
        Subject serialized = PublishSubject.create().toSerialized();
        C8632dsu.a(serialized, "");
        this.f13655o = serialized;
        this.m = serialized;
        this.c = new HashMap<>();
        final InteractiveUIView$obs$1 interactiveUIView$obs$1 = new drM<C5651cDh, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.InteractiveUIView$obs$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(C5651cDh c5651cDh) {
                C8632dsu.c((Object) c5651cDh, "");
                return Boolean.valueOf(C8632dsu.c(c5651cDh, C5651cDh.d.a));
            }
        };
        Observable<C5651cDh> takeUntil = observable.takeUntil(new Predicate() { // from class: o.cDi
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean d2;
                d2 = AbstractC5649cDf.d(drM.this, obj);
                return d2;
            }
        });
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.InteractiveUIView$obs$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                AbstractC5649cDf.d dVar = AbstractC5649cDf.d;
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.InteractiveUIView$obs$3
            public final void a() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }
        }, new drM<C5651cDh, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.InteractiveUIView$obs$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C5651cDh c5651cDh) {
                d(c5651cDh);
                return dpR.c;
            }

            public final void d(C5651cDh c5651cDh) {
                if (c5651cDh instanceof C5651cDh.b) {
                    return;
                }
                if (c5651cDh instanceof C5651cDh.k) {
                    AbstractC5649cDf.this.c(((C5651cDh.k) c5651cDh).b());
                } else if (c5651cDh instanceof C5651cDh.g) {
                    AbstractC5649cDf.this.f();
                } else if (c5651cDh instanceof C5651cDh.c) {
                    AbstractC5649cDf.this.f(((C5651cDh.c) c5651cDh).d());
                } else if (!(c5651cDh instanceof C5651cDh.h)) {
                    if (c5651cDh instanceof C5651cDh.j) {
                        AbstractC5649cDf.this.i();
                    } else if (c5651cDh instanceof C5651cDh.a) {
                        AbstractC5649cDf.this.g();
                    } else if (c5651cDh instanceof C5651cDh.i) {
                        AbstractC5649cDf.this.h();
                    } else if (c5651cDh instanceof C5651cDh.e) {
                        AbstractC5649cDf.this.j();
                    } else if (c5651cDh instanceof C5651cDh.m) {
                        AbstractC5649cDf.this.e(((C5651cDh.m) c5651cDh).d());
                    } else if (c5651cDh instanceof C5651cDh.f) {
                        AbstractC5649cDf.this.e(((C5651cDh.f) c5651cDh).e());
                    }
                } else {
                    C5651cDh.h hVar = (C5651cDh.h) c5651cDh;
                    String e = hVar.e();
                    switch (e.hashCode()) {
                        case -934426595:
                            if (e.equals(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
                                AbstractC5649cDf.this.h(hVar.d());
                                return;
                            }
                            return;
                        case -838846263:
                            if (e.equals("update")) {
                                AbstractC5649cDf.this.i(hVar.d());
                                return;
                            }
                            return;
                        case -691041417:
                            if (e.equals("focused")) {
                                AbstractC5649cDf.this.c(hVar.d());
                                return;
                            }
                            return;
                        case 113405357:
                            if (e.equals(VisualStateDefinition.ELEMENT_STATE.WRONG)) {
                                AbstractC5649cDf.this.a(hVar.d());
                                return;
                            }
                            return;
                        case 270940796:
                            if (e.equals(VisualStateDefinition.ELEMENT_STATE.DISABLED)) {
                                AbstractC5649cDf.this.d(hVar.d());
                                return;
                            }
                            return;
                        case 902621975:
                            if (e.equals(VisualStateDefinition.ELEMENT_STATE.LAST_10_SECS)) {
                                AbstractC5649cDf.this.p();
                                return;
                            }
                            return;
                        case 955164778:
                            if (e.equals(VisualStateDefinition.ELEMENT_STATE.CORRECT)) {
                                AbstractC5649cDf.this.e(hVar.d());
                                return;
                            }
                            return;
                        case 1191572123:
                            if (e.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                AbstractC5649cDf.this.g(hVar.d());
                                return;
                            }
                            return;
                        case 1544803905:
                            if (e.equals("default")) {
                                AbstractC5649cDf.this.b(hVar.d());
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        });
    }

    public /* synthetic */ AbstractC5649cDf(Observable observable, InteractiveMoments interactiveMoments, Moment moment, Map map, Map map2, float f, InterfaceC9638uF interfaceC9638uF, boolean z, int i, C8627dsp c8627dsp) {
        this(observable, interactiveMoments, moment, map, map2, f, interfaceC9638uF, (i & 128) != 0 ? false : z);
    }

    public final cCN b(SimpleElement simpleElement) {
        if (simpleElement != null) {
            return this.c.get(simpleElement);
        }
        return null;
    }

    public final void e(C5650cDg c5650cDg) {
        C8632dsu.c((Object) c5650cDg, "");
        this.f13655o.onNext(c5650cDg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public final Spanned c(String str) {
        String str2;
        StringsObject interactiveStrings = C5639cCw.e.e(this.e, this.f).interactiveStrings();
        if (interactiveStrings == null || (str2 = interactiveStrings.get(str, this.f)) == null) {
            return null;
        }
        return Html.fromHtml(str2, 0, null, null);
    }

    /* renamed from: o.cDf$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("InteractiveUIView");
        }

        public final Typeface c() {
            return AbstractC5649cDf.a;
        }

        public final void e(Typeface typeface) {
            AbstractC5649cDf.a = typeface;
        }

        public final void b(View view, Style style, float f) {
            int gravity;
            InterfaceC8650dtl a;
            int b;
            C8632dsu.c((Object) view, "");
            if (style != null) {
                SourceRect rect = style.rect();
                if (rect != null) {
                    C5794cIp c5794cIp = C5794cIp.a;
                    Integer width = rect.width();
                    C8632dsu.a(width, "");
                    int intValue = width.intValue();
                    Integer height = rect.height();
                    C8632dsu.a(height, "");
                    int intValue2 = height.intValue();
                    Integer x = rect.x();
                    C8632dsu.a(x, "");
                    int intValue3 = x.intValue();
                    Integer y = rect.y();
                    C8632dsu.a(y, "");
                    c5794cIp.d(view, intValue, intValue2, intValue3, y.intValue(), f);
                }
                Float opacity = style.opacity();
                if (opacity != null) {
                    C8632dsu.d(opacity);
                    view.setAlpha(opacity.floatValue());
                }
                ScreenPosition screenPosition = style.screenPosition();
                if (screenPosition != null) {
                    Float x2 = screenPosition.x();
                    view.setLayoutDirection(((double) (x2 != null ? x2.floatValue() : 0.0f)) < 0.5d ? 0 : 1);
                }
                if (view instanceof TextView) {
                    Integer numberOfLines = style.numberOfLines();
                    if (numberOfLines != null && numberOfLines.intValue() > 0) {
                        ((TextView) view).setMaxLines(numberOfLines.intValue());
                    }
                    Float fontSize = style.fontSize();
                    if (fontSize != null) {
                        int floatValue = (int) (fontSize.floatValue() * f);
                        b = C8657dts.b((int) ((floatValue / 3) + 0.5d), 1);
                        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration((TextView) view, b, floatValue, 2, 0);
                    }
                    TextView textView = (TextView) view;
                    textView.setTextDirection(style.getTextDirection());
                    Float alignment = style.alignment();
                    if (C8632dsu.b(alignment, 0.0f)) {
                        gravity = 8388627;
                    } else if (C8632dsu.b(alignment, 1.0f)) {
                        gravity = 8388629;
                    } else {
                        gravity = C8632dsu.b(alignment, 2.0f) ? 17 : textView.getGravity();
                    }
                    textView.setGravity(gravity);
                    String color = style.color();
                    if (color != null) {
                        textView.setTextColor(Color.parseColor(color));
                    }
                    if (C8632dsu.b(style.fontWeight(), 1.0f)) {
                        d dVar = AbstractC5649cDf.d;
                        if (dVar.c() == null) {
                            dVar.e(C1336Xt.e((Activity) C8141del.d(textView.getContext(), Activity.class)));
                        }
                        textView.setTypeface(dVar.c());
                    }
                    Style.Shadow shadow = style.shadow();
                    if (shadow != null) {
                        try {
                            com.netflix.model.leafs.originals.interactive.Color color2 = shadow.color();
                            if (color2 != null) {
                                String colorWithRGB = color2.colorWithRGB();
                                Double withAlpha = color2.withAlpha();
                                if (colorWithRGB != null) {
                                    int parseColor = Color.parseColor(colorWithRGB);
                                    if (withAlpha != null) {
                                        a = C8658dtt.a(0.0d, 1.0d);
                                        if (a.e(withAlpha)) {
                                            parseColor = Color.argb((int) (withAlpha.doubleValue() * 255.0f), (parseColor >> 16) & PrivateKeyType.INVALID, (parseColor >> 8) & PrivateKeyType.INVALID, parseColor & PrivateKeyType.INVALID);
                                        }
                                    }
                                    Float radius = shadow.radius();
                                    C8632dsu.a(radius, "");
                                    ((TextView) view).setShadowLayer(radius.floatValue(), shadow.x().floatValue() * f, shadow.y().floatValue() * f, parseColor);
                                }
                                dpR dpr = dpR.c;
                            }
                        } catch (IllegalArgumentException unused) {
                            AbstractC5649cDf.d.getLogTag();
                            dpR dpr2 = dpR.c;
                        }
                    }
                } else if (view instanceof ImageView) {
                    String backgroundColor = style.backgroundColor();
                    if (backgroundColor != null) {
                        view.setBackgroundColor(Color.parseColor(backgroundColor));
                        ((ImageView) view).setImageDrawable(null);
                    }
                    String scaleType = style.scaleType();
                    if (scaleType != null) {
                        C8632dsu.d((Object) scaleType);
                        ((ImageView) view).setScaleType(ImageView.ScaleType.valueOf(scaleType));
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(AbstractC5649cDf abstractC5649cDf, View view, Element element, String str, cIA cia, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupElement");
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            cia = null;
        }
        abstractC5649cDf.a(view, element, str, cia);
    }

    protected final void a(View view, Element element, String str, cIA cia) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) element, "");
        if (element.hasVisualStates()) {
            this.c.put(element, new c(element, view, this));
        }
        if (str == null) {
            str = element.id();
        }
        view.setTag(str);
        Style style = this.l.get(element.styleId());
        d.b(view, style, this.j);
        c(element, view, style, cia);
    }

    /* renamed from: o.cDf$c */
    /* loaded from: classes4.dex */
    public static final class c implements cCN {
        final /* synthetic */ AbstractC5649cDf b;
        final /* synthetic */ View d;
        final /* synthetic */ Element e;

        c(Element element, View view, AbstractC5649cDf abstractC5649cDf) {
            this.e = element;
            this.d = view;
            this.b = abstractC5649cDf;
        }

        @Override // o.cCN
        public void e(int i) {
            VisualStateDefinition visualStateDefinition = this.e.getDefault();
            if (visualStateDefinition != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = visualStateDefinition.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).e(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void d(int i) {
            VisualStateDefinition focused = this.e.getFocused();
            if (focused != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = focused.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).d(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void g(int i) {
            VisualStateDefinition selected = this.e.getSelected();
            if (selected != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = selected.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).g(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void b(int i) {
            VisualStateDefinition result = this.e.getResult();
            if (result != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = result.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).b(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void f(int i) {
            VisualStateDefinition wrong = this.e.getWrong();
            if (wrong != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = wrong.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).f(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void c(int i) {
            VisualStateDefinition correct = this.e.getCorrect();
            if (correct != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = correct.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).c(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void a(int i) {
            AbstractC5649cDf.d.getLogTag();
            this.d.setVisibility(8);
        }

        @Override // o.cCN
        public void j(int i) {
            VisualStateDefinition update = this.e.getUpdate();
            if (update != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = update.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).j(i);
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }

        @Override // o.cCN
        public void a() {
            VisualStateDefinition lastTenSeconds = this.e.getLastTenSeconds();
            if (lastTenSeconds != null) {
                View view = this.d;
                AbstractC5649cDf abstractC5649cDf = this.b;
                view.setVisibility(0);
                String styleId = lastTenSeconds.styleId();
                if (styleId != null) {
                    AbstractC5649cDf.d.b(view, abstractC5649cDf.o().get(styleId), abstractC5649cDf.m());
                }
                if (view instanceof cCN) {
                    ((cCN) view).a();
                }
                AbstractC5649cDf.d.getLogTag();
            }
        }
    }

    public static /* synthetic */ void e(AbstractC5649cDf abstractC5649cDf, Element element, View view, Style style, cIA cia, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImages");
        }
        if ((i & 8) != 0) {
            cia = null;
        }
        abstractC5649cDf.c(element, view, style, cia);
    }

    protected final void c(Element element, View view, Style style, cIA cia) {
        C8632dsu.c((Object) element, "");
        C8632dsu.c((Object) view, "");
        if (element instanceof BaseImageElement) {
            if (element.hasVisualStates() && (view instanceof C5640cCx)) {
                C5640cCx c5640cCx = (C5640cCx) view;
                InterfaceC9638uF interfaceC9638uF = this.b;
                SourceRect rect = style != null ? style.rect() : null;
                float f = this.j;
                Map<String, Image> map = this.g;
                VisualStateDefinition visualStateDefinition = element.getDefault();
                Image image = map.get(visualStateDefinition != null ? visualStateDefinition.assetId() : null);
                Map<String, Image> map2 = this.g;
                VisualStateDefinition selected = element.getSelected();
                Image image2 = map2.get(selected != null ? selected.assetId() : null);
                Map<String, Image> map3 = this.g;
                VisualStateDefinition focused = element.getFocused();
                Image image3 = map3.get(focused != null ? focused.assetId() : null);
                Map<String, Image> map4 = this.g;
                VisualStateDefinition result = element.getResult();
                Image image4 = map4.get(result != null ? result.assetId() : null);
                Map<String, Image> map5 = this.g;
                VisualStateDefinition wrong = element.getWrong();
                Image image5 = map5.get(wrong != null ? wrong.assetId() : null);
                Map<String, Image> map6 = this.g;
                VisualStateDefinition correct = element.getCorrect();
                Image image6 = map6.get(correct != null ? correct.assetId() : null);
                Map<String, Image> map7 = this.g;
                VisualStateDefinition update = element.getUpdate();
                Image image7 = map7.get(update != null ? update.assetId() : null);
                Map<String, Image> map8 = this.g;
                VisualStateDefinition lastTenSeconds = element.getLastTenSeconds();
                c5640cCx.c(interfaceC9638uF, rect, f, image, image2, image3, image4, image5, image6, image7, map8.get(lastTenSeconds != null ? lastTenSeconds.assetId() : null), cia);
            } else if (view instanceof NetflixImageView) {
                Image image8 = this.g.get(((BaseImageElement) element).assetId());
                if (image8 == null) {
                    Map<String, Image> map9 = this.g;
                    VisualStateDefinition visualStateDefinition2 = element.getDefault();
                    image8 = map9.get(visualStateDefinition2 != null ? visualStateDefinition2.assetId() : null);
                }
                C5794cIp.a.a(this.b, (ImageView) view, image8, style != null ? style.rect() : null, this.j, cia, this.e);
            }
        }
    }

    public void b(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().e(i);
        }
    }

    public void c(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().d(i);
        }
    }

    public void g(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().g(i);
        }
    }

    public void h(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().b(i);
        }
    }

    public void a(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().f(i);
        }
    }

    public void e(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().c(i);
        }
    }

    public void d(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().a(i);
        }
    }

    public void i(int i) {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().j(i);
        }
    }

    public void p() {
        for (Map.Entry<Element, cCN> entry : this.c.entrySet()) {
            entry.getValue().a();
        }
    }
}
