package o;

import com.netflix.cl.model.JsonSerializer;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class TG extends AbstractC1228Tp<Subtitle> {
    private List<? extends Subtitle> a;
    private boolean c;

    public final void a(boolean z) {
        this.c = z;
    }

    public List<Subtitle> i() {
        return this.a;
    }

    public TG(List<? extends Subtitle> list) {
        C8632dsu.c((Object) list, "");
        this.a = list;
        this.c = true;
    }

    public final Subtitle f() {
        int j = j();
        if (j < 0 || this.a.isEmpty()) {
            return null;
        }
        if (j >= this.a.size()) {
            return b(0);
        }
        return b();
    }

    @Override // o.AbstractC1224Tl
    public int a() {
        return this.a.size();
    }

    @Override // o.AbstractC1224Tl
    public String e(int i) {
        String newTrackId = b(i).getNewTrackId();
        C8632dsu.a(newTrackId, "");
        return newTrackId;
    }

    @Override // o.AbstractC1224Tl
    public String a(int i) {
        Subtitle b = b(i);
        StringBuilder sb = new StringBuilder(b.getLanguageDescription());
        if (b.isCC()) {
            C8168dfL.d(sb, C8168dfL.d(com.netflix.mediaclient.ui.R.o.cI));
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1224Tl
    /* renamed from: g */
    public Subtitle b(int i) {
        Subtitle subtitle;
        int t;
        List<? extends Subtitle> list = this.a;
        if (i >= 0) {
            t = C8569dql.t(list);
            if (i <= t) {
                subtitle = list.get(i);
                return subtitle;
            }
        }
        subtitle = this.a.get(0);
        return subtitle;
    }

    @Override // o.AbstractC1224Tl
    public Observable<List<Subtitle>> d(boolean z) {
        Observable<List<Subtitle>> just = Observable.just(this.a);
        C8632dsu.a(just, "");
        return just;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject a(TG tg) {
        Map b;
        C8632dsu.c((Object) tg, "");
        b = dqD.b(dpD.a("Subtitle", new JSONObject((Map) tg.e(tg.b()))));
        return new JSONObject(b);
    }

    @Override // o.AbstractC1228Tp
    public JsonSerializer g() {
        return new JsonSerializer() { // from class: o.TD
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject a;
                a = TG.a(TG.this);
                return a;
            }
        };
    }

    public void c(JSONObject jSONObject) {
        int d;
        C8632dsu.c((Object) jSONObject, "");
        List<Subtitle> i = i();
        d = C8572dqo.d(i, 10);
        ArrayList arrayList = new ArrayList(d);
        for (Subtitle subtitle : i) {
            arrayList.add(new JSONObject((Map) e(subtitle)));
        }
        jSONObject.put("Subtitles", new JSONArray((Collection) arrayList));
        jSONObject.putOpt("SubtitlesDefault", new JSONObject((Map) e(b())));
    }

    private final Map<String, String> e(Subtitle subtitle) {
        Map<String, String> c;
        c = dqE.c(a(subtitle), c(subtitle));
        return c;
    }

    private final Pair<String, String> a(Subtitle subtitle) {
        String str = !subtitle.isCC() ? "PRIMARY" : "ASSISTIVE";
        String str2 = subtitle.isForcedNarrative() ? ":FN" : subtitle.isNone() ? ":Off" : "";
        String languageCodeBcp47 = subtitle.getLanguageCodeBcp47();
        return dpD.a("descriptor", "S:" + languageCodeBcp47 + ":" + str + str2);
    }

    private final Pair<String, String> c(Subtitle subtitle) {
        String newTrackId = subtitle.getNewTrackId();
        if (newTrackId == null) {
            newTrackId = "missing";
        }
        return dpD.a("new_track_id", newTrackId);
    }

    @Override // o.AbstractC1228Tp
    public boolean f(int i) {
        return (this.c || b(i).getRank() != c() || i == this.a.size() - 1) ? false : true;
    }

    public final void d(Subtitle subtitle) {
        dpR dpr;
        int i;
        int i2 = 0;
        if (subtitle != null) {
            Iterator<? extends Subtitle> it = this.a.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C8632dsu.c(it.next(), subtitle)) {
                    break;
                } else {
                    i++;
                }
            }
            dpr = dpR.c;
        } else {
            dpr = null;
            i = -1;
        }
        if (dpr == null) {
            Iterator<? extends Subtitle> it2 = this.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (it2.next().isForcedNarrativeOrNone()) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i != -1) {
            d(i);
        }
    }
}
