package o;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.netflix.model.leafs.TimeCodesData;
import com.netflix.model.leafs.TimeCodesImpl;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.AdvisoryImpl;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.TagsListItemImpl;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* loaded from: classes3.dex */
public final class aSH implements aSI {
    public static final aSH d = new aSH();

    private aSH() {
    }

    @Override // o.aSI
    public List<Advisory> d(String str) {
        if (str != null) {
            try {
                return AdvisoryImpl.asList(new JsonParser().parse(str).getAsJsonArray());
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // o.aSI
    public String c(List<Advisory> list) {
        if (list == null) {
            return null;
        }
        return ((Gson) C1332Xp.b(Gson.class)).toJson(list);
    }

    @Override // o.aSI
    public String a(InteractiveSummary interactiveSummary) {
        if (interactiveSummary == null) {
            return null;
        }
        return ((Gson) C1332Xp.b(Gson.class)).toJson(interactiveSummary);
    }

    @Override // o.aSI
    public String b(VideoInfo.TimeCodes timeCodes) {
        if ((timeCodes != null ? timeCodes.getTimeCodesData() : null) == null) {
            return null;
        }
        return ((Gson) C1332Xp.b(Gson.class)).toJson(timeCodes != null ? timeCodes.getTimeCodesData() : null);
    }

    @Override // o.aSI
    public VideoInfo.TimeCodes e(String str) {
        if (str != null) {
            TimeCodesImpl timeCodesImpl = new TimeCodesImpl();
            timeCodesImpl.timeCodesData = (TimeCodesData) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) TimeCodesData.class);
            return timeCodesImpl;
        }
        return null;
    }

    @Override // o.aSI
    public InteractiveSummary c(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return (InteractiveSummary) ((Gson) C1332Xp.b(Gson.class)).fromJson(str, (Class<Object>) InteractiveSummary.class);
    }

    @Override // o.aSI
    public String a(List<TagSummary> list) {
        return TagsListItemImpl.getTagsAsString(list);
    }
}
