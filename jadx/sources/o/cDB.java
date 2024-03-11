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
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5649cDf;
import o.C1204Sr;
import o.C5636cCt;
import o.C5650cDg;
import o.C8632dsu;
import o.cDB;
import o.dpR;

/* loaded from: classes4.dex */
public final class cDB extends cCX {
    private final C5636cCt.b a;
    private final View.OnClickListener c;
    private final View.OnTouchListener e;

    public final C5636cCt.b c() {
        return this.a;
    }

    public View.OnClickListener r() {
        return this.c;
    }

    public View.OnTouchListener s() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDB(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, C5636cCt.b bVar, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f, InterfaceC9638uF interfaceC9638uF, final int i, boolean z, boolean z2) {
        super(observable, interactiveMoments, moment, map, hashMap, f, interfaceC9638uF, i, z2);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.a = bVar;
        this.e = new d();
        this.c = new View.OnClickListener() { // from class: o.cDz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cDB.d(cDB.this, i, view);
            }
        };
        c(bVar, z2, f, z);
        if (bVar.e().isEnabled) {
            bVar.d().setOnClickListener(r());
            bVar.d().setOnTouchListener(s());
            return;
        }
        bVar.d().setVisibility(8);
    }

    /* loaded from: classes4.dex */
    public static final class d implements View.OnTouchListener {
        private boolean d;

        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (cDB.this.e() || !cDB.this.a()) {
                return true;
            }
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if ((valueOf != null && valueOf.intValue() == 0) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 9))) {
                this.d = true;
                e(true);
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 6)) {
                if (!this.d || view == null) {
                    return true;
                }
                view.performClick();
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 7)) {
                if (!this.d || d(view, motionEvent)) {
                    return true;
                }
                this.d = false;
                e(false);
                return true;
            } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 10)) {
                e(false);
                return true;
            } else {
                return false;
            }
        }

        private final boolean d(View view, MotionEvent motionEvent) {
            if (view != null) {
                return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()).contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()));
            }
            return false;
        }

        private final void e(boolean z) {
            if (cDB.this.c().e().isEnabled) {
                cDB cdb = cDB.this;
                cdb.e(new C5650cDg.a(cdb.b(), z ? "focused" : "default"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cDB cdb, int i, View view) {
        C8632dsu.c((Object) cdb, "");
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        if (!cdb.e() && cdb.a() && cdb.a.e().isEnabled) {
            AbstractC5649cDf.d.getLogTag();
            cdb.e(new C5650cDg.a(i, cdb.a.c()));
        }
    }

    private final void c(C5636cCt.b bVar, boolean z, float f, final boolean z2) {
        ImageElement background;
        C5624cCh d2 = bVar.d();
        UiDefinition.Layout.Choice a = bVar.a();
        Choice e2 = bVar.e();
        d2.setId(View.generateViewId());
        d2.setTag(a.id());
        String accessibilityDescription = e2.accessibilityDescription();
        if (accessibilityDescription == null) {
            accessibilityDescription = e2.text();
        }
        d2.setContentDescription(accessibilityDescription);
        AbstractC5649cDf.a(this, d2, a, null, null, 12, null);
        d2.setVisibility(e2.isEnabled ? 0 : 8);
        UiDefinition.Layout.Choice.ChoiceChildren children = a.children();
        if (children != null) {
            AbstractC5649cDf.a(this, d2.a(), children, null, null, 12, null);
            C9726vo.d(d2.h(), children.label(), e2.text(), new InterfaceC8612dsa<C1204Sr, SimpleElement, String, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.uiview.TriviaMultiButtonInteractiveUIView$generateButton$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(C1204Sr c1204Sr, SimpleElement simpleElement, String str) {
                    c(c1204Sr, simpleElement, str);
                    return dpR.c;
                }

                public final void c(C1204Sr c1204Sr, SimpleElement simpleElement, String str) {
                    C8632dsu.c((Object) c1204Sr, "");
                    C8632dsu.c((Object) simpleElement, "");
                    C8632dsu.c((Object) str, "");
                    AbstractC5649cDf.a(cDB.this, c1204Sr, simpleElement, null, null, 12, null);
                    c1204Sr.setText(str);
                    AbstractC5649cDf.d.getLogTag();
                    if (z2) {
                        c1204Sr.setVisibility(8);
                    }
                }
            });
            ImageElement background2 = e2.background();
            if (background2 == null || (background = background2.merge(children.background())) == null) {
                background = children.background();
            }
            ImageElement imageElement = background;
            if (imageElement != null) {
                AbstractC5649cDf.a(this, d2.c(), imageElement, null, new e(d2, z2), 4, null);
            }
            ImageElement accessoryView = children.accessoryView();
            if (accessoryView != null) {
                C5640cCx b = d2.b();
                C8632dsu.d(accessoryView);
                AbstractC5649cDf.a(this, b, accessoryView, null, null, 12, null);
            }
            if (z) {
                d2.e().setText(e2.segmentId());
                C5794cIp.a.d(d2.e(), -2, -2, 0, 0, f);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements cIA {
        final /* synthetic */ boolean c;
        final /* synthetic */ C5624cCh e;

        e(C5624cCh c5624cCh, boolean z) {
            this.e = c5624cCh;
            this.c = z;
        }

        @Override // o.cIA
        public void b(String str) {
            this.e.h().setVisibility(0);
        }

        @Override // o.cIA
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            if (this.c) {
                this.e.h().setVisibility(8);
            }
        }
    }

    @Override // o.cCX, o.AbstractC5649cDf
    public void b(int i) {
        super.b(i);
        if (b() == i) {
            this.a.d().setOnClickListener(r());
            this.a.d().setOnTouchListener(s());
        }
    }

    @Override // o.cCX, o.AbstractC5649cDf
    public void d(int i) {
        super.d(i);
        if (b() == i) {
            this.a.d().setVisibility(8);
            this.a.d().setOnClickListener(null);
            this.a.d().setOnTouchListener(null);
        }
    }

    @Override // o.cCX, o.AbstractC5649cDf
    public void e(int i) {
        super.e(i);
        this.a.d().setOnClickListener(null);
        this.a.d().setOnTouchListener(null);
    }

    @Override // o.cCX, o.AbstractC5649cDf
    public void a(int i) {
        super.a(i);
        this.a.d().setOnClickListener(null);
        this.a.d().setOnTouchListener(null);
    }
}
