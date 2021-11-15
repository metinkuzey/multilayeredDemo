package com.metinkuzey.multiLayeredDemo.core;


import com.metinkuzey.multiLayeredDemo.jLogger.JLoggerManager3rdParty;

public class JLoggerManager3rdPartyAdapter implements LoggerService {
@Override
    public void logToSystem(String message){
    JLoggerManager3rdParty logger = new JLoggerManager3rdParty();
    logger.log("Logged with 3rd party logger api.");
}
}
