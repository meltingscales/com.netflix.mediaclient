package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.net.InetAddress;
import java.net.URI;
import o.C9337ng;

/* renamed from: o.ne  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9335ne {
    static final JsonReader.d<URI> a = new JsonReader.d<URI>() { // from class: o.ne.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: b */
        public URI d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9335ne.b(jsonReader);
        }
    };
    static final C9337ng.a<URI> b = new C9337ng.a<URI>() { // from class: o.ne.4
        @Override // o.C9337ng.a
        /* renamed from: d */
        public void b(C9337ng c9337ng, URI uri) {
            AbstractC9335ne.a(uri, c9337ng);
        }
    };
    static final JsonReader.d<InetAddress> d = new JsonReader.d<InetAddress>() { // from class: o.ne.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public InetAddress d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9335ne.a(jsonReader);
        }
    };
    static final C9337ng.a<InetAddress> e = new C9337ng.a<InetAddress>() { // from class: o.ne.3
        @Override // o.C9337ng.a
        /* renamed from: a */
        public void b(C9337ng c9337ng, InetAddress inetAddress) {
            AbstractC9335ne.e(inetAddress, c9337ng);
        }
    };

    public static void a(URI uri, C9337ng c9337ng) {
        if (uri == null) {
            c9337ng.b();
        } else {
            d(uri, c9337ng);
        }
    }

    public static void d(URI uri, C9337ng c9337ng) {
        AbstractC9339ni.a(uri.toString(), c9337ng);
    }

    public static URI b(JsonReader jsonReader) {
        return URI.create(jsonReader.o());
    }

    public static void e(InetAddress inetAddress, C9337ng c9337ng) {
        if (inetAddress == null) {
            c9337ng.b();
        } else {
            d(inetAddress, c9337ng);
        }
    }

    public static void d(InetAddress inetAddress, C9337ng c9337ng) {
        c9337ng.b((byte) 34);
        c9337ng.c(inetAddress.getHostAddress());
        c9337ng.b((byte) 34);
    }

    public static InetAddress a(JsonReader jsonReader) {
        return InetAddress.getByName(jsonReader.n());
    }
}
