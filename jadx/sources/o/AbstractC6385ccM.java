package o;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import java.util.Locale;
import o.C9834xU;

/* renamed from: o.ccM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6385ccM extends BaseVerticalRecyclerViewAdapter.e<LoMo> {
    private ViewStub c;
    private View d;
    private View e;
    private final InterfaceC6387ccO j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6385ccM(View view, C1729aMb c1729aMb, int i, InterfaceC6387ccO interfaceC6387ccO) {
        super(view, c1729aMb, i);
        this.c = (ViewStub) view.findViewById(com.netflix.mediaclient.ui.R.g.bN);
        this.d = view.findViewById(i);
        this.j = interfaceC6387ccO;
        this.b.addOnScrollListener(C5838cKf.d());
        if (C8171dfO.e()) {
            this.b.setItemAnimator(null);
        }
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.e
    /* renamed from: e */
    public void a(LoMo loMo) {
        C9909yq c9909yq = this.b;
        Locale locale = Locale.US;
        c9909yq.setTrackingName(String.format(locale, "Lolomo.Lomo[%s]", loMo.getType()));
        b(String.format(locale, "Lolomo.Lomo[%s]", loMo.getType()));
    }

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.d
    public void d(boolean z) {
        if (z) {
            b();
        } else {
            c();
        }
    }

    public void b() {
        ViewStub viewStub = this.c;
        if (viewStub != null) {
            if (this.e == null) {
                View inflate = viewStub.inflate();
                this.e = inflate;
                C1203Sq c1203Sq = (C1203Sq) inflate.findViewById(com.netflix.mediaclient.ui.R.g.fn);
                TextView textView = (TextView) this.e.findViewById(com.netflix.mediaclient.ui.R.g.gl);
                if (c1203Sq != null && textView != null) {
                    c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.ccM.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            int adapterPosition = AbstractC6385ccM.this.getAdapterPosition();
                            if (adapterPosition != -1) {
                                AbstractC6385ccM.this.j.e(view, adapterPosition);
                            }
                        }
                    });
                    if (BrowseExperience.e()) {
                        c1203Sq.e(C9834xU.o.a);
                        textView.setTextColor(textView.getContext().getResources().getColorStateList(C9834xU.c.h));
                    }
                } else {
                    InterfaceC1598aHf.a("row error ui should have a retry button");
                }
            }
            View view = this.e;
            if (view == null || this.d == null) {
                return;
            }
            view.setVisibility(0);
            this.d.setVisibility(4);
        }
    }

    public void c() {
        View view = this.e;
        if (view == null || this.d == null) {
            return;
        }
        view.setVisibility(8);
        this.d.setVisibility(0);
    }
}
