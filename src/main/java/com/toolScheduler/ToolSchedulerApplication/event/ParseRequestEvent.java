package com.toolScheduler.ToolSchedulerApplication.event;

import com.toolScheduler.ToolSchedulerApplication.model.ParseRequestPayload;
import com.toolScheduler.ToolSchedulerApplication.model.ScanRequestPayload;

import java.util.UUID;

public class ParseRequestEvent implements Event<ParseRequestPayload> {
    private ParseRequestPayload payload;
    private String eventId;

    public ParseRequestEvent() {
        this.eventId= UUID.randomUUID().toString();
    }

    public ParseRequestEvent(ParseRequestPayload payload) {
        this.eventId= UUID.randomUUID().toString();
        this.payload = payload;
    }

    @Override
    public String getType() {
        String toolname=payload.getTooltype();
        return "parse"+toolname;
    }

    @Override
    public ParseRequestPayload getPayload() {
        return payload;
    }

    public void setPayload(ParseRequestPayload payload) {
        this.payload = payload;
    }
    @Override
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
