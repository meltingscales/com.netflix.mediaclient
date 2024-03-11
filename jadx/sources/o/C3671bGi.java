package o;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.detailspage.api.DetailsPageParams;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag;
import javax.inject.Inject;

/* renamed from: o.bGi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3671bGi implements InterfaceC3661bGc {
    public static final b a = new b(null);
    private final bNH c;

    @Inject
    public C3671bGi(bNH bnh) {
        C8632dsu.c((Object) bnh, "");
        this.c = bnh;
    }

    /* renamed from: o.bGi$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("DetailsPageImpl");
        }
    }

    @Override // o.InterfaceC3661bGc
    public Fragment c(DetailsPageParams.FullDp fullDp) {
        C8632dsu.c((Object) fullDp, "");
        FullDpFrag.c cVar = FullDpFrag.e;
        String d = fullDp.d();
        VideoType b2 = fullDp.b();
        String c = fullDp.c();
        String i = fullDp.i();
        Long j = fullDp.j();
        Parcelable parcelable = fullDp.f().getParcelable(fullDp.g());
        TrackingInfoHolder trackingInfoHolder = parcelable instanceof TrackingInfoHolder ? (TrackingInfoHolder) parcelable : null;
        if (trackingInfoHolder != null) {
            return cVar.d(d, b2, c, i, j, trackingInfoHolder, fullDp.e(), fullDp.a());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
