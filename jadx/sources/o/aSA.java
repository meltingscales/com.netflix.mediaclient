package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.NotificationSummaryItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import com.netflix.model.leafs.social.NotificationsListSummary;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class aSA implements InterfaceC5127bsr {
    private final C1913aSx b;
    private final C1737aMj e;

    public aSA(C1913aSx c1913aSx, C1737aMj c1737aMj) {
        this.b = c1913aSx;
        this.e = c1737aMj;
    }

    @Override // o.InterfaceC5127bsr
    public void b(IO io2, int i, int i2) {
        this.b.d((C1913aSx) io2, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void e(String str, int i, int i2, int i3, int i4) {
        this.b.d(str, i, i2, e(new e(i3, i4)));
    }

    @Override // o.InterfaceC5127bsr
    public void d(LoMo loMo, int i, int i2, boolean z, boolean z2, int i3, int i4) {
        this.b.e(loMo, i, i2, z, e(new e(i3, i4)), "FalkorAccess");
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, int i, int i2, boolean z, boolean z2, int i3, int i4) {
        this.b.e(str, i, i2, z, z2, new e(i3, i4));
    }

    @Override // o.InterfaceC5127bsr
    public void a(LoMo loMo, int i, int i2, int i3, int i4) {
        this.b.b(loMo, i, i2, e(new e(i3, i4)));
    }

    @Override // o.InterfaceC5127bsr
    public void e(String str, TaskMode taskMode, int i, int i2, int i3, int i4) {
        this.b.e(str, taskMode, i, i2, e(new e(i3, i4)));
    }

    @Override // o.InterfaceC5127bsr
    public void d(String str, TaskMode taskMode, int i, int i2) {
        this.b.c(str, taskMode, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void d(int i, int i2, String str, int i3, int i4, String str2) {
        this.b.e(i, i2, str, e(new e(i3, i4)), str2);
    }

    @Override // o.InterfaceC5127bsr
    public void b(String str, VideoType videoType, PlayLocationType playLocationType, int i, int i2) {
        this.b.e(str, videoType, playLocationType, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void a(String str, String str2, int i, int i2) {
        this.b.e(str, str2, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void d(int i, int i2, String str, LoMo loMo, int i3, int i4) {
        this.b.a(i, i2, str, loMo, e(new e(i3, i4)));
    }

    @Override // o.InterfaceC5127bsr
    public void d(String str, int i, int i2) {
        this.b.d(str, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void a(String str, int i, int i2) {
        this.b.c(str, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, int i, int i2) {
        this.b.e(str, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void b(String str, String str2, boolean z, TaskMode taskMode, int i, int i2, String str3, Boolean bool) {
        this.b.e(str, str2, z, taskMode, e(new e(i, i2)), str3, bool);
    }

    @Override // o.InterfaceC5127bsr
    public void a(String str, String str2, boolean z, int i, int i2, String str3) {
        this.b.c(str, str2, z, TaskMode.FROM_CACHE_OR_NETWORK, e(new e(i, i2)), str3);
    }

    @Override // o.InterfaceC5127bsr
    public void a(VideoType videoType, String str, String str2, int i, int i2) {
        this.b.b(videoType, str, str2, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, String str2, int i, int i2, String str3) {
        this.b.e(str, str2, TaskMode.FROM_CACHE_OR_NETWORK, e(new e(i, i2)), str3);
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, String str2, boolean z, TaskMode taskMode, int i, int i2, String str3, Boolean bool) {
        this.b.b(str, str2, z, taskMode, e(new e(i, i2)), str3, bool);
    }

    @Override // o.InterfaceC5127bsr
    public void e(String str, TaskMode taskMode, int i, int i2) {
        this.b.e(str, taskMode, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, int i, int i2, int i3, int i4) {
        this.b.a(str, i, i2, e(new e(i3, i4)));
    }

    @Override // o.InterfaceC5127bsr
    public void b(String str, VideoType videoType, int i, int i2, int i3, int i4) {
        this.b.b(str, videoType, i, i2, e(new e(i3, i4)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, VideoType videoType, int i, String str2, String str3, int i2, int i3) {
        this.b.c(str, videoType, i, str2, str3, e(new e(i2, i3)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, VideoType videoType, String str2, String str3, int i, int i2) {
        this.b.c(str, videoType, str2, str3, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map) {
        this.b.b(interfaceC5223buh, billboardInteractionType, map);
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, TaskMode taskMode, boolean z, int i, int i2) {
        this.b.e(str, taskMode, z, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void b() {
        this.b.d(true);
    }

    @Override // o.InterfaceC5127bsr
    public void a(boolean z, String str) {
        this.b.d(z, str);
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, String str2, String str3, String str4) {
        this.b.e(str, str2, str3, str4);
    }

    @Override // o.InterfaceC5127bsr
    public void c() {
        this.b.a();
    }

    @Override // o.InterfaceC5127bsr
    @Deprecated
    public String d() {
        return this.b.b();
    }

    @Override // o.InterfaceC5127bsr
    public void a(String str, VideoType videoType) {
        this.b.e(str, videoType);
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, long j) {
        this.b.e(str, j);
    }

    @Override // o.InterfaceC5127bsr
    public void a(int i, int i2) {
        this.b.a(e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void c(String str, boolean z, int i, int i2) {
        this.b.d(str, z, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void a(boolean z, boolean z2, boolean z3, MessageData messageData) {
        this.b.e(z, z2, z3, messageData);
    }

    @Override // o.InterfaceC5127bsr
    public void e(String str, int i, int i2) {
        this.b.a(str, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void e(List<String> list, int i, int i2) {
        this.b.e(list, e(new e(i, i2)));
    }

    @Override // o.InterfaceC5127bsr
    public void b(String str, int i, int i2) {
        this.b.b(str, new e(i, i2));
    }

    private InterfaceC1757aNc e(InterfaceC1757aNc interfaceC1757aNc) {
        return new C1756aNb(interfaceC1757aNc);
    }

    /* loaded from: classes3.dex */
    class e implements InterfaceC1757aNc {
        private final int d;
        private final int e;

        @Override // o.InterfaceC1757aNc
        public void e(Map<String, Boolean> map, Status status) {
        }

        e(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        @Override // o.InterfaceC1757aNc
        public void h(List<LoMo> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onLoMosFetched");
            } else {
                interfaceC5133bsx.onLoMosFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void k(List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onVideosFetched");
            } else {
                interfaceC5133bsx.onVideosFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void n(List<InterfaceC5222bug<InterfaceC5216bua>> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onTallPanelVideosFetched");
            } else {
                interfaceC5133bsx.onTallPanelVideosFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void d(ListOfMoviesSummary listOfMoviesSummary, List<InterfaceC5222bug<InterfaceC5223buh>> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onFlatGenreVideosFetched");
            } else {
                interfaceC5133bsx.onFlatGenreVideosFetched(this.e, listOfMoviesSummary, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void e(InterfaceC5156btT interfaceC5156btT, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onLoLoMoSummaryFetched");
            } else {
                interfaceC5133bsx.onLoLoMoSummaryFetched(this.e, interfaceC5156btT, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void d(InterfaceC5188btz interfaceC5188btz, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onVideoSummaryFetched");
            } else {
                interfaceC5133bsx.onVideoSummaryFetched(this.e, interfaceC5188btz, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void d(InterfaceC8366diy interfaceC8366diy, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onFalkorVideoFetched");
            } else {
                interfaceC5133bsx.onFalkorVideoFetched(this.e, interfaceC8366diy, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void a(InterfaceC5238buw interfaceC5238buw, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onMovieDetailsFetched");
            } else {
                interfaceC5133bsx.onMovieDetailsFetched(this.e, interfaceC5238buw, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(InterfaceC5230buo interfaceC5230buo, Boolean bool, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onKidsCharacterDetailsFetched");
            } else {
                interfaceC5133bsx.onKidsCharacterDetailsFetched(this.e, interfaceC5230buo, bool, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void a(InterfaceC5227bul interfaceC5227bul, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onEpisodeDetailsFetched");
            } else {
                interfaceC5133bsx.onEpisodeDetailsFetched(this.e, interfaceC5227bul, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void d(List<InterfaceC5222bug<InterfaceC5179btq>> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onCWVideosFetched");
            } else {
                interfaceC5133bsx.onCWVideosFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void a(List<InterfaceC5222bug<InterfaceC5180btr>> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for oBBVideosFetched");
            } else {
                interfaceC5133bsx.onBBVideosFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(InterfaceC5190buA interfaceC5190buA, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onPostPlayVideosFetched");
            } else {
                interfaceC5133bsx.onPostPlayVideosFetched(this.e, interfaceC5190buA, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(List<InterfaceC5227bul> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onEpisodesFetched");
            } else {
                interfaceC5133bsx.onEpisodesFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void i(List<InterfaceC5195buF> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onSeasonsFetched");
            } else {
                interfaceC5133bsx.onSeasonsFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void c(InterfaceC5194buE interfaceC5194buE, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onShowDetailsFetched");
            } else {
                interfaceC5133bsx.onShowDetailsFetched(this.e, interfaceC5194buE, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void e(InterfaceC5194buE interfaceC5194buE, List<InterfaceC5195buF> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onShowDetailsAndSeasonsFetched");
            } else {
                interfaceC5133bsx.onShowDetailsAndSeasonsFetched(this.e, interfaceC5194buE, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void j(List<GenreItem> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onGenreListsFetched");
            } else {
                interfaceC5133bsx.onGenreListsFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(InterfaceC5157btU interfaceC5157btU, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onVideoRatingSet");
            } else {
                interfaceC5133bsx.onVideoRatingSet(this.e, interfaceC5157btU, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void e(Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onQueueAdd");
            } else {
                interfaceC5133bsx.onQueueAdd(this.e, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onQueueRemove");
            } else {
                interfaceC5133bsx.onQueueRemove(this.e, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void a(InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onSearchResultsFetched");
            } else {
                interfaceC5133bsx.onSearchResultsFetched(this.e, interfaceC5275bvg, status, z);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void c(NotificationsListSummary notificationsListSummary, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onNotificationsListFetched");
            } else {
                interfaceC5133bsx.onNotificationsListFetched(this.e, notificationsListSummary, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void e(NotificationSummaryItem notificationSummaryItem, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onNotificationSummaryFetched");
            } else {
                interfaceC5133bsx.onNotificationSummaryFetched(this.e, notificationSummaryItem, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void g(List<NotificationSummaryItem> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.a("FalkorAccess", "onNotificationsMarkedAsRead: " + status);
                return;
            }
            interfaceC5133bsx.onNotificationsMarkedAsRead(this.e, list, status);
        }

        @Override // o.InterfaceC1757aNc
        public void b(int i, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onScenePositionFetched");
            } else {
                interfaceC5133bsx.onScenePositionFetched(this.e, i, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void e(List<Advisory> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onAdvisoriesFetched");
            } else {
                interfaceC5133bsx.onAdvisoriesFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void l(List<InterfaceC8366diy> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onTrailersFetched");
            } else {
                interfaceC5133bsx.onSimsFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(InteractiveMoments interactiveMoments, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onInteractiveMomentsFetched");
            } else {
                interfaceC5133bsx.onInteractiveMomentsFetched(this.e, interactiveMoments, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void f(List<InteractiveDebugMenuItem> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onInteractiveMomentsFetched");
            } else {
                interfaceC5133bsx.onInteractiveDebugMenuItemsFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void b(StateHistory stateHistory, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onInteractiveMomentsFetched");
            } else {
                interfaceC5133bsx.onInteractiveResetStateFetched(this.e, stateHistory, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void c(List<InterfaceC5184btv> list, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onDownloadedForYouFetched");
            } else {
                interfaceC5133bsx.onDownloadedForYouFetched(this.e, list, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void a(boolean z, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onBooleanResponse");
            } else {
                interfaceC5133bsx.onBooleanResponse(this.e, z, status);
            }
        }

        @Override // o.InterfaceC1757aNc
        public void a(InterfaceC5198buI interfaceC5198buI, Status status) {
            InterfaceC5133bsx interfaceC5133bsx = aSA.this.e.get(this.d);
            if (interfaceC5133bsx == null) {
                C1044Mm.j("FalkorAccess", "No client callback found for onVideoSharingInfoFetched");
            } else {
                interfaceC5133bsx.onVideoSharingInfoFetched(this.e, interfaceC5198buI, status);
            }
        }
    }

    @Override // o.InterfaceC5127bsr
    public void e(String str, VideoType videoType) {
        this.b.c(str, videoType);
    }

    @Override // o.InterfaceC5127bsr
    public InterfaceC1240Ub<?> a() {
        return this.b.i();
    }
}
