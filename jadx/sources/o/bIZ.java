package o;

import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import com.airbnb.epoxy.Carousel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* loaded from: classes4.dex */
public abstract class bIZ extends AbstractC3336ax<d> implements InterfaceC2023aX {
    private float c = 1.0f;
    private final List<AbstractC3073as<?>> b = new ArrayList();

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.c;
    }

    public final float i() {
        return this.c;
    }

    @Override // o.InterfaceC2023aX
    public void add(AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) abstractC3073as, "");
        this.b.add(abstractC3073as);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.d().setModels(this.b);
        dVar.d().setNumViewsToShowOnScreen(this.c);
    }

    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(d.class, "carousel", "getCarousel()Lcom/airbnb/epoxy/Carousel;", 0))};
        public static final int e = 8;
        private final dsZ a = bIF.d(this, C3796bKz.a.f, false, 2, null);

        public final Carousel d() {
            return (Carousel) this.a.getValue(this, c[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            Carousel d = d();
            d.setPadding(0, 0, 0, 0);
            d.setItemSpacingDp(0);
            d.setOnFlingListener(null);
            new PagerSnapHelper().attachToRecyclerView(d);
            new C1619aI().d(d);
        }
    }
}
