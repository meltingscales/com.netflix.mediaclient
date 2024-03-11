package com.netflix.mediaclient.servicemgr;

import o.C5124bso;
import o.C5167bte;

/* loaded from: classes4.dex */
public interface PlaybackExperience {
    public static final PlaybackExperience a = new C5124bso("Default");

    /* loaded from: classes4.dex */
    public enum SubtitleExperience {
        DEFAULT,
        FORCED_VISIBLE_ON_MUTE,
        DISABLED
    }

    boolean a();

    C5167bte b();

    SubtitleExperience c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    default boolean i() {
        return false;
    }

    boolean j();

    default boolean l() {
        return true;
    }

    default String m() {
        return "";
    }

    default boolean n() {
        return false;
    }

    default boolean o() {
        return false;
    }
}
