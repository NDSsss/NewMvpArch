package com.ndscompany.newmvparch.eventbus.events;

import com.ndscompany.newmvparch.eventbus.EventBusContainer;

public class SuccesEvent extends BaseEvent {

    private EventBusContainer responce;

    public SuccesEvent(int actionCode, int classUniqueId, EventBusContainer responce) {
        super(actionCode, classUniqueId);
        this.responce = responce;
    }

    public EventBusContainer getResponce() {
        return responce;
    }

    @Override
    public EventType getEventType() {
        return EventType.SUCCESS_REQUEST;
    }
}
