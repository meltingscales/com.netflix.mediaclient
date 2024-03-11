package com.netflix.mediaclient.servicemgr.interface_.player.playlist;

import java.util.Map;
import java.util.Objects;
import o.C5209buT;

/* loaded from: classes.dex */
public abstract class PlaylistMap<T extends C5209buT> {
    public final Map<String, T> a;
    public final String b;
    public final String e;

    /* loaded from: classes.dex */
    public enum TransitionHintType {
        delayedSeamless,
        hideLongTransition,
        unknownTransitionHint
    }

    /* loaded from: classes.dex */
    public interface e {
        void p();
    }

    public String b() {
        return this.e;
    }

    public abstract long e(String str);

    public String e() {
        return this.b;
    }

    public Map<String, T> h() {
        return this.a;
    }

    public PlaylistMap(Map<String, T> map, String str, String str2) {
        this.b = str;
        this.e = str2;
        this.a = map;
    }

    public T a(PlaylistTimestamp playlistTimestamp) {
        if (playlistTimestamp == null || !playlistTimestamp.c.equals(this.e)) {
            return null;
        }
        return this.a.get(playlistTimestamp.a);
    }

    public T a(String str) {
        return this.a.get(str);
    }

    public T a() {
        return this.a.get(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaylistMap playlistMap = (PlaylistMap) obj;
        return this.a.equals(playlistMap.a) && this.b.equals(playlistMap.b) && this.e.equals(playlistMap.e);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.e);
    }
}
