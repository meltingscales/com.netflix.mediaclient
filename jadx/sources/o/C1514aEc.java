package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ContentAdvisoryIcon;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2337aeO;
import o.C2344aeV;
import o.InterfaceC5222bug;

/* renamed from: o.aEc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1514aEc implements InterfaceC5185btw, InterfaceC5222bug<InterfaceC5185btw> {
    private final String a;
    private final C2344aeV b;
    private final String c;
    private final String d;
    private final int e;

    @Override // o.InterfaceC5222bug
    /* renamed from: c */
    public InterfaceC5185btw getVideo() {
        return this;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.c;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.a;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return null;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        return this.e;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return true;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return true;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return true;
    }

    public C1514aEc(String str, int i, C2344aeV c2344aeV, String str2, String str3) {
        C8632dsu.c((Object) c2344aeV, "");
        this.d = str;
        this.e = i;
        this.b = c2344aeV;
        this.a = str2;
        this.c = str3;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: d */
    public InterfaceC5185btw mo3081getEntity() {
        return (InterfaceC5185btw) InterfaceC5222bug.a.d(this);
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.b.a());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.b.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.GAMES;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.b.b();
    }

    @Override // o.InterfaceC5185btw
    public String a() {
        Object x;
        List<C2344aeV.e> e = this.b.e();
        if (e != null) {
            x = C8576dqs.x(e);
            C2344aeV.e eVar = (C2344aeV.e) x;
            if (eVar != null) {
                return eVar.d();
            }
        }
        return null;
    }

    @Override // o.InterfaceC5185btw
    public String b() {
        C2337aeO.b d = this.b.d().d();
        if (d != null) {
            return d.c();
        }
        return null;
    }

    @Override // o.InterfaceC5185btw
    public List<Advisory> e() {
        ArrayList arrayList = new ArrayList();
        C2344aeV c2344aeV = this.b;
        ContentAdvisory d = c2344aeV != null ? d(c2344aeV) : null;
        if (d != null) {
            arrayList.add(d);
        }
        return arrayList;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: o.aEc$b */
    /* loaded from: classes3.dex */
    public static final class b implements ContentAdvisory {
        final /* synthetic */ C2337aeO.b e;

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getBroadcastDistributorName() {
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getBroadcastReleaseDate() {
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getCertSystemConfirmationId() {
            return null;
        }

        b(C2337aeO.b bVar) {
            this.e = bVar;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public AdvisoryBoard getAdvisoryBoard() {
            C2337aeO.b bVar = this.e;
            String e = bVar != null ? bVar.e() : null;
            if (e != null) {
                return AdvisoryBoard.getAdvisoryBoard(e);
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingId() {
            Integer b;
            C2337aeO.b bVar = this.e;
            if (bVar == null || (b = bVar.b()) == null) {
                return null;
            }
            return b.toString();
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingDescription() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.h();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingShortDescription() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.g();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingLevel() {
            Integer f;
            C2337aeO.b bVar = this.e;
            if (bVar == null || (f = bVar.f()) == null) {
                return null;
            }
            return f.toString();
        }

        @Override // com.netflix.model.leafs.advisory.RatingDetails
        public String getRatingValue() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.c();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.Advisory
        public Advisory.Type getType() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.Advisory
        public float getDuration() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.Advisory
        public float getDelay() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.Advisory
        public String getMessage() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.Advisory
        public String getSecondaryMessage() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.Advisory
        public JsonObject getData(JsonElement jsonElement) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public AdvisoryBoard getBoard() {
            return getAdvisoryBoard();
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getRatingIconLevel() {
            Integer f;
            C2337aeO.b bVar = this.e;
            if (bVar == null || (f = bVar.f()) == null) {
                return null;
            }
            return f.toString();
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getRatingIconValue() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.c();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getI18nRating() {
            C2337aeO.b bVar = this.e;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public String getI18nAdvisories() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        /* renamed from: o.aEc$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0089b implements ContentAdvisoryIcon {
            final /* synthetic */ C2337aeO.a a;

            C0089b(C2337aeO.a aVar) {
                this.a = aVar;
            }

            @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
            public String getText() {
                C2337aeO.a aVar = this.a;
                String e = aVar != null ? aVar.e() : null;
                return e == null ? "" : e;
            }

            @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
            public String getId() {
                Integer b;
                C2337aeO.a aVar = this.a;
                String num = (aVar == null || (b = aVar.b()) == null) ? null : b.toString();
                return num == null ? "" : num;
            }
        }

        @Override // com.netflix.model.leafs.advisory.ContentAdvisory
        public List<ContentAdvisoryIcon> getIcons() {
            List<C2337aeO.a> j;
            List<ContentAdvisoryIcon> n;
            C2337aeO.b bVar = this.e;
            if (bVar != null && (j = bVar.j()) != null) {
                ArrayList arrayList = new ArrayList();
                for (C2337aeO.a aVar : j) {
                    arrayList.add(new C0089b(aVar));
                }
                n = C8576dqs.n(arrayList);
                if (n != null) {
                    return n;
                }
            }
            return new ArrayList();
        }
    }

    private final ContentAdvisory d(C2344aeV c2344aeV) {
        return new b(c2344aeV.d().d());
    }
}
