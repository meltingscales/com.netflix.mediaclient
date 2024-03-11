package com.netflix.mediaclient.ui.usermarks.api;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dqE;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class UserMarksFlexEventType {
    public static final a e;
    private static final /* synthetic */ InterfaceC8598drn p;
    private static final /* synthetic */ UserMarksFlexEventType[] t;
    private final String q;
    public static final UserMarksFlexEventType d = new UserMarksFlexEventType("CREATE_USER_MARKS_BUTTON_CLICKED", 0, "CreateUserMarkButtonClicked");
    public static final UserMarksFlexEventType c = new UserMarksFlexEventType("CREATE_USER_MARKS_UNDO_BUTTON_CLICKED", 1, "CreateUserMarkUndoButtonClicked");
    public static final UserMarksFlexEventType i = new UserMarksFlexEventType("PLAY_NEXT_USER_MARK_BUTTON_CLICKED", 2, "PlayNextUserMarkButtonClicked");
    public static final UserMarksFlexEventType h = new UserMarksFlexEventType("PLAY_PREVIOUS_USER_MARK_BUTTON_CLICKED", 3, "PlayPreviousUserMarkButtonClicked");
    public static final UserMarksFlexEventType f = new UserMarksFlexEventType("SHARE_USER_MARK_FROM_PLAYER_BUTTON_CLICKED", 4, "ShareUserMarkFromPlayerButtonClicked");
    public static final UserMarksFlexEventType g = new UserMarksFlexEventType("SELECT_USER_MARK", 5, "SelectUserMark");
    public static final UserMarksFlexEventType j = new UserMarksFlexEventType("OPEN_USER_MARK_FULLSCREEN", 6, "OpenUserMarkFullscreen");
    public static final UserMarksFlexEventType a = new UserMarksFlexEventType("DELETE_USER_MARK", 7, "DeleteUserMark");
    public static final UserMarksFlexEventType m = new UserMarksFlexEventType("SHARE_USER_MARK_FROM_USER_MARKS_HOME", 8, "ShareUserMarkFromUserMarksHome");
    public static final UserMarksFlexEventType l = new UserMarksFlexEventType("TOGGLE_USER_MARK_FULLSCREEN", 9, "ToggleUserMarkFullscreen");

    /* renamed from: o  reason: collision with root package name */
    public static final UserMarksFlexEventType f13327o = new UserMarksFlexEventType("USER_MARKS_DRAG_DROP", 10, "UserMarksDragDrop");
    public static final UserMarksFlexEventType k = new UserMarksFlexEventType("USER_MARKS_LOADED", 11, "UserMarksLoaded");
    public static final UserMarksFlexEventType n = new UserMarksFlexEventType("TOGGLE_EDIT_MODE", 12, "ToggleUserMarksEditMode");
    public static final UserMarksFlexEventType b = new UserMarksFlexEventType("DELETE_ALL_USER_MARKS", 13, "DeleteAllUserMarks");

    public static final void b(UserMarksFlexEventType userMarksFlexEventType, String str, int i2, Map<String, String> map) {
        e.a(userMarksFlexEventType, str, i2, map);
    }

    private static final /* synthetic */ UserMarksFlexEventType[] d() {
        return new UserMarksFlexEventType[]{d, c, i, h, f, g, j, a, m, l, f13327o, k, n, b};
    }

    public static UserMarksFlexEventType valueOf(String str) {
        return (UserMarksFlexEventType) Enum.valueOf(UserMarksFlexEventType.class, str);
    }

    public static UserMarksFlexEventType[] values() {
        return (UserMarksFlexEventType[]) t.clone();
    }

    public final String c() {
        return this.q;
    }

    private UserMarksFlexEventType(String str, int i2, String str2) {
        this.q = str2;
    }

    static {
        UserMarksFlexEventType[] d2 = d();
        t = d2;
        p = C8600drp.e(d2);
        e = new a(null);
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final void a(UserMarksFlexEventType userMarksFlexEventType, String str, int i, Map<String, String> map) {
            Map d;
            C8632dsu.c((Object) userMarksFlexEventType, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) map, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(SignupConstants.Field.VIDEO_ID, str);
            linkedHashMap.put("timestamp", String.valueOf(i));
            linkedHashMap.putAll(map);
            String c = userMarksFlexEventType.c();
            d = dqE.d();
            CLv2Utils.d(c, d, linkedHashMap, new String[]{"userMarks"});
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, UserMarksFlexEventType userMarksFlexEventType, Map map, Map map2, int i, Object obj) {
            if ((i & 2) != 0) {
                map = dqE.d();
            }
            if ((i & 4) != 0) {
                map2 = dqE.d();
            }
            aVar.e(userMarksFlexEventType, map, map2);
        }

        public final void e(UserMarksFlexEventType userMarksFlexEventType, Map<String, Integer> map, Map<String, String> map2) {
            C8632dsu.c((Object) userMarksFlexEventType, "");
            C8632dsu.c((Object) map, "");
            C8632dsu.c((Object) map2, "");
            CLv2Utils.d(userMarksFlexEventType.c(), map, map2, new String[]{"userMarks"});
        }
    }
}
