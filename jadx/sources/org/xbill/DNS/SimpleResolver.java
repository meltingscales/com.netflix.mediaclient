package org.xbill.DNS;

import j$.time.Duration;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class SimpleResolver implements Resolver {
    private InetSocketAddress address;
    private boolean ignoreTruncation;
    private InetSocketAddress localAddress;
    private OPTRecord queryOPT;
    private Duration timeoutValue;
    private TSIG tsig;
    private boolean useTCP;
    @Generated
    private static final Logger log = LoggerFactory.getLogger(SimpleResolver.class);
    private static InetSocketAddress defaultResolver = new InetSocketAddress(InetAddress.getLoopbackAddress(), 53);

    @Override // org.xbill.DNS.Resolver
    public Duration getTimeout() {
        return this.timeoutValue;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(Duration duration) {
        this.timeoutValue = duration;
    }

    public SimpleResolver() {
        this((String) null);
    }

    public SimpleResolver(String str) {
        InetAddress byName;
        this.queryOPT = new OPTRecord(1280, 0, 0, 0);
        this.timeoutValue = Duration.b(10L);
        if (str == null) {
            InetSocketAddress server = ResolverConfig.getCurrentConfig().server();
            this.address = server;
            if (server == null) {
                this.address = defaultResolver;
                return;
            }
            return;
        }
        if ("0".equals(str)) {
            byName = InetAddress.getLoopbackAddress();
        } else {
            byName = InetAddress.getByName(str);
        }
        this.address = new InetSocketAddress(byName, 53);
    }

    public SimpleResolver(InetSocketAddress inetSocketAddress) {
        this.queryOPT = new OPTRecord(1280, 0, 0, 0);
        this.timeoutValue = Duration.b(10L);
        Objects.requireNonNull(inetSocketAddress, "host must not be null");
        this.address = inetSocketAddress;
    }

    private Message parseMessage(byte[] bArr) {
        try {
            return new Message(bArr);
        } catch (IOException e) {
            e = e;
            if (!(e instanceof WireParseException)) {
                e = new WireParseException("Error parsing message");
            }
            throw ((WireParseException) e);
        }
    }

    private void verifyTSIG(Message message, Message message2, byte[] bArr, TSIG tsig) {
        if (tsig == null) {
            return;
        }
        log.debug("TSIG verify: {}", Rcode.TSIGstring(tsig.verify(message2, bArr, message.getTSIG())));
    }

    private void applyEDNS(Message message) {
        if (this.queryOPT == null || message.getOPT() != null) {
            return;
        }
        message.addRecord(this.queryOPT, 3);
    }

    private int maxUDPSize(Message message) {
        OPTRecord opt = message.getOPT();
        if (opt == null) {
            return 512;
        }
        return opt.getPayloadSize();
    }

    @Override // org.xbill.DNS.Resolver
    public CompletionStage<Message> sendAsync(final Message message) {
        Record question;
        if (message.getHeader().getOpcode() == 0 && (question = message.getQuestion()) != null && question.getType() == 252) {
            final CompletableFuture completableFuture = new CompletableFuture();
            CompletableFuture.runAsync(new Runnable() { // from class: org.xbill.DNS.SimpleResolver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SimpleResolver.this.lambda$sendAsync$0(completableFuture, message);
                }
            });
            return completableFuture;
        }
        Message clone = message.clone();
        applyEDNS(clone);
        TSIG tsig = this.tsig;
        if (tsig != null) {
            clone.setTSIG(tsig, 0, null);
        }
        return sendAsync(clone, this.useTCP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendAsync$0(CompletableFuture completableFuture, Message message) {
        try {
            completableFuture.complete(sendAXFR(message));
        } catch (IOException e) {
            completableFuture.completeExceptionally(e);
        }
    }

    CompletableFuture<Message> sendAsync(final Message message, boolean z) {
        CompletableFuture<byte[]> sendrecv;
        final int id = message.getHeader().getID();
        byte[] wire = message.toWire(65535);
        int maxUDPSize = maxUDPSize(message);
        final boolean z2 = z || wire.length > maxUDPSize;
        Logger logger = log;
        Object[] objArr = new Object[6];
        objArr[0] = message.getQuestion().getName();
        objArr[1] = Type.string(message.getQuestion().getType());
        objArr[2] = Integer.valueOf(id);
        objArr[3] = z2 ? "tcp" : "udp";
        objArr[4] = this.address.getAddress().getHostAddress();
        objArr[5] = Integer.valueOf(this.address.getPort());
        logger.debug("Sending {}/{}, id={} to {}/{}:{}", objArr);
        logger.trace("Query:\n{}", message);
        if (z2) {
            sendrecv = NioTcpClient.sendrecv(this.localAddress, this.address, message, wire, this.timeoutValue);
        } else {
            sendrecv = NioUdpClient.sendrecv(this.localAddress, this.address, wire, maxUDPSize, this.timeoutValue);
        }
        return sendrecv.thenComposeAsync(new Function() { // from class: org.xbill.DNS.SimpleResolver$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CompletionStage lambda$sendAsync$1;
                lambda$sendAsync$1 = SimpleResolver.this.lambda$sendAsync$1(id, message, z2, (byte[]) obj);
                return lambda$sendAsync$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage lambda$sendAsync$1(int i, Message message, boolean z, byte[] bArr) {
        CompletableFuture completableFuture = new CompletableFuture();
        if (bArr.length < 12) {
            completableFuture.completeExceptionally(new WireParseException("invalid DNS header - too short"));
            return completableFuture;
        }
        int i2 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
        if (i2 != i) {
            completableFuture.completeExceptionally(new WireParseException("invalid message id: expected " + i + "; got id " + i2));
            return completableFuture;
        }
        try {
            Message parseMessage = parseMessage(bArr);
            if (!message.getQuestion().getName().equals(parseMessage.getQuestion().getName())) {
                completableFuture.completeExceptionally(new WireParseException("invalid name in message: expected " + message.getQuestion().getName() + "; got " + parseMessage.getQuestion().getName()));
                return completableFuture;
            } else if (message.getQuestion().getDClass() != parseMessage.getQuestion().getDClass()) {
                completableFuture.completeExceptionally(new WireParseException("invalid class in message: expected " + DClass.string(message.getQuestion().getDClass()) + "; got " + DClass.string(parseMessage.getQuestion().getDClass())));
                return completableFuture;
            } else if (message.getQuestion().getType() != parseMessage.getQuestion().getType()) {
                completableFuture.completeExceptionally(new WireParseException("invalid type in message: expected " + Type.string(message.getQuestion().getType()) + "; got " + Type.string(parseMessage.getQuestion().getType())));
                return completableFuture;
            } else {
                verifyTSIG(message, parseMessage, bArr, this.tsig);
                if (!z && !this.ignoreTruncation && parseMessage.getHeader().getFlag(6)) {
                    Logger logger = log;
                    logger.debug("Got truncated response for id {}, retrying via TCP", Integer.valueOf(i));
                    logger.trace("Truncated response: {}", parseMessage);
                    return sendAsync(message, true);
                }
                parseMessage.setResolver(this);
                completableFuture.complete(parseMessage);
                return completableFuture;
            }
        } catch (WireParseException e) {
            completableFuture.completeExceptionally(e);
            return completableFuture;
        }
    }

    private Message sendAXFR(Message message) {
        ZoneTransferIn newAXFR = ZoneTransferIn.newAXFR(message.getQuestion().getName(), this.address, this.tsig);
        newAXFR.setTimeout(this.timeoutValue);
        newAXFR.setLocalAddress(this.localAddress);
        try {
            newAXFR.run();
            List<Record> axfr = newAXFR.getAXFR();
            Message message2 = new Message(message.getHeader().getID());
            message2.getHeader().setFlag(5);
            message2.getHeader().setFlag(0);
            message2.addRecord(message.getQuestion(), 0);
            for (Record record : axfr) {
                message2.addRecord(record, 1);
            }
            return message2;
        } catch (ZoneTransferException e) {
            throw new WireParseException(e.getMessage());
        }
    }

    public String toString() {
        return "SimpleResolver [" + this.address + "]";
    }
}
