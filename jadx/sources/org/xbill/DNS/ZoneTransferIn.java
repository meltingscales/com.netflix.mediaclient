package org.xbill.DNS;

import j$.time.Duration;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.TSIG;

/* loaded from: classes5.dex */
public class ZoneTransferIn {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(ZoneTransferIn.class);
    private SocketAddress address;
    private TCPClient client;
    private long current_serial;
    private int dclass;
    private long end_serial;
    private ZoneTransferHandler handler;
    private Record initialsoa;
    private long ixfr_serial;
    private SocketAddress localAddress;
    private int qtype;
    private int rtype;
    private int state;
    private long timeout = 900000;
    private TSIG tsig;
    private TSIG.StreamVerifier verifier;
    private boolean want_fallback;
    private Name zname;

    /* loaded from: classes5.dex */
    public interface ZoneTransferHandler {
        void handleRecord(Record record);

        void startAXFR();

        void startIXFR();

        void startIXFRAdds(Record record);

        void startIXFRDeletes(Record record);
    }

    public void setLocalAddress(SocketAddress socketAddress) {
        this.localAddress = socketAddress;
    }

    /* loaded from: classes5.dex */
    public static class Delta {
        public List<Record> adds;
        public List<Record> deletes;
        public long end;
        public long start;

        private Delta() {
            this.adds = new ArrayList();
            this.deletes = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class BasicHandler implements ZoneTransferHandler {
        private List<Record> axfr;
        private List<Delta> ixfr;

        private BasicHandler() {
        }

        @Override // org.xbill.DNS.ZoneTransferIn.ZoneTransferHandler
        public void startAXFR() {
            this.axfr = new ArrayList();
        }

        @Override // org.xbill.DNS.ZoneTransferIn.ZoneTransferHandler
        public void startIXFR() {
            this.ixfr = new ArrayList();
        }

        @Override // org.xbill.DNS.ZoneTransferIn.ZoneTransferHandler
        public void startIXFRDeletes(Record record) {
            Delta delta = new Delta();
            delta.deletes.add(record);
            delta.start = ZoneTransferIn.getSOASerial(record);
            this.ixfr.add(delta);
        }

        @Override // org.xbill.DNS.ZoneTransferIn.ZoneTransferHandler
        public void startIXFRAdds(Record record) {
            List<Delta> list = this.ixfr;
            Delta delta = list.get(list.size() - 1);
            delta.adds.add(record);
            delta.end = ZoneTransferIn.getSOASerial(record);
        }

        @Override // org.xbill.DNS.ZoneTransferIn.ZoneTransferHandler
        public void handleRecord(Record record) {
            List<Delta> list = this.ixfr;
            if (list != null) {
                Delta delta = list.get(list.size() - 1);
                if (delta.adds.size() > 0) {
                    delta.adds.add(record);
                    return;
                } else {
                    delta.deletes.add(record);
                    return;
                }
            }
            this.axfr.add(record);
        }
    }

    private ZoneTransferIn() {
    }

    private ZoneTransferIn(Name name, int i, long j, boolean z, SocketAddress socketAddress, TSIG tsig) {
        this.address = socketAddress;
        this.tsig = tsig;
        if (name.isAbsolute()) {
            this.zname = name;
        } else {
            try {
                this.zname = Name.concatenate(name, Name.root);
            } catch (NameTooLongException unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.qtype = i;
        this.dclass = 1;
        this.ixfr_serial = j;
        this.want_fallback = z;
        this.state = 0;
    }

    public static ZoneTransferIn newAXFR(Name name, SocketAddress socketAddress, TSIG tsig) {
        return new ZoneTransferIn(name, 252, 0L, false, socketAddress, tsig);
    }

    public void setTimeout(Duration duration) {
        this.timeout = (int) duration.i();
    }

    private void openConnection() {
        TCPClient tCPClient = new TCPClient(this.timeout);
        this.client = tCPClient;
        SocketAddress socketAddress = this.localAddress;
        if (socketAddress != null) {
            tCPClient.bind(socketAddress);
        }
        this.client.connect(this.address);
    }

    private void sendQuery() {
        Record newRecord = Record.newRecord(this.zname, this.qtype, this.dclass);
        Message message = new Message();
        message.getHeader().setOpcode(0);
        message.addRecord(newRecord, 0);
        if (this.qtype == 251) {
            Name name = this.zname;
            int i = this.dclass;
            Name name2 = Name.root;
            message.addRecord(new SOARecord(name, i, 0L, name2, name2, this.ixfr_serial, 0L, 0L, 0L, 0L), 2);
        }
        TSIG tsig = this.tsig;
        if (tsig != null) {
            tsig.apply(message, null);
            this.verifier = new TSIG.StreamVerifier(this.tsig, message.getTSIG());
        }
        this.client.send(message.toWire(65535));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getSOASerial(Record record) {
        return ((SOARecord) record).getSerial();
    }

    private void logxfr(String str) {
        log.debug("{}: {}", this.zname, str);
    }

    private void fail(String str) {
        throw new ZoneTransferException(str);
    }

    private void fallback() {
        if (!this.want_fallback) {
            fail("server doesn't support IXFR");
        }
        logxfr("falling back to AXFR");
        this.qtype = 252;
        this.state = 0;
    }

    private void parseRR(Record record) {
        int type = record.getType();
        switch (this.state) {
            case 0:
                if (type != 6) {
                    fail("missing initial SOA");
                }
                this.initialsoa = record;
                long sOASerial = getSOASerial(record);
                this.end_serial = sOASerial;
                if (this.qtype != 251 || Serial.compare(sOASerial, this.ixfr_serial) > 0) {
                    this.state = 1;
                    return;
                }
                logxfr("up to date");
                this.state = 7;
                return;
            case 1:
                if (this.qtype == 251 && type == 6 && getSOASerial(record) == this.ixfr_serial) {
                    this.rtype = 251;
                    this.handler.startIXFR();
                    logxfr("got incremental response");
                    this.state = 2;
                } else {
                    this.rtype = 252;
                    this.handler.startAXFR();
                    this.handler.handleRecord(this.initialsoa);
                    logxfr("got nonincremental response");
                    this.state = 6;
                }
                parseRR(record);
                return;
            case 2:
                this.handler.startIXFRDeletes(record);
                this.state = 3;
                return;
            case 3:
                if (type == 6) {
                    this.current_serial = getSOASerial(record);
                    this.state = 4;
                    parseRR(record);
                    return;
                }
                this.handler.handleRecord(record);
                return;
            case 4:
                this.handler.startIXFRAdds(record);
                this.state = 5;
                return;
            case 5:
                if (type == 6) {
                    long sOASerial2 = getSOASerial(record);
                    if (sOASerial2 == this.end_serial) {
                        this.state = 7;
                        return;
                    } else if (sOASerial2 != this.current_serial) {
                        fail("IXFR out of sync: expected serial " + this.current_serial + " , got " + sOASerial2);
                    } else {
                        this.state = 2;
                        parseRR(record);
                        return;
                    }
                }
                this.handler.handleRecord(record);
                return;
            case 6:
                if (type != 1 || record.getDClass() == this.dclass) {
                    this.handler.handleRecord(record);
                    if (type == 6) {
                        this.state = 7;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                fail("extra data");
                return;
            default:
                fail("invalid state");
                return;
        }
    }

    private void closeConnection() {
        try {
            TCPClient tCPClient = this.client;
            if (tCPClient != null) {
                tCPClient.cleanup();
            }
        } catch (IOException unused) {
        }
    }

    private Message parseMessage(byte[] bArr) {
        try {
            return new Message(bArr);
        } catch (IOException e) {
            if (e instanceof WireParseException) {
                throw ((WireParseException) e);
            }
            throw new WireParseException("Error parsing message");
        }
    }

    private void doxfr() {
        TSIG.StreamVerifier streamVerifier;
        int verify;
        sendQuery();
        while (this.state != 7) {
            byte[] recv = this.client.recv();
            Message parseMessage = parseMessage(recv);
            if (parseMessage.getHeader().getRcode() == 0 && (streamVerifier = this.verifier) != null && (verify = streamVerifier.verify(parseMessage, recv)) != 0) {
                fail("TSIG failure: " + Rcode.TSIGstring(verify));
            }
            List<Record> section = parseMessage.getSection(1);
            if (this.state == 0) {
                int rcode = parseMessage.getRcode();
                if (rcode != 0) {
                    if (this.qtype == 251 && rcode == 4) {
                        fallback();
                        doxfr();
                        return;
                    }
                    fail(Rcode.string(rcode));
                }
                Record question = parseMessage.getQuestion();
                if (question != null && question.getType() != this.qtype) {
                    fail("invalid question section");
                }
                if (section.isEmpty() && this.qtype == 251) {
                    fallback();
                    doxfr();
                    return;
                }
            }
            for (Record record : section) {
                parseRR(record);
            }
            if (this.state == 7 && this.verifier != null && !parseMessage.isVerified()) {
                fail("last message must be signed");
            }
        }
    }

    public void run(ZoneTransferHandler zoneTransferHandler) {
        this.handler = zoneTransferHandler;
        try {
            openConnection();
            doxfr();
        } finally {
            closeConnection();
        }
    }

    public void run() {
        run(new BasicHandler());
    }

    private BasicHandler getBasicHandler() {
        ZoneTransferHandler zoneTransferHandler = this.handler;
        if (zoneTransferHandler instanceof BasicHandler) {
            return (BasicHandler) zoneTransferHandler;
        }
        throw new IllegalArgumentException("ZoneTransferIn used callback interface");
    }

    public List<Record> getAXFR() {
        return getBasicHandler().axfr;
    }
}