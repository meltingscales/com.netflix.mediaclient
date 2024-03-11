package com.netflix.mediaclient.media;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import java.util.List;
import o.AbstractC4472bfE;
import o.C1044Mm;
import o.C1332Xp;
import o.C8123deT;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NccpAudioSource extends AudioSource {
    public static final int IMPL_VALUE = 1;
    private static final String TRACK_TYPE_ASSISTIVE = "ASSISTIVE";
    private static final String TRACK_TYPE_PRIMARY = "PRIMARY";

    protected NccpAudioSource(JSONObject jSONObject, int i, boolean z) {
        this.id = C8123deT.a(jSONObject, SignupConstants.Field.LANG_ID, (String) null);
        this.newTrackId = C8123deT.a(jSONObject, "new_track_id", (String) null);
        this.dlid = C8123deT.a(jSONObject, "downloadable_id", (String) null);
        this.bitrate = C8123deT.a(jSONObject, "bitrate", 0);
        this.numChannels = C8123deT.a(jSONObject, "channels", 0);
        this.languageCodeBcp47 = C8123deT.a(jSONObject, "language", SignupConstants.Language.ENGLISH_EN);
        this.languageDescription = C8123deT.a(jSONObject, "languageDescription", "English");
        this.nccpOrderNumber = i;
        String a = C8123deT.a(jSONObject, "trackType", (String) null);
        this.isNative = C8123deT.a(jSONObject, "isNative", true);
        this.isSalsaSupported = z;
        this.defaultTimedText = C8123deT.a(jSONObject, "defaultTimedText", (String) null);
        this.offTracksDisallowed = C8123deT.a(jSONObject, "offTrackDisallowed", false);
        this.isHydrated = C8123deT.a(jSONObject, "hydrated", true);
        this.rank = C8123deT.a(jSONObject, "rank", -1);
        this.profile = C8123deT.a(jSONObject, "profile", "");
        this.codecName = C8123deT.a(jSONObject, "codecName", "XHEAAC");
        if (TRACK_TYPE_ASSISTIVE.equalsIgnoreCase(a)) {
            this.trackType = 2;
        } else if (TRACK_TYPE_PRIMARY.equalsIgnoreCase(a)) {
            this.trackType = 0;
        } else {
            this.trackType = 3;
        }
        JSONArray c = C8123deT.c(jSONObject, "disallowedSubtitleTracks");
        if (c != null) {
            C1044Mm.e("nf_audio_source", "DisallowedSubtitleTracks found: " + c.length());
            this.disallowedSubtitles = new String[c.length()];
            for (int i2 = 0; i2 < c.length(); i2++) {
                this.disallowedSubtitles[i2] = c.getString(i2);
            }
        } else {
            C1044Mm.e("nf_audio_source", "No disallowedSubtitleTracks!");
            this.disallowedSubtitles = new String[0];
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("streams");
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                try {
                    this.streams.add((Stream) ((Gson) C1332Xp.b(Gson.class)).fromJson(optJSONArray.getString(i3), (Class<Object>) Stream.class));
                } catch (JsonSyntaxException | NullPointerException unused) {
                    C1044Mm.d("nf_audio_source", "unable to parse stream");
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("bitrates");
        if (optJSONArray2 != null) {
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                this.bitrates.add(Integer.valueOf(optJSONArray2.getInt(i4)));
            }
        }
    }

    protected NccpAudioSource(AbstractC4472bfE abstractC4472bfE, int i, boolean z) {
        this.id = abstractC4472bfE.f();
        this.newTrackId = abstractC4472bfE.n();
        this.numChannels = abstractC4472bfE.s();
        this.languageCodeBcp47 = abstractC4472bfE.h();
        this.languageDescription = abstractC4472bfE.o();
        this.nccpOrderNumber = i;
        String p = abstractC4472bfE.p();
        this.isNative = abstractC4472bfE.i();
        this.isSalsaSupported = z;
        this.isHydrated = abstractC4472bfE.g();
        this.rank = abstractC4472bfE.k();
        this.defaultTimedText = abstractC4472bfE.c();
        if (TRACK_TYPE_ASSISTIVE.equalsIgnoreCase(p)) {
            this.trackType = 2;
        } else if (TRACK_TYPE_PRIMARY.equalsIgnoreCase(p)) {
            this.trackType = 0;
        } else {
            this.trackType = -1;
        }
        List<String> j = abstractC4472bfE.j();
        if (j != null) {
            C1044Mm.e("nf_audio_source", "DisallowedSubtitleTracks found: " + j.size());
            this.disallowedSubtitles = new String[j.size()];
            for (int i2 = 0; i2 < j.size(); i2++) {
                this.disallowedSubtitles[i2] = j.get(i2);
            }
        } else {
            C1044Mm.e("nf_audio_source", "No disallowedSubtitleTracks!");
            this.disallowedSubtitles = new String[0];
        }
        List<Stream> q = abstractC4472bfE.q();
        this.streams = q;
        if (q.isEmpty()) {
            return;
        }
        this.dlid = this.streams.get(0).downloadableId();
        this.bitrate = this.streams.get(0).bitrate();
    }

    public static AudioSource newInstance(JSONObject jSONObject, int i, boolean z) {
        return new NccpAudioSource(jSONObject, i, z);
    }

    public static AudioSource newInstance(AbstractC4472bfE abstractC4472bfE, int i, boolean z) {
        return new NccpAudioSource(abstractC4472bfE, i, z);
    }

    @Override // com.netflix.mediaclient.media.AudioSource
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseSubtitle.IMPL, 1);
        jSONObject.put(SignupConstants.Field.LANG_ID, this.id);
        jSONObject.put("new_track_id", this.newTrackId);
        jSONObject.put("languageDescription", this.languageDescription);
        jSONObject.put(BaseSubtitle.ATTR_ORDER, this.nccpOrderNumber);
        jSONObject.put("channels", this.numChannels);
        jSONObject.put("language", this.languageCodeBcp47);
        jSONObject.put("languageDescription", this.languageDescription);
        jSONObject.put("isNative", this.isNative);
        String str = this.defaultTimedText;
        if (str != null) {
            jSONObject.put("defaultTimedText", str);
        }
        jSONObject.put("offTrackDisallowed", this.offTracksDisallowed);
        int i = this.trackType;
        jSONObject.put("trackType", i == 2 ? TRACK_TYPE_ASSISTIVE : i == 0 ? TRACK_TYPE_PRIMARY : null);
        String[] strArr = this.disallowedSubtitles;
        if (strArr != null && strArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("disallowedSubtitleTracks", jSONArray);
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.disallowedSubtitles;
                if (i2 >= strArr2.length) {
                    break;
                }
                jSONArray.put(strArr2[i2]);
                i2++;
            }
        }
        if (this.isSalsaSupported) {
            jSONObject.put("rank", this.rank);
            jSONObject.put("hydrated", this.isHydrated);
            jSONObject.put("profile", this.profile);
            jSONObject.put("codecName", this.codecName);
            if (this.bitrates.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                jSONObject.put("bitrates", jSONArray2);
                for (int i3 = 0; i3 < this.bitrates.size(); i3++) {
                    jSONArray2.put(this.bitrates.get(i3));
                }
            }
        }
        return jSONObject;
    }
}
