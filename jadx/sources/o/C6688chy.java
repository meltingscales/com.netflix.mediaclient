package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import o.C6638chA;
import o.C9834xU;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.chy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6688chy extends TH {
    private final RecyclerView d;
    private final AbstractC2914ap e;
    public static final b c = new b(null);
    public static final int b = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6688chy(Context context, drM<? super View, dpR> drm, AbstractC2914ap abstractC2914ap) {
        super(context, C6638chA.a.d, drm, null, 0, 0, 0, 0, context.getResources().getDimensionPixelSize(C9834xU.a.z), false, false, false, false, false, 16120, null);
        DefaultItemAnimator defaultItemAnimator;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) abstractC2914ap, "");
        this.e = abstractC2914ap;
        C6639chB d = C6639chB.d(this);
        C8632dsu.a(d, "");
        C3786bKp c3786bKp = d.d;
        c3786bKp.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
        c3786bKp.setAdapter(abstractC2914ap.getAdapter());
        C8632dsu.a(c3786bKp, "");
        this.d = c3786bKp;
        new C1619aI().d(c3786bKp);
        if (NetflixApplication.v()) {
            defaultItemAnimator = null;
        } else {
            defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setAddDuration(150L);
            defaultItemAnimator.setRemoveDuration(150L);
            defaultItemAnimator.setChangeDuration(150L);
        }
        c3786bKp.setItemAnimator(defaultItemAnimator);
    }

    /* renamed from: o.chy$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MessagingTrayLayout");
        }
    }
}
