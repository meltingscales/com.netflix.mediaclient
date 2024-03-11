package o;

import com.netflix.android.org.json.HTTP;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.C1498aDn;
import o.C1503aDs;
import o.InterfaceC9001hO;
import o.dIq;
import o.dIw;
import okio.ByteString;

/* renamed from: o.aDs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1503aDs implements InterfaceC9002hP {
    private final String a;
    private final ByteString b;
    private final InterfaceC8554dpx c;
    private final String d;
    private final Map<String, InterfaceC9001hO> e;

    @Override // o.InterfaceC9002hP
    public String a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1503aDs(Map<String, ? extends InterfaceC9001hO> map, ByteString byteString) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) byteString, "");
        this.e = map;
        this.b = byteString;
        UUID randomUUID = UUID.randomUUID();
        C8632dsu.a(randomUUID, "");
        String uuid = randomUUID.toString();
        C8632dsu.a(uuid, "");
        this.d = uuid;
        this.a = "multipart/form-data; boundary=" + uuid;
        b = dpB.b(new drO<Long>() { // from class: com.netflix.mediaclient.graphqlrepo.impl.client.request.UploadsHttpBody$contentLength$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Long invoke() {
                Map map2;
                C1498aDn c1498aDn = new C1498aDn(dIw.a());
                dIq b2 = dIw.b(c1498aDn);
                C1503aDs.this.e(b2, false);
                b2.flush();
                long d = c1498aDn.d();
                map2 = C1503aDs.this.e;
                long j = 0;
                for (InterfaceC9001hO interfaceC9001hO : map2.values()) {
                    j += interfaceC9001hO.c();
                }
                return Long.valueOf(d + j);
            }
        });
        this.c = b;
    }

    @Override // o.InterfaceC9002hP
    public long e() {
        return ((Number) this.c.getValue()).longValue();
    }

    @Override // o.InterfaceC9002hP
    public void d(dIq diq) {
        C8632dsu.c((Object) diq, "");
        e(diq, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(dIq diq, boolean z) {
        String str = this.d;
        diq.b("--" + str + HTTP.CRLF);
        diq.b("Content-Disposition: form-data; name=\"operations\"\r\n");
        diq.b("Content-Type: application/json\r\n");
        int k = this.b.k();
        diq.b("Content-Length: " + k + HTTP.CRLF);
        diq.b(HTTP.CRLF);
        diq.b(this.b);
        ByteString d = d(this.e);
        String str2 = this.d;
        diq.b("\r\n--" + str2 + HTTP.CRLF);
        diq.b("Content-Disposition: form-data; name=\"map\"\r\n");
        diq.b("Content-Type: application/json\r\n");
        int k2 = d.k();
        diq.b("Content-Length: " + k2 + HTTP.CRLF);
        diq.b(HTTP.CRLF);
        diq.b(d);
        int i = 0;
        for (Object obj : this.e.values()) {
            if (i < 0) {
                C8569dql.h();
            }
            InterfaceC9001hO interfaceC9001hO = (InterfaceC9001hO) obj;
            String str3 = this.d;
            diq.b("\r\n--" + str3 + HTTP.CRLF);
            diq.b("Content-Disposition: form-data; name=\"" + i + "\"");
            if (interfaceC9001hO.d() != null) {
                String d2 = interfaceC9001hO.d();
                diq.b("; filename=\"" + d2 + "\"");
            }
            diq.b(HTTP.CRLF);
            String b = interfaceC9001hO.b();
            diq.b("Content-Type: " + b + HTTP.CRLF);
            long c = interfaceC9001hO.c();
            if (c != -1) {
                diq.b("Content-Length: " + c + HTTP.CRLF);
            }
            diq.b(HTTP.CRLF);
            if (z) {
                interfaceC9001hO.a(diq);
            }
            i++;
        }
        String str4 = this.d;
        diq.b("\r\n--" + str4 + "--\r\n");
    }

    private final ByteString d(Map<String, ? extends InterfaceC9001hO> map) {
        int d;
        Map d2;
        List e;
        C7872dIo c7872dIo = new C7872dIo();
        C9072ig c9072ig = new C9072ig(c7872dIo, null);
        Set<Map.Entry<String, ? extends InterfaceC9001hO>> entrySet = map.entrySet();
        d = C8572dqo.d(entrySet, 10);
        ArrayList arrayList = new ArrayList(d);
        int i = 0;
        for (Object obj : entrySet) {
            if (i < 0) {
                C8569dql.h();
            }
            String valueOf = String.valueOf(i);
            e = C8566dqi.e(((Map.Entry) obj).getKey());
            arrayList.add(dpD.a(valueOf, e));
            i++;
        }
        d2 = dqE.d(arrayList);
        C9012hZ.c(c9072ig, d2);
        return c7872dIo.r();
    }
}
