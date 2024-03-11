package o;

import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.cOG;

/* renamed from: o.cOy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5964cOy extends BaseVerticalRecyclerViewAdapter.e<Object> {
    private final C1204Sr c;
    private final NetflixImageView d;

    @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.e
    public void a(Object obj) {
        C8632dsu.c(obj, "");
    }

    public final C1204Sr b() {
        return this.c;
    }

    public final NetflixImageView c() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5964cOy(cOH coh, C1729aMb c1729aMb) {
        super(coh.e(), c1729aMb, cOG.b.a);
        C8632dsu.c((Object) coh, "");
        C8632dsu.c((Object) c1729aMb, "");
        C1204Sr c1204Sr = coh.e;
        C8632dsu.a(c1204Sr, "");
        this.c = c1204Sr;
        NetflixImageView netflixImageView = coh.d;
        C8632dsu.a(netflixImageView, "");
        this.d = netflixImageView;
    }
}
