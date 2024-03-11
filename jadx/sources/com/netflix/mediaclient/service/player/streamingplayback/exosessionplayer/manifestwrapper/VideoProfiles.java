package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.manifestwrapper;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class VideoProfiles {
    private static final /* synthetic */ InterfaceC8598drn aD;
    private static final /* synthetic */ VideoProfiles[] aG;
    private final String aC;
    public static final VideoProfiles F = new VideoProfiles("H264_MPL30", 0, "playready-h264mpl30-dash");
    public static final VideoProfiles G = new VideoProfiles("H264_MPL31", 1, "playready-h264mpl31-dash");
    public static final VideoProfiles M = new VideoProfiles("H264_MPL40", 2, "playready-h264mpl40-dash");
    public static final VideoProfiles H = new VideoProfiles("H264_MPL30_QC", 3, "h264mpl30-dash-playready-prk-qc");

    /* renamed from: J  reason: collision with root package name */
    public static final VideoProfiles f13216J = new VideoProfiles("H264_MPL31_QC", 4, "h264mpl31-dash-playready-prk-qc");
    public static final VideoProfiles N = new VideoProfiles("H264_MPL40_QC", 5, "h264mpl40-dash-playready-prk-qc");
    public static final VideoProfiles w = new VideoProfiles("H264_HPL22", 6, "playready-h264hpl22-dash");
    public static final VideoProfiles B = new VideoProfiles("H264_HPL30", 7, "playready-h264hpl30-dash");
    public static final VideoProfiles A = new VideoProfiles("H264_HPL31", 8, "playready-h264hpl31-dash");
    public static final VideoProfiles I = new VideoProfiles("H264_HPL40", 9, "playready-h264hpl40-dash");
    public static final VideoProfiles z = new VideoProfiles("H264_HPL22_LIVE", 10, "h264hpl22-dash-playready-live");
    public static final VideoProfiles D = new VideoProfiles("H264_HPL30_LIVE", 11, "h264hpl30-dash-playready-live");
    public static final VideoProfiles C = new VideoProfiles("H264_HPL31_LIVE", 12, "h264hpl31-dash-playready-live");
    public static final VideoProfiles E = new VideoProfiles("H264_HPL40_LIVE", 13, "h264hpl40-dash-playready-live");
    public static final VideoProfiles ax = new VideoProfiles("VP9_MAIN_MPL21", 14, "vp9-profile0-L21-dash-cenc");
    public static final VideoProfiles az = new VideoProfiles("VP9_MAIN_MPL30", 15, "vp9-profile0-L30-dash-cenc");
    public static final VideoProfiles aF = new VideoProfiles("VP9_MAIN_MPL31", 16, "vp9-profile0-L31-dash-cenc");
    public static final VideoProfiles aE = new VideoProfiles("VP9_MAIN_MPL40", 17, "vp9-profile0-L40-dash-cenc");
    public static final VideoProfiles ah = new VideoProfiles("HEVC_MAIN10_MPL30", 18, "hevc-main10-L30-dash-cenc");
    public static final VideoProfiles ak = new VideoProfiles("HEVC_MAIN10_MPL31", 19, "hevc-main10-L31-dash-cenc");
    public static final VideoProfiles al = new VideoProfiles("HEVC_MAIN10_MPL40", 20, "hevc-main10-L40-dash-cenc");
    public static final VideoProfiles an = new VideoProfiles("HEVC_MAIN10_MPL41", 21, "hevc-main10-L41-dash-cenc");
    public static final VideoProfiles at = new VideoProfiles("HEVC_MAIN10_MPL50", 22, "hevc-main10-L50-dash-cenc");
    public static final VideoProfiles ay = new VideoProfiles("HEVC_MAIN10_MPL51", 23, "hevc-main10-L51-dash-cenc");
    public static final VideoProfiles af = new VideoProfiles("HEVC_MAIN10_MPL30_PRK", 24, "hevc-main10-L30-dash-cenc-prk");
    public static final VideoProfiles aj = new VideoProfiles("HEVC_MAIN10_MPL31_PRK", 25, "hevc-main10-L31-dash-cenc-prk");
    public static final VideoProfiles aq = new VideoProfiles("HEVC_MAIN10_MPL40_PRK", 26, "hevc-main10-L40-dash-cenc-prk");
    public static final VideoProfiles au = new VideoProfiles("HEVC_MAIN10_MPL41_PRK", 27, "hevc-main10-L41-dash-cenc-prk");
    public static final VideoProfiles ad = new VideoProfiles("HEVC_MAIN10_MPL30_PRK_DO", 28, "hevc-main10-L30-dash-cenc-prk-do");
    public static final VideoProfiles am = new VideoProfiles("HEVC_MAIN10_MPL31_PRK_DO", 29, "hevc-main10-L31-dash-cenc-prk-do");
    public static final VideoProfiles ar = new VideoProfiles("HEVC_MAIN10_MPL40_PRK_DO", 30, "hevc-main10-L40-dash-cenc-prk-do");
    public static final VideoProfiles av = new VideoProfiles("HEVC_MAIN10_MPL41_PRK_DO", 31, "hevc-main10-L41-dash-cenc-prk-do");
    public static final VideoProfiles aw = new VideoProfiles("HEVC_MAIN10_MPL50_PRK_DO", 32, "hevc-main10-L50-dash-cenc-prk-do");
    public static final VideoProfiles aA = new VideoProfiles("HEVC_MAIN10_MPL51_PRK_DO", 33, "hevc-main10-L51-dash-cenc-prk-do");
    public static final VideoProfiles ae = new VideoProfiles("HEVC_MAIN10_MPL30_LIVE", 34, "hevc-main10-L30-dash-cenc-live");
    public static final VideoProfiles ai = new VideoProfiles("HEVC_MAIN10_MPL31_LIVE", 35, "hevc-main10-L31-dash-cenc-live");
    public static final VideoProfiles ap = new VideoProfiles("HEVC_MAIN10_MPL40_LIVE", 36, "hevc-main10-L40-dash-cenc-live");
    public static final VideoProfiles ao = new VideoProfiles("HEVC_MAIN10_MPL41_LIVE", 37, "hevc-main10-L41-dash-cenc-live");
    public static final VideoProfiles as = new VideoProfiles("HEVC_MAIN10_MPL50_LIVE", 38, "hevc-main10-L50-dash-cenc-live");
    public static final VideoProfiles aB = new VideoProfiles("HEVC_MAIN10_MPL51_LIVE", 39, "hevc-main10-L51-dash-cenc-live");
    public static final VideoProfiles j = new VideoProfiles("DV_MAIN10_MPL30_PRK", 40, "hevc-dv5-main10-L30-dash-cenc-prk");
    public static final VideoProfiles k = new VideoProfiles("DV_MAIN10_MPL31_PRK", 41, "hevc-dv5-main10-L31-dash-cenc-prk");
    public static final VideoProfiles n = new VideoProfiles("DV_MAIN10_MPL40_PRK", 42, "hevc-dv5-main10-L40-dash-cenc-prk");
    public static final VideoProfiles t = new VideoProfiles("DV_MAIN10_MPL41_PRK", 43, "hevc-dv5-main10-L41-dash-cenc-prk");
    public static final VideoProfiles s = new VideoProfiles("DV_MAIN10_MPL50_PRK", 44, "hevc-dv5-main10-L50-dash-cenc-prk");
    public static final VideoProfiles u = new VideoProfiles("DV_MAIN10_MPL51_PRK", 45, "hevc-dv5-main10-L51-dash-cenc-prk");
    public static final VideoProfiles l = new VideoProfiles("DV_MAIN10_MPL40_PRK_QC", 46, "hevc-dv5-main10-L40-dash-cenc-prk-qc");
    public static final VideoProfiles p = new VideoProfiles("DV_MAIN10_MPL41_PRK_QC", 47, "hevc-dv5-main10-L41-dash-cenc-prk-qc");
    public static final VideoProfiles x = new VideoProfiles("DV_MAIN10_MPL50_PRK_QC", 48, "hevc-dv5-main10-L50-dash-cenc-prk-qc");
    public static final VideoProfiles y = new VideoProfiles("DV_MAIN10_MPL51_PRK_QC", 49, "hevc-dv5-main10-L51-dash-cenc-prk-qc");
    public static final VideoProfiles f = new VideoProfiles("DV_MAIN10_MPL30_PRK_DO", 50, "hevc-dv5-main10-L30-dash-cenc-prk-do");
    public static final VideoProfiles m = new VideoProfiles("DV_MAIN10_MPL31_PRK_DO", 51, "hevc-dv5-main10-L31-dash-cenc-prk-do");

    /* renamed from: o  reason: collision with root package name */
    public static final VideoProfiles f13217o = new VideoProfiles("DV_MAIN10_MPL40_PRK_DO", 52, "hevc-dv5-main10-L40-dash-cenc-prk-do");
    public static final VideoProfiles q = new VideoProfiles("DV_MAIN10_MPL41_PRK_DO", 53, "hevc-dv5-main10-L41-dash-cenc-prk-do");
    public static final VideoProfiles r = new VideoProfiles("DV_MAIN10_MPL50_PRK_DO", 54, "hevc-dv5-main10-L50-dash-cenc-prk-do");
    public static final VideoProfiles v = new VideoProfiles("DV_MAIN10_MPL51_PRK_DO", 55, "hevc-dv5-main10-L51-dash-cenc-prk-do");
    public static final VideoProfiles K = new VideoProfiles("HDR_MAIN10_MPL30_PRK", 56, "hevc-hdr-main10-L30-dash-cenc-prk");
    public static final VideoProfiles O = new VideoProfiles("HDR_MAIN10_MPL31_PRK", 57, "hevc-hdr-main10-L31-dash-cenc-prk");
    public static final VideoProfiles T = new VideoProfiles("HDR_MAIN10_MPL40_PRK", 58, "hevc-hdr-main10-L40-dash-cenc-prk");
    public static final VideoProfiles X = new VideoProfiles("HDR_MAIN10_MPL41_PRK", 59, "hevc-hdr-main10-L41-dash-cenc-prk");
    public static final VideoProfiles Y = new VideoProfiles("HDR_MAIN10_MPL50_PRK", 60, "hevc-hdr-main10-L50-dash-cenc-prk");
    public static final VideoProfiles ab = new VideoProfiles("HDR_MAIN10_MPL51_PRK", 61, "hevc-hdr-main10-L51-dash-cenc-prk");
    public static final VideoProfiles P = new VideoProfiles("HDR_MAIN10_MPL30_PRK_DO", 62, "hevc-hdr-main10-L30-dash-cenc-prk-do");
    public static final VideoProfiles Q = new VideoProfiles("HDR_MAIN10_MPL31_PRK_DO", 63, "hevc-hdr-main10-L31-dash-cenc-prk-do");
    public static final VideoProfiles V = new VideoProfiles("HDR_MAIN10_MPL40_PRK_DO", 64, "hevc-hdr-main10-L40-dash-cenc-prk-do");
    public static final VideoProfiles W = new VideoProfiles("HDR_MAIN10_MPL41_PRK_DO", 65, "hevc-hdr-main10-L41-dash-cenc-prk-do");
    public static final VideoProfiles aa = new VideoProfiles("HDR_MAIN10_MPL50_PRK_DO", 66, "hevc-hdr-main10-L50-dash-cenc-prk-do");
    public static final VideoProfiles ag = new VideoProfiles("HDR_MAIN10_MPL51_PRK_DO", 67, "hevc-hdr-main10-L51-dash-cenc-prk-do");
    public static final VideoProfiles L = new VideoProfiles("HDR_MAIN10_MPL30_LIVE", 68, "hevc-hdr-main10-L30-dash-cenc-live");
    public static final VideoProfiles R = new VideoProfiles("HDR_MAIN10_MPL31_LIVE", 69, "hevc-hdr-main10-L31-dash-cenc-live");
    public static final VideoProfiles S = new VideoProfiles("HDR_MAIN10_MPL40_LIVE", 70, "hevc-hdr-main10-L40-dash-cenc-live");
    public static final VideoProfiles U = new VideoProfiles("HDR_MAIN10_MPL41_LIVE", 71, "hevc-hdr-main10-L41-dash-cenc-live");
    public static final VideoProfiles ac = new VideoProfiles("HDR_MAIN10_MPL50_LIVE", 72, "hevc-hdr-main10-L50-dash-cenc-live");
    public static final VideoProfiles Z = new VideoProfiles("HDR_MAIN10_MPL51_LIVE", 73, "hevc-hdr-main10-L51-dash-cenc-live");
    public static final VideoProfiles c = new VideoProfiles("AV1_MAIN_MPL20_PRK", 74, "av1-main-L20-dash-cbcs-prk");
    public static final VideoProfiles a = new VideoProfiles("AV1_MAIN_MPL21_PRK", 75, "av1-main-L21-dash-cbcs-prk");
    public static final VideoProfiles e = new VideoProfiles("AV1_MAIN_MPL30_PRK", 76, "av1-main-L30-dash-cbcs-prk");
    public static final VideoProfiles b = new VideoProfiles("AV1_MAIN_MPL31_PRK", 77, "av1-main-L31-dash-cbcs-prk");
    public static final VideoProfiles d = new VideoProfiles("AV1_MAIN_MPL40_PRK", 78, "av1-main-L40-dash-cbcs-prk");
    public static final VideoProfiles i = new VideoProfiles("AV1_MAIN_MPL41_PRK", 79, "av1-main-L41-dash-cbcs-prk");
    public static final VideoProfiles g = new VideoProfiles("AV1_MAIN_MPL50_PRK", 80, "av1-main-L50-dash-cbcs-prk");
    public static final VideoProfiles h = new VideoProfiles("AV1_MAIN_MPL51_PRK", 81, "av1-main-L51-dash-cbcs-prk");

    private static final /* synthetic */ VideoProfiles[] e() {
        return new VideoProfiles[]{F, G, M, H, f13216J, N, w, B, A, I, z, D, C, E, ax, az, aF, aE, ah, ak, al, an, at, ay, af, aj, aq, au, ad, am, ar, av, aw, aA, ae, ai, ap, ao, as, aB, j, k, n, t, s, u, l, p, x, y, f, m, f13217o, q, r, v, K, O, T, X, Y, ab, P, Q, V, W, aa, ag, L, R, S, U, ac, Z, c, a, e, b, d, i, g, h};
    }

    public static VideoProfiles valueOf(String str) {
        return (VideoProfiles) Enum.valueOf(VideoProfiles.class, str);
    }

    public static VideoProfiles[] values() {
        return (VideoProfiles[]) aG.clone();
    }

    public final String d() {
        return this.aC;
    }

    private VideoProfiles(String str, int i2, String str2) {
        this.aC = str2;
    }

    static {
        VideoProfiles[] e2 = e();
        aG = e2;
        aD = C8600drp.e(e2);
    }
}
