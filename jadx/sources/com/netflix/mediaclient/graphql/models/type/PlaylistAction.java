package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlaylistAction {
    public static final d c;
    private static final /* synthetic */ PlaylistAction[] f;
    private static final C9033hu h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String g;
    public static final PlaylistAction a = new PlaylistAction("ADD_TO_PLAYLIST", 0, "ADD_TO_PLAYLIST");
    public static final PlaylistAction b = new PlaylistAction("DELETE_FROM_PLAYLIST", 1, "DELETE_FROM_PLAYLIST");
    public static final PlaylistAction d = new PlaylistAction("ADD_REMIND_ME", 2, "ADD_REMIND_ME");
    public static final PlaylistAction e = new PlaylistAction("REMOVE_REMIND_ME", 3, "REMOVE_REMIND_ME");
    public static final PlaylistAction i = new PlaylistAction("UNKNOWN__", 4, "UNKNOWN__");

    public static InterfaceC8598drn<PlaylistAction> a() {
        return j;
    }

    private static final /* synthetic */ PlaylistAction[] e() {
        return new PlaylistAction[]{a, b, d, e, i};
    }

    public static PlaylistAction valueOf(String str) {
        return (PlaylistAction) Enum.valueOf(PlaylistAction.class, str);
    }

    public static PlaylistAction[] values() {
        return (PlaylistAction[]) f.clone();
    }

    public final String d() {
        return this.g;
    }

    private PlaylistAction(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        List j2;
        PlaylistAction[] e2 = e();
        f = e2;
        j = C8600drp.e(e2);
        c = new d(null);
        j2 = C8569dql.j("ADD_TO_PLAYLIST", "DELETE_FROM_PLAYLIST", "ADD_REMIND_ME", "REMOVE_REMIND_ME");
        h = new C9033hu("PlaylistAction", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu c() {
            return PlaylistAction.h;
        }

        public final PlaylistAction a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PlaylistAction.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PlaylistAction) obj).d(), (Object) str)) {
                    break;
                }
            }
            PlaylistAction playlistAction = (PlaylistAction) obj;
            return playlistAction == null ? PlaylistAction.i : playlistAction;
        }
    }
}
