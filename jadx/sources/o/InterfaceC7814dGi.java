package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: o.dGi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7814dGi {
    public static final b c = new b(null);
    public static final InterfaceC7814dGi a = new b.d();

    List<InetAddress> a(String str);

    /* renamed from: o.dGi$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.dGi$b$d */
        /* loaded from: classes5.dex */
        static final class d implements InterfaceC7814dGi {
            @Override // o.InterfaceC7814dGi
            public List<InetAddress> a(String str) {
                List<InetAddress> D;
                C8632dsu.d((Object) str, "");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C8632dsu.b(allByName, "");
                    D = C8563dqf.D(allByName);
                    return D;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }
}
