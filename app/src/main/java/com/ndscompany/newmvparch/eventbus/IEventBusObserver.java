package com.ndscompany.newmvparch.eventbus;

import com.ndscompany.newmvparch.eventbus.events.ActionEvent;
import com.ndscompany.newmvparch.eventbus.events.BaseEvent;
import com.ndscompany.newmvparch.eventbus.events.FailEvent;
import com.ndscompany.newmvparch.eventbus.events.SuccesEvent;

public interface IEventBusObserver {
    void onActionEvent(ActionEvent event);

    void onSuccessEvent(SuccesEvent succesEvent);

    void onFailError(FailEvent failEvent);

    void onCustomEvent(BaseEvent event);
}
