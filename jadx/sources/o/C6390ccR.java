package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;

/* renamed from: o.ccR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6390ccR extends BaseVerticalRecyclerViewAdapter.d {
    public static C6390ccR a(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new RecyclerView.LayoutParams(-1, C9870yD.b(viewGroup.getContext(), 1)));
        return new C6390ccR(space);
    }

    private C6390ccR(View view) {
        super(view);
    }

    public void d(LoMo loMo) {
        if (loMo == null) {
            InterfaceC1598aHf.a("RowUnknownViewHolder: Unknown view type, got null lomo");
        } else {
            InterfaceC1598aHf.a(new C1596aHd("RowUnknownViewHolder: Unknown view type").e("type", loMo.getType().toString()).e("class", loMo.getClass().getName()));
        }
    }
}
