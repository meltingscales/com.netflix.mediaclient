package com.netflix.mediaclient.service.mdx.protocol.target;

/* loaded from: classes3.dex */
public enum TargetSessionMessageType {
    MESSAGE_TYPE_STARTSESSION(0),
    MESSAGE_TYPE_HANDSHAKE(1),
    MESSAGE_TYPE_ENDSESSOIN(2),
    MESSAGE_TYPE_ERROR_BADPAIR(8),
    MESSAGE_TYPE_ERROR_BADSESSION(9),
    MESSAGE_TYPE_GENERIC(10),
    MESSAGE_TYPE_CAPABILITY(11),
    MESSAGE_TYPE_CURRENT_STATE(12),
    MESSAGE_TYPE_STATE_CHANGED(13),
    MESSAGE_TYPE_AUDIO_SUBTITLES_CHANGED(14),
    MESSAGE_TYPE_AUDIO_SUBTITLE_SETTINGS(15),
    MESSAGE_TYPE_DIALOG_SHOW(16),
    MESSAGE_TYPE_DIALOG_CANCEL(17),
    MESSAGE_TYPE_META_DATA_CHANGED(18),
    MESSAGE_TYPE_PIN_VERIFICATION_SHOW(19),
    MESSAGE_TYPE_PIN_VERIFICATION_NOT_REQUIRED(20),
    MESSAGE_TYPE_PIN_VERIFICATION_INCORRECT_PIN(21);
    
    public int p;

    TargetSessionMessageType(int i) {
        this.p = i;
    }

    public String c() {
        return "TargetSessionMessageType." + this.p;
    }
}
