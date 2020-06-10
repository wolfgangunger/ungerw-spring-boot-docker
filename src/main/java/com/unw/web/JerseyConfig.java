package com.unw.web;

import com.unw.service.HelloWorldService;
import org.springframework.stereotype.Component;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author UNGERW
 */
@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(HealthResource.class);
    register(HelloWorldService.class);

  }

}
