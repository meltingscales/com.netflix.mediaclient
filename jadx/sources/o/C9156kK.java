package o;

import android.net.TrafficStats;
import com.bugsnag.android.DeliveryStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Result;

/* renamed from: o.kK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9156kK implements InterfaceC9157kL {
    public static final b c = new b(null);
    private final InterfaceC9147kB a;
    private final String b;
    private final int d;
    private final InterfaceC9200lB e;

    private final boolean a(int i) {
        return 400 <= i && i <= 499 && i != 408 && i != 429;
    }

    public C9156kK(InterfaceC9147kB interfaceC9147kB, String str, int i, InterfaceC9200lB interfaceC9200lB) {
        this.a = interfaceC9147kB;
        this.b = str;
        this.d = i;
        this.e = interfaceC9200lB;
    }

    /* renamed from: o.kK$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.InterfaceC9157kL
    public DeliveryStatus a(C9220lV c9220lV, C9155kJ c9155kJ) {
        DeliveryStatus b2 = b(c9155kJ.b(), C9264mM.b.d(c9220lV), c9155kJ.a());
        this.e.a(C8632dsu.d("Session API request finished with status ", b2));
        return b2;
    }

    private final byte[] e(C9230lf c9230lf) {
        C9264mM c9264mM = C9264mM.b;
        byte[] d = c9264mM.d(c9230lf);
        if (d.length <= 999700) {
            return d;
        }
        C9229le b2 = c9230lf.b();
        if (b2 == null) {
            File e = c9230lf.e();
            C8632dsu.d(e);
            b2 = new C9204lF(e, this.b, this.e).invoke();
            c9230lf.d(b2);
            c9230lf.b(this.b);
        }
        C9265mN a = b2.e().a(this.d);
        b2.e().i().e(a.a(), a.c());
        byte[] d2 = c9264mM.d(c9230lf);
        if (d2.length <= 999700) {
            return d2;
        }
        C9265mN c2 = b2.e().c(d2.length - 999700);
        b2.e().i().d(c2.e(), c2.d());
        return c9264mM.d(c9230lf);
    }

    @Override // o.InterfaceC9157kL
    public DeliveryStatus b(C9230lf c9230lf, C9155kJ c9155kJ) {
        DeliveryStatus b2 = b(c9155kJ.b(), e(c9230lf), c9155kJ.a());
        this.e.a(C8632dsu.d("Error API request finished with status ", b2));
        return b2;
    }

    public final DeliveryStatus b(String str, byte[] bArr, Map<String, String> map) {
        TrafficStats.setThreadStatsTag(1);
        InterfaceC9147kB interfaceC9147kB = this.a;
        if (interfaceC9147kB == null || interfaceC9147kB.c()) {
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    try {
                        httpURLConnection = b(new URL(str), bArr, map);
                        int responseCode = httpURLConnection.getResponseCode();
                        DeliveryStatus c2 = c(responseCode);
                        d(responseCode, httpURLConnection, c2);
                        httpURLConnection.disconnect();
                        return c2;
                    } catch (Exception e) {
                        this.e.e("Unexpected error delivering payload", e);
                        DeliveryStatus deliveryStatus = DeliveryStatus.FAILURE;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return deliveryStatus;
                    } catch (OutOfMemoryError e2) {
                        this.e.e("Encountered OOM delivering payload, falling back to persist on disk", e2);
                        DeliveryStatus deliveryStatus2 = DeliveryStatus.UNDELIVERED;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return deliveryStatus2;
                    }
                } catch (IOException e3) {
                    this.e.e("IOException encountered in request", e3);
                    DeliveryStatus deliveryStatus3 = DeliveryStatus.UNDELIVERED;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return deliveryStatus3;
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
        return DeliveryStatus.UNDELIVERED;
    }

    private final HttpURLConnection b(URL url, byte[] bArr, Map<String, String> map) {
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        String d = C9154kI.d(bArr);
        if (d != null) {
            httpURLConnection.addRequestProperty("Bugsnag-Integrity", d);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                httpURLConnection.addRequestProperty(key, value);
            }
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bArr);
            dpR dpr = dpR.c;
            C8608drx.a(outputStream, null);
            return httpURLConnection;
        } finally {
        }
    }

    private final void d(int i, HttpURLConnection httpURLConnection, DeliveryStatus deliveryStatus) {
        try {
            Result.c cVar = Result.e;
            InterfaceC9200lB interfaceC9200lB = this.e;
            interfaceC9200lB.a("Request completed with code " + i + ", message: " + ((Object) httpURLConnection.getResponseMessage()) + ", headers: " + httpURLConnection.getHeaderFields());
            Result.e(dpR.c);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            Result.e(C8556dpz.a(th));
        }
        try {
            Result.c cVar3 = Result.e;
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), C8674dui.i);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            this.e.b(C8632dsu.d("Received request response: ", (Object) drJ.e((Reader) bufferedReader)));
            dpR dpr = dpR.c;
            C8608drx.a(bufferedReader, null);
            Result.e(dpr);
        } catch (Throwable th2) {
            Result.c cVar4 = Result.e;
            Result.e(C8556dpz.a(th2));
        }
        try {
            Result.c cVar5 = Result.e;
            if (deliveryStatus != DeliveryStatus.DELIVERED) {
                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getErrorStream(), C8674dui.i);
                BufferedReader bufferedReader2 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                this.e.d(C8632dsu.d("Request error details: ", (Object) drJ.e((Reader) bufferedReader2)));
                dpR dpr2 = dpR.c;
                C8608drx.a(bufferedReader2, null);
            }
            Result.e(dpR.c);
        } catch (Throwable th3) {
            Result.c cVar6 = Result.e;
            Result.e(C8556dpz.a(th3));
        }
    }

    public final DeliveryStatus c(int i) {
        if (200 > i || i > 299) {
            return a(i) ? DeliveryStatus.FAILURE : DeliveryStatus.UNDELIVERED;
        }
        return DeliveryStatus.DELIVERED;
    }
}
