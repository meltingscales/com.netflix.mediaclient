package o;

import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import io.reactivex.subjects.Subject;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: o.cwU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7451cwU {
    InterfaceC5160btX A();

    aJY B();

    boolean C();

    void D();

    boolean E();

    void F();

    boolean G();

    boolean H();

    boolean I();

    void J();

    void K();

    void L();

    void M();

    void N();

    void O();

    void P();

    void Q();

    void R();

    void S();

    void T();

    void U();

    void V();

    void W();

    void X();

    void Z();

    ByteBuffer a(long j);

    void a(SkipCreditsType skipCreditsType);

    void a(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras);

    void a(C7535cxz c7535cxz);

    void a(boolean z);

    void ac();

    void b(ImpressionData impressionData);

    void b(boolean z);

    void c(int i);

    void c(int i, boolean z);

    void c(String str);

    void c(boolean z);

    boolean c(InterfaceC5206buQ interfaceC5206buQ);

    void d(float f);

    void d(int i, boolean z);

    void d(String str);

    void d(aJY ajy);

    void d(boolean z);

    void e(Subject<cBO> subject);

    void e(String str);

    void e(String str, long j, String str2, List<String> list, AudioSource audioSource, Subtitle subtitle, StateHistory stateHistory);

    void e(cBA cba);

    void e(cBR cbr);

    void e(boolean z);

    void g(boolean z);

    void h(boolean z);

    void j(boolean z);

    void k();

    void l();

    void m();

    void n();

    void p();

    void q();

    void r();

    void s();

    void t();

    C7535cxz u();

    InterfaceC5198buI v();

    int w();

    Interactivity x();

    void z();

    /* renamed from: o.cwU$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void d(InterfaceC7451cwU interfaceC7451cwU, String str, long j, String str2, List list, AudioSource audioSource, Subtitle subtitle, StateHistory stateHistory, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _fetchInteractiveMoments");
            }
            interfaceC7451cwU.e(str, j, str2, list, (i & 16) != 0 ? null : audioSource, (i & 32) != 0 ? null : subtitle, (i & 64) != 0 ? null : stateHistory);
        }
    }
}
