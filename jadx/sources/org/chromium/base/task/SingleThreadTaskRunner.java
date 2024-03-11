package org.chromium.base.task;

/* loaded from: classes5.dex */
public interface SingleThreadTaskRunner extends SequencedTaskRunner {
    boolean belongsToCurrentThread();
}
