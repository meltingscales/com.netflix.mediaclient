package o;

import com.netflix.mediaclient.android.app.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bcn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4348bcn {

    /* renamed from: o.bcn$a */
    /* loaded from: classes3.dex */
    public interface a {
        void c(long j, c cVar, String str, Status status);
    }

    /* renamed from: o.bcn$b */
    /* loaded from: classes3.dex */
    public interface b {
        void e();
    }

    /* renamed from: o.bcn$c */
    /* loaded from: classes3.dex */
    public interface c {
        InterfaceC4525bgE d();
    }

    /* renamed from: o.bcn$d */
    /* loaded from: classes3.dex */
    public interface d {
        public static final long e = TimeUnit.MINUTES.toMillis(1);

        void b();

        void d();
    }

    void c(long j, a aVar);

    void c(d dVar);

    void d(String str, b bVar);

    InterfaceC5097bsN f();
}
