package o;

import android.util.Pair;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.browse.BrowseDiskCacheCompactionTrigger;
import com.netflix.model.leafs.advisory.ContentAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.Iy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0953Iy {
    private final C0954Iz<?> c;
    private final C1913aSx d;

    public C0953Iy(C0954Iz<?> c0954Iz, C1913aSx c1913aSx) {
        this.c = c0954Iz;
        this.d = c1913aSx;
    }

    public void b(IU iu, InterfaceC1757aNc interfaceC1757aNc) {
        d(new IY(this.c, this.d, iu, interfaceC1757aNc));
    }

    public <T> void e(InterfaceC0989Ki<T> interfaceC0989Ki, InterfaceC1755aNa<T> interfaceC1755aNa) {
        d(new C0990Kj(this.c, this.d, interfaceC0989Ki, interfaceC1755aNa));
    }

    public void b(String str, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        if (str == null && (str = this.c.j()) == null) {
            InterfaceC1598aHf.a(new C1596aHd("falcor.fetchLoMos called with null lolomoId while GraphQL enabled").b(ErrorType.m).e(true).b(false));
            if (interfaceC1757aNc != null) {
                interfaceC1757aNc.h(Collections.emptyList(), InterfaceC1078Nw.ad);
                return;
            }
            return;
        }
        d(new JA(this.c, str, i, i2, interfaceC1757aNc));
    }

    public void c(LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc, String str) {
        if (C8153dex.d(loMo.getType())) {
            d(new JW(this.c, loMo, i, i2, z, z2, interfaceC1757aNc));
        } else if (LoMoType.BILLBOARD.equals(loMo.getType())) {
            d(new IZ(this.c, i, i2, loMo.getId(), z, interfaceC1757aNc));
        } else if (LoMoType.ROAR.equals(loMo.getType()) && aSC.a() && loMo.isRichUITreatment()) {
            d(new JH(this.c, loMo, i, i2, z, z2, interfaceC1757aNc));
        } else if (LoMoType.TOP_TEN.equals(loMo.getType())) {
            d(new JU(this.c, loMo, i, i2, z, z2, interfaceC1757aNc));
        } else if (LoMoType.CONTINUE_WATCHING.equals(loMo.getType())) {
            d(new C0959Je(this.c, this.d, i, i2, loMo.getId(), z ? TaskMode.FROM_CACHE_ONLY : TaskMode.FROM_CACHE_OR_NETWORK, interfaceC1757aNc, str));
        } else {
            d(new JW(this.c, loMo, i, i2, z, z2, interfaceC1757aNc));
        }
    }

    public void e(LoMo loMo, int i, int i2, boolean z, InterfaceC1757aNc interfaceC1757aNc, String str) {
        d(new C0959Je(this.c, this.d, i, i2, loMo.getId(), z ? TaskMode.FROM_CACHE_ONLY : TaskMode.FROM_CACHE_OR_NETWORK, interfaceC1757aNc, str));
    }

    public void a(String str, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C0972Jr(this.c, str, i, i2, z, z2, interfaceC1757aNc));
    }

    public void b(int i, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JD(this.c, i, z, interfaceC1757aNc));
    }

    public void e(int i, int i2, String str, boolean z, InterfaceC1757aNc interfaceC1757aNc, String str2) {
        d(new C0959Je(this.c, this.d, i, i2, str, z ? TaskMode.FROM_CACHE_ONLY : TaskMode.FROM_CACHE_OR_NETWORK, interfaceC1757aNc, str2));
    }

    public void d(List<String> list, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JG(this.c, list, interfaceC1757aNc));
    }

    public void d(final int i, final int i2, final String str, final LoMo loMo, final boolean z, final boolean z2, final InterfaceC1757aNc interfaceC1757aNc) {
        d(new Runnable() { // from class: o.IA
            @Override // java.lang.Runnable
            public final void run() {
                C0953Iy.this.c(loMo, str, i, i2, z, z2, interfaceC1757aNc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(LoMo loMo, String str, int i, int i2, boolean z, boolean z2, final InterfaceC1757aNc interfaceC1757aNc) {
        if (loMo == null) {
            Pair<LoMo, String> a = this.c.a(LoMoType.INSTANT_QUEUE, str);
            if (a != null) {
                new JW(this.c, (LoMo) a.first, i, i2, z, z2, interfaceC1757aNc).run();
                return;
            }
            C1044Mm.j("NetflixFalkorTasksDispatcher", "Asked to fetch IQ videos but no IQ lomo currently exists in cache!");
            C8187dfe.c(new Runnable() { // from class: o.Iy.4
                @Override // java.lang.Runnable
                public void run() {
                    interfaceC1757aNc.k(null, InterfaceC1078Nw.aC);
                }
            });
            return;
        }
        new JW(this.c, loMo, i, i2, z, z2, interfaceC1757aNc).run();
    }

    public void c(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C0973Js(this.c, str, taskMode, interfaceC1757aNc));
    }

    public void d(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C0968Jn(this.c, str, taskMode, interfaceC1757aNc));
    }

    public void a(String str, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JT(this.c, str, i, i2, interfaceC1757aNc));
    }

    public void e(String str, InterfaceC1757aNc interfaceC1757aNc) {
        if (str == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35532 fetchVideoSummary: videoId was null").b(ErrorType.m));
        }
        d(new JX(this.c, str, interfaceC1757aNc));
    }

    public void d(String str, InterfaceC1757aNc interfaceC1757aNc) {
        if (str == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35532 fetchFalkorVideo: videoId was null").b(ErrorType.m));
        }
        d(new C0967Jm(this.c, str, interfaceC1757aNc));
    }

    public void d(String str, String str2, boolean z, boolean z2, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool) {
        if (str == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35532 fetchMovieDetails: movieId was null").b(ErrorType.m));
        }
        d(new C0979Jy(this.c, this.d, this, str, str2, z, z2, taskMode, interfaceC1757aNc, str3, bool.booleanValue()));
    }

    public void d(String str, String str2, boolean z, boolean z2, boolean z3, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool) {
        if (str == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35532 fetchShowDetails: showId was null").b(ErrorType.m));
        }
        d(new JN(this.c, this.d, this, str, str2, z, z2, z3, taskMode, interfaceC1757aNc, str3, bool.booleanValue()));
    }

    public void a(String str, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        if (str == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35532 fetchKidsCharacterDetails: characterId was null").b(ErrorType.m));
        }
        d(new C0988Kh(this.c, this.d, this, str, z, interfaceC1757aNc));
    }

    public void a() {
        while (!C1909aSt.h() && C1909aSt.e() < 2) {
            C1909aSt.b();
            InterfaceC5177bto d = C1909aSt.d();
            if (d != null) {
                InterfaceC1757aNc a = C1909aSt.a(d);
                if (d.getType() == VideoType.MOVIE) {
                    d(d.getId(), null, true, false, TaskMode.FROM_CACHE_OR_NETWORK, a, "", Boolean.FALSE);
                } else if (d.getType() == VideoType.SHOW) {
                    d(d.getId(), null, true, true, true, TaskMode.FROM_CACHE_OR_NETWORK, a, "", Boolean.FALSE);
                } else if (d.getType() == VideoType.CHARACTERS) {
                    a(d.getId(), true, a);
                }
            } else {
                C1909aSt.c();
            }
        }
    }

    public void c(String str, VideoType videoType, PlayLocationType playLocationType, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JC(this.c, str, videoType, playLocationType, interfaceC1757aNc));
    }

    public void a(String str, String str2, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C0993Km(this.c, str, str2, interfaceC1757aNc));
    }

    public void e(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3) {
        if (str == null) {
            InterfaceC1597aHe.b(new C1596aHd("SPY-35532 fetchEpisodeDetails: episodeId was null").b(ErrorType.m));
        }
        d(new C0964Jj(this.c, this.d, str, str2, z, taskMode, interfaceC1757aNc, str3));
    }

    public void d(VideoType videoType, String str, String str2, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JI(this.c, videoType, str, str2, interfaceC1757aNc));
    }

    public void c(String str, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C0974Jt(this.c, str, interfaceC1757aNc));
    }

    public void e(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JP(this.c, str, taskMode, interfaceC1757aNc));
    }

    public void c(String str, TaskMode taskMode, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C0966Jl(this.c, this.d, str, taskMode, i, i2, interfaceC1757aNc));
    }

    public void d(String str, TaskMode taskMode, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JB(this.c, str, taskMode, z, interfaceC1757aNc));
    }

    public void e(boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JE(this.c, z, interfaceC1757aNc));
    }

    public void c(String str, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        d(new JF(this.c, str, z, interfaceC1757aNc));
    }

    public void c(InterfaceC1757aNc interfaceC1757aNc, String... strArr) {
        d(new C1001Ku(this.c, interfaceC1757aNc, strArr));
    }

    public void d(String str, VideoType videoType, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C1006Kz(this.c, str, videoType, i, i2, interfaceC1757aNc));
    }

    public void a(String str, VideoType videoType, int i, String str2, String str3, InterfaceC1757aNc interfaceC1757aNc) {
        d(new IR(this.c, this.d, str, videoType, str2, i, str3, interfaceC1757aNc));
    }

    public void c(String str, VideoType videoType, String str2, String str3, InterfaceC1757aNc interfaceC1757aNc) {
        d(new C1003Kw(this.c, str, videoType, str2, str3, interfaceC1757aNc));
    }

    public void d(InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map) {
        d(new C0995Ko(this.c, interfaceC5223buh, billboardInteractionType, map));
    }

    public void a(String str, ContentAction contentAction) {
        d(new C1002Kv(this.c, str, contentAction));
    }

    public void b(String str, InterfaceC1757aNc interfaceC1757aNc) {
        if (!C8168dfL.g(str)) {
            d(new C0957Jc(this.c, str, interfaceC1757aNc));
        } else if (interfaceC1757aNc != null) {
            interfaceC1757aNc.e(new ArrayList(0), InterfaceC1078Nw.ag);
        }
    }

    public void c(final InterfaceC1926aTj interfaceC1926aTj, final InterfaceC1919aTc interfaceC1919aTc, final int i, final BrowseDiskCacheCompactionTrigger browseDiskCacheCompactionTrigger) {
        d(new Runnable() { // from class: o.Iy.2
            @Override // java.lang.Runnable
            public void run() {
                C0953Iy.this.d.e(browseDiskCacheCompactionTrigger);
                interfaceC1926aTj.a(interfaceC1919aTc, i);
            }
        });
    }

    private static void d(Runnable runnable) {
        C1044Mm.d("NetflixFalkorTasksDispatcher", "Launching task: %s", runnable.getClass().getSimpleName());
        new C1071Np().d(new ID(runnable));
    }
}
