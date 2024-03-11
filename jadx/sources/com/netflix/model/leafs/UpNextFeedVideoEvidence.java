package com.netflix.model.leafs;

import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import java.util.List;
import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes5.dex */
public interface UpNextFeedVideoEvidence {
    ContextualText contextualSynopsis();

    List<Action> getActions();

    String getDescription();

    Integer getImageRequestVideoId();

    List<UpNextImageInfo> getImages();

    String getLaunchDate();

    Integer getPromotedVideoId();

    String getTitle();

    String getTitleTreatmentUrl();

    String getTopLevelSectionIndex();

    boolean isVideoTrailer();

    String videoMerchComputeId();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class Action {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action REMIND_ME = new Action("REMIND_ME", 0);
        public static final Action ADD_TO_MY_LIST = new Action("ADD_TO_MY_LIST", 1);
        public static final Action SHARE = new Action(Payload.Action.SHARE, 2);
        public static final Action PLAY = new Action(Payload.Action.PLAY, 3);
        public static final Action PLAY_MOVIE = new Action("PLAY_MOVIE", 4);
        public static final Action PLAY_EPISODE = new Action("PLAY_EPISODE", 5);
        public static final Action MORE_INFO = new Action("MORE_INFO", 6);
        public static final Action HOME_PAGE = new Action("HOME_PAGE", 7);
        public static final Action INSTALL_GAME = new Action("INSTALL_GAME", 8);
        public static final Action LAUNCH_GAME = new Action("LAUNCH_GAME", 9);
        public static final Action JOIN_NOW = new Action("JOIN_NOW", 10);
        public static final Action GONE = new Action("GONE", 11);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{REMIND_ME, ADD_TO_MY_LIST, SHARE, PLAY, PLAY_MOVIE, PLAY_EPISODE, MORE_INFO, HOME_PAGE, INSTALL_GAME, LAUNCH_GAME, JOIN_NOW, GONE};
        }

        public static InterfaceC8598drn<Action> getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        private Action(String str, int i) {
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }
}
