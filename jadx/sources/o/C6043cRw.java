package o;

import android.text.TextUtils;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.CLContext;
import com.netflix.cl.model.context.SearchPreQueryResults;
import com.netflix.cl.model.context.SearchPreQueryResults_19052;
import com.netflix.cl.model.context.SearchSuggestionResults;
import com.netflix.cl.model.context.SearchSuggestionTitleResults;
import com.netflix.cl.model.context.SearchTitleResults;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.model.leafs.CreatorHomeBanner;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cRw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6043cRw {
    public static void c(String str, boolean z) {
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new Focus(AppView.search, null));
        logger.endSession(logger.startSession(new ChangeValueCommand(str)));
        logger.endSession(startSession);
        logger.removeExclusiveContext("VoiceInput");
    }

    /* renamed from: o.cRw$e */
    /* loaded from: classes4.dex */
    static class e implements TrackingInfo {
        private final String a;
        private final String b;
        private final String c;
        private final int d;
        private final String e;
        private final String h;

        e(String str, String str2, String str3, String str4, int i, String str5) {
            this.e = str;
            this.c = str2;
            this.a = str3;
            this.b = str4;
            this.d = i;
            this.h = str5;
        }

        @Override // com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refId", this.a);
                if (!TextUtils.isEmpty(this.e)) {
                    jSONObject.put("query", this.e);
                }
                if (!TextUtils.isEmpty(this.c)) {
                    jSONObject.put("entityId", this.c);
                }
                if (!TextUtils.isEmpty(this.b)) {
                    jSONObject.put("parentRefId", this.b);
                }
                int i = this.d;
                if (i >= 0) {
                    jSONObject.put("row", i);
                }
                if (!TextUtils.isEmpty(this.h)) {
                    jSONObject.put("unifiedEntityId", this.h);
                }
            } catch (JSONException e) {
                C1044Mm.e("SearchLogUtils", "SearchContextTrackingInfo", e);
            }
            return jSONObject;
        }
    }

    /* renamed from: o.cRw$d */
    /* loaded from: classes4.dex */
    static class d implements TrackingInfo {
        private final String a;
        private final String d;

        d(String str, String str2) {
            this.d = str;
            this.a = str2;
        }

        @Override // com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refId", this.d);
                jSONObject.put("listType", this.a);
            } catch (JSONException e) {
                C1044Mm.e("SearchLogUtils", "SearchPreQueryContextTrackingInfo", e);
            }
            return jSONObject;
        }
    }

    /* renamed from: o.cRw$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[AppView.values().length];
            d = iArr;
            try {
                iArr[AppView.searchSuggestionResults.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[AppView.searchSuggestionTitleResults.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[AppView.searchTitleResults.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static long e(AppView appView, String str, String str2, String str3, String str4, int i, String str5) {
        CLContext searchSuggestionResults;
        int i2 = AnonymousClass4.d[appView.ordinal()];
        if (i2 == 1) {
            searchSuggestionResults = new SearchSuggestionResults(new e(str2, str, str3, str4, i, str5));
        } else if (i2 == 2) {
            searchSuggestionResults = new SearchSuggestionTitleResults(new e(str2, str, str3, str4, i, str5));
        } else {
            searchSuggestionResults = new SearchTitleResults(new e(str2, str, str3, str4, i, str5));
        }
        return Logger.INSTANCE.addContext(searchSuggestionResults);
    }

    /* renamed from: o.cRw$a */
    /* loaded from: classes4.dex */
    static class a implements TrackingInfo {
        private String a = null;
        private final String d;

        a(String str) {
            this.d = str;
        }

        @Override // com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("referenceId", this.d);
                if (!TextUtils.isEmpty(this.a)) {
                    jSONObject.put("listType", this.a);
                }
            } catch (JSONException e) {
                C1044Mm.e("SearchLogUtils", "SearchPresentationTrackingInfo", e);
            }
            return jSONObject;
        }
    }

    public static void a(String str, String str2) {
        Logger.INSTANCE.addContext(new SearchPreQueryResults(new d(str, str2)));
    }

    public static long c(String str, String str2) {
        return Logger.INSTANCE.addContext(new SearchPreQueryResults_19052(new d(str, str2)));
    }

    public static void a() {
        Logger.INSTANCE.removeExclusiveContext(SearchPreQueryResults.class);
    }

    @Deprecated
    public static Long e(AppView appView, String str) {
        return Logger.INSTANCE.startSession(new Presentation(appView, new a(str)));
    }

    public static Long a(AppView appView, TrackingInfoHolder trackingInfoHolder) {
        return Logger.INSTANCE.startSession(new Presentation(appView, trackingInfoHolder.j()));
    }

    public static void c(AppView appView, TrackingInfoHolder trackingInfoHolder) {
        AppView appView2 = AppView.boxArt;
        if (appView == AppView.searchSuggestionResults) {
            appView2 = AppView.suggestionItem;
        }
        AppView appView3 = AppView.categoryLabel;
        if (appView == appView3) {
            appView2 = appView3;
        }
        CLv2Utils.b(false, appView2, trackingInfoHolder.c((JSONObject) null), null);
    }

    public static void b(final CreatorHomeBanner creatorHomeBanner) {
        AppView appView = AppView.appBar;
        Objects.requireNonNull(creatorHomeBanner);
        CLv2Utils.b(false, appView, new TrackingInfo() { // from class: o.cRy
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                return CreatorHomeBanner.this.getTrackingInfo();
            }
        }, null);
    }
}
