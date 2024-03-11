package com.netflix.model.leafs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC5275bvg;
import o.InterfaceC5277bvi;
import o.InterfaceC5278bvj;
import o.InterfaceC5279bvk;

/* loaded from: classes5.dex */
public class SearchResults implements InterfaceC5275bvg {
    private List<SearchCollectionEntity> queryCompletions;
    private InterfaceC5277bvi queryCompletionsListSummary;
    private int sectionIndex;
    private final List<Object> sectionsList;
    private List<InterfaceC5279bvk> suggestions;
    private InterfaceC5277bvi suggestionsListSummary;
    private List<SearchCollectionEntity> videoEntities;
    private List<InterfaceC5278bvj> videoItems;
    private InterfaceC5277bvi videoListSummary;

    public InterfaceC5277bvi getQueryCompletionsListTrackable() {
        return this.queryCompletionsListSummary;
    }

    public List<SearchCollectionEntity> getResultsQueryCompletions() {
        return this.queryCompletions;
    }

    public List<SearchCollectionEntity> getResultsVideoEntities() {
        return this.videoEntities;
    }

    @Override // o.InterfaceC5275bvg
    public List<InterfaceC5278bvj> getResultsVideos() {
        return this.videoItems;
    }

    public int getSectionIndex() {
        return this.sectionIndex;
    }

    public InterfaceC5277bvi getSuggestionsListTrackable() {
        return this.suggestionsListSummary;
    }

    @Override // o.InterfaceC5275bvg
    public InterfaceC5277bvi getVideosListTrackable() {
        return this.videoListSummary;
    }

    private SearchResults() {
        this.sectionsList = new ArrayList(3);
    }

    public int getNumResults() {
        Iterator<Object> it = this.sectionsList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) it.next()).size();
        }
        return i;
    }

    @Override // o.InterfaceC5275bvg
    public int getNumResultsVideos() {
        List<InterfaceC5278bvj> list = this.videoItems;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getNumResultsVideoEntities() {
        List<SearchCollectionEntity> list = this.videoEntities;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getNumResultsSuggestions() {
        List<InterfaceC5279bvk> list = this.suggestions;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getNumQueryCompletions() {
        List<SearchCollectionEntity> list = this.queryCompletions;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public InterfaceC5278bvj getResultsVideos(int i) {
        List<InterfaceC5278bvj> list = this.videoItems;
        if (list != null && i < list.size()) {
            InterfaceC5278bvj interfaceC5278bvj = this.videoItems.get(i);
            if (interfaceC5278bvj instanceof InterfaceC5278bvj) {
                return interfaceC5278bvj;
            }
        }
        return null;
    }

    public SearchCollectionEntity getResultsVideoEntities(int i) {
        List<SearchCollectionEntity> list = this.videoEntities;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.videoEntities.get(i);
    }

    public InterfaceC5279bvk getResultsSuggestions(int i) {
        List<InterfaceC5279bvk> list = this.suggestions;
        if (list != null && i < list.size()) {
            InterfaceC5279bvk interfaceC5279bvk = this.suggestions.get(i);
            if (interfaceC5279bvk instanceof InterfaceC5279bvk) {
                return interfaceC5279bvk;
            }
        }
        return null;
    }

    public int getNumSections() {
        return this.sectionsList.size();
    }

    public boolean hasResults() {
        return hasVideos() || hasSuggestions() || hasQueryCompletions();
    }

    private boolean hasVideos() {
        List<SearchCollectionEntity> list;
        List<InterfaceC5278bvj> list2 = this.videoItems;
        return (list2 != null && list2.size() > 0) || ((list = this.videoEntities) != null && list.size() > 0);
    }

    private boolean hasSuggestions() {
        List<InterfaceC5279bvk> list = this.suggestions;
        return list != null && list.size() > 0;
    }

    private boolean hasQueryCompletions() {
        List<SearchCollectionEntity> list = this.queryCompletions;
        return list != null && list.size() > 0;
    }

    /* loaded from: classes5.dex */
    public static class Builder {
        private static final int MAX_RESULTS = 20;
        private final SearchResults results = new SearchResults();

        public SearchResults getResults() {
            return this.results;
        }

        public void addVideos(Collection<InterfaceC5278bvj> collection) {
            if (this.results.videoItems == null) {
                this.results.videoItems = new ArrayList(20);
                this.results.sectionsList.add(this.results.videoItems);
            }
            this.results.videoItems.addAll(collection);
        }

        public void addVideoEntities(Collection<SearchCollectionEntity> collection) {
            if (this.results.videoEntities == null) {
                this.results.videoEntities = new ArrayList(20);
            }
            for (SearchCollectionEntity searchCollectionEntity : collection) {
                if (searchCollectionEntity.getVideoId() != null) {
                    this.results.videoEntities.add(searchCollectionEntity);
                }
            }
        }

        public void addSuggestions(Collection<InterfaceC5279bvk> collection) {
            if (this.results.suggestions == null) {
                this.results.suggestions = new ArrayList(20);
                this.results.sectionsList.add(this.results.suggestions);
            }
            this.results.suggestions.addAll(collection);
        }

        public void addQueryCompletions(Collection<SearchCollectionEntity> collection) {
            if (this.results.queryCompletions == null) {
                this.results.queryCompletions = new ArrayList(20);
                this.results.sectionsList.add(this.results.queryCompletions);
            }
            this.results.queryCompletions.addAll(collection);
        }

        public void setVideoListSummary(InterfaceC5277bvi interfaceC5277bvi) {
            this.results.videoListSummary = interfaceC5277bvi;
        }

        public void setSuggestionsListSummary(InterfaceC5277bvi interfaceC5277bvi) {
            this.results.suggestionsListSummary = interfaceC5277bvi;
        }

        public void setQueryCompletionListSummary(InterfaceC5277bvi interfaceC5277bvi) {
            this.results.queryCompletionsListSummary = interfaceC5277bvi;
        }

        public void setSectionIndex(int i) {
            this.results.sectionIndex = i;
        }
    }
}
