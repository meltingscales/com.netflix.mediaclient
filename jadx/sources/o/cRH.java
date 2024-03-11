package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.search.v2.SearchUIComponents;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cRH implements cRJ {
    private final Map<AppView, Long> b = new HashMap();
    private final List<Long> e = new ArrayList();
    private String a = "";
    private int c = -1;
    private int h = -1;
    private int d = -1;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SearchUIComponents.values().length];
            try {
                iArr[SearchUIComponents.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchUIComponents.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchUIComponents.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // o.cRJ
    public void a(C6089cTl c6089cTl) {
        C8632dsu.c((Object) c6089cTl, "");
        String a = c6089cTl.a();
        if (a != null && a.length() != 0 && !C8632dsu.c((Object) this.a, (Object) a)) {
            b();
            c(c6089cTl);
            b(c6089cTl);
            this.a = a;
            c();
        }
        d(c6089cTl);
    }

    private final void c(C6089cTl c6089cTl) {
        this.c = -1;
        this.h = -1;
        this.d = -1;
        int i = 0;
        for (Object obj : c6089cTl.h()) {
            if (i < 0) {
                C8569dql.h();
            }
            String listType = ((SearchSectionSummary) obj).getListType();
            if (listType != null) {
                int i2 = b.a[SearchUIComponents.a.c(listType).ordinal()];
                if (i2 == 1) {
                    this.h = i;
                } else if (i2 == 2) {
                    this.c = i;
                } else if (i2 == 3) {
                    this.d = i;
                }
            }
            i++;
        }
    }

    private final void d(C6089cTl c6089cTl) {
        Map<AppView, Long> map = this.b;
        AppView appView = AppView.searchTitleResults;
        if (map.get(appView) == null && this.c > -1) {
            TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.SEARCH);
            if (c6089cTl.h().size() > this.c) {
                Map<AppView, Long> map2 = this.b;
                Long a = C6043cRw.a(appView, trackingInfoHolder.e(c6089cTl.h().get(this.c), this.c));
                C8632dsu.a(a, "");
                map2.put(appView, a);
            }
        }
        Map<AppView, Long> map3 = this.b;
        AppView appView2 = AppView.searchSuggestionResults;
        if (map3.get(appView2) == null && this.h > -1 && c6089cTl.h().size() > this.h) {
            TrackingInfoHolder trackingInfoHolder2 = new TrackingInfoHolder(PlayLocationType.SEARCH_SUGGESTION_RESULTS);
            Map<AppView, Long> map4 = this.b;
            Long a2 = C6043cRw.a(appView2, trackingInfoHolder2.e(c6089cTl.h().get(this.h), this.h));
            C8632dsu.a(a2, "");
            map4.put(appView2, a2);
        }
        if (this.d <= -1 || this.b.get(appView) != null) {
            return;
        }
        Map<AppView, Long> map5 = this.b;
        Long e = C6043cRw.e(appView, e(c6089cTl));
        C8632dsu.a(e, "");
        map5.put(appView, e);
    }

    public void b(C6089cTl c6089cTl) {
        C8632dsu.c((Object) c6089cTl, "");
        String a = c6089cTl.a();
        if (a != null) {
            for (SearchSectionSummary searchSectionSummary : c6089cTl.h()) {
                String listType = searchSectionSummary.getListType();
                if (listType != null) {
                    SearchUIComponents c = SearchUIComponents.a.c(listType);
                    if (c == SearchUIComponents.d) {
                        this.e.add(Long.valueOf(C6043cRw.e(AppView.searchSuggestionResults, null, a, searchSectionSummary.getReferenceId(), null, 0, null)));
                    } else if (c == SearchUIComponents.g) {
                        this.e.add(Long.valueOf(C6043cRw.e(AppView.searchTitleResults, null, a, searchSectionSummary.getReferenceId(), null, 0, null)));
                    }
                }
            }
            if (this.d > -1) {
                this.e.add(Long.valueOf(C6043cRw.e(AppView.searchTitleResults, null, a, e(c6089cTl), null, -1, null)));
            }
        }
    }

    @Override // o.cRJ
    public void b() {
        if (!this.e.isEmpty()) {
            for (Number number : this.e) {
                Logger.INSTANCE.removeContext(Long.valueOf(number.longValue()));
            }
            this.e.clear();
        }
    }

    private final String e(C6089cTl c6089cTl) {
        String requestId = c6089cTl.h().get(0).getRequestId();
        return requestId + "|0";
    }

    @Override // o.cRJ
    public void c() {
        for (Map.Entry<AppView, Long> entry : this.b.entrySet()) {
            Logger.INSTANCE.endSession(entry.getValue());
        }
        this.b.clear();
    }
}
