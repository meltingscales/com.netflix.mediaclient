package com.google.android.play.core.assetpacks.internal;

import java.io.File;

/* loaded from: classes5.dex */
public final class ak {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
            return "";
        }
        if (replaceFirst.startsWith("base-")) {
            return replaceFirst.replace("base-", "config.");
        }
        return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
