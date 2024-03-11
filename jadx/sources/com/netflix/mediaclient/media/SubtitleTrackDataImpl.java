package com.netflix.mediaclient.media;

import com.netflix.mediaclient.media.subtitles.NccpSubtitle;
import java.util.List;
import java.util.Map;
import o.AbstractC4534bgN;
import o.AbstractC4536bgP;
import o.AbstractC4537bgQ;
import o.C8168dfL;

/* loaded from: classes.dex */
public class SubtitleTrackDataImpl extends SubtitleTrackData {
    public SubtitleTrackDataImpl(AbstractC4537bgQ abstractC4537bgQ, int i) {
        AbstractC4536bgP abstractC4536bgP;
        Map<String, String> c;
        long j;
        this.mPosition = 0;
        this.subtitleInfo = NccpSubtitle.newInstance(abstractC4537bgQ, i);
        this.id = abstractC4537bgQ.f();
        Map<String, String> s = abstractC4537bgQ.s();
        Map<String, AbstractC4536bgP> t = abstractC4537bgQ.t();
        this.newTrackId = abstractC4537bgQ.m();
        for (String str : s.keySet()) {
            String str2 = s.get(str);
            if (!C8168dfL.g(str2) && (abstractC4536bgP = t.get(str)) != null && (c = abstractC4536bgP.c()) != null) {
                long g = abstractC4536bgP.g();
                for (Map.Entry<String, String> entry : c.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!C8168dfL.g(key) && !C8168dfL.g(value)) {
                        try {
                            j = g;
                            try {
                                this.urls.add(new SubtitleUrl(value, str, Long.parseLong(key), str2, g));
                            } catch (NumberFormatException unused) {
                            }
                        } catch (NumberFormatException unused2) {
                            j = g;
                        }
                        g = j;
                    }
                }
            }
        }
        List<AbstractC4534bgN> a = abstractC4537bgQ.a();
        if (a != null) {
            for (int i2 = 0; i2 < a.size(); i2++) {
                AbstractC4534bgN abstractC4534bgN = a.get(i2);
                this.mCdnToRankMap.put(Integer.toString(abstractC4534bgN.a()), Integer.valueOf(abstractC4534bgN.e()));
            }
        }
    }
}
