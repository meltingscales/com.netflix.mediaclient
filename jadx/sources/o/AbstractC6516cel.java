package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6516cel;
import o.C8632dsu;
import o.InterfaceC5176btn;
import o.dpR;

/* renamed from: o.cel  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6516cel extends AbstractC3336ax<e> {
    private Integer b;
    private boolean c = true;
    private VideoType d = VideoType.UNKNOWN;
    private TrackingInfoHolder i;
    private String j;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.F;
    }

    public final void a(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.d = videoType;
    }

    public final void a(Integer num) {
        this.b = num;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void c(boolean z) {
        this.c = z;
    }

    public final void e(TrackingInfoHolder trackingInfoHolder) {
        this.i = trackingInfoHolder;
    }

    public final Integer i() {
        return this.b;
    }

    public final VideoType k() {
        return this.d;
    }

    public final String l() {
        return this.j;
    }

    public final boolean n() {
        return this.c;
    }

    public final TrackingInfoHolder o() {
        return this.i;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(final e eVar) {
        C8632dsu.c((Object) eVar, "");
        C9726vo.d(this.j, C9737vz.b(eVar.b().getContext(), NetflixActivity.class), new drX<String, NetflixActivity, dpR>() { // from class: com.netflix.mediaclient.ui.lomo.cwmenu.CwDialogDownloadRowModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* loaded from: classes4.dex */
            public static final class b implements InterfaceC5176btn {
                final /* synthetic */ String a;
                final /* synthetic */ AbstractC6516cel d;

                @Override // o.InterfaceC5176btn
                public String aH_() {
                    return this.a;
                }

                @Override // o.InterfaceC5176btn
                public boolean d() {
                    return true;
                }

                b(String str, AbstractC6516cel abstractC6516cel) {
                    this.a = str;
                    this.d = abstractC6516cel;
                }

                @Override // o.InterfaceC5176btn
                public boolean aY_() {
                    return this.d.k() == VideoType.EPISODE;
                }

                @Override // o.InterfaceC5176btn
                public boolean isPlayable() {
                    return this.d.n();
                }
            }

            @Override // o.drX
            /* renamed from: c */
            public final dpR invoke(String str, NetflixActivity netflixActivity) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) netflixActivity, "");
                AbstractC6516cel.e.this.b().setStateFromPlayable(new b(str, this), netflixActivity);
                TrackingInfoHolder o2 = this.o();
                if (o2 != null) {
                    AbstractC6516cel.e.this.b().setPlayContext(TrackingInfoHolder.b(o2, PlayLocationType.VIDEO_VIEW, false, 2, null));
                }
                Integer i = this.i();
                if (i != null) {
                    AbstractC6516cel.e eVar2 = AbstractC6516cel.e.this;
                    eVar2.b().setDefaultLabelId(i.intValue());
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* renamed from: o.cel$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(e.class, "downloadButton", "getDownloadButton()Lcom/netflix/mediaclient/ui/offline/DownloadButton;", 0))};
        public static final int d = 8;
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.bd, false, 2, null);

        public final DownloadButton b() {
            return (DownloadButton) this.c.getValue(this, a[0]);
        }
    }
}
