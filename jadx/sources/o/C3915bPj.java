package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.ui.games.impl.gdp.GameMetaDataEpoxyController;
import o.C3895bOq;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.bPj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3915bPj extends TH {
    private GameMetaDataEpoxyController d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3915bPj(Context context, InterfaceC5185btw interfaceC5185btw, drM<? super View, dpR> drm) {
        super(context, C3895bOq.c.r, drm, null, 0, 0, 0, 0, 0, false, false, false, false, true, 5624, null);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC5185btw, "");
        C8632dsu.c((Object) drm, "");
        View findViewById = findViewById(C3895bOq.b.h);
        C8632dsu.d(findViewById);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: o.bPh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3915bPj.e(C3915bPj.this, view);
            }
        });
        findViewById.setClickable(true);
        ((C1204Sr) findViewById(C3895bOq.b.t)).setText(interfaceC5185btw.getTitle());
        this.d = new GameMetaDataEpoxyController(context);
        RecyclerView recyclerView = (RecyclerView) findViewById(C3895bOq.b.ab);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
        GameMetaDataEpoxyController gameMetaDataEpoxyController = this.d;
        recyclerView.setAdapter(gameMetaDataEpoxyController != null ? gameMetaDataEpoxyController.getAdapter() : null);
        recyclerView.setItemAnimator(null);
        GameMetaDataEpoxyController gameMetaDataEpoxyController2 = this.d;
        if (gameMetaDataEpoxyController2 != null) {
            gameMetaDataEpoxyController2.setData(interfaceC5185btw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3915bPj c3915bPj, View view) {
        C8632dsu.c((Object) c3915bPj, "");
        c3915bPj.close();
    }
}
