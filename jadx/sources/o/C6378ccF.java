package o;

import android.view.View;
import android.widget.FrameLayout;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.cl.model.event.session.command.RetryCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Objects;
import o.C9834xU;

/* renamed from: o.ccF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6378ccF extends BaseVerticalRecyclerViewAdapter.d {
    private a b;
    private final View e;

    /* renamed from: o.ccF$a */
    /* loaded from: classes4.dex */
    public interface a {
        void d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6378ccF(View view, a aVar) {
        super(view);
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) aVar, "");
        this.e = view;
        this.b = aVar;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C9834xU.a.m);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        View findViewById = view.findViewById(com.netflix.mediaclient.ui.R.g.fn);
        Objects.requireNonNull(findViewById);
        ((C1203Sq) findViewById).setOnClickListener(new View.OnClickListener() { // from class: o.ccJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6378ccF.c(C6378ccF.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6378ccF c6378ccF, View view) {
        C8632dsu.c((Object) c6378ccF, "");
        c6378ccF.c();
    }

    private final void c() {
        this.b.d();
        CLv2Utils.d(new RetryCommand());
    }
}
