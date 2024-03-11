package o;

import com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController;
import javax.inject.Inject;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class bPG {
    private final Provider<GdpEpoxyController> a;

    @Inject
    public bPG(Provider<GdpEpoxyController> provider) {
        C8632dsu.c((Object) provider, "");
        this.a = provider;
    }

    public final GdpEpoxyController a() {
        GdpEpoxyController gdpEpoxyController = this.a.get();
        C8632dsu.a(gdpEpoxyController, "");
        return gdpEpoxyController;
    }
}
