package com.netflix.mediaclient.media;

import com.netflix.mediaclient.media.mdx.MdxAudioSource;
import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import com.netflix.mediaclient.media.subtitles.MdxSubtitle;
import com.netflix.mediaclient.media.subtitles.NccpSubtitle;
import com.netflix.mediaclient.media.subtitles.OfflineTextSubtitle;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C1044Mm;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Language {
    private static final int EMPTY_TRACK_INDEX = -1;
    private static final String JSON_AUDIO_ARRAY = "audio_array";
    private static final String JSON_CURRENT_NCCP_AUDIO_INDEX = "CurrentNccpAudioIndex";
    private static final String JSON_CURRENT_NCCP_SUBTITLE_INDEX = "CurrentNccpSubtitleIndex";
    private static final String JSON_IS_SALSA_SUPPORTED = "isSalsaSupported";
    private static final String JSON_MAX_RECOMMENDED_AUDIO_RANK = "maxRecommendedAudioRank";
    private static final String JSON_MAX_RECOMMENDED_TEXT_RANK = "maxRecommendedTextRank";
    private static final String JSON_PREVIOUS_NCCP_AUDIO_INDEX = "PreviousNccpAudioIndex";
    private static final String JSON_PREVIOUS_NCCP_SUBTITLE_INDEX = "PreviousNccpSubtitleIndex";
    private static final String JSON_SUBTITLE_ARRAY = "subtitle_array";
    private static final String JSON_SUBTITLE_VISIBLE = "subtitle_visible";
    private static final String OFF_SUBTITLE_TRACK_DESC = "Off";
    private static final String TAG = "nf_language";
    AudioSource[] mAltAudios;
    private int mCurrentNccpAudioIndex;
    private int mCurrentNccpSubtitleIndex;
    private boolean mIsSalsaSupported;
    private int mMaxRecommendedAudioRank;
    private int mMaxRecommendedTextRank;
    AudioSource mSelectedAudio;
    private Subtitle mSelectedSubtitle;
    private boolean mSubtitleVisible;
    Subtitle[] mSubtitles;
    private int mPreviousNccpSubtitleIndex = -1;
    private int mPreviousNccpAudioIndex = 0;
    private final List<Subtitle> mUsedSubtitles = new ArrayList();

    public AudioSource[] getAltAudios() {
        return this.mAltAudios;
    }

    public int getCurrentNccpAudioIndex() {
        return this.mCurrentNccpAudioIndex;
    }

    public int getCurrentNccpSubtitleIndex() {
        return this.mCurrentNccpSubtitleIndex;
    }

    public int getMaxRecommendedAudioRank() {
        return this.mMaxRecommendedAudioRank;
    }

    public int getMaxRecommendedTextRank() {
        return this.mMaxRecommendedTextRank;
    }

    public AudioSource getSelectedAudio() {
        return this.mSelectedAudio;
    }

    public Subtitle getSelectedSubtitle() {
        return this.mSelectedSubtitle;
    }

    public Subtitle[] getSubtitles() {
        return this.mSubtitles;
    }

    public List<Subtitle> getUsedSubtitles() {
        return this.mUsedSubtitles;
    }

    public boolean isSubtitleVisible() {
        return this.mSubtitleVisible;
    }

    public Language(AudioSource[] audioSourceArr, int i, Subtitle[] subtitleArr, int i2, boolean z, boolean z2, int i3, int i4) {
        this.mCurrentNccpAudioIndex = i;
        if (audioSourceArr != null) {
            dedupAudioTrackOnLanguageDescription(audioSourceArr, i);
        } else {
            this.mAltAudios = new AudioSource[0];
        }
        if (subtitleArr != null) {
            this.mSubtitles = subtitleArr;
        } else {
            this.mSubtitles = new Subtitle[0];
        }
        this.mSubtitleVisible = z;
        this.mCurrentNccpSubtitleIndex = i2;
        this.mIsSalsaSupported = z2;
        this.mMaxRecommendedAudioRank = i3;
        this.mMaxRecommendedTextRank = i4;
        setSelectedAudio(getAudioSource(this.mAltAudios, i));
        setSelectedSubtitle(getSubtitle(this.mSubtitles, this.mCurrentNccpSubtitleIndex));
    }

    public static Subtitle newSubtitleInstance(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(BaseSubtitle.IMPL, -1);
        if (optInt == 2) {
            return MdxSubtitle.newInstance(jSONObject, jSONObject.getInt(BaseSubtitle.ATTR_ORDER));
        }
        if (optInt == 1) {
            return NccpSubtitle.newInstance(jSONObject);
        }
        if (optInt == 3 || optInt == 4) {
            return new OfflineTextSubtitle(jSONObject);
        }
        throw new JSONException("Implementation does not support restore " + optInt);
    }

    private void dedupAudioTrackOnLanguageDescription(AudioSource[] audioSourceArr, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(audioSourceArr));
        Arrays.sort(audioSourceArr);
        String str = new String();
        int i2 = -1;
        for (AudioSource audioSource : audioSourceArr) {
            if (!str.equals(audioSource.getLanguageDescription())) {
                str = audioSource.getLanguageDescription();
                i2 = audioSource.getNccpOrderNumber();
            } else {
                arrayList.remove(audioSource);
            }
            if (i2 != -1 && audioSource.nccpOrderNumber == i) {
                this.mCurrentNccpAudioIndex = i2;
            }
        }
        this.mAltAudios = (AudioSource[]) arrayList.toArray(new AudioSource[0]);
    }

    public boolean isLanguageSwitchEnabled() {
        Subtitle[] subtitleArr = this.mSubtitles;
        if (subtitleArr == null || subtitleArr.length <= 0) {
            AudioSource[] audioSourceArr = this.mAltAudios;
            return audioSourceArr != null && audioSourceArr.length > 1;
        }
        return true;
    }

    private static AudioSource getAudioSource(AudioSource[] audioSourceArr, int i) {
        if (audioSourceArr == null) {
            C1044Mm.d(TAG, "Audios are null!");
            return null;
        }
        for (AudioSource audioSource : audioSourceArr) {
            if (audioSource.getNccpOrderNumber() == i) {
                C1044Mm.e(TAG, "Found!");
                return audioSource;
            }
        }
        return null;
    }

    public Subtitle getCurrentSubtitle() {
        if (this.mSubtitleVisible || this.mCurrentNccpSubtitleIndex != -1) {
            return getSubtitle(this.mSubtitles, this.mCurrentNccpSubtitleIndex);
        }
        return null;
    }

    public AudioSource getCurrentAudioSource() {
        return getAudioSource(this.mAltAudios, this.mCurrentNccpAudioIndex);
    }

    private AudioSource getAudioSourceByPosition(int i) {
        if (i >= 0) {
            AudioSource[] audioSourceArr = this.mAltAudios;
            if (i < audioSourceArr.length) {
                return audioSourceArr[i];
            }
        }
        C1044Mm.d(TAG, "getAudioSourceByIndex: position invalid: " + i);
        return null;
    }

    private static Subtitle getSubtitle(Subtitle[] subtitleArr, int i) {
        if (subtitleArr == null) {
            C1044Mm.d(TAG, "Subtitles are null!");
            return null;
        }
        for (Subtitle subtitle : subtitleArr) {
            if (subtitle.getNccpOrderNumber() == i) {
                C1044Mm.e(TAG, "Found!");
                return subtitle;
            }
        }
        return null;
    }

    public AudioSource setSelectedAudio(AudioSource audioSource) {
        if (isEmptyTrack(audioSource)) {
            C1044Mm.e(TAG, "Selected emptry(fake) track. Ignored" + audioSource);
        } else {
            this.mSelectedAudio = audioSource;
            updateUsedSubtitles(audioSource);
        }
        return this.mSelectedAudio;
    }

    void updateUsedSubtitles(AudioSource audioSource) {
        this.mUsedSubtitles.clear();
        if (audioSource == null || (!isOffSubtitleAvailable(audioSource) && audioSource.isAllowedSubtitle(null))) {
            this.mUsedSubtitles.add(null);
        } else {
            Subtitle[] subtitleArr = this.mSubtitles;
            if (subtitleArr == null || countAllowedSubtitles(subtitleArr, audioSource) < 1) {
                this.mUsedSubtitles.add(null);
            }
        }
        Subtitle[] subtitleArr2 = this.mSubtitles;
        if (subtitleArr2 != null) {
            for (Subtitle subtitle : subtitleArr2) {
                if (audioSource == null || audioSource.isAllowedSubtitle(subtitle)) {
                    this.mUsedSubtitles.add(subtitle);
                }
            }
        }
    }

    public Subtitle setSelectedSubtitle(Subtitle subtitle) {
        for (int i = 0; i < this.mUsedSubtitles.size(); i++) {
            Subtitle subtitle2 = this.mUsedSubtitles.get(i);
            if (subtitle2 == null && subtitle == null) {
                this.mSelectedSubtitle = null;
                return null;
            } else if (subtitle2 != null && subtitle2.getLanguageDescription().equalsIgnoreCase(OFF_SUBTITLE_TRACK_DESC) && subtitle == null) {
                this.mSelectedSubtitle = subtitle2;
                return subtitle2;
            } else if (subtitle2 != null && subtitle2.equals(subtitle)) {
                this.mSelectedSubtitle = subtitle;
                return subtitle;
            }
        }
        C1044Mm.j(TAG, "We tried to select subtitle that is NOT in list of used subtitles!");
        return null;
    }

    public void commit() {
        this.mPreviousNccpAudioIndex = this.mCurrentNccpAudioIndex;
        AudioSource audioSource = this.mSelectedAudio;
        if (audioSource != null) {
            this.mCurrentNccpAudioIndex = audioSource.getNccpOrderNumber();
        }
        this.mPreviousNccpSubtitleIndex = this.mCurrentNccpSubtitleIndex;
        Subtitle subtitle = this.mSelectedSubtitle;
        if (subtitle != null) {
            this.mCurrentNccpSubtitleIndex = subtitle.getNccpOrderNumber();
            if (!this.mSelectedSubtitle.getLanguageDescription().equals(OFF_SUBTITLE_TRACK_DESC)) {
                this.mSubtitleVisible = true;
                return;
            }
        } else {
            this.mCurrentNccpSubtitleIndex = -1;
        }
        this.mSubtitleVisible = false;
    }

    private static int countAllowedSubtitles(Subtitle[] subtitleArr, AudioSource audioSource) {
        if (audioSource == null || subtitleArr == null || subtitleArr.length < 1) {
            return 0;
        }
        int i = 0;
        for (Subtitle subtitle : subtitleArr) {
            if (audioSource.isAllowedSubtitle(subtitle)) {
                i++;
            }
        }
        return i;
    }

    public void restorePreviousSubtitle() {
        this.mSelectedSubtitle = this.mPreviousNccpSubtitleIndex > -1 ? getSubtitle(getSubtitles(), this.mPreviousNccpSubtitleIndex) : null;
        this.mPreviousNccpSubtitleIndex = -1;
    }

    public void restorePreviousAudio() {
        if (this.mPreviousNccpAudioIndex < 0) {
            C1044Mm.d(TAG, "This should not happen!");
        } else if (setSelectedAudio(getAudioSource(getAltAudios(), this.mPreviousNccpAudioIndex)) == null) {
            C1044Mm.j(TAG, "Unable to restore to previous audio. Not allowed!");
        } else {
            this.mPreviousNccpAudioIndex = 0;
        }
    }

    public String toString() {
        return "Language [mSubtitles=" + Arrays.toString(this.mSubtitles) + ", mAltAudios=" + Arrays.toString(this.mAltAudios) + ", mSubtitleVisible=" + this.mSubtitleVisible + ", mCurrentNccpSubtitleIndex=" + this.mCurrentNccpSubtitleIndex + ", mCurrentNccpAudioIndex=" + this.mCurrentNccpAudioIndex + ", mPreviousNccpSubtitleIndex=" + this.mPreviousNccpSubtitleIndex + ", mPreviousNccpAudioIndex=" + this.mPreviousNccpAudioIndex + ", mUsedSubtitles=" + this.mUsedSubtitles + ", mSelectedAudio=" + this.mSelectedAudio + ", mSelectedSubtitle=" + this.mSelectedSubtitle + "]";
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_CURRENT_NCCP_AUDIO_INDEX, this.mCurrentNccpAudioIndex);
        jSONObject.put(JSON_CURRENT_NCCP_SUBTITLE_INDEX, this.mCurrentNccpSubtitleIndex);
        jSONObject.put(JSON_PREVIOUS_NCCP_AUDIO_INDEX, this.mPreviousNccpAudioIndex);
        jSONObject.put(JSON_PREVIOUS_NCCP_SUBTITLE_INDEX, this.mPreviousNccpSubtitleIndex);
        jSONObject.put(JSON_SUBTITLE_VISIBLE, this.mSubtitleVisible);
        jSONObject.put(JSON_IS_SALSA_SUPPORTED, this.mIsSalsaSupported);
        jSONObject.put(JSON_MAX_RECOMMENDED_AUDIO_RANK, this.mMaxRecommendedAudioRank);
        jSONObject.put(JSON_MAX_RECOMMENDED_TEXT_RANK, this.mMaxRecommendedTextRank);
        Subtitle[] subtitleArr = this.mSubtitles;
        int i = 0;
        if (subtitleArr != null && subtitleArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            while (true) {
                Subtitle[] subtitleArr2 = this.mSubtitles;
                if (i2 >= subtitleArr2.length) {
                    break;
                }
                jSONArray.put(subtitleArr2[i2].toJson());
                i2++;
            }
            jSONObject.put(JSON_SUBTITLE_ARRAY, jSONArray);
        }
        AudioSource[] audioSourceArr = this.mAltAudios;
        if (audioSourceArr != null && audioSourceArr.length > 0) {
            JSONArray jSONArray2 = new JSONArray();
            while (true) {
                AudioSource[] audioSourceArr2 = this.mAltAudios;
                if (i >= audioSourceArr2.length) {
                    break;
                }
                jSONArray2.put(audioSourceArr2[i].toJson());
                i++;
            }
            jSONObject.put(JSON_AUDIO_ARRAY, jSONArray2);
        }
        return jSONObject.toString();
    }

    public static Language restoreLanguage(String str) {
        Subtitle[] subtitleArr;
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt(JSON_CURRENT_NCCP_SUBTITLE_INDEX);
        int i2 = jSONObject.getInt(JSON_CURRENT_NCCP_AUDIO_INDEX);
        int i3 = jSONObject.getInt(JSON_CURRENT_NCCP_SUBTITLE_INDEX);
        int i4 = jSONObject.getInt(JSON_CURRENT_NCCP_AUDIO_INDEX);
        boolean z = jSONObject.getBoolean(JSON_SUBTITLE_VISIBLE);
        JSONArray optJSONArray = jSONObject.optJSONArray(JSON_AUDIO_ARRAY);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(JSON_SUBTITLE_ARRAY);
        boolean z2 = jSONObject.getBoolean(JSON_IS_SALSA_SUPPORTED);
        int i5 = jSONObject.getInt(JSON_MAX_RECOMMENDED_AUDIO_RANK);
        int i6 = jSONObject.getInt(JSON_MAX_RECOMMENDED_TEXT_RANK);
        AudioSource[] audioSourceArr = null;
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            subtitleArr = new Subtitle[length];
            for (int i7 = 0; i7 < length; i7++) {
                subtitleArr[i7] = newSubtitleInstance(optJSONArray2.getJSONObject(i7));
            }
        } else {
            subtitleArr = null;
        }
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            audioSourceArr = new AudioSource[length2];
            for (int i8 = 0; i8 < length2; i8++) {
                audioSourceArr[i8] = restore(optJSONArray.getJSONObject(i8), z2);
            }
        }
        Language language = new Language(audioSourceArr, i2, subtitleArr, i, z, z2, i5, i6);
        language.mPreviousNccpAudioIndex = i4;
        language.mPreviousNccpSubtitleIndex = i3;
        return language;
    }

    private boolean isOffSubtitleAvailable(AudioSource audioSource) {
        Subtitle[] subtitleArr;
        for (Subtitle subtitle : this.mSubtitles) {
            if (subtitle.isForcedNarrativeOrNone() && audioSource.isAllowedSubtitle(subtitle)) {
                return true;
            }
        }
        return false;
    }

    private static AudioSource restore(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(BaseSubtitle.IMPL, -1);
        if (optInt == 2) {
            return MdxAudioSource.newInstance(jSONObject, jSONObject.getInt(BaseSubtitle.ATTR_ORDER));
        }
        if (optInt == 1) {
            return NccpAudioSource.newInstance(jSONObject, jSONObject.getInt(BaseSubtitle.ATTR_ORDER), z);
        }
        throw new JSONException("Implementation does not support restore " + optInt);
    }

    private boolean isEmptyTrack(AudioSource audioSource) {
        return audioSource != null && audioSource.getId().equals(-1);
    }
}
