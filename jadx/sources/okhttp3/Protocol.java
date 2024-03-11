package okhttp3;

import java.io.IOException;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final c b = new c(null);
    private final String i;

    @Override // java.lang.Enum
    public String toString() {
        return this.i;
    }

    Protocol(String str) {
        this.i = str;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final Protocol b(String str) {
            C8632dsu.d((Object) str, "");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!C8632dsu.c((Object) str, (Object) protocol.i)) {
                protocol = Protocol.HTTP_1_1;
                if (!C8632dsu.c((Object) str, (Object) protocol.i)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C8632dsu.c((Object) str, (Object) protocol.i)) {
                        protocol = Protocol.HTTP_2;
                        if (!C8632dsu.c((Object) str, (Object) protocol.i)) {
                            protocol = Protocol.SPDY_3;
                            if (!C8632dsu.c((Object) str, (Object) protocol.i)) {
                                protocol = Protocol.QUIC;
                                if (!C8632dsu.c((Object) str, (Object) protocol.i)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }
}
