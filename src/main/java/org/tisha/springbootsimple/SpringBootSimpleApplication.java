package org.tisha.springbootsimple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootSimpleApplication
{

    public static void main( String[] args )
    {
        SpringApplication.run( SpringBootSimpleApplication.class, args );
        log.info( "===================" );
        log.info( "Application Started" );
        log.info( "===================" );
    }

}
