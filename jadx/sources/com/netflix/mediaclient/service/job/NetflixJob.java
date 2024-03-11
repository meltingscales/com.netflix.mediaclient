package com.netflix.mediaclient.service.job;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.util.ConnectivityUtils;
import o.C1044Mm;

/* loaded from: classes.dex */
public class NetflixJob {
    @SerializedName("minimumDelay")
    private long a;
    @SerializedName("value")
    private final int b;
    @SerializedName("isRepeating")
    private final boolean c;
    @SerializedName("repeatingPeriodMs")
    private final long d;
    private transient NetflixJobId e;
    @SerializedName("requiresBatteryNotLow")
    private final boolean g;
    @SerializedName("requiresIdle")
    private final boolean h;
    @SerializedName("requiresCharging")
    private final boolean i;
    @SerializedName("requiresUnmeteredNetwork")
    private final boolean j;

    public long d() {
        return this.a;
    }

    public boolean f() {
        return this.g;
    }

    public long g() {
        return this.d;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.c;
    }

    public boolean m() {
        return this.j;
    }

    public void b(long j) {
        if (this.c) {
            C1044Mm.d("nf_netflix_job", "Error, setting minimum delay on a repeating job.");
        } else {
            this.a = j;
        }
    }

    public static NetflixJob a() {
        return new NetflixJob(NetflixJobId.SMART_DOWNLOAD_RESUME, true, false, 0L, false, false, true);
    }

    /* loaded from: classes.dex */
    public enum NetflixJobId {
        UNKNOWN_JOB_ID(-1),
        DOWNLOAD_RESUME(1),
        NETFLIX_MAINTENANCE(2),
        INSOMNIA(3),
        INSTALL_TOKEN(4),
        PUSH_NOTIFICATION(5),
        SMART_DOWNLOAD_RESUME(7),
        MEDIA_PREFETCH_ON_CW(8),
        APP_CACHER(13);
        
        private final int k;

        public int e() {
            return this.k;
        }

        NetflixJobId(int i) {
            this.k = i;
        }

        public static NetflixJobId e(int i) {
            NetflixJobId[] values;
            for (NetflixJobId netflixJobId : values()) {
                if (netflixJobId.e() == i) {
                    return netflixJobId;
                }
            }
            return UNKNOWN_JOB_ID;
        }
    }

    public NetflixJob(NetflixJobId netflixJobId, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.e = netflixJobId;
        this.j = z;
        this.c = z2;
        this.d = j;
        this.b = netflixJobId.e();
        this.i = z3;
        this.h = z4;
        this.g = z5;
    }

    public static NetflixJob c(long j) {
        return new NetflixJob(NetflixJobId.NETFLIX_MAINTENANCE, false, true, j, false, false, false);
    }

    public static NetflixJob c() {
        return new NetflixJob(NetflixJobId.INSTALL_TOKEN, false, false, 0L, false, false, false);
    }

    public static NetflixJob a(boolean z, boolean z2) {
        return new NetflixJob(NetflixJobId.DOWNLOAD_RESUME, z, false, 0L, z2, false, false);
    }

    public static NetflixJob e() {
        return new NetflixJob(NetflixJobId.PUSH_NOTIFICATION, false, false, 0L, false, false, false);
    }

    public static NetflixJob e(long j) {
        return new NetflixJob(NetflixJobId.INSOMNIA, true, true, j, false, false, false);
    }

    public NetflixJobId b() {
        if (this.e == null) {
            this.e = NetflixJobId.e(this.b);
        }
        return this.e;
    }

    public boolean a(Context context) {
        return c(context);
    }

    public boolean c(Context context) {
        ConnectivityUtils.NetType e;
        return (!ConnectivityUtils.n(context) || (e = ConnectivityUtils.e(context)) == null || (this.j && e == ConnectivityUtils.NetType.mobile)) ? false : true;
    }
}
