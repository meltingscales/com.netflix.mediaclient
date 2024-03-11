package o;

import androidx.media3.datasource.DataSource;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixDataSourceUtil;

/* renamed from: o.bmc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4794bmc {
    private final C4668bip a;
    private final long b;
    private final DataSource c;
    private final boolean d;
    private final String e;
    private final C4761blb f;
    private final int g;
    private final long h;
    private final NetflixDataSourceUtil.DataSourceRequestType i;

    public final C4761blb a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final C4668bip c() {
        return this.a;
    }

    public final long d() {
        return this.h;
    }

    public final DataSource e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4794bmc) {
            C4794bmc c4794bmc = (C4794bmc) obj;
            return this.i == c4794bmc.i && this.g == c4794bmc.g && C8632dsu.c((Object) this.e, (Object) c4794bmc.e) && C8632dsu.c(this.a, c4794bmc.a) && this.d == c4794bmc.d && this.b == c4794bmc.b && this.h == c4794bmc.h && C8632dsu.c(this.c, c4794bmc.c) && C8632dsu.c(this.f, c4794bmc.f);
        }
        return false;
    }

    public final int h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((((this.i.hashCode() * 31) + Integer.hashCode(this.g)) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.h)) * 31) + this.c.hashCode()) * 31) + this.f.hashCode();
    }

    public final boolean j() {
        return this.d;
    }

    public String toString() {
        NetflixDataSourceUtil.DataSourceRequestType dataSourceRequestType = this.i;
        int i = this.g;
        String str = this.e;
        C4668bip c4668bip = this.a;
        boolean z = this.d;
        long j = this.b;
        long j2 = this.h;
        DataSource dataSource = this.c;
        C4761blb c4761blb = this.f;
        return "NetflixDataSourceCustomData(requestType=" + dataSourceRequestType + ", trackType=" + i + ", downloadableId=" + str + ", locationInfo=" + c4668bip + ", isLive=" + z + ", movieId=" + j + ", parentMovieId=" + j2 + ", networkStack=" + dataSource + ", sideChannelMsg=" + c4761blb + ")";
    }

    public C4794bmc(NetflixDataSourceUtil.DataSourceRequestType dataSourceRequestType, int i, String str, C4668bip c4668bip, boolean z, long j, long j2, DataSource dataSource, C4761blb c4761blb) {
        C8632dsu.c((Object) dataSourceRequestType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4668bip, "");
        C8632dsu.c((Object) dataSource, "");
        C8632dsu.c((Object) c4761blb, "");
        this.i = dataSourceRequestType;
        this.g = i;
        this.e = str;
        this.a = c4668bip;
        this.d = z;
        this.b = j;
        this.h = j2;
        this.c = dataSource;
        this.f = c4761blb;
    }
}
