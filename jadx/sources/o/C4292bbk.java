package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.bbk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4292bbk extends AbstractC9826xM implements InterfaceC9828xO {
    private final String a;
    private final File d;
    private BufferedOutputStream e;
    private final String f;
    private a g;
    private final String h;
    private final C4291bbj j;

    /* renamed from: o.bbk$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(long j);

        void a(VolleyError volleyError);

        void b(C4292bbk c4292bbk);

        void c();

        void d();
    }

    public C4292bbk(String str, File file, DownloadableType downloadableType, Request.Priority priority, a aVar) {
        super(str, priority);
        this.j = new C4291bbj();
        this.h = str;
        this.d = file;
        this.a = file.getName();
        this.g = aVar;
        e(this);
        this.f = "bytes=" + file.length() + "-";
        int i = AnonymousClass3.e[downloadableType.ordinal()];
        if (i == 1) {
            d(NetworkRequestType.CONTENT_AUDIO_DOWNLOAD);
        } else if (i == 2) {
            d(NetworkRequestType.CONTENT_VIDEO_DOWNLOAD);
        } else if (i == 3) {
            d(NetworkRequestType.CONTENT_SUBTITLES_DOWNLOAD);
        } else if (i != 4) {
        } else {
            d(NetworkRequestType.CONTENT_TRICKPLAY_DOWNLOAD);
        }
    }

    /* renamed from: o.bbk$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DownloadableType.values().length];
            e = iArr;
            try {
                iArr[DownloadableType.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[DownloadableType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[DownloadableType.Subtitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[DownloadableType.TrickPlay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void c(C9865xz c9865xz) {
        this.j.f = System.currentTimeMillis();
        this.j.a = this.d.length();
        c9865xz.e(this);
    }

    @Override // com.netflix.android.volley.Request
    public Map<String, String> j() {
        HashMap hashMap = new HashMap();
        hashMap.put("Range", this.f);
        return hashMap;
    }

    @Override // o.AbstractC9826xM
    public void c(long j) {
        if (this.e == null) {
            try {
                this.e = new BufferedOutputStream(new FileOutputStream(this.d, true));
            } catch (FileNotFoundException unused) {
                K();
                return;
            }
        }
        this.j.b = System.currentTimeMillis();
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(j);
        }
    }

    @Override // o.InterfaceC9828xO
    public void d(byte[] bArr, int i) {
        try {
            if (this.e == null) {
                C1044Mm.a("nf_httpUrlDownloader", "onNext mBufferedOutputStream null. not writing");
            } else if (D()) {
                C1044Mm.a("nf_httpUrlDownloader", "cancelled, closing file and returning");
                e((InterfaceC9828xO) null);
                L();
            } else if (i > 0) {
                this.e.write(bArr, 0, i);
                this.j.e += i;
                M();
            } else if (i < 0) {
                C1044Mm.a("nf_httpUrlDownloader", "onNext done count=" + i);
                e((InterfaceC9828xO) null);
                L();
                this.j.d = System.currentTimeMillis();
                Q();
            }
        } catch (IOException e) {
            C1044Mm.b("nf_httpUrlDownloader", e, "onNext write to disk failed", new Object[0]);
            e((InterfaceC9828xO) null);
            K();
            super.e();
        }
    }

    private void M() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // o.InterfaceC9828xO
    public void a(VolleyError volleyError) {
        e((InterfaceC9828xO) null);
        this.j.c = System.currentTimeMillis();
        L();
        d(volleyError);
    }

    @Override // o.InterfaceC9828xO
    public void c() {
        C1044Mm.a("nf_httpUrlDownloader", "onCancelled");
        e((InterfaceC9828xO) null);
        L();
    }

    private void Q() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.d();
            this.g = null;
        }
    }

    private void L() {
        BufferedOutputStream bufferedOutputStream = this.e;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.flush();
                this.e.close();
            } catch (IOException e) {
                C1044Mm.b("nf_httpUrlDownloader", e, "flushAndCloseOutputStream:", new Object[0]);
            }
            this.e = null;
        }
    }

    private void d(VolleyError volleyError) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(volleyError);
            this.g = null;
        }
    }

    private void K() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.c();
            this.g = null;
        }
    }

    @Override // com.netflix.android.volley.Request
    public void e() {
        this.g = null;
        super.e();
    }

    public long J() {
        C4291bbj c4291bbj = this.j;
        return c4291bbj.a + c4291bbj.e;
    }
}
