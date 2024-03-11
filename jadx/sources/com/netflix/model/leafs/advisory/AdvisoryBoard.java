package com.netflix.model.leafs.advisory;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public enum AdvisoryBoard {
    BRAZIL(Pattern.compile("^BRA[SZ]IL", 2), "14"),
    BBFC(Pattern.compile("BBFC", 2), "20"),
    ES(Pattern.compile("^Spain$", 2), "8602"),
    KMRB(Pattern.compile("^KMRB", 2), "79"),
    NICAM(Pattern.compile("^NICAM", 2), "41"),
    NZ(Pattern.compile("^NEW ZEALAND$", 2), "11781"),
    ZA(Pattern.compile("^South Africa$", 2), "9369"),
    KFCB(Pattern.compile("^Kenya$", 2), "24141"),
    PEGI(Pattern.compile("^GAMES-PEGI$", 2), "23771"),
    GRAC_18(Pattern.compile("^GAMES-GRAC-18$", 2), "9001"),
    GRAC(Pattern.compile("^GAMES-GRAC$", 2), "9145"),
    BR_PLAY(Pattern.compile("^GAMES-BR-PLAY", 2), "9143"),
    ESRB(Pattern.compile("^GAMES-ESRB", 2), "19"),
    IARC(Pattern.compile("^GAMES-IARC", 2), "9146"),
    USK(Pattern.compile("^GAMES-USK", 2), "9147"),
    ACB(Pattern.compile("^GAMES-ACB", 2), "9141");
    
    String id;
    Pattern namePattern;

    AdvisoryBoard(Pattern pattern, String str) {
        this.namePattern = pattern;
        this.id = str;
    }

    public static AdvisoryBoard getAdvisoryBoard(String str) {
        AdvisoryBoard[] values;
        for (AdvisoryBoard advisoryBoard : values()) {
            if (advisoryBoard.namePattern.matcher(str).find()) {
                return advisoryBoard;
            }
        }
        return null;
    }

    public static AdvisoryBoard getAdvisoryBoardById(String str) {
        AdvisoryBoard[] values;
        for (AdvisoryBoard advisoryBoard : values()) {
            if (advisoryBoard.id.equals(str)) {
                return advisoryBoard;
            }
        }
        return null;
    }
}
