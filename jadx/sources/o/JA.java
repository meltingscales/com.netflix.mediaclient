package o;

import android.text.TextUtils;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public class JA extends IT {
    private String f;
    private final int g;
    private final int i;
    private final int j;

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return true;
    }

    public JA(C0954Iz<?> c0954Iz, String str, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchLoMos", c0954Iz, interfaceC1757aNc);
        this.f = str;
        this.i = i;
        this.g = i2;
        this.j = aMH.c().a(j(), LoMoType.STANDARD) - 1;
    }

    @Override // o.IT
    protected void t() {
        m().b(UiLatencyMarker.Mark.LOMOS_CACHE_START);
    }

    @Override // o.IT
    protected void e(Boolean bool) {
        m().b(UiLatencyMarker.Mark.LOMOS_CACHE_END);
        if (bool.booleanValue()) {
            m().b(UiLatencyMarker.Mark.LOMOS_PROCESSING_START);
        }
    }

    @Override // o.IT
    protected void p() {
        m().b(UiLatencyMarker.Mark.LOMOS_NETWORK_START);
    }

    @Override // o.IT
    protected void r() {
        m().b(UiLatencyMarker.Mark.LOMOS_NETWORK_END);
        m().b(UiLatencyMarker.Mark.LOMOS_PROCESSING_START);
    }

    @Override // o.IT
    protected void w() {
        m().b(UiLatencyMarker.Mark.LOMOS_PROCESSING_END);
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        InterfaceC1242Ud b;
        if (this.f == null) {
            this.f = this.d.j();
        }
        if (TextUtils.isEmpty(this.f)) {
            InterfaceC1597aHe.b(new C1596aHd("FetchLoMosTask has no lolomoId while GraphQL enabled").b(ErrorType.m).e(true));
            return;
        }
        if (TextUtils.isEmpty(this.f)) {
            list.add(IE.b("lolomo", "summary"));
        }
        if (C8168dfL.g(this.f)) {
            b = IE.b("lolomo", IE.a(this.i, this.g));
        } else {
            b = IE.b("lolomos", this.f, IE.a(this.i, this.g));
        }
        list.add(b.c("summary"));
        list.add(b.d(IE.b(IE.a(this.j), "listItem", "summary")));
        list.add(b.d(IE.b(IE.a(this.j), "itemEvidence")));
        if (C8153dex.b()) {
            list.add(b.d(IE.b(IE.a(this.j), "listItem", "volatileBitmaskedDetails")));
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.h(this.d.c(this.i, c1244Uf.e), InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.h(Collections.emptyList(), status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        if (C8171dfO.b()) {
            arrayList.add(new C8143den.d("includeBookmark", Boolean.TRUE.toString()));
        }
        if (C8153dex.g()) {
            arrayList.add(new C8143den.d("disableBillboard", Boolean.TRUE.toString()));
        }
        if (C8153dex.r()) {
            arrayList.add(new C8143den.d("enableDownloadsForYouRow", Boolean.TRUE.toString()));
        }
        if (C8153dex.k()) {
            arrayList.add(new C8143den.d("enableCategoryCraversRow", Boolean.TRUE.toString()));
        }
        if (C8153dex.o()) {
            arrayList.add(new C8143den.d("enableCpeRow", Boolean.TRUE.toString()));
        }
        if (C8153dex.d() && ConfigFastPropertyFeatureControlConfig.Companion.A()) {
            arrayList.add(new C8143den.d("enableVideoInGames", Boolean.TRUE.toString()));
        }
        if (C1857aQv.b.b().a()) {
            arrayList.add(new C8143den.d("enableMostThumbedRow", Boolean.TRUE.toString()));
        }
        if (aQC.h()) {
            if (!aQC.j().a()) {
                arrayList.add(new C8143den.d("enableGamesBillboardInHome", Boolean.TRUE.toString()));
            } else {
                arrayList.add(new C8143den.d("enableGamesFeatureEducationInHome", Boolean.TRUE.toString()));
            }
        }
        if (C8153dex.s()) {
            arrayList.add(new C8143den.d("enableGameIdentityRow", Boolean.TRUE.toString()));
        }
        return arrayList;
    }
}
