package org.linphone.core;

/* loaded from: classes6.dex */
public interface PresenceActivity {
    String getDescription();

    long getNativePtr();

    PresenceActivityType getType();

    int setDescription(String str);

    int setType(PresenceActivityType presenceActivityType);

    String toString();
}
