package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.netflix.android.org.json.HTTP;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.C9000hN;
import o.C9010hX;
import o.InterfaceC9001hO;
import o.dIq;
import o.dIw;
import okio.ByteString;

/* renamed from: o.hX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9010hX implements InterfaceC9002hP {
    private final ByteString a;
    private final String b;
    private final String c;
    private final InterfaceC8554dpx d;
    private final Map<String, InterfaceC9001hO> e;

    @Override // o.InterfaceC9002hP
    public String a() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9010hX(Map<String, ? extends InterfaceC9001hO> map, ByteString byteString) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) byteString, "");
        this.e = map;
        this.a = byteString;
        UUID randomUUID = UUID.randomUUID();
        C8632dsu.a(randomUUID, "");
        String uuid = randomUUID.toString();
        C8632dsu.a(uuid, "");
        this.c = uuid;
        this.b = "multipart/form-data; boundary=" + uuid;
        b = dpB.b(new drO<Long>() { // from class: com.apollographql.apollo3.api.http.UploadsHttpBody$contentLength$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Long invoke() {
                Map map2;
                C9000hN c9000hN = new C9000hN(dIw.a());
                dIq b2 = dIw.b(c9000hN);
                C9010hX.this.e(b2, false);
                b2.flush();
                long c = c9000hN.c();
                map2 = C9010hX.this.e;
                long j = 0;
                for (InterfaceC9001hO interfaceC9001hO : map2.values()) {
                    j += interfaceC9001hO.c();
                }
                return Long.valueOf(c + j);
            }
        });
        this.d = b;
    }

    @Override // o.InterfaceC9002hP
    public long e() {
        return ((Number) this.d.getValue()).longValue();
    }

    @Override // o.InterfaceC9002hP
    public void d(dIq diq) {
        C8632dsu.c((Object) diq, "");
        e(diq, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(dIq diq, boolean z) {
        diq.b("--" + this.c + HTTP.CRLF);
        diq.b("Content-Disposition: form-data; name=\"operations\"\r\n");
        diq.b("Content-Type: application/json\r\n");
        diq.b("Content-Length: " + this.a.k() + HTTP.CRLF);
        diq.b(HTTP.CRLF);
        diq.b(this.a);
        ByteString e = e(this.e);
        diq.b("\r\n--" + this.c + HTTP.CRLF);
        diq.b("Content-Disposition: form-data; name=\"map\"\r\n");
        diq.b("Content-Type: application/json\r\n");
        diq.b("Content-Length: " + e.k() + HTTP.CRLF);
        diq.b(HTTP.CRLF);
        diq.b(e);
        int i = 0;
        for (Object obj : this.e.values()) {
            if (i < 0) {
                C8569dql.h();
            }
            InterfaceC9001hO interfaceC9001hO = (InterfaceC9001hO) obj;
            diq.b("\r\n--" + this.c + HTTP.CRLF);
            diq.b("Content-Disposition: form-data; name=\"" + i + JsonFactory.DEFAULT_QUOTE_CHAR);
            if (interfaceC9001hO.d() != null) {
                diq.b("; filename=\"" + interfaceC9001hO.d() + JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            diq.b(HTTP.CRLF);
            diq.b("Content-Type: " + interfaceC9001hO.b() + HTTP.CRLF);
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
        diq.b("\r\n--" + this.c + "--\r\n");
    }

    private final ByteString e(Map<String, ? extends InterfaceC9001hO> map) {
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
