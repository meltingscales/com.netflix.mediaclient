package o;

import android.view.SurfaceView;
import android.view.ViewGroup;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.servicemgr.ExitPipAction;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.util.PlayContext;
import java.nio.ByteBuffer;

/* renamed from: o.bsB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5085bsB {
    void B();

    void C();

    void D();

    long E();

    long F();

    long H();

    void a(int i, int i2, boolean z);

    void a(SurfaceView surfaceView);

    void a(ExitPipAction exitPipAction);

    InterfaceC5299bwD b(ViewGroup viewGroup);

    void b(int i);

    void b(long j);

    void b(Language language);

    String c();

    void c(float f);

    void c(int i, int i2);

    void c(boolean z);

    void c(boolean z, boolean z2);

    void d();

    void d(float f);

    void d(int i, int i2, String str);

    void d(Subtitle subtitle, boolean z);

    void d(PlaybackExperience playbackExperience, PlayContext playContext);

    void d(InterfaceC5097bsN interfaceC5097bsN);

    boolean d(AudioSource audioSource);

    ByteBuffer e(long j);

    void e(InterfaceC5097bsN interfaceC5097bsN);

    AudioSource g();

    Language h();

    Subtitle j();

    long k();

    IPlayer.PlaybackType l();

    PlayerManifestData m();

    float n();

    StreamProfileType p();

    Subtitle[] q();

    void r();

    IPlaylistControl s();

    Watermark t();

    void u();

    boolean v();

    void w();

    boolean x();

    void y();

    boolean z();
}
