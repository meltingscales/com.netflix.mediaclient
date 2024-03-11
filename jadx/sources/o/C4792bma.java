package o;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: o.bma  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4792bma implements DataSource {
    private final DataSource a;
    private final InterfaceC4662bij b;
    private Map<String, List<String>> c;
    private final C4761blb d;
    private DataSpec e = null;

    private static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "T" : "V" : "A";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4792bma(InterfaceC4662bij interfaceC4662bij, DataSource dataSource, C4761blb c4761blb) {
        this.b = interfaceC4662bij;
        this.a = dataSource;
        this.d = c4761blb;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        this.a.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        DataSpec b;
        String str;
        int i;
        String str2;
        C4792bma c4792bma;
        NetflixDataSourceUtil.DataSourceRequestType c = NetflixDataSourceUtil.c(dataSpec);
        String a = NetflixDataSourceUtil.a(dataSpec);
        int d = NetflixDataSourceUtil.d(dataSpec);
        if (c.equals(NetflixDataSourceUtil.DataSourceRequestType.Header)) {
            b = b(dataSpec, AleCryptoBouncyCastle.MAX_RANDOM_BYTES);
        } else {
            b = c.equals(NetflixDataSourceUtil.DataSourceRequestType.Subtitles) ? b(dataSpec, 131072) : dataSpec;
        }
        C4664bil c4664bil = new C4664bil(b.uri);
        C4668bip c2 = this.b.c(a, d, c4664bil);
        if (c2 != null) {
            Uri parse = Uri.parse(c2.m());
            if (c4664bil.j()) {
                Uri.Builder buildUpon = parse.buildUpon();
                String path = b.uri.getPath();
                if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                buildUpon.appendPath(path);
                parse = buildUpon.build();
                b = b.buildUpon().setKey(C4632biF.b(b(d), a, Long.valueOf(c4664bil.a()))).build();
            }
            i = d;
            str = "NetflixDataSource";
            b = b.buildUpon().setUri(parse).setCustomData(new C4794bmc(c, d, a, c2, c4664bil.j(), c4664bil.a(), c4664bil.d(), this.a, this.d)).build();
        } else {
            str = "NetflixDataSource";
            i = d;
            C1044Mm.e(str, "location not available for stream id %s", a);
        }
        if (c4664bil.e() != null) {
            str2 = str;
            c4792bma = this;
            if (!c4792bma.d.d()) {
                c4792bma.d.b(c4664bil.e());
            }
        } else {
            str2 = str;
            c4792bma = this;
        }
        Map<String, String> e = c4792bma.d.e();
        if (!e.isEmpty()) {
            b = b.withRequestHeaders(e);
        }
        C1044Mm.d(str2, "rewrote %s -> %s", dataSpec, b);
        c4792bma.e = b;
        try {
            long open = c4792bma.a.open(b);
            if (c4664bil.j()) {
                Map<String, List<String>> responseHeaders = c4792bma.a.getResponseHeaders();
                if (responseHeaders == null) {
                    responseHeaders = Collections.emptyMap();
                }
                c4792bma.c = c4792bma.d.b(i, c4664bil.h(), responseHeaders);
            }
            return open;
        } catch (Throwable th) {
            int i2 = i;
            if (c4664bil.j()) {
                Map<String, List<String>> responseHeaders2 = c4792bma.a.getResponseHeaders();
                if (responseHeaders2 == null) {
                    responseHeaders2 = Collections.emptyMap();
                }
                c4792bma.c = c4792bma.d.b(i2, c4664bil.h(), responseHeaders2);
            }
            throw th;
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        DataSpec dataSpec = this.e;
        return dataSpec != null ? dataSpec.uri : this.a.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.c = null;
        this.a.close();
        this.e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> map = this.c;
        if (map != null && !map.isEmpty()) {
            TreeMap treeMap = new TreeMap(this.a.getResponseHeaders());
            treeMap.putAll(this.c);
            return treeMap;
        }
        return this.a.getResponseHeaders();
    }

    private static DataSpec b(DataSpec dataSpec, int i) {
        return dataSpec.buildUpon().setFlags(dataSpec.flags | i).build();
    }
}
