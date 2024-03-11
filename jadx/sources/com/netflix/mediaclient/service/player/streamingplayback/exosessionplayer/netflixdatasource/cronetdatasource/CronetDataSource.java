package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.cronetdatasource;

import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.core.util.Predicate;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.TransferListener;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixNetworkError;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C1044Mm;
import o.C4806bmo;
import o.InterfaceC4795bmd;
import o.InterfaceC4800bmi;
import o.InterfaceC4801bmj;
import o.InterfaceC4834bnP;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.linphone.core.Privacy;

/* loaded from: classes3.dex */
public class CronetDataSource extends UrlRequest.Callback implements InterfaceC4800bmi {
    private static final Pattern c = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private InterfaceC4834bnP D;
    private long a;
    private long d;
    private final int e;
    private UrlRequest f;
    private final ExperimentalCronetEngine g;
    private DataSpec h;
    private volatile long j;
    private final boolean k;
    private boolean l;
    private final HttpDataSource.RequestProperties m;
    private IOException n;

    /* renamed from: o  reason: collision with root package name */
    private final Executor f13220o;
    private ByteBuffer p;
    private InterfaceC4801bmj q;
    private final InterfaceC4795bmd r;
    private boolean t;
    private UrlResponseInfo v;
    private final int w;
    private final int x;
    private final boolean y;
    private final Predicate<String> i = null;
    private final Clock b = (Clock) Assertions.checkNotNull(Clock.DEFAULT);
    private final Map<String, String> u = new HashMap();
    private final ConditionVariable s = new ConditionVariable();

    @Override // o.InterfaceC4800bmi
    public void e(InterfaceC4834bnP interfaceC4834bnP) {
        this.D = interfaceC4834bnP;
    }

    /* loaded from: classes3.dex */
    public static class CronetDataSourceException extends HttpDataSource.HttpDataSourceException {
        public final int b;

        public CronetDataSourceException(IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(iOException, dataSpec, i);
            this.b = i2;
        }

        public CronetDataSourceException(String str, DataSpec dataSpec, int i, int i2) {
            super(str, dataSpec, i);
            this.b = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class OpenException extends CronetDataSourceException {
        public OpenException(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException, dataSpec, 1, i);
        }

        public OpenException(String str, DataSpec dataSpec, int i) {
            super(str, dataSpec, 1, i);
        }
    }

    public CronetDataSource(ExperimentalCronetEngine experimentalCronetEngine, Executor executor, int i, int i2, boolean z, HttpDataSource.RequestProperties requestProperties, InterfaceC4834bnP interfaceC4834bnP, InterfaceC4795bmd interfaceC4795bmd, int i3, boolean z2) {
        this.g = (ExperimentalCronetEngine) Assertions.checkNotNull(experimentalCronetEngine);
        this.f13220o = (Executor) Assertions.checkNotNull(executor);
        this.e = i;
        this.w = i2;
        this.y = z;
        this.m = requestProperties;
        this.D = interfaceC4834bnP;
        this.r = interfaceC4795bmd;
        this.x = i3;
        this.k = z2;
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.v;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getAllHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.v;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        if (transferListener instanceof InterfaceC4801bmj) {
            this.q = (InterfaceC4801bmj) transferListener;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        Assertions.checkNotNull(dataSpec);
        Assertions.checkState(!this.t);
        this.s.close();
        c();
        this.h = dataSpec;
        InterfaceC4801bmj interfaceC4801bmj = this.q;
        if (interfaceC4801bmj != null) {
            interfaceC4801bmj.onTransferInitializing(this, dataSpec, true);
        }
        UrlRequest e = e(dataSpec);
        this.f = e;
        e.start();
        boolean a = a();
        IOException iOException = this.n;
        if (iOException != null) {
            b(dataSpec, c(iOException, false));
            throw new OpenException(this.n, this.h, c(this.f));
        } else if (!a) {
            b(dataSpec, NetflixNetworkError.CONNECTION_TIMEOUT);
            this.n = new SocketTimeoutException();
            throw new OpenException(this.n, dataSpec, c(this.f));
        } else {
            int httpStatusCode = this.v.getHttpStatusCode();
            if (httpStatusCode < 200 || httpStatusCode > 299) {
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, this.v.getHttpStatusText(), httpStatusCode == 416 ? new DataSourceException(2008) : null, this.v.getAllHeaders(), this.h, Util.EMPTY_BYTE_ARRAY);
                if (httpStatusCode == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(2008));
                }
                b(dataSpec, c(invalidResponseCodeException, false));
                throw invalidResponseCodeException;
            }
            if (this.i != null) {
                List<String> list = this.v.getAllHeaders().get("Content-Type");
                String str = b(list) ? null : list.get(0);
                if (!this.i.test(str)) {
                    b(dataSpec, NetflixNetworkError.HTTP_CONTENT_TYPE);
                    throw new HttpDataSource.InvalidContentTypeException(str, this.h);
                }
            }
            long j = 0;
            if (httpStatusCode == 200) {
                long j2 = dataSpec.position;
                if (j2 != 0) {
                    j = j2;
                }
            }
            this.a = j;
            if (!a(this.v)) {
                long j3 = dataSpec.length;
                if (j3 != -1) {
                    this.d = j3;
                } else {
                    this.d = d(this.v);
                }
            } else {
                this.d = this.h.length;
            }
            this.t = true;
            InterfaceC4834bnP interfaceC4834bnP = this.D;
            if (interfaceC4834bnP != null) {
                interfaceC4834bnP.c(dataSpec);
            }
            InterfaceC4801bmj interfaceC4801bmj2 = this.q;
            if (interfaceC4801bmj2 != null) {
                List<String> a2 = interfaceC4801bmj2.a();
                if (a2 != null) {
                    for (String str2 : a2) {
                        List<String> list2 = this.v.getAllHeaders().get(str2);
                        if (list2 != null && !list2.isEmpty()) {
                            this.q.d(this, str2, list2);
                        }
                    }
                }
                this.q.onTransferStart(this, dataSpec, true);
            }
            return this.d;
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        Assertions.checkState(this.t);
        if (i2 == 0) {
            return 0;
        }
        if (this.d == 0) {
            return -1;
        }
        if (this.p == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.x);
            this.p = allocateDirect;
            allocateDirect.limit(0);
        }
        while (!this.p.hasRemaining()) {
            this.s.close();
            this.p.clear();
            this.f.read(this.p);
            if (!this.s.block(this.w)) {
                this.p = null;
                b(this.h, NetflixNetworkError.HTTP_CONNECTION_STALL);
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException();
                this.n = socketTimeoutException;
                throw new CronetDataSourceException(socketTimeoutException, this.h, 2, c(this.f));
            }
            IOException iOException = this.n;
            if (iOException != null) {
                b(this.h, c(iOException, true));
                throw new CronetDataSourceException(this.n, this.h, 2, c(this.f));
            } else if (this.l) {
                return -1;
            } else {
                this.p.flip();
                Assertions.checkState(this.p.hasRemaining());
                InterfaceC4834bnP interfaceC4834bnP = this.D;
                if (interfaceC4834bnP != null) {
                    interfaceC4834bnP.a(this.h, this.p.remaining());
                }
                InterfaceC4801bmj interfaceC4801bmj = this.q;
                if (interfaceC4801bmj != null) {
                    interfaceC4801bmj.onBytesTransferred(this, this.h, true, this.p.remaining());
                }
                if (this.a > 0) {
                    int min = (int) Math.min(this.p.remaining(), this.a);
                    ByteBuffer byteBuffer = this.p;
                    byteBuffer.position(byteBuffer.position() + min);
                    this.a -= min;
                }
            }
        }
        int min2 = Math.min(this.p.remaining(), i2);
        this.p.get(bArr, i, min2);
        long j = this.d;
        if (j != -1) {
            this.d = j - min2;
        }
        return min2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[Catch: all -> 0x009f, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:14:0x001a, B:16:0x001e, B:18:0x0024, B:20:0x002c, B:26:0x003b, B:29:0x0070, B:27:0x0067, B:28:0x006d, B:30:0x0072, B:32:0x0076, B:33:0x0079, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008c, B:42:0x0094, B:44:0x009a), top: B:50:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r10 = this;
            monitor-enter(r10)
            androidx.media3.datasource.DataSpec r0 = r10.h     // Catch: java.lang.Throwable -> L9f
            org.chromium.net.UrlRequest r1 = r10.f     // Catch: java.lang.Throwable -> L9f
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L72
            boolean r5 = r10.k     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L6d
            boolean r1 = r10.l     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L19
            java.io.IOException r1 = r10.n     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L17
            goto L19
        L17:
            r1 = r4
            goto L1a
        L19:
            r1 = r2
        L1a:
            java.nio.ByteBuffer r5 = r10.p     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L23
            int r5 = r5.remaining()     // Catch: java.lang.Throwable -> L9f
            goto L24
        L23:
            r5 = r4
        L24:
            long r6 = r10.d     // Catch: java.lang.Throwable -> L9f
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L36
            long r8 = (long) r5     // Catch: java.lang.Throwable -> L9f
            long r6 = r6 - r8
            r8 = 0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L36
            r5 = r2
            goto L37
        L36:
            r5 = r4
        L37:
            if (r1 != 0) goto L67
            if (r5 == 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r1.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "detected a cancel for active request - orphaning response and discarding all future bytes (expecting "
            r1.append(r5)     // Catch: java.lang.Throwable -> L9f
            long r5 = r10.d     // Catch: java.lang.Throwable -> L9f
            r1.append(r5)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = ")"
            r1.append(r5)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "CronetDataSource"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9f
            o.C1044Mm.a(r5, r1)     // Catch: java.lang.Throwable -> L9f
            org.chromium.net.UrlRequest r1 = r10.f     // Catch: java.lang.Throwable -> L9f
            r5 = 32768(0x8000, float:4.5918E-41)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)     // Catch: java.lang.Throwable -> L9f
            r1.read(r5)     // Catch: java.lang.Throwable -> L9f
            r10.p = r3     // Catch: java.lang.Throwable -> L9f
            goto L70
        L67:
            org.chromium.net.UrlRequest r1 = r10.f     // Catch: java.lang.Throwable -> L9f
            r1.cancel()     // Catch: java.lang.Throwable -> L9f
            goto L70
        L6d:
            r1.cancel()     // Catch: java.lang.Throwable -> L9f
        L70:
            r10.f = r3     // Catch: java.lang.Throwable -> L9f
        L72:
            java.nio.ByteBuffer r1 = r10.p     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L79
            r1.limit(r4)     // Catch: java.lang.Throwable -> L9f
        L79:
            r10.h = r3     // Catch: java.lang.Throwable -> L9f
            r10.v = r3     // Catch: java.lang.Throwable -> L9f
            boolean r1 = r10.t     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L8c
            java.io.IOException r1 = r10.n     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L8c
            o.bmd r1 = r10.r     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L8c
            r1.e(r0)     // Catch: java.lang.Throwable -> L9f
        L8c:
            r10.n = r3     // Catch: java.lang.Throwable -> L9f
            r10.l = r4     // Catch: java.lang.Throwable -> L9f
            boolean r1 = r10.t     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L9d
            r10.t = r4     // Catch: java.lang.Throwable -> L9f
            o.bmj r1 = r10.q     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L9d
            r1.onTransferEnd(r10, r0, r2)     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r10)
            return
        L9f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.cronetdatasource.CronetDataSource.close():void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        int httpStatusCode;
        synchronized (this) {
            if (urlRequest != this.f) {
                return;
            }
            if (this.h.httpBody != null && ((httpStatusCode = urlResponseInfo.getHttpStatusCode()) == 307 || httpStatusCode == 308)) {
                this.n = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, this.v.getHttpStatusText(), null, this.v.getAllHeaders(), this.h, Util.EMPTY_BYTE_ARRAY);
                this.s.open();
                return;
            }
            if (this.y) {
                c();
            }
            urlRequest.followRedirect();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        synchronized (this) {
            if (urlRequest != this.f) {
                if (this.k) {
                    urlRequest.read(ByteBuffer.allocateDirect(Privacy.DEFAULT));
                }
                return;
            }
            this.v = urlResponseInfo;
            this.s.open();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        synchronized (this) {
            if (urlRequest == this.f) {
                this.s.open();
                return;
            }
            if (this.k) {
                C1044Mm.a("CronetDataSource", "discarding " + byteBuffer.position() + " bytes from a orphaned request");
                urlRequest.read(ByteBuffer.allocateDirect(Privacy.DEFAULT));
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        synchronized (this) {
            if (urlRequest != this.f) {
                return;
            }
            this.l = true;
            this.s.open();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        synchronized (this) {
            if (urlRequest != this.f) {
                return;
            }
            if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                this.n = new UnknownHostException();
            } else {
                this.n = cronetException;
            }
            this.s.open();
        }
    }

    private UrlRequest e(DataSpec dataSpec) {
        ExperimentalUrlRequest.Builder newUrlRequestBuilder = this.g.newUrlRequestBuilder(dataSpec.uri.toString(), (UrlRequest.Callback) this, this.f13220o);
        synchronized (this.u) {
            byte[] bArr = dataSpec.httpBody;
            if (bArr != null && bArr.length != 0 && !this.u.containsKey("Content-Type")) {
                throw new OpenException("POST request with non-empty body must set Content-Type", dataSpec, 0);
            }
            for (Map.Entry<String, String> entry : this.u.entrySet()) {
                newUrlRequestBuilder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        HttpDataSource.RequestProperties requestProperties = this.m;
        if (requestProperties != null) {
            for (Map.Entry<String, String> entry2 : requestProperties.getSnapshot().entrySet()) {
                newUrlRequestBuilder.addHeader(entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map = dataSpec.httpRequestHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry3 : map.entrySet()) {
                newUrlRequestBuilder.addHeader(entry3.getKey(), entry3.getValue());
            }
        }
        DataSpec dataSpec2 = this.h;
        if (dataSpec2.position != 0 || dataSpec2.length != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(this.h.position);
            sb.append("-");
            DataSpec dataSpec3 = this.h;
            long j = dataSpec3.length;
            if (j != -1) {
                sb.append((dataSpec3.position + j) - 1);
            }
            newUrlRequestBuilder.addHeader("Range", sb.toString());
        }
        if (dataSpec.httpBody != null) {
            newUrlRequestBuilder.setHttpMethod("POST");
            byte[] bArr2 = dataSpec.httpBody;
            if (bArr2.length != 0) {
                newUrlRequestBuilder.setUploadDataProvider((UploadDataProvider) new C4806bmo(bArr2), this.f13220o);
            }
        }
        newUrlRequestBuilder.addRequestAnnotation((Object) dataSpec);
        InterfaceC4834bnP interfaceC4834bnP = this.D;
        if (interfaceC4834bnP != null) {
            newUrlRequestBuilder.addRequestAnnotation((Object) interfaceC4834bnP);
        }
        newUrlRequestBuilder.allowDirectExecutor();
        return newUrlRequestBuilder.build();
    }

    private boolean a() {
        long elapsedRealtime = this.b.elapsedRealtime();
        boolean z = false;
        while (!z && elapsedRealtime < this.j) {
            z = this.s.block((this.j - elapsedRealtime) + 5);
            elapsedRealtime = this.b.elapsedRealtime();
        }
        return z;
    }

    private void c() {
        this.j = this.b.elapsedRealtime() + this.e;
    }

    private static boolean a(UrlResponseInfo urlResponseInfo) {
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                return !entry.getValue().equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    private static long d(UrlResponseInfo urlResponseInfo) {
        String str;
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        List<String> list = allHeaders.get("Content-Length");
        long j = -1;
        if (b(list)) {
            str = null;
        } else {
            str = list.get(0);
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException unused) {
                    C1044Mm.d("CronetDataSource", "Unexpected Content-Length [" + str + "]");
                }
            }
        }
        List<String> list2 = allHeaders.get("Content-Range");
        if (b(list2)) {
            return j;
        }
        String str2 = list2.get(0);
        Matcher matcher = c.matcher(str2);
        if (matcher.find()) {
            try {
                long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                if (j < 0) {
                    return parseLong;
                }
                if (j != parseLong) {
                    C1044Mm.j("CronetDataSource", "Inconsistent headers [" + str + "] [" + str2 + "]");
                    return Math.max(j, parseLong);
                }
                return j;
            } catch (NumberFormatException unused2) {
                C1044Mm.d("CronetDataSource", "Unexpected Content-Range [" + str2 + "]");
                return j;
            }
        }
        return j;
    }

    private static int c(UrlRequest urlRequest) {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final int[] iArr = new int[1];
        urlRequest.getStatus(new UrlRequest.StatusListener() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.cronetdatasource.CronetDataSource.2
            @Override // org.chromium.net.UrlRequest.StatusListener
            public void onStatus(int i) {
                iArr[0] = i;
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        return iArr[0];
    }

    private static boolean b(List<?> list) {
        return list == null || list.isEmpty();
    }

    private void b(DataSpec dataSpec, NetflixNetworkError netflixNetworkError) {
        InterfaceC4801bmj interfaceC4801bmj = this.q;
        if (interfaceC4801bmj != null) {
            interfaceC4801bmj.c(this);
        }
        InterfaceC4795bmd interfaceC4795bmd = this.r;
        if (interfaceC4795bmd != null) {
            interfaceC4795bmd.a(dataSpec, netflixNetworkError);
        }
        InterfaceC4834bnP interfaceC4834bnP = this.D;
        if (interfaceC4834bnP != null) {
            interfaceC4834bnP.c(dataSpec, netflixNetworkError);
        }
    }

    private static NetflixNetworkError c(IOException iOException, boolean z) {
        if (iOException instanceof HttpDataSource.InvalidResponseCodeException) {
            int i = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
            if (i == 420) {
                return NetflixNetworkError.HTTP_RESPONSE_420;
            }
            if (i >= 500) {
                return NetflixNetworkError.HTTP_RESPONSE_5XX;
            }
            if (i >= 400) {
                return NetflixNetworkError.HTTP_RESPONSE_4XX;
            }
            return NetflixNetworkError.HTTP_RESPONSE_3XX;
        } else if (iOException instanceof UnknownHostException) {
            return NetflixNetworkError.DNS_NOT_FOUND;
        } else {
            if (iOException instanceof NetworkException) {
                switch (((NetworkException) iOException).getErrorCode()) {
                    case 1:
                        return NetflixNetworkError.DNS_NOT_FOUND;
                    case 2:
                        return NetflixNetworkError.CONNECTION_NETWORK_DOWN;
                    case 3:
                        return NetflixNetworkError.NETWORK_CHANGED;
                    case 4:
                        if (z) {
                            return NetflixNetworkError.HTTP_CONNECTION_STALL;
                        }
                        return NetflixNetworkError.HTTPS_CONNECTION_TIMEOUT;
                    case 5:
                        return NetflixNetworkError.CONNECTION_CLOSED;
                    case 6:
                        return NetflixNetworkError.CONNECTION_TIMEOUT;
                    case 7:
                        return NetflixNetworkError.CONNECTION_REFUSED;
                    case 8:
                        if (z) {
                            return NetflixNetworkError.CONNECTION_RESET_WHILE_RECEIVING;
                        }
                        return NetflixNetworkError.CONNECTION_RESET_ON_CONNECT;
                    case 9:
                        return NetflixNetworkError.CONNECTION_NO_ROUTE_TO_HOST;
                }
            }
            return NetflixNetworkError.UNKNOWN;
        }
    }
}
