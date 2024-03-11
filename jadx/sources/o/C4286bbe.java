package o;

import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.SubtitleTrackData;
import com.netflix.mediaclient.media.SubtitleUrl;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bbe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4286bbe {
    C4286bbe() {
    }

    public static List<C4222baT> c(InterfaceC4525bgE interfaceC4525bgE, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (AudioSource audioSource : interfaceC4525bgE.M()) {
            for (Stream stream : audioSource.getStreams()) {
                if (list == null || list.contains(stream.downloadableId())) {
                    C4222baT a = C4222baT.a(stream, interfaceC4525bgE.aj());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C4261bbF> b(InterfaceC4525bgE interfaceC4525bgE, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (VideoTrack videoTrack : interfaceC4525bgE.an()) {
            for (Stream stream : videoTrack.streams()) {
                C1044Mm.a("nf_downloadableSelect", "video_tracks has bitrate " + stream.bitrate());
                if (list == null || list.contains(stream.downloadableId())) {
                    C4261bbF e = C4261bbF.e(stream, interfaceC4525bgE.aj());
                    if (e != null) {
                        arrayList.add(e);
                        return arrayList;
                    }
                }
            }
        }
        return Collections.emptyList();
    }

    public static List<C4307bbz> a(InterfaceC4525bgE interfaceC4525bgE, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (SubtitleTrackData subtitleTrackData : interfaceC4525bgE.ak()) {
            if (subtitleTrackData.getUrls().size() > 0) {
                subtitleTrackData.getSubtitleInfo().getLanguageCodeBcp47();
                subtitleTrackData.getSubtitleInfo().getTrackType();
                HashMap hashMap = new HashMap();
                for (SubtitleUrl subtitleUrl : subtitleTrackData.getUrls()) {
                    if (list == null || list.contains(subtitleUrl.getDownloadableId())) {
                        if (hashMap.get(subtitleUrl.getProfile()) == null) {
                            hashMap.put(subtitleUrl.getProfile(), new ArrayList());
                        }
                        ((List) hashMap.get(subtitleUrl.getProfile())).add(subtitleUrl);
                    }
                }
                HashSet hashSet = new HashSet(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    for (SubtitleUrl subtitleUrl2 : (List) entry.getValue()) {
                        hashSet.add(subtitleUrl2.getProfile());
                    }
                }
                String b = C4731bjz.b(hashMap.keySet(), hashSet, subtitleTrackData.getSubtitleInfo().getLanguageCodeBcp47(), false);
                ArrayList arrayList2 = new ArrayList();
                if (hashMap.get(b) != null) {
                    arrayList2.addAll((Collection) hashMap.get(b));
                }
                C4307bbz d = C4307bbz.d(subtitleTrackData, arrayList2);
                if (d != null) {
                    arrayList.add(d);
                }
            }
        }
        return arrayList;
    }

    public static List<C4304bbw> d(InterfaceC4525bgE interfaceC4525bgE, List<String> list) {
        C4540bgT[] ao;
        C4304bbw d;
        ArrayList arrayList = new ArrayList();
        for (C4540bgT c4540bgT : interfaceC4525bgE.ao()) {
            if ((list == null || list.contains(c4540bgT.e())) && c4540bgT.a() && (d = C4304bbw.d(c4540bgT)) != null) {
                arrayList.add(d);
                return arrayList;
            }
        }
        return Collections.emptyList();
    }
}
