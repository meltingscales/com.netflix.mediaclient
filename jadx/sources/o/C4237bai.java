package o;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import com.google.gson.Gson;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import o.C4237bai;
import o.InterfaceC4229baa;
import o.dpR;

/* renamed from: o.bai  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4237bai {
    public static final d a = new d(null);
    private final long b;
    private final Uri c;
    private final long d;
    private final Context e;

    public C4237bai(Context context, Uri uri, long j, long j2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) uri, "");
        this.e = context;
        this.c = uri;
        this.d = j;
        this.b = j2;
    }

    public final void a(final InterfaceC4229baa.e eVar) {
        C8632dsu.c((Object) eVar, "");
        new C1071Np().c(new drO<dpR>() { // from class: com.netflix.mediaclient.service.net.probe.RawSocketProbeExecutor$start$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final void e() {
                C4237bai.this.b(eVar);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC4229baa.e eVar) {
        int i;
        long elapsedRealtime;
        d dVar;
        int i2;
        C4235bag c4235bag = new C4235bag();
        c4235bag.c(this.c.getScheme());
        AbstractC4233bae c4234baf = C8632dsu.c((Object) this.c.getScheme(), (Object) "udp") ? new C4234baf(this.b) : new C4236bah();
        int i3 = 0;
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            InetAddress byName = InetAddress.getByName(this.c.getHost());
            c4235bag.d(byName.getHostAddress());
            c4235bag.d(SystemClock.elapsedRealtime() - elapsedRealtime);
            dVar = a;
            dVar.getLogTag();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            c4235bag.b(currentTimeMillis);
            C8632dsu.d(byName);
            c4234baf.e(byName, this.c.getPort(), this.d);
            dVar.getLogTag();
            c4234baf.c();
            i2 = c4234baf.c(4).getInt(0);
            c4235bag.e(currentTimeMillis + (SystemClock.elapsedRealtime() - elapsedRealtime2));
            c4235bag.i(SystemClock.elapsedRealtime() - elapsedRealtime);
            c4235bag.c(i2);
            dVar.getLogTag();
        } catch (Exception e) {
            if (!ConnectivityUtils.n(this.e)) {
                i3 = 5;
            } else if (!(e instanceof ConnectException)) {
                if (e instanceof SocketTimeoutException) {
                    i3 = 1;
                } else {
                    i3 = e instanceof UnknownHostException ? 2 : 10;
                }
            }
            if (e.getCause() instanceof ErrnoException) {
                Throwable cause = e.getCause();
                C8632dsu.d(cause);
                i = ((ErrnoException) cause).errno;
            } else {
                i = -1;
            }
            c4235bag.d(i3, i, e.getMessage());
        }
        if (1 > i2 || i2 >= 65536) {
            throw new IllegalStateException("invalid payload size " + i2);
        }
        ByteBuffer c = c4234baf.c(i2);
        c4235bag.h(SystemClock.elapsedRealtime() - elapsedRealtime);
        String charBuffer = StandardCharsets.UTF_8.decode(c).toString();
        C8632dsu.a(charBuffer, "");
        dVar.getLogTag();
        C1332Xp c1332Xp = C1332Xp.b;
        C4230bab c4230bab = (C4230bab) ((Gson) C1332Xp.b(Gson.class)).fromJson(charBuffer, (Class<Object>) C4230bab.class);
        c4235bag.e(c4230bab.e());
        c4235bag.b(c4230bab.c());
        c4235bag.a(c4230bab.d);
        c4235bag.b(200);
        try {
            c4234baf.a();
        } catch (Exception unused) {
        }
        eVar.e(c4235bag);
    }

    /* renamed from: o.bai$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_probe");
        }
    }
}
