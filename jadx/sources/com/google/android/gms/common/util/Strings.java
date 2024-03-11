package com.google.android.gms.common.util;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes2.dex */
public class Strings {
    private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEmptyOrWhitespace(String str) {
        return str == null || str.trim().isEmpty();
    }
}
