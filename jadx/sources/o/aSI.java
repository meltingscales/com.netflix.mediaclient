package o;

import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* loaded from: classes3.dex */
public interface aSI {
    String a(InteractiveSummary interactiveSummary);

    String a(List<TagSummary> list);

    String b(VideoInfo.TimeCodes timeCodes);

    InteractiveSummary c(String str);

    String c(List<Advisory> list);

    List<Advisory> d(String str);

    VideoInfo.TimeCodes e(String str);
}
