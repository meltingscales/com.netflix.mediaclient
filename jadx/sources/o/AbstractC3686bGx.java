package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bGx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3686bGx extends AbstractC3336ax<e> {
    private String b;
    private int c;
    private List<? extends InterfaceC5227bul> d;
    private String g;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.c;
    }

    public final void b(List<? extends InterfaceC5227bul> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    public final void b_(String str) {
        this.b = str;
    }

    public final void e(int i) {
        this.c = i;
    }

    public final void e(String str) {
        this.g = str;
    }

    public final int i() {
        return this.c;
    }

    public final List<InterfaceC5227bul> l() {
        return this.d;
    }

    public final String m() {
        return this.b;
    }

    public final String o() {
        return this.g;
    }

    public AbstractC3686bGx() {
        List<? extends InterfaceC5227bul> i;
        i = C8569dql.i();
        this.d = i;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(eVar.d().getContext(), NetflixActivity.class);
        if (netflixActivity != null) {
            eVar.d().setStateFromEpisodes(this.d, this.g, this.c, netflixActivity);
            eVar.d().setEnabled(true);
        }
    }

    /* renamed from: o.bGx$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(e.class, "seasonDownloadButton", "getSeasonDownloadButton()Lcom/netflix/mediaclient/ui/offline/SeasonDownloadButton;", 0))};
        private final dsZ d = bIF.d(this, C3670bGh.a.C, false, 2, null);

        public final SeasonDownloadButton d() {
            return (SeasonDownloadButton) this.d.getValue(this, b[0]);
        }
    }
}
