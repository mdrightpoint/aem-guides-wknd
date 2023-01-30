package com.adobe.aem.guides.wknd.core.Handlers;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.day.cq.replication.ReplicationAction;
import com.day.cq.replication.ReplicationActionType;
@Component(service = EventHandler.class, immediate = true,
          property = {
             EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC,
             EventConstants.EVENT_FILTER +"=(path=/content/wknd/us/en/workflow/*)"
          })
public class ReplicationEventHandler implements EventHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ReplicationEventHandler.class);

    @Override
    public void handleEvent(Event event) {
        try{
            LOG.info("\n Event Type :{}",event.getTopic());
            if(ReplicationAction.fromEvent(event).getType().equals(ReplicationActionType.ACTIVATE)){
                LOG.info("\n Page Published : {}",ReplicationAction.fromEvent(event).getPath());
            }
            if(ReplicationAction.fromEvent(event).getType().equals(ReplicationActionType.DEACTIVATE)){
                LOG.info("\n Page Deactivated  : {}",ReplicationAction.fromEvent(event).getPath());
            }

        }catch (Exception e)
        {
            LOG.error("\n Error while Activating /Deactivating - {}", e.getMessage());
        }
        
    }
    
}
