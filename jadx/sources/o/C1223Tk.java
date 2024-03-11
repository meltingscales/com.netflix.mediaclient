package o;

import com.netflix.cl.model.JsonSerializer;
import com.netflix.mediaclient.media.AudioSource;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.Tk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1223Tk extends AbstractC1228Tp<AudioSource> {
    private final List<AudioSource> b;
    private boolean c;

    public final void a(boolean z) {
        this.c = z;
    }

    public List<AudioSource> f() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1223Tk(List<? extends AudioSource> list) {
        C8632dsu.c((Object) list, "");
        this.b = list;
        this.c = true;
    }

    @Override // o.AbstractC1224Tl
    public int a() {
        return this.b.size();
    }

    @Override // o.AbstractC1224Tl
    public String e(int i) {
        String newTrackId = b(i).getNewTrackId();
        C8632dsu.a(newTrackId, "");
        return newTrackId;
    }

    @Override // o.AbstractC1224Tl
    public String a(int i) {
        String languageDescription = b(i).getLanguageDescription();
        C8632dsu.a(languageDescription, "");
        return languageDescription;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1224Tl
    /* renamed from: i */
    public AudioSource b(int i) {
        return this.b.get(i);
    }

    @Override // o.AbstractC1224Tl
    public Observable<List<AudioSource>> d(boolean z) {
        Observable<List<AudioSource>> just = Observable.just(this.b);
        C8632dsu.a(just, "");
        return just;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject a(C1223Tk c1223Tk) {
        Map b;
        C8632dsu.c((Object) c1223Tk, "");
        b = dqD.b(dpD.a("Audio", new JSONObject((Map) c1223Tk.e(c1223Tk.b()))));
        return new JSONObject(b);
    }

    @Override // o.AbstractC1228Tp
    public JsonSerializer g() {
        return new JsonSerializer() { // from class: o.Tj
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject a;
                a = C1223Tk.a(C1223Tk.this);
                return a;
            }
        };
    }

    public void c(JSONObject jSONObject) {
        int d;
        C8632dsu.c((Object) jSONObject, "");
        List<AudioSource> f = f();
        d = C8572dqo.d(f, 10);
        ArrayList arrayList = new ArrayList(d);
        for (AudioSource audioSource : f) {
            arrayList.add(new JSONObject((Map) e(audioSource)));
        }
        jSONObject.put("Audio", new JSONArray((Collection) arrayList));
        jSONObject.putOpt("AudioDefault", new JSONObject((Map) e(b())));
    }

    private final Map<String, String> e(AudioSource audioSource) {
        Map<String, String> c;
        c = dqE.c(b(audioSource), c(audioSource));
        return c;
    }

    private final Pair<String, String> b(AudioSource audioSource) {
        String str = audioSource.getTrackType() == 0 ? "PRIMARY" : "ASSISTIVE";
        String languageCodeBcp47 = audioSource.getLanguageCodeBcp47();
        int numChannels = audioSource.getNumChannels();
        return dpD.a("descriptor", "A:" + languageCodeBcp47 + ":" + str + ":" + numChannels);
    }

    private final Pair<String, String> c(AudioSource audioSource) {
        String newTrackId = audioSource.getNewTrackId();
        if (newTrackId == null) {
            newTrackId = "missing";
        }
        return dpD.a("new_track_id", newTrackId);
    }

    @Override // o.AbstractC1228Tp
    public boolean f(int i) {
        return b(i).getRank() == c() && i != this.b.size() - 1;
    }

    public final void a(AudioSource audioSource) {
        C8632dsu.c((Object) audioSource, "");
        Iterator<AudioSource> it = this.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C8632dsu.c(it.next(), audioSource)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            d(i);
        }
    }
}
