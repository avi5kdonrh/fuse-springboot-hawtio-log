package com.redhat.fuse.boosters.rest.http;

import org.apache.camel.Header;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("greetingsService")
public class GreetingsServiceImpl implements GreetingsService {
    Logger log = LogManager.getLogger(GreetingsServiceImpl.class);
    private static final String THE_GREETINGS = "Hello, ";

    @Override
    public Greetings getGreetings(@Header("name") String name ) {
        log.info("There it is >> "+name );
        return new Greetings( THE_GREETINGS + name );
    }

}