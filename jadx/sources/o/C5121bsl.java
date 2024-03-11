package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.bsl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5121bsl implements InterfaceC5125bsp {
    private final InterfaceC5135bsz a;

    public C5121bsl(InterfaceC5135bsz interfaceC5135bsz) {
        this.a = interfaceC5135bsz;
    }

    @Override // o.InterfaceC5125bsp
    public void b(IO io2, InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            this.a.a().b(io2, this.a.d(), this.a.c(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManagerBrowse", "fetchTask:: service is not available");
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(String str, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().e(str, i, i2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchLoMos:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (loMo != null) {
                if (!C8168dfL.g(loMo.getId())) {
                    if (this.a.c()) {
                        this.a.a().d(loMo, i, i2, z, z2, this.a.d(), this.a.c(interfaceC5094bsK));
                        return true;
                    }
                    C1044Mm.j("ServiceManagerBrowse", "fetchVideos:: service is not available");
                    return false;
                }
            }
            StringBuilder sb = new StringBuilder("SPY-10830 LoLoMo refresh crash");
            if (loMo == null) {
                sb.append(", lomo == null");
            } else {
                sb.append(", lomo.id == ");
                sb.append(loMo.getId());
                sb.append(", lomo.title = ");
                sb.append(loMo.getTitle());
                sb.append(", lomo.class = ");
                sb.append(loMo.getClass());
            }
            InterfaceC1598aHf.a(sb.toString());
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean a(LoMo loMo, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (C8168dfL.g(loMo.getId())) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().a(loMo, i, i2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchGenreVideos:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean c(String str, int i, int i2, boolean z, boolean z2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().c(str, i, i2, z, z2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchFlatGenre:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(String str, TaskMode taskMode, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (!C8208dfz.e(str)) {
                if (interfaceC5094bsK != null) {
                    interfaceC5094bsK.h(null, new NetflixStatus(StatusCode.INVALID_ARGUMENTS));
                }
                return false;
            } else if (this.a.c()) {
                this.a.a().e(str, taskMode, i, i2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            } else {
                C1044Mm.j("ServiceManagerBrowse", "fetchEpisodes:: service is not available");
                return false;
            }
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean e(String str, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                int c = this.a.c(interfaceC5094bsK);
                C1044Mm.a("ServiceManagerBrowse", "fetchSeasons requestId=%s id=%s", Integer.valueOf(c), str);
                this.a.a().d(str, taskMode, this.a.d(), c);
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchSeasons:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean d(int i, int i2, String str, InterfaceC5094bsK interfaceC5094bsK, String str2) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().d(i, i2, str, this.a.d(), this.a.c(interfaceC5094bsK), str2);
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchCWVideos:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean a(String str, VideoType videoType, PlayLocationType playLocationType, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().b(str, videoType, playLocationType, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchPostPlayVideos:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean d(String str, String str2, InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            this.a.a().a(str, str2, this.a.d(), this.a.c(interfaceC5094bsK));
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "logPostPlayImpression:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public boolean a(int i, int i2, String str, LoMo loMo, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().d(i, i2, str, loMo, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchIQVideos:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(String str, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().d(str, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchLoLoMoSummary:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean a(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        if (this.a.c()) {
            this.a.a().a(str, this.a.d(), this.a.c(interfaceC5094bsK));
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "fetchVideoSummary:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public boolean d(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        if (this.a.c()) {
            this.a.a().c(str, this.a.d(), this.a.c(interfaceC5094bsK));
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "fetchFalkorVideo:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public boolean e(String str, String str2, boolean z, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK, String str3, Boolean bool) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().b(str, str2, z, taskMode, this.a.d(), this.a.e(interfaceC5094bsK, str), str3, bool);
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchMovieDetails:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean a(VideoType videoType, String str, String str2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (C8168dfL.g(str) || C8168dfL.g(str2)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().a(videoType, str, str2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchScenePosition:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public void c(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            this.a.a().b(str, this.a.d(), this.a.c(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManagerBrowse", "fetchAdvisories:: service is not available");
    }

    @Override // o.InterfaceC5125bsp
    public boolean e(String str, String str2, boolean z, InterfaceC5094bsK interfaceC5094bsK, String str3) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().a(str, str2, z, this.a.d(), this.a.c(interfaceC5094bsK), str3);
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchEpisodeDetails:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(String str, String str2, InterfaceC5094bsK interfaceC5094bsK, String str3) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().c(str, str2, this.a.d(), this.a.e(interfaceC5094bsK, str), str3);
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchShowDetails:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean d(String str, String str2, boolean z, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK, String str3, Boolean bool) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().c(str, str2, z, taskMode, this.a.d(), this.a.e(interfaceC5094bsK, str), str3, bool);
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchShowDetailsAndSeasons:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(String str, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().e(str, taskMode, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "fetchGenreLists:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean c(String str, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (!this.a.c()) {
                C1044Mm.j("ServiceManagerBrowse", "fetchGenres:: service is not available");
                return false;
            } else if (C8168dfL.g(str)) {
                return false;
            } else {
                this.a.a().c(str, i, i2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean b(String str, TaskMode taskMode, boolean z, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (this.a.c()) {
                this.a.a().c(str, taskMode, z, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "searchNetflix:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean d(String str, VideoType videoType, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().b(str, videoType, i, i2, this.a.d(), this.a.c(interfaceC5094bsK));
                return true;
            }
            C1044Mm.j("ServiceManagerBrowse", "setVideoThumbRating:: service is not available");
            return false;
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean e(String str, VideoType videoType, int i, String str2, String str3, InterfaceC5094bsK interfaceC5094bsK) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        if (this.a.c()) {
            this.a.a().c(str, videoType, i, str2, str3, this.a.d(), this.a.e(interfaceC5094bsK, str));
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "addToQueue:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public boolean c(String str, VideoType videoType, String str2, String str3, InterfaceC5094bsK interfaceC5094bsK) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        if (this.a.c()) {
            this.a.a().c(str, videoType, str2, str3, this.a.d(), this.a.e(interfaceC5094bsK, str));
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "removeFromQueue:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public boolean d() {
        if (this.a.c()) {
            this.a.a().b();
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "flushCaches:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public void e(InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map) {
        if (this.a.c()) {
            this.a.a().c(interfaceC5223buh, billboardInteractionType, map);
        } else {
            C1044Mm.j("ServiceManagerBrowse", "logBillboardActivity:: service is not available");
        }
    }

    @Override // o.InterfaceC5125bsp
    public boolean a(InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            int c = this.a.c(interfaceC5094bsK);
            C1044Mm.a("ServiceManagerBrowse", "fetchNotificationsList requestId=%s", Integer.valueOf(c));
            this.a.a().a(this.a.d(), c);
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "fetchNotificationsList:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public boolean e(String str, boolean z, InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            this.a.a().c(str, z, this.a.d(), this.a.c(interfaceC5094bsK));
            return true;
        }
        C1044Mm.j("ServiceManagerBrowse", "fetchNotificationSummary:: service is not available");
        return false;
    }

    @Override // o.InterfaceC5125bsp
    public void c(boolean z) {
        if (this.a.c()) {
            this.a.a().a(z, false, false, (MessageData) null);
        } else {
            C1044Mm.j("ServiceManagerBrowse", "refreshIrisNotifications:: service is not available");
        }
    }

    @Override // o.InterfaceC5125bsp
    public void e(String str, InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            this.a.a().e(str, this.a.d(), this.a.c(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManagerBrowse", "markNotificationAsRead:: service is not available");
    }

    @Override // o.InterfaceC5125bsp
    public void c(List<String> list, InterfaceC5094bsK interfaceC5094bsK) {
        if (this.a.c()) {
            this.a.a().e(list, this.a.d(), this.a.c(interfaceC5094bsK));
            return;
        }
        C1044Mm.j("ServiceManagerBrowse", "markNotificationsAsRead:: service is not available");
    }

    @Override // o.InterfaceC5125bsp
    public void a(String str, VideoType videoType) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                throw new IllegalArgumentException("Parameter cannot be null");
            }
            if (this.a.c()) {
                this.a.a().e(str, videoType);
            } else {
                C1044Mm.j("ServiceManagerBrowse", "purgeCachedEpisodes:: service is not available");
            }
        }
    }

    @Override // o.InterfaceC5125bsp
    public void d(boolean z) {
        if (this.a.c()) {
            this.a.a().a(z, (String) null);
            InterfaceC1593aHa.b("browse.cw.refresh");
            return;
        }
        C1044Mm.j("ServiceManagerBrowse", "refreshCw:: service is not available");
    }

    @Override // o.InterfaceC5125bsp
    public void c(String str, String str2, String str3, String str4) {
        if (this.a.c()) {
            this.a.a().c(str, str2, str3, str4);
            InterfaceC1593aHa.b(String.format(Locale.ENGLISH, "browse.%s.refresh", str));
            return;
        }
        C1044Mm.j("ServiceManagerBrowse", "refreshIq:: service is not available");
    }

    @Override // o.InterfaceC5125bsp
    public void a() {
        if (this.a.c()) {
            this.a.a().c();
        } else {
            C1044Mm.j("ServiceManagerBrowse", "clearSearchResults:: service is not available");
        }
    }

    public InterfaceC1240Ub<?> e() {
        if (this.a.c()) {
            return this.a.a().a();
        }
        C1044Mm.j("ServiceManagerBrowse", "getModelProxy:: service is not available");
        return null;
    }

    @Override // o.InterfaceC5125bsp
    @Deprecated
    public LoMo a(String str) {
        if (this.a.c()) {
            C0954Iz c0954Iz = (C0954Iz) e();
            if (c0954Iz != null) {
                return c0954Iz.e(str);
            }
            return null;
        }
        C1044Mm.j("ServiceManagerBrowse", "getModelProxy:: service is not available");
        return null;
    }
}
