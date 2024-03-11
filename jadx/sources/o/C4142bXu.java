package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.transformers.GraphQLLolomoGenreItem;
import o.C2389afN;
import o.C2454agQ;
import o.InterfaceC5222bug;

/* renamed from: o.bXu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4142bXu implements InterfaceC5223buh, InterfaceC5222bug<C4142bXu>, InterfaceC5143btG {
    private final C2454agQ.d a;
    private final C2389afN.d b;

    @Override // o.InterfaceC5222bug
    /* renamed from: c */
    public C4142bXu getVideo() {
        return this;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return null;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return false;
    }

    public C4142bXu(C2454agQ.d dVar, C2389afN.d dVar2) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) dVar2, "");
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: d */
    public C4142bXu mo3081getEntity() {
        return (C4142bXu) InterfaceC5222bug.a.d(this);
    }

    private final C2405afd e() {
        C2389afN.b e;
        C2389afN.a d = this.b.d();
        if (d == null || (e = d.e()) == null) {
            return null;
        }
        return e.e();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        String num;
        C2405afd e = e();
        return (e == null || (num = Integer.valueOf(e.b()).toString()) == null) ? "" : num;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        C2405afd e = e();
        if (e != null) {
            return e.e();
        }
        return null;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.CATEGORY;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        C2405afd e = e();
        if (e != null) {
            return e.c();
        }
        return null;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        Integer b = this.a.b();
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        String c = this.a.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5143btG
    public GenreItem a() {
        C2405afd e = e();
        if (e != null) {
            return new GraphQLLolomoGenreItem(e);
        }
        return null;
    }
}
