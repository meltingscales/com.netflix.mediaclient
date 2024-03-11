package com.netflix.model.leafs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5185btw;
import o.InterfaceC5272bvd;
import o.InterfaceC5278bvj;

/* loaded from: classes5.dex */
public final class NAPASearchPageResultImpl implements InterfaceC5272bvd {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_RESULTS = 20;
    private SearchSectionSummary searchSectionSummary;
    private int sectionIndex;
    private List<InterfaceC5278bvj> videoItems = new ArrayList(20);
    private List<InterfaceC5185btw> games = new ArrayList(20);
    private List<SearchPageEntity> videoEntities = new ArrayList(20);

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5185btw> getGames() {
        return this.games;
    }

    @Override // o.InterfaceC5272bvd
    public List<InterfaceC5278bvj> getResultsVideos() {
        return this.videoItems;
    }

    @Override // o.InterfaceC5272bvd
    public List<SearchPageEntity> getSearchPageEntities() {
        return this.videoEntities;
    }

    @Override // o.InterfaceC5272bvd
    public SearchSectionSummary getSearchSectionSummary() {
        return this.searchSectionSummary;
    }

    @Override // o.InterfaceC5272bvd
    public int getSectionIndex() {
        return this.sectionIndex;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes5.dex */
    public final class Builder {
        private final NAPASearchPageResultImpl results = new NAPASearchPageResultImpl();

        public final NAPASearchPageResultImpl getResults() {
            return this.results;
        }

        public Builder() {
        }

        public final void addVideos(Collection<? extends InterfaceC5278bvj> collection) {
            C8632dsu.c((Object) collection, "");
            this.results.videoItems.addAll(collection);
        }

        public final void addGames(Collection<? extends InterfaceC5185btw> collection) {
            C8632dsu.c((Object) collection, "");
            this.results.games.addAll(collection);
        }

        public final void addVideoEntities(Collection<SearchPageEntityImpl> collection) {
            C8632dsu.c((Object) collection, "");
            for (SearchPageEntityImpl searchPageEntityImpl : collection) {
                if (searchPageEntityImpl.getVideoId() != null) {
                    this.results.videoEntities.add(searchPageEntityImpl);
                }
            }
        }

        public final void setSectionIndex(int i) {
            this.results.sectionIndex = i;
        }

        public final void setSearchSectionSummary(SearchSectionSummary searchSectionSummary) {
            C8632dsu.c((Object) searchSectionSummary, "");
            this.results.searchSectionSummary = searchSectionSummary;
        }
    }
}
