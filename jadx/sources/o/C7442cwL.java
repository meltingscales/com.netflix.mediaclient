package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.netflix.cl.model.PlanUpgradeType;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractC7480cwx;
import o.C9834xU;

/* renamed from: o.cwL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7442cwL extends AbstractC7480cwx {
    public static final e b = new e(null);
    public static final int e = 8;
    private InterfaceC7441cwK d;
    private List<String> f;
    private final PlanUpgradeType i;
    private List<String> j;

    @Override // o.AbstractC7480cwx
    public int a() {
        return com.netflix.mediaclient.ui.R.o.kf;
    }

    public final void b(InterfaceC7441cwK interfaceC7441cwK) {
        this.d = interfaceC7441cwK;
    }

    @Override // o.AbstractC7480cwx
    public String d() {
        return "StreamLimitUpgrade";
    }

    @Override // o.AbstractC7480cwx
    public PlanUpgradeType e() {
        return this.i;
    }

    @Override // o.AbstractC7480cwx
    public boolean j() {
        return true;
    }

    public C7442cwL() {
        List<String> emptyList = Collections.emptyList();
        C8632dsu.a(emptyList, "");
        this.f = emptyList;
        List<String> emptyList2 = Collections.emptyList();
        C8632dsu.a(emptyList2, "");
        this.j = emptyList2;
        this.i = PlanUpgradeType.concurrentStream;
    }

    @Override // o.AbstractC7480cwx, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        if (bundle != null) {
            dismiss();
            return null;
        }
        return layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.aY, viewGroup, false);
    }

    @Override // o.AbstractC7480cwx, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        List<String> stringArrayList = arguments != null ? arguments.getStringArrayList("devices") : null;
        if (stringArrayList == null) {
            stringArrayList = Collections.emptyList();
            C8632dsu.a(stringArrayList, "");
        }
        this.f = stringArrayList;
        Bundle arguments2 = getArguments();
        List<String> stringArrayList2 = arguments2 != null ? arguments2.getStringArrayList("streams") : null;
        if (stringArrayList2 == null) {
            stringArrayList2 = Collections.emptyList();
            C8632dsu.a(stringArrayList2, "");
        }
        this.j = stringArrayList2;
        m();
    }

    private final void m() {
        int d;
        int d2;
        List c2;
        String d3;
        int d4;
        int d5;
        List c3;
        String d6;
        AbstractC7480cwx.b l = l();
        C1332Xp c1332Xp = C1332Xp.b;
        boolean z = !C8153dex.e((Context) C1332Xp.b(Context.class));
        if (o() != null && z) {
            if (this.f.isEmpty()) {
                l.c().a.setText(getString(com.netflix.mediaclient.ui.R.o.kg));
            } else {
                l.c().a.setText(getString(com.netflix.mediaclient.ui.R.o.kh));
                C1204Sr c1204Sr = l.c().a;
                CharSequence text = l.c().a.getText();
                List<String> list = this.f;
                List<String> list2 = this.j;
                Iterator<T> it = list.iterator();
                Iterator<T> it2 = list2.iterator();
                d4 = C8572dqo.d(list, 10);
                d5 = C8572dqo.d(list2, 10);
                ArrayList arrayList = new ArrayList(Math.min(d4, d5));
                while (it.hasNext() && it2.hasNext()) {
                    dsE dse = dsE.b;
                    String string = getString(com.netflix.mediaclient.ui.R.o.kb);
                    C8632dsu.a(string, "");
                    String format = String.format(string, Arrays.copyOf(new Object[]{(String) it.next(), (String) it2.next()}, 2));
                    C8632dsu.a(format, "");
                    arrayList.add(format);
                }
                c3 = C8576dqs.c((Iterable) arrayList, (Comparator) new c());
                d6 = C8576dqs.d(c3, "\n", null, null, 0, null, null, 62, null);
                c1204Sr.setContentDescription(((Object) text) + "\n" + d6);
            }
            C1203Sq c1203Sq = l.e().c;
            C1333Xq d7 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.kd);
            MembershipProductChoice o2 = o();
            c1203Sq.setText(d7.a(o2 != null ? o2.getMaxStreams() : 0).c());
            l.e().c.setOnClickListener(new View.OnClickListener() { // from class: o.cwI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7442cwL.e(C7442cwL.this, view);
                }
            });
            l.e().b.e(C9834xU.o.b);
        } else {
            l.c().a.setText(getString(z ? com.netflix.mediaclient.ui.R.o.jZ : com.netflix.mediaclient.ui.R.o.jV));
            l.e().c.setVisibility(8);
            l.e().b.e(C9834xU.o.d);
        }
        if (this.f.isEmpty()) {
            l.c().e.setVisibility(8);
        } else {
            C1204Sr c1204Sr2 = l.c().e;
            List<String> list3 = this.f;
            List<String> list4 = this.j;
            Iterator<T> it3 = list3.iterator();
            Iterator<T> it4 = list4.iterator();
            d = C8572dqo.d(list3, 10);
            d2 = C8572dqo.d(list4, 10);
            ArrayList arrayList2 = new ArrayList(Math.min(d, d2));
            while (it3.hasNext() && it4.hasNext()) {
                dsE dse2 = dsE.b;
                String string2 = getString(com.netflix.mediaclient.ui.R.o.kc);
                C8632dsu.a(string2, "");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{(String) it3.next(), (String) it4.next()}, 2));
                C8632dsu.a(format2, "");
                arrayList2.add(format2);
            }
            c2 = C8576dqs.c((Iterable) arrayList2, (Comparator) new a());
            d3 = C8576dqs.d(c2, "<br>", null, null, 0, null, null, 62, null);
            c1204Sr2.setText(C8168dfL.c(d3));
        }
        l.e().b.setOnClickListener(new View.OnClickListener() { // from class: o.cwH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7442cwL.d(C7442cwL.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7442cwL c7442cwL, View view) {
        C8632dsu.c((Object) c7442cwL, "");
        c7442cwL.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7442cwL c7442cwL, View view) {
        C8632dsu.c((Object) c7442cwL, "");
        c7442cwL.f();
    }

    /* renamed from: o.cwL$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((String) t).length()), Integer.valueOf(((String) t2).length()));
            return compareValues;
        }
    }

    /* renamed from: o.cwL$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((String) t).length()), Integer.valueOf(((String) t2).length()));
            return compareValues;
        }
    }

    private final void t() {
        View view = getView();
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup == null || isDetached()) {
            return;
        }
        e.d dVar = new e.d();
        dVar.setDuration(700L);
        dVar.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, dVar);
        String string = getString(com.netflix.mediaclient.ui.R.o.jX);
        C8632dsu.a(string, "");
        C1333Xq d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.kl);
        MembershipProductChoice o2 = o();
        String c2 = d.a(o2 != null ? o2.getMaxStreams() : 0).c();
        String string2 = getString(com.netflix.mediaclient.ui.R.o.jW);
        C8632dsu.a(string2, "");
        C8632dsu.d((Object) c2);
        a(string, c2, string2);
    }

    @Override // o.AbstractC7480cwx
    public void f() {
        r().a();
        dismiss();
    }

    @Override // o.AbstractC7480cwx
    public void b() {
        r().c();
        dismiss();
    }

    private final InterfaceC7441cwK r() {
        InterfaceC7441cwK interfaceC7441cwK = this.d;
        if (interfaceC7441cwK != null) {
            return interfaceC7441cwK;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o.cwL$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        /* renamed from: o.cwL$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends Explode {
            private final Fade d = new Fade();
            private final C8350dii a = new C8350dii();

            @Override // android.transition.Explode, android.transition.Visibility
            public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(this.d.onAppear(viewGroup, view, transitionValues, transitionValues2), this.a.onAppear(viewGroup, view, transitionValues, transitionValues2));
                return animatorSet;
            }

            @Override // android.transition.Explode, android.transition.Visibility, android.transition.Transition
            public void captureStartValues(TransitionValues transitionValues) {
                super.captureStartValues(transitionValues);
                this.d.captureStartValues(transitionValues);
                this.a.captureStartValues(transitionValues);
            }

            @Override // android.transition.Explode, android.transition.Visibility, android.transition.Transition
            public void captureEndValues(TransitionValues transitionValues) {
                super.captureEndValues(transitionValues);
                this.d.captureEndValues(transitionValues);
                this.a.captureEndValues(transitionValues);
            }
        }
    }
}
