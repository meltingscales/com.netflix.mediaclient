package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import com.netflix.mediaclient.util.PlayContext;
import java.util.List;

/* renamed from: o.baF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4208baF {

    /* renamed from: o.baF$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, C4216baN c4216baN, Status status);
    }

    /* renamed from: o.baF$d */
    /* loaded from: classes3.dex */
    public static abstract class d {
        public abstract void a(Status status);
    }

    void a(int i);

    void a(String str);

    void a(String str, VideoType videoType, PlayContext playContext);

    void b(CreateRequest createRequest);

    void b(String str);

    void c(String str);

    void c(AbstractC4213baK abstractC4213baK);

    void c(C4241bam c4241bam);

    void c(boolean z);

    void d(String str);

    void d(String str, c cVar);

    void d(InterfaceC4209baG interfaceC4209baG);

    <T extends InterfaceC4209baG> T e(T t);

    void e(DownloadVideoQuality downloadVideoQuality);

    void e(String str);

    void e(String str, VideoType videoType, PlayContext playContext);

    void e(List<String> list);

    void g();

    void h(String str);

    void i();

    InterfaceC4245baq k();

    InterfaceC5204buO l();

    DownloadVideoQuality m();

    InterfaceC4218baP n();

    boolean o();

    void q();

    InterfaceC4251baw r();

    boolean s();

    void t();
}
