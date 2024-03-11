package o;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortEpoxyController;
import o.C6956cnA;
import o.C9834xU;

/* renamed from: o.cnX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6979cnX extends TH {
    private final MyListSortEpoxyController d;

    public final MyListSortEpoxyController d() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6979cnX(Context context, final drM<? super View, dpR> drm, MyListSortEpoxyController myListSortEpoxyController) {
        super(context, C6956cnA.b.g, drm, null, 0, 0, 0, 0, context.getResources().getDimensionPixelSize(C9834xU.a.z), false, false, false, false, false, 16120, null);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) myListSortEpoxyController, "");
        this.d = myListSortEpoxyController;
        RecyclerView recyclerView = (RecyclerView) findViewById(C6956cnA.e.l);
        recyclerView.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
        recyclerView.setAdapter(myListSortEpoxyController.getAdapter());
        ImageView imageView = (ImageView) findViewById(C6956cnA.e.f13752o);
        C8632dsu.d(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.cnY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6979cnX.c(drM.this, this, view);
            }
        });
        imageView.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, C6979cnX c6979cnX, View view) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) c6979cnX, "");
        c6979cnX.close();
    }
}
