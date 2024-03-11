package o;

import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.mdx.MdxAudioSource;
import com.netflix.mediaclient.media.subtitles.MdxSubtitle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.cgd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6614cgd extends C1045Mp {
    public static final C6614cgd e = new C6614cgd();

    private C6614cgd() {
        super("MdxAudioSubtitleReader");
    }

    public final Language d(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        JSONObject jSONObject = new JSONObject(str);
        JSONArray c = C8123deT.c(jSONObject, "timed_text_tracks");
        if (c == null) {
            c = C8123deT.c(jSONObject, "timed_text_track");
        }
        JSONArray c2 = C8123deT.c(jSONObject, "audio_tracks");
        if (c2 == null) {
            c2 = C8123deT.c(jSONObject, "audio_track");
        }
        MdxSubtitle[] c3 = c(c);
        MdxAudioSource[] e2 = e(c2);
        return new Language(e2, e(e2), c3, e(c3), z, true, C8123deT.a(jSONObject, "maxRecommendedAudioRank", -1), C8123deT.a(jSONObject, "maxRecommendedTextRank", -1));
    }

    private final MdxSubtitle[] c(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() >= 1) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(MdxSubtitle.newInstance(jSONArray.getJSONObject(i), i));
                getLogTag();
            }
            return (MdxSubtitle[]) arrayList.toArray(new MdxSubtitle[0]);
        }
        getLogTag();
        return new MdxSubtitle[0];
    }

    private final MdxAudioSource[] e(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() >= 1) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(MdxAudioSource.newInstance(jSONArray.getJSONObject(i), i));
                getLogTag();
            }
            return (MdxAudioSource[]) arrayList.toArray(new MdxAudioSource[0]);
        }
        getLogTag();
        return new MdxAudioSource[0];
    }

    private final int e(MdxSubtitle[] mdxSubtitleArr) {
        int length = mdxSubtitleArr.length;
        for (int i = 0; i < length; i++) {
            if (mdxSubtitleArr[i].isSelected()) {
                return i;
            }
        }
        getLogTag();
        return 0;
    }

    private final int e(MdxAudioSource[] mdxAudioSourceArr) {
        int length = mdxAudioSourceArr.length;
        for (int i = 0; i < length; i++) {
            if (mdxAudioSourceArr[i].isSelected()) {
                return i;
            }
        }
        getLogTag();
        return 0;
    }
}
