package com.netflix.mediaclient.media.subtitles;

import com.netflix.mediaclient.media.SubtitleUrl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class OfflineTextSubtitle extends OfflineSubtitle {
    public static final int IMPL_VALUE = 3;
    @Deprecated
    public static final int LEGACY_IMPL_VALUE = 4;

    @Override // com.netflix.mediaclient.media.subtitles.OfflineSubtitle
    protected int getImplementation() {
        return 3;
    }

    @Override // com.netflix.mediaclient.media.subtitles.Subtitle
    public int getRank() {
        return -1;
    }

    public OfflineTextSubtitle(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OfflineTextSubtitle(Subtitle subtitle, SubtitleUrl subtitleUrl, String str) {
        super(subtitle, subtitleUrl, str);
    }
}
