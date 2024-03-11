package o;

import android.content.Context;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.LanguageChoice;
import com.netflix.mediaclient.media.RecommendedMediaData;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import org.json.JSONObject;

/* renamed from: o.dhu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8309dhu {
    public static void c(Context context, Language language) {
        if (language == null || context == null) {
            return;
        }
        try {
            C8157dfA.a(context, "prefs_user_selected_language", new b(language).b().toString());
        } catch (Throwable th) {
            C1044Mm.b("nf_loc", th, "Unable to save use selection!", new Object[0]);
        }
    }

    public static b c(Context context) {
        if (context == null) {
            return null;
        }
        String e = C8157dfA.e(context, "prefs_user_selected_language", (String) null);
        if (C8168dfL.g(e)) {
            C1044Mm.j("nf_loc", "Unable to load used selection, it does not exist.");
            return null;
        }
        try {
            return new b(new JSONObject(e));
        } catch (Throwable th) {
            C1044Mm.b("nf_loc", th, "Unable to load used selection!", new Object[0]);
            return null;
        }
    }

    public static LanguageChoice a(b bVar, Subtitle[] subtitleArr, AudioSource[] audioSourceArr, RecommendedMediaData recommendedMediaData, String str, Boolean bool, String str2, Boolean bool2) {
        b bVar2;
        long creationTimeInMs;
        if (bVar != null) {
            bVar2 = bVar;
        } else if (str == null && str2 == null) {
            return null;
        } else {
            bVar2 = new b(str, 3, str2, 0);
        }
        long j = bVar2.a;
        if (recommendedMediaData == null) {
            C1044Mm.j("nf_loc", "No defaults! User override");
            creationTimeInMs = 0;
        } else {
            creationTimeInMs = recommendedMediaData.getCreationTimeInMs();
            C1044Mm.a("nf_loc", "Manifest creation date %d", Long.valueOf(creationTimeInMs));
        }
        C1044Mm.a("nf_loc", "Last user override %d", Long.valueOf(j));
        if (creationTimeInMs > j) {
            C1044Mm.e("nf_loc", "Manifest defaults are newer than last user selection, use them...");
            return null;
        }
        LanguageChoice.SelectionReport selectionReport = new LanguageChoice.SelectionReport(bVar2);
        C1044Mm.e("nf_loc", "Manifest defaults are older than last user selection, use user overrides...");
        b bVar3 = bVar2;
        AudioSource b2 = b(bVar3, audioSourceArr, recommendedMediaData, selectionReport, str, bool);
        return new LanguageChoice(a(bVar3, subtitleArr, b2, recommendedMediaData, selectionReport, str2, bool2), b2, selectionReport);
    }

    private static Subtitle a(b bVar, Subtitle[] subtitleArr, AudioSource audioSource, RecommendedMediaData recommendedMediaData, LanguageChoice.SelectionReport selectionReport, String str, Boolean bool) {
        if (str != null) {
            if (str.equals("none")) {
                bVar.d(str, 0);
            } else {
                bVar.d(str, (bool == null || !bool.booleanValue()) ? 1 : 2);
            }
        }
        Subtitle subtitle = null;
        if (C8168dfL.g(bVar.e)) {
            C1044Mm.j("nf_loc", "Subtitle is off...");
            if (audioSource != null && audioSource.isAllowedSubtitle(null)) {
                C1044Mm.e("nf_loc", "findSubtitleForUserOverride:: off subtitle is allowed, use it.");
                selectionReport.setSubtitleLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.USER_OVERRIDE);
                return null;
            }
            C1044Mm.e("nf_loc", "findSubtitleForUserOverride:: off subtitle is NOT allowed, use manifest default");
            selectionReport.setSubtitleLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT);
            return b(subtitleArr, recommendedMediaData);
        }
        for (Subtitle subtitle2 : subtitleArr) {
            if (bVar.e.equals("none") && ((subtitle2.getTrackType() == 7 || subtitle2.getTrackType() == 6) && audioSource != null && audioSource.isAllowedSubtitle(subtitle2))) {
                C1044Mm.e("nf_loc", "findSubtitleForUserOverride:: exact match, it is allowed, use it!");
                return subtitle2;
            }
            if (bVar.e.equals(subtitle2.getLanguageCodeBcp47())) {
                if (subtitle2.getTrackType() == bVar.b) {
                    C1044Mm.e("nf_loc", "findSubtitleForUserOverride:: exact match, use it if it is allowed!");
                    if (audioSource != null && audioSource.isAllowedSubtitle(subtitle2)) {
                        C1044Mm.e("nf_loc", "findSubtitleForUserOverride:: exact match, it is allowed, use it!");
                        selectionReport.setSubtitleLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.USER_OVERRIDE);
                        return subtitle2;
                    }
                    C1044Mm.j("nf_loc", "findSubtitleForUserOverride:: exact match, it is NOT allowed, skip it!");
                } else {
                    if (subtitle == null) {
                        C1044Mm.e("nf_loc", "No default subtitle before, save this one.");
                    } else if (subtitle2.getTrackType() == 1) {
                        C1044Mm.e("nf_loc", "Default subtitle track found, save this one.");
                    }
                    subtitle = subtitle2;
                }
            }
        }
        if (subtitle != null) {
            if (audioSource != null && audioSource.isAllowedSubtitle(subtitle)) {
                C1044Mm.e("nf_loc", "findSubtitleForUserOverride:: default subtitle match, it is allowed, use it!");
                selectionReport.setSubtitleLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT);
                return subtitle;
            }
            C1044Mm.j("nf_loc", "findSubtitleForUserOverride:: default subtitle match, it is NOT allowed, skip it!");
        }
        C1044Mm.e("nf_loc", "Same subtitle as one for user override is not found, use one supplied by manifest.");
        selectionReport.setSubtitleLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT);
        return b(subtitleArr, recommendedMediaData);
    }

    private static AudioSource b(b bVar, AudioSource[] audioSourceArr, RecommendedMediaData recommendedMediaData, LanguageChoice.SelectionReport selectionReport, String str, Boolean bool) {
        if (C8168dfL.g(str) && C8168dfL.g(bVar.d)) {
            C1044Mm.j("nf_loc", "Audio was not selected, use manifest override...");
            selectionReport.setAudioLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT);
            return e(audioSourceArr, recommendedMediaData);
        }
        if (C8168dfL.h(str)) {
            if (bool != null && bool.booleanValue()) {
                bVar.e(str, 0);
            } else {
                bVar.e(str, 2);
            }
        }
        AudioSource audioSource = null;
        for (AudioSource audioSource2 : audioSourceArr) {
            if (bVar.d.equals(audioSource2.getLanguageCodeBcp47())) {
                if (audioSource2.getTrackType() == bVar.c) {
                    selectionReport.setAudioLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.USER_OVERRIDE);
                    return audioSource2;
                }
                if (audioSource == null) {
                    C1044Mm.e("nf_loc", "No default audio before, save this one.");
                } else if (audioSource2.getTrackType() == 0) {
                    C1044Mm.e("nf_loc", "Default audio track found, save this one.");
                }
                audioSource = audioSource2;
            }
        }
        if (audioSource == null) {
            C1044Mm.e("nf_loc", "Same audio as one for user override is not found, use one supplied by manifest.");
            selectionReport.setAudioLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT);
            return e(audioSourceArr, recommendedMediaData);
        }
        selectionReport.setAudioLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT);
        return audioSource;
    }

    private static Subtitle b(Subtitle[] subtitleArr, RecommendedMediaData recommendedMediaData) {
        if (recommendedMediaData == null) {
            C1044Mm.j("nf_loc", "Default recommendation in manifest does not found, this should not happen!");
            return null;
        }
        return c(subtitleArr, recommendedMediaData.getTimedTextTrackId());
    }

    private static Subtitle c(Subtitle[] subtitleArr, String str) {
        for (Subtitle subtitle : subtitleArr) {
            if (subtitle != null && subtitle.getId() != null && subtitle.getId().equals(str)) {
                return subtitle;
            }
        }
        return null;
    }

    private static AudioSource e(AudioSource[] audioSourceArr, RecommendedMediaData recommendedMediaData) {
        if (recommendedMediaData == null) {
            C1044Mm.j("nf_loc", "Default recommendation in manifest does not found, this should not happen!");
            return null;
        }
        return e(audioSourceArr, recommendedMediaData.getAudioTrackId());
    }

    private static AudioSource e(AudioSource[] audioSourceArr, String str) {
        for (AudioSource audioSource : audioSourceArr) {
            if (audioSource != null && audioSource.getNewTrackId() != null && audioSource.getNewTrackId().equals(str)) {
                return audioSource;
            }
        }
        return null;
    }

    public static Subtitle d(String str, Boolean bool, Subtitle[] subtitleArr) {
        for (int i = 0; i < subtitleArr.length; i++) {
            if (str.equals("none") && subtitleArr[i].getId().equals("none")) {
                return subtitleArr[i];
            }
            if (str.equals(subtitleArr[i].getLanguageCodeBcp47()) && (bool == null || bool.booleanValue() == subtitleArr[i].isCC())) {
                return subtitleArr[i];
            }
        }
        return null;
    }

    /* renamed from: o.dhu$b */
    /* loaded from: classes5.dex */
    public static class b {
        public long a;
        public int b;
        public int c;
        public String d;
        public String e;

        void d(String str, int i) {
            this.e = str;
            this.b = i;
        }

        void e(String str, int i) {
            this.d = str;
            this.c = i;
        }

        public b(String str, int i, String str2, int i2) {
            if (C8168dfL.g(str) && C8168dfL.g(str2)) {
                throw new IllegalArgumentException("Audio or subtitle must be selected!");
            }
            this.a = System.currentTimeMillis();
            this.d = str;
            this.c = i;
            this.e = str2;
            this.b = i2;
        }

        public b(Language language) {
            if (language == null) {
                throw new IllegalArgumentException("Selected language is null!");
            }
            this.a = System.currentTimeMillis();
            AudioSource selectedAudio = language.getSelectedAudio();
            if (selectedAudio != null) {
                this.d = selectedAudio.getLanguageCodeBcp47();
                this.c = selectedAudio.getTrackType();
            } else {
                InterfaceC1598aHf.a(new C1596aHd("LanguageUtils: Selected audio is null.").b(false));
            }
            Subtitle selectedSubtitle = language.getSelectedSubtitle();
            if (selectedSubtitle != null) {
                this.e = selectedSubtitle.getLanguageCodeBcp47();
                this.b = selectedSubtitle.getTrackType();
                return;
            }
            InterfaceC1598aHf.a(new C1596aHd("LanguageUtils: Selected subtitle is null.").b(false));
        }

        public b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("JSON is null!");
            }
            this.d = jSONObject.getString("audioLanguageCodeBcp47");
            this.c = jSONObject.getInt("audioTrackType");
            this.e = jSONObject.optString("subtitleLanguageCodeBcp47", null);
            this.b = jSONObject.optInt("subtitleTrackType", 0);
            this.a = jSONObject.getLong("timestamp");
        }

        public String toString() {
            return "SelectedLanguage{timestamp=" + this.a + ", audioLanguageCodeIso639_1='" + this.d + "', audioTrackType=" + this.c + ", subtitleLanguageCodeIso639_1='" + this.e + "', subtitleTrackType=" + this.b + '}';
        }

        public JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", this.a);
            jSONObject.put("audioLanguageCodeBcp47", this.d);
            jSONObject.put("audioTrackType", this.c);
            if (C8168dfL.h(this.e)) {
                jSONObject.put("subtitleLanguageCodeBcp47", this.e);
                jSONObject.put("subtitleTrackType", this.b);
            }
            return jSONObject;
        }
    }
}
