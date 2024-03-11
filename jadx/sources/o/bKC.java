package o;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* loaded from: classes4.dex */
public abstract class bKC extends AbstractC3336ax<c> {
    private final int b;
    private drM<? super Integer, dpR> c;
    private Integer d;
    private int f;
    private List<String> h;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.r;
    }

    public final void d(int i) {
        this.f = i;
    }

    public final void d(Integer num) {
        this.d = num;
    }

    public final void d(drM<? super Integer, dpR> drm) {
        this.c = drm;
    }

    public final void e(List<String> list) {
        C8632dsu.c((Object) list, "");
        this.h = list;
    }

    public final drM<Integer, dpR> i() {
        return this.c;
    }

    public final int k() {
        return this.f;
    }

    public final Integer m() {
        return this.d;
    }

    public final List<String> o() {
        return this.h;
    }

    public bKC() {
        List<String> i;
        i = C8569dql.i();
        this.h = i;
        this.f = C3796bKz.g.u;
        this.b = View.generateViewId();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        int i = 0;
        if (cVar.c().getChildCount() != this.h.size()) {
            cVar.c().removeAllViews();
            int i2 = 0;
            for (Object obj : this.h) {
                if (i2 < 0) {
                    C8569dql.h();
                }
                int i3 = this.b;
                View e = C9703vR.e(cVar.c(), this.f, 0, 2, null);
                C8632dsu.d(e);
                RadioButton radioButton = (RadioButton) e;
                radioButton.setId(i3 + i2);
                radioButton.setText((String) obj);
                i2++;
            }
        } else {
            for (Object obj2 : this.h) {
                if (i < 0) {
                    C8569dql.h();
                }
                View childAt = cVar.c().getChildAt(i);
                C8632dsu.d(childAt);
                ((RadioButton) childAt).setText((String) obj2);
                i++;
            }
        }
        Integer num = this.d;
        if (num != null && num.intValue() >= 0 && num.intValue() < this.h.size()) {
            cVar.c().check(this.b + num.intValue());
        }
        cVar.c().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.bKE
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
                bKC.a(bKC.this, radioGroup, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bKC bkc, RadioGroup radioGroup, int i) {
        C8632dsu.c((Object) bkc, "");
        drM<? super Integer, dpR> drm = bkc.c;
        if (drm != null) {
            drm.invoke(Integer.valueOf(i - bkc.b));
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((bKC) cVar);
        cVar.c().setOnCheckedChangeListener(null);
        cVar.c().removeAllViews();
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(c.class, "radioGroup", "getRadioGroup()Landroid/widget/RadioGroup;", 0))};
        public static final int e = 8;
        private final dsZ b = bIF.d(this, C3796bKz.a.s, false, 2, null);

        public final RadioGroup c() {
            return (RadioGroup) this.b.getValue(this, c[0]);
        }
    }
}
