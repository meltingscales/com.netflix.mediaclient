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

/* loaded from: classes3.dex */
public class IR extends IV {
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private final String k;
    private final String l;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final VideoType f13357o;

    @Override // o.IT
    protected boolean a() {
        return true;
    }

    public IR(C0954Iz<?> c0954Iz, IG ig, String str, VideoType videoType, String str2, int i, String str3, InterfaceC1757aNc interfaceC1757aNc) {
        super("AddToQueue", c0954Iz, ig, interfaceC1757aNc);
        this.h = str2;
        this.n = str;
        this.f13357o = videoType;
        this.l = String.valueOf(i);
        this.k = str3;
        this.i = videoType == VideoType.GAMES ? "games" : SignupConstants.Field.VIDEOS;
    }

    @Override // o.IT
    protected void e() {
        if (this.h == null) {
            this.h = this.d.j();
        }
        Pair<String, String> c = this.d.c(LoMoType.INSTANT_QUEUE, this.h);
        String str = (String) c.first;
        this.g = str;
        this.f = (String) c.second;
        this.j = C8168dfL.h(str) && C8168dfL.h(this.h);
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        if (this.j) {
            list.add(IE.b("lolomos", this.h, "add"));
        } else {
            list.add(IE.b(this.i, this.n, "addToQueue"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(8);
        if (this.j) {
            arrayList.add(new C8143den.d("param", String.format("\"%s\"", this.g)));
            arrayList.add(new C8143den.d("param", this.f));
            arrayList.add(new C8143den.d("param", this.n));
            arrayList.add(new C8143den.d("param", this.l));
        } else {
            arrayList.add(new C8143den.d("param", this.l));
        }
        if (C8168dfL.h(this.k)) {
            arrayList.add(new C8143den.d("signature", this.k));
        }
        return arrayList;
    }

    @Override // o.IT
    protected VolleyError a(JsonObject jsonObject) {
        String d = C0946Ir.d(jsonObject, "AddToQueueTask");
        if (C0946Ir.c(d)) {
            C1044Mm.b("AddToQueueTask", "Video already in queue");
            return new StatusCodeError(StatusCode.ALREADY_IN_QUEUE);
        } else if (C0946Ir.b(d)) {
            C1044Mm.b("AddToQueueTask", "Add to Queue Request not valid");
            return new StatusCodeError(StatusCode.NOT_VALID);
        } else {
            return new FalkorException(d);
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C1044Mm.b("AddToQueueTask", "Add to queue was successful");
        if (this.j) {
            this.d.c(IE.b("lists", this.g));
        }
        InterfaceC4004bSr.b(j(), LoMoType.INSTANT_QUEUE.a(), this.h, null, null);
        if (!C8153dex.ab()) {
            C0987Kg.e.a(j()).d(this.n, this.f13357o);
        }
        interfaceC1757aNc.e(InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.e(status);
    }
}
