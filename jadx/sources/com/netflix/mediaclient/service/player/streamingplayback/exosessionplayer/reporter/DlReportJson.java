package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.DataSpec;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixNetworkError;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1044Mm;
import o.C4857bnm;
import o.InterfaceC4835bnQ;
import org.chromium.net.NetworkException;

/* loaded from: classes3.dex */
public class DlReportJson extends BaseEventJson {
    private transient long U;
    private transient boolean X;
    @SerializedName("urls")
    protected List<e> a;
    @SerializedName("connections")
    protected List<d> e;
    private static final long c = TimeUnit.MINUTES.toMillis(1);
    private static final long V = TimeUnit.DAYS.toMillis(30);

    /* loaded from: classes6.dex */
    enum DlType {
        AUDIO,
        VIDEO,
        TIMED_TEXT,
        TRICKPLAY,
        MUXED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum Status {
        OPEN,
        COMPLETE,
        STALL,
        ABORT,
        RESET,
        ABANDONED
    }

    protected DlReportJson() {
        this.e = new ArrayList();
        this.a = new ArrayList();
    }

    public DlReportJson(String str, String str2, String str3, String str4, long j, String str5) {
        super("dlreport", str, str2, str3, str4, str5);
        this.e = new ArrayList();
        this.a = new ArrayList();
        this.U = System.currentTimeMillis() - j;
    }

    public void d(long j, CurrentNetworkInfo currentNetworkInfo, InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec, C4857bnm c4857bnm, Timeline.Window window, long j2, long j3) {
        long j4;
        e eVar;
        e eVar2;
        synchronized (this) {
            if (this.X) {
                return;
            }
            long d2 = j - c4857bnm.d();
            if (interfaceC4835bnQ.g() > 0) {
                long g = interfaceC4835bnQ.g() - this.U;
                long j5 = d2 - g;
                if (Math.abs(j5) > c) {
                    C1044Mm.j("nf_playreport", "dlreport disabled - clock drift = %s", Long.valueOf(j5));
                    this.X = true;
                    return;
                }
                j4 = g;
            } else {
                j4 = d2;
            }
            Integer e2 = e(interfaceC4835bnQ);
            if (!interfaceC4835bnQ.j() && e2 != null) {
                this.e.add(new d(j4, currentNetworkInfo, interfaceC4835bnQ, e2));
            }
            Iterator<e> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    eVar = null;
                    break;
                }
                eVar = it.next();
                if (eVar.b.equals(c4857bnm.b)) {
                    break;
                }
            }
            if (eVar == null) {
                eVar2 = new e(interfaceC4835bnQ, c4857bnm);
                this.a.add(eVar2);
            } else {
                eVar2 = eVar;
            }
            eVar2.d(j4, interfaceC4835bnQ, dataSpec, c4857bnm, e2, window, j2, j3);
        }
    }

    public boolean c() {
        return this.e.isEmpty() && this.a.isEmpty();
    }

    public void a() {
        synchronized (this) {
            this.e.clear();
            this.a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class e {
        @SerializedName(SignupConstants.Field.LANG_ID)
        protected String b;
        @SerializedName("dltype")
        protected DlType d;
        @SerializedName(SignupConstants.Field.URL)
        protected String h;
        @SerializedName("downloads")
        protected List<a> c = new ArrayList();
        @SerializedName("failures")
        protected List<Failure> e = new ArrayList();

        public e(InterfaceC4835bnQ interfaceC4835bnQ, C4857bnm c4857bnm) {
            this.h = interfaceC4835bnQ.n();
            int i = c4857bnm.d;
            if (i == 1) {
                this.d = DlType.AUDIO;
            } else if (i == 2) {
                this.d = DlType.VIDEO;
            } else if (i == 3) {
                this.d = DlType.TIMED_TEXT;
            }
            this.b = c4857bnm.b;
        }

        public void d(long j, InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec, C4857bnm c4857bnm, Integer num, Timeline.Window window, long j2, long j3) {
            a aVar;
            a aVar2;
            int c = interfaceC4835bnQ.c();
            boolean e = DlReportJson.e(c4857bnm, interfaceC4835bnQ);
            if (!e || (c4857bnm != null && c4857bnm.e() != null && c >= 200 && c < 300)) {
                Integer e2 = DlReportJson.e(interfaceC4835bnQ);
                Iterator<a> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = it.next();
                    if (DlReportJson.d(aVar.h, e2)) {
                        break;
                    }
                }
                if (aVar == null) {
                    aVar2 = new a(j, interfaceC4835bnQ, num, window, j2, j3);
                    this.c.add(aVar2);
                } else {
                    aVar2 = aVar;
                }
                aVar2.d(j, interfaceC4835bnQ, dataSpec, c4857bnm);
            }
            if (e) {
                this.e.add(new Failure(j, interfaceC4835bnQ, dataSpec, c4857bnm, num, window, j2, j3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a {
        @SerializedName("dur")
        protected Long b;
        @SerializedName("status")
        protected Status d;
        @SerializedName("time")
        protected long e;
        @SerializedName("tcpid")
        protected Integer h;
        @SerializedName("enctimeinfo")
        protected long[] i;
        @SerializedName("tresp")
        protected Long j;
        private transient long l = -9223372036854775807L;
        @SerializedName("ranges")
        protected ArrayList<long[]> c = new ArrayList<>();
        @SerializedName("headers")
        protected ArrayList<Long> a = new ArrayList<>();
        @SerializedName("trace")
        protected ArrayList<Long[]> f = new ArrayList<>();

        public a(long j, InterfaceC4835bnQ interfaceC4835bnQ, Integer num, Timeline.Window window, long j2, long j3) {
            this.h = num;
            this.e = j;
            this.j = Long.valueOf(interfaceC4835bnQ.o());
            this.i = DlReportJson.c(window, j2, j3);
        }

        public void d(long j, InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec, C4857bnm c4857bnm) {
            long o2 = interfaceC4835bnQ.o();
            if (!this.f.isEmpty()) {
                long j2 = this.l;
                if (j2 != -9223372036854775807L) {
                    long j3 = j - j2;
                    if (j3 > 0) {
                        this.f.add(new Long[]{Long.valueOf(j3), -2L});
                    }
                    if (o2 > 0) {
                        this.f.add(new Long[]{Long.valueOf(o2), -3L});
                    }
                }
            }
            this.a.add(Long.valueOf(DlReportJson.a(interfaceC4835bnQ)));
            this.f.add(c4857bnm.e());
            this.c.add(DlReportJson.b(dataSpec, c4857bnm));
            long f = interfaceC4835bnQ.f() + j;
            this.l = f;
            this.b = Long.valueOf(f - this.e);
            if (interfaceC4835bnQ.d() instanceof NetworkException) {
                int errorCode = ((NetworkException) interfaceC4835bnQ.d()).getErrorCode();
                if (errorCode == 4 || errorCode == 6) {
                    this.d = Status.STALL;
                } else {
                    this.d = Status.RESET;
                }
            } else if (c4857bnm.c() != null) {
                int i = AnonymousClass2.b[c4857bnm.c().ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    this.d = Status.STALL;
                } else {
                    this.d = Status.RESET;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.DlReportJson$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NetflixNetworkError.values().length];
            b = iArr;
            try {
                iArr[NetflixNetworkError.CONNECTION_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[NetflixNetworkError.HTTP_CONNECTION_STALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[NetflixNetworkError.HTTPS_CONNECTION_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class d {
        @SerializedName(SignupConstants.Field.LANG_ID)
        protected Integer a;
        @SerializedName("tdns")
        protected Long b;
        @SerializedName("host")
        protected String c;
        @SerializedName("tconn")
        protected Long d;
        @SerializedName("network")
        protected CurrentNetworkInfo.NetSpec e;
        @SerializedName("port")
        protected Integer i;
        @SerializedName("time")
        protected Long j;

        public d(long j, CurrentNetworkInfo currentNetworkInfo, InterfaceC4835bnQ interfaceC4835bnQ, Integer num) {
            Uri parse = Uri.parse(interfaceC4835bnQ.n());
            this.c = parse.getHost();
            if (parse.getPort() > 0) {
                this.i = Integer.valueOf(parse.getPort());
            } else {
                this.i = Integer.valueOf("http".equals(parse.getScheme()) ? 80 : 443);
            }
            this.j = Long.valueOf(j);
            if (interfaceC4835bnQ.e() >= 0) {
                this.b = Long.valueOf(interfaceC4835bnQ.e());
            }
            if (interfaceC4835bnQ.b() >= 0) {
                this.d = Long.valueOf(interfaceC4835bnQ.b());
            }
            this.a = num;
            this.e = currentNetworkInfo.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class Failure {
        @SerializedName("nwerr")
        protected String a;
        @SerializedName("dur")
        protected Long b;
        @SerializedName("httpcode")
        protected Integer c;
        @SerializedName("reason")
        protected Reason d;
        @SerializedName("range")
        protected long[] e;
        @SerializedName("tcpid")
        protected Integer f;
        @SerializedName("enctimeinfo")
        protected long[] g;
        @SerializedName("time")
        protected Long i;
        @SerializedName("tresp")
        protected Long j;

        /* loaded from: classes6.dex */
        enum Reason {
            NETWORK,
            TIMEOUT,
            HTTP
        }

        public Failure(long j, InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec, C4857bnm c4857bnm, Integer num, Timeline.Window window, long j2, long j3) {
            this.i = Long.valueOf(j);
            this.e = DlReportJson.b(dataSpec, c4857bnm);
            this.f = num;
            Long valueOf = Long.valueOf(interfaceC4835bnQ.o());
            this.j = valueOf;
            if (valueOf != null && interfaceC4835bnQ.f() != 0) {
                this.b = Long.valueOf(interfaceC4835bnQ.f() - this.j.longValue());
            }
            if (interfaceC4835bnQ.c() >= 400) {
                this.d = Reason.HTTP;
                this.c = Integer.valueOf(interfaceC4835bnQ.c());
            } else if (interfaceC4835bnQ.d() != null) {
                if (interfaceC4835bnQ.d() instanceof NetworkException) {
                    NetworkException networkException = (NetworkException) interfaceC4835bnQ.d();
                    int errorCode = networkException.getErrorCode();
                    if (errorCode == 4 || errorCode == 6) {
                        this.d = Reason.TIMEOUT;
                    } else {
                        this.d = Reason.NETWORK;
                    }
                    this.a = ErrorCodeUtils.d(networkException);
                } else {
                    this.a = interfaceC4835bnQ.d().getMessage();
                }
            } else if (c4857bnm.c() != null) {
                int i = AnonymousClass2.b[c4857bnm.c().ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    this.d = Reason.TIMEOUT;
                } else {
                    this.d = Reason.NETWORK;
                }
                this.a = c4857bnm.c().toString();
            }
            this.g = DlReportJson.c(window, j2, j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long a(InterfaceC4835bnQ interfaceC4835bnQ) {
        long j = 0;
        for (Map.Entry<String, String> entry : interfaceC4835bnQ.a().entrySet()) {
            j += entry.getKey().length() + entry.getValue().length();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long[] b(DataSpec dataSpec, C4857bnm c4857bnm) {
        long j = dataSpec.length;
        if (j == -1) {
            return new long[]{0, c4857bnm.b()};
        }
        long j2 = dataSpec.position;
        return new long[]{j2, (j + j2) - 1};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer e(InterfaceC4835bnQ interfaceC4835bnQ) {
        return a(a(interfaceC4835bnQ, "X-TCP-Info"));
    }

    private static final String a(InterfaceC4835bnQ interfaceC4835bnQ, String str) {
        return interfaceC4835bnQ.a().get(str);
    }

    private static Integer a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : str.split(";")) {
            String[] split = str2.split("=");
            if (split != null && split.length > 1 && "port".equalsIgnoreCase(split[0])) {
                try {
                    return Integer.valueOf(Integer.parseInt(split[1]));
                } catch (NumberFormatException e2) {
                    C1044Mm.b("nf_playreport", e2, "unable to parse connection TCP info for %s", str);
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean e(C4857bnm c4857bnm, InterfaceC4835bnQ interfaceC4835bnQ) {
        return interfaceC4835bnQ.h() || interfaceC4835bnQ.c() >= 400 || c4857bnm.c() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Integer num, Integer num2) {
        if (num == null) {
            return num2 == null;
        }
        return num.equals(num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long[] c(Timeline.Window window, long j, long j2) {
        if (window == null || !window.isDynamic || j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return null;
        }
        return new long[]{j + j2, j2, window.getCurrentUnixTimeMs(), SystemClock.elapsedRealtime()};
    }
}
