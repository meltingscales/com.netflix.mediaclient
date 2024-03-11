package com.netflix.mediaclient.media;

import com.netflix.mediaclient.media.subtitles.Subtitle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SubtitleTrackData {
    protected String id;
    protected int mPosition;
    protected String newTrackId;
    protected Subtitle subtitleInfo;
    protected List<SubtitleUrl> urls = new ArrayList();
    protected Map<String, Integer> mCdnToRankMap = new HashMap();

    public String getId() {
        return this.id;
    }

    public String getNewTrackId() {
        return this.newTrackId;
    }

    public Subtitle getSubtitleInfo() {
        return this.subtitleInfo;
    }

    public List<SubtitleUrl> getUrls() {
        return this.urls;
    }

    public void reset() {
        this.mPosition = 0;
    }

    public String toString() {
        return "SubtitleTrackData{id='" + this.id + "', urls=" + this.urls + ", subtitleInfo=" + this.subtitleInfo + ", mPosition=" + this.mPosition + '}';
    }

    public int getRankForCdn(String str) {
        Integer num = this.mCdnToRankMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public SubtitleUrl pop() {
        if (this.mPosition < this.urls.size()) {
            List<SubtitleUrl> list = this.urls;
            int i = this.mPosition;
            this.mPosition = i + 1;
            return list.get(i);
        }
        return null;
    }

    public String getDownloadId() {
        if (this.urls.isEmpty()) {
            return null;
        }
        return this.urls.get(0).getDownloadableId();
    }
}
