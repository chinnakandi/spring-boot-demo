package com.concretepage;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;
@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer{

	
	public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8010);
        // Use port of your choice that is available
    }
}
