package o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.cIE;

/* loaded from: classes4.dex */
public final class cHY extends cBX {
    public static final d h = new d(null);
    private static final ArrayList<Integer> j;
    private final ArrayList<C1204Sr> g;
    private int i;
    private ConstraintLayout m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cHY(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cHY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ cHY(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.g = new ArrayList<>();
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("InteractivePhoneMomentLayout");
        }
    }

    static {
        ArrayList<Integer> a;
        a = C8569dql.a(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        j = a;
    }

    @Override // o.cBX
    public float h() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float h2 = super.h();
        float f = this.g.get(0).getLayoutParams().height;
        ConstraintLayout constraintLayout = this.m;
        if (constraintLayout == null) {
            C8632dsu.d("");
            constraintLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        return h2 + f + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? marginLayoutParams.bottomMargin : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.cBX, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        b().add(findViewById(cIE.b.w));
        b().add(findViewById(cIE.b.u));
        b().add(findViewById(cIE.b.y));
        b().add(findViewById(cIE.b.v));
        b().add(findViewById(cIE.b.x));
        b().add(findViewById(cIE.b.z));
        b().add(findViewById(cIE.b.A));
        b().add(findViewById(cIE.b.B));
        b().add(findViewById(cIE.b.D));
        b().add(findViewById(cIE.b.C));
        this.g.add(findViewById(cIE.b.Z));
        this.g.add(findViewById(cIE.b.ab));
        this.g.add(findViewById(cIE.b.Y));
        this.g.add(findViewById(cIE.b.ac));
        this.g.add(findViewById(cIE.b.aa));
        View findViewById = findViewById(cIE.b.G);
        C8632dsu.a(findViewById, "");
        this.m = (ConstraintLayout) findViewById;
    }

    @Override // o.cBX
    public void e(float f) {
        long j2;
        ConstraintLayout constraintLayout;
        CommonMetaData.Layout.ChoiceLayout choiceLayout;
        int i = 0;
        this.i = 0;
        ConstraintLayout constraintLayout2 = this.m;
        if (constraintLayout2 == null) {
            C8632dsu.d("");
            constraintLayout2 = null;
        }
        constraintLayout2.setTranslationY(0.0f);
        final List<Choice> choices = q().choices();
        if (choices == null) {
            return;
        }
        List<Animator> arrayList = new ArrayList<>();
        List<Animator> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        Iterator<View> it = b().iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
        Iterator<Integer> it2 = j.iterator();
        while (true) {
            j2 = 1000;
            if (!it2.hasNext()) {
                break;
            }
            Integer next = it2.next();
            ArrayList<View> b = b();
            C8632dsu.d(next);
            View view = b.get(next.intValue());
            C8632dsu.a(view, "");
            final View view2 = view;
            h.getLogTag();
            view2.setVisibility(i);
            view2.setAlpha(c() ? 0.0f : 1.0f);
            C1204Sr c1204Sr = (C1204Sr) view2;
            List<CommonMetaData.Layout.ChoiceLayout> choices2 = d().choices();
            c1204Sr.setText((choices2 == null || (choiceLayout = choices2.get(next.intValue())) == null) ? null : choiceLayout.text());
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, 1.0f);
            cCM ccm = cCM.a;
            Context context = getContext();
            C8632dsu.a(context, "");
            Animator duration = ofFloat.setDuration(ccm.d(context, 1000L));
            C8632dsu.a(duration, "");
            arrayList.add(duration);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f);
            Context context2 = getContext();
            C8632dsu.a(context2, "");
            Animator duration2 = ofFloat2.setDuration(ccm.d(context2, 400L));
            C8632dsu.a(duration2, "");
            arrayList2.add(duration2);
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.cHU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    cHY.b(cHY.this, view2, choices, view3);
                }
            });
            i = 0;
        }
        Iterator<C1204Sr> it3 = this.g.iterator();
        while (it3.hasNext()) {
            C1204Sr next2 = it3.next();
            next2.setVisibility(0);
            next2.setText("-");
            next2.setAlpha(c() ? 0.0f : 1.0f);
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(next2, property2, 0.0f, 1.0f);
            cCM ccm2 = cCM.a;
            Context context3 = getContext();
            C8632dsu.a(context3, "");
            Animator duration3 = ofFloat3.setDuration(ccm2.d(context3, j2));
            C8632dsu.a(duration3, "");
            arrayList.add(duration3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(next2, property2, 1.0f, 0.0f);
            Context context4 = getContext();
            C8632dsu.a(context4, "");
            Animator duration4 = ofFloat4.setDuration(ccm2.d(context4, 400L));
            C8632dsu.a(duration4, "");
            duration4.setStartDelay(g());
            arrayList2.add(duration4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(next2, property2, 1.0f, 0.0f);
            Context context5 = getContext();
            C8632dsu.a(context5, "");
            ObjectAnimator duration5 = ofFloat5.setDuration(ccm2.d(context5, 400L));
            C8632dsu.a(duration5, "");
            duration5.setStartDelay(g());
            arrayList3.add(duration5);
            j2 = 1000;
        }
        ConstraintLayout constraintLayout3 = this.m;
        if (constraintLayout3 == null) {
            C8632dsu.d("");
            constraintLayout = null;
        } else {
            constraintLayout = constraintLayout3;
        }
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(constraintLayout, View.TRANSLATION_Y, 0.0f, j());
        cCM ccm3 = cCM.a;
        Context context6 = getContext();
        C8632dsu.a(context6, "");
        ofFloat6.setDuration(ccm3.d(context6, g()));
        ofFloat6.setStartDelay(280L);
        ofFloat6.setInterpolator(i());
        C8632dsu.d(ofFloat6);
        arrayList2.add(ofFloat6);
        arrayList3.add(ofFloat6);
        c(arrayList2);
        c((Collection<? extends Animator>) arrayList3);
        e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
        r4 = r24.m().animate().alpha(0.5f);
        r5 = o.cCM.a;
        r6 = r24.getContext();
        o.C8632dsu.a(r6, "");
        r4.setDuration(r5.d(r6, 40)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015c, code lost:
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015e, code lost:
        r0 = o.InterfaceC1598aHf.a;
        r0 = o.dqE.d();
        r16 = o.dqE.k(r0);
        r0 = new o.C1596aHd("going with default as we don't have segment Id to go to.", null, null, true, r16, false, false, 96, null);
        r1 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017d, code lost:
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
        r0.e.put("errorType", r1.c());
        r2 = r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018c, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
        r0.a(r1.c() + " " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ab, code lost:
        if (r0.b() == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01af, code lost:
        if (r0.i == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b1, code lost:
        r1 = new java.lang.Throwable(r0.b(), r0.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c1, code lost:
        if (r0.b() == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c3, code lost:
        r1 = new java.lang.Throwable(r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cd, code lost:
        r1 = r0.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cf, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d1, code lost:
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01dd, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01de, code lost:
        r1 = new java.lang.Throwable("Handled exception with no message");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e3, code lost:
        r2 = o.InterfaceC1601aHi.c;
        r3 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e9, code lost:
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01eb, code lost:
        r3.e(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ef, code lost:
        r2.e().b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f7, code lost:
        r6 = r24.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fb, code lost:
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fd, code lost:
        o.cHR.d.a(r6, true, r24.q(), r3, r1, r11, null, r13, 32, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(o.cHY r24, android.view.View r25, java.util.List r26, android.view.View r27) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cHY.b(o.cHY, android.view.View, java.util.List, android.view.View):void");
    }

    private final String z() {
        StringBuilder sb = new StringBuilder();
        Iterator<C1204Sr> it = this.g.iterator();
        while (it.hasNext()) {
            C1204Sr next = it.next();
            if (!C8632dsu.c((Object) next.getText(), (Object) "-")) {
                sb.append(next.getText());
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    @Override // o.cBX
    public String a() {
        super.a();
        return z();
    }
}
