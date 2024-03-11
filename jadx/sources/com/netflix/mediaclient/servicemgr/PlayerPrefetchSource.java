package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.util.ConnectivityUtils;

/* loaded from: classes.dex */
public enum PlayerPrefetchSource {
    ContinueWatching(0, false, false, true, false, "Default"),
    DetailsPageFromSearch(200, true, false, true, false, "Default"),
    PostPlay(1000, false, false, false, false, "Default"),
    PlayByUser(1100, false, false, false, false, "Default"),
    InAppSessionPrefetcher(300, true, false, true, false, "Default");
    
    private boolean f;
    private final int g;
    private final boolean i;
    private final boolean j;
    private boolean l;
    private final String m;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13233o;

    public void a(boolean z) {
        this.f = z;
    }

    public int b() {
        return this.g;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.j;
    }

    public String e() {
        return this.m;
    }

    public boolean f() {
        return this.f13233o;
    }

    PlayerPrefetchSource(int i, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.g = i;
        this.f13233o = z;
        this.j = z2;
        this.l = z3;
        this.f = z3;
        this.i = z4;
        this.m = str;
    }

    public boolean b(ConnectivityUtils.NetType netType) {
        return netType == ConnectivityUtils.NetType.mobile && this.l;
    }

    public boolean e(ConnectivityUtils.NetType netType) {
        return netType == ConnectivityUtils.NetType.mobile && this.f;
    }

    public boolean a() {
        char c;
        String str = this.m;
        if (str == null) {
            return false;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1027210488) {
            if (str.equals("billboard-bigRow")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -407169092) {
            if (hashCode == -263966981 && str.equals("videoCarousel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("ComingSoon")) {
                c = 1;
            }
            c = 65535;
        }
        return c == 0 || c == 1 || c == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean h() {
        char c;
        String str = this.m;
        if (str == null) {
            return true;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1902200173:
                if (str.equals("comedy-feed-boxart")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1273784917:
                if (str.equals("previews")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1027210488:
                if (str.equals("billboard-bigRow")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -407169092:
                if (str.equals("ComingSoon")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -263966981:
                if (str.equals("videoCarousel")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 408335442:
                if (str.equals("comedy-feed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) ? false : true;
    }
}
