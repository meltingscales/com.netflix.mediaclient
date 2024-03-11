package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.MslKeyExchangeException;
import com.netflix.msl.MslMasterTokenException;
import com.netflix.msl.MslMessageException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class dkI extends InputStream {
    private final AbstractC8393djy d;
    private final MslContext e;
    private final dkC h;
    private final AbstractC8393djy i;
    private final AbstractC8409dkn p;
    private final InputStream t;
    private long n = 1;
    private boolean f = false;
    private Boolean g = null;
    private boolean a = false;
    private boolean b = false;
    private final List<ByteArrayInputStream> k = new LinkedList();
    private ListIterator<ByteArrayInputStream> j = null;

    /* renamed from: o  reason: collision with root package name */
    private int f13855o = 0;
    private int m = 0;
    private ByteArrayInputStream c = null;
    private IOException l = null;

    public AbstractC8393djy b() {
        return this.i;
    }

    public void b(boolean z) {
        this.a = z;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    private static AbstractC8393djy b(MslContext mslContext, dkG dkg, Set<AbstractC8412dkq> set) {
        dkO a = dkg.a();
        AbstractC8420dky b = dkg.b();
        Throwable e = null;
        if (b == null) {
            return null;
        }
        dkO c = b.c();
        if (c.g()) {
            return new djB(mslContext, c);
        }
        C8415dkt d = b.d();
        AbstractC8411dkp c2 = mslContext.c(d);
        if (c2 == null) {
            throw new MslKeyExchangeException(C8373dje.ae, d.b());
        }
        Iterator<AbstractC8412dkq> it = set.iterator();
        while (it.hasNext()) {
            AbstractC8412dkq next = it.next();
            if (d.equals(next.e())) {
                try {
                    return c2.b(mslContext, next, b, a);
                } catch (MslEncodingException e2) {
                    e = e2;
                    if (!it.hasNext()) {
                        throw e;
                    }
                } catch (MslEntityAuthException e3) {
                    e = e3;
                    if (!it.hasNext()) {
                        throw e;
                    }
                } catch (MslKeyExchangeException e4) {
                    e = e4;
                    if (!it.hasNext()) {
                        throw e;
                    }
                } catch (MslMasterTokenException e5) {
                    e = e5;
                    if (!it.hasNext()) {
                        throw e;
                    }
                }
            }
        }
        if (e != null) {
            if (e instanceof MslKeyExchangeException) {
                throw ((MslKeyExchangeException) e);
            }
            if (e instanceof MslEncodingException) {
                throw ((MslEncodingException) e);
            }
            if (e instanceof MslMasterTokenException) {
                throw ((MslMasterTokenException) e);
            }
            if (e instanceof MslEntityAuthException) {
                throw ((MslEntityAuthException) e);
            }
            throw new MslInternalException("Unexpected exception caught during key exchange.", e);
        }
        throw new MslKeyExchangeException(C8373dje.ao, Arrays.toString(set.toArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[Catch: MslException -> 0x0127, TryCatch #0 {MslException -> 0x0127, blocks: (B:7:0x0041, B:9:0x0045, B:11:0x004a, B:15:0x005b, B:17:0x0064, B:19:0x006a, B:21:0x0070, B:24:0x007b, B:25:0x0086, B:26:0x0087, B:28:0x008d, B:30:0x0093, B:32:0x0099, B:34:0x00a3, B:36:0x00a9, B:39:0x00b0, B:40:0x00b5, B:41:0x00b6, B:43:0x00bc, B:45:0x00c2, B:47:0x00cc, B:50:0x00d3, B:51:0x00da, B:52:0x00db, B:53:0x00e6, B:54:0x00e7, B:55:0x00f2, B:56:0x00f3, B:57:0x00f8, B:58:0x00f9, B:61:0x0101, B:64:0x0110, B:65:0x0119, B:66:0x011a, B:67:0x0125, B:16:0x005e), top: B:80:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3 A[Catch: MslException -> 0x0127, TryCatch #0 {MslException -> 0x0127, blocks: (B:7:0x0041, B:9:0x0045, B:11:0x004a, B:15:0x005b, B:17:0x0064, B:19:0x006a, B:21:0x0070, B:24:0x007b, B:25:0x0086, B:26:0x0087, B:28:0x008d, B:30:0x0093, B:32:0x0099, B:34:0x00a3, B:36:0x00a9, B:39:0x00b0, B:40:0x00b5, B:41:0x00b6, B:43:0x00bc, B:45:0x00c2, B:47:0x00cc, B:50:0x00d3, B:51:0x00da, B:52:0x00db, B:53:0x00e6, B:54:0x00e7, B:55:0x00f2, B:56:0x00f3, B:57:0x00f8, B:58:0x00f9, B:61:0x0101, B:64:0x0110, B:65:0x0119, B:66:0x011a, B:67:0x0125, B:16:0x005e), top: B:80:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dkI(com.netflix.msl.util.MslContext r4, java.io.InputStream r5, java.util.Set<o.AbstractC8412dkq> r6, java.util.Map<java.lang.String, o.AbstractC8393djy> r7) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dkI.<init>(com.netflix.msl.util.MslContext, java.io.InputStream, java.util.Set, java.util.Map):void");
    }

    protected void finalize() {
        super.finalize();
    }

    protected C8401dkf h() {
        if (a() != null) {
            if (this.f) {
                return null;
            }
            try {
                if (this.p.e(-1)) {
                    return this.p.b(-1);
                }
                this.f = true;
                return null;
            } catch (MslEncoderException e) {
                throw new MslEncodingException(C8373dje.bd, "payloadchunk", e);
            }
        }
        throw new MslInternalException("Read attempted with error message.");
    }

    protected dkM a(MslContext mslContext, C8401dkf c8401dkf, AbstractC8393djy abstractC8393djy) {
        return new dkM(mslContext, c8401dkf, abstractC8393djy);
    }

    protected ByteArrayInputStream f() {
        dkG a = a();
        if (a == null) {
            throw new MslInternalException("Read attempted with error message.");
        }
        ListIterator<ByteArrayInputStream> listIterator = this.j;
        if (listIterator != null && listIterator.hasNext()) {
            return this.j.next();
        }
        C8401dkf h = h();
        if (h == null) {
            return null;
        }
        dkM a2 = a(this.e, h, this.d);
        dkO a3 = a.a();
        djG c = a.c();
        dkU r = a.r();
        AbstractC8424dlb o2 = a.o();
        if (a2.a() != a.f()) {
            C8373dje c8373dje = C8373dje.bo;
            throw new MslMessageException(c8373dje, "payload mid " + a2.a() + " header mid " + a.f()).e(a3).d(c).b(r).a(o2);
        }
        long b = a2.b();
        long j = this.n;
        if (b != j) {
            C8373dje c8373dje2 = C8373dje.bm;
            throw new MslMessageException(c8373dje2, "payload seqno " + a2.b() + " expected seqno " + this.n).e(a3).d(c).b(r).a(o2);
        }
        this.n = j + 1;
        if (this.g == null) {
            this.g = Boolean.valueOf(a.s() && !a.d().isEmpty() && a2.c() && a2.d().length == 0);
        }
        if (a2.c()) {
            this.f = true;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2.d());
        List<ByteArrayInputStream> list = this.k;
        if (list != null) {
            list.add(byteArrayInputStream);
            this.j = null;
        }
        return byteArrayInputStream;
    }

    public boolean j() {
        dkG a = a();
        if (a == null) {
            return false;
        }
        if (a.t()) {
            return true;
        }
        if (this.g == null) {
            g();
        }
        return this.g.booleanValue();
    }

    public void c() {
        if (this.c == null) {
            g();
        }
    }

    private void g() {
        try {
            ByteArrayInputStream f = f();
            this.c = f;
            if (f == null) {
                this.g = Boolean.FALSE;
            }
        } catch (MslException e) {
            this.l = new IOException("Error reading the payload chunk.", e);
            throw e;
        }
    }

    public dkG a() {
        dkC dkc = this.h;
        if (dkc instanceof dkG) {
            return (dkG) dkc;
        }
        return null;
    }

    public C8416dku e() {
        dkC dkc = this.h;
        if (dkc instanceof C8416dku) {
            return (C8416dku) dkc;
        }
        return null;
    }

    public String d() {
        dkG a = a();
        if (a != null) {
            dkO a2 = a.a();
            if (a2 != null) {
                return a2.b();
            }
            return a.c().d();
        }
        return e().d().d();
    }

    @Override // java.io.InputStream
    public int available() {
        int indexOf;
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int available = byteArrayInputStream.available();
        List<ByteArrayInputStream> list = this.k;
        if (list != null && (indexOf = list.indexOf(this.c)) != -1 && indexOf < this.k.size() - 1) {
            ListIterator<ByteArrayInputStream> listIterator = this.k.listIterator(indexOf + 1);
            while (listIterator.hasNext()) {
                available += listIterator.next().available();
            }
        }
        return available;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.p.b();
        } catch (MslEncoderException unused) {
        }
        if (this.a) {
            this.t.close();
            return;
        }
        try {
            if (j() || a() == null) {
                return;
            }
            do {
            } while (f() != null);
        } catch (MslException unused2) {
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f13855o = i;
        this.m = 0;
        this.b = true;
        if (this.c != null) {
            while (this.k.size() > 0 && !this.k.get(0).equals(this.c)) {
                this.k.remove(0);
            }
            if (this.k.size() == 0) {
                this.k.add(this.c);
            }
            ListIterator<ByteArrayInputStream> listIterator = this.k.listIterator();
            this.j = listIterator;
            ByteArrayInputStream next = listIterator.next();
            this.c = next;
            next.mark(i);
            return;
        }
        this.j = null;
        this.k.clear();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        IOException iOException = this.l;
        if (iOException != null) {
            this.l = null;
            throw iOException;
        }
        try {
            if (j()) {
                return -1;
            }
            int i3 = 0;
            while (i3 < i2) {
                ByteArrayInputStream byteArrayInputStream = this.c;
                int read = byteArrayInputStream != null ? byteArrayInputStream.read(bArr, i + i3, i2 - i3) : -1;
                if (read != -1) {
                    i3 += read;
                } else {
                    try {
                        ByteArrayInputStream f = f();
                        this.c = f;
                        if (f == null) {
                            break;
                        }
                    } catch (MslException e) {
                        IOException iOException2 = new IOException("Error reading the payload chunk.", e);
                        if (i3 > 0) {
                            this.l = iOException2;
                            return i3;
                        }
                        throw iOException2;
                    }
                }
            }
            if (i3 != 0 || i2 <= 0) {
                if (this.b) {
                    int i4 = this.m + i3;
                    this.m = i4;
                    if (i4 > this.f13855o) {
                        this.b = false;
                        this.f13855o = 0;
                        this.m = 0;
                    }
                }
                return i3;
            }
            return -1;
        } catch (MslException e2) {
            this.l = null;
            throw new IOException("Error reading the payload chunk.", e2);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public void reset() {
        if (this.b) {
            for (ByteArrayInputStream byteArrayInputStream : this.k) {
                byteArrayInputStream.reset();
            }
            ListIterator<ByteArrayInputStream> listIterator = this.k.listIterator();
            this.j = listIterator;
            this.c = listIterator.hasNext() ? this.j.next() : null;
            this.m = 0;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long j2;
        int i = 0;
        while (true) {
            j2 = i;
            if (j2 >= j) {
                break;
            }
            ByteArrayInputStream byteArrayInputStream = this.c;
            long skip = byteArrayInputStream != null ? byteArrayInputStream.skip(j - j2) : 0L;
            if (skip != 0) {
                i = (int) (j2 + skip);
            } else {
                try {
                    ByteArrayInputStream f = f();
                    this.c = f;
                    if (f == null) {
                        break;
                    }
                } catch (MslException e) {
                    throw new IOException("Error skipping in the payload chunk.", e);
                } catch (MslInternalException e2) {
                    throw new IOException("Cannot skip data off an error message.", e2);
                }
            }
        }
        return j2;
    }

    public int i() {
        InputStream inputStream = this.t;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.hashCode();
    }
}
