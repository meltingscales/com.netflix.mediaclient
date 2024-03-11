package org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class CommandLine {
    private static final AtomicReference<CommandLine> sCommandLine = new AtomicReference<>();

    public abstract String getSwitchValue(String str);

    public abstract boolean hasSwitch(String str);

    public static CommandLine getInstance() {
        return sCommandLine.get();
    }

    private CommandLine() {
    }
}
