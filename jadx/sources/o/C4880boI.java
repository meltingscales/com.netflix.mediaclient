package o;

import android.util.LongSparseArray;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.mediaclient.service.player.StreamProfileType;
import java.util.List;
import java.util.Objects;

/* renamed from: o.boI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4880boI {
    private final LongSparseArray<InterfaceC4525bgE> b = new LongSparseArray<>();
    private final LongSparseArray<AudioSource[]> e = new LongSparseArray<>();
    private final LongSparseArray<Subtitle[]> a = new LongSparseArray<>();

    public void e(long j, InterfaceC4525bgE interfaceC4525bgE) {
        synchronized (this.b) {
            this.b.put(j, interfaceC4525bgE);
        }
    }

    public InterfaceC4525bgE c(long j) {
        InterfaceC4525bgE interfaceC4525bgE;
        synchronized (this.b) {
            interfaceC4525bgE = this.b.get(j);
        }
        return interfaceC4525bgE;
    }

    public AudioSource[] d(long j) {
        InterfaceC4525bgE c = c(j);
        synchronized (this.e) {
            AudioSource[] audioSourceArr = this.e.get(j);
            if (audioSourceArr == null) {
                if (c == null) {
                    return new AudioSource[0];
                }
                audioSourceArr = c.M();
                this.e.put(j, audioSourceArr);
            }
            return audioSourceArr;
        }
    }

    public Subtitle[] j(long j) {
        InterfaceC4525bgE c = c(j);
        synchronized (this.a) {
            Subtitle[] subtitleArr = this.a.get(j);
            if (subtitleArr == null) {
                if (c == null) {
                    return new Subtitle[0];
                }
                subtitleArr = c.am();
                this.a.put(j, subtitleArr);
            }
            return subtitleArr;
        }
    }

    public Watermark h(long j) {
        InterfaceC4525bgE c = c(j);
        if (c != null) {
            return c.ar();
        }
        return null;
    }

    public int b(long j) {
        InterfaceC4525bgE c = c(j);
        if (c != null) {
            return c.T();
        }
        return -1;
    }

    public int e(long j) {
        InterfaceC4525bgE c = c(j);
        if (c != null) {
            return c.Z();
        }
        return -1;
    }

    public StreamProfileType g(long j) {
        InterfaceC4525bgE c = c(j);
        return c != null ? c.ap() : StreamProfileType.i;
    }

    public PlayerManifestData a(long j) {
        InterfaceC4525bgE c = c(j);
        if (c != null) {
            return c.V();
        }
        return null;
    }

    public void a() {
        synchronized (this.a) {
            this.a.clear();
        }
        synchronized (this.e) {
            this.e.clear();
        }
        synchronized (this.b) {
            this.b.clear();
        }
    }

    public LongSparseArray<List<Stream>> c(AudioSource audioSource) {
        AudioSource[] M;
        LongSparseArray<List<Stream>> longSparseArray = new LongSparseArray<>(this.b.size());
        String languageCodeBcp47 = audioSource.getLanguageCodeBcp47();
        for (int i = 0; i < this.b.size(); i++) {
            long keyAt = this.b.keyAt(i);
            List<Stream> list = null;
            List<Stream> list2 = null;
            for (AudioSource audioSource2 : this.b.valueAt(i).M()) {
                if (audioSource.getTrackType() == audioSource2.getTrackType()) {
                    if (Objects.equals(audioSource2.getLanguageCodeBcp47(), languageCodeBcp47)) {
                        list = audioSource2.getStreams();
                        if (list != null && !list.isEmpty()) {
                            break;
                        }
                    } else if ((list2 == null || list2.isEmpty()) && (AudioSource.AUDIO_LANGUAGE_ZXX.equals(audioSource2.getLanguageCodeBcp47()) || AudioSource.AUDIO_LANGUAGE_ZXX.equals(languageCodeBcp47))) {
                        list2 = audioSource2.getStreams();
                    }
                }
            }
            if (list != null && !list.isEmpty()) {
                longSparseArray.put(keyAt, list);
            } else {
                longSparseArray.put(keyAt, list2);
            }
        }
        return longSparseArray;
    }
}
