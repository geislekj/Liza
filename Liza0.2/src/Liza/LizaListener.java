package Liza;

import org.bukkit.event.Event;

/**
 * The listener interface for receiving liza events.
 * The class that is interested in processing a liza
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addLizaListener<code> method. When
 * the liza event occurs, that object's appropriate
 * method is invoked.
 *
 * @see LizaEvent
 */
public interface LizaListener {

    /**
     * Handle event.
     *
     * @param e the e
     */
    public void handleEvent(Event e);
}
