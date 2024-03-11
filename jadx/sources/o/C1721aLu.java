package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.util.Map;

/* renamed from: o.aLu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1721aLu extends AbstractC1714aLn {
    public C1721aLu(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.NflxHandler
    public NflxHandler.Response I_() {
        String str = this.d.get("genreid");
        if (str == null) {
            C1044Mm.b("NflxHandler", "Could not find genre ID");
            return NflxHandler.Response.NOT_HANDLING;
        }
        this.b.getServiceManager().j().b(str, new c(this.b, str));
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    /* renamed from: o.aLu$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC5164btb {
        private final String a;
        private final NetflixActivity e;

        c(NetflixActivity netflixActivity, String str) {
            this.a = str;
            this.e = netflixActivity;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void e(InterfaceC5156btT interfaceC5156btT, Status status) {
            if (status.j()) {
                NetflixActivity netflixActivity = this.e;
                String title = interfaceC5156btT.getTitle();
                String str = this.a;
                GenreItem.GenreType genreType = GenreItem.GenreType.LOLOMO;
                HomeActivity.e(netflixActivity, new DefaultGenreItem(title, str, genreType, "Collection:" + this.a, null));
            }
            C8194dfl.c(this.e);
        }
    }
}
