package o;

import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import o.InterfaceC4342bch;

/* renamed from: o.bcz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4360bcz {
    public static final d b = d.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bcz$a */
    /* loaded from: classes3.dex */
    public interface a {
        InterfaceC4360bcz ao();
    }

    static InterfaceC4360bcz e() {
        return b.a();
    }

    Completable a();

    void a(long j, InterfaceC4342bch.c cVar);

    void a(AbstractC5100bsQ abstractC5100bsQ);

    Single<AbstractC5100bsQ> b();

    void b(List<C5102bsS> list);

    InterfaceC5085bsB c();

    InterfaceC5085bsB c(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, long j2, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData);

    InterfaceC5085bsB c(C4355bcu c4355bcu);

    e d();

    InterfaceC5085bsB e(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, long j2, PlayContext playContext, long j3, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData);

    InterfaceC5085bsB e(long j, InterfaceC5097bsN interfaceC5097bsN, AbstractC5100bsQ abstractC5100bsQ, PlaybackExperience playbackExperience, PlaylistMap<?> playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, boolean z, boolean z2, String str, PreferredLanguageData preferredLanguageData);

    void e(VideoResolutionRange videoResolutionRange);

    void h();

    boolean i();

    boolean j();

    /* renamed from: o.bcz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        static final /* synthetic */ d e = new d();

        private d() {
        }

        public final InterfaceC4360bcz a() {
            AbstractApplicationC1040Mh abstractApplicationC1040Mh = AbstractApplicationC1040Mh.getInstance();
            C8632dsu.a(abstractApplicationC1040Mh, "");
            return ((a) EntryPointAccessors.fromApplication(abstractApplicationC1040Mh, a.class)).ao();
        }
    }

    /* renamed from: o.bcz$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private long d;
        private long e;

        public final long a() {
            return this.e;
        }

        public final void a(long j) {
            this.e = j;
        }

        public final long d() {
            return this.d;
        }

        public final void d(long j) {
            this.d = j;
        }

        public e(long j, long j2) {
            this.d = j;
            this.e = j2;
        }
    }
}
