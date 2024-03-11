package com.netflix.mediaclient.servicemgr;

/* loaded from: classes4.dex */
public enum UiLocation {
    HOME_LOLOMO("browseHome"),
    GENRE_LOLOMO("browseGenre"),
    MDP("mdp"),
    MDP_SIMILARS("mdpSimilars"),
    SDP("sdp"),
    SDP_SIMILARS("sdpSimilars"),
    SEARCH("search"),
    PEOPLE("people"),
    ROLES_DISPLAY("rolesDisplay"),
    BROWSE("Browse"),
    DOWNLOADS("Downloads"),
    DETAILS_PAGE("DisplayPage"),
    UNKNOWN("");
    

    /* renamed from: o  reason: collision with root package name */
    private String f13234o;

    public String e() {
        return this.f13234o;
    }

    UiLocation(String str) {
        this.f13234o = str;
    }
}
