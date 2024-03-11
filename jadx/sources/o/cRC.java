package o;

import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cRC {
    public static final b c = new b(null);

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final List<SearchSectionSummary> c(List<? extends InterfaceC5272bvd> list) {
            String listType;
            String pageKind;
            String displayString;
            String listType2;
            C8632dsu.c((Object) list, "");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                SearchSectionSummary searchSectionSummary = ((InterfaceC5272bvd) obj).getSearchSectionSummary();
                if (searchSectionSummary != null) {
                    Long expiresTime = searchSectionSummary.getExpiresTime();
                    if (expiresTime == null) {
                        expiresTime = 0L;
                    }
                    C8632dsu.d(expiresTime);
                    if (expiresTime.longValue() < 0 && (((displayString = searchSectionSummary.getDisplayString()) == null || displayString.length() == 0) && ((listType2 = searchSectionSummary.getListType()) == null || listType2.length() == 0))) {
                        return null;
                    }
                    String displayString2 = searchSectionSummary.getDisplayString();
                    if (displayString2 != null && displayString2.length() != 0 && (listType = searchSectionSummary.getListType()) != null && listType.length() != 0 && (pageKind = searchSectionSummary.getPageKind()) != null && pageKind.length() != 0) {
                        arrayList.add(searchSectionSummary);
                    }
                }
                i++;
            }
            return arrayList;
        }

        public final void e(InterfaceC5272bvd interfaceC5272bvd, C6089cTl c6089cTl, String str) {
            List j;
            List<InterfaceC5185btw> A;
            List j2;
            List<InterfaceC5278bvj> A2;
            List j3;
            List<SearchPageEntity> A3;
            C8632dsu.c((Object) interfaceC5272bvd, "");
            C8632dsu.c((Object) c6089cTl, "");
            C8632dsu.c((Object) str, "");
            List<SearchPageEntity> searchPageEntities = interfaceC5272bvd.getSearchPageEntities();
            List<SearchPageEntity> n = searchPageEntities != null ? C8576dqs.n(searchPageEntities) : null;
            if (n != null && !n.isEmpty()) {
                for (SearchPageEntity searchPageEntity : n) {
                    String videoId = searchPageEntity.getVideoId();
                    if (videoId != null) {
                        c6089cTl.o().put(videoId, searchPageEntity);
                    }
                }
                List<SearchPageEntity> list = c6089cTl.g().get(str);
                if (list == null || list.isEmpty()) {
                    c6089cTl.g().put(str, n);
                } else {
                    j3 = C8569dql.j(list, n);
                    A3 = C8572dqo.A(j3);
                    c6089cTl.g().put(str, A3);
                }
            }
            List<InterfaceC5278bvj> resultsVideos = interfaceC5272bvd.getResultsVideos();
            List<InterfaceC5278bvj> n2 = resultsVideos != null ? C8576dqs.n(resultsVideos) : null;
            if (n2 != null && !n2.isEmpty()) {
                List<InterfaceC5278bvj> list2 = c6089cTl.i().get(str);
                if (list2 == null || list2.isEmpty()) {
                    c6089cTl.i().put(str, n2);
                } else {
                    j2 = C8569dql.j(list2, n2);
                    A2 = C8572dqo.A(j2);
                    c6089cTl.i().put(str, A2);
                }
            }
            List<InterfaceC5185btw> games = interfaceC5272bvd.getGames();
            List<InterfaceC5185btw> U = games != null ? C8576dqs.U(games) : null;
            if (U == null || U.isEmpty()) {
                return;
            }
            List<InterfaceC5185btw> list3 = c6089cTl.j().get(str);
            if (list3 == null || list3.isEmpty()) {
                c6089cTl.j().put(str, U);
                return;
            }
            j = C8569dql.j(list3, U);
            A = C8572dqo.A(j);
            c6089cTl.j().put(str, A);
        }

        public final void b(List<? extends InterfaceC5272bvd> list, List<? extends SearchSectionSummary> list2, C6089cTl c6089cTl) {
            String sectionId;
            List j;
            List<InterfaceC5185btw> A;
            String sectionId2;
            List j2;
            List<InterfaceC5278bvj> A2;
            List j3;
            List<SearchPageEntity> A3;
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            C8632dsu.c((Object) c6089cTl, "");
            for (SearchSectionSummary searchSectionSummary : list2) {
                if (!c6089cTl.g().containsKey(searchSectionSummary.getSectionId())) {
                    c6089cTl.h().add(searchSectionSummary);
                }
            }
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    C8569dql.h();
                }
                InterfaceC5272bvd interfaceC5272bvd = (InterfaceC5272bvd) obj;
                List<SearchPageEntity> searchPageEntities = interfaceC5272bvd.getSearchPageEntities();
                List<SearchPageEntity> n = searchPageEntities != null ? C8576dqs.n(searchPageEntities) : null;
                if (n != null && n.size() > 0 && i < list2.size()) {
                    for (SearchPageEntity searchPageEntity : n) {
                        String videoId = searchPageEntity.getVideoId();
                        if (videoId != null) {
                            c6089cTl.o().put(videoId, searchPageEntity);
                        }
                    }
                    String sectionId3 = list2.get(i).getSectionId();
                    if (sectionId3 != null) {
                        List<SearchPageEntity> list3 = c6089cTl.g().get(sectionId3);
                        if (list3 == null || list3.isEmpty()) {
                            Map<String, List<SearchPageEntity>> g = c6089cTl.g();
                            C8632dsu.d((Object) sectionId3);
                            g.put(sectionId3, n);
                        } else {
                            j3 = C8569dql.j(list3, n);
                            A3 = C8572dqo.A(j3);
                            Map<String, List<SearchPageEntity>> g2 = c6089cTl.g();
                            C8632dsu.d((Object) sectionId3);
                            g2.put(sectionId3, A3);
                        }
                    }
                }
                List<InterfaceC5278bvj> resultsVideos = interfaceC5272bvd.getResultsVideos();
                List<InterfaceC5278bvj> n2 = resultsVideos != null ? C8576dqs.n(resultsVideos) : null;
                if (n2 != null && n2.size() > 0 && i < list2.size() && (sectionId2 = list2.get(i).getSectionId()) != null) {
                    List<InterfaceC5278bvj> list4 = c6089cTl.i().get(sectionId2);
                    if (list4 == null || list4.isEmpty()) {
                        c6089cTl.i().put(sectionId2, n2);
                    } else {
                        j2 = C8569dql.j(list4, n2);
                        A2 = C8572dqo.A(j2);
                        c6089cTl.i().put(sectionId2, A2);
                    }
                }
                List<InterfaceC5185btw> games = interfaceC5272bvd.getGames();
                List<InterfaceC5185btw> U = games != null ? C8576dqs.U(games) : null;
                if (U != null && (!U.isEmpty()) && i < list2.size() && (sectionId = list2.get(i).getSectionId()) != null) {
                    List<InterfaceC5185btw> list5 = c6089cTl.j().get(sectionId);
                    if (list5 == null || list5.isEmpty()) {
                        c6089cTl.j().put(sectionId, U);
                    } else {
                        j = C8569dql.j(list5, U);
                        A = C8572dqo.A(j);
                        c6089cTl.j().put(sectionId, A);
                    }
                }
                i++;
            }
        }
    }
}
