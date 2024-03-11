package com.netflix.mediaclient.commanderinfra.impl.logging;

import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Map;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dqE;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CommanderFlexEventType {
    private static final /* synthetic */ CommanderFlexEventType[] L;
    private static final /* synthetic */ InterfaceC8598drn N;
    public static final b k;
    private final String K;
    public static final CommanderFlexEventType e = new CommanderFlexEventType("CDX_ICON_TOOLTIP_PRESENTED", 0, "CdxIconTooltipPresented");
    public static final CommanderFlexEventType v = new CommanderFlexEventType("IMPLICIT_PAIRING_TOOLTIP_PRESENTED", 1, "ImplicitPairingTooltipPresented");
    public static final CommanderFlexEventType M = new CommanderFlexEventType("TARGET_NOT_FOUND_SHEET_PRESENTED", 2, "TVNotFound");
    public static final CommanderFlexEventType a = new CommanderFlexEventType("CAST_SELECTED", 3, "CastSelected");
    public static final CommanderFlexEventType r = new CommanderFlexEventType("FEATURE_EDUCATION_SHEET_PRESENTED", 4, "FeatureEducationPresented");

    /* renamed from: J  reason: collision with root package name */
    public static final CommanderFlexEventType f13169J = new CommanderFlexEventType("TARGETED_PROMPT_SHEET_PRESENTED", 5, "TargetedPromptPresented");
    public static final CommanderFlexEventType I = new CommanderFlexEventType("TARGETED_PROMPT_MAX_IMPRESSION_REACHED", 6, "TargetedPromptMaxImpressionReached");
    public static final CommanderFlexEventType x = new CommanderFlexEventType("GENERIC_PROMPT_SHEET_PRESENTED", 7, "GenericPromptPresented");
    public static final CommanderFlexEventType s = new CommanderFlexEventType("GENERIC_PROMPT_MAX_IMPRESSION_REACHED", 8, "GenericPromptMaxImpressionReached");
    public static final CommanderFlexEventType z = new CommanderFlexEventType("PROFILE_MISMATCH_RESOLUTION_SHEET_PRESENTED", 9, "ProfileMismatchResolutionPresented");
    public static final CommanderFlexEventType B = new CommanderFlexEventType("PROFILE_MISMATCH_RESOLUTION", 10, "ProfileMismatchResolution");
    public static final CommanderFlexEventType n = new CommanderFlexEventType("CONNECTION_SHEET_PRESENTED", 11, "ConnectionPresented");
    public static final CommanderFlexEventType i = new CommanderFlexEventType("CONNECTION_SELECTED", 12, "ConnectionSelected");

    /* renamed from: o  reason: collision with root package name */
    public static final CommanderFlexEventType f13170o = new CommanderFlexEventType("DISCONNECTION_SHEET_PRESENTED", 13, "DisconnectionPresented");
    public static final CommanderFlexEventType m = new CommanderFlexEventType("DISCONNECT_PRESSED", 14, "Disconnected");
    public static final CommanderFlexEventType h = new CommanderFlexEventType("CONNECTION_HELP_CLICKED", 15, "ConnectionHelpClicked");
    public static final CommanderFlexEventType d = new CommanderFlexEventType("COMMANDER_BROWSE_SHEET_COLLAPSED", 16, "TapForRemotePresented");
    public static final CommanderFlexEventType j = new CommanderFlexEventType("COMMANDER_BROWSE_SHEET_EXPANDED", 17, "MainNavScreen");
    public static final CommanderFlexEventType c = new CommanderFlexEventType("COMMANDER_BROWSE_SHEET_EVENT", 18, "MainNavScreenEngagement");
    public static final CommanderFlexEventType g = new CommanderFlexEventType("COMMANDER_PLAYBACK_SHEET_COLLAPSED", 19, "TapForPlaybackPresented");
    public static final CommanderFlexEventType f = new CommanderFlexEventType("COMMANDER_PLAYBACK_SHEET_EXPANDED", 20, "PlayerScreen");
    public static final CommanderFlexEventType D = new CommanderFlexEventType("PLAY_PAUSE_PRESSED", 21, "PlayerPlayPause");
    public static final CommanderFlexEventType E = new CommanderFlexEventType("REWIND_PRESSED", 22, "PlayerRewind");
    public static final CommanderFlexEventType q = new CommanderFlexEventType("FORWARD_PRESSED", 23, "PlayerForward");
    public static final CommanderFlexEventType A = new CommanderFlexEventType("RESTART_PRESSED", 24, "PlayerRestart");
    public static final CommanderFlexEventType H = new CommanderFlexEventType("SUBTITLES_TOGGLE_PRESSED", 25, "PlayerSubtitles");
    public static final CommanderFlexEventType u = new CommanderFlexEventType("LANGUAGE_MENU_PRESSED", 26, "PlayerLanguage");
    public static final CommanderFlexEventType w = new CommanderFlexEventType("LANGUAGE_PRESENTED", 27, "LanguagePresented");
    public static final CommanderFlexEventType b = new CommanderFlexEventType("AUDIO_SELECTED", 28, "AudioSelected");
    public static final CommanderFlexEventType G = new CommanderFlexEventType("SUBTITLE_SELECTED", 29, "SubtitleSelected");
    public static final CommanderFlexEventType y = new CommanderFlexEventType("NEXT_EPISODE_MENU_PRESSED", 30, "PlayerNextEpisode");
    public static final CommanderFlexEventType l = new CommanderFlexEventType("EPISODES_MENU_PRESSED", 31, "PlayerEpisodes");
    public static final CommanderFlexEventType t = new CommanderFlexEventType("EPISODES_PRESENTED", 32, "EpisodesPresented");
    public static final CommanderFlexEventType p = new CommanderFlexEventType("EPISODE_SELECTED", 33, "EpisodeSelected");
    public static final CommanderFlexEventType F = new CommanderFlexEventType("SKIP_INTRO_PRESSED", 34, "SkipIntro");
    public static final CommanderFlexEventType C = new CommanderFlexEventType("PROFILE_SWITCH_WARNING_PRESENTED", 35, "ProfileSwitchWarningPresented");

    private static final /* synthetic */ CommanderFlexEventType[] e() {
        return new CommanderFlexEventType[]{e, v, M, a, r, f13169J, I, x, s, z, B, n, i, f13170o, m, h, d, j, c, g, f, D, E, q, A, H, u, w, b, G, y, l, t, p, F, C};
    }

    public static CommanderFlexEventType valueOf(String str) {
        return (CommanderFlexEventType) Enum.valueOf(CommanderFlexEventType.class, str);
    }

    public static CommanderFlexEventType[] values() {
        return (CommanderFlexEventType[]) L.clone();
    }

    public final String c() {
        return this.K;
    }

    private CommanderFlexEventType(String str, int i2, String str2) {
        this.K = str2;
    }

    static {
        CommanderFlexEventType[] e2 = e();
        L = e2;
        N = C8600drp.e(e2);
        k = new b(null);
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("CommanderFlexEventType");
        }

        public final void a(String str, CommanderFlexEventType commanderFlexEventType, Map<String, String> map) {
            Map d;
            C8632dsu.c((Object) commanderFlexEventType, "");
            C8632dsu.c((Object) map, "");
            if (str != null) {
                map.put("companionSessionId", str);
            }
            getLogTag();
            String c = commanderFlexEventType.c();
            d = dqE.d();
            CLv2Utils.d(c, d, map, new String[]{"MobileCompanion"});
        }
    }
}
