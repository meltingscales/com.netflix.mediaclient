package fi.iki.elonen;

import android.support.v4.media.session.PlaybackStateCompat;
import com.netflix.android.org.json.HTTP;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import o.C8543dpm;

/* loaded from: classes5.dex */
public abstract class NanoHTTPD {
    protected b a;
    private k f;
    private Thread g;
    private volatile ServerSocket h;
    private final String i;
    private final int j;
    private s n;
    private static final Pattern b = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern d = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern e = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    private static final Logger c = Logger.getLogger(NanoHTTPD.class.getName());

    /* loaded from: classes5.dex */
    public interface b {
        void c(d dVar);

        void e(d dVar);
    }

    /* loaded from: classes5.dex */
    public interface k {
        ServerSocket b();
    }

    /* loaded from: classes5.dex */
    public interface l {
        Map<String, String> a();

        void b(Map<String, String> map);

        Method c();

        @Deprecated
        Map<String, String> d();

        String h();

        String j();
    }

    /* loaded from: classes5.dex */
    public interface n {
        String c();

        void e();
    }

    /* loaded from: classes5.dex */
    public interface r {
        n b(String str);

        void b();
    }

    /* loaded from: classes5.dex */
    public interface s {
        r e();
    }

    public void a(s sVar) {
        this.n = sVar;
    }

    public void b(b bVar) {
        this.a = bVar;
    }

    public k g() {
        return this.f;
    }

    /* loaded from: classes5.dex */
    public class d implements Runnable {
        private final Socket a;
        private final InputStream b;

        public d(InputStream inputStream, Socket socket) {
            this.b = inputStream;
            this.a = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = this.a.getOutputStream();
                    o oVar = new o(NanoHTTPD.this.n.e(), this.b, outputStream, this.a.getInetAddress());
                    while (!this.a.isClosed()) {
                        oVar.e();
                    }
                } catch (Exception e) {
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        NanoHTTPD.c.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                }
            } finally {
                NanoHTTPD.b(outputStream);
                NanoHTTPD.b(this.b);
                NanoHTTPD.b(this.a);
                NanoHTTPD.this.a.c(this);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class e {
        private final String a;
        private final String c;
        private final String d;

        public String b() {
            return String.format("%s=%s; expires=%s", this.d, this.a, this.c);
        }
    }

    /* loaded from: classes5.dex */
    public class c implements Iterable<String> {
        private final HashMap<String, String> a = new HashMap<>();
        private final ArrayList<e> d = new ArrayList<>();

        public c(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.a.put(split[0], split[1]);
                    }
                }
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.a.keySet().iterator();
        }

        public void a(Response response) {
            Iterator<e> it = this.d.iterator();
            while (it.hasNext()) {
                response.d("Set-Cookie", it.next().b());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class j implements b {
        private final List<d> b = Collections.synchronizedList(new ArrayList());
        private long c;

        @Override // fi.iki.elonen.NanoHTTPD.b
        public void c(d dVar) {
            this.b.remove(dVar);
        }

        @Override // fi.iki.elonen.NanoHTTPD.b
        public void e(d dVar) {
            this.c++;
            Thread thread = new Thread(dVar);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.c + ")");
            this.b.add(dVar);
            thread.start();
        }
    }

    /* loaded from: classes5.dex */
    public static class g implements n {
        private final File b;
        private final OutputStream d;

        public g(File file) {
            File createTempFile = File.createTempFile("NanoHTTPD-", "", file);
            this.b = createTempFile;
            this.d = new FileOutputStream(createTempFile);
        }

        @Override // fi.iki.elonen.NanoHTTPD.n
        public void e() {
            NanoHTTPD.b(this.d);
            if (this.b.delete()) {
                return;
            }
            throw new Exception("could not delete temporary file: " + this.b.getAbsolutePath());
        }

        @Override // fi.iki.elonen.NanoHTTPD.n
        public String c() {
            return this.b.getAbsolutePath();
        }
    }

    /* loaded from: classes5.dex */
    public static class f implements r {
        private final File c;
        private final List<n> d;

        public f() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.c = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.d = new ArrayList();
        }

        @Override // fi.iki.elonen.NanoHTTPD.r
        public void b() {
            for (n nVar : this.d) {
                try {
                    nVar.e();
                } catch (Exception e) {
                    NanoHTTPD.c.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
            this.d.clear();
        }

        @Override // fi.iki.elonen.NanoHTTPD.r
        public n b(String str) {
            g gVar = new g(this.c);
            this.d.add(gVar);
            return gVar;
        }
    }

    /* loaded from: classes5.dex */
    class i implements s {
        private i() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.s
        public r e() {
            return new f();
        }
    }

    /* loaded from: classes5.dex */
    public static class h implements k {
        @Override // fi.iki.elonen.NanoHTTPD.k
        public ServerSocket b() {
            return new ServerSocket();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class a {
        private static final Pattern a = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
        private static final Pattern c = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        private static final Pattern e = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        private final String b;
        private final String d;
        private final String f;
        private final String j;

        public String b() {
            return this.b;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.j;
        }

        public String e() {
            String str = this.f;
            return str == null ? "US-ASCII" : str;
        }

        public a(String str) {
            String str2;
            this.j = str;
            if (str != null) {
                this.d = e(str, a, "", 1);
                str2 = e(str, c, null, 2);
            } else {
                this.d = "";
                str2 = "UTF-8";
            }
            this.f = str2;
            if ("multipart/form-data".equalsIgnoreCase(this.d)) {
                this.b = e(str, e, null, 2);
            } else {
                this.b = null;
            }
        }

        private String e(String str, Pattern pattern, String str2, int i) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(i) : str2;
        }

        public boolean a() {
            return "multipart/form-data".equalsIgnoreCase(this.d);
        }

        public a f() {
            if (this.f == null) {
                return new a(this.j + "; charset=UTF-8");
            }
            return this;
        }
    }

    /* loaded from: classes5.dex */
    protected class o implements l {
        private Map<String, String> b;
        private Method c;
        private c d;
        private final BufferedInputStream e;
        private String f;
        private String g;
        private Map<String, List<String>> h;
        private final OutputStream i;
        private String j;
        private String k;
        private int l;
        private String m;
        private final r n;

        /* renamed from: o  reason: collision with root package name */
        private int f13338o;

        @Override // fi.iki.elonen.NanoHTTPD.l
        public final Map<String, String> a() {
            return this.b;
        }

        @Override // fi.iki.elonen.NanoHTTPD.l
        public final Method c() {
            return this.c;
        }

        @Override // fi.iki.elonen.NanoHTTPD.l
        public final String h() {
            return this.m;
        }

        @Override // fi.iki.elonen.NanoHTTPD.l
        public String j() {
            return this.g;
        }

        public o(r rVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.n = rVar;
            this.e = new BufferedInputStream(inputStream, 8192);
            this.i = outputStream;
            this.k = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            this.j = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "localhost" : inetAddress.getHostName().toString();
            this.b = new HashMap();
        }

        private void b(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) {
            String d;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(63);
                if (indexOf >= 0) {
                    d(nextToken.substring(indexOf + 1), map2);
                    d = NanoHTTPD.d(nextToken.substring(0, indexOf));
                } else {
                    d = NanoHTTPD.d(nextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.f = stringTokenizer.nextToken();
                } else {
                    this.f = "HTTP/1.1";
                    NanoHTTPD.c.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String readLine2 = bufferedReader.readLine();
                while (readLine2 != null && !readLine2.trim().isEmpty()) {
                    int indexOf2 = readLine2.indexOf(58);
                    if (indexOf2 >= 0) {
                        map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                    }
                    readLine2 = bufferedReader.readLine();
                }
                map.put("uri", d);
            } catch (IOException e) {
                Response.Status status = Response.Status.INTERNAL_ERROR;
                throw new ResponseException(status, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        private void d(a aVar, ByteBuffer byteBuffer, Map<String, List<String>> map, Map<String, String> map2) {
            int i;
            String str;
            try {
                int[] c = c(byteBuffer, aVar.b().getBytes());
                int i2 = 2;
                if (c.length < 2) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i3 = 1024;
                byte[] bArr = new byte[1024];
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7 = 1;
                    if (i5 >= c.length - 1) {
                        return;
                    }
                    byteBuffer.position(c[i5]);
                    int remaining = byteBuffer.remaining() < i3 ? byteBuffer.remaining() : i3;
                    byteBuffer.get(bArr, i4, remaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i4, remaining), Charset.forName(aVar.e())), remaining);
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || !readLine.contains(aVar.b())) {
                        break;
                    }
                    String readLine2 = bufferedReader.readLine();
                    String str2 = null;
                    int i8 = i2;
                    String str3 = null;
                    String str4 = null;
                    while (readLine2 != null && readLine2.trim().length() > 0) {
                        Matcher matcher = NanoHTTPD.b.matcher(readLine2);
                        if (matcher.matches()) {
                            Matcher matcher2 = NanoHTTPD.e.matcher(matcher.group(i2));
                            while (matcher2.find()) {
                                String group = matcher2.group(i7);
                                if ("name".equalsIgnoreCase(group)) {
                                    str = matcher2.group(2);
                                } else {
                                    if ("filename".equalsIgnoreCase(group)) {
                                        str3 = matcher2.group(2);
                                        if (!str3.isEmpty()) {
                                            if (i6 > 0) {
                                                str = str2 + String.valueOf(i6);
                                                i6++;
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                    i7 = 1;
                                }
                                str2 = str;
                                i7 = 1;
                            }
                        }
                        Matcher matcher3 = NanoHTTPD.d.matcher(readLine2);
                        if (matcher3.matches()) {
                            i = 2;
                            str4 = matcher3.group(2).trim();
                        } else {
                            i = 2;
                        }
                        readLine2 = bufferedReader.readLine();
                        i8++;
                        i2 = i;
                        i7 = 1;
                    }
                    int i9 = i2;
                    int i10 = 0;
                    while (i8 > 0) {
                        i10 = e(bArr, i10);
                        i8--;
                    }
                    if (i10 >= remaining - 4) {
                        throw new ResponseException(Response.Status.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i11 = c[i5] + i10;
                    i5++;
                    int i12 = c[i5] - 4;
                    byteBuffer.position(i11);
                    List<String> list = map.get(str2);
                    if (list == null) {
                        list = new ArrayList<>();
                        map.put(str2, list);
                    }
                    if (str4 == null) {
                        byte[] bArr2 = new byte[i12 - i11];
                        byteBuffer.get(bArr2);
                        list.add(new String(bArr2, aVar.e()));
                    } else {
                        String b = b(byteBuffer, i11, i12 - i11, str3);
                        if (!map2.containsKey(str2)) {
                            map2.put(str2, b);
                        } else {
                            int i13 = i9;
                            while (true) {
                                if (!map2.containsKey(str2 + i13)) {
                                    break;
                                }
                                i13++;
                            }
                            map2.put(str2 + i13, b);
                        }
                        list.add(str3);
                    }
                    i2 = i9;
                    i3 = 1024;
                    i4 = 0;
                }
                throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
            } catch (ResponseException e) {
                throw e;
            } catch (Exception e2) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, e2.toString());
            }
        }

        private int e(byte[] bArr, int i) {
            byte b;
            do {
                b = bArr[i];
                i++;
            } while (b != 10);
            return i;
        }

        private void d(String str, Map<String, List<String>> map) {
            String trim;
            String str2;
            if (str == null) {
                this.g = "";
                return;
            }
            this.g = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    trim = NanoHTTPD.d(nextToken.substring(0, indexOf)).trim();
                    str2 = NanoHTTPD.d(nextToken.substring(indexOf + 1));
                } else {
                    trim = NanoHTTPD.d(nextToken).trim();
                    str2 = "";
                }
                List<String> list = map.get(trim);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(trim, list);
                }
                list.add(str2);
            }
        }

        public void e() {
            byte[] bArr;
            boolean z;
            int read;
            Response response = null;
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    bArr = new byte[8192];
                                    z = false;
                                    this.l = 0;
                                    this.f13338o = 0;
                                    this.e.mark(8192);
                                    try {
                                        read = this.e.read(bArr, 0, 8192);
                                    } catch (SSLException e) {
                                        throw e;
                                    } catch (IOException unused) {
                                        NanoHTTPD.b(this.e);
                                        NanoHTTPD.b(this.i);
                                        throw new SocketException("NanoHttpd Shutdown");
                                    }
                                } catch (IOException e2) {
                                    NanoHTTPD.e(Response.Status.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e2.getMessage()).e(this.i);
                                    NanoHTTPD.b(this.i);
                                }
                            } catch (SocketException e3) {
                                throw e3;
                            }
                        } catch (ResponseException e4) {
                            NanoHTTPD.e(e4.d(), "text/plain", e4.getMessage()).e(this.i);
                            NanoHTTPD.b(this.i);
                        }
                    } catch (SSLException e5) {
                        NanoHTTPD.e(Response.Status.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e5.getMessage()).e(this.i);
                        NanoHTTPD.b(this.i);
                    }
                    if (read == -1) {
                        NanoHTTPD.b(this.e);
                        NanoHTTPD.b(this.i);
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                    while (read > 0) {
                        int i = this.f13338o + read;
                        this.f13338o = i;
                        int a = a(bArr, i);
                        this.l = a;
                        if (a > 0) {
                            break;
                        }
                        BufferedInputStream bufferedInputStream = this.e;
                        int i2 = this.f13338o;
                        read = bufferedInputStream.read(bArr, i2, 8192 - i2);
                    }
                    if (this.l < this.f13338o) {
                        this.e.reset();
                        this.e.skip(this.l);
                    }
                    this.h = new HashMap();
                    Map<String, String> map = this.b;
                    if (map == null) {
                        this.b = new HashMap();
                    } else {
                        map.clear();
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f13338o)));
                    HashMap hashMap = new HashMap();
                    b(bufferedReader, hashMap, this.h, this.b);
                    String str = this.k;
                    if (str != null) {
                        this.b.put("remote-addr", str);
                        this.b.put("http-client-ip", this.k);
                    }
                    Method d = Method.d(hashMap.get("method"));
                    this.c = d;
                    if (d == null) {
                        throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + hashMap.get("method") + " unhandled.");
                    }
                    this.m = hashMap.get("uri");
                    this.d = new c(this.b);
                    String str2 = this.b.get("connection");
                    boolean z2 = "HTTP/1.1".equals(this.f) && (str2 == null || !str2.matches("(?i).*close.*"));
                    response = NanoHTTPD.this.d(this);
                    if (response == null) {
                        throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                    }
                    String str3 = this.b.get("accept-encoding");
                    this.d.a(response);
                    response.a(this.c);
                    if (NanoHTTPD.this.e(response) && str3 != null && str3.contains("gzip")) {
                        z = true;
                    }
                    response.a(z);
                    response.e(z2);
                    response.e(this.i);
                    if (!z2 || response.c()) {
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                } catch (SocketTimeoutException e6) {
                    throw e6;
                }
            } finally {
                NanoHTTPD.b((Object) null);
                this.n.b();
            }
        }

        private int a(byte[] bArr, int i) {
            int i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i) {
                    return 0;
                }
                byte b = bArr[i3];
                if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                    return i3 + 4;
                }
                if (b == 10 && bArr[i4] == 10) {
                    return i3 + 2;
                }
                i3 = i4;
            }
        }

        private int[] c(ByteBuffer byteBuffer, byte[] bArr) {
            int[] iArr = new int[0];
            if (byteBuffer.remaining() < bArr.length) {
                return iArr;
            }
            int length = bArr.length + 4096;
            byte[] bArr2 = new byte[length];
            int remaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
            byteBuffer.get(bArr2, 0, remaining);
            int length2 = remaining - bArr.length;
            int i = 0;
            do {
                for (int i2 = 0; i2 < length2; i2++) {
                    for (int i3 = 0; i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]; i3++) {
                        if (i3 == bArr.length - 1) {
                            int[] iArr2 = new int[iArr.length + 1];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            iArr2[iArr.length] = i + i2;
                            iArr = iArr2;
                        }
                    }
                }
                i += length2;
                System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
                length2 = length - bArr.length;
                if (byteBuffer.remaining() < length2) {
                    length2 = byteBuffer.remaining();
                }
                byteBuffer.get(bArr2, bArr.length, length2);
            } while (length2 > 0);
            return iArr;
        }

        @Override // fi.iki.elonen.NanoHTTPD.l
        @Deprecated
        public final Map<String, String> d() {
            HashMap hashMap = new HashMap();
            for (String str : this.h.keySet()) {
                hashMap.put(str, this.h.get(str).get(0));
            }
            return hashMap;
        }

        private RandomAccessFile f() {
            try {
                return new RandomAccessFile(this.n.b(null).c(), "rw");
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public long b() {
            if (this.b.containsKey("content-length")) {
                return Long.parseLong(this.b.get("content-length"));
            }
            int i = this.l;
            int i2 = this.f13338o;
            if (i < i2) {
                return i2 - i;
            }
            return 0L;
        }

        @Override // fi.iki.elonen.NanoHTTPD.l
        public void b(Map<String, String> map) {
            RandomAccessFile f;
            ByteArrayOutputStream byteArrayOutputStream;
            DataOutput dataOutput;
            ByteBuffer map2;
            RandomAccessFile randomAccessFile = null;
            try {
                long b = b();
                if (b < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    dataOutput = new DataOutputStream(byteArrayOutputStream);
                    f = null;
                } else {
                    f = f();
                    byteArrayOutputStream = null;
                    dataOutput = f;
                }
                try {
                    byte[] bArr = new byte[512];
                    while (this.f13338o >= 0 && b > 0) {
                        int read = this.e.read(bArr, 0, (int) Math.min(b, 512L));
                        this.f13338o = read;
                        b -= read;
                        if (read > 0) {
                            dataOutput.write(bArr, 0, read);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        map2 = f.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, f.length());
                        f.seek(0L);
                    }
                    if (Method.POST.equals(this.c)) {
                        a aVar = new a(this.b.get("content-type"));
                        if (aVar.a()) {
                            if (aVar.b() == null) {
                                throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                            }
                            d(aVar, map2, this.h, map);
                        } else {
                            byte[] bArr2 = new byte[map2.remaining()];
                            map2.get(bArr2);
                            String trim = new String(bArr2, aVar.e()).trim();
                            if ("application/x-www-form-urlencoded".equalsIgnoreCase(aVar.c())) {
                                d(trim, this.h);
                            } else if (trim.length() != 0) {
                                map.put("postData", trim);
                            }
                        }
                    } else if (Method.PUT.equals(this.c)) {
                        map.put("content", b(map2, 0, map2.limit(), (String) null));
                    }
                    NanoHTTPD.b(f);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = f;
                    NanoHTTPD.b(randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private String b(ByteBuffer byteBuffer, int i, int i2, String str) {
            FileOutputStream fileOutputStream;
            if (i2 <= 0) {
                return "";
            }
            try {
                try {
                    n b = this.n.b(str);
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    fileOutputStream = new FileOutputStream(b.c());
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        duplicate.position(i).limit(i + i2);
                        channel.write(duplicate.slice());
                        String c = b.c();
                        NanoHTTPD.b(fileOutputStream);
                        return c;
                    } catch (Exception e) {
                        e = e;
                        throw new Error(e);
                    } catch (Throwable th) {
                        th = th;
                        NanoHTTPD.b(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum Method {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH,
        PROPFIND,
        PROPPATCH,
        MKCOL,
        MOVE,
        COPY,
        LOCK,
        UNLOCK;

        static Method d(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class Response implements Closeable {
        private long a;
        private boolean b;
        private boolean d;
        private InputStream e;
        private String f;
        private Method g;
        private boolean i;
        private b j;
        private final Map<String, String> c = new HashMap<String, String>() { // from class: fi.iki.elonen.NanoHTTPD.Response.1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            /* renamed from: e */
            public String put(String str, String str2) {
                Response.this.h.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            }
        };
        private final Map<String, String> h = new HashMap();

        /* loaded from: classes5.dex */
        public interface b {
            String b();
        }

        public String a() {
            return this.f;
        }

        public void a(Method method) {
            this.g = method;
        }

        public void a(boolean z) {
            this.b = z;
        }

        public void b(boolean z) {
            this.d = z;
        }

        public void e(boolean z) {
            this.i = z;
        }

        /* loaded from: classes5.dex */
        public enum Status implements b {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            MULTI_STATUS(207, "Multi-Status"),
            REDIRECT(301, "Moved Permanently"),
            FOUND(302, "Found"),
            REDIRECT_SEE_OTHER(303, "See Other"),
            NOT_MODIFIED(304, "Not Modified"),
            TEMPORARY_REDIRECT(307, "Temporary Redirect"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            GONE(410, "Gone"),
            LENGTH_REQUIRED(411, "Length Required"),
            PRECONDITION_FAILED(412, "Precondition Failed"),
            PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
            UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");
            
            private final int E;
            private final String F;

            Status(int i, String str) {
                this.E = i;
                this.F = str;
            }

            @Override // fi.iki.elonen.NanoHTTPD.Response.b
            public String b() {
                return "" + this.E + " " + this.F;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static class c extends FilterOutputStream {
            public c(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                ((FilterOutputStream) this).out.write(HTTP.CRLF.getBytes());
            }

            public void a() {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }
        }

        protected Response(b bVar, String str, InputStream inputStream, long j) {
            this.j = bVar;
            this.f = str;
            if (inputStream == null) {
                this.e = new ByteArrayInputStream(new byte[0]);
                this.a = 0L;
            } else {
                this.e = inputStream;
                this.a = j;
            }
            this.d = this.a < 0;
            this.i = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.e;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public void d(String str, String str2) {
            this.c.put(str, str2);
        }

        public boolean c() {
            return "close".equals(b("connection"));
        }

        public String b(String str) {
            return this.h.get(str.toLowerCase());
        }

        protected void e(OutputStream outputStream) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(C8543dpm.c("GMT"));
            try {
                if (this.j == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new a(this.f).e())), false);
                printWriter.append("HTTP/1.1 ").append((CharSequence) this.j.b()).append(" \r\n");
                String str = this.f;
                if (str != null) {
                    c(printWriter, "Content-Type", str);
                }
                if (b("date") == null) {
                    c(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry<String, String> entry : this.c.entrySet()) {
                    c(printWriter, entry.getKey(), entry.getValue());
                }
                if (b("connection") == null) {
                    c(printWriter, "Connection", this.i ? "keep-alive" : "close");
                }
                if (b("content-length") != null) {
                    this.b = false;
                }
                if (this.b) {
                    c(printWriter, "Content-Encoding", "gzip");
                    b(true);
                }
                long j = this.e != null ? this.a : 0L;
                if (this.g != Method.HEAD && this.d) {
                    c(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.b) {
                    j = d(printWriter, j);
                }
                printWriter.append(HTTP.CRLF);
                printWriter.flush();
                e(outputStream, j);
                outputStream.flush();
                NanoHTTPD.b(this.e);
            } catch (IOException e) {
                NanoHTTPD.c.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
            }
        }

        protected void c(PrintWriter printWriter, String str, String str2) {
            printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append(HTTP.CRLF);
        }

        protected long d(PrintWriter printWriter, long j) {
            String b2 = b("content-length");
            if (b2 != null) {
                try {
                    j = Long.parseLong(b2);
                } catch (NumberFormatException unused) {
                    Logger logger = NanoHTTPD.c;
                    logger.severe("content-length was no number " + b2);
                }
            }
            printWriter.print("Content-Length: " + j + HTTP.CRLF);
            return j;
        }

        private void e(OutputStream outputStream, long j) {
            if (this.g != Method.HEAD && this.d) {
                c cVar = new c(outputStream);
                b(cVar, -1L);
                cVar.a();
                return;
            }
            b(outputStream, j);
        }

        private void b(OutputStream outputStream, long j) {
            if (this.b) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                d(gZIPOutputStream, -1L);
                gZIPOutputStream.finish();
                return;
            }
            d(outputStream, j);
        }

        private void d(OutputStream outputStream, long j) {
            byte[] bArr = new byte[(int) 16384];
            boolean z = j == -1;
            while (true) {
                if (j <= 0 && !z) {
                    return;
                }
                int read = this.e.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z) {
                    j -= read;
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class ResponseException extends Exception {
        private static final long serialVersionUID = 6569838532917408380L;
        private final Response.Status d;

        public Response.Status d() {
            return this.d;
        }

        public ResponseException(Response.Status status, String str) {
            super(str);
            this.d = status;
        }

        public ResponseException(Response.Status status, String str, Exception exc) {
            super(str, exc);
            this.d = status;
        }
    }

    /* loaded from: classes5.dex */
    public class m implements Runnable {
        private IOException c;
        private boolean d = false;
        private final int e;

        public m(int i) {
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                NanoHTTPD.this.h.bind(NanoHTTPD.this.i != null ? new InetSocketAddress(NanoHTTPD.this.i, NanoHTTPD.this.j) : new InetSocketAddress(NanoHTTPD.this.j));
                this.d = true;
                do {
                    try {
                        Socket accept = NanoHTTPD.this.h.accept();
                        int i = this.e;
                        if (i > 0) {
                            accept.setSoTimeout(i);
                        }
                        InputStream inputStream = accept.getInputStream();
                        NanoHTTPD nanoHTTPD = NanoHTTPD.this;
                        nanoHTTPD.a.e(nanoHTTPD.a(accept, inputStream));
                    } catch (IOException e) {
                        NanoHTTPD.c.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!NanoHTTPD.this.h.isClosed());
            } catch (IOException e2) {
                this.c = e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e2) {
                c.log(Level.SEVERE, "Could not close", (Throwable) e2);
            }
        }
    }

    public NanoHTTPD(int i2) {
        this(null, i2);
    }

    public NanoHTTPD(String str, int i2) {
        this.f = new h();
        this.i = str;
        this.j = i2;
        a(new i());
        b((b) new j());
    }

    protected d a(Socket socket, InputStream inputStream) {
        return new d(inputStream, socket);
    }

    protected m a(int i2) {
        return new m(i2);
    }

    protected static String d(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            c.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e2);
            return null;
        }
    }

    protected boolean e(Response response) {
        return response.a() != null && (response.a().toLowerCase().contains("text/") || response.a().toLowerCase().contains("/json"));
    }

    public final int h() {
        if (this.h == null) {
            return -1;
        }
        return this.h.getLocalPort();
    }

    public static Response e(Response.b bVar, String str, InputStream inputStream, long j2) {
        return new Response(bVar, str, inputStream, j2);
    }

    public static Response e(Response.b bVar, String str, String str2) {
        byte[] bArr;
        a aVar = new a(str);
        if (str2 == null) {
            return e(bVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(aVar.e()).newEncoder().canEncode(str2)) {
                aVar = aVar.f();
            }
            bArr = str2.getBytes(aVar.e());
        } catch (UnsupportedEncodingException e2) {
            c.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e2);
            bArr = new byte[0];
        }
        return e(bVar, aVar.d(), new ByteArrayInputStream(bArr), bArr.length);
    }

    public Response d(l lVar) {
        HashMap hashMap = new HashMap();
        Method c2 = lVar.c();
        if (Method.PUT.equals(c2) || Method.POST.equals(c2)) {
            try {
                lVar.b(hashMap);
            } catch (ResponseException e2) {
                return e(e2.d(), "text/plain", e2.getMessage());
            } catch (IOException e3) {
                Response.Status status = Response.Status.INTERNAL_ERROR;
                return e(status, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage());
            }
        }
        Map<String, String> d2 = lVar.d();
        d2.put("NanoHttpd.QUERY_STRING", lVar.j());
        return c(lVar.h(), c2, lVar.a(), d2, hashMap);
    }

    @Deprecated
    public Response c(String str, Method method, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return e(Response.Status.NOT_FOUND, "text/plain", "Not Found");
    }

    public void b() {
        c(5000);
    }

    public void c(int i2) {
        b(i2, true);
    }

    public void b(int i2, boolean z) {
        this.h = g().b();
        this.h.setReuseAddress(true);
        m a2 = a(i2);
        Thread thread = new Thread(a2);
        this.g = thread;
        thread.setDaemon(z);
        this.g.setName("NanoHttpd Main Listener");
        this.g.start();
        while (!a2.d && a2.c == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (a2.c != null) {
            throw a2.c;
        }
    }
}
