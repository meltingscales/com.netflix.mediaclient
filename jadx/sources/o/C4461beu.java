package o;

import android.os.Handler;
import androidx.media3.common.Format;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import java.util.List;

/* renamed from: o.beu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4461beu {
    private final Handler b;
    private long c;
    private final C4886boO d;
    private final InterfaceC4610bhk e;

    public C4461beu(Handler handler, InterfaceC4610bhk interfaceC4610bhk, C4886boO c4886boO) {
        this.b = handler;
        this.e = interfaceC4610bhk;
        this.d = c4886boO;
    }

    public void b(final Format format, final Format format2) {
        this.b.post(new Runnable() { // from class: o.bex
            @Override // java.lang.Runnable
            public final void run() {
                C4461beu.this.e(format, format2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Format format, Format format2) {
        long j = NetflixIdMetadataEntry.e(format).b;
        this.c = j;
        this.e.c(j, format);
        this.d.c(this.c, format, format2);
    }

    public void a() {
        this.b.post(new Runnable() { // from class: o.bey
            @Override // java.lang.Runnable
            public final void run() {
                C4461beu.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.d.i(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        this.d.b(list);
    }

    public void d(final List<C4970bpt> list) {
        this.b.post(new Runnable() { // from class: o.bew
            @Override // java.lang.Runnable
            public final void run() {
                C4461beu.this.b(list);
            }
        });
    }

    public void d(final Format format) {
        this.b.post(new Runnable() { // from class: o.ber
            @Override // java.lang.Runnable
            public final void run() {
                C4461beu.this.b(format);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Format format) {
        this.d.b(this.c, format);
    }
}
