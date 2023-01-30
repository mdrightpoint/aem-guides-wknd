package com.adobe.aem.guides.wknd.core.listeners;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.day.cq.replication.ReplicationAction;

@Component(service = EventHandler.class, immediate = true, property = {
        EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC
       // EventConstants.EVENT_FILTER + "=(path=/content/wknd/us/en/*)"
})
public class ReplicationListner implements EventHandler {
    private static final Logger log = LoggerFactory.getLogger(ReplicationListner.class);

    @Override
    public void handleEvent(Event event) {
        try {
            log.info("Replication Triggered ==========");
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}