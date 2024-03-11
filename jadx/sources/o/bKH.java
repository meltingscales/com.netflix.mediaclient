package o;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.netflix.mediaclient.rowconfig.layoutmanager.HorizontalRowConfigLayoutManager;
import com.netflix.mediaclient.ui.epoxymodels.api.RowModel;
import o.C1729aMb;
import o.aLX;

/* loaded from: classes4.dex */
public final class bKH {
    public static final /* synthetic */ void b(RowModel.b bVar, C1729aMb c1729aMb) {
        e(bVar, c1729aMb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RowModel.b bVar, C1729aMb c1729aMb) {
        EpoxyRecyclerView b = bVar.b();
        Context context = b.getContext();
        C8632dsu.a(context, "");
        HorizontalRowConfigLayoutManager horizontalRowConfigLayoutManager = new HorizontalRowConfigLayoutManager(context, c1729aMb);
        horizontalRowConfigLayoutManager.setSpanCount(c1729aMb.o());
        b.setLayoutManager(horizontalRowConfigLayoutManager);
        RecyclerView.LayoutManager layoutManager = b.getLayoutManager();
        C8632dsu.d(layoutManager);
        ((LinearLayoutManager) layoutManager).setInitialPrefetchItemCount(c1729aMb.m() + 1);
        b.setHasFixedSize(true);
        b.setScrollingTouchSlop(1);
        b.setNestedScrollingEnabled(false);
        b.setPadding(c1729aMb.a(), c1729aMb.r(), c1729aMb.a(), c1729aMb.r());
        b.setItemSpacingPx(0);
        b.setTag(aLX.a.d, c1729aMb);
        PagerSnapHelper a = bVar.a();
        if (a != null) {
            a.attachToRecyclerView(null);
        }
        bVar.e((PagerSnapHelper) null);
        C9906yn c = bVar.c();
        if (c != null) {
            c.attachToRecyclerView(null);
        }
        bVar.e((C9906yn) null);
        if (!c1729aMb.e()) {
            if (c1729aMb.m() == 1) {
                PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                bVar.e(pagerSnapHelper);
                pagerSnapHelper.attachToRecyclerView(b);
            } else {
                C9906yn c9906yn = new C9906yn();
                bVar.e(c9906yn);
                c9906yn.d(b, c1729aMb);
            }
        }
        C9691vF.c(b);
        C1729aMb.b f = c1729aMb.f();
        if (f != null) {
            Context context2 = b.getContext();
            C8632dsu.a(context2, "");
            b.addItemDecoration(f.d((AppCompatActivity) C9737vz.e(context2, AppCompatActivity.class)));
        }
        b.addItemDecoration(new C1731aMd());
        b.setItemAnimator(null);
    }
}
