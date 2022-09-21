package com.example.shspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ProxySimpleEventService implements EventService{
    @Autowired
    SimpleEventService simpleEventService;

    @Override
    public void createEvent(){
        simpleEventService.createEvent();
    }
    @Override
    public void publishEvent(){
        simpleEventService.publishEvent();
    }
    @Override
    public void deleteEvent(){
        simpleEventService.deleteEvent();
    }
}
