package o;

import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.RecommendedMediaData;
import com.netflix.mediaclient.media.SubtitleTrackData;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.ManifestLimitedLicense;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.List;

/* renamed from: o.bgE  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4525bgE extends Comparable<InterfaceC4525bgE> {
    String E();

    String F();

    AudioSubtitleDefaultOrderInfo[] G();

    AbstractC4473bfF H();

    List<? extends InterfaceC4525bgE> J();

    String K();

    List<AbstractC4562bgp> L();

    AudioSource[] M();

    List<AbstractC4472bfE> N();

    long P();

    String Q();

    byte[] R();

    String S();

    int T();

    AbstractC4564bgr U();

    PlayerManifestData V();

    List<Location> W();

    long X();

    String Y();

    int Z();

    Long aa();

    List<AbstractC4567bgu> ab();

    String ac();

    String ad();

    PlaylistMap af();

    RecommendedMediaData ag();

    PlayerPrefetchSource ah();

    List<AbstractC4537bgQ> ai();

    List<AbstractC4534bgN> aj();

    List<SubtitleTrackData> ak();

    long al();

    Subtitle[] am();

    List<VideoTrack> an();

    C4540bgT[] ao();

    StreamProfileType ap();

    String aq();

    Watermark ar();

    ManifestLimitedLicense as();

    boolean at();

    boolean au();

    boolean av();

    boolean aw();

    String ax();

    byte[] ay();

    boolean az();

    void c(PlayerPrefetchSource playerPrefetchSource);

    InterfaceC4525bgE d(List<AbstractC4534bgN> list, List<Location> list2);

    AbstractC4556bgj f();

    AbstractC4558bgl j();

    LiveMetadata n();

    long r();

    AbstractC4532bgL x();

    List<AbstractC4537bgQ> y();

    List<AbstractC4541bgU> z();

    /* renamed from: o.bgE$c */
    /* loaded from: classes.dex */
    public static class c {
        public final int b;
        public final int d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i, int i2) {
            this.d = i;
            this.b = i2;
        }
    }
}
