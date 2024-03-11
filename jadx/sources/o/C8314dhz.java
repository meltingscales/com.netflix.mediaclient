package o;

import android.content.Context;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.LanguageChoice;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.media.RecommendedMediaData;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import o.C8309dhu;

/* renamed from: o.dhz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8314dhz {
    private Boolean a;
    private String b;
    private AudioSource[] c;
    private Boolean d;
    private String e;
    private Subtitle[] f;
    private String g;
    private C8309dhu.b h;
    private AudioSource i;
    private String j;
    private Subtitle k;

    public C8314dhz(Context context, Subtitle[] subtitleArr, AudioSource[] audioSourceArr, RecommendedMediaData recommendedMediaData, boolean z, PreferredLanguageData preferredLanguageData) {
        LanguageChoice languageChoice;
        if (preferredLanguageData != null) {
            this.e = preferredLanguageData.getAudioCode();
            this.j = preferredLanguageData.getSubtitleCode();
            this.a = preferredLanguageData.isAssistive();
            this.d = preferredLanguageData.isClosedCaption();
        }
        if (z) {
            C8309dhu.b c = C8309dhu.c(context);
            this.h = c;
            languageChoice = C8309dhu.a(c, subtitleArr, audioSourceArr, recommendedMediaData, this.e, this.a, this.j, this.d);
        } else {
            languageChoice = null;
        }
        e(subtitleArr, audioSourceArr, recommendedMediaData != null ? recommendedMediaData.getAudioTrackId() : null, recommendedMediaData != null ? recommendedMediaData.getTimedTextTrackId() : null, languageChoice, z);
    }

    public void e(Subtitle[] subtitleArr, AudioSource[] audioSourceArr, String str, String str2, LanguageChoice languageChoice, boolean z) {
        AudioSource.dumpLog(audioSourceArr, "nf-l10n");
        C4971bpu.c(subtitleArr, "nf-l10n");
        if (subtitleArr != null) {
            C4971bpu.c(subtitleArr, "nf-l10n");
            this.f = subtitleArr;
        }
        if (audioSourceArr != null) {
            AudioSource.dumpLog(audioSourceArr, "nf-l10n");
            this.c = audioSourceArr;
        }
        if (str != null) {
            this.b = str;
        }
        if (str2 != null) {
            this.g = str2;
        }
        if (languageChoice == null) {
            C1044Mm.e("nf-l10n", "User choice for audio AND subtitle did not existed!");
            return;
        }
        if (languageChoice.getSubtitle() == null) {
            C1044Mm.e("nf-l10n", "User choice for subtitle did not existed!");
        } else {
            this.k = b(languageChoice.getSubtitle().getId());
        }
        if (languageChoice.getAudio() == null) {
            C1044Mm.e("nf-l10n", "User choice for audio did not existed!");
        } else {
            this.i = e(languageChoice.getAudio().getNewTrackId());
        }
    }

    public LanguageChoice e() {
        if (this.k != null) {
            C1044Mm.e("nf-l10n", "We found user preference for subtitle!");
        }
        LanguageChoice.SelectionReport selectionReport = new LanguageChoice.SelectionReport(this.h);
        if (this.i != null) {
            if (this.k == null) {
                C1044Mm.e("nf-l10n", "No user preferences for subtitle.");
            }
            if (this.i.isAllowedSubtitle(this.k)) {
                C1044Mm.e("nf-l10n", "Using user preference for language");
                LanguageChoice.LanguageSelectionOrigin languageSelectionOrigin = LanguageChoice.LanguageSelectionOrigin.USER_OVERRIDE;
                selectionReport.setSubtitleLanguageSelectionOrigin(languageSelectionOrigin);
                selectionReport.setAudioLanguageSelectionOrigin(languageSelectionOrigin);
                return new LanguageChoice(this.k, this.i, selectionReport);
            }
            C1044Mm.e("nf-l10n", "Using user preference is not allowed, go for NCCP default");
            LanguageChoice.LanguageSelectionOrigin languageSelectionOrigin2 = LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT;
            selectionReport.setSubtitleLanguageSelectionOrigin(languageSelectionOrigin2);
            selectionReport.setAudioLanguageSelectionOrigin(languageSelectionOrigin2);
            return new LanguageChoice(a(), b(), selectionReport);
        }
        C1044Mm.e("nf-l10n", "No user preference for audio!");
        LanguageChoice.LanguageSelectionOrigin languageSelectionOrigin3 = LanguageChoice.LanguageSelectionOrigin.MANIFEST_DEFAULT;
        selectionReport.setAudioLanguageSelectionOrigin(languageSelectionOrigin3);
        AudioSource b = b();
        if (b == null) {
            C1044Mm.d("nf-l10n", "Initial audio not found!");
            selectionReport.setSubtitleLanguageSelectionOrigin(languageSelectionOrigin3);
            return new LanguageChoice(null, null, selectionReport);
        }
        Subtitle subtitle = this.k;
        if (subtitle != null) {
            if (b.isAllowedSubtitle(subtitle)) {
                C1044Mm.e("nf-l10n", "Using user preference for language");
                selectionReport.setSubtitleLanguageSelectionOrigin(LanguageChoice.LanguageSelectionOrigin.USER_OVERRIDE);
                return new LanguageChoice(this.k, b, selectionReport);
            }
            C1044Mm.e("nf-l10n", "Using user preference is not allowed, go for NCCP default");
            selectionReport.setSubtitleLanguageSelectionOrigin(languageSelectionOrigin3);
            return new LanguageChoice(a(), b, selectionReport);
        }
        C1044Mm.e("nf-l10n", "No user preferences for audio and subtitle. Use NCCP defaults.");
        selectionReport.setSubtitleLanguageSelectionOrigin(languageSelectionOrigin3);
        selectionReport.setAudioLanguageSelectionOrigin(languageSelectionOrigin3);
        return new LanguageChoice(a(), b, selectionReport);
    }

    private Subtitle a() {
        if (this.f == null) {
            return null;
        }
        String str = this.g;
        Subtitle d = str != null ? d(str) : null;
        if (d == null) {
            C1044Mm.d("nf-l10n", "Default exist: " + str + ", but subtitle with it not found!");
            Subtitle[] subtitleArr = this.f;
            Subtitle subtitle = subtitleArr.length >= 1 ? subtitleArr[0] : null;
            C1044Mm.a("nf-l10n", "using first source for subtitle " + subtitle);
            return subtitle;
        } else if (this.d == null || d.isCC() == this.d.booleanValue()) {
            return d;
        } else {
            C1044Mm.e("nf-l10n", "Initial subtitle chosen with defaults but a different CC type");
            return C8309dhu.d(d.getLanguageCodeBcp47(), this.d, this.f);
        }
    }

    private AudioSource b() {
        AudioSource[] audioSourceArr = this.c;
        if (audioSourceArr == null || audioSourceArr.length < 1) {
            C1044Mm.j("nf-l10n", "No audio source found!");
            return null;
        }
        String str = this.b;
        AudioSource e = str != null ? e(str) : null;
        String str2 = this.b;
        if (e == null) {
            C1044Mm.d("nf-l10n", "Default exist: " + str2 + ", but source with it not found!");
            AudioSource[] audioSourceArr2 = this.c;
            AudioSource audioSource = audioSourceArr2.length >= 1 ? audioSourceArr2[0] : null;
            C1044Mm.a("nf-l10n", "using first source for audio " + audioSource);
            return audioSource;
        }
        return e;
    }

    private AudioSource e(String str) {
        AudioSource[] audioSourceArr = this.c;
        if (audioSourceArr == null) {
            return null;
        }
        for (AudioSource audioSource : audioSourceArr) {
            if (str.equals(audioSource.getNewTrackId())) {
                return audioSource;
            }
        }
        return null;
    }

    private Subtitle b(String str) {
        if (str != null) {
            Subtitle[] subtitleArr = this.f;
            if (subtitleArr == null) {
                return null;
            }
            for (Subtitle subtitle : subtitleArr) {
                if (str.equals(subtitle.getId())) {
                    return subtitle;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Subtitle id can NOT be null!");
    }

    private Subtitle d(String str) {
        Subtitle[] subtitleArr = this.f;
        if (subtitleArr == null) {
            return null;
        }
        for (Subtitle subtitle : subtitleArr) {
            if (str.equals(subtitle.getNewTrackId())) {
                return subtitle;
            }
        }
        return null;
    }
}
