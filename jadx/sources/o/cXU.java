package o;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.widget.TextViewCompat;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import java.util.List;
import java.util.Map;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bET;
import o.cXU;

/* loaded from: classes5.dex */
public final class cXU extends UserMessageAreaView {
    public static final c d = new c(null);
    public static final int e = 8;
    private final InterfaceC8554dpx a;
    private final InterfaceC8554dpx b;

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int a() {
        return com.netflix.mediaclient.ui.R.l.G;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int h() {
        return com.netflix.mediaclient.ui.R.l.F;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public int j() {
        return com.netflix.mediaclient.ui.R.i.bJ;
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public boolean v() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cXU(Context context) {
        super(context, UserMessageAreaView.MessageType.DIALOG);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) context, "");
        b = dpB.b(new drO<bET>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaWhiteModalView$binding$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final bET invoke() {
                bET c2 = bET.c(cXU.this);
                C8632dsu.a(c2, "");
                return c2;
            }
        });
        this.b = b;
        b2 = dpB.b(new drO<ConstraintLayout>() { // from class: com.netflix.mediaclient.ui.ums.UserMessageAreaWhiteModalView$container$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final ConstraintLayout invoke() {
                bET n;
                n = cXU.this.n();
                ConstraintLayout constraintLayout = n.e;
                C8632dsu.a(constraintLayout, "");
                return constraintLayout;
            }
        });
        this.a = b2;
        this.g = p();
    }

    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("UserMessageAreaWhiteModalView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bET n() {
        return (bET) this.b.getValue();
    }

    private final ConstraintLayout p() {
        return (ConstraintLayout) this.a.getValue();
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void k() {
        List<UmaCta> ctas;
        Object f;
        Object f2;
        if (this.f13325o == UserMessageAreaView.MessageType.BANNER) {
            UmaAlert umaAlert = this.m;
            if (umaAlert != null) {
                ctas = umaAlert.bannerCtas();
            }
            ctas = null;
        } else {
            UmaAlert umaAlert2 = this.m;
            if (umaAlert2 != null) {
                ctas = umaAlert2.ctas();
            }
            ctas = null;
        }
        if (ctas == null || ctas.isEmpty()) {
            return;
        }
        f = C8576dqs.f((List<? extends Object>) ctas, 0);
        UmaCta umaCta = (UmaCta) f;
        if (umaCta != null) {
            c(umaCta, com.netflix.mediaclient.ui.R.g.gI);
        }
        f2 = C8576dqs.f((List<? extends Object>) ctas, 1);
        UmaCta umaCta2 = (UmaCta) f2;
        if (umaCta2 != null) {
            c(umaCta2, com.netflix.mediaclient.ui.R.g.gF);
        }
    }

    @Override // com.netflix.mediaclient.ui.ums.UserMessageAreaView
    public void b(View view) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) view, "");
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, C9834xU.o.i);
        }
        int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(C9834xU.a.m);
        view.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        p().addView(view);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(p());
        if (view.getId() == com.netflix.mediaclient.ui.R.g.gI) {
            constraintSet.connect(view.getId(), 6, p().getId(), 6);
        } else if (view.getId() == com.netflix.mediaclient.ui.R.g.gF) {
            constraintSet.connect(view.getId(), 7, p().getId(), 7);
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = d.getLogTag() + ": Should not add to container: White modal UMA has only 2 CTAs";
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        constraintSet.connect(view.getId(), 3, this.i.getId(), 4);
        constraintSet.connect(view.getId(), 4, p().getId(), 4);
        constraintSet.applyTo(p());
    }
}
