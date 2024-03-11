package com.netflix.mediaclient.media;

import com.netflix.mediaclient.media.subtitles.Subtitle;
import o.C8309dhu;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LanguageChoice {
    private AudioSource audio;
    private SelectionReport selectionReport;
    private Subtitle subtitle;

    /* loaded from: classes3.dex */
    public enum LanguageSelectionOrigin {
        USER_OVERRIDE,
        MANIFEST_DEFAULT
    }

    public AudioSource getAudio() {
        return this.audio;
    }

    public SelectionReport getSelectionReport() {
        return this.selectionReport;
    }

    public Subtitle getSubtitle() {
        return this.subtitle;
    }

    public LanguageChoice(Subtitle subtitle, AudioSource audioSource, SelectionReport selectionReport) {
        this.subtitle = subtitle;
        this.audio = audioSource;
        this.selectionReport = selectionReport;
    }

    public String toString() {
        return "LanguageChoice{subtitle=" + this.subtitle + ", audio=" + this.audio + ", selectionReport=" + this.selectionReport + '}';
    }

    /* loaded from: classes3.dex */
    public static final class SelectionReport {
        private LanguageSelectionOrigin audioLanguageSelectionOrigin;
        private C8309dhu.b selectedLanguage;
        private LanguageSelectionOrigin subtitleLanguageSelectionOrigin;

        public LanguageSelectionOrigin getAudioLanguageSelectionOrigin() {
            return this.audioLanguageSelectionOrigin;
        }

        public C8309dhu.b getSelectedLanguage() {
            return this.selectedLanguage;
        }

        public LanguageSelectionOrigin getSubtitleLanguageSelectionOrigin() {
            return this.subtitleLanguageSelectionOrigin;
        }

        public void setAudioLanguageSelectionOrigin(LanguageSelectionOrigin languageSelectionOrigin) {
            this.audioLanguageSelectionOrigin = languageSelectionOrigin;
        }

        public void setSubtitleLanguageSelectionOrigin(LanguageSelectionOrigin languageSelectionOrigin) {
            this.subtitleLanguageSelectionOrigin = languageSelectionOrigin;
        }

        public SelectionReport(C8309dhu.b bVar) {
            LanguageSelectionOrigin languageSelectionOrigin = LanguageSelectionOrigin.USER_OVERRIDE;
            this.subtitleLanguageSelectionOrigin = languageSelectionOrigin;
            this.audioLanguageSelectionOrigin = languageSelectionOrigin;
            this.selectedLanguage = bVar;
        }

        public String toString() {
            return "SelectionReport{subtitleLanguageSelectionOrigin=" + this.subtitleLanguageSelectionOrigin + ", audioLanguageSelectionOrigin=" + this.audioLanguageSelectionOrigin + ", selectedLanguage=" + this.selectedLanguage + '}';
        }

        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                LanguageSelectionOrigin languageSelectionOrigin = this.subtitleLanguageSelectionOrigin;
                if (languageSelectionOrigin != null) {
                    jSONObject.put("subtitleOrigin", languageSelectionOrigin);
                }
                LanguageSelectionOrigin languageSelectionOrigin2 = this.audioLanguageSelectionOrigin;
                if (languageSelectionOrigin2 != null) {
                    jSONObject.put("audioOrigin", languageSelectionOrigin2);
                }
                C8309dhu.b bVar = this.selectedLanguage;
                if (bVar != null) {
                    jSONObject.put("selectedLanguage", bVar.b());
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }
}
