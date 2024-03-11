package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.model.leafs.ListOfMoviesSummaryImpl;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Jr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0972Jr extends IT {
    private final boolean f;
    protected final int g;
    private final boolean h;
    protected final int i;
    private final String j;

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return true;
    }

    @Override // o.IT
    protected boolean y() {
        return this.f;
    }

    public C0972Jr(C0954Iz<?> c0954Iz, String str, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchFlatGenreVideos", c0954Iz, interfaceC1757aNc);
        this.g = i;
        this.i = i2;
        this.f = z;
        this.h = z2;
        this.j = C0956Jb.c(str);
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b("flatCategories", this.j, "summary"));
        list.add(IE.b("flatCategories", this.j, IE.a(this.g, this.i), "listItem", "summary"));
        list.add(IE.b("flatCategories", this.j, IE.a(this.g, this.i), "itemEvidence"));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.d((ListOfMoviesSummaryImpl) this.d.b(IE.b("flatCategories", this.j, "summary")), VideoEntityModelImplKt.listItemMapToEntityModels(this.d, this.d.c(IE.b("flatCategories", this.j, IE.a(this.g, this.i))), this.g), FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.d(null, VideoEntityModelImplKt.videosToEntitiesFromJava(Collections.emptyList(), this.g), status);
    }
}
