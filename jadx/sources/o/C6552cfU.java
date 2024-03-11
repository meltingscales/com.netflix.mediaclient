package o;

import android.content.Intent;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.mdx.MdxAudioSource;
import com.netflix.mediaclient.media.subtitles.MdxSubtitle;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.cfU  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C6552cfU extends AbstractC6549cfR {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6552cfU() {
        super("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_AUDIOSUB");
    }

    @Override // o.InterfaceC6548cfQ
    public void a(InterfaceC6538cfG interfaceC6538cfG, Intent intent) {
        C1044Mm.e("mdxui", "Update audio/subtitles...");
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("stringBlob"));
            JSONArray c = C8123deT.c(jSONObject, "timed_text_tracks");
            if (c == null) {
                c = C8123deT.c(jSONObject, "timed_text_track");
            }
            JSONArray c2 = C8123deT.c(jSONObject, "audio_tracks");
            if (c2 == null) {
                c2 = C8123deT.c(jSONObject, "audio_track");
            }
            MdxSubtitle[] d = d(c);
            MdxAudioSource[] a = a(c2);
            interfaceC6538cfG.e(new Language(a, e(a), d, c(d), true, true, C8123deT.a(jSONObject, "maxRecommendedAudioRank", -1), C8123deT.a(jSONObject, "maxRecommendedTextRank", -1)));
        } catch (Exception e) {
            C1044Mm.e("mdxui", "Failed to extract capability data ", e);
        }
    }

    private int c(MdxSubtitle[] mdxSubtitleArr) {
        for (int i = 0; i < mdxSubtitleArr.length; i++) {
            if (mdxSubtitleArr[i].isSelected()) {
                return i;
            }
        }
        C1044Mm.e("mdxui", "None is selected, default to 0");
        return 0;
    }

    private int e(MdxAudioSource[] mdxAudioSourceArr) {
        for (int i = 0; i < mdxAudioSourceArr.length; i++) {
            if (mdxAudioSourceArr[i].isSelected()) {
                return i;
            }
        }
        C1044Mm.e("mdxui", "None is selected, default to 0");
        return 0;
    }

    private MdxSubtitle[] d(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() < 1) {
            C1044Mm.j("mdxui", "Empty subtitle list");
            return new MdxSubtitle[0];
        }
        int length = jSONArray.length();
        MdxSubtitle[] mdxSubtitleArr = new MdxSubtitle[length];
        for (int i = 0; i < length; i++) {
            mdxSubtitleArr[i] = MdxSubtitle.newInstance(jSONArray.getJSONObject(i), i);
        }
        return mdxSubtitleArr;
    }

    private MdxAudioSource[] a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() < 1) {
            C1044Mm.j("mdxui", "Empty audio list");
            return new MdxAudioSource[0];
        }
        int length = jSONArray.length();
        MdxAudioSource[] mdxAudioSourceArr = new MdxAudioSource[length];
        for (int i = 0; i < length; i++) {
            mdxAudioSourceArr[i] = MdxAudioSource.newInstance(jSONArray.getJSONObject(i), i);
        }
        return mdxAudioSourceArr;
    }
}
