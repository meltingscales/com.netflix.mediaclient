package o;

import android.content.Context;
import android.net.TrafficStats;
import com.netflix.mediaclient.service.logging.proxy.DnsResolverProbe$createLogblob$2;
import com.netflix.mediaclient.service.logging.proxy.DnsResolverProbe$createLogblob$4;
import com.netflix.mediaclient.service.logging.proxy.DnsResolverProbe$resolveHostname$2;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.ExtendedResolver;
import org.xbill.DNS.Record;
import org.xbill.DNS.TextParseException;

/* loaded from: classes3.dex */
public final class aVB {
    public static final d b = new d(null);
    private final Context e;

    public aVB(Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    public final Object c(InterfaceC8585dra<? super Logblob> interfaceC8585dra) {
        return dwY.b(new DnsResolverProbe$createLogblob$2(this, null), interfaceC8585dra);
    }

    public final Object a(List<? extends List<String>> list, List<String> list2, InterfaceC8585dra<? super C1991aVv> interfaceC8585dra) {
        return dwY.b(new DnsResolverProbe$createLogblob$4(this, list, list2, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(List<String> list, String str, InterfaceC8585dra<? super aVA> interfaceC8585dra) {
        return dwY.b(new DnsResolverProbe$resolveHostname$2(list, this, str, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aVA b(ExtendedResolver extendedResolver, String str, int i) {
        boolean z;
        try {
            TrafficStats.setThreadStatsTag(0);
            C1994aVy c1994aVy = new C1994aVy(str, i, 1);
            c1994aVy.d(extendedResolver);
            c1994aVy.j();
            if (c1994aVy.h() == 0) {
                Record[] a = c1994aVy.a();
                C8632dsu.a(a, "");
                ArrayList arrayList = new ArrayList(a.length);
                for (Record record : a) {
                    arrayList.add(record.rdataToString());
                }
                Record[] a2 = c1994aVy.a();
                C8632dsu.a(a2, "");
                int length = a2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    Record record2 = a2[i2];
                    if (c1994aVy.c().length > 1) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                aVA ava = new aVA(null, arrayList, z, 1, null);
                TrafficStats.clearThreadStatsTag();
                return ava;
            }
            aVA ava2 = new aVA(c1994aVy.g(), null, false, 6, null);
            TrafficStats.clearThreadStatsTag();
            return ava2;
        } catch (UnknownHostException | TextParseException unused) {
            TrafficStats.clearThreadStatsTag();
            return new aVA("unknown", null, false, 6, null);
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DnsResolverProbe");
        }
    }
}
