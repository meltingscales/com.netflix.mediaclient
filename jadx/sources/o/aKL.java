package o;

import android.content.Intent;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewTitlesCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.model.leafs.ListOfMoviesSummary;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class aKL implements aKP {
    private boolean a;
    private final Map<String, String> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aKL(boolean z, Map<String, String> map) {
        this.a = z;
        this.e = map;
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return list.size() == 1 || a(list) || b(list) || e(list) || d(list);
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        if (DeepLinkUtils.a(netflixActivity, intent, this.e)) {
            return NflxHandler.Response.HANDLING;
        }
        NflxHandler.Response response = NflxHandler.Response.NOT_HANDLING;
        if (list.size() == 1) {
            NflxHandler.Response b = C8076ddZ.d(this.e) ? b(netflixActivity) : response;
            if (b == response) {
                DeepLinkUtils.INSTANCE.d(netflixActivity);
                return NflxHandler.Response.HANDLING;
            }
            return b;
        } else if (a(list)) {
            return d(netflixActivity);
        } else {
            if (b(list)) {
                return b("assistiveAudio", "", netflixActivity);
            }
            if (!d(list)) {
                return e(list) ? b(list.get(2), "", netflixActivity) : response;
            }
            return b("specials-" + list.get(1).toLowerCase(Locale.US), "", netflixActivity);
        }
    }

    @Override // o.aKP
    public Command d() {
        return new ViewTitlesCommand();
    }

    private NflxHandler.Response b(String str, String str2, NetflixActivity netflixActivity) {
        if (this.a) {
            d(str, str2, netflixActivity);
        } else {
            a(str, str2, netflixActivity);
        }
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    private void d(final String str, final String str2, final NetflixActivity netflixActivity) {
        netflixActivity.getServiceManager().j().c(str, 0, C4000bSn.b(netflixActivity, LoMoType.FLAT_GENRE) - 1, false, false, new AbstractC5164btb() { // from class: o.aKL.5
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
                super.d(listOfMoviesSummary, list, status);
                if (status.j() && listOfMoviesSummary != null && list != null) {
                    HomeActivity.d(netflixActivity, (GenreItem) new DefaultGenreItem(listOfMoviesSummary.getTitle(), str, GenreItem.GenreType.GALLERY, listOfMoviesSummary.getTrackId(), str2, null), false, true);
                    return;
                }
                InterfaceC1598aHf.a("handleGenre failed for " + str);
                DeepLinkUtils.INSTANCE.d(netflixActivity);
            }
        });
    }

    private void a(final String str, final String str2, final NetflixActivity netflixActivity) {
        if ("netflixOriginals".equalsIgnoreCase(str)) {
            str = "839338";
        }
        if (!str.startsWith("specials")) {
            e(str, netflixActivity);
        } else {
            netflixActivity.getServiceManager().j().b(str, new AbstractC5164btb() { // from class: o.aKL.1
                @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                public void e(InterfaceC5156btT interfaceC5156btT, Status status) {
                    if (status.j() && interfaceC5156btT != null) {
                        HomeActivity.e(netflixActivity, new DefaultGenreItem(interfaceC5156btT.getTitle(), str, GenreItem.GenreType.LOLOMO, str2, null));
                    } else {
                        InterfaceC1598aHf.a("handleGenre failed for " + str);
                        DeepLinkUtils.INSTANCE.d(netflixActivity);
                    }
                    C8194dfl.c(netflixActivity);
                }
            });
        }
    }

    private void e(final String str, final NetflixActivity netflixActivity) {
        final PublishSubject create = PublishSubject.create();
        aLN.a.a(create).e(new C0971Jq(str, TaskMode.FROM_CACHE_OR_NETWORK)).subscribe(new bDM<GenreItem>("NetflixComBrowseHandler") { // from class: o.aKL.3
            @Override // io.reactivex.Observer
            /* renamed from: b */
            public void onNext(GenreItem genreItem) {
                C1044Mm.a("NetflixComBrowseHandler", "fetchGenreItemSummary received genre " + genreItem);
                if (genreItem.getId() == null || genreItem.getId().isEmpty()) {
                    e();
                } else {
                    HomeActivity.e(netflixActivity, genreItem);
                }
                C8194dfl.c(netflixActivity);
            }

            @Override // o.bDM, io.reactivex.Observer
            public void onError(Throwable th) {
                super.onError(th);
                create.onComplete();
                e();
                C8194dfl.c(netflixActivity);
            }

            @Override // o.bDM, io.reactivex.Observer
            public void onComplete() {
                super.onComplete();
                create.onComplete();
            }

            private void e() {
                InterfaceC1598aHf.a("handleGenre failed for " + str);
                DeepLinkUtils.INSTANCE.d(netflixActivity);
            }
        });
    }

    private NflxHandler.Response d(NetflixActivity netflixActivity) {
        C1044Mm.b("NetflixComBrowseHandler", "Starting trailers feed activity");
        DeepLinkUtils.INSTANCE.d(netflixActivity, true);
        return NflxHandler.Response.HANDLING;
    }

    private boolean e(List<String> list) {
        return list.size() > 2 && "genre".equalsIgnoreCase(list.get(1));
    }

    private boolean d(List<String> list) {
        return list.size() > 1 && "specials".equalsIgnoreCase(list.get(0));
    }

    private boolean a(List<String> list) {
        return list.size() > 1 && "coming-soon".equalsIgnoreCase(list.get(1));
    }

    private boolean b(List<String> list) {
        return list.size() > 1 && "audio-description".equalsIgnoreCase(list.get(1));
    }

    private NflxHandler.Response b(NetflixActivity netflixActivity) {
        DeepLinkUtils.INSTANCE.d(netflixActivity, this.e.get("cdxDeviceId"), this.e.get("profileId"));
        return NflxHandler.Response.HANDLING;
    }
}
