package o;

import android.net.NetworkCapabilities;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AudioStreamConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange;

/* renamed from: o.bie  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4657bie {

    /* renamed from: o.bie$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);

        void d(C4598bhY c4598bhY);
    }

    NetworkCapabilities a();

    AudioStreamConfig a(AseConfig aseConfig, boolean z);

    AseConfig b(StreamProfileType streamProfileType, String str);

    void b(b bVar);

    Object b$42498405();

    void c();

    void c(b bVar);

    int d();

    int d(StreamProfileType streamProfileType);

    StreamRange e(AseConfig aseConfig, boolean z);

    C4598bhY e();

    int f();

    boolean g();

    int h();

    int i();

    int j();

    void n();

    boolean o();

    static boolean e(InterfaceC4657bie interfaceC4657bie) {
        C4598bhY e = interfaceC4657bie.e();
        if (e == null) {
            return false;
        }
        return e.e();
    }
}
