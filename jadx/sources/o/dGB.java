package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.text.Regex;
import o.AbstractC7820dGo;
import o.AbstractC7825dGt;
import o.AbstractC7829dGx;
import o.C7819dGn;
import o.dIA;
import okio.ByteString;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class dGB {
    public static final AbstractC7829dGx a;
    public static final C7819dGn b = C7819dGn.a.c(new String[0]);
    public static final TimeZone c;
    public static final byte[] d;
    public static final AbstractC7825dGt e;
    public static final String f;
    private static final Regex g;
    public static final boolean h;
    private static final dIA j;

    public static final long a(int i, long j2) {
        return i & j2;
    }

    public static final int b(byte b2, int i) {
        return b2 & i;
    }

    public static final int c(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final int c(short s, int i) {
        return s & i;
    }

    static {
        String c2;
        String b2;
        byte[] bArr = new byte[0];
        d = bArr;
        a = AbstractC7829dGx.c.b(AbstractC7829dGx.b, bArr, null, 1, null);
        e = AbstractC7825dGt.c.b(AbstractC7825dGt.d, bArr, null, 0, 0, 7, null);
        dIA.c cVar = dIA.a;
        ByteString.b bVar = ByteString.c;
        j = cVar.e(bVar.c("efbbbf"), bVar.c("feff"), bVar.c("fffe"), bVar.c("0000ffff"), bVar.c("ffff0000"));
        TimeZone c3 = C8543dpm.c("GMT");
        if (c3 == null) {
            C8632dsu.e();
        }
        c = c3;
        g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = false;
        String name = C7823dGr.class.getName();
        C8632dsu.b(name, "");
        c2 = duD.c(name, (CharSequence) "okhttp3.");
        b2 = duD.b(c2, (CharSequence) "Client");
        f = b2;
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* loaded from: classes5.dex */
    static final class d implements ThreadFactory {
        final /* synthetic */ String b;
        final /* synthetic */ boolean e;

        d(String str, boolean z) {
            this.b = str;
            this.e = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.b);
            thread.setDaemon(this.e);
            return thread;
        }
    }

    public static final ThreadFactory d(String str, boolean z) {
        C8632dsu.d((Object) str, "");
        return new d(str, z);
    }

    public static final String[] b(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C8632dsu.d(strArr, "");
        C8632dsu.d(strArr2, "");
        C8632dsu.d(comparator, "");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean d(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C8632dsu.d(strArr, "");
        C8632dsu.d(comparator, "");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ String a(C7818dGm c7818dGm, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return d(c7818dGm, z);
    }

    public static final String d(C7818dGm c7818dGm, boolean z) {
        boolean d2;
        String f2;
        C8632dsu.d(c7818dGm, "");
        d2 = duD.d((CharSequence) c7818dGm.f(), (CharSequence) ":", false, 2, (Object) null);
        if (d2) {
            f2 = '[' + c7818dGm.f() + ']';
        } else {
            f2 = c7818dGm.f();
        }
        if (z || c7818dGm.n() != C7818dGm.a.e(c7818dGm.l())) {
            return f2 + ':' + c7818dGm.n();
        }
        return f2;
    }

    public static final String[] a(String[] strArr, String str) {
        int w;
        C8632dsu.d(strArr, "");
        C8632dsu.d((Object) str, "");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C8632dsu.b(copyOf, "");
        String[] strArr2 = (String[]) copyOf;
        w = C8563dqf.w(strArr2);
        strArr2[w] = str;
        return strArr2;
    }

    public static /* synthetic */ int b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return d(str, i, i2);
    }

    public static final int d(String str, int i, int i2) {
        C8632dsu.d((Object) str, "");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int a(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return a(str, i, i2);
    }

    public static final int a(String str, int i, int i2) {
        C8632dsu.d((Object) str, "");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ String d(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return c(str, i, i2);
    }

    public static final String c(String str, int i, int i2) {
        C8632dsu.d((Object) str, "");
        int d2 = d(str, i, i2);
        String substring = str.substring(d2, a(str, d2, i2));
        C8632dsu.b(substring, "");
        return substring;
    }

    public static final int b(String str, String str2, int i, int i2) {
        boolean a2;
        C8632dsu.d((Object) str, "");
        C8632dsu.d((Object) str2, "");
        while (i < i2) {
            a2 = duD.a((CharSequence) str2, str.charAt(i), false, 2, (Object) null);
            if (a2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int c(String str, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return b(str, c2, i, i2);
    }

    public static final int b(String str, char c2, int i, int i2) {
        C8632dsu.d((Object) str, "");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int a(String str) {
        C8632dsu.d((Object) str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean b(String str) {
        C8632dsu.d((Object) str, "");
        return g.e(str);
    }

    public static final String a(String str, Object... objArr) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d(objArr, "");
        dsE dse = dsE.b;
        Locale locale = Locale.US;
        C8632dsu.b(locale, "");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C8632dsu.b(format, "");
        return format;
    }

    public static final int c(String str, long j2, TimeUnit timeUnit) {
        C8632dsu.d((Object) str, "");
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        } else if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        } else {
            long millis = timeUnit.toMillis(j2);
            if (millis > Integer.MAX_VALUE) {
                throw new IllegalArgumentException((str + " too large.").toString());
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException((str + " too small.").toString());
            }
        }
    }

    public static final C7819dGn b(List<C7845dHm> list) {
        C8632dsu.d(list, "");
        C7819dGn.d dVar = new C7819dGn.d();
        for (C7845dHm c7845dHm : list) {
            dVar.e(c7845dHm.c().m(), c7845dHm.b().m());
        }
        return dVar.b();
    }

    public static final List<C7845dHm> c(C7819dGn c7819dGn) {
        C8654dtp g2;
        int d2;
        C8632dsu.d(c7819dGn, "");
        g2 = C8657dts.g(0, c7819dGn.c());
        d2 = C8572dqo.d(g2, 10);
        ArrayList arrayList = new ArrayList(d2);
        Iterator<Integer> it = g2.iterator();
        while (it.hasNext()) {
            int nextInt = ((dqB) it).nextInt();
            arrayList.add(new C7845dHm(c7819dGn.c(nextInt), c7819dGn.a(nextInt)));
        }
        return arrayList;
    }

    public static final boolean b(C7818dGm c7818dGm, C7818dGm c7818dGm2) {
        C8632dsu.d(c7818dGm, "");
        C8632dsu.d(c7818dGm2, "");
        return C8632dsu.c((Object) c7818dGm.f(), (Object) c7818dGm2.f()) && c7818dGm.n() == c7818dGm2.n() && C8632dsu.c((Object) c7818dGm.l(), (Object) c7818dGm2.l());
    }

    /* loaded from: classes5.dex */
    public static final class c implements AbstractC7820dGo.e {
        final /* synthetic */ AbstractC7820dGo b;

        @Override // o.AbstractC7820dGo.e
        public AbstractC7820dGo c(dFY dfy) {
            C8632dsu.d(dfy, "");
            return this.b;
        }

        c(AbstractC7820dGo abstractC7820dGo) {
            this.b = abstractC7820dGo;
        }
    }

    public static final AbstractC7820dGo.e b(AbstractC7820dGo abstractC7820dGo) {
        C8632dsu.d(abstractC7820dGo, "");
        return new c(abstractC7820dGo);
    }

    public static final void e(dIq diq, int i) {
        C8632dsu.d(diq, "");
        diq.c((i >>> 16) & PrivateKeyType.INVALID);
        diq.c((i >>> 8) & PrivateKeyType.INVALID);
        diq.c(i & PrivateKeyType.INVALID);
    }

    public static final int c(InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.d(interfaceC7871dIn, "");
        return b(interfaceC7871dIn.l(), (int) PrivateKeyType.INVALID) | (b(interfaceC7871dIn.l(), (int) PrivateKeyType.INVALID) << 16) | (b(interfaceC7871dIn.l(), (int) PrivateKeyType.INVALID) << 8);
    }

    public static final boolean e(dIJ dij, int i, TimeUnit timeUnit) {
        C8632dsu.d(dij, "");
        C8632dsu.d(timeUnit, "");
        long nanoTime = System.nanoTime();
        long cE_ = dij.e().cF_() ? dij.e().cE_() - nanoTime : Long.MAX_VALUE;
        dij.e().e(Math.min(cE_, timeUnit.toNanos(i)) + nanoTime);
        try {
            C7872dIo c7872dIo = new C7872dIo();
            while (dij.b(c7872dIo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c7872dIo.d();
            }
            if (cE_ == Long.MAX_VALUE) {
                dij.e().cC_();
            } else {
                dij.e().e(nanoTime + cE_);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (cE_ == Long.MAX_VALUE) {
                dij.e().cC_();
            } else {
                dij.e().e(nanoTime + cE_);
            }
            return false;
        } catch (Throwable th) {
            if (cE_ == Long.MAX_VALUE) {
                dij.e().cC_();
            } else {
                dij.e().e(nanoTime + cE_);
            }
            throw th;
        }
    }

    public static final boolean c(dIJ dij, int i, TimeUnit timeUnit) {
        C8632dsu.d(dij, "");
        C8632dsu.d(timeUnit, "");
        try {
            return e(dij, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean c(Socket socket, InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.d(socket, "");
        C8632dsu.d(interfaceC7871dIn, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean m = interfaceC7871dIn.m();
                socket.setSoTimeout(soTimeout);
                return !m;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int a(C7872dIo c7872dIo, byte b2) {
        C8632dsu.d(c7872dIo, "");
        int i = 0;
        while (!c7872dIo.m() && c7872dIo.a(0L) == b2) {
            i++;
            c7872dIo.l();
        }
        return i;
    }

    public static final int d(String str, int i) {
        C8632dsu.d((Object) str, "");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long e(C7824dGs c7824dGs) {
        C8632dsu.d(c7824dGs, "");
        String a2 = c7824dGs.j().a("Content-Length");
        if (a2 != null) {
            return b(a2, -1L);
        }
        return -1L;
    }

    public static final long b(String str, long j2) {
        C8632dsu.d((Object) str, "");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int c(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final <T> List<T> e(List<? extends T> list) {
        List n;
        C8632dsu.d(list, "");
        n = C8576dqs.n(list);
        List<T> unmodifiableList = Collections.unmodifiableList(n);
        C8632dsu.b(unmodifiableList, "");
        return unmodifiableList;
    }

    @SafeVarargs
    public static final <T> List<T> a(T... tArr) {
        C8632dsu.d(tArr, "");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        C8632dsu.b(unmodifiableList, "");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        Map<K, V> d2;
        C8632dsu.d(map, "");
        if (map.isEmpty()) {
            d2 = dqE.d();
            return d2;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C8632dsu.b(unmodifiableMap, "");
        return unmodifiableMap;
    }

    public static final void e(Closeable closeable) {
        C8632dsu.d(closeable, "");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        C8632dsu.d(socket, "");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final boolean c(InterfaceC7855dHw interfaceC7855dHw, File file) {
        C8632dsu.d(interfaceC7855dHw, "");
        C8632dsu.d(file, "");
        dIH d2 = interfaceC7855dHw.d(file);
        try {
            try {
                interfaceC7855dHw.b(file);
                C8608drx.a(d2, null);
                return true;
            } catch (IOException unused) {
                dpR dpr = dpR.c;
                C8608drx.a(d2, null);
                interfaceC7855dHw.b(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C8608drx.a(d2, th);
                throw th2;
            }
        }
    }

    public static final String c(long j2) {
        String hexString = Long.toHexString(j2);
        C8632dsu.b(hexString, "");
        return hexString;
    }

    public static final String e(int i) {
        String hexString = Integer.toHexString(i);
        C8632dsu.b(hexString, "");
        return hexString;
    }

    public static final <E> void d(List<E> list, E e2) {
        C8632dsu.d(list, "");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    public static final Throwable d(Exception exc, List<? extends Exception> list) {
        C8632dsu.d(exc, "");
        C8632dsu.d(list, "");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            exc.addSuppressed(exc2);
        }
        return exc;
    }

    public static final int d(String[] strArr, String str, Comparator<String> comparator) {
        C8632dsu.d(strArr, "");
        C8632dsu.d((Object) str, "");
        C8632dsu.d(comparator, "");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }
}
