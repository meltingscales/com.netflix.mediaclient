package o;

import android.database.Cursor;
import android.net.Uri;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class aIU<T> extends aIX {
    protected final c b;

    protected abstract T d(String str);

    protected abstract String d();

    public aIU(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.e<T> eVar) {
        super(abstractC1647aJa);
        this.b = new c(eVar);
    }

    public void c() {
        this.b.d();
        this.a.execute(new Runnable() { // from class: o.aIV
            @Override // java.lang.Runnable
            public final void run() {
                aIU.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        List<Uri> a = a();
        if (a.isEmpty()) {
            this.b.b();
            return;
        }
        this.b.a(a.size());
        for (final Uri uri : a) {
            this.a.execute(new Runnable() { // from class: o.aIT
                @Override // java.lang.Runnable
                public final void run() {
                    aIU.this.c(uri);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Uri uri) {
        this.b.c(uri.toString(), b(uri));
    }

    private T b(Uri uri) {
        Cursor query;
        String str;
        try {
            query = b().getContentResolver().query(uri, null, null, null, null);
        } catch (Exception unused) {
        }
        if (query == null) {
            C1044Mm.a("nf_ngpStoreBaseRead", "error cursor is null");
            return null;
        }
        if (query.moveToFirst()) {
            str = null;
            do {
                int columnIndex = query.getColumnIndex(d());
                if (columnIndex >= 0) {
                    str = query.getString(columnIndex);
                }
            } while (query.moveToNext());
        } else {
            str = null;
        }
        query.close();
        if (str != null) {
            return d(str);
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static class c<T> {
        static final long b = TimeUnit.SECONDS.toMillis(10);
        private long a;
        private final NgpStoreApi.e c;
        private final AtomicBoolean d = new AtomicBoolean(false);
        private long e;
        private T g;
        private int h;
        private int i;
        private int j;

        c(NgpStoreApi.e eVar) {
            this.c = eVar;
        }

        public void a(int i) {
            C1044Mm.a("nf_ngpStoreBaseRead", "Expecting %d callbacks", Integer.valueOf(i));
            this.h = i;
        }

        public void d() {
            this.a = System.currentTimeMillis();
            C1044Mm.e("nf_ngpStoreBaseRead", "onRequestStart");
        }

        public void b() {
            if (!this.d.getAndSet(true)) {
                C1044Mm.e("nf_ngpStoreBaseRead", "onNoContentUrisFound");
                this.c.d(null);
                return;
            }
            C1044Mm.j("nf_ngpStoreBaseRead", "onNoContentUrisFound response was already delivered");
        }

        public void c(String str, T t) {
            synchronized (this) {
                int i = this.i + 1;
                this.i = i;
                C1044Mm.c("nf_ngpStoreBaseRead", "processResponse uri=%s, responseReceivedCount=%d", str, Integer.valueOf(i));
                if (this.c.c(t)) {
                    this.j++;
                    this.g = t;
                } else {
                    C1044Mm.j("nf_ngpStoreBaseRead", "Response was not valid, ignore: blob=" + t);
                }
                if (a()) {
                    C1044Mm.a("nf_ngpStoreBaseRead", "Request is completed, after %d valid responses", Integer.valueOf(this.j));
                    b(str, this.g);
                    return;
                }
                if (this.i == this.h) {
                    b(str, t);
                }
            }
        }

        private void b(String str, T t) {
            if (!this.d.getAndSet(true)) {
                C1044Mm.a("nf_ngpStoreBaseRead", "Delivering response for uri: %s", str);
                this.c.d(t);
                return;
            }
            C1044Mm.j("nf_ngpStoreBaseRead", "We already delivered response! Ignoring source: %s", str);
        }

        boolean a() {
            long currentTimeMillis = System.currentTimeMillis();
            this.e = currentTimeMillis;
            boolean z = this.j >= 1;
            boolean z2 = currentTimeMillis >= this.a + b;
            C1044Mm.a("nf_ngpStoreBaseRead", "isRequestDone moreThanMinimalResponseCount: %b, expired: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
            return z || z2;
        }
    }
}
