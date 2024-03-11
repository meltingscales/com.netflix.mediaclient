package com.netflix.model.leafs;

import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class UpNextFeedSectionImpl implements UpNextFeedSection {
    private List<UpNextFeedListItem> entityItems;
    private ListOfMoviesSummary sectionSummary;

    @Override // com.netflix.model.leafs.UpNextFeedSection
    public List<UpNextFeedListItem> getItems() {
        return this.entityItems;
    }

    @Override // com.netflix.model.leafs.UpNextFeedSection
    public ListOfMoviesSummary getSummary() {
        return this.sectionSummary;
    }

    public UpNextFeedSectionImpl(ListOfMoviesSummary listOfMoviesSummary, List<UpNextFeedListItem> list) {
        C8632dsu.c((Object) listOfMoviesSummary, "");
        C8632dsu.c((Object) list, "");
        this.sectionSummary = listOfMoviesSummary;
        this.entityItems = list;
    }

    public /* synthetic */ UpNextFeedSectionImpl(ListOfMoviesSummary listOfMoviesSummary, List list, int i, C8627dsp c8627dsp) {
        this(listOfMoviesSummary, (i & 2) != 0 ? new ArrayList() : list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof UpNextFeedSectionImpl) {
            UpNextFeedSectionImpl upNextFeedSectionImpl = (UpNextFeedSectionImpl) obj;
            if (C8632dsu.c(upNextFeedSectionImpl.sectionSummary, this.sectionSummary)) {
                return C8632dsu.c(this.entityItems, upNextFeedSectionImpl.entityItems);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.sectionSummary.hashCode();
    }

    public final void mergeEntities(List<? extends UpNextFeedListItem> list) {
        Object f;
        C8632dsu.c((Object) list, "");
        int i = 0;
        for (Object obj : this.entityItems) {
            if (i < 0) {
                C8569dql.h();
            }
            UpNextFeedListItem upNextFeedListItem = (UpNextFeedListItem) obj;
            f = C8576dqs.f((List<? extends Object>) list, i);
            UpNextFeedListItem upNextFeedListItem2 = (UpNextFeedListItem) f;
            if (upNextFeedListItem2 != null) {
                this.entityItems.set(i, upNextFeedListItem2);
            }
            i++;
        }
    }
}
