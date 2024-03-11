package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.C1204Sr;
import o.C5650cDg;
import o.C5659cDp;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.cDp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5659cDp extends cCX {
    private final C5624cCh a;
    private final UiDefinition.Layout.Choice b;
    private Choice c;
    private final View.OnClickListener e;
    private final View.OnTouchListener h;

    public final void d(Choice choice) {
        this.c = choice;
    }

    public View.OnClickListener q() {
        return this.e;
    }

    public View.OnTouchListener r() {
        return this.h;
    }

    public final Choice s() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5659cDp(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, C5624cCh c5624cCh, UiDefinition.Layout.Choice choice, Choice choice2, final cBU cbu, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, int i, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, i, z);
        String text;
        ImageElement background;
        ImageElement icon;
        ImageElement icon2;
        ImageElement background2;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) c5624cCh, "");
        C8632dsu.c((Object) choice, "");
        C8632dsu.c((Object) cbu, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.a = c5624cCh;
        this.b = choice;
        this.c = choice2;
        this.h = new b();
        this.e = new View.OnClickListener() { // from class: o.cDr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5659cDp.d(C5659cDp.this, view);
            }
        };
        c5624cCh.setId(View.generateViewId());
        c5624cCh.setTag(choice.id());
        Choice choice3 = this.c;
        String str = null;
        if (choice3 == null || (text = choice3.accessibilityDescription()) == null) {
            Choice choice4 = this.c;
            text = choice4 != null ? choice4.text() : null;
        }
        c5624cCh.setContentDescription(text);
        AbstractC5649cDf.a(this, c5624cCh, choice, null, null, 12, null);
        UiDefinition.Layout.Choice.ChoiceChildren children = choice.children();
        if (children != null) {
            AbstractC5649cDf.a(this, c5624cCh.a(), children, null, null, 12, null);
            ImageElement accessoryView = children.accessoryView();
            if (accessoryView != null) {
                C5640cCx b2 = c5624cCh.b();
                C8632dsu.d(accessoryView);
                AbstractC5649cDf.a(this, b2, accessoryView, null, null, 12, null);
            }
            C9726vo.d(c5624cCh.h(), children.label(), new drX<C1204Sr, SimpleElement, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.StandardButtonInteractiveUIView$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(C1204Sr c1204Sr, SimpleElement simpleElement) {
                    d(c1204Sr, simpleElement);
                    return dpR.c;
                }

                public final void d(C1204Sr c1204Sr, SimpleElement simpleElement) {
                    C8632dsu.c((Object) c1204Sr, "");
                    C8632dsu.c((Object) simpleElement, "");
                    Choice s = C5659cDp.this.s();
                    c1204Sr.setText(s != null ? s.text() : null);
                    AbstractC5649cDf.a(C5659cDp.this, c1204Sr, simpleElement, null, null, 12, null);
                    cbu.b(c1204Sr);
                    AbstractC5649cDf.d.getLogTag();
                }
            });
            Choice choice5 = this.c;
            ImageElement background3 = (choice5 == null || (background2 = choice5.background()) == null || (background = background2.merge(children.background())) == null) ? children.background() : background;
            if (background3 != null) {
                AbstractC5649cDf.a(this, c5624cCh.c(), background3, null, null, 12, null);
            }
            Choice choice6 = this.c;
            ImageElement icon3 = (choice6 == null || (icon2 = choice6.icon()) == null || (icon = icon2.merge(children.icon())) == null) ? children.icon() : icon;
            if (icon3 != null) {
                AbstractC5649cDf.a(this, c5624cCh.d(), icon3, null, null, 12, null);
            }
            ImageElement underline = children.underline();
            if (underline != null) {
                View j = c5624cCh.j();
                C8632dsu.d(underline);
                AbstractC5649cDf.a(this, j, underline, null, null, 12, null);
            }
        }
        if (z) {
            C1204Sr e = c5624cCh.e();
            Choice choice7 = this.c;
            if ((choice7 != null ? choice7.segmentId() : null) == null) {
                Choice choice8 = this.c;
                if (choice8 != null) {
                    str = choice8.id();
                }
            } else {
                Choice choice9 = this.c;
                if (choice9 != null) {
                    str = choice9.segmentId();
                }
            }
            e.setText(str);
            C5794cIp.a.d(c5624cCh.e(), -2, -2, 0, 0, f);
        }
        c();
    }

    /* renamed from: o.cDp$b */
    /* loaded from: classes4.dex */
    public static final class b implements View.OnTouchListener {
        private boolean e;

        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C5659cDp.this.e() || !C5659cDp.this.a()) {
                return true;
            }
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if ((valueOf != null && valueOf.intValue() == 0) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 9))) {
                this.e = true;
                b(true);
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 6)) {
                if (!this.e || view == null) {
                    return true;
                }
                view.performClick();
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 7)) {
                if (!this.e || e(view, motionEvent)) {
                    return true;
                }
                this.e = false;
                b(false);
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 10)) {
                b(false);
                return true;
            } else {
                return false;
            }
        }

        private final boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()).contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()));
            }
            return false;
        }

        private final void b(boolean z) {
            Choice s = C5659cDp.this.s();
            if (s == null || !s.isEnabled) {
                return;
            }
            C5659cDp c5659cDp = C5659cDp.this;
            c5659cDp.e(new C5650cDg.a(c5659cDp.b(), z ? "focused" : "default"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5659cDp c5659cDp, View view) {
        Choice choice;
        C8632dsu.c((Object) c5659cDp, "");
        if (c5659cDp.e() || !c5659cDp.a() || (choice = c5659cDp.c) == null || !choice.isEnabled) {
            return;
        }
        c5659cDp.e(new C5650cDg.a(c5659cDp.b(), VisualStateDefinition.ELEMENT_STATE.SELECTED));
        c5659cDp.e(new C5650cDg.e(c5659cDp.b(), choice));
    }

    public void c() {
        this.a.setOnClickListener(q());
        this.a.setOnTouchListener(r());
    }
}
