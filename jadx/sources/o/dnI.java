package o;

import android.support.v4.media.session.PlaybackStateCompat;
import com.netflix.android.org.json.HTTP;
import okio.ByteString;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dnI implements dIJ {
    private long f;
    private final C7872dIo g;
    private final C7872dIo h;
    private boolean i;
    private final InterfaceC7871dIn k;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private ByteString f13861o;
    static final ByteString a = ByteString.e("[]{}\"'/#");
    static final ByteString j = ByteString.e("'\\");
    static final ByteString d = ByteString.e("\"\\");
    static final ByteString e = ByteString.e(HTTP.CRLF);
    static final ByteString c = ByteString.e("*");
    static final ByteString b = ByteString.e;

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i = true;
    }

    private void d(long j2) {
        ByteString byteString;
        long j3;
        ByteString byteString2;
        long j4;
        while (true) {
            long j5 = this.f;
            if (j5 >= j2) {
                return;
            }
            ByteString byteString3 = this.f13861o;
            ByteString byteString4 = b;
            if (byteString3 == byteString4) {
                return;
            }
            if (j5 == this.h.D()) {
                if (this.f > 0) {
                    return;
                }
                this.k.g(1L);
            }
            long e2 = this.h.e(this.f13861o, this.f);
            if (e2 == -1) {
                this.f = this.h.D();
            } else {
                byte a2 = this.h.a(e2);
                ByteString byteString5 = this.f13861o;
                ByteString byteString6 = a;
                if (byteString5 == byteString6) {
                    if (a2 == 34) {
                        byteString = d;
                    } else if (a2 == 35) {
                        byteString = e;
                    } else if (a2 == 39) {
                        byteString = j;
                    } else if (a2 != 47) {
                        if (a2 != 91) {
                            if (a2 != 93) {
                                if (a2 != 123) {
                                    if (a2 != 125) {
                                    }
                                }
                            }
                            int i = this.n - 1;
                            this.n = i;
                            if (i == 0) {
                                this.f13861o = byteString4;
                            }
                            this.f = e2 + 1;
                        }
                        this.n++;
                        this.f = e2 + 1;
                    } else {
                        long j6 = 2 + e2;
                        this.k.g(j6);
                        j3 = e2 + 1;
                        byte a3 = this.h.a(j3);
                        if (a3 == 47) {
                            byteString2 = e;
                        } else if (a3 == 42) {
                            byteString2 = c;
                        } else {
                            this.f = j3;
                        }
                        this.f13861o = byteString2;
                        this.f = j6;
                    }
                    this.f13861o = byteString;
                    j3 = e2 + 1;
                    this.f = j3;
                } else if (byteString5 == j || byteString5 == d) {
                    if (a2 == 92) {
                        j4 = e2 + 2;
                        this.k.g(j4);
                    } else {
                        if (this.n > 0) {
                            byteString4 = byteString6;
                        }
                        this.f13861o = byteString4;
                        j4 = e2 + 1;
                    }
                    this.f = j4;
                } else {
                    if (byteString5 == c) {
                        long j7 = 2 + e2;
                        this.k.g(j7);
                        long j8 = e2 + 1;
                        if (this.h.a(j8) == 47) {
                            this.f = j7;
                        } else {
                            this.f = j8;
                        }
                    } else if (byteString5 != e) {
                        throw new AssertionError();
                    } else {
                        this.f = e2 + 1;
                    }
                    this.f13861o = byteString6;
                }
            }
        }
    }

    public void a() {
        this.i = true;
        while (this.f13861o != b) {
            d(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            this.k.h(this.f);
        }
    }

    @Override // o.dIJ
    public long b(C7872dIo c7872dIo, long j2) {
        if (this.i) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return 0L;
        }
        if (!this.g.m()) {
            long b2 = this.g.b(c7872dIo, j2);
            if (this.h.m()) {
                return b2;
            }
            long b3 = b(c7872dIo, j2 - b2);
            return b3 != -1 ? b2 + b3 : b2;
        }
        d(j2);
        long j3 = this.f;
        if (j3 == 0) {
            if (this.f13861o == b) {
                return -1L;
            }
            throw new AssertionError();
        }
        long min = Math.min(j2, j3);
        c7872dIo.a(this.h, min);
        this.f -= min;
        return min;
    }

    @Override // o.dIJ
    public dIK e() {
        return this.k.e();
    }
}
