package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.media.BookmarkStore;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: o.Je  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0959Je extends IV {
    private InterfaceC1242Ud f;
    private final int g;
    private final String h;
    private final String i;
    private TaskMode j;
    private final int l;

    public C0959Je(C0954Iz<?> c0954Iz, IG ig, int i, int i2, String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str2) {
        super("FetchCwVideos", c0954Iz, ig, interfaceC1757aNc);
        this.f = null;
        this.h = str;
        this.g = i;
        this.l = i2;
        this.j = taskMode;
        this.i = str2;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        String j = this.d.j();
        if (C8168dfL.g(j) && C8168dfL.g(this.h)) {
            InterfaceC1593aHa.b("FetchCwVideosTask with null lolomoId while GraphQL enabled " + this.i);
            return;
        }
        this.f = C0956Jb.b(LoMoType.CONTINUE_WATCHING.a(), this.h, j, null);
        if (this.j == TaskMode.FROM_CACHE_OR_NETWORK && C8168dfL.g(this.h)) {
            this.j = TaskMode.FROM_NETWORK;
        }
        C0956Jb.e(list, this.f, this.g, this.l, true, C8153dex.b());
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        Objects.requireNonNull(this.f);
        List<InterfaceC5179btq> c = this.d.c(this.f.d(IE.b(IE.a(this.g, this.l), "listItem", "summary")));
        try {
            interfaceC1757aNc.d(VideoEntityModelImplKt.videosToEntitiesFromJava(c, this.g), FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
            a(C(), c);
        } catch (ClassCastException e) {
            InterfaceC1593aHa.b("cw fetch source " + this.i);
            InterfaceC1593aHa.b("cwVideos=" + c);
            throw e;
        }
    }

    public void a(BookmarkStore bookmarkStore, List<InterfaceC5179btq> list) {
        bookmarkStore.onPlayablesFetched(list, A());
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.d(Collections.emptyList(), status);
    }

    @Override // o.IT
    protected boolean y() {
        return this.j == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.j == TaskMode.FROM_NETWORK;
    }
}
