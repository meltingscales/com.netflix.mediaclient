package o;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;

/* renamed from: o.ccN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6386ccN extends AbstractC6385ccM {
    private final TextView e;

    public C6386ccN(View view, C1729aMb c1729aMb, InterfaceC6387ccO interfaceC6387ccO) {
        super(view, c1729aMb, com.netflix.mediaclient.ui.R.g.du, interfaceC6387ccO);
        this.e = (TextView) view.findViewById(com.netflix.mediaclient.ui.R.g.dy);
    }

    @Override // o.AbstractC6385ccM, com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.e
    /* renamed from: e */
    public void a(LoMo loMo) {
        super.a(loMo);
        this.e.setText(loMo.getTitle());
    }

    public void a(LoMo loMo, AbstractC9900yh abstractC9900yh, Parcelable parcelable) {
        a((C6386ccN) loMo, abstractC9900yh, parcelable);
        if (b(loMo) || (abstractC9900yh.getItemCount() == 0 && abstractC9900yh.c())) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
    }

    protected boolean b(LoMo loMo) {
        String title = loMo.getTitle();
        return title == null || title.isEmpty();
    }
}
