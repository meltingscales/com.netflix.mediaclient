package com.netflix.model.leafs;

import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C8632dsu;
import o.InterfaceC5272bvd;
import o.InterfaceC5280bvl;

/* loaded from: classes5.dex */
public final class NAPASearchPageResultsImpl implements InterfaceC5280bvl {
    private long requestId;
    private List<InterfaceC5272bvd> searchSections = new ArrayList();

    @Override // o.InterfaceC5280bvl
    public long getRequestId() {
        return this.requestId;
    }

    @Override // o.InterfaceC5280bvl
    public List<InterfaceC5272bvd> getSearchSections() {
        return this.searchSections;
    }

    @Override // o.InterfaceC5280bvl
    public String getGraphqlPageId() {
        throw new NotImplementedError("An operation is not implemented: This is only for Graphql");
    }

    /* loaded from: classes5.dex */
    public final class Builder {
        private final NAPASearchPageResultsImpl results = new NAPASearchPageResultsImpl();

        public final NAPASearchPageResultsImpl getResults() {
            return this.results;
        }

        public Builder() {
        }

        public final void addSearchSection(InterfaceC5272bvd interfaceC5272bvd) {
            C8632dsu.c((Object) interfaceC5272bvd, "");
            this.results.searchSections.add(interfaceC5272bvd);
        }

        public final void setRequestId(long j) {
            this.results.requestId = j;
        }
    }
}
