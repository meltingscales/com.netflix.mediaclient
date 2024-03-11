package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public class JW extends IT {
    protected final int f;
    protected final LoMo g;
    private final String h;
    private final boolean i;
    protected final int j;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13362o;

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return true;
    }

    @Override // o.IT
    protected boolean y() {
        return this.f13362o;
    }

    public JW(C0954Iz<?> c0954Iz, LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        this("FetchVideos", c0954Iz, loMo, i, i2, z, z2, interfaceC1757aNc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JW(String str, C0954Iz<?> c0954Iz, LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        super(str, c0954Iz, interfaceC1757aNc);
        this.g = loMo;
        this.h = LoMoType.FLAT_GENRE == loMo.getType() ? C0956Jb.c(loMo.getId()) : loMo.getId();
        this.f = i;
        this.j = i2;
        this.f13362o = z;
        this.i = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public void d(List<InterfaceC1242Ud> list) {
        String str = LoMoType.FLAT_GENRE == this.g.getType() ? "flatCategories" : "lists";
        ArrayList arrayList = new ArrayList();
        arrayList.add("summary");
        int i = AnonymousClass5.d[LoMoType.e(this.g.getType()).ordinal()];
        if (i == 1) {
            b(arrayList, list, str);
        } else if (i == 2) {
            list.add(IE.b(str, this.h, "summary"));
        } else if (i == 3) {
            c(list, str);
        }
        list.add(IE.b(str, this.h, IE.a(this.f, this.j), "listItem", arrayList));
        list.add(IE.b(str, this.h, IE.a(this.f, this.j), "itemEvidence"));
        if (this.g.getType() == LoMoType.DOWNLOADS_FOR_YOU && this.f == 0) {
            list.add(IE.b(str, this.h, 0, "listItem", "horzBillboardArt"));
        }
        if (this.g.getType() == LoMoType.POPULAR_GAMES) {
            list.add(IE.b(str, this.h, IE.a(this.f, this.j), "listItem", "gameAssets"));
        }
        if (this.g.getType() == LoMoType.MOST_THUMBED) {
            list.add(IE.b(str, this.h, IE.a(this.f, this.j), "listItem", "percentThumbsUp"));
        }
    }

    /* renamed from: o.JW$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LoMoType.EntityType.values().length];
            d = iArr;
            try {
                iArr[LoMoType.EntityType.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[LoMoType.EntityType.FLAT_GENRES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[LoMoType.EntityType.GAMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[LoMoType.EntityType.CHARACTERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void c(List<InterfaceC1242Ud> list, String str) {
        InterfaceC1242Ud b = IE.b(str, this.h, IE.a(this.f, this.j));
        list.add(b.d(IE.b("listItem", "recommendedTrailer")));
        list.add(b.d(IE.b("listItem", "advisories")));
        list.add(b.d(IE.b("listItem", "gameAssets")));
    }

    private void b(List<String> list, List<InterfaceC1242Ud> list2, String str) {
        if (this.i) {
            list.add("detail");
            list.add("synopsisDP");
        }
        if (C8153dex.b()) {
            list.add("volatileBitmaskedDetails");
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        LoMoType loMoType = LoMoType.FLAT_GENRE;
        List<InterfaceC5222bug<InterfaceC5223buh>> listItemMapToEntityModels = VideoEntityModelImplKt.listItemMapToEntityModels(this.d, this.d.c(IE.b(loMoType == this.g.getType() ? "flatCategories" : "lists", this.h, IE.a(this.f, this.j))), this.f);
        if (this.g.getType() == loMoType) {
            interfaceC1757aNc.d((ListOfMoviesSummary) this.d.b(IE.b("flatCategories", this.h, "summary")), listItemMapToEntityModels, FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
        } else {
            interfaceC1757aNc.k(listItemMapToEntityModels, FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.k(VideoEntityModelImplKt.videosToEntitiesFromJava(Collections.emptyList(), this.f), status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        if (C8171dfO.b()) {
            arrayList.add(new C8143den.d("includeBookmark", Boolean.TRUE.toString()));
        }
        return arrayList;
    }
}
