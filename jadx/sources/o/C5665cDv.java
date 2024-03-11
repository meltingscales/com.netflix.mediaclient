package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.ToolTipElement;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.C1204Sr;
import o.C5650cDg;
import o.C5665cDv;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cDv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5665cDv extends cCX {
    private final C5633cCq b;
    private final View.OnTouchListener c;
    private final View.OnClickListener e;

    public View.OnClickListener c() {
        return this.e;
    }

    public final C5633cCq s() {
        return this.b;
    }

    public View.OnTouchListener t() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5665cDv(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, C5633cCq c5633cCq, UiDefinition.Layout.Choice choice, final Choice choice2, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, int i, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, i, z);
        ImageElement background;
        ImageElement merge;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) c5633cCq, "");
        C8632dsu.c((Object) choice, "");
        C8632dsu.c((Object) choice2, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.b = c5633cCq;
        this.c = new a();
        this.e = new View.OnClickListener() { // from class: o.cDt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5665cDv.b(C5665cDv.this, choice2, view);
            }
        };
        c5633cCq.setId(View.generateViewId());
        c5633cCq.setTag(choice.id());
        String accessibilityDescription = choice2.accessibilityDescription();
        String text = accessibilityDescription == null ? choice2.text() : accessibilityDescription;
        AbstractC5649cDf.a(this, c5633cCq, choice, null, null, 12, null);
        UiDefinition.Layout.Choice.ChoiceChildren children = choice.children();
        if (children != null) {
            AbstractC5649cDf.a(this, c5633cCq.d(), children, null, null, 12, null);
            ImageElement background2 = choice2.background();
            ImageElement background3 = (background2 == null || (background = background2.merge(children.background())) == null) ? children.background() : background;
            if (background3 != null) {
                AbstractC5649cDf.a(this, c5633cCq.b(), background3, null, null, 12, null);
                c5633cCq.b().setOnClickListener(c());
                c5633cCq.b().setOnTouchListener(t());
                c5633cCq.b().setContentDescription(text);
            }
            ToolTipElement toolTipElement = children.tooltipContainer();
            if (toolTipElement != null) {
                c5633cCq.j().setContentDescription(text);
                FrameLayout j = c5633cCq.j();
                C8632dsu.d(toolTipElement);
                AbstractC5649cDf.a(this, j, toolTipElement, null, null, 12, null);
                ToolTipElement.ToolTipChildren children2 = toolTipElement.children();
                if (children2 != null) {
                    C9726vo.d(c5633cCq.h(), children2.subtitleLabel(), new drX<C1204Sr, SimpleElement, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.TooltipButtonInteractiveUIView$1$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(C1204Sr c1204Sr, SimpleElement simpleElement) {
                            a(c1204Sr, simpleElement);
                            return dpR.c;
                        }

                        public final void a(C1204Sr c1204Sr, SimpleElement simpleElement) {
                            C8632dsu.c((Object) c1204Sr, "");
                            C8632dsu.c((Object) simpleElement, "");
                            AbstractC5649cDf.a(C5665cDv.this, c1204Sr, simpleElement, null, null, 12, null);
                            c1204Sr.setText(choice2.subText());
                            AbstractC5649cDf.d.getLogTag();
                        }
                    });
                    C9726vo.d(c5633cCq.c(), children2.titleLabel(), new drX<C1204Sr, SimpleElement, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.TooltipButtonInteractiveUIView$1$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(C1204Sr c1204Sr, SimpleElement simpleElement) {
                            e(c1204Sr, simpleElement);
                            return dpR.c;
                        }

                        public final void e(C1204Sr c1204Sr, SimpleElement simpleElement) {
                            C8632dsu.c((Object) c1204Sr, "");
                            C8632dsu.c((Object) simpleElement, "");
                            AbstractC5649cDf.a(C5665cDv.this, c1204Sr, simpleElement, null, null, 12, null);
                            c1204Sr.setText(choice2.text());
                            AbstractC5649cDf.d.getLogTag();
                        }
                    });
                    ImageElement previewImage = choice2.previewImage();
                    if (previewImage != null && (merge = previewImage.merge(children2.previewImage())) != null) {
                        C8632dsu.d(merge);
                        AbstractC5649cDf.a(this, c5633cCq.e(), merge, null, null, 12, null);
                    }
                    ImageElement imageElement = children2.tooltip();
                    if (imageElement != null) {
                        NetflixImageView i2 = c5633cCq.i();
                        C8632dsu.d(imageElement);
                        AbstractC5649cDf.a(this, i2, imageElement, null, null, 12, null);
                    }
                }
            }
        }
        if (z) {
            c5633cCq.a().setText(choice2.segmentId() == null ? choice2.id() : choice2.segmentId());
            C5794cIp.a.d(c5633cCq.a(), -2, -2, 0, 0, f);
        }
    }

    /* renamed from: o.cDv$a */
    /* loaded from: classes4.dex */
    public static final class a implements View.OnTouchListener {
        private boolean c;

        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C5665cDv.this.e() || !C5665cDv.this.a()) {
                return true;
            }
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if ((valueOf != null && valueOf.intValue() == 0) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 9))) {
                this.c = true;
                c(true);
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 6)) {
                if (!this.c || view == null) {
                    return true;
                }
                view.performClick();
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 7)) {
                if (!this.c || b(view, motionEvent)) {
                    return true;
                }
                this.c = false;
                c(false);
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 10)) {
                c(false);
                return true;
            } else {
                return false;
            }
        }

        private final boolean b(View view, MotionEvent motionEvent) {
            if (view != null) {
                return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()).contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()));
            }
            return false;
        }

        private final void c(boolean z) {
            if (C5665cDv.this.e() || !C5665cDv.this.a()) {
                return;
            }
            if (C8632dsu.c((Object) C5665cDv.this.d(), (Object) "default")) {
                if (z) {
                    C5665cDv.this.s().b().d(-1);
                } else {
                    C5665cDv.this.s().b().e(-1);
                }
            } else if (C8632dsu.c((Object) C5665cDv.this.d(), (Object) "focused")) {
                if (z) {
                    C5665cDv.this.s().b().g(-1);
                } else {
                    C5665cDv.this.s().b().d(-1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5665cDv c5665cDv, Choice choice, View view) {
        C8632dsu.c((Object) c5665cDv, "");
        C8632dsu.c((Object) choice, "");
        if (c5665cDv.e() || !c5665cDv.a()) {
            return;
        }
        if (C8632dsu.c((Object) c5665cDv.d(), (Object) "default")) {
            c5665cDv.e(new C5650cDg.a(c5665cDv.b(), "focused"));
        } else if (C8632dsu.c((Object) c5665cDv.d(), (Object) "focused")) {
            c5665cDv.e(new C5650cDg.a(c5665cDv.b(), VisualStateDefinition.ELEMENT_STATE.SELECTED));
            c5665cDv.e(new C5650cDg.e(c5665cDv.b(), choice));
        }
    }

    @Override // o.cCX, o.AbstractC5649cDf
    public void c(int i) {
        super.c(i);
        if (i != b() && C8632dsu.c((Object) d(), (Object) "focused")) {
            e(new C5650cDg.a(b(), "default"));
            this.b.j().setOnClickListener(null);
            this.b.j().setOnTouchListener(null);
            return;
        }
        this.b.j().setOnClickListener(c());
        this.b.j().setOnTouchListener(t());
    }
}
