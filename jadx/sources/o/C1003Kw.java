package o;

import android.util.Pair;
import com.google.gson.JsonObject;
import com.netflix.android.volley.VolleyError;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Kw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1003Kw extends IT {
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private final String l;
    private VideoType m;

    /* renamed from: o  reason: collision with root package name */
    private final String f13365o;

    @Override // o.IT
    protected boolean a() {
        return true;
    }

    public C1003Kw(C0954Iz<?> c0954Iz, String str, VideoType videoType, String str2, String str3, InterfaceC1757aNc interfaceC1757aNc) {
        super("RemoveFromQueue", c0954Iz, interfaceC1757aNc);
        this.l = str;
        this.m = videoType;
        this.i = str2;
        this.f13365o = str3;
        this.g = videoType == VideoType.GAMES ? "games" : SignupConstants.Field.VIDEOS;
    }

    @Override // o.IT
    protected void e() {
        if (this.i == null) {
            this.i = this.d.j();
        }
        Pair<String, String> c = this.d.c(LoMoType.INSTANT_QUEUE, this.i);
        String str = (String) c.first;
        this.f = str;
        this.h = (String) c.second;
        this.j = C8168dfL.h(str) && C8168dfL.h(this.i);
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        if (this.j) {
            list.add(IE.b("lolomos", this.i, "remove"));
        } else {
            list.add(IE.b(this.g, this.l, "removeFromQueue"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(8);
        if (this.j) {
            arrayList.add(new C8143den.d("param", this.h));
            arrayList.add(new C8143den.d("param", this.l));
        }
        if (C8168dfL.h(this.f13365o)) {
            arrayList.add(new C8143den.d("signature", this.f13365o));
        }
        return arrayList;
    }

    @Override // o.IT
    protected VolleyError a(JsonObject jsonObject) {
        String d = C0946Ir.d(jsonObject, "RemoveFromQueueTask");
        if (C0946Ir.d(d)) {
            return new StatusCodeError(StatusCode.NOT_IN_QUEUE);
        }
        return new FalkorException(d);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C1044Mm.b("RemoveFromQueueTask", "Remove from queue was successful");
        if (this.j) {
            this.d.c(IE.b("lists", this.f));
        }
        InterfaceC4004bSr.b(j(), LoMoType.INSTANT_QUEUE.a(), this.i, null, null);
        if (!C8153dex.ab()) {
            C0987Kg.e.a(j()).d(this.l, this.m);
        }
        interfaceC1757aNc.b(InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.b(status);
    }
}
